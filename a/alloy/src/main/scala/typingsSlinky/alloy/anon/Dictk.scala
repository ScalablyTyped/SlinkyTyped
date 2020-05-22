package typingsSlinky.alloy.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictk
  extends /* k */ StringDictionary[js.Any] {
  def instance(name: String): js.Any
}

object Dictk {
  @scala.inline
  def apply(instance: String => js.Any, StringDictionary: /* name */ StringDictionary[js.Any] = null): Dictk = {
    val __obj = js.Dynamic.literal(instance = js.Any.fromFunction1(instance))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Dictk]
  }
}

