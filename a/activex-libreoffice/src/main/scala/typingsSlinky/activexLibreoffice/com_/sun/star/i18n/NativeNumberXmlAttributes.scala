package typingsSlinky.activexLibreoffice.com_.sun.star.i18n

import typingsSlinky.activexLibreoffice.com_.sun.star.lang.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Attributes describing a native number mode for a specific locale, stored in XML file format.
  *
  * Used with {@link XNativeNumberSupplier.convertToXmlAttributes()} and {@link XNativeNumberSupplier.convertFromXmlAttributes()}
  * @since OOo 1.1.2
  */
@js.native
trait NativeNumberXmlAttributes extends StObject {
  
  var Format: String = js.native
  
  var Locale: typingsSlinky.activexLibreoffice.com_.sun.star.lang.Locale = js.native
  
  /** The type of the number string, for example, "short" or "medium" or "long". */
  var Style: String = js.native
}
object NativeNumberXmlAttributes {
  
  @scala.inline
  def apply(Format: String, Locale: Locale, Style: String): NativeNumberXmlAttributes = {
    val __obj = js.Dynamic.literal(Format = Format.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeNumberXmlAttributes]
  }
  
  @scala.inline
  implicit class NativeNumberXmlAttributesMutableBuilder[Self <: NativeNumberXmlAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: Locale): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: String): Self = StObject.set(x, "Style", value.asInstanceOf[js.Any])
  }
}
