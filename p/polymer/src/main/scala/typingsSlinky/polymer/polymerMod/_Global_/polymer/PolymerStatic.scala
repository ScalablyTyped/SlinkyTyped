package typingsSlinky.polymer.polymerMod._Global_.polymer

import typingsSlinky.polymer.Anon_Base
import typingsSlinky.std.Event
import typingsSlinky.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolymerStatic extends js.Object {
  var ArraySplice: typingsSlinky.polymer.polymerMod._Global_.polymer.ArraySplice = js.native
  var Base: typingsSlinky.polymer.polymerMod._Global_.polymer.Base = js.native
  /** @deprecated */
  var ImportStatus: typingsSlinky.polymer.polymerMod._Global_.polymer.ImportStatus = js.native
  var RenderStatus: typingsSlinky.polymer.polymerMod._Global_.polymer.RenderStatus = js.native
  var Settings: typingsSlinky.polymer.polymerMod._Global_.polymer.Settings = js.native
  var Templatizer: typingsSlinky.polymer.polymerMod._Global_.polymer.Templatizer = js.native
  @JSName("dom")
  var dom_Original: DomApiStatic = js.native
  def apply(prototype: Anon_Base): js.Any = js.native
  def apply(prototype: Base): js.Any = js.native
  def Class(prototype: Anon_Base): js.Any = js.native
  def Class(prototype: Base): js.Any = js.native
  def dom(obj: Base): DomApi = js.native
  def dom(obj: Event): EventApi = js.native
  def dom(obj: Node): DomApi = js.native
  def isInstance(element: String): Boolean = js.native
}

