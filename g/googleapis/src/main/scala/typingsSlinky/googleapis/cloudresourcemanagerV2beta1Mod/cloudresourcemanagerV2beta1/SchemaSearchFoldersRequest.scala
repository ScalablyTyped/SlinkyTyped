package typingsSlinky.googleapis.cloudresourcemanagerV2beta1Mod.cloudresourcemanagerV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request message for searching folders.
  */
@js.native
trait SchemaSearchFoldersRequest extends js.Object {
  /**
    * The maximum number of folders to return in the response. This field is
    * optional.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A pagination token returned from a previous call to `SearchFolders` that
    * indicates from where search should continue. This field is optional.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Search criteria used to select the Folders to return. If no search
    * criteria is specified then all accessible folders will be returned. Query
    * expressions can be used to restrict results based upon displayName,
    * lifecycleState and parent, where the operators `=`, `NOT`, `AND` and `OR`
    * can be used along with the suffix wildcard symbol `*`.  The displayName
    * field in a query expression should use escaped quotes for values that
    * include whitespace to prevent unexpected behavior.  Some example queries
    * are:  |Query | Description| |----- | -----------| |displayName=Test* |
    * Folders whose display name starts with &quot;Test&quot;.|
    * |lifecycleState=ACTIVE | Folders whose lifecycleState is ACTIVE.|
    * |parent=folders/123 | Folders whose parent is &quot;folders/123&quot;.|
    * |parent=folders/123 AND lifecycleState=ACTIVE | Active folders whose
    * parent is &quot;folders/123&quot;.| |displayName=\\&quot;Test
    * String\\&quot;|Folders whose display name includes both &quot;Test&quot;
    * and &quot;String&quot;.|
    */
  var query: js.UndefOr[String] = js.native
}

object SchemaSearchFoldersRequest {
  @scala.inline
  def apply(): SchemaSearchFoldersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchFoldersRequest]
  }
  @scala.inline
  implicit class SchemaSearchFoldersRequestOps[Self <: SchemaSearchFoldersRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
  }
  
}

