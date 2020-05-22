package typingsSlinky.awsSdkClientS3Node.typesAnalyticsAndOperatorMod

import typingsSlinky.awsSdkClientS3Node.typesTagMod.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsAndOperator extends js.Object {
  /**
    * <p>The prefix to use when evaluating an AND predicate.</p>
    */
  var Prefix: js.UndefOr[String] = js.undefined
  /**
    * <p>The list of tags to use when evaluating an AND predicate.</p>
    */
  var Tags: js.UndefOr[js.Array[Tag] | js.Iterable[Tag]] = js.undefined
}

object AnalyticsAndOperator {
  @scala.inline
  def apply(Prefix: String = null, Tags: js.Array[Tag] | js.Iterable[Tag] = null): AnalyticsAndOperator = {
    val __obj = js.Dynamic.literal()
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsAndOperator]
  }
}

