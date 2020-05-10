package typingsSlinky.pulumiAws.workspacesDirectoryMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.workspaces.DirectorySelfServicePermissions
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryState extends js.Object {
  /**
    * The directory identifier for registration in WorkSpaces service.
    */
  val directoryId: js.UndefOr[Input[String]] = js.native
  /**
    * The permissions to enable or disable self-service capabilities.
    */
  val selfServicePermissions: js.UndefOr[Input[DirectorySelfServicePermissions]] = js.native
  /**
    * The identifiers of the subnets where the directory resides.
    */
  val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A mapping of tags assigned to the WorkSpaces directory.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object DirectoryState {
  @scala.inline
  def apply(): DirectoryState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryState]
  }
  @scala.inline
  implicit class DirectoryStateOps[Self <: DirectoryState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectoryId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectoryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directoryId")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfServicePermissions(value: Input[DirectorySelfServicePermissions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfServicePermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfServicePermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfServicePermissions")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetIds(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetIds")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

