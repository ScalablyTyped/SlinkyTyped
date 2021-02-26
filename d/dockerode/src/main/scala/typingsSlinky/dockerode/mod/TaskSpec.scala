package typingsSlinky.dockerode.mod

import typingsSlinky.dockerode.anon.ContainerID
import typingsSlinky.dockerode.dockerodeStrings.attachment
import typingsSlinky.dockerode.dockerodeStrings.plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.dockerode.mod.ContainerTaskSpec
  - typingsSlinky.dockerode.mod.PluginTaskSpec
  - typingsSlinky.dockerode.mod.NetworkAttachmentTaskSpec
*/
trait TaskSpec extends StObject
object TaskSpec {
  
  @scala.inline
  def ContainerTaskSpec(): typingsSlinky.dockerode.mod.ContainerTaskSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsSlinky.dockerode.mod.ContainerTaskSpec]
  }
  
  @scala.inline
  def NetworkAttachmentTaskSpec(NetworkAttachmentSpec: ContainerID, Runtime: attachment): typingsSlinky.dockerode.mod.NetworkAttachmentTaskSpec = {
    val __obj = js.Dynamic.literal(NetworkAttachmentSpec = NetworkAttachmentSpec.asInstanceOf[js.Any], Runtime = Runtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.dockerode.mod.NetworkAttachmentTaskSpec]
  }
  
  @scala.inline
  def PluginTaskSpec(PluginSpec: PluginSpec, Runtime: plugin): typingsSlinky.dockerode.mod.PluginTaskSpec = {
    val __obj = js.Dynamic.literal(PluginSpec = PluginSpec.asInstanceOf[js.Any], Runtime = Runtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.dockerode.mod.PluginTaskSpec]
  }
}
