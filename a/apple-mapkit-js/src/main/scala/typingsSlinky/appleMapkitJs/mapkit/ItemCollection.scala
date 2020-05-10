package typingsSlinky.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A tree structure containing annotations, overlays, and nested item
  * collection objects.
  */
@js.native
trait ItemCollection extends js.Object {
  /**
    * The raw GeoJSON data.
    */
  var data: js.Object = js.native
  /**
    * A flattened array of items that include annotations or overlays.
    */
  var getFlattenedItemList: js.Array[Annotation | Overlay] = js.native
  /**
    * A nested list of annotations, overlays, or other item collections.
    */
  var items: js.Array[Annotation | Overlay | ItemCollection] = js.native
}

object ItemCollection {
  @scala.inline
  def apply(
    data: js.Object,
    getFlattenedItemList: js.Array[Annotation | Overlay],
    items: js.Array[Annotation | Overlay | ItemCollection]
  ): ItemCollection = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], getFlattenedItemList = getFlattenedItemList.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemCollection]
  }
  @scala.inline
  implicit class ItemCollectionOps[Self <: ItemCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetFlattenedItemList(value: js.Array[Annotation | Overlay]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFlattenedItemList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[Annotation | Overlay | ItemCollection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

