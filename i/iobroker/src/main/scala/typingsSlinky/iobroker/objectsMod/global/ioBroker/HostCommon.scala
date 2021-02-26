package typingsSlinky.iobroker.objectsMod.global.ioBroker

import typingsSlinky.iobroker.iobrokerStrings.JavascriptSlashNodeDotjs
import typingsSlinky.iobroker.iobrokerStrings.`js-controller`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostCommon extends ObjectCommon {
  
  /** An array of IP addresses this host exposes */
  var address: js.Array[String] = js.native
  
  // e.g. 1.2.3 (following semver)
  /** The command line of the executable */
  var cmd: String = js.native
  
  // Make it possible to narrow the object type using the custom property
  var custom: js.UndefOr[scala.Nothing] = js.native
  
  var hostname: String = js.native
  
  var installedVersion: String = js.native
  
  /** The display name of this host */
  @JSName("name")
  var name_HostCommon: String = js.native
  
  var platform: JavascriptSlashNodeDotjs = js.native
  
  var title: String = js.native
  
  // IPv4 or IPv6
  var `type`: `js-controller` = js.native
}
object HostCommon {
  
  @scala.inline
  def apply(
    address: js.Array[String],
    cmd: String,
    hostname: String,
    installedVersion: String,
    name: String,
    platform: JavascriptSlashNodeDotjs,
    title: String,
    `type`: `js-controller`
  ): HostCommon = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], cmd = cmd.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], installedVersion = installedVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostCommon]
  }
  
  @scala.inline
  implicit class HostCommonMutableBuilder[Self <: HostCommon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: js.Array[String]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressVarargs(value: String*): Self = StObject.set(x, "address", js.Array(value :_*))
    
    @scala.inline
    def setCmd(value: String): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstalledVersion(value: String): Self = StObject.set(x, "installedVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: JavascriptSlashNodeDotjs): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `js-controller`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
