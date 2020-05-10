package typingsSlinky.gapiClientDatastore.gapi.client.datastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleDatastoreAdminV1beta1EntityFilter extends js.Object {
  /** If empty, then this represents all kinds. */
  var kinds: js.UndefOr[js.Array[String]] = js.native
  /**
    * An empty list represents all namespaces. This is the preferred
    * usage for projects that don't use namespaces.
    *
    * An empty string element represents the default namespace. This should be
    * used if the project has data in non-default namespaces, but doesn't want to
    * include them.
    * Each namespace in this list must be unique.
    */
  var namespaceIds: js.UndefOr[js.Array[String]] = js.native
}

object GoogleDatastoreAdminV1beta1EntityFilter {
  @scala.inline
  def apply(): GoogleDatastoreAdminV1beta1EntityFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDatastoreAdminV1beta1EntityFilter]
  }
  @scala.inline
  implicit class GoogleDatastoreAdminV1beta1EntityFilterOps[Self <: GoogleDatastoreAdminV1beta1EntityFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKinds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kinds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKinds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kinds")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespaceIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespaceIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceIds")(js.undefined)
        ret
    }
  }
  
}

