package typingsSlinky.jupyterlabCoreutils.statedbMod.StateDB

import typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.cancel
import typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.clear
import typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.merge
import typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.overwrite
import typingsSlinky.phosphorCoreutils.jsonMod.ReadonlyJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A data transformation that can be applied to a state database.
  */
@js.native
trait DataTransform extends js.Object {
  /**
    * The contents of the change operation.
    */
  var contents: ReadonlyJSONObject | Null = js.native
  var `type`: cancel | clear | merge | overwrite = js.native
}

object DataTransform {
  @scala.inline
  def apply(`type`: cancel | clear | merge | overwrite): DataTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTransform]
  }
  @scala.inline
  implicit class DataTransformOps[Self <: DataTransform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: cancel | clear | merge | overwrite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContents(value: ReadonlyJSONObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contents")(null)
        ret
    }
  }
  
}

