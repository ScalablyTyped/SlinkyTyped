package typingsSlinky.naverWhale.whale.webRequest

import typingsSlinky.chrome.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebRequestHeadersSynchronousEvent
  extends Event[
      js.Function1[
        /* details */ typingsSlinky.chrome.chrome.webRequest.WebRequestHeadersDetails, 
        typingsSlinky.chrome.chrome.webRequest.BlockingResponse | Unit
      ]
    ] {
  def addListener(
    callback: js.Function1[
      /* details */ typingsSlinky.chrome.chrome.webRequest.WebRequestHeadersDetails, 
      typingsSlinky.chrome.chrome.webRequest.BlockingResponse | Unit
    ],
    filter: js.UndefOr[scala.Nothing],
    opt_extraInfoSpec: js.Array[String]
  ): Unit = js.native
  def addListener(
    callback: js.Function1[
      /* details */ typingsSlinky.chrome.chrome.webRequest.WebRequestHeadersDetails, 
      typingsSlinky.chrome.chrome.webRequest.BlockingResponse | Unit
    ],
    filter: typingsSlinky.chrome.chrome.webRequest.RequestFilter
  ): Unit = js.native
  def addListener(
    callback: js.Function1[
      /* details */ typingsSlinky.chrome.chrome.webRequest.WebRequestHeadersDetails, 
      typingsSlinky.chrome.chrome.webRequest.BlockingResponse | Unit
    ],
    filter: typingsSlinky.chrome.chrome.webRequest.RequestFilter,
    opt_extraInfoSpec: js.Array[String]
  ): Unit = js.native
}

