package typingsSlinky.gapiClientDiscovery.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefString extends js.Object {
  /** Schema ID for the response schema. */
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.native
}

object RefString {
  @scala.inline
  def apply(): RefString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefString]
  }
  @scala.inline
  implicit class RefStringOps[Self <: RefString] (val x: Self) extends AnyVal {
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
  }
  
}

