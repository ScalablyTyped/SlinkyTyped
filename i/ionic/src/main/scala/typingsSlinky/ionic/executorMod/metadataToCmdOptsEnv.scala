package typingsSlinky.ionic.executorMod

import typingsSlinky.ionic.definitionsMod.CommandMetadata
import typingsSlinky.ionic.definitionsMod.CommandMetadataOption
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/lib/executor", "metadataToCmdOptsEnv")
@js.native
object metadataToCmdOptsEnv extends js.Object {
  
  def apply(metadata: CommandMetadata, cmdNameParts: js.Array[String]): Map[CommandMetadataOption, String] = js.native
}
