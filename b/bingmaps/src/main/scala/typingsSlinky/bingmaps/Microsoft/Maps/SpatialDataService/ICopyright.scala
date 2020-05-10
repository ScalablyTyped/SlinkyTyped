package typingsSlinky.bingmaps.Microsoft.Maps.SpatialDataService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICopyright extends js.Object {
  /** The copyright URL for the GeoData service. */
  var CopyrightURL: String = js.native
  /** A collection of CopyrightSource objects that give information about the sources of the polygon data that is returned. */
  var Sources: js.Array[ICopyrightSource] = js.native
}

object ICopyright {
  @scala.inline
  def apply(CopyrightURL: String, Sources: js.Array[ICopyrightSource]): ICopyright = {
    val __obj = js.Dynamic.literal(CopyrightURL = CopyrightURL.asInstanceOf[js.Any], Sources = Sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICopyright]
  }
  @scala.inline
  implicit class ICopyrightOps[Self <: ICopyright] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopyrightURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyrightURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSources(value: js.Array[ICopyrightSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sources")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

