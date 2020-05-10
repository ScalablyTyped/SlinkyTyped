package typingsSlinky.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object was created by copying an existing object.
  */
@js.native
trait SchemaCopy extends js.Object {
  /**
    * The the original object.
    */
  var originalObject: js.UndefOr[SchemaTargetReference] = js.native
}

object SchemaCopy {
  @scala.inline
  def apply(): SchemaCopy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCopy]
  }
  @scala.inline
  implicit class SchemaCopyOps[Self <: SchemaCopy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOriginalObject(value: SchemaTargetReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalObject")(js.undefined)
        ret
    }
  }
  
}

