package typingsSlinky.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportedEnvironmentVariable extends js.Object {
  /**
    *  The name of this exported environment variable. 
    */
  var name: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The value assigned to this exported environment variable.    During a build, the value of a variable is available starting with the install phase. It can be updated between the start of the install phase and the end of the post_build phase. After the post_build phase ends, the value of exported variables cannot change. 
    */
  var value: js.UndefOr[String] = js.native
}

object ExportedEnvironmentVariable {
  @scala.inline
  def apply(): ExportedEnvironmentVariable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportedEnvironmentVariable]
  }
  @scala.inline
  implicit class ExportedEnvironmentVariableOps[Self <: ExportedEnvironmentVariable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
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

