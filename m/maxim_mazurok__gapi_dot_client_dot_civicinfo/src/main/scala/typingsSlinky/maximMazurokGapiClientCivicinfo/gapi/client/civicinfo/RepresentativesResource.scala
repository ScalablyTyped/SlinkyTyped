package typingsSlinky.maximMazurokGapiClientCivicinfo.gapi.client.civicinfo

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCivicinfo.anon.Callback
import typingsSlinky.maximMazurokGapiClientCivicinfo.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepresentativesResource extends StObject {
  
  /** Looks up political geography and representative information for a single address. */
  def representativeInfoByAddress(): Request[RepresentativeInfoResponse] = js.native
  def representativeInfoByAddress(request: Callback): Request[RepresentativeInfoResponse] = js.native
  
  /** Looks up representative information for a single geographic division. */
  def representativeInfoByDivision(): Request[RepresentativeInfoData] = js.native
  def representativeInfoByDivision(request: Fields): Request[RepresentativeInfoData] = js.native
}
