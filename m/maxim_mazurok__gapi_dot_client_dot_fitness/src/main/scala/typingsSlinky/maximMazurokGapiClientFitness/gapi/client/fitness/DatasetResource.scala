package typingsSlinky.maximMazurokGapiClientFitness.gapi.client.fitness

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientFitness.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientFitness.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatasetResource extends StObject {
  
  /**
    * Aggregates data of a certain type or stream into buckets divided by a given type of boundary. Multiple data sets of multiple types and from multiple sources can be aggregated into
    * exactly one bucket type per request.
    */
  def aggregate(request: Accesstoken): Request[AggregateResponse] = js.native
  def aggregate(request: Alt, body: AggregateRequest): Request[AggregateResponse] = js.native
}
