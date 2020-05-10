package typingsSlinky.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about a metro region that can be targeted by ads.
  */
@js.native
trait SchemaMetro extends js.Object {
  /**
    * Country code of the country to which this metro region belongs.
    */
  var countryCode: js.UndefOr[String] = js.native
  /**
    * DART ID of the country to which this metro region belongs.
    */
  var countryDartId: js.UndefOr[String] = js.native
  /**
    * DART ID of this metro region.
    */
  var dartId: js.UndefOr[String] = js.native
  /**
    * DMA ID of this metro region. This is the ID used for targeting and
    * generating reports, and is equivalent to metro_code.
    */
  var dmaId: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#metro&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Metro code of this metro region. This is equivalent to dma_id.
    */
  var metroCode: js.UndefOr[String] = js.native
  /**
    * Name of this metro region.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaMetro {
  @scala.inline
  def apply(): SchemaMetro = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetro]
  }
  @scala.inline
  implicit class SchemaMetroOps[Self <: SchemaMetro] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountryCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountryCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryCode")(js.undefined)
        ret
    }
    @scala.inline
    def withCountryDartId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryDartId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountryDartId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryDartId")(js.undefined)
        ret
    }
    @scala.inline
    def withDartId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dartId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDartId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dartId")(js.undefined)
        ret
    }
    @scala.inline
    def withDmaId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dmaId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDmaId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dmaId")(js.undefined)
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
    @scala.inline
    def withMetroCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metroCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetroCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metroCode")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

