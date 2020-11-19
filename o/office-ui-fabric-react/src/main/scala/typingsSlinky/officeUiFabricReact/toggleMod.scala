package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.anon.PartialIToggleState
import typingsSlinky.officeUiFabricReact.anon.ReadonlyIToggleProps
import typingsSlinky.officeUiFabricReact.anon.ReadonlyIToggleState
import typingsSlinky.officeUiFabricReact.toggleTypesMod.IToggleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/Toggle", JSImport.Namespace)
@js.native
object toggleMod extends js.Object {
  
  val Toggle: ReactComponentClass[IToggleProps] = js.native
  
  @js.native
  class ToggleBase protected ()
    extends typingsSlinky.officeUiFabricReact.toggleBaseMod.ToggleBase {
    def this(props: IToggleProps) = this()
  }
  /* static members */
  @js.native
  object ToggleBase extends js.Object {
    
    def getDerivedStateFromProps(nextProps: ReadonlyIToggleProps, prevState: ReadonlyIToggleState): PartialIToggleState | Null = js.native
  }
}
