package typingsSlinky.rebass.rebassMod

import slinky.core.facade.ReactElement
import typingsSlinky.react.reactMod.Key
import typingsSlinky.react.reactMod.Ref
import typingsSlinky.react.reactMod.RefAttributes
import typingsSlinky.styledDashComponents.styledDashComponentsMod.CSSObject
import typingsSlinky.styledDashComponents.styledDashComponentsMod.FlattenSimpleInterpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseProps
  extends RefAttributes[js.Any] {
  var as: js.UndefOr[ReactElement] = js.undefined
  var css: js.UndefOr[CSSObject | FlattenSimpleInterpolation | String] = js.undefined
}

object BaseProps {
  @scala.inline
  def apply(
    as: ReactElement = null,
    css: CSSObject | FlattenSimpleInterpolation | String = null,
    key: Key = null,
    ref: Ref[js.Any] = null
  ): BaseProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseProps]
  }
}

