package typingsSlinky.nodeSsdp.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SsdpHeaders
  extends /* key */ StringDictionary[js.UndefOr[String | Double | Boolean | Null | js.Symbol]] {
  /**
  	 * Available while handling an SSDP response. A URL where the service description can be found.
  	 */
  var LOCATION: js.UndefOr[String] = js.native
  var ST: js.UndefOr[String] = js.native
  /**
  	 * Available while handling an SSDP response. The Unique Service Name (USN) of the responding device.
  	 */
  var USN: js.UndefOr[String] = js.native
}

object SsdpHeaders {
  @scala.inline
  def apply(): SsdpHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SsdpHeaders]
  }
  @scala.inline
  implicit class SsdpHeadersOps[Self <: SsdpHeaders] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLOCATION(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LOCATION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLOCATION: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LOCATION")(js.undefined)
        ret
    }
    @scala.inline
    def withST(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ST")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutST: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ST")(js.undefined)
        ret
    }
    @scala.inline
    def withUSN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("USN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUSN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("USN")(js.undefined)
        ret
    }
  }
  
}

