package typingsSlinky.reactMdMenu.useMenuMod

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.MutableRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<react.react.HTMLAttributes<std.HTMLDivElement>, 'onClick' | 'onKeyDown'> */
@js.native
trait ReturnValue extends js.Object {
  var menuRef: MutableRefObject[HTMLDivElement | Null] = js.native
  var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
  def ref(): Unit = js.native
  def ref(instance: HTMLDivElement): Unit = js.native
}

