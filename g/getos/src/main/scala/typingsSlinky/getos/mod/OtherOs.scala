package typingsSlinky.getos.mod

import typingsSlinky.getos.getosStrings.aix
import typingsSlinky.getos.getosStrings.android
import typingsSlinky.getos.getosStrings.cygwin
import typingsSlinky.getos.getosStrings.darwin
import typingsSlinky.getos.getosStrings.freebsd
import typingsSlinky.getos.getosStrings.openbsd
import typingsSlinky.getos.getosStrings.sunos
import typingsSlinky.getos.getosStrings.win32
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OtherOs extends Os {
  var os: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin
}

object OtherOs {
  @scala.inline
  def apply(os: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin): OtherOs = {
    val __obj = js.Dynamic.literal(os = os.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OtherOs]
  }
}

