package typingsSlinky.contentfulManagement.anon

import typingsSlinky.axios.mod.AxiosInstance
import typingsSlinky.contentfulManagement.commonTypesMod.Collection
import typingsSlinky.contentfulManagement.commonTypesMod.CollectionProp
import typingsSlinky.contentfulManagement.localeMod.Locale
import typingsSlinky.contentfulManagement.localeMod.LocaleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeoflocale extends StObject {
  
  def wrapLocale(http: AxiosInstance, data: LocaleProps): Locale = js.native
  
  def wrapLocaleCollection(http: AxiosInstance, data: CollectionProp[LocaleProps]): Collection[Locale, LocaleProps] = js.native
}
object Typeoflocale {
  
  @scala.inline
  def apply(
    wrapLocale: (AxiosInstance, LocaleProps) => Locale,
    wrapLocaleCollection: (AxiosInstance, CollectionProp[LocaleProps]) => Collection[Locale, LocaleProps]
  ): Typeoflocale = {
    val __obj = js.Dynamic.literal(wrapLocale = js.Any.fromFunction2(wrapLocale), wrapLocaleCollection = js.Any.fromFunction2(wrapLocaleCollection))
    __obj.asInstanceOf[Typeoflocale]
  }
  
  @scala.inline
  implicit class TypeoflocaleMutableBuilder[Self <: Typeoflocale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWrapLocale(value: (AxiosInstance, LocaleProps) => Locale): Self = StObject.set(x, "wrapLocale", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapLocaleCollection(value: (AxiosInstance, CollectionProp[LocaleProps]) => Collection[Locale, LocaleProps]): Self = StObject.set(x, "wrapLocaleCollection", js.Any.fromFunction2(value))
  }
}
