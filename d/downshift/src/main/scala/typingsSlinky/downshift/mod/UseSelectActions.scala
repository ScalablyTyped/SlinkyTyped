package typingsSlinky.downshift.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseSelectActions[Item] extends StObject {
  
  def closeMenu(): Unit = js.native
  
  def openMenu(): Unit = js.native
  
  def reset(): Unit = js.native
  
  def selectItem(item: Item): Unit = js.native
  
  def setHighlightedIndex(index: Double): Unit = js.native
  
  def toggleMenu(): Unit = js.native
}
object UseSelectActions {
  
  @scala.inline
  def apply[Item](
    closeMenu: () => Unit,
    openMenu: () => Unit,
    reset: () => Unit,
    selectItem: Item => Unit,
    setHighlightedIndex: Double => Unit,
    toggleMenu: () => Unit
  ): UseSelectActions[Item] = {
    val __obj = js.Dynamic.literal(closeMenu = js.Any.fromFunction0(closeMenu), openMenu = js.Any.fromFunction0(openMenu), reset = js.Any.fromFunction0(reset), selectItem = js.Any.fromFunction1(selectItem), setHighlightedIndex = js.Any.fromFunction1(setHighlightedIndex), toggleMenu = js.Any.fromFunction0(toggleMenu))
    __obj.asInstanceOf[UseSelectActions[Item]]
  }
  
  @scala.inline
  implicit class UseSelectActionsMutableBuilder[Self <: UseSelectActions[_], Item] (val x: Self with UseSelectActions[Item]) extends AnyVal {
    
    @scala.inline
    def setCloseMenu(value: () => Unit): Self = StObject.set(x, "closeMenu", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpenMenu(value: () => Unit): Self = StObject.set(x, "openMenu", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelectItem(value: Item => Unit): Self = StObject.set(x, "selectItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHighlightedIndex(value: Double => Unit): Self = StObject.set(x, "setHighlightedIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToggleMenu(value: () => Unit): Self = StObject.set(x, "toggleMenu", js.Any.fromFunction0(value))
  }
}
