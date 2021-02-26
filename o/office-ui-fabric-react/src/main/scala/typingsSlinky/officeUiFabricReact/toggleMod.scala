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

object toggleMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Toggle", "Toggle")
  @js.native
  val Toggle: ReactComponentClass[IToggleProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Toggle", "ToggleBase")
  @js.native
  class ToggleBase protected ()
    extends typingsSlinky.officeUiFabricReact.toggleBaseMod.ToggleBase {
    def this(props: IToggleProps) = this()
  }
  /* static members */
  object ToggleBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Toggle", "ToggleBase.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(nextProps: ReadonlyIToggleProps, prevState: ReadonlyIToggleState): PartialIToggleState | Null = js.native
  }
}
