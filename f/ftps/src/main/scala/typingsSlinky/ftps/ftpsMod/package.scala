package typingsSlinky.ftps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ftpsMod {
  type FTPCallbackFunction = js.Function2[/* err */ js.Error | Null, /* results */ FTPResults, js.Any]
}
