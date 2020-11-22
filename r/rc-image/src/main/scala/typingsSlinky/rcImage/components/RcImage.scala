package typingsSlinky.rcImage.components

import typingsSlinky.rcImage.imageMod.ImageProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RcImage {
  
  @JSImport("rc-image", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: ImageProps): SharedBuilder_ImageProps_218899471 = new SharedBuilder_ImageProps_218899471(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: RcImage.type): SharedBuilder_ImageProps_218899471 = new SharedBuilder_ImageProps_218899471(js.Array(this.component, js.Dictionary.empty))()
}
