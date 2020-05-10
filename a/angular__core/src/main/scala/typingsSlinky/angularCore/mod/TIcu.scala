package typingsSlinky.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TIcu extends js.Object {
  /**
    * A list of case values which the current ICU will try to match.
    *
    * The last value is `other`
    */
  var cases: js.Array[_] = js.native
  /**
    * An optional array of child/sub ICUs.
    *
    * In case of nested ICUs such as:
    * ```
    * {�0�, plural,
    *   =0 {zero}
    *   other {�0� {�1�, select,
    *                     cat {cats}
    *                     dog {dogs}
    *                     other {animals}
    *                   }!
    *   }
    * }
    * ```
    * When the parent ICU is changing it must clean up child ICUs as well. For this reason it needs
    * to know which child ICUs to run clean up for as well.
    *
    * In the above example this would be:
    * ```ts
    * [
    *   [],   // `=0` has no sub ICUs
    *   [1],  // `other` has one subICU at `1`st index.
    * ]
    * ```
    *
    * The reason why it is Array of Arrays is because first array represents the case, and second
    * represents the child ICUs to clean up. There may be more than one child ICUs per case.
    */
  var childIcus: js.Array[js.Array[Double]] = js.native
  /**
    * A set of OpCodes to apply in order to build up the DOM render tree for the ICU
    */
  var create: js.Array[I18nMutateOpCodes] = js.native
  /**
    * A set of OpCodes to apply in order to destroy the DOM render tree for the ICU.
    */
  var remove: js.Array[I18nMutateOpCodes] = js.native
  /**
    * Defines the ICU type of `select` or `plural`
    */
  var `type`: IcuType = js.native
  /**
    * A set of OpCodes to apply in order to update the DOM render tree for the ICU bindings.
    */
  var update: js.Array[I18nUpdateOpCodes] = js.native
  /**
    * Number of slots to allocate in expando for each case.
    *
    * This is the max number of DOM elements which will be created by this i18n + ICU blocks. When
    * the DOM elements are being created they are stored in the EXPANDO, so that update OpCodes can
    * write into them.
    */
  var vars: js.Array[Double] = js.native
}

object TIcu {
  @scala.inline
  def apply(
    cases: js.Array[_],
    childIcus: js.Array[js.Array[Double]],
    create: js.Array[I18nMutateOpCodes],
    remove: js.Array[I18nMutateOpCodes],
    `type`: IcuType,
    update: js.Array[I18nUpdateOpCodes],
    vars: js.Array[Double]
  ): TIcu = {
    val __obj = js.Dynamic.literal(cases = cases.asInstanceOf[js.Any], childIcus = childIcus.asInstanceOf[js.Any], create = create.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], vars = vars.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TIcu]
  }
  @scala.inline
  implicit class TIcuOps[Self <: TIcu] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCases(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildIcus(value: js.Array[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childIcus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreate(value: js.Array[I18nMutateOpCodes]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove(value: js.Array[I18nMutateOpCodes]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: IcuType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: js.Array[I18nUpdateOpCodes]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVars(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vars")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

