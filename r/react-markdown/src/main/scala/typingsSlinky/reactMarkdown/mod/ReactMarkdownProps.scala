package typingsSlinky.reactMarkdown.mod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import typingsSlinky.reactMarkdown.anon.PartialRemarkParseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactMarkdownProps extends js.Object {
  val allowNode: js.UndefOr[
    js.Function3[
      /* node */ MarkdownAbstractSyntaxTree, 
      /* index */ Double, 
      /* parent */ NodeType, 
      Boolean
    ]
  ] = js.native
  val allowedTypes: js.UndefOr[js.Array[NodeType]] = js.native
  val astPlugins: js.UndefOr[js.Array[MdastPlugin]] = js.native
  val className: js.UndefOr[String] = js.native
  val disallowedTypes: js.UndefOr[js.Array[NodeType]] = js.native
  val escapeHtml: js.UndefOr[Boolean] = js.native
  val includeNodeIndex: js.UndefOr[Boolean] = js.native
  val linkTarget: js.UndefOr[String | LinkTargetResolver] = js.native
  val parserOptions: js.UndefOr[PartialRemarkParseOptions] = js.native
  val plugins: js.UndefOr[js.Array[_] | js.Function0[Unit]] = js.native
  val rawSourcePos: js.UndefOr[Boolean] = js.native
  val renderers: js.UndefOr[StringDictionary[ReactComponentClass[_]]] = js.native
  val skipHtml: js.UndefOr[Boolean] = js.native
  val source: js.UndefOr[String] = js.native
  val sourcePos: js.UndefOr[Boolean] = js.native
  val transformImageUri: js.UndefOr[
    (js.Function4[
      /* uri */ String, 
      /* children */ js.UndefOr[TagMod[Any]], 
      /* title */ js.UndefOr[String], 
      /* alt */ js.UndefOr[String], 
      String
    ]) | Null
  ] = js.native
  val transformLinkUri: js.UndefOr[
    (js.Function3[
      /* uri */ String, 
      /* children */ js.UndefOr[TagMod[Any]], 
      /* title */ js.UndefOr[String], 
      String
    ]) | Null
  ] = js.native
  val unwrapDisallowed: js.UndefOr[Boolean] = js.native
}

object ReactMarkdownProps {
  @scala.inline
  def apply(): ReactMarkdownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactMarkdownProps]
  }
  @scala.inline
  implicit class ReactMarkdownPropsOps[Self <: ReactMarkdownProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowNode(
      value: (/* node */ MarkdownAbstractSyntaxTree, /* index */ Double, /* parent */ NodeType) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNode")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAllowNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNode")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedTypes(value: js.Array[NodeType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withAstPlugins(value: js.Array[MdastPlugin]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("astPlugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAstPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("astPlugins")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withDisallowedTypes(value: js.Array[NodeType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disallowedTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisallowedTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disallowedTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withEscapeHtml(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeHtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEscapeHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeHtml")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeNodeIndex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeNodeIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeNodeIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeNodeIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkTargetFunction3(value: (/* uri */ String, /* text */ String, /* title */ js.UndefOr[String]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkTarget")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withLinkTarget(value: String | LinkTargetResolver): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withParserOptions(value: PartialRemarkParseOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parserOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParserOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parserOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withPluginsFunction0(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[_] | js.Function0[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withRawSourcePos(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawSourcePos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRawSourcePos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawSourcePos")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderers(value: StringDictionary[ReactComponentClass[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderers")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipHtml(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipHtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipHtml")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withSourcePos(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcePos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourcePos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcePos")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformImageUri(
      value: (/* uri */ String, /* children */ js.UndefOr[TagMod[Any]], /* title */ js.UndefOr[String], /* alt */ js.UndefOr[String]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformImageUri")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutTransformImageUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformImageUri")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformImageUriNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformImageUri")(null)
        ret
    }
    @scala.inline
    def withTransformLinkUri(
      value: (/* uri */ String, /* children */ js.UndefOr[TagMod[Any]], /* title */ js.UndefOr[String]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformLinkUri")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutTransformLinkUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformLinkUri")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformLinkUriNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformLinkUri")(null)
        ret
    }
    @scala.inline
    def withUnwrapDisallowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unwrapDisallowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnwrapDisallowed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unwrapDisallowed")(js.undefined)
        ret
    }
  }
  
}

