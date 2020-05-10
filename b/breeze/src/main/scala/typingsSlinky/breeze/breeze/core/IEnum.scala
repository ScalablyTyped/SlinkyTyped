package typingsSlinky.breeze.breeze.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEnum extends js.Object {
  def contains(`object`: js.Any): Boolean = js.native
  def fromName(name: String): EnumSymbol = js.native
  def getNames(): js.Array[String] = js.native
  def getSymbols(): js.Array[EnumSymbol] = js.native
}

object IEnum {
  @scala.inline
  def apply(
    contains: js.Any => Boolean,
    fromName: String => EnumSymbol,
    getNames: () => js.Array[String],
    getSymbols: () => js.Array[EnumSymbol]
  ): IEnum = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), fromName = js.Any.fromFunction1(fromName), getNames = js.Any.fromFunction0(getNames), getSymbols = js.Any.fromFunction0(getSymbols))
    __obj.asInstanceOf[IEnum]
  }
  @scala.inline
  implicit class IEnumOps[Self <: IEnum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContains(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFromName(value: String => EnumSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetNames(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNames")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSymbols(value: () => js.Array[EnumSymbol]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSymbols")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

