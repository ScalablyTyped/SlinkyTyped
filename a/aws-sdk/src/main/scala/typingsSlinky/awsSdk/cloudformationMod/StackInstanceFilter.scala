package typingsSlinky.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackInstanceFilter extends StObject {
  
  /**
    * The type of filter to apply.
    */
  var Name: js.UndefOr[StackInstanceFilterName] = js.native
  
  /**
    * The status to filter by.
    */
  var Values: js.UndefOr[StackInstanceFilterValues] = js.native
}
object StackInstanceFilter {
  
  @scala.inline
  def apply(): StackInstanceFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackInstanceFilter]
  }
  
  @scala.inline
  implicit class StackInstanceFilterMutableBuilder[Self <: StackInstanceFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: StackInstanceFilterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setValues(value: StackInstanceFilterValues): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
  }
}
