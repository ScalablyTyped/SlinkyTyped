package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single response from an update.
  */
@js.native
trait SchemaResponse extends js.Object {
  /**
    * The result of creating an image.
    */
  var createImage: js.UndefOr[SchemaCreateImageResponse] = js.native
  /**
    * The result of creating a line.
    */
  var createLine: js.UndefOr[SchemaCreateLineResponse] = js.native
  /**
    * The result of creating a shape.
    */
  var createShape: js.UndefOr[SchemaCreateShapeResponse] = js.native
  /**
    * The result of creating a Google Sheets chart.
    */
  var createSheetsChart: js.UndefOr[SchemaCreateSheetsChartResponse] = js.native
  /**
    * The result of creating a slide.
    */
  var createSlide: js.UndefOr[SchemaCreateSlideResponse] = js.native
  /**
    * The result of creating a table.
    */
  var createTable: js.UndefOr[SchemaCreateTableResponse] = js.native
  /**
    * The result of creating a video.
    */
  var createVideo: js.UndefOr[SchemaCreateVideoResponse] = js.native
  /**
    * The result of duplicating an object.
    */
  var duplicateObject: js.UndefOr[SchemaDuplicateObjectResponse] = js.native
  /**
    * The result of grouping objects.
    */
  var groupObjects: js.UndefOr[SchemaGroupObjectsResponse] = js.native
  /**
    * The result of replacing all shapes matching some criteria with an image.
    */
  var replaceAllShapesWithImage: js.UndefOr[SchemaReplaceAllShapesWithImageResponse] = js.native
  /**
    * The result of replacing all shapes matching some criteria with a Google
    * Sheets chart.
    */
  var replaceAllShapesWithSheetsChart: js.UndefOr[SchemaReplaceAllShapesWithSheetsChartResponse] = js.native
  /**
    * The result of replacing text.
    */
  var replaceAllText: js.UndefOr[SchemaReplaceAllTextResponse] = js.native
}

object SchemaResponse {
  @scala.inline
  def apply(): SchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResponse]
  }
  @scala.inline
  implicit class SchemaResponseOps[Self <: SchemaResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateImage(value: SchemaCreateImageResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createImage")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateLine(value: SchemaCreateLineResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createLine")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateShape(value: SchemaCreateShapeResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createShape")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateSheetsChart(value: SchemaCreateSheetsChartResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSheetsChart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateSheetsChart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSheetsChart")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateSlide(value: SchemaCreateSlideResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSlide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateSlide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSlide")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateTable(value: SchemaCreateTableResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTable")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateVideo(value: SchemaCreateVideoResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createVideo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateVideo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createVideo")(js.undefined)
        ret
    }
    @scala.inline
    def withDuplicateObject(value: SchemaDuplicateObjectResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicateObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuplicateObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicateObject")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupObjects(value: SchemaGroupObjectsResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupObjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupObjects")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceAllShapesWithImage(value: SchemaReplaceAllShapesWithImageResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceAllShapesWithImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceAllShapesWithImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceAllShapesWithImage")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceAllShapesWithSheetsChart(value: SchemaReplaceAllShapesWithSheetsChartResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceAllShapesWithSheetsChart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceAllShapesWithSheetsChart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceAllShapesWithSheetsChart")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceAllText(value: SchemaReplaceAllTextResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceAllText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceAllText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceAllText")(js.undefined)
        ret
    }
  }
  
}

