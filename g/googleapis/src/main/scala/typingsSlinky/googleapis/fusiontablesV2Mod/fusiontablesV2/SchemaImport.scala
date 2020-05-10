package typingsSlinky.googleapis.fusiontablesV2Mod.fusiontablesV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an import request.
  */
@js.native
trait SchemaImport extends js.Object {
  /**
    * The kind of item this is. For an import, this is always
    * fusiontables#import.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The number of rows received from the import request.
    */
  var numRowsReceived: js.UndefOr[String] = js.native
}

object SchemaImport {
  @scala.inline
  def apply(): SchemaImport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImport]
  }
  @scala.inline
  implicit class SchemaImportOps[Self <: SchemaImport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withNumRowsReceived(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numRowsReceived")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumRowsReceived: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numRowsReceived")(js.undefined)
        ret
    }
  }
  
}

