package typingsSlinky.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePackagesFilter extends StObject {
  
  /**
    * Any field from PackageDetails.
    */
  var Name: js.UndefOr[DescribePackagesFilterName] = js.native
  
  /**
    * A list of values for the specified field.
    */
  var Value: js.UndefOr[DescribePackagesFilterValues] = js.native
}
object DescribePackagesFilter {
  
  @scala.inline
  def apply(): DescribePackagesFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePackagesFilter]
  }
  
  @scala.inline
  implicit class DescribePackagesFilterMutableBuilder[Self <: DescribePackagesFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: DescribePackagesFilterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setValue(value: DescribePackagesFilterValues): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: DescribePackagesFilterValue*): Self = StObject.set(x, "Value", js.Array(value :_*))
  }
}
