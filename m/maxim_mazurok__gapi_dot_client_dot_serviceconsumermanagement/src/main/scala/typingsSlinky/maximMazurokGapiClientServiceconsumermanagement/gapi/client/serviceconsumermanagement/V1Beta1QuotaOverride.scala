package typingsSlinky.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait V1Beta1QuotaOverride extends js.Object {
  
  /** The resource name of the ancestor that requested the override. For example: "organizations/12345" or "folders/67890". Used by admin overrides only. */
  var adminOverrideAncestor: js.UndefOr[String] = js.native
  
  /**
    * If this map is nonempty, then this override applies only to specific values for dimensions defined in the limit unit. For example, an override on a limit with the unit
    * 1/{project}/{region} could contain an entry with the key "region" and the value "us-east-1"; the override is only applied to quota consumed in that region. This map has the
    * following restrictions: * Keys that are not defined in the limit's unit are not valid keys. Any string appearing in {brackets} in the unit (besides {project} or {user}) is a defined
    * key. * "project" is not a valid key; the project is already specified in the parent resource name. * "user" is not a valid key; the API does not support quota overrides that apply
    * only to a specific user. * If "region" appears as a key, its value must be a valid Cloud region. * If "zone" appears as a key, its value must be a valid Cloud zone. * If any valid
    * key other than "region" or "zone" appears in the map, then all valid keys other than "region" or "zone" must also appear in the map.
    */
  var dimensions: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typingsSlinky.maximMazurokGapiClientServiceconsumermanagement.maximMazurokGapiClientServiceconsumermanagementStrings.V1Beta1QuotaOverride with TopLevel[js.Any]
  ] = js.native
  
  /** The name of the metric to which this override applies. An example name would be: `compute.googleapis.com/cpus` */
  var metric: js.UndefOr[String] = js.native
  
  /**
    * The resource name of the producer override. An example name would be:
    * `services/compute.googleapis.com/projects/123/consumerQuotaMetrics/compute.googleapis.com%2Fcpus/limits/%2Fproject%2Fregion/producerOverrides/4a3f2c1d`
    */
  var name: js.UndefOr[String] = js.native
  
  /** The overriding quota limit value. Can be any nonnegative integer, or -1 (unlimited quota). */
  var overrideValue: js.UndefOr[String] = js.native
  
  /**
    * The limit unit of the limit to which this override applies. An example unit would be: `1/{project}/{region}` Note that `{project}` and `{region}` are not placeholders in this
    * example; the literal characters `{` and `}` occur in the string.
    */
  var unit: js.UndefOr[String] = js.native
}
object V1Beta1QuotaOverride {
  
  @scala.inline
  def apply(): V1Beta1QuotaOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[V1Beta1QuotaOverride]
  }
  
  @scala.inline
  implicit class V1Beta1QuotaOverrideOps[Self <: V1Beta1QuotaOverride] (val x: Self) extends AnyVal {
    
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
    def setAdminOverrideAncestor(value: String): Self = this.set("adminOverrideAncestor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdminOverrideAncestor: Self = this.set("adminOverrideAncestor", js.undefined)
    
    @scala.inline
    def setDimensions(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typingsSlinky.maximMazurokGapiClientServiceconsumermanagement.maximMazurokGapiClientServiceconsumermanagementStrings.V1Beta1QuotaOverride with TopLevel[js.Any]
    ): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensions: Self = this.set("dimensions", js.undefined)
    
    @scala.inline
    def setMetric(value: String): Self = this.set("metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetric: Self = this.set("metric", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOverrideValue(value: String): Self = this.set("overrideValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrideValue: Self = this.set("overrideValue", js.undefined)
    
    @scala.inline
    def setUnit(value: String): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
}
