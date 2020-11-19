package typingsSlinky.ol

import typingsSlinky.ol.baseImageMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/layer/Image", JSImport.Namespace)
@js.native
object imageMod extends js.Object {
  
  @js.native
  trait ImageLayer
    extends typingsSlinky.ol.baseImageMod.default
  
  @js.native
  class default () extends ImageLayer {
    def this(opt_options: Options) = this()
  }
}
