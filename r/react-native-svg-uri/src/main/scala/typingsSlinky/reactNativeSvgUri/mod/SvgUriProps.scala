package typingsSlinky.reactNativeSvgUri.mod

import typingsSlinky.reactNative.mod.ImageURISource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SvgUriProps extends js.Object {
  /**
    * Fill color for the svg object
    */
  var fill: js.UndefOr[String] = js.native
  /**
    * The height of the rendered svg
    */
  var height: js.UndefOr[Double | String] = js.native
  /**
    * Source path for the .svg file
    * Expects a require('path') to the file or object with uri.
    * e.g. source={require('my-path')}
    * e.g. source={{ur: 'my-path'}}
    */
  var source: js.UndefOr[ImageURISource] = js.native
  /**
    * Direct svg code to render. Similar to inline svg
    */
  var svgXmlData: js.UndefOr[String] = js.native
  /**
    * The width of the rendered svg
    */
  var width: js.UndefOr[Double | String] = js.native
}

object SvgUriProps {
  @scala.inline
  def apply(): SvgUriProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SvgUriProps]
  }
  @scala.inline
  implicit class SvgUriPropsOps[Self <: SvgUriProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFill(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double | String): Self = {
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
    def withSource(value: ImageURISource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withSvgXmlData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgXmlData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSvgXmlData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgXmlData")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double | String): Self = {
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

