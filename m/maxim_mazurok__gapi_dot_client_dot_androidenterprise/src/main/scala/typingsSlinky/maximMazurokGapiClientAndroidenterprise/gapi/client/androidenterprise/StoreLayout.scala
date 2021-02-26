package typingsSlinky.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoreLayout extends StObject {
  
  /**
    * The ID of the store page to be used as the homepage. The homepage is the first page shown in the managed Google Play Store. Not specifying a homepage is equivalent to setting the
    * store layout type to "basic".
    */
  var homepageId: js.UndefOr[String] = js.native
  
  /**
    * The store layout type. By default, this value is set to "basic" if the homepageId field is not set, and to "custom" otherwise. If set to "basic", the layout will consist of all
    * approved apps that have been whitelisted for the user.
    */
  var storeLayoutType: js.UndefOr[String] = js.native
}
object StoreLayout {
  
  @scala.inline
  def apply(): StoreLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoreLayout]
  }
  
  @scala.inline
  implicit class StoreLayoutMutableBuilder[Self <: StoreLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHomepageId(value: String): Self = StObject.set(x, "homepageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomepageIdUndefined: Self = StObject.set(x, "homepageId", js.undefined)
    
    @scala.inline
    def setStoreLayoutType(value: String): Self = StObject.set(x, "storeLayoutType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreLayoutTypeUndefined: Self = StObject.set(x, "storeLayoutType", js.undefined)
  }
}
