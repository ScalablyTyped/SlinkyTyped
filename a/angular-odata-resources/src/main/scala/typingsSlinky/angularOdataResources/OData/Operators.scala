package typingsSlinky.angularOdataResources.OData

import typingsSlinky.angularOdataResources.anon.Add
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Operators extends js.Object {
  var operators: Add = js.native
  var rtrim: js.Any = js.native
  def convert(from: String): js.Any = js.native
  /* private */ def trim(value: js.Any): js.Any = js.native
}

object Operators {
  @scala.inline
  def apply(convert: String => js.Any, operators: Add, rtrim: js.Any, trim: js.Any => js.Any): Operators = {
    val __obj = js.Dynamic.literal(convert = js.Any.fromFunction1(convert), operators = operators.asInstanceOf[js.Any], rtrim = rtrim.asInstanceOf[js.Any], trim = js.Any.fromFunction1(trim))
    __obj.asInstanceOf[Operators]
  }
  @scala.inline
  implicit class OperatorsOps[Self <: Operators] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConvert(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOperators(value: Add): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRtrim(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtrim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrim(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

