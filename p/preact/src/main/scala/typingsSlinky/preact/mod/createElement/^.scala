package typingsSlinky.preact.mod.createElement

import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.SVGElement
import typingsSlinky.preact.jsxMod.JSXInternal.HTMLAttributes
import typingsSlinky.preact.jsxMod.JSXInternal.SVGAttributes
import typingsSlinky.preact.mod.Attributes
import typingsSlinky.preact.mod.ComponentChildren
import typingsSlinky.preact.mod.ComponentType
import typingsSlinky.preact.mod.VNode
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("preact", "createElement")
@js.native
object ^ extends js.Object {
  //
  // Preact createElement
  // -----------------------------------
  def apply(
    `type`: String,
    props: HTMLAttributes[EventTarget] with SVGAttributes[SVGElement] with (Record[String, _]),
    children: ComponentChildren*
  ): VNode[_] = js.native
  def apply(`type`: String, props: Null, children: ComponentChildren*): VNode[_] = js.native
  def apply[P](`type`: ComponentType[P], props: Attributes with P, children: ComponentChildren*): VNode[_] = js.native
  def apply[P](`type`: ComponentType[P], props: Null, children: ComponentChildren*): VNode[_] = js.native
}

