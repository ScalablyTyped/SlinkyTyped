package typingsSlinky.ionicCliFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object executorMod {
  type HelpRPC[S /* <: typingsSlinky.ionicCliFramework.helpMod.CommandHelpSchema | typingsSlinky.ionicCliFramework.helpMod.NamespaceHelpSchema */] = typingsSlinky.ionicCliFramework.ipcMod.RPC[
    typingsSlinky.ionicCliFramework.ionicCliFrameworkStrings.help, 
    js.Array[js.Array[java.lang.String]], 
    S
  ]
}
