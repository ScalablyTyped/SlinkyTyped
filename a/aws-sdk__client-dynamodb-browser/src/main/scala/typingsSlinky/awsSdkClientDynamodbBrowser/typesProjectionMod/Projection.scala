package typingsSlinky.awsSdkClientDynamodbBrowser.typesProjectionMod

import typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ALL
import typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.INCLUDE
import typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.KEYS_ONLY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Projection extends js.Object {
  /**
    * <p>Represents the non-key attribute names which will be projected into the index.</p> <p>For local secondary indexes, the total count of <code>NonKeyAttributes</code> summed across all of the local secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.</p>
    */
  var NonKeyAttributes: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.native
  /**
    * <p>The set of attributes that are projected into the index:</p> <ul> <li> <p> <code>KEYS_ONLY</code> - Only the index and primary keys are projected into the index.</p> </li> <li> <p> <code>INCLUDE</code> - Only the specified table attributes are projected into the index. The list of projected attributes are in <code>NonKeyAttributes</code>.</p> </li> <li> <p> <code>ALL</code> - All of the table attributes are projected into the index.</p> </li> </ul>
    */
  var ProjectionType: js.UndefOr[ALL | KEYS_ONLY | INCLUDE | String] = js.native
}

object Projection {
  @scala.inline
  def apply(): Projection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Projection]
  }
  @scala.inline
  implicit class ProjectionOps[Self <: Projection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNonKeyAttributesIterable(value: js.Iterable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NonKeyAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonKeyAttributes(value: js.Array[String] | js.Iterable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NonKeyAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonKeyAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NonKeyAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectionType(value: ALL | KEYS_ONLY | INCLUDE | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProjectionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProjectionType")(js.undefined)
        ret
    }
  }
  
}

