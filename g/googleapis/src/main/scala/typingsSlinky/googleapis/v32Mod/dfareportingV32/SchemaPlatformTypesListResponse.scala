package typingsSlinky.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Platform Type List Response
  */
@js.native
trait SchemaPlatformTypesListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#platformTypesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Platform type collection.
    */
  var platformTypes: js.UndefOr[js.Array[SchemaPlatformType]] = js.native
}

object SchemaPlatformTypesListResponse {
  @scala.inline
  def apply(): SchemaPlatformTypesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlatformTypesListResponse]
  }
  @scala.inline
  implicit class SchemaPlatformTypesListResponseOps[Self <: SchemaPlatformTypesListResponse] (val x: Self) extends AnyVal {
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
    def withPlatformTypes(value: js.Array[SchemaPlatformType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformTypes")(js.undefined)
        ret
    }
  }
  
}

