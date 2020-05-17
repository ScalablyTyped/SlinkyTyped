package typingsSlinky.jquery.JQuery

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jquery.anon.Get
import typingsSlinky.jquery.anon.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tween-hooks }\`
  * @since 1.8
  */
// Workaround for TypeScript 2.3 which does not have support for weak types handling.
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jquery.anon.Get[TElement]
  - typingsSlinky.jquery.anon.Set[TElement]
  - org.scalablytyped.runtime.StringDictionary[scala.Nothing]
*/
trait PropHook[TElement] extends js.Object

object PropHook {
  @scala.inline
  implicit def apply[TElement](value: Get[TElement]): PropHook[TElement] = value.asInstanceOf[PropHook[TElement]]
  @scala.inline
  implicit def apply[TElement](value: Set[TElement]): PropHook[TElement] = value.asInstanceOf[PropHook[TElement]]
  @scala.inline
  implicit def apply[TElement](value: StringDictionary[scala.Nothing]): PropHook[TElement] = value.asInstanceOf[PropHook[TElement]]
}

