package typingsSlinky.rcImage.components

import typingsSlinky.rcImage.imageMod.ImageProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Image {
  
  @JSImport("rc-image/lib/Image", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Image.type): SharedBuilder_ImageProps_218899471 = new SharedBuilder_ImageProps_218899471(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ImageProps): SharedBuilder_ImageProps_218899471 = new SharedBuilder_ImageProps_218899471(js.Array(this.component, p.asInstanceOf[js.Any]))
}
