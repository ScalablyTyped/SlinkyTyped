package typingsSlinky.keystonejsKeystone.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.keystonejsKeystone.AnonField
import typingsSlinky.keystonejsKeystone.AnonMaxTotalResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeystoneOptions extends js.Object {
  var adapter: BaseKeystoneAdapter = js.native
  var adapters: js.UndefOr[StringDictionary[BaseKeystoneAdapter]] = js.native
  var cookieMaxAge: js.UndefOr[Double] = js.native
  var cookieSecret: js.UndefOr[String] = js.native
  var defaultAcces: js.UndefOr[AnonField] = js.native
  var defaultAdapter: js.UndefOr[String] = js.native
  var name: String = js.native
  var onConnect: js.UndefOr[js.Function0[Unit]] = js.native
  var queryLimits: js.UndefOr[AnonMaxTotalResults] = js.native
   // TODO: bring in express session types
  var schemaNames: js.UndefOr[js.Array[String]] = js.native
  var secureCookies: js.UndefOr[Boolean] = js.native
  var sessionStore: js.UndefOr[js.Any] = js.native
}

object KeystoneOptions {
  @scala.inline
  def apply(adapter: BaseKeystoneAdapter, name: String): KeystoneOptions = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeystoneOptions]
  }
  @scala.inline
  implicit class KeystoneOptionsOps[Self <: KeystoneOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdapter(value: BaseKeystoneAdapter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adapter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdapters(value: StringDictionary[BaseKeystoneAdapter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adapters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdapters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adapters")(js.undefined)
        ret
    }
    @scala.inline
    def withCookieMaxAge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieMaxAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookieMaxAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieMaxAge")(js.undefined)
        ret
    }
    @scala.inline
    def withCookieSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookieSecret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieSecret")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultAcces(value: AnonField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAcces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultAcces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAcces")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultAdapter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAdapter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultAdapter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAdapter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnConnect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConnect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnConnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConnect")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryLimits(value: AnonMaxTotalResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryLimits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryLimits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryLimits")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaNames")(js.undefined)
        ret
    }
    @scala.inline
    def withSecureCookies(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureCookies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecureCookies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureCookies")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionStore(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionStore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionStore")(js.undefined)
        ret
    }
  }
  
}

