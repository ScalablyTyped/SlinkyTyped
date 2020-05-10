package typingsSlinky.bingmaps.Microsoft.Maps.SpatialDataService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICopyrightSource extends js.Object {
  /** The copyright string from the source. */
  var Copyright: String = js.native
  /** An ID identifying the data provider that supplied the data. */
  var SourceID: String = js.native
  /** The name of the data provider represented by this Source element. */
  var SourceName: String = js.native
}

object ICopyrightSource {
  @scala.inline
  def apply(Copyright: String, SourceID: String, SourceName: String): ICopyrightSource = {
    val __obj = js.Dynamic.literal(Copyright = Copyright.asInstanceOf[js.Any], SourceID = SourceID.asInstanceOf[js.Any], SourceName = SourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICopyrightSource]
  }
  @scala.inline
  implicit class ICopyrightSourceOps[Self <: ICopyrightSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopyright(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Copyright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

