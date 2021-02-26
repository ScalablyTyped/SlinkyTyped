package typingsSlinky.officeUiFabricReact.mod

import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.react.mod.DeprecatedLifecycle because Already inherited
- typingsSlinky.react.mod.NewLifecycle because Already inherited
- typingsSlinky.react.mod.ComponentLifecycle because Already inherited
- typingsSlinky.react.mod.Component because Already inherited
- typingsSlinky.officeUiFabricReact.personaBaseMod.PersonaBase because Already inherited
- typingsSlinky.officeUiFabricReact.personaMod.PersonaBase because Already inherited
- typingsSlinky.officeUiFabricReact.libPersonaCoinMod.PersonaBase because Inheritance from two classes. Inlined  */ @JSImport("office-ui-fabric-react", "PersonaBase")
@js.native
class PersonaBase protected ()
  extends typingsSlinky.officeUiFabricReact.libPersonaMod.PersonaBase {
  def this(props: IPersonaProps) = this()
}
/* static members */
object PersonaBase {
  
  @JSImport("office-ui-fabric-react", "PersonaBase")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "PersonaBase.defaultProps")
  @js.native
  def defaultProps: IPersonaProps = js.native
  @scala.inline
  def defaultProps_=(x: IPersonaProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
