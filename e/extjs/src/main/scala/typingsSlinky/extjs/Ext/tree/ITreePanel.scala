package typingsSlinky.extjs.Ext.tree

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.data.IModel
import typingsSlinky.extjs.Ext.data.INodeInterface
import typingsSlinky.extjs.Ext.data.ITreeStore
import typingsSlinky.extjs.Ext.panel.ITable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITreePanel extends ITable {
  /** [Config Option] (Boolean) */
  @JSName("animate")
  var animate_ITreePanel: js.UndefOr[Boolean] = js.native
  /** [Method] Collapse all nodes
  		* @param callback Function A function to execute when the collapse finishes.
  		* @param scope Object The scope of the callback function
  		*/
  var collapseAll: js.UndefOr[
    js.Function2[/* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Collapses a record that is loaded in the tree
  		* @param record Ext.data.Model The record to collapse
  		* @param deep Boolean True to collapse nodes all the way up the tree hierarchy.
  		* @param callback Function The function to run after the collapse is completed
  		* @param scope Object The scope of the callback function.
  		*/
  var collapseNode: js.UndefOr[
    js.Function4[
      /* record */ js.UndefOr[IModel], 
      /* deep */ js.UndefOr[Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Config Option] (String) */
  var displayField: js.UndefOr[String] = js.native
  /** [Method] Expand all nodes
  		* @param callback Function A function to execute when the expand finishes.
  		* @param scope Object The scope of the callback function
  		*/
  var expandAll: js.UndefOr[
    js.Function2[/* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Expands a record that is loaded in the tree
  		* @param record Ext.data.Model The record to expand
  		* @param deep Boolean True to expand nodes all the way down the tree hierarchy.
  		* @param callback Function The function to run after the expand is completed
  		* @param scope Object The scope of the callback function.
  		*/
  var expandNode: js.UndefOr[
    js.Function4[
      /* record */ js.UndefOr[IModel], 
      /* deep */ js.UndefOr[Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Expand the tree to the path of a particular node
  		* @param path String The path to expand. The path should include a leading separator.
  		* @param field String The field to get the data from. Defaults to the model idProperty.
  		* @param separator String A separator to use.
  		* @param callback Function A function to execute when the expand finishes. The callback will be called with (success, lastNode) where success is if the expand was successful and lastNode is the last node that was expanded.
  		* @param scope Object The scope of the callback function
  		*/
  var expandPath: js.UndefOr[
    js.Function5[
      /* path */ js.UndefOr[String], 
      /* field */ js.UndefOr[String], 
      /* separator */ js.UndefOr[String], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Config Option] (Boolean) */
  var folderSort: js.UndefOr[Boolean] = js.native
  /** [Method] Retrieve an array of checked records
  		* @returns Ext.data.NodeInterface[] An array containing the checked records
  		*/
  var getChecked: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the root node for this tree
  		* @returns Ext.data.NodeInterface
  		*/
  var getRootNode: js.UndefOr[js.Function0[INodeInterface]] = js.native
  /** [Config Option] (Boolean) */
  var lines: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Ext.data.Model/Ext.data.NodeInterface/Object) */
  var root: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var rootVisible: js.UndefOr[Boolean] = js.native
  /** [Method] Expand the tree to the path of a particular node then select it
  		* @param path String The path to select. The path should include a leading separator.
  		* @param field String The field to get the data from. Defaults to the model idProperty.
  		* @param separator String A separator to use.
  		* @param callback Function A function to execute when the select finishes. The callback will be called with (bSuccess, oLastNode) where bSuccess is if the select was successful and oLastNode is the last node that was expanded.
  		* @param scope Object The scope of the callback function
  		*/
  var selectPath: js.UndefOr[
    js.Function5[
      /* path */ js.UndefOr[String], 
      /* field */ js.UndefOr[String], 
      /* separator */ js.UndefOr[String], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Sets root node of this tree
  		* @param root Ext.data.Model/Ext.data.NodeInterface/Object
  		* @returns Ext.data.NodeInterface The new root
  		*/
  var setRootNode: js.UndefOr[js.Function1[/* root */ js.UndefOr[js.Any], INodeInterface]] = js.native
  /** [Config Option] (Boolean) */
  var singleExpand: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Ext.data.TreeStore) */
  @JSName("store")
  var store_ITreePanel: js.UndefOr[ITreeStore] = js.native
  /** [Config Option] (Boolean) */
  var useArrows: js.UndefOr[Boolean] = js.native
}

object ITreePanel {
  @scala.inline
  def apply(): ITreePanel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITreePanel]
  }
  @scala.inline
  implicit class ITreePanelOps[Self <: ITreePanel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapseAll(value: (/* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseAll")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCollapseAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseAll")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapseNode(
      value: (/* record */ js.UndefOr[IModel], /* deep */ js.UndefOr[Boolean], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseNode")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutCollapseNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseNode")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayField")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandAll(value: (/* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandAll")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutExpandAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandAll")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandNode(
      value: (/* record */ js.UndefOr[IModel], /* deep */ js.UndefOr[Boolean], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandNode")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutExpandNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandNode")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandPath(
      value: (/* path */ js.UndefOr[String], /* field */ js.UndefOr[String], /* separator */ js.UndefOr[String], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandPath")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutExpandPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandPath")(js.undefined)
        ret
    }
    @scala.inline
    def withFolderSort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folderSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFolderSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folderSort")(js.undefined)
        ret
    }
    @scala.inline
    def withGetChecked(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChecked")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChecked")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRootNode(value: () => INodeInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRootNode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRootNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRootNode")(js.undefined)
        ret
    }
    @scala.inline
    def withLines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines")(js.undefined)
        ret
    }
    @scala.inline
    def withRoot(value: js.Any): Self = {
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
    def withRootVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectPath(
      value: (/* path */ js.UndefOr[String], /* field */ js.UndefOr[String], /* separator */ js.UndefOr[String], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectPath")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutSelectPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectPath")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRootNode(value: /* root */ js.UndefOr[js.Any] => INodeInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRootNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetRootNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRootNode")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleExpand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleExpand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleExpand")(js.undefined)
        ret
    }
    @scala.inline
    def withStore(value: ITreeStore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(js.undefined)
        ret
    }
    @scala.inline
    def withUseArrows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useArrows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseArrows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useArrows")(js.undefined)
        ret
    }
  }
  
}

