package typingsSlinky.rehypeReact.mod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import typingsSlinky.rehypeReact.AnonChildren
import typingsSlinky.rehypeReact.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var Fragment: js.UndefOr[ReactComponentClass[AnonChildren]] = js.undefined
  var components: js.UndefOr[StringDictionary[ReactComponentClass[_]]] = js.undefined
  var createElement: FnCall
  var prefix: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    createElement: FnCall,
    Fragment: ReactComponentClass[AnonChildren] = null,
    components: StringDictionary[ReactComponentClass[_]] = null,
    prefix: String = null
  ): Options = {
    val __obj = js.Dynamic.literal(createElement = createElement.asInstanceOf[js.Any])
    if (Fragment != null) __obj.updateDynamic("Fragment")(Fragment.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

