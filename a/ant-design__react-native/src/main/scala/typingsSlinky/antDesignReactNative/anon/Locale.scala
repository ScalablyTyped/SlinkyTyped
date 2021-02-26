package typingsSlinky.antDesignReactNative.anon

import typingsSlinky.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Locale extends StObject {
  
  var locale: Requireable[js.Object] = js.native
}
object Locale {
  
  @scala.inline
  def apply(locale: Requireable[js.Object]): Locale = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
  
  @scala.inline
  implicit class LocaleMutableBuilder[Self <: Locale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocale(value: Requireable[js.Object]): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
  }
}
