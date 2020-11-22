package typingsSlinky.appleMapkitJsBrowser.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options you provide to constrain an autocomplete request.
  */
@js.native
trait SearchAutocompleteOptions extends js.Object {
  
  /**
    * A map coordinate that provides a hint for the geographic area to search.
    */
  var coordinate: js.UndefOr[Coordinate] = js.native
  
  /**
    * A Boolean value that indicates whether the search results should include addresses.
    */
  var includeAddresses: js.UndefOr[Boolean] = js.native
  
  /**
    * A Boolean value that indicates whether the search results should include points of interest.
    */
  var includePointsOfInterest: js.UndefOr[Boolean] = js.native
  
  /**
    * A Boolean value that indicates whether the search results should include queries.
    */
  var includeQueries: js.UndefOr[Boolean] = js.native
  
  /**
    * A language ID that determines the language for the search result text.
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * A string that constrains search results to within the provided countries.
    */
  var limitToCountries: js.UndefOr[String] = js.native
  
  /**
    * A filter used to include or exclude point of interest categories in search results.
    */
  var pointOfInterestFilter: js.UndefOr[PointOfInterestFilter] = js.native
  
  /**
    * A map region that provides a hint for the geographic area to search.
    */
  var region: js.UndefOr[CoordinateRegion] = js.native
}
object SearchAutocompleteOptions {
  
  @scala.inline
  def apply(): SearchAutocompleteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchAutocompleteOptions]
  }
  
  @scala.inline
  implicit class SearchAutocompleteOptionsOps[Self <: SearchAutocompleteOptions] (val x: Self) extends AnyVal {
    
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
    def setCoordinate(value: Coordinate): Self = this.set("coordinate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoordinate: Self = this.set("coordinate", js.undefined)
    
    @scala.inline
    def setIncludeAddresses(value: Boolean): Self = this.set("includeAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeAddresses: Self = this.set("includeAddresses", js.undefined)
    
    @scala.inline
    def setIncludePointsOfInterest(value: Boolean): Self = this.set("includePointsOfInterest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludePointsOfInterest: Self = this.set("includePointsOfInterest", js.undefined)
    
    @scala.inline
    def setIncludeQueries(value: Boolean): Self = this.set("includeQueries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeQueries: Self = this.set("includeQueries", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLimitToCountries(value: String): Self = this.set("limitToCountries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimitToCountries: Self = this.set("limitToCountries", js.undefined)
    
    @scala.inline
    def setPointOfInterestFilter(value: PointOfInterestFilter): Self = this.set("pointOfInterestFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointOfInterestFilter: Self = this.set("pointOfInterestFilter", js.undefined)
    
    @scala.inline
    def setRegion(value: CoordinateRegion): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
  }
}
