package typingsSlinky.googlemaps.google.maps.places

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutocompleteService extends js.Object {
  def getPlacePredictions(
    request: AutocompletionRequest,
    callback: js.Function2[
      /* result */ js.Array[AutocompletePrediction], 
      /* status */ PlacesServiceStatus, 
      Unit
    ]
  ): Unit = js.native
  def getQueryPredictions(
    request: QueryAutocompletionRequest,
    callback: js.Function2[
      /* result */ js.Array[QueryAutocompletePrediction], 
      /* status */ PlacesServiceStatus, 
      Unit
    ]
  ): Unit = js.native
}

object AutocompleteService {
  @scala.inline
  def apply(
    getPlacePredictions: (AutocompletionRequest, js.Function2[
      /* result */ js.Array[AutocompletePrediction], 
      /* status */ PlacesServiceStatus, 
      Unit
    ]) => Unit,
    getQueryPredictions: (QueryAutocompletionRequest, js.Function2[
      /* result */ js.Array[QueryAutocompletePrediction], 
      /* status */ PlacesServiceStatus, 
      Unit
    ]) => Unit
  ): AutocompleteService = {
    val __obj = js.Dynamic.literal(getPlacePredictions = js.Any.fromFunction2(getPlacePredictions), getQueryPredictions = js.Any.fromFunction2(getQueryPredictions))
    __obj.asInstanceOf[AutocompleteService]
  }
  @scala.inline
  implicit class AutocompleteServiceOps[Self <: AutocompleteService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetPlacePredictions(
      value: (AutocompletionRequest, js.Function2[
          /* result */ js.Array[AutocompletePrediction], 
          /* status */ PlacesServiceStatus, 
          Unit
        ]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPlacePredictions")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetQueryPredictions(
      value: (QueryAutocompletionRequest, js.Function2[
          /* result */ js.Array[QueryAutocompletePrediction], 
          /* status */ PlacesServiceStatus, 
          Unit
        ]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getQueryPredictions")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

