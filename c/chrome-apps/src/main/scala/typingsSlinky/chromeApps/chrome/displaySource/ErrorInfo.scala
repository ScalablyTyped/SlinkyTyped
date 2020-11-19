package typingsSlinky.chromeApps.chrome.displaySource

import typingsSlinky.chromeApps.anon.CAPABILITIESNEGOTIATIONERROR
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorInfo extends js.Object {
  
  var description: js.UndefOr[String] = js.native
  
  /** @see ErrorType */
  var `type`: ToStringLiteral[
    CAPABILITIESNEGOTIATIONERROR, 
    /* keyof chrome-apps.anon.CAPABILITIESNEGOTIATIONERROR */ CONNECTION_ERROR | CAPABILITIES_NEGOTIATION_ERROR | MEDIA_PIPELINE_ERROR | TIMEOUT_ERROR | UNKNOWN_ERROR, 
    Exclude[
      /* keyof chrome-apps.anon.CAPABILITIESNEGOTIATIONERROR */ CONNECTION_ERROR | CAPABILITIES_NEGOTIATION_ERROR | MEDIA_PIPELINE_ERROR | TIMEOUT_ERROR | UNKNOWN_ERROR, 
      unknown_error_ | media_pipeline_error_ | connection_error_ | capabilities_negotiation_error_ | timeout_error_
    ]
  ] = js.native
}
object ErrorInfo {
  
  @scala.inline
  def apply(
    `type`: ToStringLiteral[
      CAPABILITIESNEGOTIATIONERROR, 
      /* keyof chrome-apps.anon.CAPABILITIESNEGOTIATIONERROR */ CONNECTION_ERROR | CAPABILITIES_NEGOTIATION_ERROR | MEDIA_PIPELINE_ERROR | TIMEOUT_ERROR | UNKNOWN_ERROR, 
      Exclude[
        /* keyof chrome-apps.anon.CAPABILITIESNEGOTIATIONERROR */ CONNECTION_ERROR | CAPABILITIES_NEGOTIATION_ERROR | MEDIA_PIPELINE_ERROR | TIMEOUT_ERROR | UNKNOWN_ERROR, 
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(
      value: ToStringLiteral[
          CAPABILITIESNEGOTIATIONERROR, 
          /* keyof chrome-apps.anon.CAPABILITIESNEGOTIATIONERROR */ CONNECTION_ERROR | CAPABILITIES_NEGOTIATION_ERROR | MEDIA_PIPELINE_ERROR | TIMEOUT_ERROR | UNKNOWN_ERROR, 
          Exclude[
            /* keyof chrome-apps.anon.CAPABILITIESNEGOTIATIONERROR */ CONNECTION_ERROR | CAPABILITIES_NEGOTIATION_ERROR | MEDIA_PIPELINE_ERROR | TIMEOUT_ERROR | UNKNOWN_ERROR, 
            unknown_error_ | media_pipeline_error_ | connection_error_ | capabilities_negotiation_error_ | timeout_error_
          ]
        ]
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
  }
}
