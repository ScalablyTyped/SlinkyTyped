package typingsSlinky.reactFoundation.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassNameProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var noDefaultClassName: js.UndefOr[String] = js.native
}

object ClassNameProps {
  @scala.inline
  def apply(): ClassNameProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassNameProps]
  }
  @scala.inline
  implicit class ClassNamePropsOps[Self <: ClassNameProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withNoDefaultClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDefaultClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoDefaultClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDefaultClassName")(js.undefined)
        ret
    }
  }
  
}

