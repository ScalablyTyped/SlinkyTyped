package typingsSlinky.prismDashReactDashRenderer.prismDashReactDashRendererMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightProps extends js.Object {
  var Prism: PrismLib
  var code: String
  var language: Language
  var theme: js.UndefOr[PrismTheme] = js.undefined
  def children(props: RenderProps): TagMod[Any]
}

object HighlightProps {
  @scala.inline
  def apply(
    Prism: PrismLib,
    children: RenderProps => TagMod[Any],
    code: String,
    language: Language,
    theme: PrismTheme = null
  ): HighlightProps = {
    val __obj = js.Dynamic.literal(Prism = Prism.asInstanceOf[js.Any], children = js.Any.fromFunction1(children), code = code.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightProps]
  }
}

