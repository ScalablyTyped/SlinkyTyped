package typingsSlinky.keystonejsAppGraphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIntrospection extends js.Object {
  var introspection: js.UndefOr[Boolean] = js.native
  var validationRules: js.UndefOr[js.Array[js.Any]] = js.native
}

object AnonIntrospection {
  @scala.inline
  def apply(): AnonIntrospection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonIntrospection]
  }
  @scala.inline
  implicit class AnonIntrospectionOps[Self <: AnonIntrospection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIntrospection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("introspection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntrospection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("introspection")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationRules(value: js.Array[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationRules")(js.undefined)
        ret
    }
  }
  
}

