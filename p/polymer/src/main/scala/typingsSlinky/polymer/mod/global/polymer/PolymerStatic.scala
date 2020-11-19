package typingsSlinky.polymer.mod.global.polymer

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.Node
import typingsSlinky.polymer.anon.Instantiable
import typingsSlinky.std.CustomElementConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolymerStatic extends js.Object {
  
  def apply(prototype: Instantiable): CustomElementConstructor = js.native
  def apply(prototype: Base): CustomElementConstructor = js.native
  
  var ArraySplice: typingsSlinky.polymer.mod.global.polymer.ArraySplice = js.native
  
  var Base: typingsSlinky.polymer.mod.global.polymer.Base = js.native
  
  def Class(prototype: Instantiable): CustomElementConstructor = js.native
  def Class(prototype: Base): CustomElementConstructor = js.native
  
  /** @deprecated */
  var ImportStatus: typingsSlinky.polymer.mod.global.polymer.ImportStatus = js.native
  
  var RenderStatus: typingsSlinky.polymer.mod.global.polymer.RenderStatus = js.native
  
  var Settings: typingsSlinky.polymer.mod.global.polymer.Settings = js.native
  
  var Templatizer: typingsSlinky.polymer.mod.global.polymer.Templatizer = js.native
  
  def dom(obj: Base): DomApi = js.native
  def dom(obj: Event): EventApi = js.native
  def dom(obj: Node): DomApi = js.native
  @JSName("dom")
  var dom_Original: DomApiStatic = js.native
  
  def isInstance(element: String): Boolean = js.native
}
