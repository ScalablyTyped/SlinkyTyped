package typingsSlinky.gapiClientIam.gapi.client.iam

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientIam.AnonBearertoken
import typingsSlinky.gapiClientIam.AnonKeyTypes
import typingsSlinky.gapiClientIam.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeysResource extends js.Object {
  /**
    * Creates a ServiceAccountKey
    * and returns it.
    */
  def create(request: AnonBearertoken): Request_[ServiceAccountKey]
  /** Deletes a ServiceAccountKey. */
  def delete(request: AnonBearertoken): Request_[js.Object]
  /**
    * Gets the ServiceAccountKey
    * by key id.
    */
  def get(request: AnonName): Request_[ServiceAccountKey]
  /** Lists ServiceAccountKeys. */
  def list(request: AnonKeyTypes): Request_[ListServiceAccountKeysResponse]
}

object KeysResource {
  @scala.inline
  def apply(
    create: AnonBearertoken => Request_[ServiceAccountKey],
    delete: AnonBearertoken => Request_[js.Object],
    get: AnonName => Request_[ServiceAccountKey],
    list: AnonKeyTypes => Request_[ListServiceAccountKeysResponse]
  ): KeysResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[KeysResource]
  }
}

