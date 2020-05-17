package typingsSlinky.passportSamlMetadata.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CamelCase extends js.Object {
  var camelCase: String = js.native
  var description: String = js.native
  var name: String = js.native
}

object CamelCase {
  @scala.inline
  def apply(camelCase: String, description: String, name: String): CamelCase = {
    val __obj = js.Dynamic.literal(camelCase = camelCase.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CamelCase]
  }
  @scala.inline
  implicit class CamelCaseOps[Self <: CamelCase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCamelCase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camelCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

