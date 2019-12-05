package typingsSlinky.atApolloReactDashSsr.libGetDataFromTreeMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMarkupFromTreeOptions extends js.Object {
  var context: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var renderFunction: js.UndefOr[js.Function1[/* tree */ ReactElement, String]] = js.undefined
  var tree: TagMod[Any]
}

object GetMarkupFromTreeOptions {
  @scala.inline
  def apply(
    tree: TagMod[Any],
    context: StringDictionary[js.Any] = null,
    renderFunction: /* tree */ ReactElement => String = null
  ): GetMarkupFromTreeOptions = {
    val __obj = js.Dynamic.literal(tree = tree.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (renderFunction != null) __obj.updateDynamic("renderFunction")(js.Any.fromFunction1(renderFunction))
    __obj.asInstanceOf[GetMarkupFromTreeOptions]
  }
}

