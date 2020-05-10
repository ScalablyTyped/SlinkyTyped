package typingsSlinky.nopt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeInfo extends js.Object {
  var `type`: js.Object = js.native
  def validate(data: CommandData, k: String, `val`: String): Boolean = js.native
}

object TypeInfo {
  @scala.inline
  def apply(`type`: js.Object, validate: (CommandData, String, String) => Boolean): TypeInfo = {
    val __obj = js.Dynamic.literal(validate = js.Any.fromFunction3(validate))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeInfo]
  }
  @scala.inline
  implicit class TypeInfoOps[Self <: TypeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidate(value: (CommandData, String, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

