package typingsSlinky.c3.anon

import typingsSlinky.c3.c3Booleans.`true`
import typingsSlinky.c3.mod.ArrayOrString
import typingsSlinky.c3.mod.AxisName
import typingsSlinky.c3.mod.Primitive
import typingsSlinky.c3.mod.PrimitiveArray
import typingsSlinky.d3Color.mod.HSLColor
import typingsSlinky.d3Color.mod.RGBColor
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Axes extends js.Object {
  /** Match data IDs to their axes. */
  var axes: js.UndefOr[Record[String, AxisName]] = js.native
  /** Array of arrays of data IDs. IDs that share a sub-array will be categorized together. */
  var categories: js.UndefOr[js.Array[js.Array[String]]] = js.native
  /** If classes given, the classes specifed by `data.classes` will be updated. Keys should be data IDs and values should be classes to assign. */
  var classes: js.UndefOr[Record[String, String]] = js.native
  /** Match data IDs to the colors to render that data as. */
  var colors: js.UndefOr[Record[String, String | RGBColor | HSLColor]] = js.native
  /** A list of columns, where the first element in each column is the ID and the remaining elements are data. If `data`, `url`, `json`, or 'rows' are provided, this will be ignored. */
  var columns: js.UndefOr[js.Array[Array[String | Primitive]]] = js.native
  /** Data to load. */
  var data: js.UndefOr[typingsSlinky.c3.mod.Data] = js.native
  /** Called when loading completes. */
  var done: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * An object to convert to data to load. Can be in the column form
    * (`{key1: [val1, val2, ...]; ...}`) or in the row form (`[{key1: val1; key2: val2}, ...]`).
    * If `data` or `url` are provided this will be ignored.
    */
  var json: js.UndefOr[(Record[String, PrimitiveArray]) | (js.Array[Record[String, Primitive]])] = js.native
  /** If json is provided and is in row form, these keys are used to pull the data from each row. */
  var keys: js.UndefOr[Value] = js.native
  /** Match loaded data IDs with display names. */
  var names: js.UndefOr[Record[String, String]] = js.native
  /** A list of rows, where the first row is the column names and the remaining rows are data.  If `data`, `url`, or `json` are provided this will be ignored.  */
  var rows: js.UndefOr[js.Array[PrimitiveArray]] = js.native
  /** Select the plot type for the loaded data. */
  var `type`: js.UndefOr[String] = js.native
  /** Select the plot types for each individual data by ID. */
  var types: js.UndefOr[Record[String, String]] = js.native
  /** ID of data to remove, or list of IDs of data to remove, or `true` to remove all data. */
  var unload: js.UndefOr[`true` | ArrayOrString] = js.native
  /** API url to load data from. If `data` is provided this will be ignored. */
  var url: js.UndefOr[String] = js.native
  /** Match x columns to the corresponding data columns. */
  var xs: js.UndefOr[Record[String, String]] = js.native
}

object Axes {
  @scala.inline
  def apply(): Axes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Axes]
  }
  @scala.inline
  implicit class AxesOps[Self <: Axes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxes(value: Record[String, AxisName]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axes")(js.undefined)
        ret
    }
    @scala.inline
    def withCategories(value: js.Array[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(js.undefined)
        ret
    }
    @scala.inline
    def withClasses(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(js.undefined)
        ret
    }
    @scala.inline
    def withColors(value: Record[String, String | RGBColor | HSLColor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[Array[String | Primitive]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: typingsSlinky.c3.mod.Data): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDone(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(js.undefined)
        ret
    }
    @scala.inline
    def withJson(value: (Record[String, PrimitiveArray]) | (js.Array[Record[String, Primitive]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(js.undefined)
        ret
    }
    @scala.inline
    def withKeys(value: Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(js.undefined)
        ret
    }
    @scala.inline
    def withNames(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: js.Array[PrimitiveArray]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withTypes(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(js.undefined)
        ret
    }
    @scala.inline
    def withUnload(value: `true` | ArrayOrString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unload")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withXs(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xs")(js.undefined)
        ret
    }
  }
  
}

