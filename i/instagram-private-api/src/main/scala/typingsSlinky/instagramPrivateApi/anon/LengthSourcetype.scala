package typingsSlinky.instagramPrivateApi.anon

import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.`3`
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LengthSourcetype extends StObject {
  
  var length: Double = js.native
  
  var source_type: `3` | `4` = js.native
}
object LengthSourcetype {
  
  @scala.inline
  def apply(length: Double, source_type: `3` | `4`): LengthSourcetype = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], source_type = source_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[LengthSourcetype]
  }
  
  @scala.inline
  implicit class LengthSourcetypeMutableBuilder[Self <: LengthSourcetype] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource_type(value: `3` | `4`): Self = StObject.set(x, "source_type", value.asInstanceOf[js.Any])
  }
}
