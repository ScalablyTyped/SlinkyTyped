package typingsSlinky.jsonSchemaTraverse.anon

import typingsSlinky.jsonSchemaTraverse.mod.TraverseCallback
import typingsSlinky.jsonSchemaTraverse.mod.TraverseCallbackDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Post extends TraverseCallback {
  var post: js.UndefOr[TraverseCallbackDef] = js.native
  var pre: js.UndefOr[TraverseCallbackDef] = js.native
}

object Post {
  @scala.inline
  def apply(): Post = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Post]
  }
  @scala.inline
  implicit class PostOps[Self <: Post] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPost(
      value: (/* schema */ js.Object, /* jsonPtr */ String, /* rootSchema */ js.Object, /* parentJsonPtr */ String, /* parentKeyword */ String, /* parentSchema */ js.Object, /* keyIndex */ String | Double) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post")(js.Any.fromFunction7(value))
        ret
    }
    @scala.inline
    def withoutPost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post")(js.undefined)
        ret
    }
    @scala.inline
    def withPre(
      value: (/* schema */ js.Object, /* jsonPtr */ String, /* rootSchema */ js.Object, /* parentJsonPtr */ String, /* parentKeyword */ String, /* parentSchema */ js.Object, /* keyIndex */ String | Double) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pre")(js.Any.fromFunction7(value))
        ret
    }
    @scala.inline
    def withoutPre: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pre")(js.undefined)
        ret
    }
  }
  
}

