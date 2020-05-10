package typingsSlinky.pulumiAws.outputMod.glue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassifierCsvClassifier extends js.Object {
  /**
    * Enables the processing of files that contain only one column.
    */
  var allowSingleColumn: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the CSV file contains a header. This can be one of "ABSENT", "PRESENT", or "UNKNOWN".
    */
  var containsHeader: js.UndefOr[String] = js.native
  /**
    * The delimiter used in the Csv to separate columns.
    */
  var delimiter: js.UndefOr[String] = js.native
  /**
    * Specifies whether to trim column values.
    */
  var disableValueTrimming: js.UndefOr[Boolean] = js.native
  /**
    * A list of strings representing column names.
    */
  var headers: js.UndefOr[js.Array[String]] = js.native
  /**
    * A custom symbol to denote what combines content into a single column value. It must be different from the column delimiter.
    */
  var quoteSymbol: js.UndefOr[String] = js.native
}

object ClassifierCsvClassifier {
  @scala.inline
  def apply(): ClassifierCsvClassifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassifierCsvClassifier]
  }
  @scala.inline
  implicit class ClassifierCsvClassifierOps[Self <: ClassifierCsvClassifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowSingleColumn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSingleColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSingleColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSingleColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withContainsHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainsHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableValueTrimming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableValueTrimming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableValueTrimming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableValueTrimming")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withQuoteSymbol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quoteSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuoteSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quoteSymbol")(js.undefined)
        ret
    }
  }
  
}

