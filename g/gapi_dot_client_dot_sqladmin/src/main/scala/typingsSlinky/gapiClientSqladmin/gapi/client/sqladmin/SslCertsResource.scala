package typingsSlinky.gapiClientSqladmin.gapi.client.sqladmin

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientSqladmin.AnonFields
import typingsSlinky.gapiClientSqladmin.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SslCertsResource extends js.Object {
  /**
    * Generates a short-lived X509 certificate containing the provided public key and signed by a private key specific to the target instance. Users may use
    * the certificate to authenticate as themselves when connecting to the database.
    */
  def createEphemeral(request: AnonFields): Request_[SslCert] = js.native
  /** Deletes the SSL certificate. The change will not take effect until the instance is restarted. */
  def delete(request: AnonPrettyPrint): Request_[Operation] = js.native
  /**
    * Retrieves a particular SSL certificate. Does not include the private key (required for usage). The private key must be saved from the response to
    * initial creation.
    */
  def get(request: AnonPrettyPrint): Request_[SslCert] = js.native
  /**
    * Creates an SSL certificate and returns it along with the private key and server certificate authority. The new certificate will not be usable until the
    * instance is restarted.
    */
  def insert(request: AnonFields): Request_[SslCertsInsertResponse] = js.native
  /** Lists all of the current SSL certificates for the instance. */
  def list(request: AnonFields): Request_[SslCertsListResponse] = js.native
}

object SslCertsResource {
  @scala.inline
  def apply(
    createEphemeral: AnonFields => Request_[SslCert],
    delete: AnonPrettyPrint => Request_[Operation],
    get: AnonPrettyPrint => Request_[SslCert],
    insert: AnonFields => Request_[SslCertsInsertResponse],
    list: AnonFields => Request_[SslCertsListResponse]
  ): SslCertsResource = {
    val __obj = js.Dynamic.literal(createEphemeral = js.Any.fromFunction1(createEphemeral), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[SslCertsResource]
  }
  @scala.inline
  implicit class SslCertsResourceOps[Self <: SslCertsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateEphemeral(value: AnonFields => Request_[SslCert]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createEphemeral")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonPrettyPrint => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonPrettyPrint => Request_[SslCert]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonFields => Request_[SslCertsInsertResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonFields => Request_[SslCertsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

