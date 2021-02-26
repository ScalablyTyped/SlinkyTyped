package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaCoinProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object personaCoinMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Persona/PersonaCoin", "PersonaCoin")
  @js.native
  val PersonaCoin: ReactComponentClass[IPersonaCoinProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Persona/PersonaCoin", "PersonaCoinBase")
  @js.native
  class PersonaCoinBase protected ()
    extends typingsSlinky.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase {
    def this(props: IPersonaCoinProps) = this()
  }
  /* static members */
  object PersonaCoinBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Persona/PersonaCoin", "PersonaCoinBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Persona/PersonaCoin", "PersonaCoinBase.defaultProps")
    @js.native
    def defaultProps: IPersonaCoinProps = js.native
    @scala.inline
    def defaultProps_=(x: IPersonaCoinProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
