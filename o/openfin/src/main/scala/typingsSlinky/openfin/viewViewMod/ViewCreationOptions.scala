package typingsSlinky.openfin.viewViewMod

import typingsSlinky.openfin.identityMod.Identity
import typingsSlinky.openfin.shapesMod.ViewBounds
import typingsSlinky.openfin.windowOptionMod.CustomRequestHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewCreationOptions extends ViewOptions {
  var bounds: js.UndefOr[ViewBounds] = js.native
  var customRequestHeaders: js.UndefOr[js.Array[CustomRequestHeaders]] = js.native
  var name: String = js.native
  var processAffinity: js.UndefOr[String] = js.native
  var target: Identity = js.native
  var url: String = js.native
}

object ViewCreationOptions {
  @scala.inline
  def apply(name: String, target: Identity, url: String): ViewCreationOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewCreationOptions]
  }
  @scala.inline
  implicit class ViewCreationOptionsOps[Self <: ViewCreationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: Identity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBounds(value: ViewBounds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomRequestHeaders(value: js.Array[CustomRequestHeaders]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customRequestHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomRequestHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customRequestHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessAffinity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processAffinity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessAffinity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processAffinity")(js.undefined)
        ret
    }
  }
  
}

