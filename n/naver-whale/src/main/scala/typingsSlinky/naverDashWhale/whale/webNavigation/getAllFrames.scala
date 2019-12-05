package typingsSlinky.naverDashWhale.whale.webNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.webNavigation.getAllFrames")
@js.native
object getAllFrames extends js.Object {
  def apply(
    details: typingsSlinky.chrome.chrome.webNavigation.GetAllFrameDetails,
    callback: js.Function1[
      /* details */ js.Array[typingsSlinky.chrome.chrome.webNavigation.GetAllFrameResultDetails] | Null, 
      Unit
    ]
  ): Unit = js.native
}

