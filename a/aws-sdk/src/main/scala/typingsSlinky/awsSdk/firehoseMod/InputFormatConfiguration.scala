package typingsSlinky.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputFormatConfiguration extends StObject {
  
  /**
    * Specifies which deserializer to use. You can choose either the Apache Hive JSON SerDe or the OpenX JSON SerDe. If both are non-null, the server rejects the request.
    */
  var Deserializer: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.Deserializer] = js.native
}
object InputFormatConfiguration {
  
  @scala.inline
  def apply(): InputFormatConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputFormatConfiguration]
  }
  
  @scala.inline
  implicit class InputFormatConfigurationMutableBuilder[Self <: InputFormatConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeserializer(value: Deserializer): Self = StObject.set(x, "Deserializer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeserializerUndefined: Self = StObject.set(x, "Deserializer", js.undefined)
  }
}
