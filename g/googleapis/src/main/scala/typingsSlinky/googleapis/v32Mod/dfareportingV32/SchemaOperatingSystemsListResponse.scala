package typingsSlinky.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Operating System List Response
  */
@js.native
trait SchemaOperatingSystemsListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#operatingSystemsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Operating system collection.
    */
  var operatingSystems: js.UndefOr[js.Array[SchemaOperatingSystem]] = js.native
}

object SchemaOperatingSystemsListResponse {
  @scala.inline
  def apply(): SchemaOperatingSystemsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperatingSystemsListResponse]
  }
  @scala.inline
  implicit class SchemaOperatingSystemsListResponseOps[Self <: SchemaOperatingSystemsListResponse] (val x: Self) extends AnyVal {
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
    def withOperatingSystems(value: js.Array[SchemaOperatingSystem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatingSystems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperatingSystems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatingSystems")(js.undefined)
        ret
    }
  }
  
}

