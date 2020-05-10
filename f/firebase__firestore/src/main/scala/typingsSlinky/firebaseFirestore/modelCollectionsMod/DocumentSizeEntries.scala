package typingsSlinky.firebaseFirestore.modelCollectionsMod

import typingsSlinky.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import typingsSlinky.firebaseFirestore.utilSortedMapMod.SortedMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentSizeEntries extends js.Object {
  var maybeDocuments: NullableMaybeDocumentMap_ = js.native
  var sizeMap: SortedMap[DocumentKey, Double] = js.native
}

object DocumentSizeEntries {
  @scala.inline
  def apply(maybeDocuments: NullableMaybeDocumentMap_, sizeMap: SortedMap[DocumentKey, Double]): DocumentSizeEntries = {
    val __obj = js.Dynamic.literal(maybeDocuments = maybeDocuments.asInstanceOf[js.Any], sizeMap = sizeMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentSizeEntries]
  }
  @scala.inline
  implicit class DocumentSizeEntriesOps[Self <: DocumentSizeEntries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaybeDocuments(value: NullableMaybeDocumentMap_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maybeDocuments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSizeMap(value: SortedMap[DocumentKey, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeMap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

