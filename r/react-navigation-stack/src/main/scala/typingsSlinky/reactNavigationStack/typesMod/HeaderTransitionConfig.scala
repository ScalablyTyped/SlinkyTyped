package typingsSlinky.reactNavigationStack.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderTransitionConfig extends js.Object {
  var headerBackgroundInterpolator: js.UndefOr[SceneInterpolator] = js.undefined
  var headerLayoutInterpolator: js.UndefOr[SceneInterpolator] = js.undefined
  var headerLeftButtonInterpolator: js.UndefOr[SceneInterpolator] = js.undefined
  var headerLeftInterpolator: js.UndefOr[SceneInterpolator] = js.undefined
  var headerLeftLabelInterpolator: js.UndefOr[SceneInterpolator] = js.undefined
  var headerRightInterpolator: js.UndefOr[SceneInterpolator] = js.undefined
  var headerTitleFromLeftInterpolator: js.UndefOr[SceneInterpolator] = js.undefined
  var headerTitleInterpolator: js.UndefOr[SceneInterpolator] = js.undefined
}

object HeaderTransitionConfig {
  @scala.inline
  def apply(): HeaderTransitionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderTransitionConfig]
  }
  @scala.inline
  implicit class HeaderTransitionConfigOps[Self <: HeaderTransitionConfig] (val x: Self) extends AnyVal {
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
    def setHeaderBackgroundInterpolator(value: /* props */ SceneInterpolatorProps => js.Any): Self = this.set("headerBackgroundInterpolator", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHeaderBackgroundInterpolator: Self = this.set("headerBackgroundInterpolator", js.undefined)
    @scala.inline
    def setHeaderLayoutInterpolator(value: /* props */ SceneInterpolatorProps => js.Any): Self = this.set("headerLayoutInterpolator", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHeaderLayoutInterpolator: Self = this.set("headerLayoutInterpolator", js.undefined)
    @scala.inline
    def setHeaderLeftButtonInterpolator(value: /* props */ SceneInterpolatorProps => js.Any): Self = this.set("headerLeftButtonInterpolator", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHeaderLeftButtonInterpolator: Self = this.set("headerLeftButtonInterpolator", js.undefined)
    @scala.inline
    def setHeaderLeftInterpolator(value: /* props */ SceneInterpolatorProps => js.Any): Self = this.set("headerLeftInterpolator", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHeaderLeftInterpolator: Self = this.set("headerLeftInterpolator", js.undefined)
    @scala.inline
    def setHeaderLeftLabelInterpolator(value: /* props */ SceneInterpolatorProps => js.Any): Self = this.set("headerLeftLabelInterpolator", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHeaderLeftLabelInterpolator: Self = this.set("headerLeftLabelInterpolator", js.undefined)
    @scala.inline
    def setHeaderRightInterpolator(value: /* props */ SceneInterpolatorProps => js.Any): Self = this.set("headerRightInterpolator", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHeaderRightInterpolator: Self = this.set("headerRightInterpolator", js.undefined)
    @scala.inline
    def setHeaderTitleFromLeftInterpolator(value: /* props */ SceneInterpolatorProps => js.Any): Self = this.set("headerTitleFromLeftInterpolator", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHeaderTitleFromLeftInterpolator: Self = this.set("headerTitleFromLeftInterpolator", js.undefined)
    @scala.inline
    def setHeaderTitleInterpolator(value: /* props */ SceneInterpolatorProps => js.Any): Self = this.set("headerTitleInterpolator", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHeaderTitleInterpolator: Self = this.set("headerTitleInterpolator", js.undefined)
  }
  
}

