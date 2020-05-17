package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNamed
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the layout settings of a data pilot table.
  *
  * This interface extends the interface {@link com.sun.star.container.XNamed} which provides access to the name of the data pilot table used e.g. in
  * collections.
  * @see com.sun.star.sheet.DataPilotDescriptor
  * @see com.sun.star.sheet.DataPilotTable
  */
@js.native
trait XDataPilotDescriptor extends XNamed {
  /**
    * returns the collection of the data pilot fields used as column fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  val ColumnFields: XIndexAccess = js.native
  /**
    * returns the collection of the data pilot fields used as data fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  val DataFields: XIndexAccess = js.native
  /** returns the collection of all the data pilot fields. */
  val DataPilotFields: XIndexAccess = js.native
  /** returns the filter descriptor specifying which data from the source cell range are used for the data pilot table. */
  val FilterDescriptor: XSheetFilterDescriptor = js.native
  /**
    * returns the collection of the data pilot fields not used as column, row, page, or data fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  val HiddenFields: XIndexAccess = js.native
  /**
    * returns the collection of the data pilot fields used as page fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  val PageFields: XIndexAccess = js.native
  /**
    * returns the collection of the data pilot fields used as row fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  val RowFields: XIndexAccess = js.native
  /** returns the cell range containing the data for the data pilot table. */
  var SourceRange: CellRangeAddress = js.native
  /** returns an additional string stored in the data pilot table. */
  var Tag: String = js.native
  /**
    * returns the collection of the data pilot fields used as column fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  def getColumnFields(): XIndexAccess = js.native
  /**
    * returns the collection of the data pilot fields used as data fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  def getDataFields(): XIndexAccess = js.native
  /** returns the collection of all the data pilot fields. */
  def getDataPilotFields(): XIndexAccess = js.native
  /** returns the filter descriptor specifying which data from the source cell range are used for the data pilot table. */
  def getFilterDescriptor(): XSheetFilterDescriptor = js.native
  /**
    * returns the collection of the data pilot fields not used as column, row, page, or data fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  def getHiddenFields(): XIndexAccess = js.native
  /**
    * returns the collection of the data pilot fields used as page fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  def getPageFields(): XIndexAccess = js.native
  /**
    * returns the collection of the data pilot fields used as row fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  def getRowFields(): XIndexAccess = js.native
  /** returns the cell range containing the data for the data pilot table. */
  def getSourceRange(): CellRangeAddress = js.native
  /** returns an additional string stored in the data pilot table. */
  def getTag(): String = js.native
  /** sets the cell range containing the data for the data pilot table. */
  def setSourceRange(aSourceRange: CellRangeAddress): Unit = js.native
  /** sets an additional string stored in the data pilot table. */
  def setTag(aTag: String): Unit = js.native
}

object XDataPilotDescriptor {
  @scala.inline
  def apply(
    ColumnFields: XIndexAccess,
    DataFields: XIndexAccess,
    DataPilotFields: XIndexAccess,
    FilterDescriptor: XSheetFilterDescriptor,
    HiddenFields: XIndexAccess,
    Name: String,
    PageFields: XIndexAccess,
    RowFields: XIndexAccess,
    SourceRange: CellRangeAddress,
    Tag: String,
    acquire: () => Unit,
    getColumnFields: () => XIndexAccess,
    getDataFields: () => XIndexAccess,
    getDataPilotFields: () => XIndexAccess,
    getFilterDescriptor: () => XSheetFilterDescriptor,
    getHiddenFields: () => XIndexAccess,
    getName: () => String,
    getPageFields: () => XIndexAccess,
    getRowFields: () => XIndexAccess,
    getSourceRange: () => CellRangeAddress,
    getTag: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setName: String => Unit,
    setSourceRange: CellRangeAddress => Unit,
    setTag: String => Unit
  ): XDataPilotDescriptor = {
    val __obj = js.Dynamic.literal(ColumnFields = ColumnFields.asInstanceOf[js.Any], DataFields = DataFields.asInstanceOf[js.Any], DataPilotFields = DataPilotFields.asInstanceOf[js.Any], FilterDescriptor = FilterDescriptor.asInstanceOf[js.Any], HiddenFields = HiddenFields.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PageFields = PageFields.asInstanceOf[js.Any], RowFields = RowFields.asInstanceOf[js.Any], SourceRange = SourceRange.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getColumnFields = js.Any.fromFunction0(getColumnFields), getDataFields = js.Any.fromFunction0(getDataFields), getDataPilotFields = js.Any.fromFunction0(getDataPilotFields), getFilterDescriptor = js.Any.fromFunction0(getFilterDescriptor), getHiddenFields = js.Any.fromFunction0(getHiddenFields), getName = js.Any.fromFunction0(getName), getPageFields = js.Any.fromFunction0(getPageFields), getRowFields = js.Any.fromFunction0(getRowFields), getSourceRange = js.Any.fromFunction0(getSourceRange), getTag = js.Any.fromFunction0(getTag), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setName = js.Any.fromFunction1(setName), setSourceRange = js.Any.fromFunction1(setSourceRange), setTag = js.Any.fromFunction1(setTag))
    __obj.asInstanceOf[XDataPilotDescriptor]
  }
  @scala.inline
  implicit class XDataPilotDescriptorOps[Self <: XDataPilotDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnFields(value: XIndexAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColumnFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataFields(value: XIndexAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataPilotFields(value: XIndexAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataPilotFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterDescriptor(value: XSheetFilterDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterDescriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHiddenFields(value: XIndexAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HiddenFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageFields(value: XIndexAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowFields(value: XIndexAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RowFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceRange(value: CellRangeAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetColumnFields(value: () => XIndexAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColumnFields")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDataFields(value: () => XIndexAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDataFields")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDataPilotFields(value: () => XIndexAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDataPilotFields")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFilterDescriptor(value: () => XSheetFilterDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFilterDescriptor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetHiddenFields(value: () => XIndexAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHiddenFields")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPageFields(value: () => XIndexAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageFields")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRowFields(value: () => XIndexAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowFields")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSourceRange(value: () => CellRangeAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSourceRange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTag(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTag")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetSourceRange(value: CellRangeAddress => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSourceRange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTag(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTag")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

