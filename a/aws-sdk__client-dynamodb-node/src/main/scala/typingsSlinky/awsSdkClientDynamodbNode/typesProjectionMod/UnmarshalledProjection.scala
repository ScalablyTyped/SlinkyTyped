package typingsSlinky.awsSdkClientDynamodbNode.typesProjectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledProjection extends Projection {
  /**
    * <p>Represents the non-key attribute names which will be projected into the index.</p> <p>For local secondary indexes, the total count of <code>NonKeyAttributes</code> summed across all of the local secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.</p>
    */
  @JSName("NonKeyAttributes")
  var NonKeyAttributes_UnmarshalledProjection: js.UndefOr[js.Array[String]] = js.native
}

object UnmarshalledProjection {
  @scala.inline
  def apply(): UnmarshalledProjection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledProjection]
  }
  @scala.inline
  implicit class UnmarshalledProjectionOps[Self <: UnmarshalledProjection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNonKeyAttributes(value: js.Array[String]): Self = {
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
  }
  
}

