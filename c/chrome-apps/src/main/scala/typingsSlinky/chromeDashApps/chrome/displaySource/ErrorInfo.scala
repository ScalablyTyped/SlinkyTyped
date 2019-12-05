package typingsSlinky.chromeDashApps.chrome.displaySource

import typingsSlinky.chromeDashApps.Anon_CAPABILITIESNEGOTIATIONERROR
import typingsSlinky.chromeDashApps.chrome.ToStringLiteral
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.capabilities_negotiation_error
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.connection_error
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.media_pipeline_error
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.timeout_error
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.unknown_error_
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorInfo extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  /** @see ErrorType */
  var `type`: ToStringLiteral[
    Anon_CAPABILITIESNEGOTIATIONERROR, 
    String, 
    Exclude[
      String, 
      unknown_error_ | capabilities_negotiation_error | timeout_error | media_pipeline_error | connection_error
    ]
  ]
}

object ErrorInfo {
  @scala.inline
  def apply(
    `type`: ToStringLiteral[
      Anon_CAPABILITIESNEGOTIATIONERROR, 
      String, 
      Exclude[
        String, 
        unknown_error_ | capabilities_negotiation_error | timeout_error | media_pipeline_error | connection_error
      ]
    ],
    description: String = null
  ): ErrorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorInfo]
  }
}

