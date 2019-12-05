package typingsSlinky.preact.preactMod.h

import typingsSlinky.preact.preactMod.Attributes
import typingsSlinky.preact.preactMod.ComponentChildren
import typingsSlinky.preact.preactMod.ComponentType
import typingsSlinky.preact.preactMod.VNode
import typingsSlinky.preact.srcJsxMod.JSXInternal.HTMLAttributes
import typingsSlinky.preact.srcJsxMod.JSXInternal.SVGAttributes
import typingsSlinky.std.EventTarget
import typingsSlinky.std.Record
import typingsSlinky.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("preact", "h")
@js.native
object ^ extends js.Object {
  def apply(`type`: String, children: ComponentChildren*): VNode[_] = js.native
  def apply(
    `type`: String,
    props: HTMLAttributes[EventTarget] with SVGAttributes[SVGElement] with (Record[String, _]),
    children: ComponentChildren*
  ): VNode[_] = js.native
  def apply[P](`type`: ComponentType[P], children: ComponentChildren*): VNode[_] = js.native
  def apply[P](`type`: ComponentType[P], props: Attributes with P, children: ComponentChildren*): VNode[_] = js.native
}

