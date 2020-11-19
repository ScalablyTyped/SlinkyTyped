package typingsSlinky.architect

import typingsSlinky.architect.architectStrings.error
import typingsSlinky.architect.architectStrings.plugin
import typingsSlinky.architect.architectStrings.ready
import typingsSlinky.architect.architectStrings.service
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("architect", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def createApp(config: Config): Architect = js.native
  def createApp(config: Config, callback: js.Function2[/* err */ js.Error, /* app */ Architect, Unit]): Architect = js.native
  
  def loadConfig(configPath: String): Unit = js.native
  def loadConfig(configPath: String, callback: js.Function2[/* err */ js.Error, /* config */ Config, Unit]): Unit = js.native
  
  @js.native
  trait Architect extends EventEmitter {
    
    def getService(name: String): js.Any = js.native
    
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
    @JSName("on")
    def on_plugin(event: plugin, listener: js.Function1[/* plugin */ Plugin, Unit]): this.type = js.native
    @JSName("on")
    def on_ready(event: ready, listener: js.Function1[/* app */ this.type, Unit]): this.type = js.native
    @JSName("on")
    def on_service(
      event: service,
      listener: js.Function3[/* name */ String, /* service */ Service, /* plugin */ Plugin, Unit]
    ): this.type = js.native
  }
  
  type Config = js.Any
  
  type Plugin = js.Any
  
  type Service = js.Any
}
