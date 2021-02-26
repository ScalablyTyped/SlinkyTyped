package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.draggableZoneStylesMod.IDraggableZoneStyles
import typingsSlinky.officeUiFabricReact.draggableZoneTypesMod.IDraggableZoneProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object draggableZoneMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/DraggableZone", "DraggableZone")
  @js.native
  class DraggableZone protected ()
    extends typingsSlinky.officeUiFabricReact.draggableZoneDraggableZoneMod.DraggableZone {
    def this(props: IDraggableZoneProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/utilities/DraggableZone", "getClassNames")
  @js.native
  def getClassNames(className: String, isDragging: Boolean): IDraggableZoneStyles = js.native
}
