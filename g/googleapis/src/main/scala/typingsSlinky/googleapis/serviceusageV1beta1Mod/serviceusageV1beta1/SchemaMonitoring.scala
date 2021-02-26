package typingsSlinky.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Monitoring configuration of the service.  The example below shows how to
  * configure monitored resources and metrics for monitoring. In the example, a
  * monitored resource and two metrics are defined. The
  * `library.googleapis.com/book/returned_count` metric is sent to both
  * producer and consumer projects, whereas the
  * `library.googleapis.com/book/overdue_count` metric is only sent to the
  * consumer project.      monitored_resources:     - type:
  * library.googleapis.com/branch       labels:       - key: /city description:
  * The city where the library branch is located in.       - key: /name
  * description: The name of the branch.     metrics:     - name:
  * library.googleapis.com/book/returned_count       metric_kind: DELTA
  * value_type: INT64       labels:       - key: /customer_id     - name:
  * library.googleapis.com/book/overdue_count       metric_kind: GAUGE
  * value_type: INT64       labels:       - key: /customer_id     monitoring:
  * producer_destinations:       - monitored_resource:
  * library.googleapis.com/branch         metrics:         -
  * library.googleapis.com/book/returned_count       consumer_destinations: -
  * monitored_resource: library.googleapis.com/branch         metrics: -
  * library.googleapis.com/book/returned_count         -
  * library.googleapis.com/book/overdue_count
  */
@js.native
trait SchemaMonitoring extends StObject {
  
  /**
    * Monitoring configurations for sending metrics to the consumer project.
    * There can be multiple consumer destinations. A monitored resouce type may
    * appear in multiple monitoring destinations if different aggregations are
    * needed for different sets of metrics associated with that monitored
    * resource type. A monitored resource and metric pair may only be used once
    * in the Monitoring configuration.
    */
  var consumerDestinations: js.UndefOr[js.Array[SchemaMonitoringDestination]] = js.native
  
  /**
    * Monitoring configurations for sending metrics to the producer project.
    * There can be multiple producer destinations. A monitored resouce type may
    * appear in multiple monitoring destinations if different aggregations are
    * needed for different sets of metrics associated with that monitored
    * resource type. A monitored resource and metric pair may only be used once
    * in the Monitoring configuration.
    */
  var producerDestinations: js.UndefOr[js.Array[SchemaMonitoringDestination]] = js.native
}
object SchemaMonitoring {
  
  @scala.inline
  def apply(): SchemaMonitoring = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMonitoring]
  }
  
  @scala.inline
  implicit class SchemaMonitoringMutableBuilder[Self <: SchemaMonitoring] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsumerDestinations(value: js.Array[SchemaMonitoringDestination]): Self = StObject.set(x, "consumerDestinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumerDestinationsUndefined: Self = StObject.set(x, "consumerDestinations", js.undefined)
    
    @scala.inline
    def setConsumerDestinationsVarargs(value: SchemaMonitoringDestination*): Self = StObject.set(x, "consumerDestinations", js.Array(value :_*))
    
    @scala.inline
    def setProducerDestinations(value: js.Array[SchemaMonitoringDestination]): Self = StObject.set(x, "producerDestinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProducerDestinationsUndefined: Self = StObject.set(x, "producerDestinations", js.undefined)
    
    @scala.inline
    def setProducerDestinationsVarargs(value: SchemaMonitoringDestination*): Self = StObject.set(x, "producerDestinations", js.Array(value :_*))
  }
}
