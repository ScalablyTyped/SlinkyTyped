package typingsSlinky.preact.mod.h

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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("preact", "h")
@js.native
object ^ extends js.Object {
  
  def apply(
    `type`: String,
    props: HTMLAttributes[EventTarget] with SVGAttributes[SVGElement] with (Record[String, _]),
    children: ComponentChildren*
  ): VNode[_] = js.native
  def apply(`type`: String, props: Null, children: ComponentChildren*): VNode[_] = js.native
  def apply[P](`type`: ComponentType[P], props: Attributes with P, children: ComponentChildren*): VNode[_] = js.native
  def apply[P](`type`: ComponentType[P], props: Null, children: ComponentChildren*): VNode[_] = js.native
}
