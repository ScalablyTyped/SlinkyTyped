package typingsSlinky.reactNativeElements.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeConsumerProps[T] extends js.Object {
  def children(props: ThemeProps[T]): TagMod[Any]
}

object ThemeConsumerProps {
  @scala.inline
  def apply[T](children: ThemeProps[T] => TagMod[Any]): ThemeConsumerProps[T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[ThemeConsumerProps[T]]
  }
}

