package typingsSlinky.prosemirrorModel.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeSpec
  extends /**
  * Allow specifying arbitrary fields on a NodeSpec.
  */
/* key */ StringDictionary[js.Any] {
  /**
    * Can be set to true to indicate that, though this isn't a [leaf
    * node](#model.NodeType.isLeaf), it doesn't have directly editable
    * content and should be treated as a single unit in the view.
    */
  var atom: js.UndefOr[Boolean | Null] = js.native
  /**
    * The attributes that nodes of this type get.
    */
  var attrs: js.UndefOr[StringDictionary[AttributeSpec] | Null] = js.native
  /**
    * Can be used to indicate that this node contains code, which
    * causes some commands to behave differently.
    */
  var code: js.UndefOr[Boolean | Null] = js.native
  /**
    * The content expression for this node, as described in the [schema
    * guide](/docs/guide/#schema.content_expressions). When not given,
    * the node does not allow any content.
    */
  var content: js.UndefOr[String | Null] = js.native
  /**
    * Determines whether this node is considered an important parent
    * node during replace operations (such as paste). Non-defining (the
    * default) nodes get dropped when their entire content is replaced,
    * whereas defining nodes persist and wrap the inserted content.
    * Likewise, in _inserted_ content the defining parents of the
    * content are preserved when possible. Typically,
    * non-default-paragraph textblock types, and possibly list items,
    * are marked as defining.
    */
  var defining: js.UndefOr[Boolean | Null] = js.native
  /**
    * Determines whether nodes of this type can be dragged without
    * being selected. Defaults to false.
    */
  var draggable: js.UndefOr[Boolean | Null] = js.native
  /**
    * The group or space-separated groups to which this node belongs,
    * which can be referred to in the content expressions for the
    * schema.
    */
  var group: js.UndefOr[String | Null] = js.native
  /**
    * Should be set to true for inline nodes. (Implied for text nodes.)
    */
  var `inline`: js.UndefOr[Boolean | Null] = js.native
  /**
    * When enabled (default is false), the sides of nodes of this type
    * count as boundaries that regular editing operations, like
    * backspacing or lifting, won't cross. An example of a node that
    * should probably have this enabled is a table cell.
    */
  var isolating: js.UndefOr[Boolean | Null] = js.native
  /**
    * The marks that are allowed inside of this node. May be a
    * space-separated string referring to mark names or groups, `"_"`
    * to explicitly allow all marks, or `""` to disallow marks. When
    * not given, nodes with inline content default to allowing all
    * marks, other nodes default to not allowing marks.
    */
  var marks: js.UndefOr[String | Null] = js.native
  /**
    * Associates DOM parser information with this node, which can be
    * used by [`DOMParser.fromSchema`](#model.DOMParser^fromSchema) to
    * automatically derive a parser. The `node` field in the rules is
    * implied (the name of this node will be filled in automatically).
    * If you supply your own parser, you do not need to also specify
    * parsing rules in your schema.
    */
  var parseDOM: js.UndefOr[js.Array[ParseRule] | Null] = js.native
  /**
    * Controls whether nodes of this type can be selected as a [node
    * selection](#state.NodeSelection). Defaults to true for non-text
    * nodes.
    */
  var selectable: js.UndefOr[Boolean | Null] = js.native
  /**
    * Defines the default way a node of this type should be serialized
    * to DOM/HTML (as used by
    * [`DOMSerializer.fromSchema`](#model.DOMSerializer^fromSchema)).
    * Should return a DOM node or an [array
    * structure](#model.DOMOutputSpec) that describes one, with an
    * optional number zero (“hole”) in it to indicate where the node's
    * content should be inserted.
    *
    * For text nodes, the default is to create a text DOM node. Though
    * it is possible to create a serializer where text is rendered
    * differently, this is not supported inside the editor, so you
    * shouldn't override that in your text node spec.
    */
  var toDOM: js.UndefOr[(js.Function1[/* node */ ProsemirrorNode[_], DOMOutputSpec]) | Null] = js.native
  /**
    * Defines the default way a node of this type should be serialized
    * to a string representation for debugging (e.g. in error messages).
    */
  var toDebugString: js.UndefOr[(js.Function1[/* node */ ProsemirrorNode[_], String]) | Null] = js.native
}

object NodeSpec {
  @scala.inline
  def apply(): NodeSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeSpec]
  }
  @scala.inline
  implicit class NodeSpecOps[Self <: NodeSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAtom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAtom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atom")(js.undefined)
        ret
    }
    @scala.inline
    def withAtomNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atom")(null)
        ret
    }
    @scala.inline
    def withAttrs(value: StringDictionary[AttributeSpec]): Self = {
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
    def withCode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
        ret
    }
    @scala.inline
    def withCodeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(null)
        ret
    }
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withContentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(null)
        ret
    }
    @scala.inline
    def withDefining(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defining")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefining: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defining")(js.undefined)
        ret
    }
    @scala.inline
    def withDefiningNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defining")(null)
        ret
    }
    @scala.inline
    def withDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggableNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(null)
        ret
    }
    @scala.inline
    def withGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(null)
        ret
    }
    @scala.inline
    def withInline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(js.undefined)
        ret
    }
    @scala.inline
    def withInlineNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(null)
        ret
    }
    @scala.inline
    def withIsolating(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isolating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsolating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isolating")(js.undefined)
        ret
    }
    @scala.inline
    def withIsolatingNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isolating")(null)
        ret
    }
    @scala.inline
    def withMarks(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marks")(js.undefined)
        ret
    }
    @scala.inline
    def withMarksNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marks")(null)
        ret
    }
    @scala.inline
    def withParseDOM(value: js.Array[ParseRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseDOM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParseDOM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseDOM")(js.undefined)
        ret
    }
    @scala.inline
    def withParseDOMNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseDOM")(null)
        ret
    }
    @scala.inline
    def withSelectable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectableNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(null)
        ret
    }
    @scala.inline
    def withToDOM(value: /* node */ ProsemirrorNode[_] => DOMOutputSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toDOM")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutToDOM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toDOM")(js.undefined)
        ret
    }
    @scala.inline
    def withToDOMNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toDOM")(null)
        ret
    }
    @scala.inline
    def withToDebugString(value: /* node */ ProsemirrorNode[_] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toDebugString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutToDebugString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toDebugString")(js.undefined)
        ret
    }
    @scala.inline
    def withToDebugStringNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toDebugString")(null)
        ret
    }
  }
  
}

