package typingsSlinky.mithril.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Virtual DOM nodes, or vnodes, are Javascript objects that represent an element (or parts of the DOM). */
@js.native
trait Vnode[Attrs, State /* <: Lifecycle[Attrs, State] */] extends js.Object {
  /** A hashmap of DOM attributes, events, properties and lifecycle methods. */
  var attrs: Attrs = js.native
  /** In most vnode types, the children property is an array of vnodes. For text and trusted HTML vnodes, The children property is either a string, a number or a boolean. */
  var children: js.UndefOr[ChildArrayOrPrimitive] = js.native
  /** The value used to map a DOM element to its respective item in an array of data. */
  var key: js.UndefOr[String | Double] = js.native
  /** An object that is persisted between redraws. In component vnodes, state is a shallow clone of the component object. */
  var state: State = js.native
  /** The nodeName of a DOM element. It may also be the string [ if a vnode is a fragment, # if it's a text vnode, or < if it's a trusted HTML vnode. Additionally, it may be a component. */
  var tag: String | (ComponentTypes[Attrs, State]) = js.native
  /**
  		 * This is used instead of children if a vnode contains a text node as its only child.
  		 * This is done for performance reasons.
  		 * Component vnodes never use the text property even if they have a text node as their only child.
  		 */
  var text: js.UndefOr[String | Double | Boolean] = js.native
}

object Vnode {
  @scala.inline
  def apply[Attrs, State](attrs: Attrs, state: State, tag: String | (ComponentTypes[Attrs, State])): Vnode[Attrs, State] = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vnode[Attrs, State]]
  }
  @scala.inline
  implicit class VnodeOps[Self[attrs, state] <: Vnode[attrs, state], Attrs, State] (val x: Self[Attrs, State]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Attrs, State] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Attrs, State]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Attrs, State]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Attrs, State]) with Other]
    @scala.inline
    def withAttrs(value: Attrs): Self[Attrs, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: State): Self[Attrs, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTagFunction1(value: /* vnode */ Vnode[Attrs, js.Object] => Component[Attrs, js.Object]): Self[Attrs, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTag(value: String | (ComponentTypes[Attrs, State])): Self[Attrs, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: ChildArrayOrPrimitive): Self[Attrs, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self[Attrs, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String | Double): Self[Attrs, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self[Attrs, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String | Double | Boolean): Self[Attrs, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self[Attrs, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

