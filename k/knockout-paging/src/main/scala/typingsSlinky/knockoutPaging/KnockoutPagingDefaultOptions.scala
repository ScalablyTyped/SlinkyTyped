package typingsSlinky.knockoutPaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutPagingDefaultOptions extends StObject {
  
  var pageNumber: Double = js.native
  
  var pageSize: Double = js.native
}
object KnockoutPagingDefaultOptions {
  
  @scala.inline
  def apply(pageNumber: Double, pageSize: Double): KnockoutPagingDefaultOptions = {
    val __obj = js.Dynamic.literal(pageNumber = pageNumber.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutPagingDefaultOptions]
  }
  
  @scala.inline
  implicit class KnockoutPagingDefaultOptionsMutableBuilder[Self <: KnockoutPagingDefaultOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
  }
}
