package typingsSlinky.csvStringify

import typingsSlinky.csvStringify.mod.Cast
import typingsSlinky.csvStringify.mod.CastingContext
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDate extends js.Object {
  var boolean: js.UndefOr[Cast[Boolean]] = js.native
  var date: js.UndefOr[Cast[js.Date]] = js.native
  var number: js.UndefOr[Cast[Double]] = js.native
  /**
    * Custom formatter for generic object values
    */
  var `object`: js.UndefOr[Cast[Record[String, _]]] = js.native
  var string: js.UndefOr[Cast[String]] = js.native
}

object AnonDate {
  @scala.inline
  def apply(): AnonDate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDate]
  }
  @scala.inline
  implicit class AnonDateOps[Self <: AnonDate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoolean(value: (Boolean, /* context */ CastingContext) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolean")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBoolean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolean")(js.undefined)
        ret
    }
    @scala.inline
    def withDate(value: (js.Date, /* context */ CastingContext) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
        ret
    }
    @scala.inline
    def withNumber(value: (Double, /* context */ CastingContext) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(js.undefined)
        ret
    }
    @scala.inline
    def withObject(value: (Record[String, _], /* context */ CastingContext) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(js.undefined)
        ret
    }
    @scala.inline
    def withString(value: (String, /* context */ CastingContext) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(js.undefined)
        ret
    }
  }
  
}

