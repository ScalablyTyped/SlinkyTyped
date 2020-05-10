package typingsSlinky.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEntityCollectionChangedEventArgs extends js.Object {
  /** The entity collection the event was triggered from. */
  var collection: EntityCollection = js.native
  /** The IPrimitive object that the event occurred for. */
  var data: IPrimitive = js.native
}

object IEntityCollectionChangedEventArgs {
  @scala.inline
  def apply(collection: EntityCollection, data: IPrimitive): IEntityCollectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntityCollectionChangedEventArgs]
  }
  @scala.inline
  implicit class IEntityCollectionChangedEventArgsOps[Self <: IEntityCollectionChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollection(value: EntityCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: IPrimitive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

