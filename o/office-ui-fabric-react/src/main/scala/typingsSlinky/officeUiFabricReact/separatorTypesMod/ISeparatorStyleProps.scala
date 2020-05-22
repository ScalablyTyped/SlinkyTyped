package typingsSlinky.officeUiFabricReact.separatorTypesMod

import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.center
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.end
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.start
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Separator/Separator.types.ISeparatorProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Separator/Separator.types.ISeparatorProps, 'className' | 'alignContent' | 'vertical'> */
trait ISeparatorStyleProps extends js.Object {
  var alignContent: js.UndefOr[start | center | end] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var theme: ITheme
  var vertical: js.UndefOr[Boolean] = js.undefined
}

object ISeparatorStyleProps {
  @scala.inline
  def apply(
    theme: ITheme,
    alignContent: start | center | end = null,
    className: String = null,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): ISeparatorStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (alignContent != null) __obj.updateDynamic("alignContent")(alignContent.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISeparatorStyleProps]
  }
}

