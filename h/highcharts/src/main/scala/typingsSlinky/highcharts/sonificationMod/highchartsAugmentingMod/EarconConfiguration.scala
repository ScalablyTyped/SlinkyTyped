package typingsSlinky.highcharts.sonificationMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Earcon configuration, specifying an Earcon and when to play it.
  */
@js.native
trait EarconConfiguration extends js.Object {
  /**
    * A function to determine whether or not to play this earcon on a
    * point. The function is called for every point, receiving that point
    * as parameter. It should return either a boolean indicating whether or
    * not to play the earcon, or a new Earcon instance - in which case the
    * new Earcon will be played.
    */
  var condition: js.UndefOr[js.Function] = js.native
  /**
    * An Earcon instance.
    */
  var earcon: Earcon = js.native
  /**
    * The ID of the point to play the Earcon on.
    */
  var onPoint: js.UndefOr[String] = js.native
}

object EarconConfiguration {
  @scala.inline
  def apply(earcon: Earcon): EarconConfiguration = {
    val __obj = js.Dynamic.literal(earcon = earcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[EarconConfiguration]
  }
  @scala.inline
  implicit class EarconConfigurationOps[Self <: EarconConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEarcon(value: Earcon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("earcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCondition(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPoint")(js.undefined)
        ret
    }
  }
  
}

