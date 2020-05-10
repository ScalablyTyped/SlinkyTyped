package typingsSlinky.gapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionSelector extends js.Object {
  /**
    * When false, selects only collections that are immediate children of
    * the `parent` specified in the containing `RunQueryRequest`.
    * When true, selects all descendant collections.
    */
  var allDescendants: js.UndefOr[Boolean] = js.native
  /**
    * The collection ID.
    * When set, selects only collections with this ID.
    */
  var collectionId: js.UndefOr[String] = js.native
}

object CollectionSelector {
  @scala.inline
  def apply(): CollectionSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionSelector]
  }
  @scala.inline
  implicit class CollectionSelectorOps[Self <: CollectionSelector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllDescendants(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allDescendants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllDescendants: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allDescendants")(js.undefined)
        ret
    }
    @scala.inline
    def withCollectionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionId")(js.undefined)
        ret
    }
  }
  
}

