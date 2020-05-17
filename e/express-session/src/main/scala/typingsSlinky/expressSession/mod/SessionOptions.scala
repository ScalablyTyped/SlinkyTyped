package typingsSlinky.expressSession.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.expressSession.anon.Domain
import typingsSlinky.expressSession.expressSessionStrings.destroy
import typingsSlinky.expressSession.expressSessionStrings.keep
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionOptions extends js.Object {
  var cookie: js.UndefOr[Domain] = js.native
  var genid: js.UndefOr[js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], String]] = js.native
  var name: js.UndefOr[String] = js.native
  var proxy: js.UndefOr[Boolean] = js.native
  var resave: js.UndefOr[Boolean] = js.native
  var rolling: js.UndefOr[Boolean] = js.native
  var saveUninitialized: js.UndefOr[Boolean] = js.native
  var secret: String | js.Array[String] = js.native
  var store: js.UndefOr[Store | MemoryStore] = js.native
  /**
    * Control the result of unsetting req.session (through delete, setting to null, etc.).
    * - 'destroy' The session will be destroyed (deleted) when the response ends.
    * - 'keep' The session in the store will be kept, but modifications made during the request are ignored and not saved.
    * @default 'keep'
    */
  var unset: js.UndefOr[destroy | keep] = js.native
}

object SessionOptions {
  @scala.inline
  def apply(secret: String | js.Array[String]): SessionOptions = {
    val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionOptions]
  }
  @scala.inline
  implicit class SessionOptionsOps[Self <: SessionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSecret(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCookie(value: Domain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookie: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie")(js.undefined)
        ret
    }
    @scala.inline
    def withGenid(value: /* req */ Request_[ParamsDictionary, _, _, Query] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genid")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGenid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genid")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withProxy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(js.undefined)
        ret
    }
    @scala.inline
    def withResave(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resave")(js.undefined)
        ret
    }
    @scala.inline
    def withRolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rolling")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveUninitialized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveUninitialized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveUninitialized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveUninitialized")(js.undefined)
        ret
    }
    @scala.inline
    def withStore(value: Store | MemoryStore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(js.undefined)
        ret
    }
    @scala.inline
    def withUnset(value: destroy | keep): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unset")(js.undefined)
        ret
    }
  }
  
}

