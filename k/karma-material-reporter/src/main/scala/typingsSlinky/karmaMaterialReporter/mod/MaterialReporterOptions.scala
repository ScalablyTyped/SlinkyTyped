package typingsSlinky.karmaMaterialReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaterialReporterOptions extends js.Object {
  /**
    * whether to open the reporter UI automatically in the default browser
    * @default true
    */
  var autoOpen: js.UndefOr[Boolean] = js.native
  /**
    * expand all the expandable suite menus
    * @default true
    */
  var expandSuites: js.UndefOr[Boolean] = js.native
  /**
    * port in which the reporter startes a express server
    * @default 3000
    */
  var serverPort: js.UndefOr[Double] = js.native
}

object MaterialReporterOptions {
  @scala.inline
  def apply(): MaterialReporterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaterialReporterOptions]
  }
  @scala.inline
  implicit class MaterialReporterOptionsOps[Self <: MaterialReporterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandSuites(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandSuites")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandSuites: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandSuites")(js.undefined)
        ret
    }
    @scala.inline
    def withServerPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverPort")(js.undefined)
        ret
    }
  }
  
}

