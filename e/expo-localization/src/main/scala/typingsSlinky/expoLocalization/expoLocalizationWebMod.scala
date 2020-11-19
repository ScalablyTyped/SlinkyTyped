package typingsSlinky.expoLocalization

import typingsSlinky.expoLocalization.localizationTypesMod.Localization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-localization/build/ExpoLocalization.web", JSImport.Namespace)
@js.native
object expoLocalizationWebMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def getLocalizationAsync(): js.Promise[Localization] = js.native
    
    val isRTL: Boolean = js.native
    
    val isoCurrencyCodes: js.Array[String] = js.native
    
    val locale: String = js.native
    
    val locales: js.Array[String] = js.native
    
    val region: js.UndefOr[String] = js.native
    
    val timezone: String = js.native
  }
}
