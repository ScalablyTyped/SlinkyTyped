package typingsSlinky.appleMapkitJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dark extends js.Object {
  /**
    * A constant indicating a dark color scheme.
    */
  val Dark: String = js.native
  /**
    * A constant indicating a light color scheme.
    */
  val Light: String = js.native
}

object Dark {
  @scala.inline
  def apply(Dark: String, Light: String): Dark = {
    val __obj = js.Dynamic.literal(Dark = Dark.asInstanceOf[js.Any], Light = Light.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dark]
  }
  @scala.inline
  implicit class DarkOps[Self <: Dark] (val x: Self) extends AnyVal {
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

