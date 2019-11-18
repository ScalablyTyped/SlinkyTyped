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

trait Referrer extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/referrer
  /**
    * Can be default, unsafe-url, no-referrer-when-downgrade, no-referrer, origin,
    * strict-origin-when-cross-origin, same-origin or strict-origin. See the for more
    * details on the meaning of these values.
    */
  var policy: default | `unsafe-url` | `no-referrer-when-downgrade` | `no-referrer` | origin | `strict-origin-when-cross-origin` | `same-origin` | `strict-origin`
  /**
    * HTTP Referrer URL.
    */
  var url: String
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
}

