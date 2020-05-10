package typingsSlinky.awsSdkClientS3Node.typesReplicationRuleAndOperatorMod

import typingsSlinky.awsSdkClientS3Node.typesTagMod.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationRuleAndOperator extends js.Object {
  /**
    * _Prefix shape
    */
  var Prefix: js.UndefOr[String] = js.native
  /**
    * _TagSet shape
    */
  var Tags: js.UndefOr[js.Array[Tag] | js.Iterable[Tag]] = js.native
}

object ReplicationRuleAndOperator {
  @scala.inline
  def apply(): ReplicationRuleAndOperator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationRuleAndOperator]
  }
  @scala.inline
  implicit class ReplicationRuleAndOperatorOps[Self <: ReplicationRuleAndOperator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withTagsIterable(value: js.Iterable[Tag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: js.Array[Tag] | js.Iterable[Tag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

