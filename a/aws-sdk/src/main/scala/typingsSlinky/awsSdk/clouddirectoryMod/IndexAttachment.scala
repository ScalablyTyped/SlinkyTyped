package typingsSlinky.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexAttachment extends StObject {
  
  /**
    * The indexed attribute values.
    */
  var IndexedAttributes: js.UndefOr[AttributeKeyAndValueList] = js.native
  
  /**
    * In response to ListIndex, the ObjectIdentifier of the object attached to the index. In response to ListAttachedIndices, the ObjectIdentifier of the index attached to the object. This field will always contain the ObjectIdentifier of the object on the opposite side of the attachment specified in the query.
    */
  var ObjectIdentifier: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.ObjectIdentifier] = js.native
}
object IndexAttachment {
  
  @scala.inline
  def apply(): IndexAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndexAttachment]
  }
  
  @scala.inline
  implicit class IndexAttachmentMutableBuilder[Self <: IndexAttachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexedAttributes(value: AttributeKeyAndValueList): Self = StObject.set(x, "IndexedAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexedAttributesUndefined: Self = StObject.set(x, "IndexedAttributes", js.undefined)
    
    @scala.inline
    def setIndexedAttributesVarargs(value: AttributeKeyAndValue*): Self = StObject.set(x, "IndexedAttributes", js.Array(value :_*))
    
    @scala.inline
    def setObjectIdentifier(value: ObjectIdentifier): Self = StObject.set(x, "ObjectIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdentifierUndefined: Self = StObject.set(x, "ObjectIdentifier", js.undefined)
  }
}
