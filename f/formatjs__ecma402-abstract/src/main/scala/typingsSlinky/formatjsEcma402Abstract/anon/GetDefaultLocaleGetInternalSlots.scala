package typingsSlinky.formatjsEcma402Abstract.anon

import typingsSlinky.formatjsEcma402Abstract.relativeTimeMod.LocaleFieldsData
import typingsSlinky.formatjsEcma402Abstract.relativeTimeMod.RelativeTimeFormat
import typingsSlinky.formatjsEcma402Abstract.relativeTimeMod.RelativeTimeFormatInternal
import typingsSlinky.std.Record
import typingsSlinky.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDefaultLocaleGetInternalSlots extends StObject {
  
  var availableLocales: Set[String] = js.native
  
  def getDefaultLocale(): String = js.native
  
  def getInternalSlots(rtf: RelativeTimeFormat): RelativeTimeFormatInternal = js.native
  
  var localeData: Record[String, js.UndefOr[LocaleFieldsData]] = js.native
  
  var relevantExtensionKeys: js.Array[String] = js.native
}
object GetDefaultLocaleGetInternalSlots {
  
  @scala.inline
  def apply(
    availableLocales: Set[String],
    getDefaultLocale: () => String,
    getInternalSlots: RelativeTimeFormat => RelativeTimeFormatInternal,
    localeData: Record[String, js.UndefOr[LocaleFieldsData]],
    relevantExtensionKeys: js.Array[String]
  ): GetDefaultLocaleGetInternalSlots = {
    val __obj = js.Dynamic.literal(availableLocales = availableLocales.asInstanceOf[js.Any], getDefaultLocale = js.Any.fromFunction0(getDefaultLocale), getInternalSlots = js.Any.fromFunction1(getInternalSlots), localeData = localeData.asInstanceOf[js.Any], relevantExtensionKeys = relevantExtensionKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDefaultLocaleGetInternalSlots]
  }
  
  @scala.inline
  implicit class GetDefaultLocaleGetInternalSlotsMutableBuilder[Self <: GetDefaultLocaleGetInternalSlots] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailableLocales(value: Set[String]): Self = StObject.set(x, "availableLocales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDefaultLocale(value: () => String): Self = StObject.set(x, "getDefaultLocale", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInternalSlots(value: RelativeTimeFormat => RelativeTimeFormatInternal): Self = StObject.set(x, "getInternalSlots", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLocaleData(value: Record[String, js.UndefOr[LocaleFieldsData]]): Self = StObject.set(x, "localeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelevantExtensionKeys(value: js.Array[String]): Self = StObject.set(x, "relevantExtensionKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelevantExtensionKeysVarargs(value: String*): Self = StObject.set(x, "relevantExtensionKeys", js.Array(value :_*))
  }
}
