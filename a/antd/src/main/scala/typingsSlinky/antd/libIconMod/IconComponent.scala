package typingsSlinky.antd.libIconMod

import slinky.core.ReactComponentClass
import typingsSlinky.antd.libIconIconFontMod.CustomIconOptions
import typingsSlinky.react.reactMod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconComponent[P] extends FunctionComponent[P] {
  var createFromIconfontCN: js.Function1[/* options */ js.UndefOr[CustomIconOptions], ReactComponentClass[IconProps]] = js.native
  var getTwoToneColor: js.Function0[String] = js.native
  var setTwoToneColor: js.Function1[/* primaryColor */ String, Unit] = js.native
  var unstable_ChangeDefaultThemeOfIcons: js.UndefOr[js.Function1[/* theme */ ThemeType, Unit]] = js.native
  var unstable_ChangeThemeOfIconsDangerously: js.UndefOr[js.Function1[/* theme */ js.UndefOr[ThemeType], Unit]] = js.native
}

