package typingsSlinky.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent pubnub.pubnub.v2ObjectParam<Custom> */
/* Inlined parent std.Partial<pubnub.pubnub.ChannelMetadataFields> */
@js.native
trait ChannelMetadata[Custom /* <: ObjectCustom */] extends StObject {
  
  var custom: js.UndefOr[Custom] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
}
object ChannelMetadata {
  
  @scala.inline
  def apply[Custom /* <: ObjectCustom */](): ChannelMetadata[Custom] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelMetadata[Custom]]
  }
  
  @scala.inline
  implicit class ChannelMetadataMutableBuilder[Self <: ChannelMetadata[_], Custom /* <: ObjectCustom */] (val x: Self with ChannelMetadata[Custom]) extends AnyVal {
    
    @scala.inline
    def setCustom(value: Custom): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
