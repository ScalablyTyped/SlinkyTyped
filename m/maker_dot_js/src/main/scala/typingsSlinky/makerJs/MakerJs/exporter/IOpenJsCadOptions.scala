package typingsSlinky.makerJs.MakerJs.exporter

import typingsSlinky.makerJs.MakerJs.IFindLoopsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * OpenJsCad export options.
  */
@js.native
trait IOpenJsCadOptions extends IFindLoopsOptions {
  /**
    * Optional depth of 3D extrusion.
    */
  var extrusion: js.UndefOr[Double] = js.native
  /**
    * Optional size of curve facets.
    */
  var facetSize: js.UndefOr[Double] = js.native
  /**
    * Optional override of function name, default is "main".
    */
  var functionName: js.UndefOr[String] = js.native
  /**
    * Optional options applied to specific first-child models by model id.
    */
  var modelMap: js.UndefOr[IOpenJsCadOptionsMap] = js.native
}

object IOpenJsCadOptions {
  @scala.inline
  def apply(): IOpenJsCadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOpenJsCadOptions]
  }
  @scala.inline
  implicit class IOpenJsCadOptionsOps[Self <: IOpenJsCadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtrusion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extrusion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtrusion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extrusion")(js.undefined)
        ret
    }
    @scala.inline
    def withFacetSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facetSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFacetSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facetSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionName")(js.undefined)
        ret
    }
    @scala.inline
    def withModelMap(value: IOpenJsCadOptionsMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelMap")(js.undefined)
        ret
    }
  }
  
}

