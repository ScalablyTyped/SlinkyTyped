package typingsSlinky.jstree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  /**
    * holds all jstree related functions and variables,
    * including the actual class and methods to create,
    * access and manipulate instances.
    * @property jstree
    * @type {JSTreeStatic}
    */
  var jstree: js.UndefOr[JSTreeStatic] = js.native
  /**
    * helpers
    */
  var vakata: js.UndefOr[VakataStatic] = js.native
}

object JQueryStatic {
  @scala.inline
  def apply(): JQueryStatic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryStatic]
  }
  @scala.inline
  implicit class JQueryStaticOps[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJstree(value: JSTreeStatic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jstree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJstree: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jstree")(js.undefined)
        ret
    }
    @scala.inline
    def withVakata(value: VakataStatic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vakata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVakata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vakata")(js.undefined)
        ret
    }
  }
  
}

