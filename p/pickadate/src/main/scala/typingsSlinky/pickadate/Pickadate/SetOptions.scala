package typingsSlinky.pickadate.Pickadate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetOptions extends StObject {
  
  var format: js.UndefOr[String] = js.native
  
  /**
    * By default, any callbacks bound with the on method will be fired
    * when its relevant thing is set. To silently set a thing, pass an
    * options object with the muted parameter set to true.
    */
  var muted: js.UndefOr[Boolean] = js.native
}
object SetOptions {
  
  @scala.inline
  def apply(): SetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetOptions]
  }
  
  @scala.inline
  implicit class SetOptionsMutableBuilder[Self <: SetOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
  }
}
