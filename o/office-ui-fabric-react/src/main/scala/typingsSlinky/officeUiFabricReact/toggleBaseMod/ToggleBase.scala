package typingsSlinky.officeUiFabricReact.toggleBaseMod

import typingsSlinky.officeUiFabricReact.anon.PartialIToggleState
import typingsSlinky.officeUiFabricReact.anon.ReadonlyIToggleProps
import typingsSlinky.officeUiFabricReact.anon.ReadonlyIToggleState
import typingsSlinky.officeUiFabricReact.toggleTypesMod.IToggle
import typingsSlinky.officeUiFabricReact.toggleTypesMod.IToggleProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Toggle/Toggle.base", "ToggleBase")
@js.native
class ToggleBase protected ()
  extends Component[IToggleProps, IToggleState, js.Any]
     with IToggle {
  def this(props: IToggleProps) = this()
  var _id: js.Any = js.native
  var _noop: js.Any = js.native
  var _onClick: js.Any = js.native
  var _toggleButton: js.Any = js.native
  /**
    * Gets the current checked state of the toggle.
    */
  val checked: Boolean = js.native
  /* CompleteClass */
  override def focus(): Unit = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/Toggle/Toggle.base", "ToggleBase")
@js.native
object ToggleBase extends js.Object {
  def getDerivedStateFromProps(nextProps: ReadonlyIToggleProps, prevState: ReadonlyIToggleState): PartialIToggleState | Null = js.native
}

