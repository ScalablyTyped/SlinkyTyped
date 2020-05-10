package typingsSlinky.backboneMarionette.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegionConstructionOptions extends js.Object {
  /**
    * Prevents error on missing element. (undocumented)
    */
  var allowMissingEl: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the element for the region to manage. This may be
    * a selector string, a raw DOM node reference or a jQuery wrapped
    * DOM node.
    */
  var el: js.UndefOr[js.Any] = js.native
  /**
    * Element to use as context when finding el via jQuery. Defaults to the
    * the document. (undocumented)
    */
  var parentEl: js.UndefOr[String] = js.native
  /**
    * Overwrite the parent el of the region with the rendered contents of
    * the inner View.
    */
  var replaceElement: js.UndefOr[String] = js.native
}

object RegionConstructionOptions {
  @scala.inline
  def apply(): RegionConstructionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionConstructionOptions]
  }
  @scala.inline
  implicit class RegionConstructionOptionsOps[Self <: RegionConstructionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowMissingEl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMissingEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowMissingEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMissingEl")(js.undefined)
        ret
    }
    @scala.inline
    def withEl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(js.undefined)
        ret
    }
    @scala.inline
    def withParentEl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentEl")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceElement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceElement")(js.undefined)
        ret
    }
  }
  
}

