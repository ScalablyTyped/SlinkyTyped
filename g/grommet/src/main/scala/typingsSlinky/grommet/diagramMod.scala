package typingsSlinky.grommet

import org.scalajs.dom.raw.SVGSVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.grommet.anon.Anchor
import typingsSlinky.react.mod.SVGProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diagramMod {
  
  @JSImport("grommet/components/Diagram", "Diagram")
  @js.native
  val Diagram: ReactComponentClass[DiagramProps with SVGProps[SVGSVGElement]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.grommet.grommetStrings.center
    - typingsSlinky.grommet.grommetStrings.vertical
    - typingsSlinky.grommet.grommetStrings.horizontal
  */
  trait DiagramConnectionAnchor extends StObject
  object DiagramConnectionAnchor {
    
    @scala.inline
    def center: typingsSlinky.grommet.grommetStrings.center = "center".asInstanceOf[typingsSlinky.grommet.grommetStrings.center]
    
    @scala.inline
    def horizontal: typingsSlinky.grommet.grommetStrings.horizontal = "horizontal".asInstanceOf[typingsSlinky.grommet.grommetStrings.horizontal]
    
    @scala.inline
    def vertical: typingsSlinky.grommet.grommetStrings.vertical = "vertical".asInstanceOf[typingsSlinky.grommet.grommetStrings.vertical]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.grommet.grommetStrings.direct
    - typingsSlinky.grommet.grommetStrings.curved
    - typingsSlinky.grommet.grommetStrings.rectilinear
  */
  trait DiagramConnectionType extends StObject
  object DiagramConnectionType {
    
    @scala.inline
    def curved: typingsSlinky.grommet.grommetStrings.curved = "curved".asInstanceOf[typingsSlinky.grommet.grommetStrings.curved]
    
    @scala.inline
    def direct: typingsSlinky.grommet.grommetStrings.direct = "direct".asInstanceOf[typingsSlinky.grommet.grommetStrings.direct]
    
    @scala.inline
    def rectilinear: typingsSlinky.grommet.grommetStrings.rectilinear = "rectilinear".asInstanceOf[typingsSlinky.grommet.grommetStrings.rectilinear]
  }
  
  @js.native
  trait DiagramProps extends StObject {
    
    var connections: js.Array[Anchor] = js.native
  }
  object DiagramProps {
    
    @scala.inline
    def apply(connections: js.Array[Anchor]): DiagramProps = {
      val __obj = js.Dynamic.literal(connections = connections.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiagramProps]
    }
    
    @scala.inline
    implicit class DiagramPropsMutableBuilder[Self <: DiagramProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnections(value: js.Array[Anchor]): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionsVarargs(value: Anchor*): Self = StObject.set(x, "connections", js.Array(value :_*))
    }
  }
}
