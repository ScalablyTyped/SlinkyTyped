package typingsSlinky.linguiReact.i18nMod

import slinky.core.TagMod
import typingsSlinky.linguiReact.AnonI18n
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18nComponentProps extends js.Object {
  var update: js.UndefOr[Boolean] = js.undefined
  var withHash: js.UndefOr[Boolean] = js.undefined
  def children(hasI18nI18nHash: AnonI18n): TagMod[Any]
}

object I18nComponentProps {
  @scala.inline
  def apply(
    children: AnonI18n => TagMod[Any],
    update: js.UndefOr[Boolean] = js.undefined,
    withHash: js.UndefOr[Boolean] = js.undefined
  ): I18nComponentProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    if (!js.isUndefined(update)) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    if (!js.isUndefined(withHash)) __obj.updateDynamic("withHash")(withHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18nComponentProps]
  }
}

