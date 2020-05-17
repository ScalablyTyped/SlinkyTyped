package typingsSlinky.passportSamlMetadata.fetchMod

import typingsSlinky.passportSamlMetadata.anon.Get
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  client ? :{get (url : string, params ? : std.Partial<passport-saml-metadata.passport-saml-metadata/src/fetch.FetchAxiosConfig>): std.Promise<{  data  :string}>},   url  :string} & std.Partial<passport-saml-metadata.passport-saml-metadata/src/fetch.FetchAxiosConfig> */
@js.native
trait FetchConfig extends js.Object {
  var backupStore: js.UndefOr[Map[String, String]] = js.native
  var client: js.UndefOr[Get] = js.native
  var responseType: js.UndefOr[String] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var url: String = js.native
}

object FetchConfig {
  @scala.inline
  def apply(url: String): FetchConfig = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchConfig]
  }
  @scala.inline
  implicit class FetchConfigOps[Self <: FetchConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackupStore(value: Map[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backupStore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backupStore")(js.undefined)
        ret
    }
    @scala.inline
    def withClient(value: Get): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseType")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

