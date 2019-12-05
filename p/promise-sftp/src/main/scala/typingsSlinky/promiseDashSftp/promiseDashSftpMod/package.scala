package typingsSlinky.promiseDashSftp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object promiseDashSftpMod {
  import typingsSlinky.promiseDashSftp.Anon_AutoReconnect
  import typingsSlinky.ssh2.ssh2Mod.ConnectConfig

  /**
    * Options for SftpPromise#connect()
    */
  type Options = ConnectConfig with Anon_AutoReconnect
}
