package typingsSlinky.extjs.Ext

import typingsSlinky.extjs.Ext.data.IModel
import typingsSlinky.extjs.Ext.data.INodeInterface
import typingsSlinky.extjs.Ext.data.ITreeStore
import typingsSlinky.extjs.Ext.panel.ITable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  var displayField: js.UndefOr[java.lang.String] = js.native
  
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
      /* path */ js.UndefOr[java.lang.String], 
      /* field */ js.UndefOr[java.lang.String], 
      /* separator */ js.UndefOr[java.lang.String], 
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
      /* path */ js.UndefOr[java.lang.String], 
      /* field */ js.UndefOr[java.lang.String], 
      /* separator */ js.UndefOr[java.lang.String], 
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
  implicit class ITreePanelMutableBuilder[Self <: ITreePanel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    @scala.inline
    def setCollapseAll(value: (/* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "collapseAll", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCollapseAllUndefined: Self = StObject.set(x, "collapseAll", js.undefined)
    
    @scala.inline
    def setCollapseNode(
      value: (/* record */ js.UndefOr[IModel], /* deep */ js.UndefOr[Boolean], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "collapseNode", js.Any.fromFunction4(value))
    
    @scala.inline
    def setCollapseNodeUndefined: Self = StObject.set(x, "collapseNode", js.undefined)
    
    @scala.inline
    def setDisplayField(value: java.lang.String): Self = StObject.set(x, "displayField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayFieldUndefined: Self = StObject.set(x, "displayField", js.undefined)
    
    @scala.inline
    def setExpandAll(value: (/* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "expandAll", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExpandAllUndefined: Self = StObject.set(x, "expandAll", js.undefined)
    
    @scala.inline
    def setExpandNode(
      value: (/* record */ js.UndefOr[IModel], /* deep */ js.UndefOr[Boolean], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "expandNode", js.Any.fromFunction4(value))
    
    @scala.inline
    def setExpandNodeUndefined: Self = StObject.set(x, "expandNode", js.undefined)
    
    @scala.inline
    def setExpandPath(
      value: (/* path */ js.UndefOr[java.lang.String], /* field */ js.UndefOr[java.lang.String], /* separator */ js.UndefOr[java.lang.String], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "expandPath", js.Any.fromFunction5(value))
    
    @scala.inline
    def setExpandPathUndefined: Self = StObject.set(x, "expandPath", js.undefined)
    
    @scala.inline
    def setFolderSort(value: Boolean): Self = StObject.set(x, "folderSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderSortUndefined: Self = StObject.set(x, "folderSort", js.undefined)
    
    @scala.inline
    def setGetChecked(value: () => Array): Self = StObject.set(x, "getChecked", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCheckedUndefined: Self = StObject.set(x, "getChecked", js.undefined)
    
    @scala.inline
    def setGetRootNode(value: () => INodeInterface): Self = StObject.set(x, "getRootNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRootNodeUndefined: Self = StObject.set(x, "getRootNode", js.undefined)
    
    @scala.inline
    def setLines(value: Boolean): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
    
    @scala.inline
    def setRoot(value: js.Any): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setRootVisible(value: Boolean): Self = StObject.set(x, "rootVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootVisibleUndefined: Self = StObject.set(x, "rootVisible", js.undefined)
    
    @scala.inline
    def setSelectPath(
      value: (/* path */ js.UndefOr[java.lang.String], /* field */ js.UndefOr[java.lang.String], /* separator */ js.UndefOr[java.lang.String], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "selectPath", js.Any.fromFunction5(value))
    
    @scala.inline
    def setSelectPathUndefined: Self = StObject.set(x, "selectPath", js.undefined)
    
    @scala.inline
    def setSetRootNode(value: /* root */ js.UndefOr[js.Any] => INodeInterface): Self = StObject.set(x, "setRootNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRootNodeUndefined: Self = StObject.set(x, "setRootNode", js.undefined)
    
    @scala.inline
    def setSingleExpand(value: Boolean): Self = StObject.set(x, "singleExpand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleExpandUndefined: Self = StObject.set(x, "singleExpand", js.undefined)
    
    @scala.inline
    def setStore(value: ITreeStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    
    @scala.inline
    def setUseArrows(value: Boolean): Self = StObject.set(x, "useArrows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseArrowsUndefined: Self = StObject.set(x, "useArrows", js.undefined)
  }
}
