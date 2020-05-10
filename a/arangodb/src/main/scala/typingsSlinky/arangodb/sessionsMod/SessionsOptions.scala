package typingsSlinky.arangodb.sessionsMod

import typingsSlinky.arangodb.ArangoDB.Collection
import typingsSlinky.arangodb.Foxx.SessionStorage
import typingsSlinky.arangodb.Foxx.SessionTransport
import typingsSlinky.arangodb.arangodbStrings.cookie
import typingsSlinky.arangodb.arangodbStrings.header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionsOptions extends js.Object {
  var autoCreate: js.UndefOr[Boolean] = js.native
  var storage: SessionStorage | String | Collection[_] = js.native
  var transport: SessionTransport | js.Array[SessionTransport] | cookie | header = js.native
}

object SessionsOptions {
  @scala.inline
  def apply(
    storage: SessionStorage | String | Collection[_],
    transport: SessionTransport | js.Array[SessionTransport] | cookie | header
  ): SessionsOptions = {
    val __obj = js.Dynamic.literal(storage = storage.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionsOptions]
  }
  @scala.inline
  implicit class SessionsOptionsOps[Self <: SessionsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStorage(value: SessionStorage | String | Collection[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransport(value: SessionTransport | js.Array[SessionTransport] | cookie | header): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoCreate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCreate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCreate")(js.undefined)
        ret
    }
  }
  
}

