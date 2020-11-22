package typingsSlinky.rcUpload.components

import typingsSlinky.rcUpload.ajaxUploaderMod.default
import typingsSlinky.rcUpload.interfaceMod.UploadProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AjaxUploader {
  
  @JSImport("rc-upload/es/AjaxUploader", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: UploadProps): SharedBuilder_UploadProps307879974[default] = new SharedBuilder_UploadProps307879974[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: AjaxUploader.type): SharedBuilder_UploadProps307879974[default] = new SharedBuilder_UploadProps307879974[default](js.Array(this.component, js.Dictionary.empty))()
}
