package typingsSlinky.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AndroidRuntimeConfiguration extends js.Object {
  /**
    * The set of available locales.
    * @OutputOnly
    */
  var locales: js.UndefOr[js.Array[Locale]] = js.native
  /**
    * The set of available orientations.
    * @OutputOnly
    */
  var orientations: js.UndefOr[js.Array[Orientation]] = js.native
}

object AndroidRuntimeConfiguration {
  @scala.inline
  def apply(): AndroidRuntimeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidRuntimeConfiguration]
  }
  @scala.inline
  implicit class AndroidRuntimeConfigurationOps[Self <: AndroidRuntimeConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocales(value: js.Array[Locale]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locales")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocales: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locales")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientations(value: js.Array[Orientation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientations")(js.undefined)
        ret
    }
  }
  
}

