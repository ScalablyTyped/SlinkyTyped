package typingsSlinky.appleMapkitJsBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mapkit {
  
  type AutocompleteSearchCallback = js.Function2[
    /* error */ js.Error | scala.Null, 
    /* data */ typingsSlinky.appleMapkitJsBrowser.mapkit.SearchAutocompleteResponse, 
    scala.Unit
  ]
  
  /**
    * A customized annotation with image resources that you provide.
    */
  type ImageAnnotation = typingsSlinky.appleMapkitJsBrowser.mapkit.Annotation
  
  type ImportGeoJSONCallback = js.Function2[
    /* error */ js.Error, 
    /* result */ typingsSlinky.appleMapkitJsBrowser.mapkit.ItemCollection, 
    scala.Unit
  ]
  
  type PointsOfInterestSearchCallback = js.Function2[
    /* error */ js.Error | scala.Null, 
    /* data */ typingsSlinky.appleMapkitJsBrowser.mapkit.PointsOfInterestSearchResponse, 
    scala.Unit
  ]
  
  type SearchCallback[Q] = js.Function2[
    /* error */ js.Error | scala.Null, 
    /* data */ typingsSlinky.appleMapkitJsBrowser.anon.DisplayRegion[Q], 
    scala.Unit
  ]
  
  type URLTemplateCallback = js.Function5[
    /* x */ scala.Double, 
    /* y */ scala.Double, 
    /* z */ scala.Double, 
    /* scale */ scala.Double, 
    /* data */ js.Object, 
    java.lang.String
  ]
}
