package typingsSlinky.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LobbyBypassSettings extends StObject {
  
  // Specifies whether or not to always let dial-in callers bypass the lobby. Optional.
  var isDialInBypassEnabled: js.UndefOr[NullableOption[Boolean]] = js.native
  
  /**
    * Specifies the type of participants that are automatically admitted into a meeting, bypassing the lobby. Possible values
    * are listed in the following table. Optional.
    */
  var scope: js.UndefOr[NullableOption[LobbyBypassScope]] = js.native
}
object LobbyBypassSettings {
  
  @scala.inline
  def apply(): LobbyBypassSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LobbyBypassSettings]
  }
  
  @scala.inline
  implicit class LobbyBypassSettingsMutableBuilder[Self <: LobbyBypassSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsDialInBypassEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "isDialInBypassEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDialInBypassEnabledNull: Self = StObject.set(x, "isDialInBypassEnabled", null)
    
    @scala.inline
    def setIsDialInBypassEnabledUndefined: Self = StObject.set(x, "isDialInBypassEnabled", js.undefined)
    
    @scala.inline
    def setScope(value: NullableOption[LobbyBypassScope]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeNull: Self = StObject.set(x, "scope", null)
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
