package typingsSlinky.mongodbDashMemoryDashServerDashCore.libUtilGetosMod

import typingsSlinky.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreStrings.aix
import typingsSlinky.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreStrings.android
import typingsSlinky.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreStrings.cygwin
import typingsSlinky.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreStrings.darwin
import typingsSlinky.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreStrings.freebsd
import typingsSlinky.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreStrings.openbsd
import typingsSlinky.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreStrings.sunos
import typingsSlinky.mongodbDashMemoryDashServerDashCore.mongodbDashMemoryDashServerDashCoreStrings.win32
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OtherOS extends AnyOS {
  var os: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin | String
}

object OtherOS {
  @scala.inline
  def apply(os: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin | String): OtherOS = {
    val __obj = js.Dynamic.literal(os = os.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OtherOS]
  }
}

