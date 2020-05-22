package typingsSlinky.baseui.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseProviderProps extends js.Object {
  var children: TagMod[Any]
  var overrides: js.UndefOr[BaseProviderOverrides] = js.undefined
  var theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ js.Any
  var zIndex: js.UndefOr[Double] = js.undefined
}

object BaseProviderProps {
  @scala.inline
  def apply(
    theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ js.Any,
    children: TagMod[Any] = null,
    overrides: BaseProviderOverrides = null,
    zIndex: js.UndefOr[Double] = js.undefined
  ): BaseProviderProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseProviderProps]
  }
}

