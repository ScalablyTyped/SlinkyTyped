package typingsSlinky.apolloDashLinkDashHttpDashCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object apolloDashLinkDashHttpDashCommonMod {
  import typingsSlinky.apolloDashLink.libTypesMod.Operation
  import typingsSlinky.apolloDashLinkDashHttpDashCommon.Anon_BodyText
  import typingsSlinky.apolloDashLinkDashHttpDashCommon.Anon_ParseError
  import typingsSlinky.apolloDashLinkDashHttpDashCommon.Anon_Response
  import typingsSlinky.tsDashInvariant.tsDashInvariantMod.InvariantError

  type ClientParseError = InvariantError with Anon_ParseError
  type ServerError = js.Error with Anon_Response
  type ServerParseError = js.Error with Anon_BodyText
  type UriFunction = js.Function1[/* operation */ Operation, String]
}
