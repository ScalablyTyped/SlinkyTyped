package typingsSlinky.pulumiCloud.serviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pulumiCloud.serviceMod.SharedVolume
  - typingsSlinky.pulumiCloud.serviceMod.HostPathVolume
*/
trait Volume extends StObject
object Volume {
  
  @scala.inline
  def HostPathVolume(kind: typingsSlinky.pulumiCloud.pulumiCloudStrings.HostPathVolume, path: String): typingsSlinky.pulumiCloud.serviceMod.HostPathVolume = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.pulumiCloud.serviceMod.HostPathVolume]
  }
  
  @scala.inline
  def SharedVolume(kind: typingsSlinky.pulumiCloud.pulumiCloudStrings.SharedVolume, name: String): typingsSlinky.pulumiCloud.serviceMod.SharedVolume = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.pulumiCloud.serviceMod.SharedVolume]
  }
}
