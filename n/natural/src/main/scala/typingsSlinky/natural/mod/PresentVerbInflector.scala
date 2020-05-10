package typingsSlinky.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PresentVerbInflector extends js.Object {
  def pluralize(token: String): String = js.native
  def singularize(token: String): String = js.native
}

object PresentVerbInflector {
  @scala.inline
  def apply(pluralize: String => String, singularize: String => String): PresentVerbInflector = {
    val __obj = js.Dynamic.literal(pluralize = js.Any.fromFunction1(pluralize), singularize = js.Any.fromFunction1(singularize))
    __obj.asInstanceOf[PresentVerbInflector]
  }
  @scala.inline
  implicit class PresentVerbInflectorOps[Self <: PresentVerbInflector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPluralize(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluralize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSingularize(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singularize")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

