package typingsSlinky.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Placeholder extends js.Object {
  var placeholder: String = js.native
  var rangePlaceholder: js.Array[String] = js.native
}

object Placeholder {
  @scala.inline
  def apply(placeholder: String, rangePlaceholder: js.Array[String]): Placeholder = {
    val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any], rangePlaceholder = rangePlaceholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Placeholder]
  }
  @scala.inline
  implicit class PlaceholderOps[Self <: Placeholder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRangePlaceholder(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangePlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

