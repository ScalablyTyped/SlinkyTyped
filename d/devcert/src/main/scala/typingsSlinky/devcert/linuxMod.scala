package typingsSlinky.devcert

import typingsSlinky.devcert.platformsMod.Platform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("devcert/dist/platforms/linux", JSImport.Namespace)
@js.native
object linuxMod extends js.Object {
  
  @js.native
  trait LinuxPlatform extends Platform {
    
    var CHROME_BIN_PATH: js.Any = js.native
    
    var CHROME_NSS_DIR: js.Any = js.native
    
    var FIREFOX_BIN_PATH: js.Any = js.native
    
    var FIREFOX_NSS_DIR: js.Any = js.native
    
    var HOST_FILE_PATH: js.Any = js.native
    
    var isChromeInstalled: js.Any = js.native
    
    var isFirefoxInstalled: js.Any = js.native
  }
  
  @js.native
  class default () extends LinuxPlatform
}
