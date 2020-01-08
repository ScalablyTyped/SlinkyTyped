package typingsSlinky.reactDashSyntaxDashHighlighter.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.HTMLProps
import typingsSlinky.reactDashSyntaxDashHighlighter.lineTagPropsFunction
import typingsSlinky.reactDashSyntaxDashHighlighter.reactDashSyntaxDashHighlighterMod.SyntaxHighlighterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_SyntaxHighlighterProps_1507978106[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  def apply(
    codeTagProps: HTMLProps[HTMLElement] = null,
    customStyle: js.Any = null,
    language: String = null,
    lineNumberStyle: js.Any = null,
    lineProps: lineTagPropsFunction | HTMLProps[HTMLElement] = null,
    showLineNumbers: js.UndefOr[Boolean] = js.undefined,
    startingLineNumber: Int | Double = null,
    style: js.Any = null,
    useInlineStyles: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal()
    if (codeTagProps != null) __obj.updateDynamic("codeTagProps")(codeTagProps.asInstanceOf[js.Any])
    if (customStyle != null) __obj.updateDynamic("customStyle")(customStyle.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (lineNumberStyle != null) __obj.updateDynamic("lineNumberStyle")(lineNumberStyle.asInstanceOf[js.Any])
    if (lineProps != null) __obj.updateDynamic("lineProps")(lineProps.asInstanceOf[js.Any])
    if (!js.isUndefined(showLineNumbers)) __obj.updateDynamic("showLineNumbers")(showLineNumbers.asInstanceOf[js.Any])
    if (startingLineNumber != null) __obj.updateDynamic("startingLineNumber")(startingLineNumber.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(useInlineStyles)) __obj.updateDynamic("useInlineStyles")(useInlineStyles.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ComponentRef] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, ComponentRef](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SyntaxHighlighterProps
}

