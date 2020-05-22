package typingsSlinky.awsSdkClientS3Browser.typesReplicationRuleAndOperatorMod

import typingsSlinky.awsSdkClientS3Browser.typesTagMod.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicationRuleAndOperator extends js.Object {
  /**
    * _Prefix shape
    */
  var Prefix: js.UndefOr[String] = js.undefined
  /**
    * _TagSet shape
    */
  var Tags: js.UndefOr[js.Array[Tag] | js.Iterable[Tag]] = js.undefined
}

object ReplicationRuleAndOperator {
  @scala.inline
  def apply(Prefix: String = null, Tags: js.Array[Tag] | js.Iterable[Tag] = null): ReplicationRuleAndOperator = {
    val __obj = js.Dynamic.literal()
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationRuleAndOperator]
  }
}

