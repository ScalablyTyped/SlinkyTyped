package typingsSlinky.firefoxWebextBrowser

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.firefoxWebextBrowser.browser.manifest.FirefoxSpecificProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEdge extends js.Object {
  var edge: js.UndefOr[StringDictionary[js.Any]] = js.native
  var gecko: js.UndefOr[FirefoxSpecificProperties] = js.native
}

object AnonEdge {
  @scala.inline
  def apply(): AnonEdge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonEdge]
  }
  @scala.inline
  implicit class AnonEdgeOps[Self <: AnonEdge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEdge(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edge")(js.undefined)
        ret
    }
    @scala.inline
    def withGecko(value: FirefoxSpecificProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gecko")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGecko: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gecko")(js.undefined)
        ret
    }
  }
  
}

