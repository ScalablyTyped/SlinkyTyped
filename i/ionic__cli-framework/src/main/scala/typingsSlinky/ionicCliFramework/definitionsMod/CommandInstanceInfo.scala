package typingsSlinky.ionicCliFramework.definitionsMod

import typingsSlinky.node.processMod.global.NodeJS.ProcessEnv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandInstanceInfo[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] extends StObject {
  
  var env: ProcessEnv = js.native
  
  var executor: IExecutor[C, N, M, I, O] = js.native
  
  var location: NamespaceLocateResult[C, N, M, I, O] = js.native
}
object CommandInstanceInfo {
  
  @scala.inline
  def apply[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](
    env: ProcessEnv,
    executor: IExecutor[C, N, M, I, O],
    location: NamespaceLocateResult[C, N, M, I, O]
  ): CommandInstanceInfo[C, N, M, I, O] = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any], executor = executor.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandInstanceInfo[C, N, M, I, O]]
  }
  
  @scala.inline
  implicit class CommandInstanceInfoMutableBuilder[Self <: CommandInstanceInfo[_, _, _, _, _], C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] (val x: Self with (CommandInstanceInfo[C, N, M, I, O])) extends AnyVal {
    
    @scala.inline
    def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutor(value: IExecutor[C, N, M, I, O]): Self = StObject.set(x, "executor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: NamespaceLocateResult[C, N, M, I, O]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
  }
}
