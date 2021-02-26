package typingsSlinky.breeze.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowConcurrentSaves extends StObject {
  
  var allowConcurrentSaves: js.UndefOr[Boolean] = js.native
  
  var dataService: js.UndefOr[typingsSlinky.breeze.breeze.DataService] = js.native
  
  var resourceName: js.UndefOr[String] = js.native
  
  var tag: js.UndefOr[js.Any] = js.native
}
object AllowConcurrentSaves {
  
  @scala.inline
  def apply(): AllowConcurrentSaves = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowConcurrentSaves]
  }
  
  @scala.inline
  implicit class AllowConcurrentSavesMutableBuilder[Self <: AllowConcurrentSaves] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowConcurrentSaves(value: Boolean): Self = StObject.set(x, "allowConcurrentSaves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowConcurrentSavesUndefined: Self = StObject.set(x, "allowConcurrentSaves", js.undefined)
    
    @scala.inline
    def setDataService(value: typingsSlinky.breeze.breeze.DataService): Self = StObject.set(x, "dataService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataServiceUndefined: Self = StObject.set(x, "dataService", js.undefined)
    
    @scala.inline
    def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    @scala.inline
    def setTag(value: js.Any): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
