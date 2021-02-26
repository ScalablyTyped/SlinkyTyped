package typingsSlinky.awsSdk.supportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Service extends StObject {
  
  /**
    * A list of categories that describe the type of support issue a case describes. Categories consist of a category name and a category code. Category names and codes are passed to AWS Support when you call CreateCase.
    */
  var categories: js.UndefOr[CategoryList] = js.native
  
  /**
    * The code for an AWS service returned by the DescribeServices response. The name element contains the corresponding friendly name.
    */
  var code: js.UndefOr[ServiceCode] = js.native
  
  /**
    * The friendly name for an AWS service. The code element contains the corresponding code.
    */
  var name: js.UndefOr[ServiceName] = js.native
}
object Service {
  
  @scala.inline
  def apply(): Service = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Service]
  }
  
  @scala.inline
  implicit class ServiceMutableBuilder[Self <: Service] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategories(value: CategoryList): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    @scala.inline
    def setCategoriesVarargs(value: Category*): Self = StObject.set(x, "categories", js.Array(value :_*))
    
    @scala.inline
    def setCode(value: ServiceCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setName(value: ServiceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
