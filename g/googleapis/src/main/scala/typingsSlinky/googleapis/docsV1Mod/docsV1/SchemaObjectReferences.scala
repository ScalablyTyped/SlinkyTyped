package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A collection of object IDs.
  */
@js.native
trait SchemaObjectReferences extends js.Object {
  /**
    * The object IDs.
    */
  var objectIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaObjectReferences {
  @scala.inline
  def apply(): SchemaObjectReferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObjectReferences]
  }
  @scala.inline
  implicit class SchemaObjectReferencesOps[Self <: SchemaObjectReferences] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObjectIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectIds")(js.undefined)
        ret
    }
  }
  
}

