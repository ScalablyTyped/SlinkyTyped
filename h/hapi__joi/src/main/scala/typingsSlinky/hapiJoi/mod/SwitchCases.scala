package typingsSlinky.hapiJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwitchCases extends js.Object {
  /**
    * the required condition joi type.
    */
  var is: SchemaLike = js.native
  /**
    * the alternative schema type if the condition is true.
    */
  var `then`: SchemaLike = js.native
}

object SwitchCases {
  @scala.inline
  def apply(): SwitchCases = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwitchCases]
  }
  @scala.inline
  implicit class SwitchCasesOps[Self <: SwitchCases] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIs(value: SchemaLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is")(null)
        ret
    }
    @scala.inline
    def withThen(value: SchemaLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("then")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThenNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("then")(null)
        ret
    }
  }
  
}

