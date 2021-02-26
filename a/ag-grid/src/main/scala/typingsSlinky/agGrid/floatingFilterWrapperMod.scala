package typingsSlinky.agGrid

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.agGrid.baseFilterMod.CombinedFilter
import typingsSlinky.agGrid.columnMod.Column
import typingsSlinky.agGrid.componentMod.Component
import typingsSlinky.agGrid.floatingFilterMod.FloatingFilterChange
import typingsSlinky.agGrid.floatingFilterMod.IFloatingFilterComp
import typingsSlinky.agGrid.floatingFilterMod.IFloatingFilterParams
import typingsSlinky.agGrid.iComponentMod.IComponent
import typingsSlinky.agGrid.utilsMod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object floatingFilterWrapperMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.agGrid.iComponentMod.IComponent because Already inherited
  - typingsSlinky.agGrid.floatingFilterWrapperMod.IFloatingFilterWrapperComp because var conflicts: afterGuiAttached, destroy, init. Inlined  */ @JSImport("ag-grid/dist/lib/filter/floatingFilterWrapper", "BaseFilterWrapperComp")
  @js.native
  abstract class BaseFilterWrapperComp[M, F /* <: FloatingFilterChange */, PC /* <: IFloatingFilterParams[M, F] */, P /* <: IFloatingFilterWrapperParams[M, F, PC] */] ()
    extends Component
       with IFloatingFilterWrapper[M] {
    def this(template: String) = this()
    
    /* private */ def addColumnHoverListener(): js.Any = js.native
    
    var beans: js.Any = js.native
    
    var column: Column = js.native
    
    var columnHoverService: js.Any = js.native
    
    var context: js.Any = js.native
    
    def enrichBody(body: HTMLElement): Unit = js.native
    
    var eventService: js.Any = js.native
    
    @JSName("init")
    def init_MBaseFilterWrapperComp(params: P): Unit | Promise[Unit] = js.native
    
    /* private */ def onColumnHover(): js.Any = js.native
    
    /* private */ def onColumnWidthChanged(): js.Any = js.native
    
    /* private */ def setupWidth(): js.Any = js.native
  }
  
  @JSImport("ag-grid/dist/lib/filter/floatingFilterWrapper", "EmptyFloatingFilterWrapperComp")
  @js.native
  class EmptyFloatingFilterWrapperComp ()
    extends BaseFilterWrapperComp[js.Any, js.Any, js.Any, js.Any] {
    def this(template: String) = this()
  }
  
  @JSImport("ag-grid/dist/lib/filter/floatingFilterWrapper", "FloatingFilterWrapperComp")
  @js.native
  class FloatingFilterWrapperComp[M, F /* <: FloatingFilterChange */, PC /* <: IFloatingFilterParams[M, F] */, P /* <: IFloatingFilterWrapperParams[M, F, PC] */] () extends BaseFilterWrapperComp[M, F, PC, P] {
    def this(template: String) = this()
    
    /* private */ def addEventListeners(): js.Any = js.native
    
    var eButtonShowMainFilter: HTMLInputElement = js.native
    
    var floatingFilterCompPromise: Promise[IFloatingFilterComp[M, F, PC]] = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    @JSName("init")
    def init_MFloatingFilterWrapperComp(params: P): Unit = js.native
    
    var menuFactory: js.Any = js.native
    
    def onParentModelChanged(parentModel: CombinedFilter[M]): Unit = js.native
    
    /* private */ def showParentFilter(): js.Any = js.native
    
    var suppressFilterButton: Boolean = js.native
  }
  
  @js.native
  trait IFloatingFilterWrapper[M] extends StObject {
    
    def onParentModelChanged(parentModel: M): Unit = js.native
  }
  object IFloatingFilterWrapper {
    
    @scala.inline
    def apply[M](onParentModelChanged: M => Unit): IFloatingFilterWrapper[M] = {
      val __obj = js.Dynamic.literal(onParentModelChanged = js.Any.fromFunction1(onParentModelChanged))
      __obj.asInstanceOf[IFloatingFilterWrapper[M]]
    }
    
    @scala.inline
    implicit class IFloatingFilterWrapperMutableBuilder[Self <: IFloatingFilterWrapper[_], M] (val x: Self with IFloatingFilterWrapper[M]) extends AnyVal {
      
      @scala.inline
      def setOnParentModelChanged(value: M => Unit): Self = StObject.set(x, "onParentModelChanged", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IFloatingFilterWrapperComp[M, F /* <: FloatingFilterChange */, PC /* <: IFloatingFilterParams[M, F] */, P /* <: IFloatingFilterWrapperParams[M, F, PC] */]
    extends IFloatingFilterWrapper[M]
       with IComponent[P]
  object IFloatingFilterWrapperComp {
    
    @scala.inline
    def apply[M, F /* <: FloatingFilterChange */, PC /* <: IFloatingFilterParams[M, F] */, P /* <: IFloatingFilterWrapperParams[M, F, PC] */](getGui: () => HTMLElement, onParentModelChanged: M => Unit): IFloatingFilterWrapperComp[M, F, PC, P] = {
      val __obj = js.Dynamic.literal(getGui = js.Any.fromFunction0(getGui), onParentModelChanged = js.Any.fromFunction1(onParentModelChanged))
      __obj.asInstanceOf[IFloatingFilterWrapperComp[M, F, PC, P]]
    }
  }
  
  @js.native
  trait IFloatingFilterWrapperParams[M, F /* <: FloatingFilterChange */, P /* <: IFloatingFilterParams[M, F] */] extends StObject {
    
    var column: Column = js.native
    
    var floatingFilterComp: Promise[IFloatingFilterComp[M, F, P]] = js.native
    
    var suppressFilterButton: Boolean = js.native
  }
  object IFloatingFilterWrapperParams {
    
    @scala.inline
    def apply[M, F /* <: FloatingFilterChange */, P /* <: IFloatingFilterParams[M, F] */](
      column: Column,
      floatingFilterComp: Promise[IFloatingFilterComp[M, F, P]],
      suppressFilterButton: Boolean
    ): IFloatingFilterWrapperParams[M, F, P] = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], floatingFilterComp = floatingFilterComp.asInstanceOf[js.Any], suppressFilterButton = suppressFilterButton.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFloatingFilterWrapperParams[M, F, P]]
    }
    
    @scala.inline
    implicit class IFloatingFilterWrapperParamsMutableBuilder[Self <: IFloatingFilterWrapperParams[_, _, _], M, F /* <: FloatingFilterChange */, P /* <: IFloatingFilterParams[M, F] */] (val x: Self with (IFloatingFilterWrapperParams[M, F, P])) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Column): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatingFilterComp(value: Promise[IFloatingFilterComp[M, F, P]]): Self = StObject.set(x, "floatingFilterComp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressFilterButton(value: Boolean): Self = StObject.set(x, "suppressFilterButton", value.asInstanceOf[js.Any])
    }
  }
}
