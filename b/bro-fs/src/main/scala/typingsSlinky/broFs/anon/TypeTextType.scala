package typingsSlinky.broFs.anon

import typingsSlinky.broFs.mod.TextType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeTextType extends js.Object {
  var `type`: js.UndefOr[TextType] = js.native
}

object TypeTextType {
  @scala.inline
  def apply(): TypeTextType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeTextType]
  }
  @scala.inline
  implicit class TypeTextTypeOps[Self <: TypeTextType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: TextType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

