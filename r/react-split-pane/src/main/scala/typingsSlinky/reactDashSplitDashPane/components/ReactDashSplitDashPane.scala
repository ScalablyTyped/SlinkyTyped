package typingsSlinky.reactDashSplitDashPane.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.MouseEvent
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.reactDashSplitDashPane.reactDashSplitDashPaneMod.Size
import typingsSlinky.reactDashSplitDashPane.reactDashSplitDashPaneMod.default
import typingsSlinky.reactDashSplitDashPane.reactDashSplitDashPaneStrings.first
import typingsSlinky.reactDashSplitDashPane.reactDashSplitDashPaneStrings.horizontal
import typingsSlinky.reactDashSplitDashPane.reactDashSplitDashPaneStrings.second
import typingsSlinky.reactDashSplitDashPane.reactDashSplitDashPaneStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashSplitDashPane
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-split-pane", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, onChange */
  def apply(
    allowResize: js.UndefOr[Boolean] = js.undefined,
    defaultSize: Size = null,
    maxSize: Size = null,
    minSize: Size = null,
    onDragFinished: /* newSize */ Double => Unit = null,
    onDragStarted: () => Unit = null,
    onResizerClick: /* event */ MouseEvent => Unit = null,
    onResizerDoubleClick: /* event */ MouseEvent => Unit = null,
    pane1Style: CSSProperties = null,
    pane2Style: CSSProperties = null,
    paneStyle: CSSProperties = null,
    primary: first | second = null,
    resizerClassName: String = null,
    resizerStyle: CSSProperties = null,
    size: Size = null,
    split: vertical | horizontal = null,
    step: Int | Double = null,
    style: CSSProperties = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowResize)) __obj.updateDynamic("allowResize")(allowResize.asInstanceOf[js.Any])
    if (defaultSize != null) __obj.updateDynamic("defaultSize")(defaultSize.asInstanceOf[js.Any])
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (onDragFinished != null) __obj.updateDynamic("onDragFinished")(js.Any.fromFunction1(onDragFinished))
    if (onDragStarted != null) __obj.updateDynamic("onDragStarted")(js.Any.fromFunction0(onDragStarted))
    if (onResizerClick != null) __obj.updateDynamic("onResizerClick")(js.Any.fromFunction1(onResizerClick))
    if (onResizerDoubleClick != null) __obj.updateDynamic("onResizerDoubleClick")(js.Any.fromFunction1(onResizerDoubleClick))
    if (pane1Style != null) __obj.updateDynamic("pane1Style")(pane1Style.asInstanceOf[js.Any])
    if (pane2Style != null) __obj.updateDynamic("pane2Style")(pane2Style.asInstanceOf[js.Any])
    if (paneStyle != null) __obj.updateDynamic("paneStyle")(paneStyle.asInstanceOf[js.Any])
    if (primary != null) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (resizerClassName != null) __obj.updateDynamic("resizerClassName")(resizerClassName.asInstanceOf[js.Any])
    if (resizerStyle != null) __obj.updateDynamic("resizerStyle")(resizerStyle.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (split != null) __obj.updateDynamic("split")(split.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typingsSlinky.reactDashSplitDashPane.reactDashSplitDashPaneMod.Props
}

