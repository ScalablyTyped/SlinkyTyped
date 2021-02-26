package typingsSlinky.protobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEnum extends AnyNestedObject {
  
  /** Enum options */
  var options: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /** Enum values */
  var values: StringDictionary[Double] = js.native
}
object IEnum {
  
  @scala.inline
  def apply(values: StringDictionary[Double]): IEnum = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEnum]
  }
  
  @scala.inline
  implicit class IEnumMutableBuilder[Self <: IEnum] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: StringDictionary[js.Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setValues(value: StringDictionary[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
