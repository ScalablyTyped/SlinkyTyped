package typingsSlinky.antdMobile.anon

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderBodyComponent extends js.Object {
  var renderFooter: js.Any
  var renderHeader: js.Any
  var renderSectionHeader: js.Any
  def renderBodyComponent(): ReactElement
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
}

