package typingsSlinky.officeUiFabricReact.mod

import typingsSlinky.officeUiFabricReact.anon.Disabled
import typingsSlinky.officeUiFabricReact.buttonGridCellTypesMod.IButtonGridCellProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.react.mod.DeprecatedLifecycle because Already inherited
- typingsSlinky.react.mod.NewLifecycle because Already inherited
- typingsSlinky.react.mod.ComponentLifecycle because Already inherited
- typingsSlinky.react.mod.Component because Already inherited
- typingsSlinky.officeUiFabricReact.buttonGridCellMod.ButtonGridCell because Already inherited
- typingsSlinky.officeUiFabricReact.buttonGridMod.ButtonGridCell because Already inherited
- typingsSlinky.officeUiFabricReact.gridMod.ButtonGridCell because Inheritance from two classes. Inlined  */ @JSImport("office-ui-fabric-react", "ButtonGridCell")
@js.native
class ButtonGridCell[T, P /* <: IButtonGridCellProps[T] */] protected ()
  extends typingsSlinky.officeUiFabricReact.libButtonGridMod.ButtonGridCell[T, P] {
  def this(props: P) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: P, context: js.Any) = this()
}
/* static members */
object ButtonGridCell {
  
  @JSImport("office-ui-fabric-react", "ButtonGridCell")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "ButtonGridCell.defaultProps")
  @js.native
  def defaultProps: Disabled = js.native
  @scala.inline
  def defaultProps_=(x: Disabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
