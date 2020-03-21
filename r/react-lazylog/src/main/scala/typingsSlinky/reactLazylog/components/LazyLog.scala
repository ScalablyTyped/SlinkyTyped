package typingsSlinky.reactLazylog.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.raw.Range
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactLazylog.lazyLogMod.LazyLogProps
import typingsSlinky.reactLazylog.lazyLogMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LazyLog
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-lazylog/build/LazyLog", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: style */
  def apply(
    url: String,
    caseInsensitive: js.UndefOr[Boolean] = js.undefined,
    containerStyle: CSSProperties = null,
    extraLines: Int | Double = null,
    fetchOptions: RequestInit = null,
    follow: js.UndefOr[Boolean] = js.undefined,
    formatPart: /* text */ String => TagMod[Any] = null,
    height: String | Double = null,
    highlight: Double | js.Array[Double] = null,
    highlightLineClassName: String = null,
    lineClassName: String = null,
    loadingComponent: js.Any = null,
    onError: /* error */ js.Any => _ = null,
    onHighlight: /* range */ Range => _ = null,
    onLoad: () => _ = null,
    overscanRowCount: Int | Double = null,
    rowHeight: Int | Double = null,
    scrollToLine: Int | Double = null,
    selectableLines: js.UndefOr[Boolean] = js.undefined,
    stream: js.UndefOr[Boolean] = js.undefined,
    text: String = null,
    width: String | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(caseInsensitive)) __obj.updateDynamic("caseInsensitive")(caseInsensitive.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (extraLines != null) __obj.updateDynamic("extraLines")(extraLines.asInstanceOf[js.Any])
    if (fetchOptions != null) __obj.updateDynamic("fetchOptions")(fetchOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(follow)) __obj.updateDynamic("follow")(follow.asInstanceOf[js.Any])
    if (formatPart != null) __obj.updateDynamic("formatPart")(js.Any.fromFunction1(formatPart))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (highlight != null) __obj.updateDynamic("highlight")(highlight.asInstanceOf[js.Any])
    if (highlightLineClassName != null) __obj.updateDynamic("highlightLineClassName")(highlightLineClassName.asInstanceOf[js.Any])
    if (lineClassName != null) __obj.updateDynamic("lineClassName")(lineClassName.asInstanceOf[js.Any])
    if (loadingComponent != null) __obj.updateDynamic("loadingComponent")(loadingComponent.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onHighlight != null) __obj.updateDynamic("onHighlight")(js.Any.fromFunction1(onHighlight))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction0(onLoad))
    if (overscanRowCount != null) __obj.updateDynamic("overscanRowCount")(overscanRowCount.asInstanceOf[js.Any])
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (scrollToLine != null) __obj.updateDynamic("scrollToLine")(scrollToLine.asInstanceOf[js.Any])
    if (!js.isUndefined(selectableLines)) __obj.updateDynamic("selectableLines")(selectableLines.asInstanceOf[js.Any])
    if (!js.isUndefined(stream)) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = LazyLogProps
}

