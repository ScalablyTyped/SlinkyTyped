package typingsSlinky.expressDebug.anon

import typingsSlinky.expressDebug.mod.CustomPanel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Depth extends js.Object {
  /**
    * How deep to recurse through printed objects. This is the default unless the
    * print_obj function is passed an options object with a 'depth' property.
    */
  var depth: js.UndefOr[Double] = js.native
  /**
    * If you need to add arbitrary attributes to the containing element of EDT,
    * this allows you to.
    */
  var extra_attrs: js.UndefOr[String] = js.native
  /**
    * Additional panels to show.
    */
  var extra_panels: js.UndefOr[js.Array[CustomPanel]] = js.native
  /**
    * Allows changing the default panel.
    */
  var panels: js.UndefOr[js.Array[String]] = js.native
  /**
    * Path to render standalone express-debug.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Global option to determine sort order of printed object values. false for
    * default order, true for basic default sort, or a function to use for sort.
    */
  var sort: js.UndefOr[Boolean | (js.Function2[/* a */ Double, /* b */ Double, Double])] = js.native
  /**
    * Absolute path to a css file to include and override EDT's default css.
    */
  var theme: js.UndefOr[String] = js.native
}

object Depth {
  @scala.inline
  def apply(): Depth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Depth]
  }
  @scala.inline
  implicit class DepthOps[Self <: Depth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(js.undefined)
        ret
    }
    @scala.inline
    def withExtra_attrs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra_attrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtra_attrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra_attrs")(js.undefined)
        ret
    }
    @scala.inline
    def withExtra_panels(value: js.Array[CustomPanel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra_panels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtra_panels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra_panels")(js.undefined)
        ret
    }
    @scala.inline
    def withPanels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panels")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withSortFunction2(value: (/* a */ Double, /* b */ Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSort(value: Boolean | (js.Function2[/* a */ Double, /* b */ Double, Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

