package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StalkerParseOptions extends js.Object {
  /**
    * Whether to include the type of each event. Defaults to `true`.
    */
  var annotate: js.UndefOr[Boolean] = js.native
  /**
    * Whether to format pointer values as strings instead of `NativePointer`
    * values, i.e. less overhead if you're just going to `send()` the result
    * and not actually parse the data agent-side.
    */
  var stringify: js.UndefOr[Boolean] = js.native
}

object StalkerParseOptions {
  @scala.inline
  def apply(): StalkerParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StalkerParseOptions]
  }
  @scala.inline
  implicit class StalkerParseOptionsOps[Self <: StalkerParseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotate")(js.undefined)
        ret
    }
    @scala.inline
    def withStringify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringify")(js.undefined)
        ret
    }
  }
  
}

