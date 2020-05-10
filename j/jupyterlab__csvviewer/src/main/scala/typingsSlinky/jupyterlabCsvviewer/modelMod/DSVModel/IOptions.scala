package typingsSlinky.jupyterlabCsvviewer.modelMod.DSVModel

import typingsSlinky.jupyterlabCsvviewer.jupyterlabCsvviewerStrings.Carriagereturn
import typingsSlinky.jupyterlabCsvviewer.jupyterlabCsvviewerStrings.CarriagereturnLinefeed
import typingsSlinky.jupyterlabCsvviewer.jupyterlabCsvviewerStrings.Linefeed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a delimiter-separated data model.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The data source for the data model.
    */
  var data: String = js.native
  /**
    * The field delimiter, such as ',' or '\t'.
    *
    * #### Notes
    * The field delimiter must be a single character.
    */
  var delimiter: String = js.native
  /**
    * Whether the data has a one-row header.
    */
  var header: js.UndefOr[Boolean] = js.native
  /**
    * The maximum number of initial rows to parse before doing a asynchronous
    * full parse of the data. This should be greater than 0.
    */
  var initialRows: js.UndefOr[Double] = js.native
  /**
    * Quote character.
    *
    * #### Notes
    * Quotes are escaped by repeating them, as in RFC 4180. The quote must be a
    * single character.
    */
  var quote: js.UndefOr[String] = js.native
  /**
    * Whether to use the parser that can handle quoted delimiters.
    *
    * #### Notes
    * Setting this to false uses a much faster parser, but assumes there are
    * not any field or row delimiters that are quoted in fields. If this is not
    * set, it defaults to true if any quotes are found in the data, and false
    * otherwise.
    */
  var quoteParser: js.UndefOr[Boolean] = js.native
  /**
    * Row delimiter.
    *
    * #### Notes
    * Any carriage return or newline character that is not a delimiter should
    * be in a quoted field, regardless of the row delimiter setting.
    */
  var rowDelimiter: js.UndefOr[CarriagereturnLinefeed | Carriagereturn | Linefeed] = js.native
}

object IOptions {
  @scala.inline
  def apply(data: String, delimiter: String): IOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], delimiter = delimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialRows")(js.undefined)
        ret
    }
    @scala.inline
    def withQuote(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quote")(js.undefined)
        ret
    }
    @scala.inline
    def withQuoteParser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quoteParser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuoteParser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quoteParser")(js.undefined)
        ret
    }
    @scala.inline
    def withRowDelimiter(value: CarriagereturnLinefeed | Carriagereturn | Linefeed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDelimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDelimiter")(js.undefined)
        ret
    }
  }
  
}

