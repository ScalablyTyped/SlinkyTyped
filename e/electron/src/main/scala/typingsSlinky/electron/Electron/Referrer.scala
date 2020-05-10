package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.`no-referrer-when-downgrade`
import typingsSlinky.electron.electronStrings.`no-referrer`
import typingsSlinky.electron.electronStrings.`same-origin`
import typingsSlinky.electron.electronStrings.`strict-origin-when-cross-origin`
import typingsSlinky.electron.electronStrings.`strict-origin`
import typingsSlinky.electron.electronStrings.`unsafe-url`
import typingsSlinky.electron.electronStrings.default
import typingsSlinky.electron.electronStrings.origin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Referrer extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/referrer
  /**
    * Can be default, unsafe-url, no-referrer-when-downgrade, no-referrer, origin,
    * strict-origin-when-cross-origin, same-origin or strict-origin. See the for more
    * details on the meaning of these values.
    */
  var policy: default | `unsafe-url` | `no-referrer-when-downgrade` | `no-referrer` | origin | `strict-origin-when-cross-origin` | `same-origin` | `strict-origin` = js.native
  /**
    * HTTP Referrer URL.
    */
  var url: String = js.native
}

object Referrer {
  @scala.inline
  def apply(
    policy: default | `unsafe-url` | `no-referrer-when-downgrade` | `no-referrer` | origin | `strict-origin-when-cross-origin` | `same-origin` | `strict-origin`,
    url: String
  ): Referrer = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Referrer]
  }
  @scala.inline
  implicit class ReferrerOps[Self <: Referrer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicy(
      value: default | `unsafe-url` | `no-referrer-when-downgrade` | `no-referrer` | origin | `strict-origin-when-cross-origin` | `same-origin` | `strict-origin`
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

