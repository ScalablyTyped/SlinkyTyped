package typingsSlinky.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metro List Response
  */
@js.native
trait SchemaMetrosListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#metrosListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Metro collection.
    */
  var metros: js.UndefOr[js.Array[SchemaMetro]] = js.native
}

object SchemaMetrosListResponse {
  @scala.inline
  def apply(): SchemaMetrosListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetrosListResponse]
  }
  @scala.inline
  implicit class SchemaMetrosListResponseOps[Self <: SchemaMetrosListResponse] (val x: Self) extends AnyVal {
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
    def withMetros(value: js.Array[SchemaMetro]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metros")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetros: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metros")(js.undefined)
        ret
    }
  }
  
}

