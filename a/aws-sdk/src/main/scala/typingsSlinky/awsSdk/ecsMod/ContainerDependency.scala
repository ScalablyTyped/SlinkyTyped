package typingsSlinky.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerDependency extends StObject {
  
  /**
    * The dependency condition of the container. The following are the available conditions and their behavior:    START - This condition emulates the behavior of links and volumes today. It validates that a dependent container is started before permitting other containers to start.    COMPLETE - This condition validates that a dependent container runs to completion (exits) before permitting other containers to start. This can be useful for nonessential containers that run a script and then exit. This condition cannot be set on an essential container.    SUCCESS - This condition is the same as COMPLETE, but it also requires that the container exits with a zero status. This condition cannot be set on an essential container.    HEALTHY - This condition validates that the dependent container passes its Docker health check before permitting other containers to start. This requires that the dependent container has health checks configured. This condition is confirmed only at task startup.  
    */
  var condition: ContainerCondition = js.native
  
  /**
    * The name of a container.
    */
  var containerName: String = js.native
}
object ContainerDependency {
  
  @scala.inline
  def apply(condition: ContainerCondition, containerName: String): ContainerDependency = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], containerName = containerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerDependency]
  }
  
  @scala.inline
  implicit class ContainerDependencyMutableBuilder[Self <: ContainerDependency] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: ContainerCondition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
  }
}
