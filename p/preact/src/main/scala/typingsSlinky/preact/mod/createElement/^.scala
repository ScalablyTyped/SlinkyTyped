package typingsSlinky.preact.mod.createElement

import typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes
import typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes
import typingsSlinky.preact.mod.Attributes
import typingsSlinky.preact.mod.ComponentChildren
import typingsSlinky.preact.mod.ComponentType
import typingsSlinky.preact.mod.VNode
import typingsSlinky.std.EventTarget
import typingsSlinky.std.Record
import typingsSlinky.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("preact", "createElement")
@js.native
object ^ extends js.Object {
  def apply(`type`: String, children: ComponentChildren*): VNode[_] = js.native
  //
  // Preact createElement
  // -----------------------------------
  def apply(
    `type`: String,
    props: HTMLAttributes[EventTarget] with SVGAttributes[SVGElement] with (Record[String, _]),
    children: ComponentChildren*
  ): VNode[_] = js.native
  def apply[P](`type`: ComponentType[P], children: ComponentChildren*): VNode[_] = js.native
  def apply[P](`type`: ComponentType[P], props: Attributes with P, children: ComponentChildren*): VNode[_] = js.native
}

