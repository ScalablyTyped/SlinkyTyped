package typingsSlinky.pulumiAws.inputMod.storagegateway

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NfsFileShareNfsFileShareDefaults extends js.Object {
  /**
    * The Unix directory mode in the string form "nnnn". Defaults to `"0777"`.
    */
  var directoryMode: js.UndefOr[Input[String]] = js.native
  /**
    * The Unix file mode in the string form "nnnn". Defaults to `"0666"`.
    */
  var fileMode: js.UndefOr[Input[String]] = js.native
  /**
    * The default group ID for the file share (unless the files have another group ID specified). Defaults to `65534` (`nfsnobody`). Valid values: `0` through `4294967294`.
    */
  var groupId: js.UndefOr[Input[Double]] = js.native
  /**
    * The default owner ID for the file share (unless the files have another owner ID specified). Defaults to `65534` (`nfsnobody`). Valid values: `0` through `4294967294`.
    */
  var ownerId: js.UndefOr[Input[Double]] = js.native
}

object NfsFileShareNfsFileShareDefaults {
  @scala.inline
  def apply(): NfsFileShareNfsFileShareDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NfsFileShareNfsFileShareDefaults]
  }
  @scala.inline
  implicit class NfsFileShareNfsFileShareDefaultsOps[Self <: NfsFileShareNfsFileShareDefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectoryMode(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directoryMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectoryMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directoryMode")(js.undefined)
        ret
    }
    @scala.inline
    def withFileMode(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileMode")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupId(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupId")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerId(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerId")(js.undefined)
        ret
    }
  }
  
}

