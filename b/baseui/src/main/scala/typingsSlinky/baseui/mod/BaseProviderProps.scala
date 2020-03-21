package typingsSlinky.baseui.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseProviderProps extends js.Object {
  var children: TagMod[Any]
  var overrides: js.UndefOr[BaseProviderOverrides] = js.undefined
  var theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ js.Any
}

object BaseProviderProps {
  @scala.inline
  def apply(
    children: TagMod[Any],
    theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ js.Any,
    overrides: BaseProviderOverrides = null
  ): BaseProviderProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseProviderProps]
  }
}

