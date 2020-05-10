package typingsSlinky.bodyParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsUrlencoded extends Options {
  /**
    * The extended option allows to choose between parsing the URL-encoded data
    * with the querystring library (when `false`) or the qs library (when `true`).
    */
  var extended: js.UndefOr[Boolean] = js.native
  /**
    * The parameterLimit option controls the maximum number of parameters
    * that are allowed in the URL-encoded data. If a request contains more parameters than this value,
    * a 413 will be returned to the client. Defaults to 1000.
    */
  var parameterLimit: js.UndefOr[Double] = js.native
}

object OptionsUrlencoded {
  @scala.inline
  def apply(): OptionsUrlencoded = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsUrlencoded]
  }
  @scala.inline
  implicit class OptionsUrlencodedOps[Self <: OptionsUrlencoded] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtended(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extended")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtended: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extended")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterLimit")(js.undefined)
        ret
    }
  }
  
}

