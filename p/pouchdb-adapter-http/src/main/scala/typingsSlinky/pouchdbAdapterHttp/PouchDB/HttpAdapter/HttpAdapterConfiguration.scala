package typingsSlinky.pouchdbAdapterHttp.PouchDB.HttpAdapter

import org.scalajs.dom.experimental.Request
import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.Response
import typingsSlinky.pouchdbAdapterHttp.pouchdbAdapterHttpStrings.http
import typingsSlinky.pouchdbCore.PouchDB.Configuration.RemoteDatabaseConfiguration
import typingsSlinky.pouchdbCore.anon.Password
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpAdapterConfiguration extends RemoteDatabaseConfiguration {
  @JSName("adapter")
  var adapter_HttpAdapterConfiguration: http
}

object HttpAdapterConfiguration {
  @scala.inline
  def apply(
    adapter: http,
    auth: Password = null,
    fetch: (/* url */ String | Request, /* opts */ js.UndefOr[RequestInit]) => js.Promise[Response] = null,
    name: String = null,
    skip_setup: js.UndefOr[Boolean] = js.undefined
  ): HttpAdapterConfiguration = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (fetch != null) __obj.updateDynamic("fetch")(js.Any.fromFunction2(fetch))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(skip_setup)) __obj.updateDynamic("skip_setup")(skip_setup.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpAdapterConfiguration]
  }
}

