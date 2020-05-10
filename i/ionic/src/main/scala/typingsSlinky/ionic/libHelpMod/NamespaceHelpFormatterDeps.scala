package typingsSlinky.ionic.libHelpMod

import typingsSlinky.ionic.definitionsMod.CommandMetadata
import typingsSlinky.ionic.definitionsMod.CommandMetadataOption
import typingsSlinky.ionic.definitionsMod.ICommand
import typingsSlinky.ionic.definitionsMod.INamespace
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataInput
import typingsSlinky.ionicCliFramework.definitionsMod.NamespaceLocateResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamespaceHelpFormatterDeps
  extends typingsSlinky.ionicCliFramework.helpMod.NamespaceHelpFormatterDeps[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption] {
  val inProject: Boolean = js.native
  val version: String = js.native
}

object NamespaceHelpFormatterDeps {
  @scala.inline
  def apply(
    inProject: Boolean,
    location: NamespaceLocateResult[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption],
    namespace: INamespace,
    version: String
  ): NamespaceHelpFormatterDeps = {
    val __obj = js.Dynamic.literal(inProject = inProject.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamespaceHelpFormatterDeps]
  }
  @scala.inline
  implicit class NamespaceHelpFormatterDepsOps[Self <: NamespaceHelpFormatterDeps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInProject(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inProject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

