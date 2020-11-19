package typingsSlinky.leafletAwesomeMarkers.mod.AwesomeMarkers

import typingsSlinky.leaflet.mod.BaseIconOptions
import typingsSlinky.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.black
import typingsSlinky.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.blue
import typingsSlinky.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.cadetblue
import typingsSlinky.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.darkgreen
import typingsSlinky.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.darkpurple
import typingsSlinky.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.darkred
import typingsSlinky.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.fa
import typingsSlinky.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.glyphicon
import typingsSlinky.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.green
import typingsSlinky.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.orange
import typingsSlinky.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.purple
import typingsSlinky.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.red
import typingsSlinky.leafletAwesomeMarkers.leafletAwesomeMarkersStrings.white
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwesomeMarkersIconOptions extends BaseIconOptions {
  
  /**
    * Additional classes in the created tag
    */
  var extraClasses: js.UndefOr[String] = js.native
  
  /**
    * Name of the icon. See glyphicons or font-awesome.
    */
  var icon: js.UndefOr[String] = js.native
  
  /**
    * Color of the icon. 'white', 'black' or css code (hex, rgba etc).
    */
  var iconColor: js.UndefOr[white | black | String] = js.native
  
  /**
    * Color of the marker
    */
  var markerColor: js.UndefOr[
    red | darkred | orange | green | darkgreen | blue | purple | darkpurple | cadetblue
  ] = js.native
  
  /**
    * Select de icon library. 'fa' for font-awesome or 'glyphicon' for bootstrap 3.
    */
  var prefix: js.UndefOr[fa | glyphicon] = js.native
  
  /**
    * Make the icon spin. true or false. Font-awesome required
    */
  var spin: js.UndefOr[Boolean] = js.native
}
object AwesomeMarkersIconOptions {
  
  @scala.inline
  def apply(): AwesomeMarkersIconOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwesomeMarkersIconOptions]
  }
  
  @scala.inline
  implicit class AwesomeMarkersIconOptionsOps[Self <: AwesomeMarkersIconOptions] (val x: Self) extends AnyVal {
    
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
    def setExtraClasses(value: String): Self = this.set("extraClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraClasses: Self = this.set("extraClasses", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIconColor(value: white | black | String): Self = this.set("iconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconColor: Self = this.set("iconColor", js.undefined)
    
    @scala.inline
    def setMarkerColor(value: red | darkred | orange | green | darkgreen | blue | purple | darkpurple | cadetblue): Self = this.set("markerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerColor: Self = this.set("markerColor", js.undefined)
    
    @scala.inline
    def setPrefix(value: fa | glyphicon): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setSpin(value: Boolean): Self = this.set("spin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpin: Self = this.set("spin", js.undefined)
  }
}
