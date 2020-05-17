package typingsSlinky.gapiClientSqladmin.gapi.client.sqladmin

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientSqladmin.anon.Fields
import typingsSlinky.gapiClientSqladmin.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SslCertsResource extends js.Object {
  /**
    * Generates a short-lived X509 certificate containing the provided public key and signed by a private key specific to the target instance. Users may use
    * the certificate to authenticate as themselves when connecting to the database.
    */
  def createEphemeral(request: Fields): Request[SslCert] = js.native
  /** Deletes the SSL certificate. The change will not take effect until the instance is restarted. */
  def delete(request: PrettyPrint): Request[Operation] = js.native
  /**
    * Retrieves a particular SSL certificate. Does not include the private key (required for usage). The private key must be saved from the response to
    * initial creation.
    */
  def get(request: PrettyPrint): Request[SslCert] = js.native
  /**
    * Creates an SSL certificate and returns it along with the private key and server certificate authority. The new certificate will not be usable until the
    * instance is restarted.
    */
  def insert(request: Fields): Request[SslCertsInsertResponse] = js.native
  /** Lists all of the current SSL certificates for the instance. */
  def list(request: Fields): Request[SslCertsListResponse] = js.native
}

object SslCertsResource {
  @scala.inline
  def apply(
    createEphemeral: Fields => Request[SslCert],
    delete: PrettyPrint => Request[Operation],
    get: PrettyPrint => Request[SslCert],
    insert: Fields => Request[SslCertsInsertResponse],
    list: Fields => Request[SslCertsListResponse]
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
    def withCreateEphemeral(value: Fields => Request[SslCert]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createEphemeral")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: PrettyPrint => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: PrettyPrint => Request[SslCert]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: Fields => Request[SslCertsInsertResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Fields => Request[SslCertsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

