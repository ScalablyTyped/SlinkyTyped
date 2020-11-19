package typingsSlinky.hafasClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsOptions extends js.Object {
  
  /**
    * return addresses
    * @default false
    */
  var addresses: js.UndefOr[Boolean] = js.native
  
  /**
    * find only exact matches?
    * @default true
    */
  var fuzzy: js.UndefOr[Boolean] = js.native
  
  /**
    * Language of the results
    * @default en
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * parse & expose lines at each stop/station?
    * @default false
    */
  var linesOfStops: js.UndefOr[Boolean] = js.native
  
  /**
    * points of interest
    * @default true
    */
  var poi: js.UndefOr[Boolean] = js.native
  
  /**
    * how many search results?
    * @default 10
    */
  var results: js.UndefOr[Double] = js.native
  
  /**
    * return stops/stations?
    * @default true
    */
  var stops: js.UndefOr[Boolean] = js.native
}
object LocationsOptions {
  
  @scala.inline
  def apply(): LocationsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationsOptions]
  }
  
  @scala.inline
  implicit class LocationsOptionsOps[Self <: LocationsOptions] (val x: Self) extends AnyVal {
    
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
    def setAddresses(value: Boolean): Self = this.set("addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddresses: Self = this.set("addresses", js.undefined)
    
    @scala.inline
    def setFuzzy(value: Boolean): Self = this.set("fuzzy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFuzzy: Self = this.set("fuzzy", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLinesOfStops(value: Boolean): Self = this.set("linesOfStops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinesOfStops: Self = this.set("linesOfStops", js.undefined)
    
    @scala.inline
    def setPoi(value: Boolean): Self = this.set("poi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoi: Self = this.set("poi", js.undefined)
    
    @scala.inline
    def setResults(value: Double): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
    
    @scala.inline
    def setStops(value: Boolean): Self = this.set("stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStops: Self = this.set("stops", js.undefined)
  }
}
