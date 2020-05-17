package typingsSlinky.gitlab.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  stream ? :boolean} & gitlab.gitlab/dist/types/core/infrastructure.BaseRequestOptions */
@js.native
trait streambooleanBaseRequestO
  extends /* key */ StringDictionary[js.Any] {
  var stream: js.UndefOr[Boolean] = js.native
  var sudo: js.UndefOr[String | Double] = js.native
}

object streambooleanBaseRequestO {
  @scala.inline
  def apply(): streambooleanBaseRequestO = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[streambooleanBaseRequestO]
  }
  @scala.inline
  implicit class streambooleanBaseRequestOOps[Self <: streambooleanBaseRequestO] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStream(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(js.undefined)
        ret
    }
    @scala.inline
    def withSudo(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sudo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSudo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sudo")(js.undefined)
        ret
    }
  }
  
}

