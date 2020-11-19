package typingsSlinky.pulumiAws.outputMod.ecs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskDefinitionProxyConfiguration extends js.Object {
  
  /**
    * The name of the container that will serve as the App Mesh proxy.
    */
  var containerName: String = js.native
  
  /**
    * The set of network configuration parameters to provide the Container Network Interface (CNI) plugin, specified a key-value mapping.
    */
  var properties: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The proxy type. The default value is `APPMESH`. The only supported value is `APPMESH`.
    */
  var `type`: js.UndefOr[String] = js.native
}
object TaskDefinitionProxyConfiguration {
  
  @scala.inline
  def apply(containerName: String): TaskDefinitionProxyConfiguration = {
    val __obj = js.Dynamic.literal(containerName = containerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskDefinitionProxyConfiguration]
  }
  
  @scala.inline
  implicit class TaskDefinitionProxyConfigurationOps[Self <: TaskDefinitionProxyConfiguration] (val x: Self) extends AnyVal {
    
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
    def setContainerName(value: String): Self = this.set("containerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: StringDictionary[String]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
