package typingsSlinky.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Connection Type List Response
  */
@js.native
trait SchemaConnectionTypesListResponse extends js.Object {
  /**
    * Collection of connection types such as broadband and mobile.
    */
  var connectionTypes: js.UndefOr[js.Array[SchemaConnectionType]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#connectionTypesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaConnectionTypesListResponse {
  @scala.inline
  def apply(): SchemaConnectionTypesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConnectionTypesListResponse]
  }
  @scala.inline
  implicit class SchemaConnectionTypesListResponseOps[Self <: SchemaConnectionTypesListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionTypes(value: js.Array[SchemaConnectionType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionTypes")(js.undefined)
        ret
    }
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
  }
  
}

