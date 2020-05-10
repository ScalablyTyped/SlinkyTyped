package typingsSlinky.meteorPublishComposite

import typingsSlinky.meteor.Mongo.Cursor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishCompositeConfig2[InLevel1, InLevel2, OutLevel] extends js.Object {
  var children: js.UndefOr[js.Array[PublishCompositeConfig3[InLevel1, InLevel2, OutLevel, _]]] = js.native
  var collectionName: js.UndefOr[String] = js.native
  def find(arg2: InLevel2, arg1: InLevel1): Cursor[OutLevel] = js.native
}

object PublishCompositeConfig2 {
  @scala.inline
  def apply[InLevel1, InLevel2, OutLevel](find: (InLevel2, InLevel1) => Cursor[OutLevel]): PublishCompositeConfig2[InLevel1, InLevel2, OutLevel] = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction2(find))
    __obj.asInstanceOf[PublishCompositeConfig2[InLevel1, InLevel2, OutLevel]]
  }
  @scala.inline
  implicit class PublishCompositeConfig2Ops[Self[inlevel1, inlevel2, outlevel] <: PublishCompositeConfig2[inlevel1, inlevel2, outlevel], InLevel1, InLevel2, OutLevel] (val x: Self[InLevel1, InLevel2, OutLevel]) extends AnyVal {
    @scala.inline
    def duplicate: Self[InLevel1, InLevel2, OutLevel] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[InLevel1, InLevel2, OutLevel]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[InLevel1, InLevel2, OutLevel]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[InLevel1, InLevel2, OutLevel]) with Other]
    @scala.inline
    def withFind(value: (InLevel2, InLevel1) => Cursor[OutLevel]): Self[InLevel1, InLevel2, OutLevel] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("find")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withChildren(value: js.Array[PublishCompositeConfig3[InLevel1, InLevel2, OutLevel, _]]): Self[InLevel1, InLevel2, OutLevel] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self[InLevel1, InLevel2, OutLevel] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withCollectionName(value: String): Self[InLevel1, InLevel2, OutLevel] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectionName: Self[InLevel1, InLevel2, OutLevel] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionName")(js.undefined)
        ret
    }
  }
  
}

