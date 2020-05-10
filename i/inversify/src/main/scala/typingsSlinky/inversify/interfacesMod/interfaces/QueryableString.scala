package typingsSlinky.inversify.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryableString extends js.Object {
  def contains(searchString: String): Boolean = js.native
  def endsWith(searchString: String): Boolean = js.native
  def equals(compareString: String): Boolean = js.native
  def startsWith(searchString: String): Boolean = js.native
  def value(): String = js.native
}

object QueryableString {
  @scala.inline
  def apply(
    contains: String => Boolean,
    endsWith: String => Boolean,
    equals: String => Boolean,
    startsWith: String => Boolean,
    value: () => String
  ): QueryableString = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), endsWith = js.Any.fromFunction1(endsWith), equals = js.Any.fromFunction1(equals), startsWith = js.Any.fromFunction1(startsWith), value = js.Any.fromFunction0(value))
    __obj.asInstanceOf[QueryableString]
  }
  @scala.inline
  implicit class QueryableStringOps[Self <: QueryableString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContains(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEndsWith(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endsWith")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEquals(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStartsWith(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startsWith")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValue(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

