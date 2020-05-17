package typingsSlinky.pouchdbCore.PouchDB.Configuration

import org.scalajs.dom.experimental.Request
import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.Response
import typingsSlinky.pouchdbCore.Fetch
import typingsSlinky.pouchdbCore.anon.Password
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoteDatabaseConfiguration
  extends CommonDatabaseConfiguration
     with DatabaseConfiguration {
  var auth: js.UndefOr[Password] = js.native
  var fetch: js.UndefOr[Fetch] = js.native
  /**
    * Disables automatic creation of databases.
    */
  var skip_setup: js.UndefOr[Boolean] = js.native
}

object RemoteDatabaseConfiguration {
  @scala.inline
  def apply(): RemoteDatabaseConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteDatabaseConfiguration]
  }
  @scala.inline
  implicit class RemoteDatabaseConfigurationOps[Self <: RemoteDatabaseConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: Password): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withFetch(value: (/* url */ String | Request, /* opts */ js.UndefOr[RequestInit]) => js.Promise[Response]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFetch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch")(js.undefined)
        ret
    }
    @scala.inline
    def withSkip_setup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip_setup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkip_setup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip_setup")(js.undefined)
        ret
    }
  }
  
}

