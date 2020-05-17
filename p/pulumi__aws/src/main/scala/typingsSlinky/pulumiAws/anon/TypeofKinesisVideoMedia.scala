package typingsSlinky.pulumiAws.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofKinesisVideoMedia extends js.Object {
  val Types: this.type = js.native
}

object TypeofKinesisVideoMedia {
  @scala.inline
  def apply(Types: TypeofKinesisVideoMedia): TypeofKinesisVideoMedia = {
    val __obj = js.Dynamic.literal(Types = Types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofKinesisVideoMedia]
  }
  @scala.inline
  implicit class TypeofKinesisVideoMediaOps[Self <: TypeofKinesisVideoMedia] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTypes(value: TypeofKinesisVideoMedia): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Types")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

