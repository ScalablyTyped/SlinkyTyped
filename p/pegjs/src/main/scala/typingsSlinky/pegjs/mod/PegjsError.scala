package typingsSlinky.pegjs.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PegjsError extends Error {
  var expected: js.UndefOr[js.Array[ExpectedItem]] = js.native
  var found: js.UndefOr[js.Any] = js.native
  var location: LocationRange = js.native
  @JSName("stack")
  var stack_PegjsError: js.UndefOr[js.Any] = js.native
}

object PegjsError {
  @scala.inline
  def apply(location: LocationRange, message: String, name: String): PegjsError = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PegjsError]
  }
  @scala.inline
  implicit class PegjsErrorOps[Self <: PegjsError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocation(value: LocationRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpected(value: js.Array[ExpectedItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expected")(js.undefined)
        ret
    }
    @scala.inline
    def withFound(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("found")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("found")(js.undefined)
        ret
    }
    @scala.inline
    def withStack(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stack")(js.undefined)
        ret
    }
  }
  
}

