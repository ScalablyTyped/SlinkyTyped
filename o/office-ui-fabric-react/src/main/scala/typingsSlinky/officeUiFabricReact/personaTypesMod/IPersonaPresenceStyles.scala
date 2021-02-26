package typingsSlinky.officeUiFabricReact.personaTypesMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPersonaPresenceStyles extends StObject {
  
  var presence: IStyle = js.native
  
  var presenceIcon: IStyle = js.native
}
object IPersonaPresenceStyles {
  
  @scala.inline
  def apply(): IPersonaPresenceStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPersonaPresenceStyles]
  }
  
  @scala.inline
  implicit class IPersonaPresenceStylesMutableBuilder[Self <: IPersonaPresenceStyles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPresence(value: IStyle): Self = StObject.set(x, "presence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresenceIcon(value: IStyle): Self = StObject.set(x, "presenceIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresenceIconNull: Self = StObject.set(x, "presenceIcon", null)
    
    @scala.inline
    def setPresenceIconUndefined: Self = StObject.set(x, "presenceIcon", js.undefined)
    
    @scala.inline
    def setPresenceNull: Self = StObject.set(x, "presence", null)
    
    @scala.inline
    def setPresenceUndefined: Self = StObject.set(x, "presence", js.undefined)
  }
}
