package typingsSlinky.maximMazurokGapiClientComposer.gapi.client.composer

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Environment extends js.Object {
  
  /** Configuration parameters for this environment. */
  var config: js.UndefOr[EnvironmentConfig] = js.native
  
  /** Output only. The time at which this environment was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * Optional. User-defined labels for this environment. The labels map can contain no more than 64 entries. Entries of the labels map are UTF8 strings that comply with the following
    * restrictions: * Keys must conform to regexp: \p{Ll}\p{Lo}{0,62} * Values must conform to regexp: [\p{Ll}\p{Lo}\p{N}_-]{0,63} * Both keys and values are additionally constrained to
    * be <= 128 bytes in size.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typingsSlinky.maximMazurokGapiClientComposer.maximMazurokGapiClientComposerStrings.Environment with TopLevel[js.Any]
  ] = js.native
  
  /**
    * The resource name of the environment, in the form: "projects/{projectId}/locations/{locationId}/environments/{environmentId}" EnvironmentId must start with a lowercase letter
    * followed by up to 63 lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
    */
  var name: js.UndefOr[String] = js.native
  
  /** The current state of the environment. */
  var state: js.UndefOr[String] = js.native
  
  /** Output only. The time at which this environment was last modified. */
  var updateTime: js.UndefOr[String] = js.native
  
  /** Output only. The UUID (Universally Unique IDentifier) associated with this environment. This value is generated when the environment is created. */
  var uuid: js.UndefOr[String] = js.native
}
object Environment {
  
  @scala.inline
  def apply(): Environment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Environment]
  }
  
  @scala.inline
  implicit class EnvironmentOps[Self <: Environment] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: EnvironmentConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typingsSlinky.maximMazurokGapiClientComposer.maximMazurokGapiClientComposerStrings.Environment with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
    
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUuid: Self = this.set("uuid", js.undefined)
  }
}
