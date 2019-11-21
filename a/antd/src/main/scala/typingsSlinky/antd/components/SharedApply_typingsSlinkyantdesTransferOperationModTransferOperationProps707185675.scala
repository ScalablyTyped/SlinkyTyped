package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.antd.esTransferOperationMod.TransferOperationProps
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_typingsSlinkyantdesTransferOperationModTransferOperationProps707185675 (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  def apply(
    leftActive: js.UndefOr[Boolean] = js.undefined,
    leftArrowText: String = null,
    moveToLeft: SyntheticMouseEvent[HTMLButtonElement] => Unit = null,
    moveToRight: SyntheticMouseEvent[HTMLButtonElement] => Unit = null,
    rightActive: js.UndefOr[Boolean] = js.undefined,
    rightArrowText: String = null,
    style: CSSProperties = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(leftActive)) __obj.updateDynamic("leftActive")(leftActive.asInstanceOf[js.Any])
    if (leftArrowText != null) __obj.updateDynamic("leftArrowText")(leftArrowText.asInstanceOf[js.Any])
    if (moveToLeft != null) __obj.updateDynamic("moveToLeft")(js.Any.fromFunction1(moveToLeft))
    if (moveToRight != null) __obj.updateDynamic("moveToRight")(js.Any.fromFunction1(moveToRight))
    if (!js.isUndefined(rightActive)) __obj.updateDynamic("rightActive")(rightActive.asInstanceOf[js.Any])
    if (rightArrowText != null) __obj.updateDynamic("rightArrowText")(rightArrowText.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TransferOperationProps
}

