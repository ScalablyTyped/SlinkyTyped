package typingsSlinky.devcert

import typingsSlinky.devcert.platformsMod.Platform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object darwinMod {
  
  @JSImport("devcert/dist/platforms/darwin", JSImport.Default)
  @js.native
  class default () extends MacOSPlatform
  
  @js.native
  trait MacOSPlatform extends Platform {
    
    var FIREFOX_BIN_PATH: js.Any = js.native
    
    var FIREFOX_BUNDLE_PATH: js.Any = js.native
    
    var FIREFOX_NSS_DIR: js.Any = js.native
    
    var HOST_FILE_PATH: js.Any = js.native
    
    var isFirefoxInstalled: js.Any = js.native
    
    var isNSSInstalled: js.Any = js.native
  }
}
