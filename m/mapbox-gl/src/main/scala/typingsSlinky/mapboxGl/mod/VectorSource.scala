package typingsSlinky.mapboxGl.mod

import typingsSlinky.mapboxGl.mapboxGlStrings.tms
import typingsSlinky.mapboxGl.mapboxGlStrings.vector
import typingsSlinky.mapboxGl.mapboxGlStrings.xyz
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VectorSource
  extends Source
     with AnySourceData
     with AnySourceImpl {
  var attribution: js.UndefOr[String] = js.native
  var bounds: js.UndefOr[js.Array[Double]] = js.native
  var maxzoom: js.UndefOr[Double] = js.native
  var minzoom: js.UndefOr[Double] = js.native
  var promoteId: js.UndefOr[PromoteIdSpecification] = js.native
  var scheme: js.UndefOr[xyz | tms] = js.native
  var tiles: js.UndefOr[js.Array[String]] = js.native
  @JSName("type")
  var type_VectorSource: vector = js.native
  var url: js.UndefOr[String] = js.native
}

object VectorSource {
  @scala.inline
  def apply(`type`: vector): VectorSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorSource]
  }
  @scala.inline
  implicit class VectorSourceOps[Self <: VectorSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: vector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttribution(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttribution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribution")(js.undefined)
        ret
    }
    @scala.inline
    def withBounds(value: js.Array[Double]): Self = {
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
    def withMaxzoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxzoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxzoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxzoom")(js.undefined)
        ret
    }
    @scala.inline
    def withMinzoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minzoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinzoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minzoom")(js.undefined)
        ret
    }
    @scala.inline
    def withPromoteId(value: PromoteIdSpecification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promoteId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromoteId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promoteId")(js.undefined)
        ret
    }
    @scala.inline
    def withScheme(value: xyz | tms): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheme")(js.undefined)
        ret
    }
    @scala.inline
    def withTiles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tiles")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

