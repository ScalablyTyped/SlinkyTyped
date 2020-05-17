package typingsSlinky.c3.mod

import typingsSlinky.c3.anon.Anchor
import typingsSlinky.c3.anon.Onclick
import typingsSlinky.c3.c3Strings.bottom
import typingsSlinky.c3.c3Strings.inset
import typingsSlinky.c3.c3Strings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegendOptions extends js.Object {
  /**
    * Defaults to `false`.
    */
  var equally: js.UndefOr[Boolean] = js.native
  /**
    * Hide legend
    * If true given, all legend will be hidden. If string or array given, only the legend that has the id will be hidden.
    * Defaults to `false`.
    */
  var hide: js.UndefOr[Boolean | ArrayOrString] = js.native
  /**
    * Change inset legend attributes. Ignored unless `legend.position` is `"inset"`.
    */
  var inset: js.UndefOr[Anchor] = js.native
  var item: js.UndefOr[Onclick] = js.native
  /**
    * Padding between legend elements.
    * Defaults to `0`.
    */
  var padding: js.UndefOr[Double] = js.native
  /**
    * Change the position of legend.
    */
  var position: js.UndefOr[bottom | right | inset] = js.native
  /**
    * Show or hide legend.
    * Defaults to `true`.
    */
  var show: js.UndefOr[Boolean] = js.native
}

object LegendOptions {
  @scala.inline
  def apply(): LegendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendOptions]
  }
  @scala.inline
  implicit class LegendOptionsOps[Self <: LegendOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEqually(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equally")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEqually: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equally")(js.undefined)
        ret
    }
    @scala.inline
    def withHide(value: Boolean | ArrayOrString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.undefined)
        ret
    }
    @scala.inline
    def withInset(value: Anchor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inset")(js.undefined)
        ret
    }
    @scala.inline
    def withItem(value: Onclick): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: bottom | right | inset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
  }
  
}

