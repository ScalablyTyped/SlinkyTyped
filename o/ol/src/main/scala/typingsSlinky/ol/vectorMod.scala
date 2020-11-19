package typingsSlinky.ol

import typingsSlinky.ol.baseVectorMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/layer/Vector", JSImport.Namespace)
@js.native
object vectorMod extends js.Object {
  
  @js.native
  trait VectorLayer
    extends typingsSlinky.ol.baseVectorMod.default[typingsSlinky.ol.sourceVectorMod.default[typingsSlinky.ol.geometryMod.default]]
  
  @js.native
  class default () extends VectorLayer {
    def this(opt_options: Options) = this()
  }
}
