package typingsSlinky.reactNativeTabView.anon

import slinky.core.facade.ReactElement
import typingsSlinky.reactNativeTabView.tabBarIndicatorMod.Props
import typingsSlinky.reactNativeTabView.typesMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAccessibilityLabel extends js.Object {
  def getAccessibilityLabel(hasRoute: Scene[typingsSlinky.reactNativeTabView.typesMod.Route]): js.UndefOr[String]
  def getAccessible(hasRoute: Scene[typingsSlinky.reactNativeTabView.typesMod.Route]): Boolean
  def getLabelText(hasRoute: Scene[typingsSlinky.reactNativeTabView.typesMod.Route]): js.UndefOr[String]
  def getTestID(hasRoute: Scene[typingsSlinky.reactNativeTabView.typesMod.Route]): js.UndefOr[String]
  def renderIndicator(props: Props[typingsSlinky.reactNativeTabView.typesMod.Route]): ReactElement
}

object GetAccessibilityLabel {
  @scala.inline
  def apply(
    getAccessibilityLabel: Scene[typingsSlinky.reactNativeTabView.typesMod.Route] => js.UndefOr[String],
    getAccessible: Scene[typingsSlinky.reactNativeTabView.typesMod.Route] => Boolean,
    getLabelText: Scene[typingsSlinky.reactNativeTabView.typesMod.Route] => js.UndefOr[String],
    getTestID: Scene[typingsSlinky.reactNativeTabView.typesMod.Route] => js.UndefOr[String],
    renderIndicator: Props[typingsSlinky.reactNativeTabView.typesMod.Route] => ReactElement
  ): GetAccessibilityLabel = {
    val __obj = js.Dynamic.literal(getAccessibilityLabel = js.Any.fromFunction1(getAccessibilityLabel), getAccessible = js.Any.fromFunction1(getAccessible), getLabelText = js.Any.fromFunction1(getLabelText), getTestID = js.Any.fromFunction1(getTestID), renderIndicator = js.Any.fromFunction1(renderIndicator))
    __obj.asInstanceOf[GetAccessibilityLabel]
  }
}

