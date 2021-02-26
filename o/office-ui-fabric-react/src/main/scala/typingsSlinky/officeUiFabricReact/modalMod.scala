package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.modalTypesMod.IModalProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Modal", "Modal")
  @js.native
  val Modal: ReactComponentClass[IModalProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Modal", "ModalBase")
  @js.native
  class ModalBase protected ()
    extends typingsSlinky.officeUiFabricReact.modalBaseMod.ModalBase {
    def this(props: IModalProps) = this()
  }
  /* static members */
  object ModalBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Modal", "ModalBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Modal", "ModalBase.defaultProps")
    @js.native
    def defaultProps: IModalProps = js.native
    @scala.inline
    def defaultProps_=(x: IModalProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
