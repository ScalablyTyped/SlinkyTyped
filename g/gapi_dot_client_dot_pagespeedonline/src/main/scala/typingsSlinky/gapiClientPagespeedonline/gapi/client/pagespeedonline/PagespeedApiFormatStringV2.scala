package typingsSlinky.gapiClientPagespeedonline.gapi.client.pagespeedonline

import typingsSlinky.gapiClientPagespeedonline.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PagespeedApiFormatStringV2 extends js.Object {
  /** List of arguments for the format string. */
  var args: js.UndefOr[js.Array[AnonKey]] = js.native
  /**
    * A localized format string with {{FOO}} placeholders, where 'FOO' is the key of the argument whose value should be substituted. For HYPERLINK arguments,
    * the format string will instead contain {{BEGIN_FOO}} and {{END_FOO}} for the argument with key 'FOO'.
    */
  var format: js.UndefOr[String] = js.native
}

object PagespeedApiFormatStringV2 {
  @scala.inline
  def apply(): PagespeedApiFormatStringV2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PagespeedApiFormatStringV2]
  }
  @scala.inline
  implicit class PagespeedApiFormatStringV2Ops[Self <: PagespeedApiFormatStringV2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Array[AnonKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
  }
  
}

