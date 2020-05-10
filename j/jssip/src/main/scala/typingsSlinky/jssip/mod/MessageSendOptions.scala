package typingsSlinky.jssip.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageSendOptions extends js.Object {
  var contentType: js.UndefOr[String] = js.native
  var eventHandlers: js.UndefOr[StringDictionary[js.Function1[/* data */ js.Any, Unit]]] = js.native
  var extraHeaders: js.UndefOr[js.Array[String]] = js.native
}

object MessageSendOptions {
  @scala.inline
  def apply(): MessageSendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageSendOptions]
  }
  @scala.inline
  implicit class MessageSendOptionsOps[Self <: MessageSendOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(js.undefined)
        ret
    }
    @scala.inline
    def withEventHandlers(value: StringDictionary[js.Function1[/* data */ js.Any, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventHandlers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventHandlers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventHandlers")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraHeaders(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraHeaders")(js.undefined)
        ret
    }
  }
  
}

