package typingsSlinky.fabric.fabricImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICanvasDimensionsOptions extends js.Object {
  /**
  	 * Set the given dimensions only as canvas backstore dimensions
  	 */
  var backstoreOnly: js.UndefOr[Boolean] = js.native
  /**
  	 * Set the given dimensions only as css dimensions
  	 */
  var cssOnly: js.UndefOr[Boolean] = js.native
}

object ICanvasDimensionsOptions {
  @scala.inline
  def apply(): ICanvasDimensionsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICanvasDimensionsOptions]
  }
  @scala.inline
  implicit class ICanvasDimensionsOptionsOps[Self <: ICanvasDimensionsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackstoreOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backstoreOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackstoreOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backstoreOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withCssOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssOnly")(js.undefined)
        ret
    }
  }
  
}

