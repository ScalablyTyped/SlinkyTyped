package typingsSlinky.maximMazurokGapiClientTpu.gapi.client.tpu

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientTpu.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientTpu.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcceleratorTypesResource extends js.Object {
  
  /** Gets AcceleratorType. */
  def get(): Request[AcceleratorType] = js.native
  def get(request: Accesstoken): Request[AcceleratorType] = js.native
  
  /** Lists accelerator types supported by this API. */
  def list(): Request[ListAcceleratorTypesResponse] = js.native
  def list(request: Alt): Request[ListAcceleratorTypesResponse] = js.native
}
