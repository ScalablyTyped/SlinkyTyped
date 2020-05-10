package typingsSlinky.grammarkdown.hostMod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostBaseOptions extends js.Object {
  var ignoreCase: js.UndefOr[Boolean] = js.native
  var knownGrammars: js.UndefOr[Record[String, String]] = js.native
  var useBuiltinGrammars: js.UndefOr[Boolean] = js.native
}

object HostBaseOptions {
  @scala.inline
  def apply(): HostBaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostBaseOptions]
  }
  @scala.inline
  implicit class HostBaseOptionsOps[Self <: HostBaseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnoreCase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreCase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreCase")(js.undefined)
        ret
    }
    @scala.inline
    def withKnownGrammars(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knownGrammars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKnownGrammars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knownGrammars")(js.undefined)
        ret
    }
    @scala.inline
    def withUseBuiltinGrammars(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useBuiltinGrammars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseBuiltinGrammars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useBuiltinGrammars")(js.undefined)
        ret
    }
  }
  
}

