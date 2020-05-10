package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeGenNodeArg extends js.Object {
  /**
    * The name of the argument or property.
    */
  var Name: CodeGenArgName = js.native
  /**
    * True if the value is used as a parameter.
    */
  var Param: js.UndefOr[Boolean] = js.native
  /**
    * The value of the argument or property.
    */
  var Value: CodeGenArgValue = js.native
}

object CodeGenNodeArg {
  @scala.inline
  def apply(Name: CodeGenArgName, Value: CodeGenArgValue): CodeGenNodeArg = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeGenNodeArg]
  }
  @scala.inline
  implicit class CodeGenNodeArgOps[Self <: CodeGenNodeArg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: CodeGenArgName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: CodeGenArgValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParam(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Param")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Param")(js.undefined)
        ret
    }
  }
  
}

