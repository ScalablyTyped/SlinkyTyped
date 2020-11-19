package typingsSlinky.feathersjsFeathers.mod

import typingsSlinky.feathersjsFeathers.anon.PartialHooksObject
import typingsSlinky.feathersjsFeathers.anon.PartialServiceMethodsanyS
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Application[ServiceTypes] extends EventEmitter {
  
  def configure(callback: js.ThisFunction1[/* this */ this.type, /* app */ this.type, Unit]): this.type = js.native
  
  def disable(name: String): this.type = js.native
  
  def disabled(name: String): Boolean = js.native
  
  def enable(name: String): this.type = js.native
  
  def enabled(name: String): Boolean = js.native
  
  def get(name: String): js.Any = js.native
  
  def hooks(hooks: PartialHooksObject): this.type = js.native
  
  def service(location: String): Service[_] = js.native
  def service[L /* <: /* keyof ServiceTypes */ String */](location: L): Service[
    /* import warning: importer.ImportType#apply Failed type conversion: ServiceTypes[L] */ js.Any
  ] = js.native
  
  def set(name: String, value: js.Any): this.type = js.native
  
  def setup(): this.type = js.native
  def setup(server: js.Any): this.type = js.native
  
  def use(path: String, service: PartialServiceMethodsanyS): this.type = js.native
  def use(path: String, service: PartialServiceMethodsanyS, options: js.Any): this.type = js.native
  def use(path: String, service: Application[_]): this.type = js.native
  def use(path: String, service: Application[_], options: js.Any): this.type = js.native
  
  var version: String = js.native
}
