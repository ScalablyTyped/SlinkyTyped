package typingsSlinky.documentdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractMeta extends UniqueId {
  
  var _attachments: js.UndefOr[String] = js.native
  
  var _etag: js.UndefOr[String] = js.native
  
  var _rid: js.UndefOr[String] = js.native
  
  /** The self link. */
  var _self: String = js.native
  
  /** The time the object was created. */
  var _ts: Double = js.native
}
object AbstractMeta {
  
  @scala.inline
  def apply(_self: String, _ts: Double, id: String): AbstractMeta = {
    val __obj = js.Dynamic.literal(_self = _self.asInstanceOf[js.Any], _ts = _ts.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractMeta]
  }
  
  @scala.inline
  implicit class AbstractMetaMutableBuilder[Self <: AbstractMeta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set_attachments(value: String): Self = StObject.set(x, "_attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_attachmentsUndefined: Self = StObject.set(x, "_attachments", js.undefined)
    
    @scala.inline
    def set_etag(value: String): Self = StObject.set(x, "_etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_etagUndefined: Self = StObject.set(x, "_etag", js.undefined)
    
    @scala.inline
    def set_rid(value: String): Self = StObject.set(x, "_rid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_ridUndefined: Self = StObject.set(x, "_rid", js.undefined)
    
    @scala.inline
    def set_self(value: String): Self = StObject.set(x, "_self", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_ts(value: Double): Self = StObject.set(x, "_ts", value.asInstanceOf[js.Any])
  }
}
