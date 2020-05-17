package typingsSlinky.activexLibreoffice.com_.sun.star.table

import typingsSlinky.activexLibreoffice.com_.sun.star.lang.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes how to sort a single field (row/column) in a tables sort descriptor.
  * @see com.sun.star.table.TableSortDescriptor2
  * @since OOo 1.1.2
  */
@js.native
trait TableSortField extends js.Object {
  /**
    * the algorithm used by the collator when comparing/sorting text.
    *
    * This property will not be used when the "FieldType" is com::sun::star::table::TableSortFieldType::NUMERIC
    * @see com.sun.star.i18n.XCollator
    */
  var CollatorAlgorithm: String = js.native
  /**
    * the locale used by the collator when comparing/sorting text.
    *
    * This property will not be used when the "FieldType" is com::sun::star::table::TableSortFieldType::NUMERIC
    * @see com.sun.star.i18n.XCollator
    */
  var CollatorLocale: Locale = js.native
  /** index of the row or column in the table to be sorted; 0-based. */
  var Field: Double = js.native
  /**
    * type of contents in the field.
    *
    * If the value is com::sun::star::table::TableSortFieldType::AUTOMATIC the algorithm used for sorting is application specific. Especially it may or may
    * not use the values given by "CollatorLocale" and "CollatorAlgorithm".
    */
  var FieldType: TableSortFieldType = js.native
  /** `TRUE` if data are sorted in ascending order, `FALSE` if in descending order. */
  var IsAscending: Boolean = js.native
  /** specifies if the case of letters is important when comparing entries. */
  var IsCaseSensitive: Boolean = js.native
}

object TableSortField {
  @scala.inline
  def apply(
    CollatorAlgorithm: String,
    CollatorLocale: Locale,
    Field: Double,
    FieldType: TableSortFieldType,
    IsAscending: Boolean,
    IsCaseSensitive: Boolean
  ): TableSortField = {
    val __obj = js.Dynamic.literal(CollatorAlgorithm = CollatorAlgorithm.asInstanceOf[js.Any], CollatorLocale = CollatorLocale.asInstanceOf[js.Any], Field = Field.asInstanceOf[js.Any], FieldType = FieldType.asInstanceOf[js.Any], IsAscending = IsAscending.asInstanceOf[js.Any], IsCaseSensitive = IsCaseSensitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableSortField]
  }
  @scala.inline
  implicit class TableSortFieldOps[Self <: TableSortField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollatorAlgorithm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CollatorAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollatorLocale(value: Locale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CollatorLocale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withField(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldType(value: TableSortFieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FieldType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAscending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsAscending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCaseSensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsCaseSensitive")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

