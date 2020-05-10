package typingsSlinky.extjs.Ext.data

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.IBase
import typingsSlinky.extjs.Ext.tree.IPanel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INodeInterface extends IBase {
  /** [Config Option] (Boolean) */
  var allowDrag: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var allowDrop: js.UndefOr[Boolean] = js.native
  /** [Method] Inserts node s as the last child node of this node
  		* @param node Ext.data.NodeInterface/Ext.data.NodeInterface[]/Object The node or Array of nodes to append
  		* @param suppressEvents Boolean True to suppress firering of events.
  		* @param commit Boolean
  		* @returns Ext.data.NodeInterface The appended node if single append, or null if an array was passed
  		*/
  var appendChild: js.UndefOr[
    js.Function3[
      /* node */ js.UndefOr[js.Any], 
      /* suppressEvents */ js.UndefOr[Boolean], 
      /* commit */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.native
  /** [Method] Bubbles up the tree from this node calling the specified function with each node
  		* @param fn Function The function to call
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Node.
  		* @param args Array The args to call the function with. Defaults to passing the current Node.
  		*/
  var bubble: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* args */ js.UndefOr[Array], 
      Unit
    ]
  ] = js.native
  /** [Method] Cascades down the tree from this node calling the specified function with each node
  		* @param fn Function The function to call
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Node.
  		* @param args Array The args to call the function with. Defaults to passing the current Node.
  		*/
  var cascadeBy: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* args */ js.UndefOr[Array], 
      Unit
    ]
  ] = js.native
  /** [Config Option] (Boolean) */
  var checked: js.UndefOr[Boolean] = js.native
  /** [Property] (Ext.data.NodeInterface[]) */
  var childNodes: js.UndefOr[Array] = js.native
  /** [Config Option] (Ext.data.NodeInterface[]) */
  var children: js.UndefOr[Array] = js.native
  /** [Config Option] (String) */
  var cls: js.UndefOr[String] = js.native
  /** [Method] Collapse this node
  		* @param recursive Boolean True to recursively collapse all the children
  		* @param callback Function The function to execute once the collapse completes
  		* @param scope Object The scope to run the callback in
  		*/
  var collapse: js.UndefOr[
    js.Function3[
      /* recursive */ js.UndefOr[Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Collapse all the children of this node
  		* @param recursive Function True to recursively collapse all the children
  		* @param callback Function The function to execute once all the children are collapsed
  		* @param scope Object The scope to run the callback in
  		*/
  var collapseChildren: js.UndefOr[
    js.Function3[
      /* recursive */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Returns true if this node is an ancestor at any point of the passed node
  		* @param node Ext.data.NodeInterface
  		* @returns Boolean
  		*/
  var contains: js.UndefOr[js.Function1[/* node */ js.UndefOr[this.type], Boolean]] = js.native
  /** [Method] Creates a copy clone of this Node
  		* @param id String A new id, defaults to this Node's id.
  		* @param deep Boolean True to recursively copy all child Nodes into the new Node. False to copy without child Nodes.
  		* @returns Ext.data.NodeInterface A copy of this Node.
  		*/
  var copy: js.UndefOr[
    js.Function2[/* id */ js.UndefOr[String], /* deep */ js.UndefOr[Boolean], this.type]
  ] = js.native
  /** [Method] Ensures that the passed object is an instance of a Record with the NodeInterface applied
  		* @param node Object
  		* @returns Ext.data.NodeInterface
  		*/
  var createNode: js.UndefOr[js.Function1[/* node */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Config Option] (Number) */
  var depth: js.UndefOr[Double] = js.native
  /** [Method] Destroys the node
  		* @param silent Object
  		*/
  var destroy: js.UndefOr[js.Function1[/* silent */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Interates the child nodes of this node calling the specified function with each node
  		* @param fn Function The function to call
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Node in iteration.
  		* @param args Array The args to call the function with. Defaults to passing the current Node.
  		*/
  var eachChild: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* args */ js.UndefOr[Array], 
      Unit
    ]
  ] = js.native
  /** [Method] Expand this node
  		* @param recursive Boolean True to recursively expand all the children
  		* @param callback Function The function to execute once the expand completes
  		* @param scope Object The scope to run the callback in
  		*/
  var expand: js.UndefOr[
    js.Function3[
      /* recursive */ js.UndefOr[Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Expand all the children of this node
  		* @param recursive Boolean True to recursively expand all the children
  		* @param callback Function The function to execute once all the children are expanded
  		* @param scope Object The scope to run the callback in
  		*/
  var expandChildren: js.UndefOr[
    js.Function3[
      /* recursive */ js.UndefOr[Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Config Option] (Boolean) */
  var expandable: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var expanded: js.UndefOr[Boolean] = js.native
  /** [Method] Finds the first child that has the attribute with the specified value
  		* @param attribute String The attribute name
  		* @param value Object The value to search for
  		* @param deep Boolean True to search through nodes deeper than the immediate children
  		* @returns Ext.data.NodeInterface The found child or null if none was found
  		*/
  var findChild: js.UndefOr[
    js.Function3[
      /* attribute */ js.UndefOr[String], 
      /* value */ js.UndefOr[js.Any], 
      /* deep */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.native
  /** [Method] Finds the first child by a custom function
  		* @param fn Function A function which must return true if the passed Node is the required Node.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the Node being tested.
  		* @param deep Boolean True to search through nodes deeper than the immediate children
  		* @returns Ext.data.NodeInterface The found child or null if none was found
  		*/
  var findChildBy: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* deep */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.native
  /** [Property] (Ext.data.NodeInterface) */
  var firstChild: js.UndefOr[INodeInterface] = js.native
  /** [Method] Returns the child node at the specified index
  		* @param index Number
  		* @returns Ext.data.NodeInterface
  		*/
  var getChildAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], this.type]] = js.native
  /** [Method] Returns depth of this node the root node has a depth of 0
  		* @returns Number
  		*/
  var getDepth: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the tree this node is in
  		* @returns Ext.tree.Panel The tree panel which owns this node.
  		*/
  var getOwnerTree: js.UndefOr[js.Function0[IPanel]] = js.native
  /** [Method] Gets the hierarchical path from the root of the current node
  		* @param field String The field to construct the path from. Defaults to the model idProperty.
  		* @param separator String A separator to use.
  		* @returns String The node path
  		*/
  var getPath: js.UndefOr[
    js.Function2[/* field */ js.UndefOr[String], /* separator */ js.UndefOr[String], String]
  ] = js.native
  /** [Method] Returns true if this node has one or more child nodes else false
  		* @returns Boolean
  		*/
  var hasChildNodes: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (String) */
  var href: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var hrefTarget: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var icon: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var iconCls: js.UndefOr[String] = js.native
  /** [Config Option] (Number) */
  var index: js.UndefOr[Double] = js.native
  /** [Method] Returns the index of a child node
  		* @param node Ext.data.NodeInterface
  		* @returns Number The index of the node or -1 if it was not found
  		*/
  var indexOf: js.UndefOr[js.Function1[/* node */ js.UndefOr[this.type], Double]] = js.native
  /** [Method] Returns the index of a child node that matches the id
  		* @param id String The id of the node to find
  		* @returns Number The index of the node or -1 if it was not found
  		*/
  var indexOfId: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Double]] = js.native
  /** [Method] Inserts the first node before the second node in this nodes childNodes collection
  		* @param node Ext.data.NodeInterface The node to insert
  		* @param refNode Ext.data.NodeInterface The node to insert before (if null the node is appended)
  		* @returns Ext.data.NodeInterface The inserted node
  		*/
  var insertBefore: js.UndefOr[
    js.Function2[/* node */ js.UndefOr[this.type], /* refNode */ js.UndefOr[this.type], this.type]
  ] = js.native
  /** [Method] Inserts a node into this node
  		* @param index Number The zero-based index to insert the node at
  		* @param node Ext.data.NodeInterface The node to insert
  		* @returns Ext.data.NodeInterface The node you just inserted
  		*/
  var insertChild: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* node */ js.UndefOr[this.type], this.type]
  ] = js.native
  /** [Method] Returns true if the passed node is an ancestor at any point of this node
  		* @param node Ext.data.NodeInterface
  		* @returns Boolean
  		*/
  var isAncestor: js.UndefOr[js.Function1[/* node */ js.UndefOr[this.type], Boolean]] = js.native
  /** [Method] Returns true if this node has one or more child nodes or if the expandable node attribute is explicitly specified as
  		* @returns Boolean
  		*/
  var isExpandable: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns true if this node is expaned
  		* @returns Boolean
  		*/
  var isExpanded: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (Boolean) */
  var isFirst: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var isLast: js.UndefOr[Boolean] = js.native
  /** [Method] Returns true if this node is a leaf
  		* @returns Boolean
  		*/
  var isLeaf: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns true if this node is loaded
  		* @returns Boolean
  		*/
  var isLoaded: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns true if this node is loading
  		* @returns Boolean
  		*/
  var isLoading: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Property] (Boolean) */
  var isNode: js.UndefOr[Boolean] = js.native
  /** [Method] Returns true if this node is the root node
  		* @returns Boolean
  		*/
  var isRoot: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns true if this node is visible
  		* @returns Boolean
  		*/
  var isVisible: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Property] (Ext.data.NodeInterface) */
  var lastChild: js.UndefOr[INodeInterface] = js.native
  /** [Config Option] (Boolean) */
  var leaf: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var loaded: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var loading: js.UndefOr[Boolean] = js.native
  /** [Property] (Ext.data.NodeInterface) */
  var nextSibling: js.UndefOr[INodeInterface] = js.native
  /** [Config Option] (String) */
  var parentId: js.UndefOr[String] = js.native
  /** [Property] (Ext.data.NodeInterface) */
  var parentNode: js.UndefOr[INodeInterface] = js.native
  /** [Property] (Ext.data.NodeInterface) */
  var previousSibling: js.UndefOr[INodeInterface] = js.native
  /** [Config Option] (Number) */
  var qshowDelay: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var qtip: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var qtitle: js.UndefOr[String] = js.native
  /** [Method] Removes this node from its parent
  		* @param destroy Boolean True to destroy the node upon removal.
  		* @returns Ext.data.NodeInterface this
  		*/
  var remove: js.UndefOr[js.Function1[/* destroy */ js.UndefOr[Boolean], this.type]] = js.native
  /** [Method] Removes all child nodes from this node
  		* @param destroy Boolean True to destroy the node upon removal.
  		* @returns Ext.data.NodeInterface this
  		*/
  var removeAll: js.UndefOr[js.Function1[/* destroy */ js.UndefOr[Boolean], this.type]] = js.native
  /** [Method] Removes a child node from this node
  		* @param node Ext.data.NodeInterface The node to remove
  		* @param destroy Boolean True to destroy the node upon removal.
  		* @returns Ext.data.NodeInterface The removed node
  		*/
  var removeChild: js.UndefOr[
    js.Function2[/* node */ js.UndefOr[this.type], /* destroy */ js.UndefOr[Boolean], this.type]
  ] = js.native
  /** [Method] Replaces one child node in this node with another
  		* @param newChild Ext.data.NodeInterface The replacement node
  		* @param oldChild Ext.data.NodeInterface The node to replace
  		* @returns Ext.data.NodeInterface The replaced node
  		*/
  var replaceChild: js.UndefOr[
    js.Function2[
      /* newChild */ js.UndefOr[this.type], 
      /* oldChild */ js.UndefOr[this.type], 
      this.type
    ]
  ] = js.native
  /** [Config Option] (Boolean) */
  var root: js.UndefOr[Boolean] = js.native
  /** [Method] Creates an object representation of this node including its children  */
  var serialize: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Sorts this nodes children using the supplied sort function
  		* @param fn Function A function which, when passed two Nodes, returns -1, 0 or 1 depending upon required sort order.
  		* @param recursive Boolean True to apply this sort recursively
  		* @param suppressEvent Boolean True to not fire a sort event.
  		*/
  var sort: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* recursive */ js.UndefOr[Boolean], 
      /* suppressEvent */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.native
  /** [Config Option] (String) */
  var text: js.UndefOr[String] = js.native
  /** [Method] Updates general data of this node like isFirst isLast depth
  		* @param commit Boolean
  		* @param info Object The info to update. May contain any of the following
  		*/
  var updateInfo: js.UndefOr[
    js.Function2[/* commit */ js.UndefOr[Boolean], /* info */ js.UndefOr[js.Any], Unit]
  ] = js.native
}

object INodeInterface {
  @scala.inline
  def apply(): INodeInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INodeInterface]
  }
  @scala.inline
  implicit class INodeInterfaceOps[Self <: INodeInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowDrag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowDrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withAppendChild(
      value: (/* node */ js.UndefOr[js.Any], /* suppressEvents */ js.UndefOr[Boolean], /* commit */ js.UndefOr[Boolean]) => INodeInterface
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendChild")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAppendChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendChild")(js.undefined)
        ret
    }
    @scala.inline
    def withBubble(
      value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* args */ js.UndefOr[Array]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubble")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBubble: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubble")(js.undefined)
        ret
    }
    @scala.inline
    def withCascadeBy(
      value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* args */ js.UndefOr[Array]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cascadeBy")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCascadeBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cascadeBy")(js.undefined)
        ret
    }
    @scala.inline
    def withChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(js.undefined)
        ret
    }
    @scala.inline
    def withChildNodes(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withChildren(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cls")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapse(
      value: (/* recursive */ js.UndefOr[Boolean], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapseChildren(
      value: (/* recursive */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseChildren")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCollapseChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseChildren")(js.undefined)
        ret
    }
    @scala.inline
    def withContains(value: /* node */ js.UndefOr[INodeInterface] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutContains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.undefined)
        ret
    }
    @scala.inline
    def withCopy(value: (/* id */ js.UndefOr[String], /* deep */ js.UndefOr[Boolean]) => INodeInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateNode(value: /* node */ js.UndefOr[js.Any] => INodeInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreateNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createNode")(js.undefined)
        ret
    }
    @scala.inline
    def withDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: /* silent */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withEachChild(
      value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* args */ js.UndefOr[Array]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eachChild")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutEachChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eachChild")(js.undefined)
        ret
    }
    @scala.inline
    def withExpand(
      value: (/* recursive */ js.UndefOr[Boolean], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandChildren(
      value: (/* recursive */ js.UndefOr[Boolean], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandChildren")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutExpandChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandChildren")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandable")(js.undefined)
        ret
    }
    @scala.inline
    def withExpanded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(js.undefined)
        ret
    }
    @scala.inline
    def withFindChild(
      value: (/* attribute */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], /* deep */ js.UndefOr[Boolean]) => INodeInterface
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findChild")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFindChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findChild")(js.undefined)
        ret
    }
    @scala.inline
    def withFindChildBy(
      value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* deep */ js.UndefOr[Boolean]) => INodeInterface
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findChildBy")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFindChildBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findChildBy")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstChild(value: INodeInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstChild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstChild")(js.undefined)
        ret
    }
    @scala.inline
    def withGetChildAt(value: /* index */ js.UndefOr[Double] => INodeInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChildAt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetChildAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChildAt")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDepth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDepth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDepth")(js.undefined)
        ret
    }
    @scala.inline
    def withGetOwnerTree(value: () => IPanel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOwnerTree")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetOwnerTree: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOwnerTree")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPath(value: (/* field */ js.UndefOr[String], /* separator */ js.UndefOr[String]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPath")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPath")(js.undefined)
        ret
    }
    @scala.inline
    def withHasChildNodes(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasChildNodes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutHasChildNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasChildNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withHref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(js.undefined)
        ret
    }
    @scala.inline
    def withHrefTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hrefTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHrefTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hrefTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withIconCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconCls")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexOf(value: /* node */ js.UndefOr[INodeInterface] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexOf")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIndexOf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexOf")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexOfId(value: /* id */ js.UndefOr[String] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexOfId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIndexOfId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexOfId")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertBefore(
      value: (/* node */ js.UndefOr[INodeInterface], /* refNode */ js.UndefOr[INodeInterface]) => INodeInterface
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertBefore")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutInsertBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertChild(value: (/* index */ js.UndefOr[Double], /* node */ js.UndefOr[INodeInterface]) => INodeInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertChild")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutInsertChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertChild")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAncestor(value: /* node */ js.UndefOr[INodeInterface] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAncestor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsAncestor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAncestor")(js.undefined)
        ret
    }
    @scala.inline
    def withIsExpandable(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpandable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsExpandable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpandable")(js.undefined)
        ret
    }
    @scala.inline
    def withIsExpanded(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpanded")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpanded")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFirst(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFirst")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLast(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsLast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLast")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLeaf(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLeaf")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsLeaf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLeaf")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLoaded(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoaded")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsLoaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoaded")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLoading(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoading")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoading")(js.undefined)
        ret
    }
    @scala.inline
    def withIsNode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNode")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRoot(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRoot")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withIsVisible(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withLastChild(value: INodeInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastChild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastChild")(js.undefined)
        ret
    }
    @scala.inline
    def withLeaf(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeaf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaf")(js.undefined)
        ret
    }
    @scala.inline
    def withLoaded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaded")(js.undefined)
        ret
    }
    @scala.inline
    def withLoading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(js.undefined)
        ret
    }
    @scala.inline
    def withNextSibling(value: INodeInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSibling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextSibling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSibling")(js.undefined)
        ret
    }
    @scala.inline
    def withParentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentId")(js.undefined)
        ret
    }
    @scala.inline
    def withParentNode(value: INodeInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentNode")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousSibling(value: INodeInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousSibling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousSibling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousSibling")(js.undefined)
        ret
    }
    @scala.inline
    def withQshowDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qshowDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQshowDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qshowDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withQtip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qtip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQtip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qtip")(js.undefined)
        ret
    }
    @scala.inline
    def withQtitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qtitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQtitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qtitle")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: /* destroy */ js.UndefOr[Boolean] => INodeInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveAll(value: /* destroy */ js.UndefOr[Boolean] => INodeInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemoveAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAll")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveChild(
      value: (/* node */ js.UndefOr[INodeInterface], /* destroy */ js.UndefOr[Boolean]) => INodeInterface
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeChild")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRemoveChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeChild")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceChild(
      value: (/* newChild */ js.UndefOr[INodeInterface], /* oldChild */ js.UndefOr[INodeInterface]) => INodeInterface
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceChild")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutReplaceChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceChild")(js.undefined)
        ret
    }
    @scala.inline
    def withRoot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withSerialize(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSerialize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(
      value: (/* fn */ js.UndefOr[js.Any], /* recursive */ js.UndefOr[Boolean], /* suppressEvent */ js.UndefOr[Boolean]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateInfo(value: (/* commit */ js.UndefOr[Boolean], /* info */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateInfo")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUpdateInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateInfo")(js.undefined)
        ret
    }
  }
  
}

