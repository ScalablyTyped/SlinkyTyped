package typingsSlinky.antdMobile.anon

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderBodyComponent extends js.Object {
  var renderFooter: js.Any = js.native
  var renderHeader: js.Any = js.native
  var renderSectionHeader: js.Any = js.native
  def renderBodyComponent(): ReactElement = js.native
}

object RenderBodyComponent {
  @scala.inline
  def apply(
    renderBodyComponent: () => ReactElement,
    renderFooter: js.Any,
    renderHeader: js.Any,
    renderSectionHeader: js.Any
  ): RenderBodyComponent = {
    val __obj = js.Dynamic.literal(renderBodyComponent = js.Any.fromFunction0(renderBodyComponent), renderFooter = renderFooter.asInstanceOf[js.Any], renderHeader = renderHeader.asInstanceOf[js.Any], renderSectionHeader = renderSectionHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderBodyComponent]
  }
  @scala.inline
  implicit class RenderBodyComponentOps[Self <: RenderBodyComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRenderBodyComponent(value: () => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderBodyComponent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRenderFooter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderHeader(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderSectionHeader(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderSectionHeader")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

