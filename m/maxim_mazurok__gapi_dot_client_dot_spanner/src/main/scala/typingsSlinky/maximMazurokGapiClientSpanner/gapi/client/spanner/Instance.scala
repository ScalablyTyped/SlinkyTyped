package typingsSlinky.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instance extends js.Object {
  
  /** Required. The name of the instance's configuration. Values are of the form `projects//instanceConfigs/`. See also InstanceConfig and ListInstanceConfigs. */
  var config: js.UndefOr[String] = js.native
  
  /** Required. The descriptive name for this instance as it appears in UIs. Must be unique per project and between 4 and 30 characters in length. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Deprecated. This field is not populated. */
  var endpointUris: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Cloud Labels are a flexible and lightweight mechanism for organizing cloud resources into groups that reflect a customer's organizational needs and deployment strategies. Cloud
    * Labels can be used to filter collections of resources. They can be used to control how resource metrics are aggregated. And they can be used as arguments to policy management rules
    * (e.g. route, firewall, load balancing, etc.). * Label keys must be between 1 and 63 characters long and must conform to the following regular expression:
    * `[a-z]([-a-z0-9]*[a-z0-9])?`. * Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`. * No more than 64
    * labels can be associated with a given resource. See https://goo.gl/xmQnxf for more information on and examples of labels. If you plan to use labels in your own code, please note
    * that additional characters may be allowed in the future. And so you are advised to use an internal label representation, such as JSON, which doesn't rely upon specific characters
    * being disallowed. For example, representing labels as the string: name + "_" + value would prove problematic if we were to allow "_" in a future release.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typingsSlinky.maximMazurokGapiClientSpanner.maximMazurokGapiClientSpannerStrings.Instance with TopLevel[js.Any]
  ] = js.native
  
  /**
    * Required. A unique identifier for the instance, which cannot be changed after the instance is created. Values are of the form `projects//instances/a-z*[a-z0-9]`. The final segment
    * of the name must be between 2 and 64 characters in length.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The number of nodes allocated to this instance. This may be zero in API responses for instances that are not yet in state `READY`. See [the
    * documentation](https://cloud.google.com/spanner/docs/instances#node_count) for more information about nodes.
    */
  var nodeCount: js.UndefOr[Double] = js.native
  
  /**
    * Output only. The current instance state. For CreateInstance, the state must be either omitted or set to `CREATING`. For UpdateInstance, the state must be either omitted or set to
    * `READY`.
    */
  var state: js.UndefOr[String] = js.native
}
object Instance {
  
  @scala.inline
  def apply(): Instance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Instance]
  }
  
  @scala.inline
  implicit class InstanceOps[Self <: Instance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConfig(value: String): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setEndpointUrisVarargs(value: String*): Self = this.set("endpointUris", js.Array(value :_*))
    
    @scala.inline
    def setEndpointUris(value: js.Array[String]): Self = this.set("endpointUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointUris: Self = this.set("endpointUris", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typingsSlinky.maximMazurokGapiClientSpanner.maximMazurokGapiClientSpannerStrings.Instance with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNodeCount(value: Double): Self = this.set("nodeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeCount: Self = this.set("nodeCount", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
