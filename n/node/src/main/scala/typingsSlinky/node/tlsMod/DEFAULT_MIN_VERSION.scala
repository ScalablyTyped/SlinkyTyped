package typingsSlinky.node.tlsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The default value of the minVersion option of tls.createSecureContext().
  * It can be assigned any of the supported TLS protocol versions,
  * 'TLSv1.3', 'TLSv1.2', 'TLSv1.1', or 'TLSv1'. Default: 'TLSv1.2', unless
  * changed using CLI options. Using --tls-min-v1.0 sets the default to
  * 'TLSv1'. Using --tls-min-v1.1 sets the default to 'TLSv1.1'. Using
  * --tls-min-v1.3 sets the default to 'TLSv1.3'. If multiple of the options
  * are provided, the lowest minimum is used.
  */
@JSImport("tls", "DEFAULT_MIN_VERSION")
@js.native
object DEFAULT_MIN_VERSION extends TopLevel[SecureVersion]
