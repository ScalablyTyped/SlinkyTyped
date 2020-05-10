package typingsSlinky.hellojs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HelloJSServiceDef extends js.Object {
  var base: js.UndefOr[String] = js.native
  var del: js.UndefOr[StringDictionary[String | HelloJSUrlMappingFunction]] = js.native
  var form: js.UndefOr[(js.Function2[/* p */ js.Any, /* query */ js.Any, Unit]) | Boolean] = js.native
  var get: js.UndefOr[StringDictionary[String | HelloJSUrlMappingFunction]] = js.native
  var jsonp: js.UndefOr[(js.Function2[/* p */ js.Any, /* query */ js.Any, Unit]) | Boolean] = js.native
  var login: js.UndefOr[js.Function1[/* p */ js.Any, Unit]] = js.native
  var logout: js.UndefOr[(js.Function1[/* callback */ js.Function0[Unit | String], Unit]) | String] = js.native
  var name: js.UndefOr[String] = js.native
  var oauth: HelloJSOAuth2Def | HelloJSOAuth1Def = js.native
  var patch: js.UndefOr[StringDictionary[String | HelloJSUrlMappingFunction]] = js.native
  var post: js.UndefOr[StringDictionary[String | HelloJSUrlMappingFunction]] = js.native
  var put: js.UndefOr[StringDictionary[String | HelloJSUrlMappingFunction]] = js.native
  var refresh: js.UndefOr[Boolean] = js.native
  var root: js.UndefOr[String] = js.native
  var scope: js.UndefOr[StringDictionary[String]] = js.native
  var scope_delim: js.UndefOr[String] = js.native
  var wrap: js.UndefOr[
    StringDictionary[js.Function3[/* r */ js.Any, /* headers */ js.Any, /* p */ js.Any, Unit]]
  ] = js.native
  var xhr: js.UndefOr[js.Function2[/* p */ js.Any, /* query */ js.Any, Unit]] = js.native
}

object HelloJSServiceDef {
  @scala.inline
  def apply(oauth: HelloJSOAuth2Def | HelloJSOAuth1Def): HelloJSServiceDef = {
    val __obj = js.Dynamic.literal(oauth = oauth.asInstanceOf[js.Any])
    __obj.asInstanceOf[HelloJSServiceDef]
  }
  @scala.inline
  implicit class HelloJSServiceDefOps[Self <: HelloJSServiceDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOauth(value: HelloJSOAuth2Def | HelloJSOAuth1Def): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(js.undefined)
        ret
    }
    @scala.inline
    def withDel(value: StringDictionary[String | HelloJSUrlMappingFunction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("del")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("del")(js.undefined)
        ret
    }
    @scala.inline
    def withFormFunction2(value: (/* p */ js.Any, /* query */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withForm(value: (js.Function2[/* p */ js.Any, /* query */ js.Any, Unit]) | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(js.undefined)
        ret
    }
    @scala.inline
    def withGet(value: StringDictionary[String | HelloJSUrlMappingFunction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.undefined)
        ret
    }
    @scala.inline
    def withJsonpFunction2(value: (/* p */ js.Any, /* query */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonp")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withJsonp(value: (js.Function2[/* p */ js.Any, /* query */ js.Any, Unit]) | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsonp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonp")(js.undefined)
        ret
    }
    @scala.inline
    def withLogin(value: /* p */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("login")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLogin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("login")(js.undefined)
        ret
    }
    @scala.inline
    def withLogoutFunction1(value: /* callback */ js.Function0[Unit | String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLogout(value: (js.Function1[/* callback */ js.Function0[Unit | String], Unit]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logout")(js.undefined)
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
    def withPatch(value: StringDictionary[String | HelloJSUrlMappingFunction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.undefined)
        ret
    }
    @scala.inline
    def withPost(value: StringDictionary[String | HelloJSUrlMappingFunction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post")(js.undefined)
        ret
    }
    @scala.inline
    def withPut(value: StringDictionary[String | HelloJSUrlMappingFunction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("put")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("put")(js.undefined)
        ret
    }
    @scala.inline
    def withRefresh(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refresh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refresh")(js.undefined)
        ret
    }
    @scala.inline
    def withRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
    @scala.inline
    def withScope_delim(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope_delim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope_delim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope_delim")(js.undefined)
        ret
    }
    @scala.inline
    def withWrap(value: StringDictionary[js.Function3[/* r */ js.Any, /* headers */ js.Any, /* p */ js.Any, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(js.undefined)
        ret
    }
    @scala.inline
    def withXhr(value: (/* p */ js.Any, /* query */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhr")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutXhr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhr")(js.undefined)
        ret
    }
  }
  
}

