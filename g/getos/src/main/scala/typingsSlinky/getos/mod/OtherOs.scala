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

@js.native
trait OtherOs extends Os {
  var os: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin = js.native
}

object OtherOs {
  @scala.inline
  def apply(os: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin): OtherOs = {
    val __obj = js.Dynamic.literal(os = os.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherOs]
  }
  @scala.inline
  implicit class OtherOsOps[Self <: OtherOs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOs(value: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

