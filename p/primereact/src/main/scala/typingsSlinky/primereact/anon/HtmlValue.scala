package typingsSlinky.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HtmlValue extends js.Object {
  var delta: js.Any = js.native
  var htmlValue: String | Null = js.native
  var source: String = js.native
  var textValue: String = js.native
}

object HtmlValue {
  @scala.inline
  def apply(delta: js.Any, source: String, textValue: String): HtmlValue = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], textValue = textValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlValue]
  }
  @scala.inline
  implicit class HtmlValueOps[Self <: HtmlValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelta(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtmlValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtmlValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlValue")(null)
        ret
    }
  }
  
}

