package typingsSlinky.googleMaps

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.googlemaps.google.maps.places.Autocomplete
import typingsSlinky.googlemaps.google.maps.places.AutocompleteService
import typingsSlinky.googlemaps.google.maps.places.AutocompleteSessionToken
import typingsSlinky.googlemaps.google.maps.places.PlacesService
import typingsSlinky.googlemaps.google.maps.places.SearchBox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofplaces extends js.Object {
  var Autocomplete: Instantiable1[
    /* inputField */ HTMLInputElement, 
    typingsSlinky.googlemaps.google.maps.places.Autocomplete
  ] = js.native
  var AutocompleteService: Instantiable0[typingsSlinky.googlemaps.google.maps.places.AutocompleteService] = js.native
  var AutocompleteSessionToken: Instantiable0[typingsSlinky.googlemaps.google.maps.places.AutocompleteSessionToken] = js.native
  var PlacesService: Instantiable1[
    /* attrContainer */ HTMLDivElement, 
    typingsSlinky.googlemaps.google.maps.places.PlacesService
  ] = js.native
  var SearchBox: Instantiable1[
    /* inputField */ HTMLInputElement, 
    typingsSlinky.googlemaps.google.maps.places.SearchBox
  ] = js.native
}

object Typeofplaces {
  @scala.inline
  def apply(
    Autocomplete: Instantiable1[/* inputField */ HTMLInputElement, Autocomplete],
    AutocompleteService: Instantiable0[AutocompleteService],
    AutocompleteSessionToken: Instantiable0[AutocompleteSessionToken],
    PlacesService: Instantiable1[/* attrContainer */ HTMLDivElement, PlacesService],
    SearchBox: Instantiable1[/* inputField */ HTMLInputElement, SearchBox]
  ): Typeofplaces = {
    val __obj = js.Dynamic.literal(Autocomplete = Autocomplete.asInstanceOf[js.Any], AutocompleteService = AutocompleteService.asInstanceOf[js.Any], AutocompleteSessionToken = AutocompleteSessionToken.asInstanceOf[js.Any], PlacesService = PlacesService.asInstanceOf[js.Any], SearchBox = SearchBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofplaces]
  }
  @scala.inline
  implicit class TypeofplacesOps[Self <: Typeofplaces] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutocomplete(value: Instantiable1[/* inputField */ HTMLInputElement, Autocomplete]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Autocomplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutocompleteService(value: Instantiable0[AutocompleteService]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutocompleteService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutocompleteSessionToken(value: Instantiable0[AutocompleteSessionToken]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutocompleteSessionToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlacesService(value: Instantiable1[/* attrContainer */ HTMLDivElement, PlacesService]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlacesService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchBox(value: Instantiable1[/* inputField */ HTMLInputElement, SearchBox]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SearchBox")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

