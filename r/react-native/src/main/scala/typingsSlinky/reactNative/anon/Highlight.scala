package typingsSlinky.reactNative.anon

import typingsSlinky.reactNative.reactNativeStrings.leading
import typingsSlinky.reactNative.reactNativeStrings.trailing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Highlight extends js.Object {
  def highlight(): Unit = js.native
  def unhighlight(): Unit = js.native
  @JSName("updateProps")
  def updateProps_leading(select: leading, newProps: js.Any): Unit = js.native
  @JSName("updateProps")
  def updateProps_trailing(select: trailing, newProps: js.Any): Unit = js.native
}

