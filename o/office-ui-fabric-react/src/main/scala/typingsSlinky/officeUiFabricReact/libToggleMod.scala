package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.anon.PartialIToggleState
import typingsSlinky.officeUiFabricReact.anon.ReadonlyIToggleProps
import typingsSlinky.officeUiFabricReact.anon.ReadonlyIToggleState
import typingsSlinky.officeUiFabricReact.toggleTypesMod.IToggleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libToggleMod {
  
  @JSImport("office-ui-fabric-react/lib/Toggle", "Toggle")
  @js.native
  val Toggle: ReactComponentClass[IToggleProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Toggle", "ToggleBase")
  @js.native
  class ToggleBase protected ()
    extends typingsSlinky.officeUiFabricReact.toggleMod.ToggleBase {
    def this(props: IToggleProps) = this()
  }
  /* static members */
  object ToggleBase {
    
    @JSImport("office-ui-fabric-react/lib/Toggle", "ToggleBase.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(nextProps: ReadonlyIToggleProps, prevState: ReadonlyIToggleState): PartialIToggleState | Null = js.native
  }
}
