package typingsSlinky.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputParameterObject extends js.Object {
  @JSName("InfoPath.InputParameterObject_typekey")
  var InfoPathDotInputParameterObject_typekey: InputParameterObject = js.native
  val Name: String = js.native
  val Value: String = js.native
}

object InputParameterObject {
  @scala.inline
  def apply(InfoPathDotInputParameterObject_typekey: InputParameterObject, Name: String, Value: String): InputParameterObject = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.InputParameterObject_typekey")(InfoPathDotInputParameterObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputParameterObject]
  }
  @scala.inline
  implicit class InputParameterObjectOps[Self <: InputParameterObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInfoPathDotInputParameterObject_typekey(value: InputParameterObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InfoPath.InputParameterObject_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

