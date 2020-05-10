package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Script extends js.Object {
  /**
    * A time stamp indicating when this data object was created. The format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * A descriptive label that is associated with a script. Script names do not need to be unique.
    */
  var Name: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * Amazon Resource Name (ARN) that is assigned to a GameLift script resource and uniquely identifies it. ARNs are unique across all Regions. In a GameLift script ARN, the resource ID matches the ScriptId value.
    */
  var ScriptArn: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.ScriptArn] = js.native
  /**
    * A unique identifier for a Realtime script
    */
  var ScriptId: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.ScriptId] = js.native
  /**
    * The file size of the uploaded Realtime script, expressed in bytes. When files are uploaded from an S3 location, this value remains at "0".
    */
  var SizeOnDisk: js.UndefOr[PositiveLong] = js.native
  var StorageLocation: js.UndefOr[S3Location] = js.native
  /**
    * The version that is associated with a build or script. Version strings do not need to be unique.
    */
  var Version: js.UndefOr[NonZeroAndMaxString] = js.native
}

object Script {
  @scala.inline
  def apply(): Script = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Script]
  }
  @scala.inline
  implicit class ScriptOps[Self <: Script] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: NonZeroAndMaxString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withScriptArn(value: ScriptArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScriptArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScriptArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScriptArn")(js.undefined)
        ret
    }
    @scala.inline
    def withScriptId(value: ScriptId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScriptId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScriptId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScriptId")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeOnDisk(value: PositiveLong): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SizeOnDisk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeOnDisk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SizeOnDisk")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageLocation(value: S3Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: NonZeroAndMaxString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(js.undefined)
        ret
    }
  }
  
}

