package typingsSlinky.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectIdentifierAndLinkNameTuple extends StObject {
  
  /**
    * The name of the link between the parent and the child object.
    */
  var LinkName: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.LinkName] = js.native
  
  /**
    * The ID that is associated with the object.
    */
  var ObjectIdentifier: js.UndefOr[typingsSlinky.awsSdk.clouddirectoryMod.ObjectIdentifier] = js.native
}
object ObjectIdentifierAndLinkNameTuple {
  
  @scala.inline
  def apply(): ObjectIdentifierAndLinkNameTuple = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectIdentifierAndLinkNameTuple]
  }
  
  @scala.inline
  implicit class ObjectIdentifierAndLinkNameTupleMutableBuilder[Self <: ObjectIdentifierAndLinkNameTuple] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLinkName(value: LinkName): Self = StObject.set(x, "LinkName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkNameUndefined: Self = StObject.set(x, "LinkName", js.undefined)
    
    @scala.inline
    def setObjectIdentifier(value: ObjectIdentifier): Self = StObject.set(x, "ObjectIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdentifierUndefined: Self = StObject.set(x, "ObjectIdentifier", js.undefined)
  }
}
