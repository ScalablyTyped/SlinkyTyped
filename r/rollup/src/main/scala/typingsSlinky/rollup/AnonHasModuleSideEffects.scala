package typingsSlinky.rollup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHasModuleSideEffects extends js.Object {
  var hasModuleSideEffects: Boolean = js.native
  var id: String = js.native
  var importedIds: js.Array[String] = js.native
  var isEntry: Boolean = js.native
  var isExternal: Boolean = js.native
}

object AnonHasModuleSideEffects {
  @scala.inline
  def apply(
    hasModuleSideEffects: Boolean,
    id: String,
    importedIds: js.Array[String],
    isEntry: Boolean,
    isExternal: Boolean
  ): AnonHasModuleSideEffects = {
    val __obj = js.Dynamic.literal(hasModuleSideEffects = hasModuleSideEffects.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], importedIds = importedIds.asInstanceOf[js.Any], isEntry = isEntry.asInstanceOf[js.Any], isExternal = isExternal.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHasModuleSideEffects]
  }
  @scala.inline
  implicit class AnonHasModuleSideEffectsOps[Self <: AnonHasModuleSideEffects] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasModuleSideEffects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasModuleSideEffects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImportedIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importedIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEntry(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEntry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsExternal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExternal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

