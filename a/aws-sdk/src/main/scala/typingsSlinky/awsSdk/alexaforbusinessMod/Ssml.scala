package typingsSlinky.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ssml extends StObject {
  
  /**
    * The locale of the SSML message. Currently, en-US is supported.
    */
  var Locale: typingsSlinky.awsSdk.alexaforbusinessMod.Locale = js.native
  
  /**
    * The value of the SSML message in the correct SSML format. The audio tag is not supported.
    */
  var Value: SsmlValue = js.native
}
object Ssml {
  
  @scala.inline
  def apply(Locale: Locale, Value: SsmlValue): Ssml = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ssml]
  }
  
  @scala.inline
  implicit class SsmlMutableBuilder[Self <: Ssml] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocale(value: Locale): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: SsmlValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
