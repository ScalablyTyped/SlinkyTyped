package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricDefinition extends StObject {
  
  /**
    * The name of the metric.
    */
  var Name: MetricName = js.native
  
  /**
    * A regular expression that searches the output of a training job and gets the value of the metric. For more information about using regular expressions to define metrics, see Defining Objective Metrics.
    */
  var Regex: MetricRegex = js.native
}
object MetricDefinition {
  
  @scala.inline
  def apply(Name: MetricName, Regex: MetricRegex): MetricDefinition = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Regex = Regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricDefinition]
  }
  
  @scala.inline
  implicit class MetricDefinitionMutableBuilder[Self <: MetricDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: MetricName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegex(value: MetricRegex): Self = StObject.set(x, "Regex", value.asInstanceOf[js.Any])
  }
}
