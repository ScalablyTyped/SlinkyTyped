package typingsSlinky.awsSdk.kinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputConfiguration extends StObject {
  
  /**
    * Input source ID. You can get this ID by calling the DescribeApplication operation.
    */
  var Id: typingsSlinky.awsSdk.kinesisanalyticsMod.Id = js.native
  
  /**
    * Point at which you want the application to start processing records from the streaming source.
    */
  var InputStartingPositionConfiguration: typingsSlinky.awsSdk.kinesisanalyticsMod.InputStartingPositionConfiguration = js.native
}
object InputConfiguration {
  
  @scala.inline
  def apply(Id: Id, InputStartingPositionConfiguration: InputStartingPositionConfiguration): InputConfiguration = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], InputStartingPositionConfiguration = InputStartingPositionConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputConfiguration]
  }
  
  @scala.inline
  implicit class InputConfigurationMutableBuilder[Self <: InputConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputStartingPositionConfiguration(value: InputStartingPositionConfiguration): Self = StObject.set(x, "InputStartingPositionConfiguration", value.asInstanceOf[js.Any])
  }
}
