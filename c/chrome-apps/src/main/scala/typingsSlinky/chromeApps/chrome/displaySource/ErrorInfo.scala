package typingsSlinky.chromeApps.chrome.displaySource

import typingsSlinky.chromeApps.AnonCAPABILITIESNEGOTIATIONERROR
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chromeAppsStrings.CAPABILITIES_NEGOTIATION_ERROR
import typingsSlinky.chromeApps.chromeAppsStrings.CONNECTION_ERROR
import typingsSlinky.chromeApps.chromeAppsStrings.MEDIA_PIPELINE_ERROR
import typingsSlinky.chromeApps.chromeAppsStrings.TIMEOUT_ERROR
import typingsSlinky.chromeApps.chromeAppsStrings.UNKNOWN_ERROR
import typingsSlinky.chromeApps.chromeAppsStrings.capabilities_negotiation_error_
import typingsSlinky.chromeApps.chromeAppsStrings.connection_error_
import typingsSlinky.chromeApps.chromeAppsStrings.media_pipeline_error_
import typingsSlinky.chromeApps.chromeAppsStrings.timeout_error_
import typingsSlinky.chromeApps.chromeAppsStrings.unknown_error_
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorInfo extends js.Object {
  var description: js.UndefOr[String] = js.native
  /** @see ErrorType */
  var `type`: ToStringLiteral[
    AnonCAPABILITIESNEGOTIATIONERROR, 
    /* keyof chrome-apps.AnonCAPABILITIESNEGOTIATIONERROR */ CONNECTION_ERROR | CAPABILITIES_NEGOTIATION_ERROR | MEDIA_PIPELINE_ERROR | TIMEOUT_ERROR | UNKNOWN_ERROR, 
    Exclude[
      /* keyof chrome-apps.AnonCAPABILITIESNEGOTIATIONERROR */ CONNECTION_ERROR | CAPABILITIES_NEGOTIATION_ERROR | MEDIA_PIPELINE_ERROR | TIMEOUT_ERROR | UNKNOWN_ERROR, 
      unknown_error_ | media_pipeline_error_ | connection_error_ | capabilities_negotiation_error_ | timeout_error_
    ]
  ] = js.native
}

object ErrorInfo {
  @scala.inline
  def apply(
    `type`: ToStringLiteral[
      AnonCAPABILITIESNEGOTIATIONERROR, 
      /* keyof chrome-apps.AnonCAPABILITIESNEGOTIATIONERROR */ CONNECTION_ERROR | CAPABILITIES_NEGOTIATION_ERROR | MEDIA_PIPELINE_ERROR | TIMEOUT_ERROR | UNKNOWN_ERROR, 
      Exclude[
        /* keyof chrome-apps.AnonCAPABILITIESNEGOTIATIONERROR */ CONNECTION_ERROR | CAPABILITIES_NEGOTIATION_ERROR | MEDIA_PIPELINE_ERROR | TIMEOUT_ERROR | UNKNOWN_ERROR, 
        unknown_error_ | media_pipeline_error_ | connection_error_ | capabilities_negotiation_error_ | timeout_error_
      ]
    ]
  ): ErrorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorInfo]
  }
  @scala.inline
  implicit class ErrorInfoOps[Self <: ErrorInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(
      value: ToStringLiteral[
          AnonCAPABILITIESNEGOTIATIONERROR, 
          /* keyof chrome-apps.AnonCAPABILITIESNEGOTIATIONERROR */ CONNECTION_ERROR | CAPABILITIES_NEGOTIATION_ERROR | MEDIA_PIPELINE_ERROR | TIMEOUT_ERROR | UNKNOWN_ERROR, 
          Exclude[
            /* keyof chrome-apps.AnonCAPABILITIESNEGOTIATIONERROR */ CONNECTION_ERROR | CAPABILITIES_NEGOTIATION_ERROR | MEDIA_PIPELINE_ERROR | TIMEOUT_ERROR | UNKNOWN_ERROR, 
            unknown_error_ | media_pipeline_error_ | connection_error_ | capabilities_negotiation_error_ | timeout_error_
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
  }
  
}

