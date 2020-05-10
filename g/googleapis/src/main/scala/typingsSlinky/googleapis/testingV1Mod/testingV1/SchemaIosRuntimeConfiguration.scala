package typingsSlinky.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * iOS configuration that can be selected at the time a test is run.
  */
@js.native
trait SchemaIosRuntimeConfiguration extends js.Object {
  /**
    * The set of available locales.
    */
  var locales: js.UndefOr[js.Array[SchemaLocale]] = js.native
  /**
    * The set of available orientations.
    */
  var orientations: js.UndefOr[js.Array[SchemaOrientation]] = js.native
}

object SchemaIosRuntimeConfiguration {
  @scala.inline
  def apply(): SchemaIosRuntimeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIosRuntimeConfiguration]
  }
  @scala.inline
  implicit class SchemaIosRuntimeConfigurationOps[Self <: SchemaIosRuntimeConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocales(value: js.Array[SchemaLocale]): Self = {
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
    def withOrientations(value: js.Array[SchemaOrientation]): Self = {
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

