package typingsSlinky.extjs.Ext

import typingsSlinky.extjs.Ext.data.IModel
import typingsSlinky.extjs.Ext.data.INodeInterface
import typingsSlinky.extjs.Ext.data.ITreeStore
import typingsSlinky.extjs.Ext.panel.ITable
import typingsSlinky.extjs.Ext.view.IDragZone
import typingsSlinky.extjs.Ext.view.IDropZone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tree {
  
  @js.native
  trait IColumn
    extends typingsSlinky.extjs.Ext.grid.column.IColumn
  object IColumn {
    
    @scala.inline
    def apply(): IColumn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IColumn]
    }
  }
  
  @js.native
  trait IPanel extends ITable {
    
    /** [Config Option] (Boolean) */
    @JSName("animate")
    var animate_IPanel: js.UndefOr[Boolean] = js.native
    
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
    var store_IPanel: js.UndefOr[ITreeStore] = js.native
    
    /** [Config Option] (Boolean) */
    var useArrows: js.UndefOr[Boolean] = js.native
  }
  object IPanel {
    
    @scala.inline
    def apply(): typingsSlinky.extjs.Ext.tree.IPanel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.extjs.Ext.tree.IPanel]
    }
    
    @scala.inline
    implicit class IPanelMutableBuilder[Self <: typingsSlinky.extjs.Ext.tree.IPanel] (val x: Self) extends AnyVal {
      
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
    def apply(): typingsSlinky.extjs.Ext.tree.ITreePanel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.extjs.Ext.tree.ITreePanel]
    }
    
    @scala.inline
    implicit class ITreePanelMutableBuilder[Self <: typingsSlinky.extjs.Ext.tree.ITreePanel] (val x: Self) extends AnyVal {
      
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
  
  @js.native
  trait IView
    extends typingsSlinky.extjs.Ext.view.ITable {
    
    /** [Config Option] (Boolean) */
    @JSName("animate")
    var animate_IView: js.UndefOr[Boolean] = js.native
    
    /** [Method] Collapses a record that is loaded in the view
      * @param record Ext.data.Model The record to collapse
      * @param deep Boolean True to collapse nodes all the way up the tree hierarchy.
      * @param callback Function The function to run after the collapse is completed
      * @param scope Object The scope of the callback function.
      */
    var collapse: js.UndefOr[
        js.Function4[
          /* record */ js.UndefOr[IModel], 
          /* deep */ js.UndefOr[Boolean], 
          /* callback */ js.UndefOr[js.Any], 
          /* scope */ js.UndefOr[js.Any], 
          Unit
        ]
      ] = js.native
    
    /** [Method] Expands a record that is loaded in the view
      * @param record Ext.data.Model The record to expand
      * @param deep Boolean True to expand nodes all the way down the tree hierarchy.
      * @param callback Function The function to run after the expand is completed
      * @param scope Object The scope of the callback function.
      */
    var expand: js.UndefOr[
        js.Function4[
          /* record */ js.UndefOr[IModel], 
          /* deep */ js.UndefOr[Boolean], 
          /* callback */ js.UndefOr[js.Any], 
          /* scope */ js.UndefOr[js.Any], 
          Unit
        ]
      ] = js.native
    
    /** [Method] Gets the listeners to bind to a new store
      * @returns Object The listeners to be bound to the store in object literal form. The scope may be omitted, it is assumed to be the current instance.
      */
    @JSName("getStoreListeners")
    var getStoreListeners_IView: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Gets the base TreeStore from the bound TreePanel  */
    var getTreeStore: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Property] (Boolean) */
    var isTreeView: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Boolean) */
    @JSName("loadMask")
    var loadMask_IView: js.UndefOr[Boolean] = js.native
    
    /** [Method] Template method it is called when a new store is bound to the current instance  */
    @JSName("onBindStore")
    var onBindStore_IView: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Method] Template method it is called when an existing store is unbound from the current instance  */
    @JSName("onUnbindStore")
    var onUnbindStore_IView: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Config Option] (Boolean) */
    var rootVisible: js.UndefOr[Boolean] = js.native
    
    /** [Method] Toggles a record between expanded and collapsed
      * @param record Ext.data.Model
      * @param deep Boolean True to collapse nodes all the way up the tree hierarchy.
      * @param callback Function The function to run after the expand/collapse is completed
      * @param scope Object The scope of the callback function.
      */
    var toggle: js.UndefOr[
        js.Function4[
          /* record */ js.UndefOr[IModel], 
          /* deep */ js.UndefOr[Boolean], 
          /* callback */ js.UndefOr[js.Any], 
          /* scope */ js.UndefOr[js.Any], 
          Unit
        ]
      ] = js.native
  }
  object IView {
    
    @scala.inline
    def apply(): IView = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IView]
    }
    
    @scala.inline
    implicit class IViewMutableBuilder[Self <: IView] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      @scala.inline
      def setCollapse(
        value: (/* record */ js.UndefOr[IModel], /* deep */ js.UndefOr[Boolean], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "collapse", js.Any.fromFunction4(value))
      
      @scala.inline
      def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
      
      @scala.inline
      def setExpand(
        value: (/* record */ js.UndefOr[IModel], /* deep */ js.UndefOr[Boolean], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "expand", js.Any.fromFunction4(value))
      
      @scala.inline
      def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
      
      @scala.inline
      def setGetStoreListeners(value: () => _): Self = StObject.set(x, "getStoreListeners", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetStoreListenersUndefined: Self = StObject.set(x, "getStoreListeners", js.undefined)
      
      @scala.inline
      def setGetTreeStore(value: () => Unit): Self = StObject.set(x, "getTreeStore", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTreeStoreUndefined: Self = StObject.set(x, "getTreeStore", js.undefined)
      
      @scala.inline
      def setIsTreeView(value: Boolean): Self = StObject.set(x, "isTreeView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTreeViewUndefined: Self = StObject.set(x, "isTreeView", js.undefined)
      
      @scala.inline
      def setLoadMask(value: Boolean): Self = StObject.set(x, "loadMask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadMaskUndefined: Self = StObject.set(x, "loadMask", js.undefined)
      
      @scala.inline
      def setOnBindStore(value: () => Unit): Self = StObject.set(x, "onBindStore", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnBindStoreUndefined: Self = StObject.set(x, "onBindStore", js.undefined)
      
      @scala.inline
      def setOnUnbindStore(value: () => Unit): Self = StObject.set(x, "onUnbindStore", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnUnbindStoreUndefined: Self = StObject.set(x, "onUnbindStore", js.undefined)
      
      @scala.inline
      def setRootVisible(value: Boolean): Self = StObject.set(x, "rootVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootVisibleUndefined: Self = StObject.set(x, "rootVisible", js.undefined)
      
      @scala.inline
      def setToggle(
        value: (/* record */ js.UndefOr[IModel], /* deep */ js.UndefOr[Boolean], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "toggle", js.Any.fromFunction4(value))
      
      @scala.inline
      def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
    }
  }
  
  type IViewDragZone = IDragZone
  
  @js.native
  trait IViewDropZone extends IDropZone {
    
    /** [Config Option] (Boolean) */
    var allowContainerDrop: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Boolean) */
    var allowParentInserts: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Boolean) */
    var appendOnly: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Number) */
    var expandDelay: js.UndefOr[Double] = js.native
    
    /** [Method] Moved out of the DropZone without dropping  */
    @JSName("notifyOut")
    var notifyOut_IViewDropZone: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Method] The mouse is no longer over a tree node so dropping is not valid
      * @param n Object
      * @param dd Object
      * @param e Object
      * @param data Object
      */
    @JSName("onNodeOut")
    var onNodeOut_IViewDropZone: js.UndefOr[
        js.Function4[
          /* n */ js.UndefOr[js.Any], 
          /* dd */ js.UndefOr[js.Any], 
          /* e */ js.UndefOr[js.Any], 
          /* data */ js.UndefOr[js.Any], 
          Unit
        ]
      ] = js.native
  }
  object IViewDropZone {
    
    @scala.inline
    def apply(): IViewDropZone = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IViewDropZone]
    }
    
    @scala.inline
    implicit class IViewDropZoneMutableBuilder[Self <: IViewDropZone] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowContainerDrop(value: Boolean): Self = StObject.set(x, "allowContainerDrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowContainerDropUndefined: Self = StObject.set(x, "allowContainerDrop", js.undefined)
      
      @scala.inline
      def setAllowParentInserts(value: Boolean): Self = StObject.set(x, "allowParentInserts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowParentInsertsUndefined: Self = StObject.set(x, "allowParentInserts", js.undefined)
      
      @scala.inline
      def setAppendOnly(value: Boolean): Self = StObject.set(x, "appendOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendOnlyUndefined: Self = StObject.set(x, "appendOnly", js.undefined)
      
      @scala.inline
      def setExpandDelay(value: Double): Self = StObject.set(x, "expandDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandDelayUndefined: Self = StObject.set(x, "expandDelay", js.undefined)
      
      @scala.inline
      def setNotifyOut(value: () => Unit): Self = StObject.set(x, "notifyOut", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNotifyOutUndefined: Self = StObject.set(x, "notifyOut", js.undefined)
      
      @scala.inline
      def setOnNodeOut(
        value: (/* n */ js.UndefOr[js.Any], /* dd */ js.UndefOr[js.Any], /* e */ js.UndefOr[js.Any], /* data */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "onNodeOut", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnNodeOutUndefined: Self = StObject.set(x, "onNodeOut", js.undefined)
    }
  }
  
  object plugin {
    
    @js.native
    trait ITreeViewDragDrop extends IAbstractPlugin {
      
      /** [Config Option] (Boolean) */
      var allowContainerDrops: js.UndefOr[Boolean] = js.native
      
      /** [Config Option] (Boolean) */
      var allowParentInserts: js.UndefOr[Boolean] = js.native
      
      /** [Config Option] (Boolean) */
      var appendOnly: js.UndefOr[Boolean] = js.native
      
      /** [Config Option] (Object/Boolean) */
      var containerScroll: js.UndefOr[js.Any] = js.native
      
      /** [Config Option] (String) */
      var ddGroup: js.UndefOr[java.lang.String] = js.native
      
      /** [Config Option] (String) */
      var displayField: js.UndefOr[java.lang.String] = js.native
      
      /** [Config Option] (String) */
      var dragGroup: js.UndefOr[java.lang.String] = js.native
      
      /** [Config Option] (String) */
      var dragText: js.UndefOr[java.lang.String] = js.native
      
      /** [Config Option] (String) */
      var dropGroup: js.UndefOr[java.lang.String] = js.native
      
      /** [Config Option] (Boolean) */
      var enableDrag: js.UndefOr[Boolean] = js.native
      
      /** [Config Option] (Boolean) */
      var enableDrop: js.UndefOr[Boolean] = js.native
      
      /** [Config Option] (Number) */
      var expandDelay: js.UndefOr[Double] = js.native
      
      /** [Method] The init method is invoked after initComponent method has been run for the client Component
        * @param view Object
        */
      @JSName("init")
      var init_ITreeViewDragDrop: js.UndefOr[js.Function1[/* view */ js.UndefOr[js.Any], Unit]] = js.native
      
      /** [Config Option] (String) */
      var nodeHighlightColor: js.UndefOr[java.lang.String] = js.native
      
      /** [Config Option] (Boolean) */
      var nodeHighlightOnDrop: js.UndefOr[Boolean] = js.native
      
      /** [Config Option] (Boolean) */
      var nodeHighlightOnRepair: js.UndefOr[Boolean] = js.native
      
      /** [Config Option] (Boolean) */
      var sortOnDrop: js.UndefOr[Boolean] = js.native
    }
    object ITreeViewDragDrop {
      
      @scala.inline
      def apply(): ITreeViewDragDrop = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ITreeViewDragDrop]
      }
      
      @scala.inline
      implicit class ITreeViewDragDropMutableBuilder[Self <: ITreeViewDragDrop] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAllowContainerDrops(value: Boolean): Self = StObject.set(x, "allowContainerDrops", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAllowContainerDropsUndefined: Self = StObject.set(x, "allowContainerDrops", js.undefined)
        
        @scala.inline
        def setAllowParentInserts(value: Boolean): Self = StObject.set(x, "allowParentInserts", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAllowParentInsertsUndefined: Self = StObject.set(x, "allowParentInserts", js.undefined)
        
        @scala.inline
        def setAppendOnly(value: Boolean): Self = StObject.set(x, "appendOnly", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAppendOnlyUndefined: Self = StObject.set(x, "appendOnly", js.undefined)
        
        @scala.inline
        def setContainerScroll(value: js.Any): Self = StObject.set(x, "containerScroll", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContainerScrollUndefined: Self = StObject.set(x, "containerScroll", js.undefined)
        
        @scala.inline
        def setDdGroup(value: java.lang.String): Self = StObject.set(x, "ddGroup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDdGroupUndefined: Self = StObject.set(x, "ddGroup", js.undefined)
        
        @scala.inline
        def setDisplayField(value: java.lang.String): Self = StObject.set(x, "displayField", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisplayFieldUndefined: Self = StObject.set(x, "displayField", js.undefined)
        
        @scala.inline
        def setDragGroup(value: java.lang.String): Self = StObject.set(x, "dragGroup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDragGroupUndefined: Self = StObject.set(x, "dragGroup", js.undefined)
        
        @scala.inline
        def setDragText(value: java.lang.String): Self = StObject.set(x, "dragText", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDragTextUndefined: Self = StObject.set(x, "dragText", js.undefined)
        
        @scala.inline
        def setDropGroup(value: java.lang.String): Self = StObject.set(x, "dropGroup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDropGroupUndefined: Self = StObject.set(x, "dropGroup", js.undefined)
        
        @scala.inline
        def setEnableDrag(value: Boolean): Self = StObject.set(x, "enableDrag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnableDragUndefined: Self = StObject.set(x, "enableDrag", js.undefined)
        
        @scala.inline
        def setEnableDrop(value: Boolean): Self = StObject.set(x, "enableDrop", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnableDropUndefined: Self = StObject.set(x, "enableDrop", js.undefined)
        
        @scala.inline
        def setExpandDelay(value: Double): Self = StObject.set(x, "expandDelay", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExpandDelayUndefined: Self = StObject.set(x, "expandDelay", js.undefined)
        
        @scala.inline
        def setInit(value: /* view */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
        
        @scala.inline
        def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
        
        @scala.inline
        def setNodeHighlightColor(value: java.lang.String): Self = StObject.set(x, "nodeHighlightColor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNodeHighlightColorUndefined: Self = StObject.set(x, "nodeHighlightColor", js.undefined)
        
        @scala.inline
        def setNodeHighlightOnDrop(value: Boolean): Self = StObject.set(x, "nodeHighlightOnDrop", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNodeHighlightOnDropUndefined: Self = StObject.set(x, "nodeHighlightOnDrop", js.undefined)
        
        @scala.inline
        def setNodeHighlightOnRepair(value: Boolean): Self = StObject.set(x, "nodeHighlightOnRepair", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNodeHighlightOnRepairUndefined: Self = StObject.set(x, "nodeHighlightOnRepair", js.undefined)
        
        @scala.inline
        def setSortOnDrop(value: Boolean): Self = StObject.set(x, "sortOnDrop", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSortOnDropUndefined: Self = StObject.set(x, "sortOnDrop", js.undefined)
      }
    }
  }
}
