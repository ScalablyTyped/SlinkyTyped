package typingsSlinky.naverWhale.whale.webNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.webNavigation.getFrame")
@js.native
object getFrame extends js.Object {
  def apply(
    details: typingsSlinky.chrome.chrome.webNavigation.GetFrameDetails,
    callback: js.Function1[
      /* details */ typingsSlinky.chrome.chrome.webNavigation.GetFrameResultDetails | Null, 
      Unit
    ]
  ): Unit = js.native
}

