package typingsSlinky.firebaseFirestore.localStoreMod

import typingsSlinky.firebaseFirestore.collectionsMod.DocumentKeySet_
import typingsSlinky.firebaseFirestore.collectionsMod.DocumentMap_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryResult extends js.Object {
  val documents: DocumentMap_ = js.native
  val remoteKeys: DocumentKeySet_ = js.native
}

object QueryResult {
  @scala.inline
  def apply(documents: DocumentMap_, remoteKeys: DocumentKeySet_): QueryResult = {
    val __obj = js.Dynamic.literal(documents = documents.asInstanceOf[js.Any], remoteKeys = remoteKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResult]
  }
  @scala.inline
  implicit class QueryResultOps[Self <: QueryResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocuments(value: DocumentMap_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoteKeys(value: DocumentKeySet_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteKeys")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

