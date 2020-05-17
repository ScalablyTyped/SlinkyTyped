package typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Topic. */
@js.native
trait ITopic extends js.Object {
  /** Topic kmsKeyName */
  var kmsKeyName: js.UndefOr[String | Null] = js.native
  /** Topic labels */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.native
  /** Topic messageStoragePolicy */
  var messageStoragePolicy: js.UndefOr[IMessageStoragePolicy | Null] = js.native
  /** Topic name */
  var name: js.UndefOr[String | Null] = js.native
}

object ITopic {
  @scala.inline
  def apply(): ITopic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITopic]
  }
  @scala.inline
  implicit class ITopicOps[Self <: ITopic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKmsKeyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyName")(js.undefined)
        ret
    }
    @scala.inline
    def withKmsKeyNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyName")(null)
        ret
    }
    @scala.inline
    def withLabels(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(null)
        ret
    }
    @scala.inline
    def withMessageStoragePolicy(value: IMessageStoragePolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageStoragePolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageStoragePolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageStoragePolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageStoragePolicyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageStoragePolicy")(null)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
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
    def withNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(null)
        ret
    }
  }
  
}

