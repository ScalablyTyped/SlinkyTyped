package typingsSlinky.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A selection of a collection, such as `messages as m1`.
  */
@js.native
trait SchemaCollectionSelector extends js.Object {
  /**
    * When false, selects only collections that are immediate children of the
    * `parent` specified in the containing `RunQueryRequest`. When true,
    * selects all descendant collections.
    */
  var allDescendants: js.UndefOr[Boolean] = js.native
  /**
    * The collection ID. When set, selects only collections with this ID.
    */
  var collectionId: js.UndefOr[String] = js.native
}

object SchemaCollectionSelector {
  @scala.inline
  def apply(): SchemaCollectionSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCollectionSelector]
  }
  @scala.inline
  implicit class SchemaCollectionSelectorOps[Self <: SchemaCollectionSelector] (val x: Self) extends AnyVal {
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

