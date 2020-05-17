package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class XViewSplitableOps[Self <: XViewSplitable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsWindowSplit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsWindowSplit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSplitColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SplitColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSplitHorizontal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SplitHorizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSplitRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SplitRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSplitVertical(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SplitVertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetIsWindowSplit(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIsWindowSplit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSplitColumn(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSplitColumn")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSplitHorizontal(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSplitHorizontal")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSplitRow(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSplitRow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSplitVertical(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSplitVertical")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSplitAtPosition(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitAtPosition")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

