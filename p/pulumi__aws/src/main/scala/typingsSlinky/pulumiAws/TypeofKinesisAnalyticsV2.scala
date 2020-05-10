package typingsSlinky.pulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofKinesisAnalyticsV2 extends js.Object {
  val Types: this.type = js.native
}

object TypeofKinesisAnalyticsV2 {
  @scala.inline
  def apply(Types: TypeofKinesisAnalyticsV2): TypeofKinesisAnalyticsV2 = {
    val __obj = js.Dynamic.literal(Types = Types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofKinesisAnalyticsV2]
  }
  @scala.inline
  implicit class TypeofKinesisAnalyticsV2Ops[Self <: TypeofKinesisAnalyticsV2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTypes(value: TypeofKinesisAnalyticsV2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Types")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

