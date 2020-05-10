package typingsSlinky.clearbladejsServer.CbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionOptionsWithName extends js.Object {
  var collectionName: String = js.native
}

object CollectionOptionsWithName {
  @scala.inline
  def apply(collectionName: String): CollectionOptionsWithName = {
    val __obj = js.Dynamic.literal(collectionName = collectionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionOptionsWithName]
  }
  @scala.inline
  implicit class CollectionOptionsWithNameOps[Self <: CollectionOptionsWithName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollectionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

