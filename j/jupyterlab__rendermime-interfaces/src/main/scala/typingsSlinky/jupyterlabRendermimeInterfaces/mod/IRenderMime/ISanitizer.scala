package typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object that handles html sanitization.
  */
@js.native
trait ISanitizer extends js.Object {
  /**
    * Sanitize an HTML string.
    */
  def sanitize(dirty: String): String = js.native
}

object ISanitizer {
  @scala.inline
  def apply(sanitize: String => String): ISanitizer = {
    val __obj = js.Dynamic.literal(sanitize = js.Any.fromFunction1(sanitize))
    __obj.asInstanceOf[ISanitizer]
  }
  @scala.inline
  implicit class ISanitizerOps[Self <: ISanitizer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSanitize(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sanitize")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

