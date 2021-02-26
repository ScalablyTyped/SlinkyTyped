package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.`no-referrer-when-downgrade`
import typingsSlinky.electron.electronStrings.`no-referrer`
import typingsSlinky.electron.electronStrings.`same-origin`
import typingsSlinky.electron.electronStrings.`strict-origin-when-cross-origin`
import typingsSlinky.electron.electronStrings.`strict-origin`
import typingsSlinky.electron.electronStrings.`unsafe-url`
import typingsSlinky.electron.electronStrings.default
import typingsSlinky.electron.electronStrings.origin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Referrer extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/referrer
  /**
    * Can be `default`, `unsafe-url`, `no-referrer-when-downgrade`, `no-referrer`,
    * `origin`, `strict-origin-when-cross-origin`, `same-origin` or `strict-origin`.
    * See the Referrer-Policy spec for more details on the meaning of these values.
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
  implicit class ReferrerMutableBuilder[Self <: Referrer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicy(
      value: default | `unsafe-url` | `no-referrer-when-downgrade` | `no-referrer` | origin | `strict-origin-when-cross-origin` | `same-origin` | `strict-origin`
    ): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
