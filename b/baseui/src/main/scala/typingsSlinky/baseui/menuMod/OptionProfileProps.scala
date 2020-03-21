package typingsSlinky.baseui.menuMod

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import typingsSlinky.baseui.AnonBody
import typingsSlinky.baseui.AnonListItemProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionProfileProps extends BaseMenuPropsT {
  @JSName("$isHighlighted")
  var $isHighlighted: js.UndefOr[Boolean] = js.native
  var getChildMenu: js.UndefOr[js.Function1[/* item */ js.Any, TagMod[Any]]] = js.native
  var item: js.Any = js.native
  var overrides: js.UndefOr[AnonListItemProfile] = js.native
  var resetMenu: js.UndefOr[js.Function0[Unit]] = js.native
  def getProfileItemImg(item: js.Any): String | ReactComponentClass[_] = js.native
  def getProfileItemImgText(item: js.Any): String = js.native
  def getProfileItemLabels(item: js.Any): AnonBody = js.native
}

