package typingsSlinky.fhirJsClient.FHIR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object SMART {
  
  /**
    * Indexable type used to represent Observation FHIR resources indexed based on codes.
    */
  type ObservationsByCode = org.scalablytyped.runtime.StringDictionary[js.Array[typingsSlinky.fhirJsClient.FHIR.SMART.Resource]]
  
  /**
    * Funtion type returned by the fetchAllWithReferences method
    */
  type ResolveFn = js.Function2[
    /* resource */ typingsSlinky.fhirJsClient.FHIR.SMART.Resource, 
    /* reference */ typingsSlinky.fhirJsClient.FHIR.SMART.Reference, 
    typingsSlinky.fhirJsClient.FHIR.SMART.Resource
  ]
}
