package typingsSlinky.getos.mod

import typingsSlinky.getos.getosStrings.aix
import typingsSlinky.getos.getosStrings.android
import typingsSlinky.getos.getosStrings.cygwin
import typingsSlinky.getos.getosStrings.darwin
import typingsSlinky.getos.getosStrings.freebsd
import typingsSlinky.getos.getosStrings.linux
import typingsSlinky.getos.getosStrings.openbsd
import typingsSlinky.getos.getosStrings.sunos
import typingsSlinky.getos.getosStrings.win32
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.getos.mod.OtherOs
  - typingsSlinky.getos.mod.LinuxOs
*/
trait Os extends js.Object
object Os {
  
  @scala.inline
  def OtherOs(os: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin): Os = {
    val __obj = js.Dynamic.literal(os = os.asInstanceOf[js.Any])
    __obj.asInstanceOf[Os]
  }
  
  @scala.inline
  def LinuxOs(dist: String, os: linux, release: String): Os = {
    val __obj = js.Dynamic.literal(dist = dist.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
    __obj.asInstanceOf[Os]
  }
}
