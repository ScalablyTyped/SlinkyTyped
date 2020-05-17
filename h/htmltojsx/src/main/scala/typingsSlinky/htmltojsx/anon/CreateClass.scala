package typingsSlinky.htmltojsx.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateClass extends js.Object {
  var createClass: js.UndefOr[Boolean] = js.native
  /** as a string e.g. '    ' or '\t' */
  var indent: js.UndefOr[String] = js.native
  var outputClassName: js.UndefOr[String] = js.native
}

object CreateClass {
  @scala.inline
  def apply(): CreateClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateClass]
  }
  @scala.inline
  implicit class CreateClassOps[Self <: CreateClass] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateClass(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createClass")(js.undefined)
        ret
    }
    @scala.inline
    def withIndent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputClassName")(js.undefined)
        ret
    }
  }
  
}

