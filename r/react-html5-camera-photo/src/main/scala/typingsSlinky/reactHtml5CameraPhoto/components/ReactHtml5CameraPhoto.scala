package typingsSlinky.reactHtml5CameraPhoto.components

import typingsSlinky.reactHtml5CameraPhoto.mod.CameraProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactHtml5CameraPhoto {
  
  @JSImport("react-html5-camera-photo", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: CameraProps): SharedBuilder_CameraProps65792503 = new SharedBuilder_CameraProps65792503(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactHtml5CameraPhoto.type): SharedBuilder_CameraProps65792503 = new SharedBuilder_CameraProps65792503(js.Array(this.component, js.Dictionary.empty))()
}
