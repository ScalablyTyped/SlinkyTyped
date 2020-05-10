package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of the find/replace.
  */
@js.native
trait SchemaFindReplaceResponse extends js.Object {
  /**
    * The number of formula cells changed.
    */
  var formulasChanged: js.UndefOr[Double] = js.native
  /**
    * The number of occurrences (possibly multiple within a cell) changed. For
    * example, if replacing `&quot;e&quot;` with `&quot;o&quot;` in
    * `&quot;Google Sheets&quot;`, this would be `&quot;3&quot;` because
    * `&quot;Google Sheets&quot;` -&gt; `&quot;Googlo Shoots&quot;`.
    */
  var occurrencesChanged: js.UndefOr[Double] = js.native
  /**
    * The number of rows changed.
    */
  var rowsChanged: js.UndefOr[Double] = js.native
  /**
    * The number of sheets changed.
    */
  var sheetsChanged: js.UndefOr[Double] = js.native
  /**
    * The number of non-formula cells changed.
    */
  var valuesChanged: js.UndefOr[Double] = js.native
}

object SchemaFindReplaceResponse {
  @scala.inline
  def apply(): SchemaFindReplaceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFindReplaceResponse]
  }
  @scala.inline
  implicit class SchemaFindReplaceResponseOps[Self <: SchemaFindReplaceResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormulasChanged(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formulasChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormulasChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formulasChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOccurrencesChanged(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occurrencesChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOccurrencesChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occurrencesChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withRowsChanged(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowsChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withSheetsChanged(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetsChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSheetsChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetsChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withValuesChanged(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valuesChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValuesChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valuesChanged")(js.undefined)
        ret
    }
  }
  
}

