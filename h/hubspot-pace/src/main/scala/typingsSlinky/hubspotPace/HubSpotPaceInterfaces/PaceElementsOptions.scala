package typingsSlinky.hubspotPace.HubSpotPaceInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaceElementsOptions extends js.Object {
  /**
    * How frequently in ms should we check for the elements being tested for using the element monitor?
    */
  var checkInterval: js.UndefOr[Double] = js.native
  /**
    * What elements should we wait for before deciding the page is fully loaded (not required)
    */
  var selectors: js.UndefOr[js.Array[String]] = js.native
}

object PaceElementsOptions {
  @scala.inline
  def apply(): PaceElementsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaceElementsOptions]
  }
  @scala.inline
  implicit class PaceElementsOptionsOps[Self <: PaceElementsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectors")(js.undefined)
        ret
    }
  }
  
}

