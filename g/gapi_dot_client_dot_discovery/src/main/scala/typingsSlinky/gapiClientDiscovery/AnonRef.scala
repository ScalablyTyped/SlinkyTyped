package typingsSlinky.gapiClientDiscovery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRef extends js.Object {
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.native
  var type_value: js.UndefOr[String] = js.native
}

object AnonRef {
  @scala.inline
  def apply(): AnonRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonRef]
  }
  @scala.inline
  implicit class AnonRefOps[Self <: AnonRef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$ref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$ref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$ref")(js.undefined)
        ret
    }
    @scala.inline
    def withType_value(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type_value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType_value: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type_value")(js.undefined)
        ret
    }
  }
  
}

