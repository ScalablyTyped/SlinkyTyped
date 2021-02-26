package typingsSlinky.i18next.mod

import typingsSlinky.i18next.i18nextStrings.`3rdParty`
import typingsSlinky.i18next.i18nextStrings.backend
import typingsSlinky.i18next.i18nextStrings.i18nFormat
import typingsSlinky.i18next.i18nextStrings.languageDetector
import typingsSlinky.i18next.i18nextStrings.logger
import typingsSlinky.i18next.i18nextStrings.postProcessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Module extends StObject {
  
  var `type`: backend | logger | languageDetector | postProcessor | i18nFormat | `3rdParty` = js.native
}
object Module {
  
  @scala.inline
  def apply(`type`: backend | logger | languageDetector | postProcessor | i18nFormat | `3rdParty`): Module = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Module]
  }
  
  @scala.inline
  implicit class ModuleMutableBuilder[Self <: Module] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: backend | logger | languageDetector | postProcessor | i18nFormat | `3rdParty`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
