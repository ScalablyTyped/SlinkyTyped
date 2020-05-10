package typingsSlinky.graphqlBinding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBoolean extends js.Object {
  var Boolean: String = js.native
  var DateTime: String = js.native
  var Float: String = js.native
  var ID: String = js.native
  var Int: String = js.native
  var String: java.lang.String = js.native
}

object AnonBoolean {
  @scala.inline
  def apply(Boolean: String, DateTime: String, Float: String, ID: String, Int: String, String: String): AnonBoolean = {
    val __obj = js.Dynamic.literal(Boolean = Boolean.asInstanceOf[js.Any], DateTime = DateTime.asInstanceOf[js.Any], Float = Float.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Int = Int.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBoolean]
  }
  @scala.inline
  implicit class AnonBooleanOps[Self <: AnonBoolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoolean(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Boolean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFloat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Float")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Int")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("String")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

