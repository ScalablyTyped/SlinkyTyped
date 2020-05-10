package typingsSlinky.koaSession

import typingsSlinky.koa.mod.Context
import typingsSlinky.koaSession.koaSessionStrings.lax
import typingsSlinky.koaSession.koaSessionStrings.none
import typingsSlinky.koaSession.koaSessionStrings.session
import typingsSlinky.koaSession.koaSessionStrings.strict
import typingsSlinky.koaSession.mod.ExternalKeys
import typingsSlinky.koaSession.mod.Session
import typingsSlinky.koaSession.mod.stores
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<koa-session.koa-session.opts> */
@js.native
trait Partialopts extends js.Object {
  var ContextStore: js.UndefOr[AnonInstantiable] = js.native
  var beforeSave: js.UndefOr[js.Function2[/* ctx */ Context, /* session */ Session, Unit]] = js.native
  var decode: js.UndefOr[js.Function1[/* str */ String, js.Object]] = js.native
  var domain: js.UndefOr[String] = js.native
  var encode: js.UndefOr[js.Function1[/* obj */ js.Object, String]] = js.native
  var expires: js.UndefOr[js.Date] = js.native
  var externalKey: js.UndefOr[ExternalKeys] = js.native
  var genid: js.UndefOr[js.Function0[String]] = js.native
  var httpOnly: js.UndefOr[Boolean] = js.native
  var key: js.UndefOr[String] = js.native
  var maxAge: js.UndefOr[Double | session] = js.native
  var overwrite: js.UndefOr[Boolean] = js.native
  var path: js.UndefOr[String] = js.native
  var prefix: js.UndefOr[String] = js.native
  var renew: js.UndefOr[Boolean] = js.native
  var rolling: js.UndefOr[Boolean] = js.native
  var sameSite: js.UndefOr[strict | lax | none | Boolean] = js.native
  var secure: js.UndefOr[Boolean] = js.native
  var secureProxy: js.UndefOr[Boolean] = js.native
  var signed: js.UndefOr[Boolean] = js.native
  var store: js.UndefOr[stores] = js.native
  var valid: js.UndefOr[js.Function2[/* ctx */ Context, /* session */ PartialSession, Unit]] = js.native
}

object Partialopts {
  @scala.inline
  def apply(): Partialopts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialopts]
  }
  @scala.inline
  implicit class PartialoptsOps[Self <: Partialopts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContextStore(value: AnonInstantiable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContextStore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContextStore")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeSave(value: (/* ctx */ Context, /* session */ Session) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSave")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSave")(js.undefined)
        ret
    }
    @scala.inline
    def withDecode(value: /* str */ String => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDecode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decode")(js.undefined)
        ret
    }
    @scala.inline
    def withDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
    @scala.inline
    def withEncode(value: /* obj */ js.Object => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEncode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(js.undefined)
        ret
    }
    @scala.inline
    def withExpires(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpires: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalKey(value: ExternalKeys): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalKey")(js.undefined)
        ret
    }
    @scala.inline
    def withGenid(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genid")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGenid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genid")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAge(value: Double | session): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(js.undefined)
        ret
    }
    @scala.inline
    def withOverwrite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverwrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwrite")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withRenew(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renew")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenew: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renew")(js.undefined)
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
    def withSameSite(value: strict | lax | none | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sameSite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSameSite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sameSite")(js.undefined)
        ret
    }
    @scala.inline
    def withSecure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure")(js.undefined)
        ret
    }
    @scala.inline
    def withSecureProxy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureProxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecureProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureProxy")(js.undefined)
        ret
    }
    @scala.inline
    def withSigned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signed")(js.undefined)
        ret
    }
    @scala.inline
    def withStore(value: stores): Self = {
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
    def withValid(value: (/* ctx */ Context, /* session */ PartialSession) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutValid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid")(js.undefined)
        ret
    }
  }
  
}

