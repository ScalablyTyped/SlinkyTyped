package typingsSlinky.inversifyRestifyUtils

import typingsSlinky.inversify.interfacesMod.interfaces.Container
import typingsSlinky.inversifyRestifyUtils.interfacesMod.interfaces.HandlerDecorator
import typingsSlinky.inversifyRestifyUtils.interfacesMod.interfaces.Middleware
import typingsSlinky.inversifyRestifyUtils.interfacesMod.interfaces.RouteOptions
import typingsSlinky.restify.mod.ServerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("inversify-restify-utils", "Controller")
  @js.native
  def Controller(path: String, middleware: Middleware*): js.Function1[/* target */ js.Any, Unit] = js.native
  
  @JSImport("inversify-restify-utils", "Delete")
  @js.native
  def Delete(options: RouteOptions, middleware: Middleware*): HandlerDecorator = js.native
  
  @JSImport("inversify-restify-utils", "Get")
  @js.native
  def Get(options: RouteOptions, middleware: Middleware*): HandlerDecorator = js.native
  
  @JSImport("inversify-restify-utils", "Head")
  @js.native
  def Head(options: RouteOptions, middleware: Middleware*): HandlerDecorator = js.native
  
  @JSImport("inversify-restify-utils", "InversifyRestifyServer")
  @js.native
  class InversifyRestifyServer protected ()
    extends typingsSlinky.inversifyRestifyUtils.serverMod.InversifyRestifyServer {
    def this(container: Container) = this()
    def this(
      container: Container,
      opts: ServerOptions with typingsSlinky.inversifyRestifyUtils.interfacesMod.interfaces.ServerOptions
    ) = this()
  }
  
  @JSImport("inversify-restify-utils", "Method")
  @js.native
  def Method(method: String, options: RouteOptions, middleware: Middleware*): HandlerDecorator = js.native
  
  @JSImport("inversify-restify-utils", "Options")
  @js.native
  def Options(options: RouteOptions, middleware: Middleware*): HandlerDecorator = js.native
  
  @JSImport("inversify-restify-utils", "Patch")
  @js.native
  def Patch(options: RouteOptions, middleware: Middleware*): HandlerDecorator = js.native
  
  @JSImport("inversify-restify-utils", "Post")
  @js.native
  def Post(options: RouteOptions, middleware: Middleware*): HandlerDecorator = js.native
  
  @JSImport("inversify-restify-utils", "Put")
  @js.native
  def Put(options: RouteOptions, middleware: Middleware*): HandlerDecorator = js.native
  
  object TYPE {
    
    @JSImport("inversify-restify-utils", "TYPE")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("inversify-restify-utils", "TYPE.Controller")
    @js.native
    def Controller: js.Symbol = js.native
    @scala.inline
    def Controller_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Controller")(x.asInstanceOf[js.Any])
  }
}
