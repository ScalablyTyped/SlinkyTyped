package typingsSlinky.reactDashGoogleDashMapsDashLoader

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

trait Typeofplaces extends js.Object {
  var Autocomplete: Instantiable1[
    /* inputField */ HTMLInputElement, 
    typingsSlinky.googlemaps.google.maps.places.Autocomplete
  ]
  var AutocompleteService: Instantiable0[typingsSlinky.googlemaps.google.maps.places.AutocompleteService]
  var AutocompleteSessionToken: Instantiable0[typingsSlinky.googlemaps.google.maps.places.AutocompleteSessionToken]
  var PlacesService: Instantiable1[
    /* attrContainer */ HTMLDivElement, 
    typingsSlinky.googlemaps.google.maps.places.PlacesService
  ]
  var SearchBox: Instantiable1[
    /* inputField */ HTMLInputElement, 
    typingsSlinky.googlemaps.google.maps.places.SearchBox
  ]
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
}

