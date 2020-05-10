package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The collection of fields that make up a displayed line
  */
@js.native
trait SchemaResultDisplayLine extends js.Object {
  var fields: js.UndefOr[js.Array[SchemaResultDisplayField]] = js.native
}

object SchemaResultDisplayLine {
  @scala.inline
  def apply(): SchemaResultDisplayLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResultDisplayLine]
  }
  @scala.inline
  implicit class SchemaResultDisplayLineOps[Self <: SchemaResultDisplayLine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFields(value: js.Array[SchemaResultDisplayField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
  }
  
}

