package typingsSlinky.jui.anon

import typingsSlinky.jui.juiStrings.bottom
import typingsSlinky.jui.juiStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Flex extends js.Object {
  var event: js.UndefOr[js.Any] = js.native
  /**
    * @cfg {Boolean} [flex=true]
    * Drop-down menu is varied by changing the width function
    */
  var flex: js.UndefOr[Boolean] = js.native
  /**
    * @cfg {Integer} [height=100]
    * Determines an initial selection button with a specified value
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * @cfg {Integer} [index=0]
    * Determines an initial selection button with a specified index
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * @cfg {Boolean} [keydown=false]
    * It is possible to select a node using the keyboard
    */
  var keydown: js.UndefOr[Boolean] = js.native
  /**
    * @cfg {"top"/"bottom"} [position="bottom"]
    * It is possible to determine an initial selection button with a specified value
    */
  var position: js.UndefOr[top | bottom] = js.native
  var tpl: js.UndefOr[js.Any] = js.native
  /**
    * @cfg {String} [value=0]
    * Determines an initial selection button with a specified value
    */
  var value: js.UndefOr[String] = js.native
  /**
    * @cfg {Integer} [width=0]
    * Determines the horizontal size of a combo box
    */
  var width: js.UndefOr[Double] = js.native
}

object Flex {
  @scala.inline
  def apply(): Flex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Flex]
  }
  @scala.inline
  implicit class FlexOps[Self <: Flex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withFlex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flex")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
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
    def withKeydown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keydown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeydown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keydown")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: top | bottom): Self = {
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
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

