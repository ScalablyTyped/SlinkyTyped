package typingsSlinky.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Audio extends StObject {
  
  /**
    * The locale of the audio message. Currently, en-US is supported.
    */
  var Locale: typingsSlinky.awsSdk.alexaforbusinessMod.Locale = js.native
  
  /**
    * The location of the audio file. Currently, S3 URLs are supported. Only S3 locations comprised of safe characters are valid. For more information, see Safe Characters.
    */
  var Location: AudioLocation = js.native
}
object Audio {
  
  @scala.inline
  def apply(Locale: Locale, Location: AudioLocation): Audio = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Audio]
  }
  
  @scala.inline
  implicit class AudioMutableBuilder[Self <: Audio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocale(value: Locale): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: AudioLocation): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
  }
}
