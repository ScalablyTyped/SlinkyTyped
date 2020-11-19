package typingsSlinky.ionic.libHelpMod

import typingsSlinky.ionic.definitionsMod.CommandMetadata
import typingsSlinky.ionic.definitionsMod.CommandMetadataOption
import typingsSlinky.ionic.definitionsMod.ICommand
import typingsSlinky.ionic.definitionsMod.INamespace
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/lib/help", "NamespaceStringHelpFormatter")
@js.native
class NamespaceStringHelpFormatter protected ()
  extends typingsSlinky.ionicCliFramework.helpMod.NamespaceStringHelpFormatter[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption] {
  def this(hasVersionInProjectRest: NamespaceHelpFormatterDeps) = this()
  
  def formatIonicHeader(): js.Promise[String] = js.native
  
  val inProject: Boolean = js.native
  
  val version: String = js.native
}
