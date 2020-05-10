package typingsSlinky.dojo.dojox.geo.openlayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/geo/openlayers/Patch.html
  *
  *
  */
@js.native
trait Patch extends js.Object {
  /**
    *
    */
  def patchGFX(): Unit = js.native
}

object Patch {
  @scala.inline
  def apply(patchGFX: () => Unit): Patch = {
    val __obj = js.Dynamic.literal(patchGFX = js.Any.fromFunction0(patchGFX))
    __obj.asInstanceOf[Patch]
  }
  @scala.inline
  implicit class PatchOps[Self <: Patch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPatchGFX(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patchGFX")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

