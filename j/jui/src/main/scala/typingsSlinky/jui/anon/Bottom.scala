package typingsSlinky.jui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bottom extends js.Object {
  /**
    * @cfg {String/Integer} [bottom="auto"]
    * Determines the Y coordinate based on the bottom side of a window
    */
  var bottom: js.UndefOr[String | Double] = js.native
  var event: js.UndefOr[js.Any] = js.native
  /**
    * @cfg {Integer} [height=300]
    * Determines the height of a window
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * @cfg {String/Integer} [left="auto"]
    * Determines the X coordinate of a window
    */
  var left: js.UndefOr[String | Double] = js.native
  /**
    * @cfg {Boolean} [modal=false]
    * Applies a modal UI to a window
    */
  var modal: js.UndefOr[Boolean] = js.native
  /**
    * @cfg {Integer} [modalIndex=0]
    * Determines the z-index property of a modal UI
    */
  var modalIndex: js.UndefOr[Double] = js.native
  /**
    * @cfg {Boolean} [move=true]
    * It is possible to move a window
    */
  var move: js.UndefOr[Boolean] = js.native
  /**
    * @cfg {Boolean} [resize=true]
    * It is possible to resize a window
    */
  var resize: js.UndefOr[Boolean] = js.native
  /**
    * @cfg {String/Integer} [right="auto"]
    * Determines the X coordinate based on the right side of a window
    */
  var right: js.UndefOr[String | Double] = js.native
  /**
    * @cfg {String/Integer} [top="auto"]
    * Determines the Y coordinate of a window
    */
  var top: js.UndefOr[String | Double] = js.native
  var tpl: js.UndefOr[js.Any] = js.native
  /**
    * @cfg {Integer} [width=400]
    * Determines the horizontal size of a window
    */
  var width: js.UndefOr[Double] = js.native
}

object Bottom {
  @scala.inline
  def apply(): Bottom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bottom]
  }
  @scala.inline
  implicit class BottomOps[Self <: Bottom] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottom(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(js.undefined)
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
    def withLeft(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withModal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(js.undefined)
        ret
    }
    @scala.inline
    def withModalIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withMove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(js.undefined)
        ret
    }
    @scala.inline
    def withResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.undefined)
        ret
    }
    @scala.inline
    def withRight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
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

