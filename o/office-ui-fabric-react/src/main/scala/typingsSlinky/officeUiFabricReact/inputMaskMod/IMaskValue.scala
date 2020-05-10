package typingsSlinky.officeUiFabricReact.inputMaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMaskValue extends js.Object {
  /**
    * This index refers to the index in the displayMask rather than the inputMask.
    * This means that any escaped characters do not count toward this index.
    */
  var displayIndex: Double = js.native
  var format: js.RegExp = js.native
  var value: js.UndefOr[String] = js.native
}

object IMaskValue {
  @scala.inline
  def apply(displayIndex: Double, format: js.RegExp): IMaskValue = {
    val __obj = js.Dynamic.literal(displayIndex = displayIndex.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMaskValue]
  }
  @scala.inline
  implicit class IMaskValueOps[Self <: IMaskValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
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
  }
  
}

