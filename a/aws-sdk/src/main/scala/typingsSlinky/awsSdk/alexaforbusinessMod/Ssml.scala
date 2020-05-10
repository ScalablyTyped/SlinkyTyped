package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ssml extends js.Object {
  /**
    * The locale of the SSML message. Currently, en-US is supported.
    */
  var Locale: typingsSlinky.awsSdk.alexaforbusinessMod.Locale = js.native
  /**
    * The value of the SSML message in the correct SSML format. The audio tag is not supported.
    */
  var Value: SsmlValue = js.native
}

object Ssml {
  @scala.inline
  def apply(Locale: Locale, Value: SsmlValue): Ssml = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ssml]
  }
  @scala.inline
  implicit class SsmlOps[Self <: Ssml] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocale(value: Locale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: SsmlValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

