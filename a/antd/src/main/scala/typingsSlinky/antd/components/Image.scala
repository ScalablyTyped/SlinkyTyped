package typingsSlinky.antd.components

import typingsSlinky.antd.imageMod.SkeletonImageProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Image {
  
  @JSImport("antd/lib/skeleton/Image", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: SkeletonImageProps): SharedBuilder_SkeletonImageProps696746036 = new SharedBuilder_SkeletonImageProps696746036(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Image.type): SharedBuilder_SkeletonImageProps696746036 = new SharedBuilder_SkeletonImageProps696746036(js.Array(this.component, js.Dictionary.empty))()
}
