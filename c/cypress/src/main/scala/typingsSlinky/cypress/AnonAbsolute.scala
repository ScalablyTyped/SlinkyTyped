package typingsSlinky.cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAbsolute extends js.Object {
  /**
    * resolved filename of the spec
    */
  var absolute: String = js.native
  /**
    * filename like "spec.js"
    */
  var name: String = js.native
  /**
    * name relative to the project root, like "cypress/integration/spec.js"
    */
  var relative: String = js.native
}

object AnonAbsolute {
  @scala.inline
  def apply(absolute: String, name: String, relative: String): AnonAbsolute = {
    val __obj = js.Dynamic.literal(absolute = absolute.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], relative = relative.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAbsolute]
  }
  @scala.inline
  implicit class AnonAbsoluteOps[Self <: AnonAbsolute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbsolute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absolute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelative(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relative")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

