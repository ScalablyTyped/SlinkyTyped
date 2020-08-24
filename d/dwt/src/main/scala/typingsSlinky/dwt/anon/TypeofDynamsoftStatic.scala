package typingsSlinky.dwt.anon

import typingsSlinky.dwt.dynamsoftFileUploaderMod.FileUploader
import typingsSlinky.dwt.dynamsoftMod.DynamsoftLib
import typingsSlinky.dwt.dynamsoftMod.ManagerEnv
import typingsSlinky.dwt.dynamsoftMod.Messages
import typingsSlinky.dwt.dynamsoftMod.WebTwainEnv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofDynamsoftStatic extends js.Object {
  var FileUploader: typingsSlinky.dwt.dynamsoftFileUploaderMod.FileUploader = js.native
  var Lib: DynamsoftLib = js.native
  var MSG: Messages = js.native
  val WebTwain: TypeofWebTwain = js.native
  var WebTwainEnv: typingsSlinky.dwt.dynamsoftMod.WebTwainEnv = js.native
  var managerEnv: ManagerEnv = js.native
}

object TypeofDynamsoftStatic {
  @scala.inline
  def apply(
    FileUploader: FileUploader,
    Lib: DynamsoftLib,
    MSG: Messages,
    WebTwain: TypeofWebTwain,
    WebTwainEnv: WebTwainEnv,
    managerEnv: ManagerEnv
  ): TypeofDynamsoftStatic = {
    val __obj = js.Dynamic.literal(FileUploader = FileUploader.asInstanceOf[js.Any], Lib = Lib.asInstanceOf[js.Any], MSG = MSG.asInstanceOf[js.Any], WebTwain = WebTwain.asInstanceOf[js.Any], WebTwainEnv = WebTwainEnv.asInstanceOf[js.Any], managerEnv = managerEnv.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDynamsoftStatic]
  }
  @scala.inline
  implicit class TypeofDynamsoftStaticOps[Self <: TypeofDynamsoftStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFileUploader(value: FileUploader): Self = this.set("FileUploader", value.asInstanceOf[js.Any])
    @scala.inline
    def setLib(value: DynamsoftLib): Self = this.set("Lib", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSG(value: Messages): Self = this.set("MSG", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebTwain(value: TypeofWebTwain): Self = this.set("WebTwain", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebTwainEnv(value: WebTwainEnv): Self = this.set("WebTwainEnv", value.asInstanceOf[js.Any])
    @scala.inline
    def setManagerEnv(value: ManagerEnv): Self = this.set("managerEnv", value.asInstanceOf[js.Any])
  }
  
}

