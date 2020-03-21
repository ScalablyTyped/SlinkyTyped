package typingsSlinky.mongodbMemoryServerCore.getosMod

import typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.aix
import typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.android
import typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.cygwin
import typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.darwin
import typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.freebsd
import typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.openbsd
import typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.sunos
import typingsSlinky.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.win32
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

