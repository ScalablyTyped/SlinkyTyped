package typingsSlinky.fluentReact.mod

import org.scalajs.dom.raw.Node
import typingsSlinky.fluentBundle.mod.FluentBundle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalizationProviderProps extends js.Object {
  var bundles: js.Iterable[FluentBundle]
  var parseMarkup: js.UndefOr[MarkupParser] = js.undefined
}

object LocalizationProviderProps {
  @scala.inline
  def apply(bundles: js.Iterable[FluentBundle], parseMarkup: /* str */ String => js.Array[Node] = null): LocalizationProviderProps = {
    val __obj = js.Dynamic.literal(bundles = bundles.asInstanceOf[js.Any])
    if (parseMarkup != null) __obj.updateDynamic("parseMarkup")(js.Any.fromFunction1(parseMarkup))
    __obj.asInstanceOf[LocalizationProviderProps]
  }
}

