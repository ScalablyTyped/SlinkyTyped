package typingsSlinky.polymer.mod._Global_.polymer

import typingsSlinky.polymer.AnonInstantiable
import typingsSlinky.std.CustomElementConstructor
import typingsSlinky.std.Event_
import typingsSlinky.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolymerStatic extends js.Object {
  var ArraySplice: typingsSlinky.polymer.mod._Global_.polymer.ArraySplice = js.native
  var Base: typingsSlinky.polymer.mod._Global_.polymer.Base = js.native
  /** @deprecated */
  var ImportStatus: typingsSlinky.polymer.mod._Global_.polymer.ImportStatus = js.native
  var RenderStatus: typingsSlinky.polymer.mod._Global_.polymer.RenderStatus = js.native
  var Settings: typingsSlinky.polymer.mod._Global_.polymer.Settings = js.native
  var Templatizer: typingsSlinky.polymer.mod._Global_.polymer.Templatizer = js.native
  @JSName("dom")
  var dom_Original: DomApiStatic = js.native
  def apply(prototype: AnonInstantiable): CustomElementConstructor = js.native
  def apply(prototype: Base): CustomElementConstructor = js.native
  def Class(prototype: AnonInstantiable): CustomElementConstructor = js.native
  def Class(prototype: Base): CustomElementConstructor = js.native
  def dom(obj: Base): DomApi = js.native
  def dom(obj: Event_): EventApi = js.native
  def dom(obj: Node): DomApi = js.native
  def isInstance(element: String): Boolean = js.native
}

