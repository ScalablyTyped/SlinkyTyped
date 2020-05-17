package typingsSlinky.markdownToJsx.anon

import slinky.core.ReactComponentClass
import typingsSlinky.markdownToJsx.mod.ComponentOverride
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Component[P, S] extends ComponentOverride[P, S] {
  var component: String | ReactComponentClass[P] = js.native
  var props: js.UndefOr[js.Any] = js.native
}

object Component {
  @scala.inline
  def apply[P, S](component: String | ReactComponentClass[P]): Component[P, S] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[Component[P, S]]
  }
  @scala.inline
  implicit class ComponentOps[Self[p, s] <: Component[p, s], P, S] (val x: Self[P, S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P, S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P, S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[P, S]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[P, S]) with Other]
    @scala.inline
    def withComponentFunctionComponent(value: ReactComponentClass[P]): Self[P, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentComponentClass(value: ReactComponentClass[P]): Self[P, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponent(value: String | ReactComponentClass[P]): Self[P, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProps(value: js.Any): Self[P, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProps: Self[P, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(js.undefined)
        ret
    }
  }
  
}

