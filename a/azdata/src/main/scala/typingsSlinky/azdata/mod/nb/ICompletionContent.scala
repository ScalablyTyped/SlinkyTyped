package typingsSlinky.azdata.mod.nb

import typingsSlinky.azdata.azdataStrings.error
import typingsSlinky.azdata.azdataStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICompletionContent extends js.Object {
  var cursor_end: Double = js.native
  var cursor_start: Double = js.native
  var matches: js.Array[String] = js.native
  var metadata: js.Any = js.native
  var status: ok | error = js.native
}

object ICompletionContent {
  @scala.inline
  def apply(
    cursor_end: Double,
    cursor_start: Double,
    matches: js.Array[String],
    metadata: js.Any,
    status: ok | error
  ): ICompletionContent = {
    val __obj = js.Dynamic.literal(cursor_end = cursor_end.asInstanceOf[js.Any], cursor_start = cursor_start.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICompletionContent]
  }
  @scala.inline
  implicit class ICompletionContentOps[Self <: ICompletionContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCursor_end(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor_end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCursor_start(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor_start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatches(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: ok | error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

