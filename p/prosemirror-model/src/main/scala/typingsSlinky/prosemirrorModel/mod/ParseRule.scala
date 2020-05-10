package typingsSlinky.prosemirrorModel.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.prosemirrorModel.prosemirrorModelBooleans.`false`
import typingsSlinky.prosemirrorModel.prosemirrorModelStrings.full
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseRule extends js.Object {
  /**
    * Attributes for the node or mark created by this rule. When
    * `getAttrs` is provided, it takes precedence.
    */
  var attrs: js.UndefOr[StringDictionary[js.Any] | Null] = js.native
  /**
    * For `tag` rules that produce non-leaf nodes or marks, by default
    * the content of the DOM element is parsed as content of the mark
    * or node. If the child nodes are in a descendent node, this may be
    * a CSS selector string that the parser must use to find the actual
    * content element, or a function that returns the actual content
    * element to the parser.
    */
  var contentElement: js.UndefOr[
    String | (js.Function1[/* p */ org.scalajs.dom.raw.Node, org.scalajs.dom.raw.Node]) | Null
  ] = js.native
  /**
    * When given, restricts this rule to only match when the current
    * context—the parent nodes into which the content is being
    * parsed—matches this expression. Should contain one or more node
    * names or node group names followed by single or double slashes.
    * For example `"paragraph/"` means the rule only matches when the
    * parent node is a paragraph, `"blockquote/paragraph/"` restricts
    * it to be in a paragraph that is inside a blockquote, and
    * `"section//"` matches any position inside a section—a double
    * slash matches any sequence of ancestor nodes. To allow multiple
    * different contexts, they can be separated by a pipe (`|`)
    * character, as in `"blockquote/|list_item/"`.
    */
  var context: js.UndefOr[String | Null] = js.native
  /**
    * A function used to compute the attributes for the node or mark
    * created by this rule. Can also be used to describe further
    * conditions the DOM element or style must match. When it returns
    * `false`, the rule won't match. When it returns null or undefined,
    * that is interpreted as an empty/default set of attributes.
    *
    * Called with a DOM Element for `tag` rules, and with a string (the
    * style's value) for `style` rules.
    */
  var getAttrs: js.UndefOr[
    (js.Function1[
      /* p */ org.scalajs.dom.raw.Node | String, 
      js.UndefOr[StringDictionary[_] | `false` | Null]
    ]) | Null
  ] = js.native
  /**
    * Can be used to override the content of a matched node. When
    * present, instead of parsing the node's child nodes, the result of
    * this function is used.
    */
  var getContent: js.UndefOr[
    (js.Function2[/* p */ org.scalajs.dom.raw.Node, /* schema */ js.Any, Fragment[_]]) | Null
  ] = js.native
  /**
    * When true, ignore content that matches this rule.
    */
  var ignore: js.UndefOr[Boolean | Null] = js.native
  /**
    * The name of the mark type to wrap the matched content in.
    */
  var mark: js.UndefOr[String | Null] = js.native
  /**
    * The namespace to match. This should be used with `tag`.
    * Nodes are only matched when the namespace matches or this property
    * is null.
    */
  var namespace: js.UndefOr[String | Null] = js.native
  /**
    * The name of the node type to create when this rule matches. Only
    * valid for rules with a `tag` property, not for style rules. Each
    * rule should have one of a `node`, `mark`, or `ignore` property
    * (except when it appears in a [node](#model.NodeSpec.parseDOM) or
    * [mark spec](#model.MarkSpec.parseDOM), in which case the `node`
    * or `mark` property will be derived from its position).
    */
  var node: js.UndefOr[String | Null] = js.native
  /**
    * Controls whether whitespace should be preserved when parsing the
    * content inside the matched element. `false` means whitespace may
    * be collapsed, `true` means that whitespace should be preserved
    * but newlines normalized to spaces, and `"full"` means that
    * newlines should also be preserved.
    */
  var preserveWhitespace: js.UndefOr[Boolean | full | Null] = js.native
  /**
    * Can be used to change the order in which the parse rules in a
    * schema are tried. Those with higher priority come first. Rules
    * without a priority are counted as having priority 50. This
    * property is only meaningful in a schema—when directly
    * constructing a parser, the order of the rule array is used.
    */
  var priority: js.UndefOr[Double | Null] = js.native
  /**
    * When true, ignore the node that matches this rule, but do parse
    * its content.
    */
  var skip: js.UndefOr[Boolean | Null] = js.native
  /**
    * A CSS property name to match. When given, this rule matches
    * inline styles that list that property. May also have the form
    * `"property=value"`, in which case the rule only matches if the
    * propery's value exactly matches the given value. (For more
    * complicated filters, use [`getAttrs`](#model.ParseRule.getAttrs)
    * and return undefined to indicate that the match failed.)
    */
  var style: js.UndefOr[String | Null] = js.native
  /**
    * A CSS selector describing the kind of DOM elements to match. A
    * single rule should have _either_ a `tag` or a `style` property.
    */
  var tag: js.UndefOr[String | Null] = js.native
}

object ParseRule {
  @scala.inline
  def apply(): ParseRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseRule]
  }
  @scala.inline
  implicit class ParseRuleOps[Self <: ParseRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttrs(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(js.undefined)
        ret
    }
    @scala.inline
    def withAttrsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(null)
        ret
    }
    @scala.inline
    def withContentElementFunction1(value: /* p */ org.scalajs.dom.raw.Node => org.scalajs.dom.raw.Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContentElement(value: String | (js.Function1[/* p */ org.scalajs.dom.raw.Node, org.scalajs.dom.raw.Node])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentElement")(js.undefined)
        ret
    }
    @scala.inline
    def withContentElementNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentElement")(null)
        ret
    }
    @scala.inline
    def withContext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withContextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(null)
        ret
    }
    @scala.inline
    def withGetAttrs(
      value: /* p */ org.scalajs.dom.raw.Node | String => js.UndefOr[StringDictionary[_] | `false` | Null]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttrs")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetAttrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttrs")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAttrsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttrs")(null)
        ret
    }
    @scala.inline
    def withGetContent(value: (/* p */ org.scalajs.dom.raw.Node, /* schema */ js.Any) => Fragment[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContent")(js.undefined)
        ret
    }
    @scala.inline
    def withGetContentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContent")(null)
        ret
    }
    @scala.inline
    def withIgnore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(null)
        ret
    }
    @scala.inline
    def withMark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mark")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mark")(null)
        ret
    }
    @scala.inline
    def withNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespaceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(null)
        ret
    }
    @scala.inline
    def withNode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(null)
        ret
    }
    @scala.inline
    def withPreserveWhitespace(value: Boolean | full): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveWhitespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveWhitespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveWhitespace")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveWhitespaceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveWhitespace")(null)
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
    @scala.inline
    def withPriorityNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(null)
        ret
    }
    @scala.inline
    def withSkip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(null)
        ret
    }
    @scala.inline
    def withStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(null)
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(js.undefined)
        ret
    }
    @scala.inline
    def withTagNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(null)
        ret
    }
  }
  
}

