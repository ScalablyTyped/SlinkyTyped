package typingsSlinky.ionic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libHelpMod {
  import typingsSlinky.atIonicCliDashFramework.definitionsMod.CommandMetadataInput
  import typingsSlinky.ionic.definitionsMod.CommandMetadata
  import typingsSlinky.ionic.definitionsMod.CommandMetadataOption
  import typingsSlinky.ionic.definitionsMod.ICommand
  import typingsSlinky.ionic.definitionsMod.INamespace

  type CommandHelpFormatterDeps = typingsSlinky.atIonicCliDashFramework.libHelpMod.CommandHelpFormatterDeps[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption]
}
