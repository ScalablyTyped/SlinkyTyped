package typingsSlinky.reactDashFoundation.utilsMod

import typingsSlinky.propDashTypes.propDashTypesMod.Requireable
import typingsSlinky.reactDashFoundation.enumsMod.Breakpoints
import typingsSlinky.reactDashFoundation.enumsMod.FloatTypes
import typingsSlinky.reactDashFoundation.reactDashFoundationStrings.large
import typingsSlinky.reactDashFoundation.reactDashFoundationStrings.medium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneralPropTypes extends ClassNameProps {
  var float: js.UndefOr[FloatTypes] = js.undefined
  var hideFor: js.UndefOr[medium | large] = js.undefined
  var hideOnlyFor: js.UndefOr[Breakpoints] = js.undefined
  var isClearfix: js.UndefOr[Boolean] = js.undefined
  var isHidden: js.UndefOr[Boolean] = js.undefined
  var isInvisible: js.UndefOr[Boolean] = js.undefined
  var showFor: js.UndefOr[Breakpoints] = js.undefined
  var showForLandscape: js.UndefOr[Boolean] = js.undefined
  var showForPortrait: js.UndefOr[Boolean] = js.undefined
  var showForSr: js.UndefOr[Boolean] = js.undefined
  var showOnFocus: js.UndefOr[Boolean] = js.undefined
  var showOnlyFor: js.UndefOr[Breakpoints] = js.undefined
}

@JSImport("react-foundation/utils", "GeneralPropTypes")
@js.native
object GeneralPropTypes extends js.Object {
  var float: Requireable[_] = js.native
  var hideFor: Requireable[_] = js.native
  var hideOnlyFor: Requireable[_] = js.native
  var isClearfix: Requireable[_] = js.native
  var isHidden: Requireable[_] = js.native
  var isInvisible: Requireable[_] = js.native
  var showFor: Requireable[_] = js.native
  var showForLandscape: Requireable[_] = js.native
  var showForPortrait: Requireable[_] = js.native
  var showForSr: Requireable[_] = js.native
  var showOnFocus: Requireable[_] = js.native
  var showOnlyFor: Requireable[_] = js.native
}

