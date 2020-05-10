package typingsSlinky.enhancedResolve.commonTypesMod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolveError extends Error {
  var details: String = js.native
  var missing: js.Array[String] = js.native
  var recursion: Boolean = js.native
}

object ResolveError {
  @scala.inline
  def apply(details: String, message: String, missing: js.Array[String], name: String, recursion: Boolean): ResolveError = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], missing = missing.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], recursion = recursion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveError]
  }
  @scala.inline
  implicit class ResolveErrorOps[Self <: ResolveError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetails(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMissing(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecursion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursion")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

