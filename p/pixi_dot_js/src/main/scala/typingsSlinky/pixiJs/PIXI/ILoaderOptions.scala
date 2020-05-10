package typingsSlinky.pixiJs.PIXI

import typingsSlinky.pixiJs.AnonLoadElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILoaderOptions extends js.Object {
  var crossOrigin: js.UndefOr[Boolean | String] = js.native
  var loadType: js.UndefOr[Double] = js.native
  var metadata: js.UndefOr[AnonLoadElement] = js.native
  var xhrType: js.UndefOr[String] = js.native
}

object ILoaderOptions {
  @scala.inline
  def apply(): ILoaderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILoaderOptions]
  }
  @scala.inline
  implicit class ILoaderOptionsOps[Self <: ILoaderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrossOrigin(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOrigin")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadType")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: AnonLoadElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withXhrType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhrType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXhrType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhrType")(js.undefined)
        ret
    }
  }
  
}

