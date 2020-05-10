package typingsSlinky.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDefault extends js.Object {
  /**
    * The default value for the property.
    */
  var default: String = js.native
  /**
    * A list of objects that specify language-specific values for the property.
    */
  var localized: js.Array[AnonLanguage] = js.native
}

object AnonDefault {
  @scala.inline
  def apply(default: String, localized: js.Array[AnonLanguage]): AnonDefault = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], localized = localized.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefault]
  }
  @scala.inline
  implicit class AnonDefaultOps[Self <: AnonDefault] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalized(value: js.Array[AnonLanguage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localized")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

