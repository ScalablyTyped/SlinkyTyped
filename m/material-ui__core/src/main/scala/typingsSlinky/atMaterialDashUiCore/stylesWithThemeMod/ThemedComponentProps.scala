package typingsSlinky.atMaterialDashUiCore.stylesWithThemeMod

import slinky.core.facade.ReactRef
import typingsSlinky.atMaterialDashUiCore.stylesCreateMuiThemeMod.Theme
import typingsSlinky.react.reactMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@material-ui/core.@material-ui/core/styles/withTheme.WithTheme> */
trait ThemedComponentProps extends js.Object {
  var innerRef: js.UndefOr[Ref[_] | ReactRef[_]] = js.undefined
  var theme: js.UndefOr[Theme] = js.undefined
}

object ThemedComponentProps {
  @scala.inline
  def apply(innerRef: Ref[_] | ReactRef[_] = null, theme: Theme = null): ThemedComponentProps = {
    val __obj = js.Dynamic.literal()
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemedComponentProps]
  }
}

