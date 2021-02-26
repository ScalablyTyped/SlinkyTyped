package typingsSlinky.localizedCountries

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.localizedCountries.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("localized-countries", JSImport.Namespace)
  @js.native
  def apply(locale: String): LocalizedCountries = js.native
  @JSImport("localized-countries", JSImport.Namespace)
  @js.native
  def apply(locale: js.Object): LocalizedCountries = js.native
  
  @js.native
  trait LocalizedCountries extends StObject {
    
    def array(): js.Array[Code] = js.native
    
    def get(code: String): String = js.native
    
    def `object`(): StringDictionary[String] = js.native
  }
  object LocalizedCountries {
    
    @scala.inline
    def apply(array: () => js.Array[Code], get: String => String, `object`: () => StringDictionary[String]): LocalizedCountries = {
      val __obj = js.Dynamic.literal(array = js.Any.fromFunction0(array), get = js.Any.fromFunction1(get))
      __obj.updateDynamic("object")(js.Any.fromFunction0(`object`))
      __obj.asInstanceOf[LocalizedCountries]
    }
    
    @scala.inline
    implicit class LocalizedCountriesMutableBuilder[Self <: LocalizedCountries] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArray(value: () => js.Array[Code]): Self = StObject.set(x, "array", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet(value: String => String): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setObject(value: () => StringDictionary[String]): Self = StObject.set(x, "object", js.Any.fromFunction0(value))
    }
  }
}
