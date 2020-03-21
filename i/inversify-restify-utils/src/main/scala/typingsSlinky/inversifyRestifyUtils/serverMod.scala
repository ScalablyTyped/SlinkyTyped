package typingsSlinky.inversifyRestifyUtils

import typingsSlinky.inversify.interfacesMod.interfaces.Container
import typingsSlinky.inversifyRestifyUtils.interfacesMod.interfaces.ConfigFunction
import typingsSlinky.restify.mod.Server
import typingsSlinky.restify.mod.ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-restify-utils/dts/server", JSImport.Namespace)
@js.native
object serverMod extends js.Object {
  @js.native
  class InversifyRestifyServer protected () extends js.Object {
    def this(container: Container) = this()
    def this(
      container: Container,
      opts: ServerOptions with typingsSlinky.inversifyRestifyUtils.interfacesMod.interfaces.ServerOptions
    ) = this()
    var app: js.Any = js.native
    var configFn: js.Any = js.native
    var container: js.Any = js.native
    var defaultRoot: js.Any = js.native
    def build(): Server = js.native
    /* private */ def handlerFactory(controllerName: js.Any, key: js.Any): js.Any = js.native
    /* private */ def registerControllers(): js.Any = js.native
    /* private */ def resolveMiddleware(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param middleware because its type <none> is not an array type */ middleware: js.Any
    ): js.Any = js.native
    def setConfig(fn: ConfigFunction): InversifyRestifyServer = js.native
  }
  
}

