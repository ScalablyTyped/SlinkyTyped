package typingsSlinky.rcUpload.components

import typingsSlinky.rcUpload.interfaceMod.UploadProps
import typingsSlinky.rcUpload.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RcUpload {
  
  @JSImport("rc-upload", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: RcUpload.type): SharedBuilder_UploadProps307879974[default] = new SharedBuilder_UploadProps307879974[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: UploadProps): SharedBuilder_UploadProps307879974[default] = new SharedBuilder_UploadProps307879974[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
