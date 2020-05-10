package typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoreCluster extends js.Object {
  /** Unique ID of this cluster. Assigned by the server. Immutable once assigned. */
  var id: js.UndefOr[String] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#storeCluster". */
  var kind: js.UndefOr[String] = js.native
  /**
    * Ordered list of localized strings giving the name of this page. The text displayed is the one that best matches the user locale, or the first entry if
    * there is no good match. There needs to be at least one entry.
    */
  var name: js.UndefOr[js.Array[LocalizedText]] = js.native
  /**
    * String (US-ASCII only) used to determine order of this cluster within the parent page's elements. Page elements are sorted in lexicographic order of
    * this field. Duplicated values are allowed, but ordering between elements with duplicate order is undefined.
    *
    * The value of this field is never visible to a user, it is used solely for the purpose of defining an ordering. Maximum length is 256 characters.
    */
  var orderInPage: js.UndefOr[String] = js.native
  /** List of products in the order they are displayed in the cluster. There should not be duplicates within a cluster. */
  var productId: js.UndefOr[js.Array[String]] = js.native
}

object StoreCluster {
  @scala.inline
  def apply(): StoreCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoreCluster]
  }
  @scala.inline
  implicit class StoreClusterOps[Self <: StoreCluster] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
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
    def withName(value: js.Array[LocalizedText]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderInPage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderInPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderInPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderInPage")(js.undefined)
        ret
    }
    @scala.inline
    def withProductId(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(js.undefined)
        ret
    }
  }
  
}

