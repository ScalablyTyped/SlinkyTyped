package typingsSlinky.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreateImage(value: CreateImageResponse): Self = this.set("createImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateImage: Self = this.set("createImage", js.undefined)
    
    @scala.inline
    def setCreateLine(value: CreateLineResponse): Self = this.set("createLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateLine: Self = this.set("createLine", js.undefined)
    
    @scala.inline
    def setCreateShape(value: CreateShapeResponse): Self = this.set("createShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateShape: Self = this.set("createShape", js.undefined)
    
    @scala.inline
    def setCreateSheetsChart(value: CreateSheetsChartResponse): Self = this.set("createSheetsChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateSheetsChart: Self = this.set("createSheetsChart", js.undefined)
    
    @scala.inline
    def setCreateSlide(value: CreateSlideResponse): Self = this.set("createSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateSlide: Self = this.set("createSlide", js.undefined)
    
    @scala.inline
    def setCreateTable(value: CreateTableResponse): Self = this.set("createTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTable: Self = this.set("createTable", js.undefined)
    
    @scala.inline
    def setCreateVideo(value: CreateVideoResponse): Self = this.set("createVideo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateVideo: Self = this.set("createVideo", js.undefined)
    
    @scala.inline
    def setDuplicateObject(value: DuplicateObjectResponse): Self = this.set("duplicateObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuplicateObject: Self = this.set("duplicateObject", js.undefined)
    
    @scala.inline
    def setReplaceAllShapesWithImage(value: ReplaceAllShapesWithImageResponse): Self = this.set("replaceAllShapesWithImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaceAllShapesWithImage: Self = this.set("replaceAllShapesWithImage", js.undefined)
    
    @scala.inline
    def setReplaceAllShapesWithSheetsChart(value: ReplaceAllShapesWithSheetsChartResponse): Self = this.set("replaceAllShapesWithSheetsChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaceAllShapesWithSheetsChart: Self = this.set("replaceAllShapesWithSheetsChart", js.undefined)
    
    @scala.inline
    def setReplaceAllText(value: ReplaceAllTextResponse): Self = this.set("replaceAllText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaceAllText: Self = this.set("replaceAllText", js.undefined)
  }
}
