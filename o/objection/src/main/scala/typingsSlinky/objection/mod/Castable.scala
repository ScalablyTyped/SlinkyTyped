package typingsSlinky.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Castable extends js.Object {
  def as(alias: String): this.type = js.native
  def asArray(): this.type = js.native
  def castArray(): this.type = js.native
  def castBigInt(): this.type = js.native
  def castBool(): this.type = js.native
  def castDecimal(): this.type = js.native
  def castFloat(): this.type = js.native
  def castInt(): this.type = js.native
  def castJson(): this.type = js.native
  def castReal(): this.type = js.native
  def castText(): this.type = js.native
  def castTo(sqlType: String): this.type = js.native
  def castType(sqlType: String): this.type = js.native
}

object Castable {
  @scala.inline
  def apply(
    as: String => Castable,
    asArray: () => Castable,
    castArray: () => Castable,
    castBigInt: () => Castable,
    castBool: () => Castable,
    castDecimal: () => Castable,
    castFloat: () => Castable,
    castInt: () => Castable,
    castJson: () => Castable,
    castReal: () => Castable,
    castText: () => Castable,
    castTo: String => Castable,
    castType: String => Castable
  ): Castable = {
    val __obj = js.Dynamic.literal(as = js.Any.fromFunction1(as), asArray = js.Any.fromFunction0(asArray), castArray = js.Any.fromFunction0(castArray), castBigInt = js.Any.fromFunction0(castBigInt), castBool = js.Any.fromFunction0(castBool), castDecimal = js.Any.fromFunction0(castDecimal), castFloat = js.Any.fromFunction0(castFloat), castInt = js.Any.fromFunction0(castInt), castJson = js.Any.fromFunction0(castJson), castReal = js.Any.fromFunction0(castReal), castText = js.Any.fromFunction0(castText), castTo = js.Any.fromFunction1(castTo), castType = js.Any.fromFunction1(castType))
    __obj.asInstanceOf[Castable]
  }
  @scala.inline
  implicit class CastableOps[Self <: Castable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAs(value: String => Castable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAsArray(value: () => Castable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asArray")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCastArray(value: () => Castable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("castArray")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCastBigInt(value: () => Castable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("castBigInt")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCastBool(value: () => Castable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("castBool")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCastDecimal(value: () => Castable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("castDecimal")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCastFloat(value: () => Castable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("castFloat")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCastInt(value: () => Castable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("castInt")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCastJson(value: () => Castable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("castJson")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCastReal(value: () => Castable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("castReal")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCastText(value: () => Castable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("castText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCastTo(value: String => Castable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("castTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCastType(value: String => Castable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("castType")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

