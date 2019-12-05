package typingsSlinky.rehypeDashReact.rehypeDashReactMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import typingsSlinky.rehypeDashReact.Fn_A
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var components: StringDictionary[ReactComponentClass[_]]
  var createElement: Fn_A
  var prefix: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(components: StringDictionary[ReactComponentClass[_]], createElement: Fn_A, prefix: String = null): Options = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], createElement = createElement.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

