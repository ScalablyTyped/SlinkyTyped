package typingsSlinky.maximMazurokGapiClientDigitalassetlinks.gapi.client.digitalassetlinks

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDigitalassetlinks.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatementsResource extends js.Object {
  
  /**
    * Retrieves a list of all statements from a given source that match the specified target and statement string. The API guarantees that all statements with secure source assets, such
    * as HTTPS websites or Android apps, have been made in a secure way by the owner of those assets, as described in the [Digital Asset Links technical design
    * specification](https://github.com/google/digitalassetlinks/blob/master/well-known/details.md). Specifically, you should consider that for insecure websites (that is, where the URL
    * starts with `http://` instead of `https://`), this guarantee cannot be made. The `List` command is most useful in cases where the API client wants to know all the ways in which two
    * assets are related, or enumerate all the relationships from a particular source asset. Example: a feature that helps users navigate to related items. When a mobile app is running on
    * a device, the feature would make it easy to navigate to the corresponding web site or Google+ profile.
    */
  def list(): Request[ListResponse] = js.native
  def list(request: Alt): Request[ListResponse] = js.native
}
