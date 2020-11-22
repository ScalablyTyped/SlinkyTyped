package typingsSlinky.antvComponent

import typingsSlinky.antvComponent.groupComponentMod.GroupComponent
import typingsSlinky.antvComponent.typesMod.PointLocationCfg
import typingsSlinky.antvComponent.typesMod.TextAnnotationCfg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/component/lib/annotation/text", JSImport.Namespace)
@js.native
object textMod extends js.Object {
  
  @js.native
  trait TextAnnotation extends GroupComponent[TextAnnotationCfg] {
    
    var resetLocation: js.Any = js.native
    
    def setLocation(location: PointLocationCfg): Unit = js.native
  }
  
  @js.native
  class default () extends TextAnnotation
}
