package typingsSlinky.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIsReliable extends js.Object {
  /** CLD detected language reliability */
  var isReliable: Boolean = js.native
  /** array of detectedLanguage */
  var languages: js.Array[AnonLanguage] = js.native
}

object AnonIsReliable {
  @scala.inline
  def apply(isReliable: Boolean, languages: js.Array[AnonLanguage]): AnonIsReliable = {
    val __obj = js.Dynamic.literal(isReliable = isReliable.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsReliable]
  }
  @scala.inline
  implicit class AnonIsReliableOps[Self <: AnonIsReliable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsReliable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReliable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguages(value: js.Array[AnonLanguage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languages")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

