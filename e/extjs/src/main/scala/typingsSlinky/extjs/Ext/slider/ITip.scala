package typingsSlinky.extjs.Ext.slider

import typingsSlinky.extjs.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITip
  extends typingsSlinky.extjs.Ext.tip.ITip {
  /** [Config Option] (String) */
  var align: js.UndefOr[String] = js.native
  /** [Method] Used to create the text that appears in the Tip s body
  		* @param thumb Ext.slider.Thumb The Thumb that the Tip is attached to
  		* @returns String The text to display in the tip
  		*/
  var getText: js.UndefOr[js.Function1[/* thumb */ js.UndefOr[IThumb], String]] = js.native
  /** [Config Option] (Array) */
  var offsets: js.UndefOr[Array] = js.native
  /** [Config Option] (String) */
  var position: js.UndefOr[String] = js.native
}

object ITip {
  @scala.inline
  def apply(): ITip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITip]
  }
  @scala.inline
  implicit class ITipOps[Self <: ITip] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withGetText(value: /* thumb */ js.UndefOr[IThumb] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getText")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsets(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsets")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: String): Self = {
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
  }
  
}

