package typingsSlinky.atIonicCliDashFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libExecutorMod {
  import typingsSlinky.atIonicCliDashFramework.atIonicCliDashFrameworkStrings.help
  import typingsSlinky.atIonicCliDashFramework.libHelpMod.CommandHelpSchema
  import typingsSlinky.atIonicCliDashFramework.libHelpMod.NamespaceHelpSchema
  import typingsSlinky.atIonicCliDashFramework.utilsIpcMod.RPC

  type HelpRPC[S /* <: CommandHelpSchema | NamespaceHelpSchema */] = RPC[help, js.Array[js.Array[String]], S]
}
