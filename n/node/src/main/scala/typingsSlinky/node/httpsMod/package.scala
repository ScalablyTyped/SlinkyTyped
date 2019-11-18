package typingsSlinky.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object httpsMod {
  import typingsSlinky.node.Anon_RejectUnauthorized
  import typingsSlinky.node.tlsMod.SecureContextOptions
  import typingsSlinky.node.tlsMod.TlsOptions

  type RequestOptions = typingsSlinky.node.httpMod.RequestOptions with SecureContextOptions with Anon_RejectUnauthorized
  type ServerOptions = SecureContextOptions with TlsOptions with typingsSlinky.node.httpMod.ServerOptions
}
