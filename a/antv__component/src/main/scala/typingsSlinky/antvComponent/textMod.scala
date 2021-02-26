package typingsSlinky.antvComponent

import typingsSlinky.antvComponent.typesMod.PointLocationCfg
import typingsSlinky.antvComponent.typesMod.TextAnnotationCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textMod {
  
  @JSImport("@antv/component/lib/annotation/text", JSImport.Default)
  @js.native
  class default () extends TextAnnotation
  
  @js.native
  trait TextAnnotation
    extends typingsSlinky.antvComponent.groupComponentMod.default[TextAnnotationCfg] {
    
    var resetLocation: js.Any = js.native
    
    def setLocation(location: PointLocationCfg): Unit = js.native
  }
}
