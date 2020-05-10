package typingsSlinky.pouchdbAdapterHttp.PouchDB.HttpAdapter

import typingsSlinky.pouchdbAdapterHttp.pouchdbAdapterHttpStrings.http
import typingsSlinky.pouchdbCore.PouchDB.Configuration.RemoteDatabaseConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpAdapterConfiguration extends RemoteDatabaseConfiguration {
  @JSName("adapter")
  var adapter_HttpAdapterConfiguration: http = js.native
}

object HttpAdapterConfiguration {
  @scala.inline
  def apply(adapter: http): HttpAdapterConfiguration = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpAdapterConfiguration]
  }
  @scala.inline
  implicit class HttpAdapterConfigurationOps[Self <: HttpAdapterConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdapter(value: http): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adapter")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

