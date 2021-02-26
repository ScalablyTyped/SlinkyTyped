package typingsSlinky.dwt.anon

import typingsSlinky.dwt.dynamsoftFileUploaderMod.FileUploader
import typingsSlinky.dwt.dynamsoftMod.DynamsoftLib
import typingsSlinky.dwt.dynamsoftMod.ManagerEnv
import typingsSlinky.dwt.dynamsoftMod.Messages
import typingsSlinky.dwt.dynamsoftMod.WebTwainEnv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofDynamsoftStatic extends StObject {
  
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
  implicit class TypeofDynamsoftStaticMutableBuilder[Self <: TypeofDynamsoftStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileUploader(value: FileUploader): Self = StObject.set(x, "FileUploader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLib(value: DynamsoftLib): Self = StObject.set(x, "Lib", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSG(value: Messages): Self = StObject.set(x, "MSG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagerEnv(value: ManagerEnv): Self = StObject.set(x, "managerEnv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebTwain(value: TypeofWebTwain): Self = StObject.set(x, "WebTwain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebTwainEnv(value: WebTwainEnv): Self = StObject.set(x, "WebTwainEnv", value.asInstanceOf[js.Any])
  }
}
