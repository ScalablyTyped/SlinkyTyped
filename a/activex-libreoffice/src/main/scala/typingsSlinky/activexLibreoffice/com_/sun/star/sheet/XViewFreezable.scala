package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** enables a {@link SpreadsheetView} to freeze columns and rows of the view. */
@js.native
trait XViewFreezable extends XInterface {
  
  /**
    * freezes panes with the specified number of columns and rows.
    *
    * To freeze only horizontally, specify nRows as 0. To freeze only vertically, specify nColumns as 0.
    */
  def freezeAtPosition(nColumns: Double, nRows: Double): Unit = js.native
  
  /**
    * returns `TRUE` if the view has frozen panes.
    *
    * Only one of {@link XViewSplitable.getIsWindowSplit()} and {@link XViewFreezable.hasFrozenPanes()} can be `TRUE` .
    */
  def hasFrozenPanes(): Boolean = js.native
}
object XViewFreezable {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    freezeAtPosition: (Double, Double) => Unit,
    hasFrozenPanes: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XViewFreezable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), freezeAtPosition = js.Any.fromFunction2(freezeAtPosition), hasFrozenPanes = js.Any.fromFunction0(hasFrozenPanes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XViewFreezable]
  }
  
  @scala.inline
  implicit class XViewFreezableMutableBuilder[Self <: XViewFreezable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFreezeAtPosition(value: (Double, Double) => Unit): Self = StObject.set(x, "freezeAtPosition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHasFrozenPanes(value: () => Boolean): Self = StObject.set(x, "hasFrozenPanes", js.Any.fromFunction0(value))
  }
}
