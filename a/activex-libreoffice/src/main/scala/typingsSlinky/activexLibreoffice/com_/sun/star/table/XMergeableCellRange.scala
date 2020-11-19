package typingsSlinky.activexLibreoffice.com_.sun.star.table

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents a range of cells that can possibly be merged or unmerged. */
@js.native
trait XMergeableCellRange extends XInterface {
  
  /** @returns `TRUE` if all cells from this range can be merged to one or `FALSE` otherwise. */
  def isMergeable(): Boolean = js.native
  
  /**
    * merges the area specified by this range.
    * @throws com::sun::star::lang::NoSupportException if a merge is not possible for this range. You can use {@link isMergeable()} to check if a merge is possible.
    */
  def merge(): Unit = js.native
  
  /**
    * splits the cells in this range. This will be done by inserting rows and columns if needed or unmerging cells that are already split.
    * @param Columns this is the number of columns that will be added to each cell. Zero means no new columns
    * @param Rows this is the number of rows that will be added to each cell. Zero means no new rows
    * @throws com::sun::star::lang::IllegalArgumentException if at least one of the parameters is less than zero.
    * @throws com::sun::star::lang::NoSupportException if a split is not possible for this range.
    */
  def split(Columns: Double, Rows: Double): Unit = js.native
}
object XMergeableCellRange {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    isMergeable: () => Boolean,
    merge: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    split: (Double, Double) => Unit
  ): XMergeableCellRange = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), isMergeable = js.Any.fromFunction0(isMergeable), merge = js.Any.fromFunction0(merge), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), split = js.Any.fromFunction2(split))
    __obj.asInstanceOf[XMergeableCellRange]
  }
  
  @scala.inline
  implicit class XMergeableCellRangeOps[Self <: XMergeableCellRange] (val x: Self) extends AnyVal {
    
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
    def setIsMergeable(value: () => Boolean): Self = this.set("isMergeable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMerge(value: () => Unit): Self = this.set("merge", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSplit(value: (Double, Double) => Unit): Self = this.set("split", js.Any.fromFunction2(value))
  }
}
