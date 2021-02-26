package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * enables a {@link SpreadsheetView} to split the view.
  * @deprecated Deprecated
  */
@js.native
trait XViewSplitable extends XInterface {
  
  /**
    * returns `TRUE` if the view is split into individual panes.
    *
    * Only one of {@link XViewSplitable.getIsWindowSplit()} and {@link XViewFreezable.hasFrozenPanes()} can be `TRUE` .
    */
  val IsWindowSplit: Boolean = js.native
  
  /** returns the column before which the view is split. */
  val SplitColumn: Double = js.native
  
  /** returns the horizontal position in pixels where the view is split. */
  val SplitHorizontal: Double = js.native
  
  /** returns the row before which the view is split. */
  val SplitRow: Double = js.native
  
  /** returns the vertical position in pixels where the view is split. */
  val SplitVertical: Double = js.native
  
  /**
    * returns `TRUE` if the view is split into individual panes.
    *
    * Only one of {@link XViewSplitable.getIsWindowSplit()} and {@link XViewFreezable.hasFrozenPanes()} can be `TRUE` .
    */
  def getIsWindowSplit(): Boolean = js.native
  
  /** returns the column before which the view is split. */
  def getSplitColumn(): Double = js.native
  
  /** returns the horizontal position in pixels where the view is split. */
  def getSplitHorizontal(): Double = js.native
  
  /** returns the row before which the view is split. */
  def getSplitRow(): Double = js.native
  
  /** returns the vertical position in pixels where the view is split. */
  def getSplitVertical(): Double = js.native
  
  /**
    * splits the view at the specified position.
    *
    * To split only horizontally, specify **nPixelY** as 0. To split only vertically, specify **nPixelX** as 0.
    */
  def splitAtPosition(nPixelX: Double, nPixelY: Double): Unit = js.native
}
object XViewSplitable {
  
  @scala.inline
  def apply(
    IsWindowSplit: Boolean,
    SplitColumn: Double,
    SplitHorizontal: Double,
    SplitRow: Double,
    SplitVertical: Double,
    acquire: () => Unit,
    getIsWindowSplit: () => Boolean,
    getSplitColumn: () => Double,
    getSplitHorizontal: () => Double,
    getSplitRow: () => Double,
    getSplitVertical: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    splitAtPosition: (Double, Double) => Unit
  ): XViewSplitable = {
    val __obj = js.Dynamic.literal(IsWindowSplit = IsWindowSplit.asInstanceOf[js.Any], SplitColumn = SplitColumn.asInstanceOf[js.Any], SplitHorizontal = SplitHorizontal.asInstanceOf[js.Any], SplitRow = SplitRow.asInstanceOf[js.Any], SplitVertical = SplitVertical.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getIsWindowSplit = js.Any.fromFunction0(getIsWindowSplit), getSplitColumn = js.Any.fromFunction0(getSplitColumn), getSplitHorizontal = js.Any.fromFunction0(getSplitHorizontal), getSplitRow = js.Any.fromFunction0(getSplitRow), getSplitVertical = js.Any.fromFunction0(getSplitVertical), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), splitAtPosition = js.Any.fromFunction2(splitAtPosition))
    __obj.asInstanceOf[XViewSplitable]
  }
  
  @scala.inline
  implicit class XViewSplitableMutableBuilder[Self <: XViewSplitable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetIsWindowSplit(value: () => Boolean): Self = StObject.set(x, "getIsWindowSplit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSplitColumn(value: () => Double): Self = StObject.set(x, "getSplitColumn", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSplitHorizontal(value: () => Double): Self = StObject.set(x, "getSplitHorizontal", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSplitRow(value: () => Double): Self = StObject.set(x, "getSplitRow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSplitVertical(value: () => Double): Self = StObject.set(x, "getSplitVertical", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsWindowSplit(value: Boolean): Self = StObject.set(x, "IsWindowSplit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitAtPosition(value: (Double, Double) => Unit): Self = StObject.set(x, "splitAtPosition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSplitColumn(value: Double): Self = StObject.set(x, "SplitColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitHorizontal(value: Double): Self = StObject.set(x, "SplitHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitRow(value: Double): Self = StObject.set(x, "SplitRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitVertical(value: Double): Self = StObject.set(x, "SplitVertical", value.asInstanceOf[js.Any])
  }
}
