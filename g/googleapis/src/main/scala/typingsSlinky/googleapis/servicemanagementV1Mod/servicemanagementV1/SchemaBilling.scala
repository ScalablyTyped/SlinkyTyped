package typingsSlinky.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Billing related configuration of the service.  The following example shows
  * how to configure monitored resources and metrics for billing:
  * monitored_resources:     - type: library.googleapis.com/branch labels: -
  * key: /city         description: The city where the library branch is
  * located in.       - key: /name         description: The name of the branch.
  * metrics:     - name: library.googleapis.com/book/borrowed_count
  * metric_kind: DELTA       value_type: INT64     billing:
  * consumer_destinations:       - monitored_resource:
  * library.googleapis.com/branch         metrics:         -
  * library.googleapis.com/book/borrowed_count
  */
@js.native
trait SchemaBilling extends StObject {
  
  /**
    * Billing configurations for sending metrics to the consumer project. There
    * can be multiple consumer destinations per service, each one must have a
    * different monitored resource type. A metric can be used in at most one
    * consumer destination.
    */
  var consumerDestinations: js.UndefOr[js.Array[SchemaBillingDestination]] = js.native
}
object SchemaBilling {
  
  @scala.inline
  def apply(): SchemaBilling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBilling]
  }
  
  @scala.inline
  implicit class SchemaBillingMutableBuilder[Self <: SchemaBilling] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsumerDestinations(value: js.Array[SchemaBillingDestination]): Self = StObject.set(x, "consumerDestinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumerDestinationsUndefined: Self = StObject.set(x, "consumerDestinations", js.undefined)
    
    @scala.inline
    def setConsumerDestinationsVarargs(value: SchemaBillingDestination*): Self = StObject.set(x, "consumerDestinations", js.Array(value :_*))
  }
}
