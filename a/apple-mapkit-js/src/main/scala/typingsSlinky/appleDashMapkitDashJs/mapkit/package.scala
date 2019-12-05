package typingsSlinky.appleDashMapkitDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mapkit {
  import typingsSlinky.appleDashMapkitDashJs.Anon_DisplayRegion

  type AutocompleteSearchCallback = js.Function2[/* error */ js.Error | Null, /* data */ SearchAutocompleteResponse, Unit]
  type ImportGeoJSONCallback = js.Function2[/* error */ js.Error, /* result */ ItemCollection, Unit]
  type SearchCallback[Q] = js.Function2[/* error */ js.Error | Null, /* data */ Anon_DisplayRegion[Q], Unit]
  type URLTemplateCallback = js.Function5[
    /* x */ Double, 
    /* y */ Double, 
    /* z */ Double, 
    /* scale */ Double, 
    /* data */ js.Object, 
    String
  ]
}
