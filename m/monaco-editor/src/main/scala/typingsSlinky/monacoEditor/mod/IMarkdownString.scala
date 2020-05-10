package typingsSlinky.monacoEditor.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMarkdownString extends js.Object {
  var isTrusted: js.UndefOr[Boolean] = js.native
  var uris: js.UndefOr[StringDictionary[UriComponents]] = js.native
  var value: String = js.native
}

object IMarkdownString {
  @scala.inline
  def apply(value: String): IMarkdownString = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMarkdownString]
  }
  @scala.inline
  implicit class IMarkdownStringOps[Self <: IMarkdownString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsTrusted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTrusted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsTrusted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTrusted")(js.undefined)
        ret
    }
    @scala.inline
    def withUris(value: StringDictionary[UriComponents]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uris")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUris: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uris")(js.undefined)
        ret
    }
  }
  
}

