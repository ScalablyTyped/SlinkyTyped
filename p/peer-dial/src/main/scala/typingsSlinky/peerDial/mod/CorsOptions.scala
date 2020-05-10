package typingsSlinky.peerDial.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CorsOptions extends js.Object {
  var exposedHeaders: js.Array[String] = js.native
  var methods: js.Array[String] = js.native
  var origin: Boolean = js.native
}

object CorsOptions {
  @scala.inline
  def apply(exposedHeaders: js.Array[String], methods: js.Array[String], origin: Boolean): CorsOptions = {
    val __obj = js.Dynamic.literal(exposedHeaders = exposedHeaders.asInstanceOf[js.Any], methods = methods.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[CorsOptions]
  }
  @scala.inline
  implicit class CorsOptionsOps[Self <: CorsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExposedHeaders(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposedHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethods(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrigin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

