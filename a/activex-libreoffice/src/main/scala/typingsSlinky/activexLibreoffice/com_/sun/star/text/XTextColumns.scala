package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * manages columns within the object.
  *
  * The values used are relative. So it is not necessary to know the width of the object. The sum of the relative width values depends on the object and
  * is defined in "ReferenceValue."
  */
@js.native
trait XTextColumns extends XInterface {
  /** @returns the number of columns. */
  var ColumnCount: Double = js.native
  /**
    * returns the column description of the object.
    * @see TextColumn
    */
  var Columns: SafeArray[TextColumn] = js.native
  /** @returns the sum of all values.  As described above, the width values are relative. */
  val ReferenceValue: Double = js.native
  /** @returns the number of columns. */
  def getColumnCount(): Double = js.native
  /**
    * returns the column description of the object.
    * @see TextColumn
    */
  def getColumns(): SafeArray[TextColumn] = js.native
  /** @returns the sum of all values.  As described above, the width values are relative. */
  def getReferenceValue(): Double = js.native
  /**
    * sets the number of columns.
    *
    * The minimum is 1 column.
    */
  def setColumnCount(nColumns: Double): Unit = js.native
  /**
    * sets the descriptors of all columns.
    *
    * The number of members in the sequence must be the same as the number of columns of the object.
    * @see TextColumn
    */
  def setColumns(Columns: SeqEquiv[TextColumn]): Unit = js.native
}

object XTextColumns {
  @scala.inline
  def apply(
    ColumnCount: Double,
    Columns: SafeArray[TextColumn],
    ReferenceValue: Double,
    acquire: () => Unit,
    getColumnCount: () => Double,
    getColumns: () => SafeArray[TextColumn],
    getReferenceValue: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setColumnCount: Double => Unit,
    setColumns: SeqEquiv[TextColumn] => Unit
  ): XTextColumns = {
    val __obj = js.Dynamic.literal(ColumnCount = ColumnCount.asInstanceOf[js.Any], Columns = Columns.asInstanceOf[js.Any], ReferenceValue = ReferenceValue.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getColumnCount = js.Any.fromFunction0(getColumnCount), getColumns = js.Any.fromFunction0(getColumns), getReferenceValue = js.Any.fromFunction0(getReferenceValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setColumnCount = js.Any.fromFunction1(setColumnCount), setColumns = js.Any.fromFunction1(setColumns))
    __obj.asInstanceOf[XTextColumns]
  }
  @scala.inline
  implicit class XTextColumnsOps[Self <: XTextColumns] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColumnCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumns(value: SafeArray[TextColumn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferenceValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReferenceValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetColumnCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColumnCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetColumns(value: () => SafeArray[TextColumn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColumns")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetReferenceValue(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getReferenceValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetColumnCount(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setColumnCount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetColumns(value: SeqEquiv[TextColumn] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setColumns")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

