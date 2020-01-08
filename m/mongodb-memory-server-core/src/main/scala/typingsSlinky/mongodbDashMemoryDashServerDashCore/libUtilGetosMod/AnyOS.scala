package typingsSlinky.mongodbDashMemoryDashServerDashCore.libUtilGetosMod

import typingsSlinky.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreStrings.aix
import typingsSlinky.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreStrings.android
import typingsSlinky.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreStrings.cygwin
import typingsSlinky.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreStrings.darwin
import typingsSlinky.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreStrings.freebsd
import typingsSlinky.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreStrings.linux
import typingsSlinky.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreStrings.openbsd
import typingsSlinky.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreStrings.sunos
import typingsSlinky.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreStrings.win32
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mongodbDashMemoryDashServerDashCore.libUtilGetosMod.OtherOS
  - typings.mongodbDashMemoryDashServerDashCore.libUtilGetosMod.LinuxOS
*/
trait AnyOS extends js.Object

object AnyOS {
  @scala.inline
  def OtherOS(os: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin | String): AnyOS = {
    val __obj = js.Dynamic.literal(os = os.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnyOS]
  }
  @scala.inline
  def LinuxOS(dist: String, os: linux, release: String, codename: String = null): AnyOS = {
    val __obj = js.Dynamic.literal(dist = dist.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
    if (codename != null) __obj.updateDynamic("codename")(codename.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyOS]
  }
}

