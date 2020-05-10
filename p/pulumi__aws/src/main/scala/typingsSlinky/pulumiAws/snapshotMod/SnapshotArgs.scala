package typingsSlinky.pulumiAws.snapshotMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotArgs extends js.Object {
  /**
    * A description of what the snapshot is.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the snapshot
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The Volume ID of which to make a snapshot.
    */
  val volumeId: Input[String] = js.native
}

object SnapshotArgs {
  @scala.inline
  def apply(volumeId: Input[String]): SnapshotArgs = {
    val __obj = js.Dynamic.literal(volumeId = volumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotArgs]
  }
  @scala.inline
  implicit class SnapshotArgsOps[Self <: SnapshotArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVolumeId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeId")(value.asInstanceOf[js.Any])
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

