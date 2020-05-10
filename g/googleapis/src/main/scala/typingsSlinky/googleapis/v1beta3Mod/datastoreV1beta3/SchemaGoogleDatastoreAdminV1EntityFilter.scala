package typingsSlinky.googleapis.v1beta3Mod.datastoreV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Identifies a subset of entities in a project. This is specified as
  * combinations of kinds and namespaces (either or both of which may be all,
  * as described in the following examples). Example usage:  Entire project:
  * kinds=[], namespace_ids=[]  Kinds Foo and Bar in all namespaces:
  * kinds=[&#39;Foo&#39;, &#39;Bar&#39;], namespace_ids=[]  Kinds Foo and Bar
  * only in the default namespace:   kinds=[&#39;Foo&#39;, &#39;Bar&#39;],
  * namespace_ids=[&#39;&#39;]  Kinds Foo and Bar in both the default and Baz
  * namespaces:   kinds=[&#39;Foo&#39;, &#39;Bar&#39;],
  * namespace_ids=[&#39;&#39;, &#39;Baz&#39;]  The entire Baz namespace:
  * kinds=[], namespace_ids=[&#39;Baz&#39;]
  */
@js.native
trait SchemaGoogleDatastoreAdminV1EntityFilter extends js.Object {
  /**
    * If empty, then this represents all kinds.
    */
  var kinds: js.UndefOr[js.Array[String]] = js.native
  /**
    * An empty list represents all namespaces. This is the preferred usage for
    * projects that don&#39;t use namespaces.  An empty string element
    * represents the default namespace. This should be used if the project has
    * data in non-default namespaces, but doesn&#39;t want to include them.
    * Each namespace in this list must be unique.
    */
  var namespaceIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaGoogleDatastoreAdminV1EntityFilter {
  @scala.inline
  def apply(): SchemaGoogleDatastoreAdminV1EntityFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDatastoreAdminV1EntityFilter]
  }
  @scala.inline
  implicit class SchemaGoogleDatastoreAdminV1EntityFilterOps[Self <: SchemaGoogleDatastoreAdminV1EntityFilter] (val x: Self) extends AnyVal {
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

