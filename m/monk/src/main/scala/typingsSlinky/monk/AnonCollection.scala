package typingsSlinky.monk

import typingsSlinky.monk.mod.ICollection
import typingsSlinky.monk.mod.IMonkManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCollection extends js.Object {
  var collection: ICollection[_] = js.native
  var monkInstance: IMonkManager = js.native
}

object AnonCollection {
  @scala.inline
  def apply(collection: ICollection[_], monkInstance: IMonkManager): AnonCollection = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], monkInstance = monkInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCollection]
  }
  @scala.inline
  implicit class AnonCollectionOps[Self <: AnonCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollection(value: ICollection[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonkInstance(value: IMonkManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monkInstance")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

