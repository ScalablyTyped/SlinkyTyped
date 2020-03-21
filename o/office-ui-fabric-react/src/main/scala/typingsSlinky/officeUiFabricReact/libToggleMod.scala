package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.toggleTypesMod.IToggleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Toggle", JSImport.Namespace)
@js.native
object libToggleMod extends js.Object {
  @js.native
  class ToggleBase protected ()
    extends typingsSlinky.officeUiFabricReact.toggleMod.ToggleBase {
    def this(props: IToggleProps) = this()
  }
  
  val Toggle: ReactComponentClass[IToggleProps] = js.native
  /* static members */
  @js.native
  object ToggleBase extends js.Object {
    def getDerivedStateFromProps(nextProps: ReadonlyIToggleProps, prevState: ReadonlyIToggleState): PartialIToggleState | Null = js.native
  }
  
}

