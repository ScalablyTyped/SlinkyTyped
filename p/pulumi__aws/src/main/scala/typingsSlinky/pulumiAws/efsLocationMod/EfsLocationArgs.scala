package typingsSlinky.pulumiAws.efsLocationMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.arnMod.ARN
import typingsSlinky.pulumiAws.inputMod.datasync.EfsLocationEc2Config
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EfsLocationArgs extends js.Object {
  /**
    * Configuration block containing EC2 configurations for connecting to the EFS File System.
    */
  val ec2Config: Input[EfsLocationEc2Config] = js.native
  /**
    * Amazon Resource Name (ARN) of EFS File System.
    */
  val efsFileSystemArn: Input[ARN] = js.native
  /**
    * Subdirectory to perform actions as source or destination. Default `/`.
    */
  val subdirectory: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value pairs of resource tags to assign to the DataSync Location.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object EfsLocationArgs {
  @scala.inline
  def apply(ec2Config: Input[EfsLocationEc2Config], efsFileSystemArn: Input[ARN]): EfsLocationArgs = {
    val __obj = js.Dynamic.literal(ec2Config = ec2Config.asInstanceOf[js.Any], efsFileSystemArn = efsFileSystemArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EfsLocationArgs]
  }
  @scala.inline
  implicit class EfsLocationArgsOps[Self <: EfsLocationArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEc2Config(value: Input[EfsLocationEc2Config]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ec2Config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEfsFileSystemArn(value: Input[ARN]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("efsFileSystemArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubdirectory(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subdirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubdirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subdirectory")(js.undefined)
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

