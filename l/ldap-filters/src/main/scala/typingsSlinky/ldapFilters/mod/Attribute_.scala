package typingsSlinky.ldapFilters.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attribute_ extends js.Object {
  var escapeChars: js.Array[String] = js.native
  var name: String = js.native
  def approx(value: String): Filter = js.native
  def contains(value: String): Filter = js.native
  def endsWith(value: String): Filter = js.native
  def equalTo(value: String): Filter = js.native
  def escape(value: String): String = js.native
  def gte(value: String): Filter = js.native
  def lte(value: String): Filter = js.native
  def present(): Filter = js.native
  def raw(value: String): Filter = js.native
  def startsWith(value: String): Filter = js.native
}

object Attribute_ {
  @scala.inline
  def apply(
    approx: String => Filter,
    contains: String => Filter,
    endsWith: String => Filter,
    equalTo: String => Filter,
    escape: String => String,
    escapeChars: js.Array[String],
    gte: String => Filter,
    lte: String => Filter,
    name: String,
    present: () => Filter,
    raw: String => Filter,
    startsWith: String => Filter
  ): Attribute_ = {
    val __obj = js.Dynamic.literal(approx = js.Any.fromFunction1(approx), contains = js.Any.fromFunction1(contains), endsWith = js.Any.fromFunction1(endsWith), equalTo = js.Any.fromFunction1(equalTo), escape = js.Any.fromFunction1(escape), escapeChars = escapeChars.asInstanceOf[js.Any], gte = js.Any.fromFunction1(gte), lte = js.Any.fromFunction1(lte), name = name.asInstanceOf[js.Any], present = js.Any.fromFunction0(present), raw = js.Any.fromFunction1(raw), startsWith = js.Any.fromFunction1(startsWith))
    __obj.asInstanceOf[Attribute_]
  }
  @scala.inline
  implicit class Attribute_Ops[Self <: Attribute_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApprox(value: String => Filter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approx")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContains(value: String => Filter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEndsWith(value: String => Filter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endsWith")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEqualTo(value: String => Filter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equalTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEscape(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escape")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEscapeChars(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeChars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGte(value: String => Filter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gte")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLte(value: String => Filter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lte")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPresent(value: () => Filter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("present")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRaw(value: String => Filter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStartsWith(value: String => Filter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startsWith")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

