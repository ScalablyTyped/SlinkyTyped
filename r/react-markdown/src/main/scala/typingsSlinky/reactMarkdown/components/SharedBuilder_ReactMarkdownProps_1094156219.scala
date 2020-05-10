package typingsSlinky.reactMarkdown.components

import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMarkdown.PartialRemarkParseOptions
import typingsSlinky.reactMarkdown.mod.LinkTargetResolver
import typingsSlinky.reactMarkdown.mod.MarkdownAbstractSyntaxTree
import typingsSlinky.reactMarkdown.mod.MdastPlugin
import typingsSlinky.reactMarkdown.mod.NodeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_ReactMarkdownProps_1094156219[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  @scala.inline
  def allowNode(
    value: (/* node */ MarkdownAbstractSyntaxTree, /* index */ Double, /* parent */ NodeType) => Boolean
  ): this.type = set("allowNode", js.Any.fromFunction3(value))
  @scala.inline
  def allowedTypes(value: js.Array[NodeType]): this.type = set("allowedTypes", value.asInstanceOf[js.Any])
  @scala.inline
  def astPlugins(value: js.Array[MdastPlugin]): this.type = set("astPlugins", value.asInstanceOf[js.Any])
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  @scala.inline
  def disallowedTypes(value: js.Array[NodeType]): this.type = set("disallowedTypes", value.asInstanceOf[js.Any])
  @scala.inline
  def escapeHtml(value: Boolean): this.type = set("escapeHtml", value.asInstanceOf[js.Any])
  @scala.inline
  def includeNodeIndex(value: Boolean): this.type = set("includeNodeIndex", value.asInstanceOf[js.Any])
  @scala.inline
  def linkTargetFunction3(value: (/* uri */ String, /* text */ String, /* title */ js.UndefOr[String]) => String): this.type = set("linkTarget", js.Any.fromFunction3(value))
  @scala.inline
  def linkTarget(value: String | LinkTargetResolver): this.type = set("linkTarget", value.asInstanceOf[js.Any])
  @scala.inline
  def parserOptions(value: PartialRemarkParseOptions): this.type = set("parserOptions", value.asInstanceOf[js.Any])
  @scala.inline
  def pluginsFunction0(value: () => Unit): this.type = set("plugins", js.Any.fromFunction0(value))
  @scala.inline
  def plugins(value: js.Array[_] | js.Function0[Unit]): this.type = set("plugins", value.asInstanceOf[js.Any])
  @scala.inline
  def rawSourcePos(value: Boolean): this.type = set("rawSourcePos", value.asInstanceOf[js.Any])
  @scala.inline
  def skipHtml(value: Boolean): this.type = set("skipHtml", value.asInstanceOf[js.Any])
  @scala.inline
  def source(value: String): this.type = set("source", value.asInstanceOf[js.Any])
  @scala.inline
  def sourcePos(value: Boolean): this.type = set("sourcePos", value.asInstanceOf[js.Any])
  @scala.inline
  def transformImageUri(
    value: (/* uri */ String, /* children */ js.UndefOr[TagMod[Any]], /* title */ js.UndefOr[String], /* alt */ js.UndefOr[String]) => String
  ): this.type = set("transformImageUri", js.Any.fromFunction4(value))
  @scala.inline
  def transformImageUriNull: this.type = set("transformImageUri", null)
  @scala.inline
  def transformLinkUri(
    value: (/* uri */ String, /* children */ js.UndefOr[TagMod[Any]], /* title */ js.UndefOr[String]) => String
  ): this.type = set("transformLinkUri", js.Any.fromFunction3(value))
  @scala.inline
  def transformLinkUriNull: this.type = set("transformLinkUri", null)
  @scala.inline
  def unwrapDisallowed(value: Boolean): this.type = set("unwrapDisallowed", value.asInstanceOf[js.Any])
}

