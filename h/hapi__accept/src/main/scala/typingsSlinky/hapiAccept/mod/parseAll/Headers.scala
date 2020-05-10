package typingsSlinky.hapiAccept.mod.parseAll

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Headers
  extends /* header */ StringDictionary[js.Any] {
  val accept: js.UndefOr[String] = js.native
  val `accept-charset`: js.UndefOr[String] = js.native
  val `accept-encoding`: js.UndefOr[String] = js.native
  val `accept-language`: js.UndefOr[String] = js.native
}

object Headers {
  @scala.inline
  def apply(): Headers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Headers]
  }
  @scala.inline
  implicit class HeadersOps[Self <: Headers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccept(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept")(js.undefined)
        ret
    }
    @scala.inline
    def `withAccept-charset`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept-charset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAccept-charset`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept-charset")(js.undefined)
        ret
    }
    @scala.inline
    def `withAccept-encoding`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept-encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAccept-encoding`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept-encoding")(js.undefined)
        ret
    }
    @scala.inline
    def `withAccept-language`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept-language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAccept-language`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept-language")(js.undefined)
        ret
    }
  }
  
}

