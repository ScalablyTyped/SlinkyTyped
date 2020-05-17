package typingsSlinky.i18next.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowedHosts extends js.Object {
  /**
    * Hostnames that are allowed to send last used data.
    * Please keep those to your local system, staging, test servers (not production)
    * @default ['localhost']
    */
  var allowedHosts: js.UndefOr[js.Array[String]] = js.native
  /**
    * An api key if you want to send missing keys
    */
  var apiKey: js.UndefOr[String] = js.native
  /**
    * Debounce interval to send data in milliseconds
    * @default 90000
    */
  var debounceSubmit: js.UndefOr[Double] = js.native
  /**
    * The id of your locize project
    */
  var projectId: String = js.native
  /**
    * The reference language of your project
    * @default 'en'
    */
  var referenceLng: js.UndefOr[String] = js.native
  /**
    * Version
    * @default 'latest'
    */
  var version: js.UndefOr[String] = js.native
}

object AllowedHosts {
  @scala.inline
  def apply(projectId: String): AllowedHosts = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowedHosts]
  }
  @scala.inline
  implicit class AllowedHostsOps[Self <: AllowedHosts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowedHosts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedHosts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedHosts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedHosts")(js.undefined)
        ret
    }
    @scala.inline
    def withApiKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiKey")(js.undefined)
        ret
    }
    @scala.inline
    def withDebounceSubmit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debounceSubmit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebounceSubmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debounceSubmit")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceLng(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceLng")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceLng: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceLng")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

