package typingsSlinky.appleMapkitJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDark extends js.Object {
  /**
    * A constant indicating a dark color scheme.
    */
  val Dark: String = js.native
  /**
    * A constant indicating a light color scheme.
    */
  val Light: String = js.native
}

object AnonDark {
  @scala.inline
  def apply(Dark: String, Light: String): AnonDark = {
    val __obj = js.Dynamic.literal(Dark = Dark.asInstanceOf[js.Any], Light = Light.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDark]
  }
  @scala.inline
  implicit class AnonDarkOps[Self <: AnonDark] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Light")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

