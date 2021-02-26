package typingsSlinky.raygun

import typingsSlinky.raygun.typesMod.IOfflineStorage
import typingsSlinky.raygun.typesMod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object raygunOfflineMod {
  
  @JSImport("raygun/build/raygun.offline", "OfflineStorage")
  @js.native
  class OfflineStorage protected () extends IOfflineStorage {
    def this(transport: Transport) = this()
    
    var _sendAndDelete: js.Any = js.native
    
    var cacheLimit: Double = js.native
    
    var cachePath: String = js.native
    
    var transport: Transport = js.native
  }
}
