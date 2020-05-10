package typingsSlinky.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends js.Object {
  /** The result of creating an image. */
  var createImage: js.UndefOr[CreateImageResponse] = js.native
  /** The result of creating a line. */
  var createLine: js.UndefOr[CreateLineResponse] = js.native
  /** The result of creating a shape. */
  var createShape: js.UndefOr[CreateShapeResponse] = js.native
  /** The result of creating a Google Sheets chart. */
  var createSheetsChart: js.UndefOr[CreateSheetsChartResponse] = js.native
  /** The result of creating a slide. */
  var createSlide: js.UndefOr[CreateSlideResponse] = js.native
  /** The result of creating a table. */
  var createTable: js.UndefOr[CreateTableResponse] = js.native
  /** The result of creating a video. */
  var createVideo: js.UndefOr[CreateVideoResponse] = js.native
  /** The result of duplicating an object. */
  var duplicateObject: js.UndefOr[DuplicateObjectResponse] = js.native
  /**
    * The result of replacing all shapes matching some criteria with an
    * image.
    */
  var replaceAllShapesWithImage: js.UndefOr[ReplaceAllShapesWithImageResponse] = js.native
  /**
    * The result of replacing all shapes matching some criteria with a Google
    * Sheets chart.
    */
  var replaceAllShapesWithSheetsChart: js.UndefOr[ReplaceAllShapesWithSheetsChartResponse] = js.native
  /** The result of replacing text. */
  var replaceAllText: js.UndefOr[ReplaceAllTextResponse] = js.native
}

object Response {
  @scala.inline
  def apply(): Response = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Response]
  }
  @scala.inline
  implicit class ResponseOps[Self <: Response] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateImage(value: CreateImageResponse): Self = {
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
    def withCreateLine(value: CreateLineResponse): Self = {
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
    def withCreateShape(value: CreateShapeResponse): Self = {
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
    def withCreateSheetsChart(value: CreateSheetsChartResponse): Self = {
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
    def withCreateSlide(value: CreateSlideResponse): Self = {
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
    def withCreateTable(value: CreateTableResponse): Self = {
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
    def withCreateVideo(value: CreateVideoResponse): Self = {
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
    def withDuplicateObject(value: DuplicateObjectResponse): Self = {
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
    def withReplaceAllShapesWithImage(value: ReplaceAllShapesWithImageResponse): Self = {
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
    def withReplaceAllShapesWithSheetsChart(value: ReplaceAllShapesWithSheetsChartResponse): Self = {
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
    def withReplaceAllText(value: ReplaceAllTextResponse): Self = {
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

