package typingsSlinky.amqplib.propertiesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessagePropertyHeaders
  extends /* key */ StringDictionary[js.Any] {
  var `x-death`: js.UndefOr[js.Array[XDeath]] = js.native
  var `x-first-death-exchange`: js.UndefOr[String] = js.native
  var `x-first-death-queue`: js.UndefOr[String] = js.native
  var `x-first-death-reason`: js.UndefOr[String] = js.native
}

object MessagePropertyHeaders {
  @scala.inline
  def apply(): MessagePropertyHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessagePropertyHeaders]
  }
  @scala.inline
  implicit class MessagePropertyHeadersOps[Self <: MessagePropertyHeaders] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withX-death`(value: js.Array[XDeath]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-death")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutX-death`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-death")(js.undefined)
        ret
    }
    @scala.inline
    def `withX-first-death-exchange`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-first-death-exchange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutX-first-death-exchange`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-first-death-exchange")(js.undefined)
        ret
    }
    @scala.inline
    def `withX-first-death-queue`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-first-death-queue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutX-first-death-queue`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-first-death-queue")(js.undefined)
        ret
    }
    @scala.inline
    def `withX-first-death-reason`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-first-death-reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutX-first-death-reason`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-first-death-reason")(js.undefined)
        ret
    }
  }
  
}

