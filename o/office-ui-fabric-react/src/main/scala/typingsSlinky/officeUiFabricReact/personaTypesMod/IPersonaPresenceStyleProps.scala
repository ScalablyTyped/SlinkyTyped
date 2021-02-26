package typingsSlinky.officeUiFabricReact.personaTypesMod

import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.officeUiFabricReact.anon.Available
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Persona/Persona.types.IPersonaSharedProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Persona/Persona.types.IPersonaSharedProps, 'presence' | 'isOutOfOffice' | 'size' | 'presenceColors'> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Persona/Persona.types.IPersonaProps, 'className'> */
@js.native
trait IPersonaPresenceStyleProps extends StObject {
  
  var className: js.UndefOr[String] = js.native
  
  var isOutOfOffice: js.UndefOr[Boolean] = js.native
  
  var presence: js.UndefOr[PersonaPresence] = js.native
  
  var presenceColors: js.UndefOr[Available] = js.native
  
  var size: js.UndefOr[PersonaSize] = js.native
  
  var theme: ITheme = js.native
}
object IPersonaPresenceStyleProps {
  
  @scala.inline
  def apply(theme: ITheme): IPersonaPresenceStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPersonaPresenceStyleProps]
  }
  
  @scala.inline
  implicit class IPersonaPresenceStylePropsMutableBuilder[Self <: IPersonaPresenceStyleProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setIsOutOfOffice(value: Boolean): Self = StObject.set(x, "isOutOfOffice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOutOfOfficeUndefined: Self = StObject.set(x, "isOutOfOffice", js.undefined)
    
    @scala.inline
    def setPresence(value: PersonaPresence): Self = StObject.set(x, "presence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresenceColors(value: Available): Self = StObject.set(x, "presenceColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresenceColorsUndefined: Self = StObject.set(x, "presenceColors", js.undefined)
    
    @scala.inline
    def setPresenceUndefined: Self = StObject.set(x, "presence", js.undefined)
    
    @scala.inline
    def setSize(value: PersonaSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
