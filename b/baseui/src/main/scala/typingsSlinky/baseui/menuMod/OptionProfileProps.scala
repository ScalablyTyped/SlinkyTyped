package typingsSlinky.baseui.menuMod

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import typingsSlinky.baseui.Anon_Body
import typingsSlinky.baseui.Anon_ListItemProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionProfileProps extends js.Object {
  @JSName("$isHighlighted")
  var $isHighlighted: js.UndefOr[Boolean] = js.native
  var getChildMenu: js.UndefOr[js.Function1[/* item */ js.Any, TagMod[Any]]] = js.native
  var item: js.Any = js.native
  var overrides: js.UndefOr[Anon_ListItemProfile] = js.native
  var resetMenu: js.UndefOr[js.Function0[Unit]] = js.native
  def getProfileItemImg(item: js.Any): String | ReactComponentClass[_] = js.native
  def getProfileItemImgText(item: js.Any): String = js.native
  def getProfileItemLabels(item: js.Any): Anon_Body = js.native
}

