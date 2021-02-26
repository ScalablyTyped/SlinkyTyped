package typingsSlinky.googleapis.mirrorV1Mod.mirrorV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A notification delivered by the API.
  */
@js.native
trait SchemaNotification extends StObject {
  
  /**
    * The collection that generated the notification.
    */
  var collection: js.UndefOr[String] = js.native
  
  /**
    * The ID of the item that generated the notification.
    */
  var itemId: js.UndefOr[String] = js.native
  
  /**
    * The type of operation that generated the notification.
    */
  var operation: js.UndefOr[String] = js.native
  
  /**
    * A list of actions taken by the user that triggered the notification.
    */
  var userActions: js.UndefOr[js.Array[SchemaUserAction]] = js.native
  
  /**
    * The user token provided by the service when it subscribed for
    * notifications.
    */
  var userToken: js.UndefOr[String] = js.native
  
  /**
    * The secret verify token provided by the service when it subscribed for
    * notifications.
    */
  var verifyToken: js.UndefOr[String] = js.native
}
object SchemaNotification {
  
  @scala.inline
  def apply(): SchemaNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNotification]
  }
  
  @scala.inline
  implicit class SchemaNotificationMutableBuilder[Self <: SchemaNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionUndefined: Self = StObject.set(x, "collection", js.undefined)
    
    @scala.inline
    def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
    
    @scala.inline
    def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    @scala.inline
    def setUserActions(value: js.Array[SchemaUserAction]): Self = StObject.set(x, "userActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserActionsUndefined: Self = StObject.set(x, "userActions", js.undefined)
    
    @scala.inline
    def setUserActionsVarargs(value: SchemaUserAction*): Self = StObject.set(x, "userActions", js.Array(value :_*))
    
    @scala.inline
    def setUserToken(value: String): Self = StObject.set(x, "userToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserTokenUndefined: Self = StObject.set(x, "userToken", js.undefined)
    
    @scala.inline
    def setVerifyToken(value: String): Self = StObject.set(x, "verifyToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerifyTokenUndefined: Self = StObject.set(x, "verifyToken", js.undefined)
  }
}
