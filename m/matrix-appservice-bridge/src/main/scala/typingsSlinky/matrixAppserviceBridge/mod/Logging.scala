package typingsSlinky.matrixAppserviceBridge.mod

import typingsSlinky.matrixAppserviceBridge.loggingMod.LoggerConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Logging {
  
  object default {
    
    @JSImport("matrix-appservice-bridge", "Logging.default")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("matrix-appservice-bridge", "Logging.default.configure")
    @js.native
    def configure: js.Function1[/* config */ LoggerConfig, Unit] = js.native
    @JSImport("matrix-appservice-bridge", "Logging.default.configure")
    @js.native
    def configure(config: LoggerConfig): Unit = js.native
    @scala.inline
    def configure_=(x: js.Function1[/* config */ LoggerConfig, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("configure")(x.asInstanceOf[js.Any])
    
    @JSImport("matrix-appservice-bridge", "Logging.default.configured")
    @js.native
    def configured(): Boolean = js.native
    @JSImport("matrix-appservice-bridge", "Logging.default.configured")
    @js.native
    def configured_Fdefault: js.Function0[Boolean] = js.native
    
    @scala.inline
    def configured_Fdefault_=(x: js.Function0[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("configured")(x.asInstanceOf[js.Any])
    
    @JSImport("matrix-appservice-bridge", "Logging.default.get")
    @js.native
    def get: js.Function1[/* name */ String, typingsSlinky.matrixAppserviceBridge.loggingMod.LogWrapper] = js.native
    @JSImport("matrix-appservice-bridge", "Logging.default.get")
    @js.native
    def get(name: String): typingsSlinky.matrixAppserviceBridge.loggingMod.LogWrapper = js.native
    @scala.inline
    def get_=(x: js.Function1[/* name */ String, typingsSlinky.matrixAppserviceBridge.loggingMod.LogWrapper]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("get")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("matrix-appservice-bridge", "Logging.LogWrapper")
  @js.native
  class LogWrapper ()
    extends typingsSlinky.matrixAppserviceBridge.loggingMod.LogWrapper
  
  @JSImport("matrix-appservice-bridge", "Logging.configure")
  @js.native
  def configure(config: LoggerConfig): Unit = js.native
  
  @JSImport("matrix-appservice-bridge", "Logging.configured")
  @js.native
  def configured(): Boolean = js.native
  
  @JSImport("matrix-appservice-bridge", "Logging.get")
  @js.native
  def get(name: String): typingsSlinky.matrixAppserviceBridge.loggingMod.LogWrapper = js.native
}
