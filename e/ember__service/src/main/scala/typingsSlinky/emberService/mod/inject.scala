package typingsSlinky.emberService.mod

import typingsSlinky.emberObject.computedMod.ComputedProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ember/service", "inject")
@js.native
object inject extends js.Object {
  
  def apply(): ComputedProperty[Service, Service] = js.native
  def apply(target: js.Object, propertyKey: String): Unit = js.native
  def apply(target: js.Object, propertyKey: js.Symbol): Unit = js.native
  def apply[K /* <: /* keyof @ember/service.@ember/service.Registry */ String */](name: K): ComputedProperty[
    /* import warning: importer.ImportType#apply Failed type conversion: @ember/service.@ember/service.Registry[K] */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @ember/service.@ember/service.Registry[K] */ js.Any
  ] = js.native
}
