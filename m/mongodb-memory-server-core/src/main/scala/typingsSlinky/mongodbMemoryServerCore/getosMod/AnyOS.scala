package typingsSlinky.mongodbMemoryServerCore.getosMod

import typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.aix
import typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.android
import typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.cygwin
import typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.darwin
import typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.freebsd
import typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.linux
import typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.openbsd
import typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.sunos
import typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.win32
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mongodbMemoryServerCore.getosMod.OtherOS
  - typingsSlinky.mongodbMemoryServerCore.getosMod.LinuxOS
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

