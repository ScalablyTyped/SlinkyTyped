package typingsSlinky.dockerode.mod

import typingsSlinky.dockerode.anon.ContainerID
import typingsSlinky.dockerode.dockerodeStrings.attachment
import typingsSlinky.dockerode.dockerodeStrings.plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.dockerode.mod.ContainerTaskSpec
  - typingsSlinky.dockerode.mod.PluginTaskSpec
  - typingsSlinky.dockerode.mod.NetworkAttachmentTaskSpec
*/
trait TaskSpec extends js.Object
object TaskSpec {
  
  @scala.inline
  def ContainerTaskSpec(): TaskSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskSpec]
  }
  
  @scala.inline
  def PluginTaskSpec(PluginSpec: PluginSpec, Runtime: plugin): TaskSpec = {
    val __obj = js.Dynamic.literal(PluginSpec = PluginSpec.asInstanceOf[js.Any], Runtime = Runtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskSpec]
  }
  
  @scala.inline
  def NetworkAttachmentTaskSpec(NetworkAttachmentSpec: ContainerID, Runtime: attachment): TaskSpec = {
    val __obj = js.Dynamic.literal(NetworkAttachmentSpec = NetworkAttachmentSpec.asInstanceOf[js.Any], Runtime = Runtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskSpec]
  }
}
