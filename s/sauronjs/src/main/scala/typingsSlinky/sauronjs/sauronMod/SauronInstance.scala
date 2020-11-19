package typingsSlinky.sauronjs.sauronMod

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SauronInstance extends js.Object {
  
  def info(): Info = js.native
  
  def initCache(id: String): Unit = js.native
  
  def plugin(plugin: js.Function2[/* instance */ this.type, /* options */ js.Any, Unit], options: js.Any): SauronInstance = js.native
  
  def rebootstrap(): Unit = js.native
  def rebootstrap(map: SauronComponentMap): Unit = js.native
  
  def service(Service: Instantiable1[/* options */ js.Any, typingsSlinky.sauronjs.serviceMod.^]): SauronInstance = js.native
  def service(Service: Instantiable1[/* options */ js.Any, typingsSlinky.sauronjs.serviceMod.^], options: js.Any): SauronInstance = js.native
}
