package typingsSlinky.agGrid

import typingsSlinky.agGrid.componentMod.Component
import typingsSlinky.agGrid.gridOptionsWrapperMod.GridOptionsWrapper
import typingsSlinky.agGrid.iCellEditorMod.ICellEditor
import typingsSlinky.agGrid.iCellEditorMod.ICellEditorComp
import typingsSlinky.agGrid.iCellEditorMod.ICellEditorParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popupEditorWrapperMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.agGrid.iComponentMod.IComponent because Already inherited
  - typingsSlinky.agGrid.iCellEditorMod.ICellEditorComp because var conflicts: afterGuiAttached, destroy, init. Inlined  */ @JSImport("ag-grid/dist/lib/rendering/cellEditors/popupEditorWrapper", "PopupEditorWrapper")
  @js.native
  class PopupEditorWrapper protected ()
    extends Component
       with ICellEditor {
    def this(cellEditor: ICellEditorComp) = this()
    
    @JSName("afterGuiAttached")
    def afterGuiAttached_MPopupEditorWrapper(): Unit = js.native
    
    var cellEditor: js.Any = js.native
    
    @JSName("focusIn")
    def focusIn_MPopupEditorWrapper(): Unit = js.native
    
    @JSName("focusOut")
    def focusOut_MPopupEditorWrapper(): Unit = js.native
    
    var getGuiCalledOnChild: js.Any = js.native
    
    var gridOptionsWrapper: GridOptionsWrapper = js.native
    
    @JSName("init")
    def init_MPopupEditorWrapper(params: ICellEditorParams): Unit = js.native
    
    @JSName("isCancelAfterEnd")
    def isCancelAfterEnd_MPopupEditorWrapper(): Boolean = js.native
    
    @JSName("isCancelBeforeStart")
    def isCancelBeforeStart_MPopupEditorWrapper(): Boolean = js.native
    
    @JSName("isPopup")
    def isPopup_MPopupEditorWrapper(): Boolean = js.native
    
    /* private */ def onKeyDown(event: js.Any): js.Any = js.native
    
    var params: js.Any = js.native
  }
  /* static members */
  object PopupEditorWrapper {
    
    @JSImport("ag-grid/dist/lib/rendering/cellEditors/popupEditorWrapper", "PopupEditorWrapper")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/rendering/cellEditors/popupEditorWrapper", "PopupEditorWrapper.DOM_KEY_POPUP_EDITOR_WRAPPER")
    @js.native
    def DOM_KEY_POPUP_EDITOR_WRAPPER: String = js.native
    @scala.inline
    def DOM_KEY_POPUP_EDITOR_WRAPPER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOM_KEY_POPUP_EDITOR_WRAPPER")(x.asInstanceOf[js.Any])
  }
}
