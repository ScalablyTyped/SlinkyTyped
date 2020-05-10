package typingsSlinky.fabric.fabricImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IToSVGOptions extends js.Object {
  /**
  	 * Encoding of SVG output
  	 */
  var encoding: js.UndefOr[String] = js.native
  /**
  	 * desired height of svg with or without units
  	 */
  var height: js.UndefOr[Double] = js.native
  /**
  	 * If true xml tag is not included
  	 */
  var suppressPreamble: js.UndefOr[Boolean] = js.native
  /**
  	 * SVG viewbox object
  	 */
  var viewBox: js.UndefOr[IViewBox] = js.native
  /**
  	 * desired width of svg with or without units
  	 */
  var width: js.UndefOr[Double] = js.native
}

object IToSVGOptions {
  @scala.inline
  def apply(): IToSVGOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IToSVGOptions]
  }
  @scala.inline
  implicit class IToSVGOptionsOps[Self <: IToSVGOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressPreamble(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressPreamble")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressPreamble: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressPreamble")(js.undefined)
        ret
    }
    @scala.inline
    def withViewBox(value: IViewBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewBox")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

