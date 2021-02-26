package typingsSlinky.pulumiAws.outputMod.ecs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskDefinitionVolumeDockerVolumeConfiguration extends StObject {
  
  /**
    * If this value is `true`, the Docker volume is created if it does not already exist. *Note*: This field is only used if the scope is `shared`.
    */
  var autoprovision: js.UndefOr[Boolean] = js.native
  
  /**
    * The Docker volume driver to use. The driver value must match the driver name provided by Docker because it is used for task placement.
    */
  var driver: js.UndefOr[String] = js.native
  
  /**
    * A map of Docker driver specific options.
    */
  var driverOpts: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * A map of custom metadata to add to your Docker volume.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The scope for the Docker volume, which determines its lifecycle, either `task` or `shared`.  Docker volumes that are scoped to a `task` are automatically provisioned when the task starts and destroyed when the task stops. Docker volumes that are `scoped` as shared persist after the task stops.
    */
  var scope: String = js.native
}
object TaskDefinitionVolumeDockerVolumeConfiguration {
  
  @scala.inline
  def apply(scope: String): TaskDefinitionVolumeDockerVolumeConfiguration = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskDefinitionVolumeDockerVolumeConfiguration]
  }
  
  @scala.inline
  implicit class TaskDefinitionVolumeDockerVolumeConfigurationMutableBuilder[Self <: TaskDefinitionVolumeDockerVolumeConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoprovision(value: Boolean): Self = StObject.set(x, "autoprovision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoprovisionUndefined: Self = StObject.set(x, "autoprovision", js.undefined)
    
    @scala.inline
    def setDriver(value: String): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriverOpts(value: StringDictionary[String]): Self = StObject.set(x, "driverOpts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriverOptsUndefined: Self = StObject.set(x, "driverOpts", js.undefined)
    
    @scala.inline
    def setDriverUndefined: Self = StObject.set(x, "driver", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
  }
}
