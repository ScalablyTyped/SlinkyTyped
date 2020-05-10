package typingsSlinky.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Store information for the i18n translation block.
  */
@js.native
trait TI18n extends js.Object {
  /**
    * A set of OpCodes which will create the Text Nodes and ICU anchors for the translation blocks.
    *
    * NOTE: The ICU anchors are filled in with ICU Update OpCode.
    */
  var create: I18nMutateOpCodes = js.native
  /**
    * A list of ICUs in a translation block (or `null` if block has no ICUs).
    *
    * Example:
    * Given: `<div i18n>You have {count, plural, ...} and {state, switch, ...}</div>`
    * There would be 2 ICUs in this array.
    *   1. `{count, plural, ...}`
    *   2. `{state, switch, ...}`
    */
  var icus: js.Array[TIcu] | Null = js.native
  /**
    * A set of OpCodes which will be executed on each change detection to determine if any changes to
    * DOM are required.
    */
  var update: I18nUpdateOpCodes = js.native
  /**
    * Number of slots to allocate in expando.
    *
    * This is the max number of DOM elements which will be created by this i18n + ICU blocks. When
    * the DOM elements are being created they are stored in the EXPANDO, so that update OpCodes can
    * write into them.
    */
  var vars: Double = js.native
}

object TI18n {
  @scala.inline
  def apply(create: I18nMutateOpCodes, update: I18nUpdateOpCodes, vars: Double): TI18n = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], vars = vars.asInstanceOf[js.Any])
    __obj.asInstanceOf[TI18n]
  }
  @scala.inline
  implicit class TI18nOps[Self <: TI18n] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: I18nMutateOpCodes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: I18nUpdateOpCodes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVars(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcus(value: js.Array[TIcu]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcusNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icus")(null)
        ret
    }
  }
  
}

