package typingsSlinky.appBuilderLib.macCodeSignMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeSigningInfo extends js.Object {
  var keychainFile: js.UndefOr[String | Null] = js.native
}

object CodeSigningInfo {
  @scala.inline
  def apply(): CodeSigningInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeSigningInfo]
  }
  @scala.inline
  implicit class CodeSigningInfoOps[Self <: CodeSigningInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeychainFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keychainFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeychainFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keychainFile")(js.undefined)
        ret
    }
    @scala.inline
    def withKeychainFileNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keychainFile")(null)
        ret
    }
  }
  
}

