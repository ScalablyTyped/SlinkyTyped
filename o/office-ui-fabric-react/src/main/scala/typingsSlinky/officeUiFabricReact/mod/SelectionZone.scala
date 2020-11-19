package typingsSlinky.officeUiFabricReact.mod

import typingsSlinky.officeUiFabricReact.anon.IsSelectedOnFocus
import typingsSlinky.officeUiFabricReact.selectionZoneMod.ISelectionZoneProps
import typingsSlinky.officeUiFabricReact.selectionZoneMod.ISelectionZoneState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.react.mod.DeprecatedLifecycle because Already inherited
- typingsSlinky.react.mod.NewLifecycle because Already inherited
- typingsSlinky.react.mod.ComponentLifecycle because Already inherited
- typingsSlinky.react.mod.Component because Already inherited
- typingsSlinky.officeUiFabricReact.selectionZoneMod.SelectionZone because Already inherited
- typingsSlinky.officeUiFabricReact.selectionMod.SelectionZone because Already inherited
- typingsSlinky.officeUiFabricReact.libMarqueeSelectionMod.SelectionZone because Inheritance from two classes. Inlined 
- typingsSlinky.officeUiFabricReact.libSelectionMod.SelectionZone because Inheritance from two classes. Inlined  */ @JSImport("office-ui-fabric-react", "SelectionZone")
@js.native
class SelectionZone protected ()
  extends typingsSlinky.officeUiFabricReact.libDetailsListMod.SelectionZone {
  def this(props: ISelectionZoneProps) = this()
}
/* static members */
@JSImport("office-ui-fabric-react", "SelectionZone")
@js.native
object SelectionZone extends js.Object {
  
  var defaultProps: IsSelectedOnFocus = js.native
  
  def getDerivedStateFromProps(nextProps: ISelectionZoneProps, prevState: ISelectionZoneState): ISelectionZoneState = js.native
}
