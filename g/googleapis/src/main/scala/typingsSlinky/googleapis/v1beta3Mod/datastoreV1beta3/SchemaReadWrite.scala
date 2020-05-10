package typingsSlinky.googleapis.v1beta3Mod.datastoreV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options specific to read / write transactions.
  */
@js.native
trait SchemaReadWrite extends js.Object {
  /**
    * The transaction identifier of the transaction being retried.
    */
  var previousTransaction: js.UndefOr[String] = js.native
}

object SchemaReadWrite {
  @scala.inline
  def apply(): SchemaReadWrite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReadWrite]
  }
  @scala.inline
  implicit class SchemaReadWriteOps[Self <: SchemaReadWrite] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreviousTransaction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousTransaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousTransaction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousTransaction")(js.undefined)
        ret
    }
  }
  
}

