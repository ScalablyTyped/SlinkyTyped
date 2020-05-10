package typingsSlinky.reactSyntaxHighlighter.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.reactSyntaxHighlighter.lineTagPropsFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_SyntaxHighlighterProps_1113076166[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  @scala.inline
  def codeTagProps(value: HTMLProps[HTMLElement]): this.type = set("codeTagProps", value.asInstanceOf[js.Any])
  @scala.inline
  def customStyle(value: js.Any): this.type = set("customStyle", value.asInstanceOf[js.Any])
  @scala.inline
  def language(value: String): this.type = set("language", value.asInstanceOf[js.Any])
  @scala.inline
  def lineNumberStyle(value: js.Any): this.type = set("lineNumberStyle", value.asInstanceOf[js.Any])
  @scala.inline
  def linePropsFunction1(value: /* lineNumber */ Double => HTMLProps[HTMLElement]): this.type = set("lineProps", js.Any.fromFunction1(value))
  @scala.inline
  def lineProps(value: lineTagPropsFunction | HTMLProps[HTMLElement]): this.type = set("lineProps", value.asInstanceOf[js.Any])
  @scala.inline
  def showLineNumbers(value: Boolean): this.type = set("showLineNumbers", value.asInstanceOf[js.Any])
  @scala.inline
  def startingLineNumber(value: Double): this.type = set("startingLineNumber", value.asInstanceOf[js.Any])
  @scala.inline
  def style(value: js.Any): this.type = set("style", value.asInstanceOf[js.Any])
  @scala.inline
  def useInlineStyles(value: Boolean): this.type = set("useInlineStyles", value.asInstanceOf[js.Any])
}

