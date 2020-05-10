package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShapeDataSourceSettings
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Callback function to call when data binding is complete.
  	 */
  var callback: js.UndefOr[js.Function] = js.native
  /**
  	 * Object on which to invoke the callback function.
  	 */
  var callee: js.UndefOr[js.Any] = js.native
  /**
  	 * The Uri of the .dbf portion of the Shapefile.
  	 */
  var databaseSource: js.UndefOr[String] = js.native
  /**
  	 * The unique identifier.
  	 */
  var id: js.UndefOr[String] = js.native
  /**
  	 * Callback function to call when the import process has been completed
  	 * paramType="object" the ShapeDataSource instance
  	 */
  var importCompleted: js.UndefOr[js.Function] = js.native
  /**
  	 * The Uri of the .shp portion of the Shapefile.
  	 */
  var shapefileSource: js.UndefOr[String] = js.native
  /**
  	 * Callback function to call to allow the bounds of the shape data source to be transformed.
  	 * paramType="object" the bounds of the shape datasource to be transformed in place. The object will look like { top: value, left: value, width: value, height: value }
  	 */
  var transformBounds: js.UndefOr[js.Function] = js.native
  /**
  	 * Callback function to call to allow points in the shape records to be transformed.
  	 * paramType="object" the point to be transformed in place. The object will look like { x: value, y: value2 }
  	 */
  var transformPoint: js.UndefOr[js.Function] = js.native
  /**
  	 * Callback function to call to allow shape records to be transformed.
  	 * paramType="object" the shape record to be transformed.
  	 */
  var transformRecord: js.UndefOr[js.Function] = js.native
}

object ShapeDataSourceSettings {
  @scala.inline
  def apply(): ShapeDataSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeDataSourceSettings]
  }
  @scala.inline
  implicit class ShapeDataSourceSettingsOps[Self <: ShapeDataSourceSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withCallee(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallee: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callee")(js.undefined)
        ret
    }
    @scala.inline
    def withDatabaseSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatabaseSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseSource")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withImportCompleted(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importCompleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportCompleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importCompleted")(js.undefined)
        ret
    }
    @scala.inline
    def withShapefileSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapefileSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShapefileSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapefileSource")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformBounds(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformBounds")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformPoint(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformRecord(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformRecord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformRecord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformRecord")(js.undefined)
        ret
    }
  }
  
}

