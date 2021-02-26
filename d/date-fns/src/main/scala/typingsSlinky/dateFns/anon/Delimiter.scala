package typingsSlinky.dateFns.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Delimiter extends StObject {
  
  var delimiter: js.UndefOr[String] = js.native
  
  var format: js.UndefOr[js.Array[String]] = js.native
  
  var locale: js.UndefOr[typingsSlinky.dateFns.mod.Locale] = js.native
  
  var zero: js.UndefOr[Boolean] = js.native
}
object Delimiter {
  
  @scala.inline
  def apply(): Delimiter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Delimiter]
  }
  
  @scala.inline
  implicit class DelimiterMutableBuilder[Self <: Delimiter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    @scala.inline
    def setFormat(value: js.Array[String]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setFormatVarargs(value: String*): Self = StObject.set(x, "format", js.Array(value :_*))
    
    @scala.inline
    def setLocale(value: typingsSlinky.dateFns.mod.Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setZero(value: Boolean): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZeroUndefined: Self = StObject.set(x, "zero", js.undefined)
  }
}
