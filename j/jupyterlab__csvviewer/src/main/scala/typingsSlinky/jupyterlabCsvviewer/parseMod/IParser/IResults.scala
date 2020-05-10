package typingsSlinky.jupyterlabCsvviewer.parseMod.IParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The results from a parser.
  */
@js.native
trait IResults extends js.Object {
  /**
    * The number of columns parsed, or 0 if only row offsets are returned.
    */
  var ncols: Double = js.native
  /**
    * The number of rows parsed.
    */
  var nrows: Double = js.native
  /**
    * The index offsets into the data string for the rows or data items.
    *
    * #### Notes
    * If the columnOffsets argument to the parser is false, the offsets array
    * will be an array of length nrows, where `offsets[r]` is the index of the
    * first character of row r.
    *
    * If the columnOffsets argument to the parser is true, the offsets array
    * will be an array of length `nrows*ncols`, where `offsets[r*ncols + c]` is
    * the index of the first character of the item in row r, column c.
    */
  var offsets: js.Array[Double] = js.native
}

object IResults {
  @scala.inline
  def apply(ncols: Double, nrows: Double, offsets: js.Array[Double]): IResults = {
    val __obj = js.Dynamic.literal(ncols = ncols.asInstanceOf[js.Any], nrows = nrows.asInstanceOf[js.Any], offsets = offsets.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResults]
  }
  @scala.inline
  implicit class IResultsOps[Self <: IResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNcols(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ncols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNrows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nrows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsets(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsets")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

