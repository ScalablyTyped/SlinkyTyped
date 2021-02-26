package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chromeAppsStrings.AUTHENTICATION_REQUIRED
import typingsSlinky.chromeApps.chromeAppsStrings.DISABLED
import typingsSlinky.chromeApps.chromeAppsStrings.INITIALIZING
import typingsSlinky.chromeApps.chromeAppsStrings.RUNNING
import typingsSlinky.chromeApps.chromeAppsStrings.TEMPORARY_UNAVAILABLE
import typingsSlinky.chromeApps.chromeAppsStrings.authentication_required_
import typingsSlinky.chromeApps.chromeAppsStrings.disabled__
import typingsSlinky.chromeApps.chromeAppsStrings.initializing_
import typingsSlinky.chromeApps.chromeAppsStrings.running_
import typingsSlinky.chromeApps.chromeAppsStrings.temporary_unavailable_
import typingsSlinky.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait State extends StObject {
  
  var description: String = js.native
  
  var state: ToStringLiteral[
    AUTHENTICATIONREQUIRED, 
    /* keyof chrome-apps.anon.AUTHENTICATIONREQUIRED */ INITIALIZING | RUNNING | AUTHENTICATION_REQUIRED | TEMPORARY_UNAVAILABLE | DISABLED, 
    Exclude[
      /* keyof chrome-apps.anon.AUTHENTICATIONREQUIRED */ INITIALIZING | RUNNING | AUTHENTICATION_REQUIRED | TEMPORARY_UNAVAILABLE | DISABLED, 
      temporary_unavailable_ | authentication_required_ | disabled__ | initializing_ | running_
    ]
  ] = js.native
}
object State {
  
  @scala.inline
  def apply(
    description: String,
    state: ToStringLiteral[
      AUTHENTICATIONREQUIRED, 
      /* keyof chrome-apps.anon.AUTHENTICATIONREQUIRED */ INITIALIZING | RUNNING | AUTHENTICATION_REQUIRED | TEMPORARY_UNAVAILABLE | DISABLED, 
      Exclude[
        /* keyof chrome-apps.anon.AUTHENTICATIONREQUIRED */ INITIALIZING | RUNNING | AUTHENTICATION_REQUIRED | TEMPORARY_UNAVAILABLE | DISABLED, 
        temporary_unavailable_ | authentication_required_ | disabled__ | initializing_ | running_
      ]
    ]
  ): State = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  
  @scala.inline
  implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(
      value: ToStringLiteral[
          AUTHENTICATIONREQUIRED, 
          /* keyof chrome-apps.anon.AUTHENTICATIONREQUIRED */ INITIALIZING | RUNNING | AUTHENTICATION_REQUIRED | TEMPORARY_UNAVAILABLE | DISABLED, 
          Exclude[
            /* keyof chrome-apps.anon.AUTHENTICATIONREQUIRED */ INITIALIZING | RUNNING | AUTHENTICATION_REQUIRED | TEMPORARY_UNAVAILABLE | DISABLED, 
            temporary_unavailable_ | authentication_required_ | disabled__ | initializing_ | running_
          ]
        ]
    ): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
