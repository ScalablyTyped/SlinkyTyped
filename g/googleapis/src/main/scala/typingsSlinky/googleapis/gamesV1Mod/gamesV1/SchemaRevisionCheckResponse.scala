package typingsSlinky.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for the result of checking a revision.
  */
@js.native
trait SchemaRevisionCheckResponse extends js.Object {
  /**
    * The version of the API this client revision should use when calling API
    * methods.
    */
  var apiVersion: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#revisionCheckResponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The result of the revision check. Possible values are:   - &quot;OK&quot;
    * - The revision being used is current.  - &quot;DEPRECATED&quot; - There
    * is currently a newer version available, but the revision being used still
    * works.  - &quot;INVALID&quot; - The revision being used is not supported
    * in any released version.
    */
  var revisionStatus: js.UndefOr[String] = js.native
}

object SchemaRevisionCheckResponse {
  @scala.inline
  def apply(): SchemaRevisionCheckResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRevisionCheckResponse]
  }
  @scala.inline
  implicit class SchemaRevisionCheckResponseOps[Self <: SchemaRevisionCheckResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(js.undefined)
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
    @scala.inline
    def withRevisionStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevisionStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionStatus")(js.undefined)
        ret
    }
  }
  
}

