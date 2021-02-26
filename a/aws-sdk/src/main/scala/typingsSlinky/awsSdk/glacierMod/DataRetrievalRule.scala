package typingsSlinky.awsSdk.glacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataRetrievalRule extends StObject {
  
  /**
    * The maximum number of bytes that can be retrieved in an hour. This field is required only if the value of the Strategy field is BytesPerHour. Your PUT operation will be rejected if the Strategy field is not set to BytesPerHour and you set this field.
    */
  var BytesPerHour: js.UndefOr[NullableLong] = js.native
  
  /**
    * The type of data retrieval policy to set. Valid values: BytesPerHour|FreeTier|None
    */
  var Strategy: js.UndefOr[String] = js.native
}
object DataRetrievalRule {
  
  @scala.inline
  def apply(): DataRetrievalRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataRetrievalRule]
  }
  
  @scala.inline
  implicit class DataRetrievalRuleMutableBuilder[Self <: DataRetrievalRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytesPerHour(value: NullableLong): Self = StObject.set(x, "BytesPerHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesPerHourUndefined: Self = StObject.set(x, "BytesPerHour", js.undefined)
    
    @scala.inline
    def setStrategy(value: String): Self = StObject.set(x, "Strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrategyUndefined: Self = StObject.set(x, "Strategy", js.undefined)
  }
}
