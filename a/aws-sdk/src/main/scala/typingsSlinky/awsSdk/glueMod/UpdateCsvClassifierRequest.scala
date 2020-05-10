package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateCsvClassifierRequest extends js.Object {
  /**
    * Enables the processing of files that contain only one column.
    */
  var AllowSingleColumn: js.UndefOr[NullableBoolean] = js.native
  /**
    * Indicates whether the CSV file contains a header.
    */
  var ContainsHeader: js.UndefOr[CsvHeaderOption] = js.native
  /**
    * A custom symbol to denote what separates each column entry in the row.
    */
  var Delimiter: js.UndefOr[CsvColumnDelimiter] = js.native
  /**
    * Specifies not to trim values before identifying the type of column values. The default value is true.
    */
  var DisableValueTrimming: js.UndefOr[NullableBoolean] = js.native
  /**
    * A list of strings representing column names.
    */
  var Header: js.UndefOr[CsvHeader] = js.native
  /**
    * The name of the classifier.
    */
  var Name: NameString = js.native
  /**
    * A custom symbol to denote what combines content into a single column value. It must be different from the column delimiter.
    */
  var QuoteSymbol: js.UndefOr[CsvQuoteSymbol] = js.native
}

object UpdateCsvClassifierRequest {
  @scala.inline
  def apply(Name: NameString): UpdateCsvClassifierRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCsvClassifierRequest]
  }
  @scala.inline
  implicit class UpdateCsvClassifierRequestOps[Self <: UpdateCsvClassifierRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowSingleColumn(value: NullableBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowSingleColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSingleColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowSingleColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withContainsHeader(value: CsvHeaderOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContainsHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainsHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContainsHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withDelimiter(value: CsvColumnDelimiter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableValueTrimming(value: NullableBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisableValueTrimming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableValueTrimming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisableValueTrimming")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: CsvHeader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Header")(js.undefined)
        ret
    }
    @scala.inline
    def withQuoteSymbol(value: CsvQuoteSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QuoteSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuoteSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QuoteSymbol")(js.undefined)
        ret
    }
  }
  
}

