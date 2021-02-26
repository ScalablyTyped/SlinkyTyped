package typingsSlinky.reactHtml5CameraPhoto.components

import typingsSlinky.reactHtml5CameraPhoto.mod.CameraProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Camera {
  
  @JSImport("react-html5-camera-photo", "Camera")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Camera.type): SharedBuilder_CameraProps65792503 = new SharedBuilder_CameraProps65792503(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CameraProps): SharedBuilder_CameraProps65792503 = new SharedBuilder_CameraProps65792503(js.Array(this.component, p.asInstanceOf[js.Any]))
}
