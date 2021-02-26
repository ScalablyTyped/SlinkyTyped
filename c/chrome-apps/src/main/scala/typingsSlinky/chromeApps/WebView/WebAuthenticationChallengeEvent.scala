package typingsSlinky.chromeApps.WebView

import typingsSlinky.chromeApps.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAuthenticationChallengeEvent
  extends Event[
      js.Function2[
        /* details */ WebAuthenticationChallengeDetails, 
        /* callback */ js.UndefOr[js.Function1[/* response */ BlockingResponse, Unit]], 
        Unit
      ]
    ] {
  
  def addListener(
    callback: js.Function2[
      /* details */ WebAuthenticationChallengeDetails, 
      /* callback */ js.UndefOr[js.Function1[/* response */ BlockingResponse, Unit]], 
      Unit
    ],
    filter: js.UndefOr[scala.Nothing],
    opt_extraInfoSpec: js.Array[String]
  ): Unit = js.native
  def addListener(
    callback: js.Function2[
      /* details */ WebAuthenticationChallengeDetails, 
      /* callback */ js.UndefOr[js.Function1[/* response */ BlockingResponse, Unit]], 
      Unit
    ],
    filter: RequestFilter
  ): Unit = js.native
  def addListener(
    callback: js.Function2[
      /* details */ WebAuthenticationChallengeDetails, 
      /* callback */ js.UndefOr[js.Function1[/* response */ BlockingResponse, Unit]], 
      Unit
    ],
    filter: RequestFilter,
    opt_extraInfoSpec: js.Array[String]
  ): Unit = js.native
}
