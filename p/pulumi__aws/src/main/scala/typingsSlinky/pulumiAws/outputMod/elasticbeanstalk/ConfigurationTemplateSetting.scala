package typingsSlinky.pulumiAws.outputMod.elasticbeanstalk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigurationTemplateSetting extends js.Object {
  
  /**
    * A unique name for this Template.
    */
  var name: String = js.native
  
  var namespace: String = js.native
  
  var resource: js.UndefOr[String] = js.native
  
  var value: String = js.native
}
object ConfigurationTemplateSetting {
  
  @scala.inline
  def apply(name: String, namespace: String, value: String): ConfigurationTemplateSetting = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationTemplateSetting]
  }
  
  @scala.inline
  implicit class ConfigurationTemplateSettingOps[Self <: ConfigurationTemplateSetting] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
  }
}
