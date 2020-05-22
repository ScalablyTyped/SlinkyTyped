package typingsSlinky.fluentuiReactIcons.typesMod

import slinky.core.TagMod
import typingsSlinky.fluentuiReactIcons.svgIconTypesMod.ISvgIconProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SvgIconCreateFnParams[TProps] extends js.Object {
  var displayName: String
  var svg: SvgIconChildrenFn[TProps with ISvgIconProps]
}

object SvgIconCreateFnParams {
  @scala.inline
  def apply[TProps](displayName: String, svg: /* svgIcon */ SvgIconFuncArg[TProps with ISvgIconProps] => TagMod[Any]): SvgIconCreateFnParams[TProps] = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], svg = js.Any.fromFunction1(svg))
    __obj.asInstanceOf[SvgIconCreateFnParams[TProps]]
  }
}

