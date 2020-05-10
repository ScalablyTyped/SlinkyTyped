package typingsSlinky.meteorPublishComposite

import typingsSlinky.meteor.Mongo.Cursor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishCompositeConfig1[InLevel1, OutLevel] extends js.Object {
  var children: js.UndefOr[js.Array[PublishCompositeConfig2[InLevel1, OutLevel, _]]] = js.native
  var collectionName: js.UndefOr[String] = js.native
  def find(arg1: InLevel1): Cursor[OutLevel] = js.native
}

object PublishCompositeConfig1 {
  @scala.inline
  def apply[InLevel1, OutLevel](find: InLevel1 => Cursor[OutLevel]): PublishCompositeConfig1[InLevel1, OutLevel] = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find))
    __obj.asInstanceOf[PublishCompositeConfig1[InLevel1, OutLevel]]
  }
  @scala.inline
  implicit class PublishCompositeConfig1Ops[Self[inlevel1, outlevel] <: PublishCompositeConfig1[inlevel1, outlevel], InLevel1, OutLevel] (val x: Self[InLevel1, OutLevel]) extends AnyVal {
    @scala.inline
    def duplicate: Self[InLevel1, OutLevel] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[InLevel1, OutLevel]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[InLevel1, OutLevel]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[InLevel1, OutLevel]) with Other]
    @scala.inline
    def withFind(value: InLevel1 => Cursor[OutLevel]): Self[InLevel1, OutLevel] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("find")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withChildren(value: js.Array[PublishCompositeConfig2[InLevel1, OutLevel, _]]): Self[InLevel1, OutLevel] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self[InLevel1, OutLevel] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withCollectionName(value: String): Self[InLevel1, OutLevel] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectionName: Self[InLevel1, OutLevel] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionName")(js.undefined)
        ret
    }
  }
  
}

