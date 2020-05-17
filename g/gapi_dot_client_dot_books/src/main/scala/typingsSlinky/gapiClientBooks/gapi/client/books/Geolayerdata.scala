package typingsSlinky.gapiClientBooks.gapi.client.books

import typingsSlinky.gapiClientBooks.anon.Boundary
import typingsSlinky.gapiClientBooks.anon.Lang
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Geolayerdata extends js.Object {
  var common: js.UndefOr[Lang] = js.native
  var geo: js.UndefOr[Boundary] = js.native
  var kind: js.UndefOr[String] = js.native
}

object Geolayerdata {
  @scala.inline
  def apply(): Geolayerdata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Geolayerdata]
  }
  @scala.inline
  implicit class GeolayerdataOps[Self <: Geolayerdata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommon(value: Lang): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("common")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("common")(js.undefined)
        ret
    }
    @scala.inline
    def withGeo(value: Boundary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geo")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

