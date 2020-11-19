package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.draggableZoneStylesMod.IDraggableZoneStyles
import typingsSlinky.officeUiFabricReact.draggableZoneTypesMod.IDraggableZoneProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/utilities/DraggableZone", JSImport.Namespace)
@js.native
object draggableZoneMod extends js.Object {
  
  def getClassNames(className: String, isDragging: Boolean): IDraggableZoneStyles = js.native
  
  @js.native
  class DraggableZone protected ()
    extends typingsSlinky.officeUiFabricReact.draggableZoneDraggableZoneMod.DraggableZone {
    def this(props: IDraggableZoneProps) = this()
  }
}
