package typingsSlinky.bagpipes.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FittingDef
  extends // allow other config settings
/* prop */ StringDictionary[js.Any]
     with PipeDef {
  /** Static values passed to the fitting during construction */
  var config: js.UndefOr[js.Any] = js.native
  /** Dynamic values passed to the fitting during execution */
  var input: js.UndefOr[js.Any] = js.native
  /** The name of the fitting of the type specified */
  var name: js.UndefOr[String] = js.native
  /** The name of the context key to which the output value is assigned */
  var output: js.UndefOr[js.Any] = js.native
  /**
    * If type is omitted (as it must be for in-line usage), Bagpipes will
    * first check the user fittings then the system fittings for the name and
    * use the first fitting found.
    *
    * Thus be aware that if you define a fitting with the same name as a
    * system one, your fitting will override it.
    */
  var `type`: js.UndefOr[FittingType] = js.native
}

object FittingDef {
  @scala.inline
  def apply(): FittingDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FittingDef]
  }
  @scala.inline
  implicit class FittingDefOps[Self <: FittingDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withInput(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(js.undefined)
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
    @scala.inline
    def withOutput(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: FittingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

