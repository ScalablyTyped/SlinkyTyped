package typingsSlinky.meteorPublishComposite

import typingsSlinky.meteor.Mongo.Cursor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishCompositeConfig4[InLevel1, InLevel2, InLevel3, InLevel4, OutLevel] extends js.Object {
  var children: js.UndefOr[js.Array[PublishCompositeConfigN]] = js.native
  var collectionName: js.UndefOr[String] = js.native
  def find(arg4: InLevel4, arg3: InLevel3, arg2: InLevel2, arg1: InLevel1): Cursor[OutLevel] = js.native
}

object PublishCompositeConfig4 {
  @scala.inline
  def apply[InLevel1, InLevel2, InLevel3, InLevel4, OutLevel](find: (InLevel4, InLevel3, InLevel2, InLevel1) => Cursor[OutLevel]): PublishCompositeConfig4[InLevel1, InLevel2, InLevel3, InLevel4, OutLevel] = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction4(find))
    __obj.asInstanceOf[PublishCompositeConfig4[InLevel1, InLevel2, InLevel3, InLevel4, OutLevel]]
  }
  @scala.inline
  implicit class PublishCompositeConfig4Ops[Self[inlevel1, inlevel2, inlevel3, inlevel4, outlevel] <: PublishCompositeConfig4[inlevel1, inlevel2, inlevel3, inlevel4, outlevel], InLevel1, InLevel2, InLevel3, InLevel4, OutLevel] (val x: Self[InLevel1, InLevel2, InLevel3, InLevel4, OutLevel]) extends AnyVal {
    @scala.inline
    def duplicate: Self[InLevel1, InLevel2, InLevel3, InLevel4, OutLevel] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[InLevel1, InLevel2, InLevel3, InLevel4, OutLevel]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[InLevel1, InLevel2, InLevel3, InLevel4, OutLevel]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[InLevel1, InLevel2, InLevel3, InLevel4, OutLevel]) with Other]
    @scala.inline
    def withFind(value: (InLevel4, InLevel3, InLevel2, InLevel1) => Cursor[OutLevel]): Self[InLevel1, InLevel2, InLevel3, InLevel4, OutLevel] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("find")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withChildren(value: js.Array[PublishCompositeConfigN]): Self[InLevel1, InLevel2, InLevel3, InLevel4, OutLevel] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self[InLevel1, InLevel2, InLevel3, InLevel4, OutLevel] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withCollectionName(value: String): Self[InLevel1, InLevel2, InLevel3, InLevel4, OutLevel] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectionName: Self[InLevel1, InLevel2, InLevel3, InLevel4, OutLevel] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionName")(js.undefined)
        ret
    }
  }
  
}

