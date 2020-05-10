package typingsSlinky.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevisionCheckResponse extends js.Object {
  /** The version of the API this client revision should use when calling API methods. */
  var apiVersion: js.UndefOr[String] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#revisionCheckResponse. */
  var kind: js.UndefOr[String] = js.native
  /**
    * The result of the revision check.
    * Possible values are:
    * - "OK" - The revision being used is current.
    * - "DEPRECATED" - There is currently a newer version available, but the revision being used still works.
    * - "INVALID" - The revision being used is not supported in any released version.
    */
  var revisionStatus: js.UndefOr[String] = js.native
}

object RevisionCheckResponse {
  @scala.inline
  def apply(): RevisionCheckResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevisionCheckResponse]
  }
  @scala.inline
  implicit class RevisionCheckResponseOps[Self <: RevisionCheckResponse] (val x: Self) extends AnyVal {
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

