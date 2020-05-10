package typingsSlinky.i18next

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTranslation extends js.Object {
  var translation: StringDictionary[String] = js.native
}

object AnonTranslation {
  @scala.inline
  def apply(translation: StringDictionary[String]): AnonTranslation = {
    val __obj = js.Dynamic.literal(translation = translation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTranslation]
  }
  @scala.inline
  implicit class AnonTranslationOps[Self <: AnonTranslation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTranslation(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

