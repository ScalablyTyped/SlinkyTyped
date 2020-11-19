package typingsSlinky.luminoDatagrid.datagridMod.DataGrid

import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.WheelEvent
import typingsSlinky.luminoDisposable.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object which handles mouse events for the data grid.
  */
@js.native
trait IMouseHandler extends IDisposable {
  
  /**
    * Handle the context menu event for the data grid.
    *
    * @param grid - The data grid of interest.
    *
    * @param event - The context menu event of interest.
    */
  def onContextMenu(grid: typingsSlinky.luminoDatagrid.datagridMod.DataGrid, event: MouseEvent): Unit = js.native
  
  /**
    * Handle the mouse double click event for the data grid.
    *
    * @param grid - The data grid of interest.
    *
    * @param event - The mouse double click event of interest.
    */
  def onMouseDoubleClick(grid: typingsSlinky.luminoDatagrid.datagridMod.DataGrid, event: MouseEvent): Unit = js.native
  
  /**
    * Handle the mouse down event for the data grid.
    *
    * @param grid - The data grid of interest.
    *
    * @param event - The mouse down event of interest.
    */
  def onMouseDown(grid: typingsSlinky.luminoDatagrid.datagridMod.DataGrid, event: MouseEvent): Unit = js.native
  
  /**
    * Handle the mouse hover event for the data grid.
    *
    * @param grid - The data grid of interest.
    *
    * @param event - The mouse hover event of interest.
    */
  def onMouseHover(grid: typingsSlinky.luminoDatagrid.datagridMod.DataGrid, event: MouseEvent): Unit = js.native
  
  /**
    * Handle the mouse leave event for the data grid.
    *
    * @param grid - The data grid of interest.
    *
    * @param event - The mouse hover event of interest.
    */
  def onMouseLeave(grid: typingsSlinky.luminoDatagrid.datagridMod.DataGrid, event: MouseEvent): Unit = js.native
  
  /**
    * Handle the mouse move event for the data grid.
    *
    * @param grid - The data grid of interest.
    *
    * @param event - The mouse move event of interest.
    */
  def onMouseMove(grid: typingsSlinky.luminoDatagrid.datagridMod.DataGrid, event: MouseEvent): Unit = js.native
  
  /**
    * Handle the mouse up event for the data grid.
    *
    * @param grid - The data grid of interest.
    *
    * @param event - The mouse up event of interest.
    */
  def onMouseUp(grid: typingsSlinky.luminoDatagrid.datagridMod.DataGrid, event: MouseEvent): Unit = js.native
  
  /**
    * Handle the wheel event for the data grid.
    *
    * @param grid - The data grid of interest.
    *
    * @param event - The wheel event of interest.
    */
  def onWheel(grid: typingsSlinky.luminoDatagrid.datagridMod.DataGrid, event: WheelEvent): Unit = js.native
  
  /**
    * Release any resources acquired during a mouse press.
    *
    * #### Notes
    * This method is called when the mouse should be released
    * independent of a mouseup event, such as an early detach.
    */
  def release(): Unit = js.native
}
object IMouseHandler {
  
  @scala.inline
  def apply(
    dispose: () => Unit,
    isDisposed: Boolean,
    onContextMenu: (typingsSlinky.luminoDatagrid.datagridMod.DataGrid, MouseEvent) => Unit,
    onMouseDoubleClick: (typingsSlinky.luminoDatagrid.datagridMod.DataGrid, MouseEvent) => Unit,
    onMouseDown: (typingsSlinky.luminoDatagrid.datagridMod.DataGrid, MouseEvent) => Unit,
    onMouseHover: (typingsSlinky.luminoDatagrid.datagridMod.DataGrid, MouseEvent) => Unit,
    onMouseLeave: (typingsSlinky.luminoDatagrid.datagridMod.DataGrid, MouseEvent) => Unit,
    onMouseMove: (typingsSlinky.luminoDatagrid.datagridMod.DataGrid, MouseEvent) => Unit,
    onMouseUp: (typingsSlinky.luminoDatagrid.datagridMod.DataGrid, MouseEvent) => Unit,
    onWheel: (typingsSlinky.luminoDatagrid.datagridMod.DataGrid, WheelEvent) => Unit,
    release: () => Unit
  ): IMouseHandler = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), isDisposed = isDisposed.asInstanceOf[js.Any], onContextMenu = js.Any.fromFunction2(onContextMenu), onMouseDoubleClick = js.Any.fromFunction2(onMouseDoubleClick), onMouseDown = js.Any.fromFunction2(onMouseDown), onMouseHover = js.Any.fromFunction2(onMouseHover), onMouseLeave = js.Any.fromFunction2(onMouseLeave), onMouseMove = js.Any.fromFunction2(onMouseMove), onMouseUp = js.Any.fromFunction2(onMouseUp), onWheel = js.Any.fromFunction2(onWheel), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[IMouseHandler]
  }
  
  @scala.inline
  implicit class IMouseHandlerOps[Self <: IMouseHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnContextMenu(value: (typingsSlinky.luminoDatagrid.datagridMod.DataGrid, MouseEvent) => Unit): Self = this.set("onContextMenu", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnMouseDoubleClick(value: (typingsSlinky.luminoDatagrid.datagridMod.DataGrid, MouseEvent) => Unit): Self = this.set("onMouseDoubleClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnMouseDown(value: (typingsSlinky.luminoDatagrid.datagridMod.DataGrid, MouseEvent) => Unit): Self = this.set("onMouseDown", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnMouseHover(value: (typingsSlinky.luminoDatagrid.datagridMod.DataGrid, MouseEvent) => Unit): Self = this.set("onMouseHover", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnMouseLeave(value: (typingsSlinky.luminoDatagrid.datagridMod.DataGrid, MouseEvent) => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnMouseMove(value: (typingsSlinky.luminoDatagrid.datagridMod.DataGrid, MouseEvent) => Unit): Self = this.set("onMouseMove", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnMouseUp(value: (typingsSlinky.luminoDatagrid.datagridMod.DataGrid, MouseEvent) => Unit): Self = this.set("onMouseUp", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnWheel(value: (typingsSlinky.luminoDatagrid.datagridMod.DataGrid, WheelEvent) => Unit): Self = this.set("onWheel", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRelease(value: () => Unit): Self = this.set("release", js.Any.fromFunction0(value))
  }
}
