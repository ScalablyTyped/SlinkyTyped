package typingsSlinky.activexDashAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EventHelperTypes {
  import typingsSlinky.activexDashAccess.activexDashAccessStrings.Cancel
  import typingsSlinky.activexDashAccess.activexDashAccessStrings.Headers
  import typingsSlinky.activexDashAccess.activexDashAccessStrings.PostData
  import typingsSlinky.activexDashAccess.activexDashAccessStrings.TargetFrameName
  import typingsSlinky.activexDashAccess.activexDashAccessStrings.URL
  import typingsSlinky.activexDashAccess.activexDashAccessStrings.flags
  import typingsSlinky.activexDashAccess.activexDashAccessStrings.pDisp

  type WebBrowserControl_BeforeNavigate2_ArgNames = js.Tuple7[pDisp, URL, flags, TargetFrameName, PostData, Headers, Cancel]
}
