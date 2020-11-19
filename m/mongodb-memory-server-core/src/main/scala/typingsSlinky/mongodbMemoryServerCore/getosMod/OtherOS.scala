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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OtherOS extends AnyOS {
  
  var os: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin | String = js.native
}
object OtherOS {
  
  @scala.inline
  def apply(os: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin | String): OtherOS = {
    val __obj = js.Dynamic.literal(os = os.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherOS]
  }
  
  @scala.inline
  implicit class OtherOSOps[Self <: OtherOS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOs(value: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin | String): Self = this.set("os", value.asInstanceOf[js.Any])
  }
}
