package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConformancePackInputParameter extends js.Object {
  /**
    * One part of a key-value pair.
    */
  var ParameterName: typingsSlinky.awsSdk.configserviceMod.ParameterName = js.native
  /**
    * Another part of the key-value pair. 
    */
  var ParameterValue: typingsSlinky.awsSdk.configserviceMod.ParameterValue = js.native
}

object ConformancePackInputParameter {
  @scala.inline
  def apply(ParameterName: ParameterName, ParameterValue: ParameterValue): ConformancePackInputParameter = {
    val __obj = js.Dynamic.literal(ParameterName = ParameterName.asInstanceOf[js.Any], ParameterValue = ParameterValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConformancePackInputParameter]
  }
}

