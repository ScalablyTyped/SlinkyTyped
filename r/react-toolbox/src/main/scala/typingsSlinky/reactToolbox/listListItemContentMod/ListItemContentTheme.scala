package typingsSlinky.reactToolbox.listListItemContentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItemContentTheme extends js.Object {
  /**
    * Added to the content wrapper element if type is "auto".
    */
  var auto: js.UndefOr[String] = js.native
  /**
    * Used for the content wrapper element in list item.
    */
  var itemContentRoot: js.UndefOr[String] = js.native
  /**
    * Added to the content wrapper element if type is "large".
    */
  var large: js.UndefOr[String] = js.native
  /**
    * Added to the content wrapper element if type is "normal".
    */
  var normal: js.UndefOr[String] = js.native
}

object ListItemContentTheme {
  @scala.inline
  def apply(): ListItemContentTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemContentTheme]
  }
  @scala.inline
  implicit class ListItemContentThemeOps[Self <: ListItemContentTheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuto(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuto: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto")(js.undefined)
        ret
    }
    @scala.inline
    def withItemContentRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemContentRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemContentRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemContentRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withLarge(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("large")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLarge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("large")(js.undefined)
        ret
    }
    @scala.inline
    def withNormal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normal")(js.undefined)
        ret
    }
  }
  
}

