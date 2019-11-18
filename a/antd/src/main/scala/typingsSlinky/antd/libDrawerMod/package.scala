package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libDrawerMod {
  import typingsSlinky.react.NativeMouseEvent
  import typingsSlinky.react.reactMod.KeyboardEvent
  import typingsSlinky.react.reactMod.MouseEvent
  import typingsSlinky.std.HTMLButtonElement
  import typingsSlinky.std.HTMLDivElement
  import typingsSlinky.std.HTMLElement

  type EventType = KeyboardEvent[HTMLDivElement] | (MouseEvent[HTMLDivElement | HTMLButtonElement, NativeMouseEvent])
  type getContainerFunc = js.Function0[HTMLElement]
}
