package typingsSlinky.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeriesPointsMarker extends js.Object {
  
  /** Options for customizing the border of the marker shape.
    */
  var border: js.UndefOr[SeriesPointsMarkerBorder] = js.native
  
  /** Options for displaying and customizing data label.
    */
  var dataLabel: js.UndefOr[SeriesPointsMarkerDataLabel] = js.native
  
  /** Color of the marker shape.
    * @Default {null}
    */
  var fill: js.UndefOr[String] = js.native
  
  /** The URL for the Image that is to be displayed as marker. In order to display image as marker, set series.marker.shape as â€˜imageâ€™.
    */
  var imageUrl: js.UndefOr[String] = js.native
  
  /** Opacity of the marker.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /** Specifies the shape of the marker.
    * @Default {circle. See Shape}
    */
  var shape: js.UndefOr[Shape | String] = js.native
  
  /** Options for customizing the size of the marker shape.
    */
  var size: js.UndefOr[SeriesPointsMarkerSize] = js.native
  
  /** Controls the visibility of the marker shape.
    * @Default {false}
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object SeriesPointsMarker {
  
  @scala.inline
  def apply(): SeriesPointsMarker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesPointsMarker]
  }
  
  @scala.inline
  implicit class SeriesPointsMarkerOps[Self <: SeriesPointsMarker] (val x: Self) extends AnyVal {
    
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
    def setBorder(value: SeriesPointsMarkerBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def setDataLabel(value: SeriesPointsMarkerDataLabel): Self = this.set("dataLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataLabel: Self = this.set("dataLabel", js.undefined)
    
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageUrl: Self = this.set("imageUrl", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setShape(value: Shape | String): Self = this.set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    
    @scala.inline
    def setSize(value: SeriesPointsMarkerSize): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
