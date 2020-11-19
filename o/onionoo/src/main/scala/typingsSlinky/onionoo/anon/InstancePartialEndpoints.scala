package typingsSlinky.onionoo.anon

import typingsSlinky.got.mod.GotPromise
import typingsSlinky.onionoo.mod.Onionoo.Bandwidth
import typingsSlinky.onionoo.mod.Onionoo.Clients
import typingsSlinky.onionoo.mod.Onionoo.Details
import typingsSlinky.onionoo.mod.Onionoo.QueryParameters
import typingsSlinky.onionoo.mod.Onionoo.Summary
import typingsSlinky.onionoo.mod.Onionoo.Uptime
import typingsSlinky.onionoo.mod.Onionoo.Weights
import typingsSlinky.onionoo.onionooStrings.bandwidth
import typingsSlinky.onionoo.onionooStrings.clients
import typingsSlinky.onionoo.onionooStrings.details
import typingsSlinky.onionoo.onionooStrings.summary
import typingsSlinky.onionoo.onionooStrings.uptime
import typingsSlinky.onionoo.onionooStrings.weights
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined onionoo.onionoo.Onionoo.Instance & std.Partial<onionoo.onionoo.Onionoo.Endpoints> */
@js.native
trait InstancePartialEndpoints extends js.Object {
  
  var bandwidth: js.UndefOr[js.Function1[/* query */ js.UndefOr[QueryParameters], GotPromise[Bandwidth]]] = js.native
  
  var clients: js.UndefOr[js.Function1[/* query */ js.UndefOr[QueryParameters], GotPromise[Clients]]] = js.native
  
  var details: js.UndefOr[js.Function1[/* query */ js.UndefOr[QueryParameters], GotPromise[Details]]] = js.native
  
  @JSName("get")
  def get_bandwidth(endpoint: bandwidth): GotPromise[Bandwidth] = js.native
  @JSName("get")
  def get_bandwidth(endpoint: bandwidth, query: QueryParameters): GotPromise[Bandwidth] = js.native
  @JSName("get")
  def get_clients(endpoint: clients): GotPromise[Clients] = js.native
  @JSName("get")
  def get_clients(endpoint: clients, query: QueryParameters): GotPromise[Clients] = js.native
  @JSName("get")
  def get_details(endpoint: details): GotPromise[Details] = js.native
  @JSName("get")
  def get_details(endpoint: details, query: QueryParameters): GotPromise[Details] = js.native
  @JSName("get")
  def get_summary(endpoint: summary): GotPromise[Summary] = js.native
  @JSName("get")
  def get_summary(endpoint: summary, query: QueryParameters): GotPromise[Summary] = js.native
  @JSName("get")
  def get_uptime(endpoint: uptime): GotPromise[Uptime] = js.native
  @JSName("get")
  def get_uptime(endpoint: uptime, query: QueryParameters): GotPromise[Uptime] = js.native
  @JSName("get")
  def get_weights(endpoint: weights): GotPromise[Weights] = js.native
  @JSName("get")
  def get_weights(endpoint: weights, query: QueryParameters): GotPromise[Weights] = js.native
  
  var summary: js.UndefOr[js.Function1[/* query */ js.UndefOr[QueryParameters], GotPromise[Summary]]] = js.native
  
  var uptime: js.UndefOr[js.Function1[/* query */ js.UndefOr[QueryParameters], GotPromise[Uptime]]] = js.native
  
  var weights: js.UndefOr[js.Function1[/* query */ js.UndefOr[QueryParameters], GotPromise[Weights]]] = js.native
}
