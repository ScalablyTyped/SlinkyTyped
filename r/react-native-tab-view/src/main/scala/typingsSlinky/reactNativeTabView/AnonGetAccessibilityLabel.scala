package typingsSlinky.reactNativeTabView

import slinky.core.facade.ReactElement
import typingsSlinky.reactNativeTabView.tabBarIndicatorMod.Props
import typingsSlinky.reactNativeTabView.typesMod.Route
import typingsSlinky.reactNativeTabView.typesMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGetAccessibilityLabel extends js.Object {
  def getAccessibilityLabel(hasRoute: Scene[Route]): js.UndefOr[String] = js.native
  def getAccessible(hasRoute: Scene[Route]): Boolean = js.native
  def getLabelText(hasRoute: Scene[Route]): js.UndefOr[String] = js.native
  def getTestID(hasRoute: Scene[Route]): js.UndefOr[String] = js.native
  def renderIndicator(props: Props[Route]): ReactElement = js.native
}

object AnonGetAccessibilityLabel {
  @scala.inline
  def apply(
    getAccessibilityLabel: Scene[Route] => js.UndefOr[String],
    getAccessible: Scene[Route] => Boolean,
    getLabelText: Scene[Route] => js.UndefOr[String],
    getTestID: Scene[Route] => js.UndefOr[String],
    renderIndicator: Props[Route] => ReactElement
  ): AnonGetAccessibilityLabel = {
    val __obj = js.Dynamic.literal(getAccessibilityLabel = js.Any.fromFunction1(getAccessibilityLabel), getAccessible = js.Any.fromFunction1(getAccessible), getLabelText = js.Any.fromFunction1(getLabelText), getTestID = js.Any.fromFunction1(getTestID), renderIndicator = js.Any.fromFunction1(renderIndicator))
    __obj.asInstanceOf[AnonGetAccessibilityLabel]
  }
  @scala.inline
  implicit class AnonGetAccessibilityLabelOps[Self <: AnonGetAccessibilityLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAccessibilityLabel(value: Scene[Route] => js.UndefOr[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAccessibilityLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAccessible(value: Scene[Route] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAccessible")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetLabelText(value: Scene[Route] => js.UndefOr[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabelText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetTestID(value: Scene[Route] => js.UndefOr[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTestID")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRenderIndicator(value: Props[Route] => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderIndicator")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

