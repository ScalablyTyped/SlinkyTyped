package typingsSlinky.pulumiAws.amiFromInstanceMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.ec2.AmiFromInstanceEbsBlockDevice
import typingsSlinky.pulumiAws.inputMod.ec2.AmiFromInstanceEphemeralBlockDevice
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmiFromInstanceArgs extends js.Object {
  /**
    * A longer, human-readable description for the AMI.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * Nested block describing an EBS block device that should be
    * attached to created instances. The structure of this block is described below.
    */
  val ebsBlockDevices: js.UndefOr[Input[js.Array[Input[AmiFromInstanceEbsBlockDevice]]]] = js.native
  /**
    * Nested block describing an ephemeral block device that
    * should be attached to created instances. The structure of this block is described below.
    */
  val ephemeralBlockDevices: js.UndefOr[Input[js.Array[Input[AmiFromInstanceEphemeralBlockDevice]]]] = js.native
  /**
    * A region-unique name for the AMI.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Boolean that overrides the behavior of stopping
    * the instance before snapshotting. This is risky since it may cause a snapshot of an
    * inconsistent filesystem state, but can be used to avoid downtime if the user otherwise
    * guarantees that no filesystem writes will be underway at the time of snapshot.
    */
  val snapshotWithoutReboot: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The id of the instance to use as the basis of the AMI.
    */
  val sourceInstanceId: Input[String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object AmiFromInstanceArgs {
  @scala.inline
  def apply(sourceInstanceId: Input[String]): AmiFromInstanceArgs = {
    val __obj = js.Dynamic.literal(sourceInstanceId = sourceInstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmiFromInstanceArgs]
  }
  @scala.inline
  implicit class AmiFromInstanceArgsOps[Self <: AmiFromInstanceArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourceInstanceId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceInstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withEbsBlockDevices(value: Input[js.Array[Input[AmiFromInstanceEbsBlockDevice]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ebsBlockDevices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEbsBlockDevices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ebsBlockDevices")(js.undefined)
        ret
    }
    @scala.inline
    def withEphemeralBlockDevices(value: Input[js.Array[Input[AmiFromInstanceEphemeralBlockDevice]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ephemeralBlockDevices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEphemeralBlockDevices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ephemeralBlockDevices")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotWithoutReboot(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotWithoutReboot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotWithoutReboot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotWithoutReboot")(js.undefined)
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

