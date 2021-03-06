package typingsSlinky.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "WorkflowInstance")
@js.native
class WorkflowInstance protected () extends StObject {
  def this(platform: js.Any, `object`: js.Any) = this()
  
  def addResource(resource: js.Any): js.Any = js.native
  
  def base(): Unit = js.native
  
  def getType(): js.Any = js.native
  
  def getUri(): js.Any = js.native
  
  def loadResource(id: js.Any, callback: js.Any): js.Any = js.native
  
  def loadResourceList(callback: js.Any): js.Any = js.native
  
  def removeAllResources(): js.Any = js.native
  
  def removeResource(resourceOrResourceId: js.Any): js.Any = js.native
  
  def resume(): js.Any = js.native
  
  def start(data: js.Any): js.Any = js.native
  
  def suspend(): js.Any = js.native
  
  def terminate(): js.Any = js.native
  
  def upgradeModel(newModel: js.Any, newModelVersion: js.Any): js.Any = js.native
}
object WorkflowInstance {
  
  /* static member */
  @JSImport("gitana", "WorkflowInstance.extend")
  @js.native
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "WorkflowInstance.forEach")
  @js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  /* static member */
  @JSImport("gitana", "WorkflowInstance.implement")
  @js.native
  def implement(args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "WorkflowInstance.toString")
  @js.native
  def toString_(): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "WorkflowInstance.valueOf")
  @js.native
  def valueOf_(`type`: js.Any): js.Any = js.native
}
