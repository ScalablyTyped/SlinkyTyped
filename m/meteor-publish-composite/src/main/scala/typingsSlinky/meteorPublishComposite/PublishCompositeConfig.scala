package typingsSlinky.meteorPublishComposite

import typingsSlinky.meteor.Mongo.Cursor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishCompositeConfig[OutLevel] extends js.Object {
  var children: js.UndefOr[js.Array[PublishCompositeConfig1[OutLevel, _]]] = js.native
  var collectionName: js.UndefOr[String] = js.native
  def find(): Cursor[OutLevel] = js.native
}

object PublishCompositeConfig {
  @scala.inline
  def apply[OutLevel](find: () => Cursor[OutLevel]): PublishCompositeConfig[OutLevel] = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction0(find))
    __obj.asInstanceOf[PublishCompositeConfig[OutLevel]]
  }
  @scala.inline
  implicit class PublishCompositeConfigOps[Self[outlevel] <: PublishCompositeConfig[outlevel], OutLevel] (val x: Self[OutLevel]) extends AnyVal {
    @scala.inline
    def duplicate: Self[OutLevel] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[OutLevel]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[OutLevel] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[OutLevel] with Other]
    @scala.inline
    def withFind(value: () => Cursor[OutLevel]): Self[OutLevel] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("find")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withChildren(value: js.Array[PublishCompositeConfig1[OutLevel, _]]): Self[OutLevel] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self[OutLevel] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withCollectionName(value: String): Self[OutLevel] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectionName: Self[OutLevel] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionName")(js.undefined)
        ret
    }
  }
  
}

