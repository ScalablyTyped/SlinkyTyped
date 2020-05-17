package typingsSlinky.jsData.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _empty extends js.Object {
  @JSName("==")
  def EqualssignEqualssign(value: js.Any, predicate: js.Any): Boolean = js.native
  @JSName("===")
  def EqualssignEqualssignEqualssign(value: js.Any, predicate: js.Any): Boolean = js.native
  @JSName("!=")
  def ExclamationmarkEqualssign(value: js.Any, predicate: js.Any): Boolean = js.native
  @JSName("!==")
  def ExclamationmarkEqualssignEqualssign(value: js.Any, predicate: js.Any): Boolean = js.native
  @JSName(">")
  def Greaterthansign(value: js.Any, predicate: js.Any): Boolean = js.native
  @JSName(">=")
  def GreaterthansignEqualssign(value: js.Any, predicate: js.Any): Boolean = js.native
  @JSName("<")
  def Lessthansign(value: js.Any, predicate: js.Any): Boolean = js.native
  @JSName("<=")
  def LessthansignEqualssign(value: js.Any, predicate: js.Any): Boolean = js.native
  def contains(value: js.Any, predicate: js.Any): Boolean = js.native
  def in(value: js.Any, predicate: js.Any): Boolean = js.native
  def isectEmpty(value: js.Any, predicate: js.Any): Boolean = js.native
  def isectNotEmpty(value: js.Any, predicate: js.Any): Double = js.native
  def notContains(value: js.Any, predicate: js.Any): Boolean = js.native
  def notIn(value: js.Any, predicate: js.Any): Boolean = js.native
}

object _empty {
  @scala.inline
  def apply(
    EqualssignEqualssign: (js.Any, js.Any) => Boolean,
    EqualssignEqualssignEqualssign: (js.Any, js.Any) => Boolean,
    ExclamationmarkEqualssign: (js.Any, js.Any) => Boolean,
    ExclamationmarkEqualssignEqualssign: (js.Any, js.Any) => Boolean,
    Greaterthansign: (js.Any, js.Any) => Boolean,
    GreaterthansignEqualssign: (js.Any, js.Any) => Boolean,
    Lessthansign: (js.Any, js.Any) => Boolean,
    LessthansignEqualssign: (js.Any, js.Any) => Boolean,
    contains: (js.Any, js.Any) => Boolean,
    in: (js.Any, js.Any) => Boolean,
    isectEmpty: (js.Any, js.Any) => Boolean,
    isectNotEmpty: (js.Any, js.Any) => Double,
    notContains: (js.Any, js.Any) => Boolean,
    notIn: (js.Any, js.Any) => Boolean
  ): _empty = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction2(contains), in = js.Any.fromFunction2(in), isectEmpty = js.Any.fromFunction2(isectEmpty), isectNotEmpty = js.Any.fromFunction2(isectNotEmpty), notContains = js.Any.fromFunction2(notContains), notIn = js.Any.fromFunction2(notIn))
    __obj.updateDynamic("==")(js.Any.fromFunction2(EqualssignEqualssign))
    __obj.updateDynamic("===")(js.Any.fromFunction2(EqualssignEqualssignEqualssign))
    __obj.updateDynamic("!=")(js.Any.fromFunction2(ExclamationmarkEqualssign))
    __obj.updateDynamic("!==")(js.Any.fromFunction2(ExclamationmarkEqualssignEqualssign))
    __obj.updateDynamic(">")(js.Any.fromFunction2(Greaterthansign))
    __obj.updateDynamic(">=")(js.Any.fromFunction2(GreaterthansignEqualssign))
    __obj.updateDynamic("<")(js.Any.fromFunction2(Lessthansign))
    __obj.updateDynamic("<=")(js.Any.fromFunction2(LessthansignEqualssign))
    __obj.asInstanceOf[_empty]
  }
  @scala.inline
  implicit class _emptyOps[Self <: _empty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEqualssignEqualssign(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("==")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEqualssignEqualssignEqualssign(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("===")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withExclamationmarkEqualssign(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("!=")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withExclamationmarkEqualssignEqualssign(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("!==")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGreaterthansign(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(">")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGreaterthansignEqualssign(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(">=")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLessthansign(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("<")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLessthansignEqualssign(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("<=")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withContains(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIn(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIsectEmpty(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isectEmpty")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIsectNotEmpty(value: (js.Any, js.Any) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isectNotEmpty")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNotContains(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notContains")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNotIn(value: (js.Any, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notIn")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

