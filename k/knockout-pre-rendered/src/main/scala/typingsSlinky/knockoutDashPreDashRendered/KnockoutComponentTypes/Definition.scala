package typingsSlinky.knockoutDashPreDashRendered.KnockoutComponentTypes

import org.scalajs.dom.raw.Node
import typingsSlinky.knockoutDashPreDashRendered.Anon_ElementNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Definition extends js.Object {
  var createViewModel: js.UndefOr[js.Function2[/* params */ js.Any, /* options */ Anon_ElementNode, _]] = js.undefined
  var template: js.Array[Node]
}

object Definition {
  @scala.inline
  def apply(
    template: js.Array[Node],
    createViewModel: (/* params */ js.Any, /* options */ Anon_ElementNode) => _ = null
  ): Definition = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    if (createViewModel != null) __obj.updateDynamic("createViewModel")(js.Any.fromFunction2(createViewModel))
    __obj.asInstanceOf[Definition]
  }
}

