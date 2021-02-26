package typingsSlinky.officeUiFabricReact

import slinky.core.facade.ReactElement
import typingsSlinky.officeUiFabricReact.anon.Column
import typingsSlinky.officeUiFabricReact.detailsRowCheckTypesMod.IDetailsRowCheckProps
import typingsSlinky.officeUiFabricReact.detailsRowTypesMod.IDetailsRowBaseProps
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object detailsRowBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsRow.base", "DetailsRowBase")
  @js.native
  class DetailsRowBase protected ()
    extends Component[IDetailsRowBaseProps, IDetailsRowState, js.Any] {
    def this(props: IDetailsRowBaseProps) = this()
    
    var _cellMeasurer: js.Any = js.native
    
    var _classNames: js.Any = js.native
    
    var _dragDropSubscription: js.Any = js.native
    
    var _droppingClassNames: js.Any = js.native
    
    var _events: js.Any = js.native
    
    var _focusZone: js.Any = js.native
    
    var _getRowDragDropOptions: js.Any = js.native
    
    /** Whether this.props.onDidMount has been called */
    var _onDidMountCalled: js.Any = js.native
    
    /* protected */ def _onRenderCheck(props: IDetailsRowCheckProps): ReactElement = js.native
    
    var _onSelectionChanged: js.Any = js.native
    
    var _root: js.Any = js.native
    
    var _rowClassNames: js.Any = js.native
    
    /**
      * update isDropping state based on the input value, which is used to change style during drag and drop
      *
      * when change to true, that means drag enter. we will add default dropping class name
      * or the custom dropping class name (return result from onDragEnter) to the root elemet.
      *
      * when change to false, that means drag leave. we will remove the dropping class name from root element.
      *
      * @param newValue - New isDropping state value
      * @param event - The event trigger dropping state change which can be dragenter, dragleave etc
      */
    var _updateDroppingState: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MDetailsRowBase(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDetailsRowBase(previousProps: IDetailsRowBaseProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MDetailsRowBase(): Unit = js.native
    
    def focus(): Boolean = js.native
    def focus(forceIntoFirstElement: Boolean): Boolean = js.native
    
    /**
      * measure cell at index. and call the call back with the measured cell width when finish measure
      *
      * @param index - The cell index
      * @param onMeasureDone - The call back function when finish measure
      */
    def measureCell(index: Double, onMeasureDone: js.Function1[/* width */ Double, Unit]): Unit = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MDetailsRowBase(nextProps: IDetailsRowBaseProps, nextState: IDetailsRowState): Boolean = js.native
  }
  /* static members */
  object DetailsRowBase {
    
    @JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsRow.base", "DetailsRowBase.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(nextProps: IDetailsRowBaseProps, previousState: IDetailsRowState): IDetailsRowState = js.native
  }
  
  @js.native
  trait IDetailsRowSelectionState extends StObject {
    
    var isSelected: Boolean = js.native
    
    var isSelectionModal: Boolean = js.native
  }
  object IDetailsRowSelectionState {
    
    @scala.inline
    def apply(isSelected: Boolean, isSelectionModal: Boolean): IDetailsRowSelectionState = {
      val __obj = js.Dynamic.literal(isSelected = isSelected.asInstanceOf[js.Any], isSelectionModal = isSelectionModal.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDetailsRowSelectionState]
    }
    
    @scala.inline
    implicit class IDetailsRowSelectionStateMutableBuilder[Self <: IDetailsRowSelectionState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSelectionModal(value: Boolean): Self = StObject.set(x, "isSelectionModal", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IDetailsRowState extends StObject {
    
    var columnMeasureInfo: js.UndefOr[Column] = js.native
    
    var isDropping: js.UndefOr[Boolean] = js.native
    
    var selectionState: IDetailsRowSelectionState = js.native
  }
  object IDetailsRowState {
    
    @scala.inline
    def apply(selectionState: IDetailsRowSelectionState): IDetailsRowState = {
      val __obj = js.Dynamic.literal(selectionState = selectionState.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDetailsRowState]
    }
    
    @scala.inline
    implicit class IDetailsRowStateMutableBuilder[Self <: IDetailsRowState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnMeasureInfo(value: Column): Self = StObject.set(x, "columnMeasureInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnMeasureInfoUndefined: Self = StObject.set(x, "columnMeasureInfo", js.undefined)
      
      @scala.inline
      def setIsDropping(value: Boolean): Self = StObject.set(x, "isDropping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDroppingUndefined: Self = StObject.set(x, "isDropping", js.undefined)
      
      @scala.inline
      def setSelectionState(value: IDetailsRowSelectionState): Self = StObject.set(x, "selectionState", value.asInstanceOf[js.Any])
    }
  }
}
