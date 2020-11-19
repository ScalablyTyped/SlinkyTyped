package typingsSlinky.reactNativeTabView.anon

import slinky.core.facade.ReactElement
import typingsSlinky.reactNativeTabView.tabBarIndicatorMod.Props
import typingsSlinky.reactNativeTabView.typesMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAccessibilityLabel extends js.Object {
  
  def getAccessibilityLabel(hasRoute: Scene[typingsSlinky.reactNativeTabView.typesMod.Route]): js.UndefOr[String] = js.native
  
  def getAccessible(hasRoute: Scene[typingsSlinky.reactNativeTabView.typesMod.Route]): Boolean = js.native
  
  def getLabelText(hasRoute: Scene[typingsSlinky.reactNativeTabView.typesMod.Route]): js.UndefOr[String] = js.native
  
  def getTestID(hasRoute: Scene[typingsSlinky.reactNativeTabView.typesMod.Route]): js.UndefOr[String] = js.native
  
  def renderIndicator(props: Props[typingsSlinky.reactNativeTabView.typesMod.Route]): ReactElement = js.native
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
  
  @scala.inline
  implicit class GetAccessibilityLabelOps[Self <: GetAccessibilityLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetAccessibilityLabel(value: Scene[typingsSlinky.reactNativeTabView.typesMod.Route] => js.UndefOr[String]): Self = this.set("getAccessibilityLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAccessible(value: Scene[typingsSlinky.reactNativeTabView.typesMod.Route] => Boolean): Self = this.set("getAccessible", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLabelText(value: Scene[typingsSlinky.reactNativeTabView.typesMod.Route] => js.UndefOr[String]): Self = this.set("getLabelText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTestID(value: Scene[typingsSlinky.reactNativeTabView.typesMod.Route] => js.UndefOr[String]): Self = this.set("getTestID", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderIndicator(value: Props[typingsSlinky.reactNativeTabView.typesMod.Route] => ReactElement): Self = this.set("renderIndicator", js.Any.fromFunction1(value))
  }
}
