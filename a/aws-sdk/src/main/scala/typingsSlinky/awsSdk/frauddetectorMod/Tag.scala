package typingsSlinky.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tag extends StObject {
  
  /**
    * A tag key.
    */
  var key: tagKey = js.native
  
  /**
    * A value assigned to a tag key.
    */
  var value: tagValue = js.native
}
object Tag {
  
  @scala.inline
  def apply(key: tagKey, value: tagValue): Tag = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
  
  @scala.inline
  implicit class TagMutableBuilder[Self <: Tag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: tagKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: tagValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
