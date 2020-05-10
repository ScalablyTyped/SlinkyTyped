package typingsSlinky.reactNavigationStack.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeaderTransitionConfig extends js.Object {
  var headerBackgroundInterpolator: js.UndefOr[SceneInterpolator] = js.native
  var headerLayoutInterpolator: js.UndefOr[SceneInterpolator] = js.native
  var headerLeftButtonInterpolator: js.UndefOr[SceneInterpolator] = js.native
  var headerLeftInterpolator: js.UndefOr[SceneInterpolator] = js.native
  var headerLeftLabelInterpolator: js.UndefOr[SceneInterpolator] = js.native
  var headerRightInterpolator: js.UndefOr[SceneInterpolator] = js.native
  var headerTitleFromLeftInterpolator: js.UndefOr[SceneInterpolator] = js.native
  var headerTitleInterpolator: js.UndefOr[SceneInterpolator] = js.native
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
    def withHeaderBackgroundInterpolator(value: /* props */ SceneInterpolatorProps => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerBackgroundInterpolator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHeaderBackgroundInterpolator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerBackgroundInterpolator")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderLayoutInterpolator(value: /* props */ SceneInterpolatorProps => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerLayoutInterpolator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHeaderLayoutInterpolator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerLayoutInterpolator")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderLeftButtonInterpolator(value: /* props */ SceneInterpolatorProps => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerLeftButtonInterpolator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHeaderLeftButtonInterpolator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerLeftButtonInterpolator")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderLeftInterpolator(value: /* props */ SceneInterpolatorProps => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerLeftInterpolator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHeaderLeftInterpolator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerLeftInterpolator")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderLeftLabelInterpolator(value: /* props */ SceneInterpolatorProps => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerLeftLabelInterpolator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHeaderLeftLabelInterpolator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerLeftLabelInterpolator")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderRightInterpolator(value: /* props */ SceneInterpolatorProps => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRightInterpolator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHeaderRightInterpolator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRightInterpolator")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderTitleFromLeftInterpolator(value: /* props */ SceneInterpolatorProps => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTitleFromLeftInterpolator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHeaderTitleFromLeftInterpolator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTitleFromLeftInterpolator")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderTitleInterpolator(value: /* props */ SceneInterpolatorProps => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTitleInterpolator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHeaderTitleInterpolator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTitleInterpolator")(js.undefined)
        ret
    }
  }
  
}

