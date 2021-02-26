package typingsSlinky.inversifyRestifyUtils

import typingsSlinky.inversify.interfacesMod.interfaces.Container
import typingsSlinky.inversifyRestifyUtils.interfacesMod.interfaces.ConfigFunction
import typingsSlinky.restify.mod.Server
import typingsSlinky.restify.mod.ServerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverMod {
  
  @JSImport("inversify-restify-utils/dts/server", "InversifyRestifyServer")
  @js.native
  class InversifyRestifyServer protected () extends StObject {
    def this(container: Container) = this()
    def this(
      container: Container,
      opts: ServerOptions with typingsSlinky.inversifyRestifyUtils.interfacesMod.interfaces.ServerOptions
    ) = this()
    
    var app: js.Any = js.native
    
    def build(): Server = js.native
    
    var configFn: js.Any = js.native
    
    var container: js.Any = js.native
    
    var defaultRoot: js.Any = js.native
    
    var handlerFactory: js.Any = js.native
    
    var registerControllers: js.Any = js.native
    
    var resolveMiddleware: js.Any = js.native
    
    def setConfig(fn: ConfigFunction): InversifyRestifyServer = js.native
  }
}
