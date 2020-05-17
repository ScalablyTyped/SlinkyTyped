package typingsSlinky.c3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Brighten extends js.Object {
  var brighten: js.UndefOr[Boolean] = js.native
  /**
    * Indicate if the chart should have interactions.
    * If `false` is set, all of interactions (showing/hiding tooltip, selection, mouse events, etc) will be disabled.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}

object Brighten {
  @scala.inline
  def apply(): Brighten = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Brighten]
  }
  @scala.inline
  implicit class BrightenOps[Self <: Brighten] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrighten(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brighten")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrighten: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brighten")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
  }
  
}

