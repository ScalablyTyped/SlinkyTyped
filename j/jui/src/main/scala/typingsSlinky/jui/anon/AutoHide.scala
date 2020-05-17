package typingsSlinky.jui.anon

import typingsSlinky.jui.juiStrings.black
import typingsSlinky.jui.juiStrings.gray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoHide extends js.Object {
  /**
    * @cfg {Boolean} [autoHide=true]
    * Automatically hides a modal when clicking on it
    */
  var autoHide: js.UndefOr[Boolean] = js.native
  /**
    * @cfg {Boolean} [clone=false]
    * Copies an existing modal and shows it
    */
  @JSName("clone")
  var clone_FAutoHide: js.UndefOr[Boolean] = js.native
  /**
    * @cfg {"black"/"gray"} [color="black"]
    * Determines the color of a modal
    */
  var color: js.UndefOr[black | gray] = js.native
  var event: js.UndefOr[js.Any] = js.native
  /**
    * @cfg {Integer} [index=0]
    * Determines the sequence (index) of a modal
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * @cfg {Float} [opacity=0.4]
    * Sets the transparency of a modal
    */
  var opacity: js.UndefOr[Double] = js.native
  /**
    * @cfg {String/DOMElement} [target="body"]
    * Sets a selector on which a modal is shown
    */
  var target: js.UndefOr[String | js.Any] = js.native
  var tpl: js.UndefOr[js.Any] = js.native
}

object AutoHide {
  @scala.inline
  def apply(): AutoHide = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoHide]
  }
  @scala.inline
  implicit class AutoHideOps[Self <: AutoHide] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoHide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHide")(js.undefined)
        ret
    }
    @scala.inline
    def withClone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clone")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: black | gray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withEvent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: String | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withTpl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tpl")(js.undefined)
        ret
    }
  }
  
}

