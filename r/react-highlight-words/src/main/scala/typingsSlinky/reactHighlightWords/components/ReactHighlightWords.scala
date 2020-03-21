package typingsSlinky.reactHighlightWords.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactHighlightWords.mod.Chunk
import typingsSlinky.reactHighlightWords.mod.FindChunks
import typingsSlinky.reactHighlightWords.mod.HighlighterProps
import typingsSlinky.reactHighlightWords.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactHighlightWords
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-highlight-words", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    searchWords: js.Array[String],
    textToHighlight: String,
    activeClassName: String = null,
    activeIndex: Int | Double = null,
    activeStyle: CSSProperties = null,
    autoEscape: js.UndefOr[Boolean] = js.undefined,
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    findChunks: /* options */ FindChunks => js.Array[Chunk] = null,
    highlightClassName: String = null,
    highlightStyle: CSSProperties = null,
    highlightTag: String | ReactComponentClass[_] = null,
    sanitize: /* text */ String => String = null,
    unhighlightClassName: String = null,
    unhighlightStyle: CSSProperties = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(searchWords = searchWords.asInstanceOf[js.Any], textToHighlight = textToHighlight.asInstanceOf[js.Any])
    if (activeClassName != null) __obj.updateDynamic("activeClassName")(activeClassName.asInstanceOf[js.Any])
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (activeStyle != null) __obj.updateDynamic("activeStyle")(activeStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(autoEscape)) __obj.updateDynamic("autoEscape")(autoEscape.asInstanceOf[js.Any])
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.asInstanceOf[js.Any])
    if (findChunks != null) __obj.updateDynamic("findChunks")(js.Any.fromFunction1(findChunks))
    if (highlightClassName != null) __obj.updateDynamic("highlightClassName")(highlightClassName.asInstanceOf[js.Any])
    if (highlightStyle != null) __obj.updateDynamic("highlightStyle")(highlightStyle.asInstanceOf[js.Any])
    if (highlightTag != null) __obj.updateDynamic("highlightTag")(highlightTag.asInstanceOf[js.Any])
    if (sanitize != null) __obj.updateDynamic("sanitize")(js.Any.fromFunction1(sanitize))
    if (unhighlightClassName != null) __obj.updateDynamic("unhighlightClassName")(unhighlightClassName.asInstanceOf[js.Any])
    if (unhighlightStyle != null) __obj.updateDynamic("unhighlightStyle")(unhighlightStyle.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = HighlighterProps
}

