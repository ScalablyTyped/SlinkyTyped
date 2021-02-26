package typingsSlinky.expoLocalization

import typingsSlinky.expoLocalization.localizationTypesMod.Localization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expoLocalizationMod {
  
  object default {
    
    @JSImport("expo-localization/build/ExpoLocalization", "default.getLocalizationAsync")
    @js.native
    def getLocalizationAsync(): js.Promise[Localization] = js.native
    
    @JSImport("expo-localization/build/ExpoLocalization", "default.isRTL")
    @js.native
    val isRTL: Boolean = js.native
    
    @JSImport("expo-localization/build/ExpoLocalization", "default.isoCurrencyCodes")
    @js.native
    val isoCurrencyCodes: js.Array[String] = js.native
    
    @JSImport("expo-localization/build/ExpoLocalization", "default.locale")
    @js.native
    val locale: String = js.native
    
    @JSImport("expo-localization/build/ExpoLocalization", "default.locales")
    @js.native
    val locales: js.Array[String] = js.native
    
    @JSImport("expo-localization/build/ExpoLocalization", "default.region")
    @js.native
    val region: String | Null = js.native
    
    @JSImport("expo-localization/build/ExpoLocalization", "default.timezone")
    @js.native
    val timezone: String = js.native
  }
}
