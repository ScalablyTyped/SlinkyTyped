package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/Persona/Persona.base", JSImport.Namespace)
@js.native
object personaBaseMod extends js.Object {
  
  @js.native
  class PersonaBase protected ()
    extends Component[IPersonaProps, js.Object, js.Any] {
    def this(props: IPersonaProps) = this()
    
    /**
      * Deprecation helper for getting text.
      */
    var _getText: js.Any = js.native
    
    var _onRenderPersonaCoin: js.Any = js.native
    
    /**
      * using closure to wrap the default render behavior
      * to make it independent of the type of text passed
      * @param text - text to render
      */
    var _onRenderText: js.Any = js.native
    
    /**
      * Renders various types of Text (primaryText, secondaryText, etc)
      * based on the classNames passed
      * @param classNames - element className
      * @param renderFunction - render function
      * @param defaultRenderFunction - default render function
      */
    var _renderElement: js.Any = js.native
  }
  /* static members */
  @js.native
  object PersonaBase extends js.Object {
    
    var defaultProps: IPersonaProps = js.native
  }
}
