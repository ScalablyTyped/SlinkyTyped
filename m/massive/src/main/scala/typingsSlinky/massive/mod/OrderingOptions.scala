package typingsSlinky.massive.mod

import typingsSlinky.massive.massiveStrings.ASC
import typingsSlinky.massive.massiveStrings.DESC
import typingsSlinky.massive.massiveStrings.FIRST
import typingsSlinky.massive.massiveStrings.LAST
import typingsSlinky.massive.massiveStrings.asc_
import typingsSlinky.massive.massiveStrings.desc_
import typingsSlinky.massive.massiveStrings.first_
import typingsSlinky.massive.massiveStrings.last_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderingOptions extends js.Object {
  var direction: js.UndefOr[ASC | asc_ | DESC | desc_] = js.native
  var expr: js.UndefOr[String] = js.native
  var field: js.UndefOr[String] = js.native
  var last: js.UndefOr[String] = js.native
  var nulls: js.UndefOr[FIRST | first_ | LAST | last_] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object OrderingOptions {
  @scala.inline
  def apply(): OrderingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderingOptions]
  }
  @scala.inline
  implicit class OrderingOptionsOps[Self <: OrderingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirection(value: ASC | asc_ | DESC | desc_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withExpr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expr")(js.undefined)
        ret
    }
    @scala.inline
    def withField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(js.undefined)
        ret
    }
    @scala.inline
    def withLast(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last")(js.undefined)
        ret
    }
    @scala.inline
    def withNulls(value: FIRST | first_ | LAST | last_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nulls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNulls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nulls")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
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

