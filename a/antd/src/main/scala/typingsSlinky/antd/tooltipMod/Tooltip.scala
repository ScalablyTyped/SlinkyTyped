package typingsSlinky.antd.tooltipMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.antd.contextMod.ConfigConsumerProps
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tooltip
  extends Component[TooltipProps, js.Any, js.Any] {
  var tooltip: js.Any = js.native
  def getOverlay(): js.Object = js.native
  def getPlacements(): js.Any = js.native
  def getPopupDomNode(): js.Any = js.native
  def isNoTitle(): Boolean = js.native
  def onPopupAlign(domNode: HTMLElement, align: js.Any): Unit = js.native
  def onVisibleChange(visible: Boolean): Unit = js.native
  def renderTooltip(hasGetPopupContainerGetPrefixClsDirection: ConfigConsumerProps): ReactElement = js.native
  def saveTooltip(
    node: ForwardRefExoticComponent[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_Tooltip.TooltipProps */ js.Any) with RefAttributes[_]
    ]
  ): Unit = js.native
}

