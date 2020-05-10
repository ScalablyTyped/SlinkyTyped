package typingsSlinky.npmListAuthorPackages.mod

import typingsSlinky.npmListAuthorPackages.npmListAuthorPackagesNumbers.`443`
import typingsSlinky.npmListAuthorPackages.npmListAuthorPackagesNumbers.`80`
import typingsSlinky.npmListAuthorPackages.npmListAuthorPackagesStrings.http
import typingsSlinky.npmListAuthorPackages.npmListAuthorPackagesStrings.https
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** registry port. Default: 443 (HTTPS) or 80 (HTTP). */
  var port: js.UndefOr[`443` | `80`] = js.native
  /** registry protocol. Default: 'https'. */
  var protocol: js.UndefOr[http | https] = js.native
  /** registry. Default: 'registry.npmjs.org'. */
  var registry: js.UndefOr[String] = js.native
  /** author username (required). */
  var username: String = js.native
}

object Options {
  @scala.inline
  def apply(username: String): Options = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPort(value: `443` | `80`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: http | https): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withRegistry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registry")(js.undefined)
        ret
    }
  }
  
}

