package typingsSlinky.naverWhale.whale.webRequest

import typingsSlinky.chrome.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAuthenticationChallengeEvent
  extends Event[
      js.Function2[
        /* details */ typingsSlinky.chrome.chrome.webRequest.WebAuthenticationChallengeDetails, 
        /* callback */ js.UndefOr[
          js.Function1[/* response */ typingsSlinky.chrome.chrome.webRequest.BlockingResponse, Unit]
        ], 
        Unit
      ]
    ] {
  
  def addListener(
    callback: js.Function2[
      /* details */ typingsSlinky.chrome.chrome.webRequest.WebAuthenticationChallengeDetails, 
      /* callback */ js.UndefOr[
        js.Function1[/* response */ typingsSlinky.chrome.chrome.webRequest.BlockingResponse, Unit]
      ], 
      Unit
    ],
    filter: js.UndefOr[scala.Nothing],
    opt_extraInfoSpec: js.Array[String]
  ): Unit = js.native
  def addListener(
    callback: js.Function2[
      /* details */ typingsSlinky.chrome.chrome.webRequest.WebAuthenticationChallengeDetails, 
      /* callback */ js.UndefOr[
        js.Function1[/* response */ typingsSlinky.chrome.chrome.webRequest.BlockingResponse, Unit]
      ], 
      Unit
    ],
    filter: typingsSlinky.chrome.chrome.webRequest.RequestFilter
  ): Unit = js.native
  def addListener(
    callback: js.Function2[
      /* details */ typingsSlinky.chrome.chrome.webRequest.WebAuthenticationChallengeDetails, 
      /* callback */ js.UndefOr[
        js.Function1[/* response */ typingsSlinky.chrome.chrome.webRequest.BlockingResponse, Unit]
      ], 
      Unit
    ],
    filter: typingsSlinky.chrome.chrome.webRequest.RequestFilter,
    opt_extraInfoSpec: js.Array[String]
  ): Unit = js.native
}
