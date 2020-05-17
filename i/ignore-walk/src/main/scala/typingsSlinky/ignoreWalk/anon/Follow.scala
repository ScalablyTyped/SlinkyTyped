package typingsSlinky.ignoreWalk.anon

import typingsSlinky.ignoreWalk.mod.Walker
import typingsSlinky.ignoreWalk.mod.WalkerSync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Follow extends js.Object {
  var follow: Boolean = js.native
  var ignoreFiles: js.Array[String] = js.native
  var includeEmpty: Boolean = js.native
  var parent: Walker | WalkerSync = js.native
  var path: String = js.native
}

object Follow {
  @scala.inline
  def apply(
    follow: Boolean,
    ignoreFiles: js.Array[String],
    includeEmpty: Boolean,
    parent: Walker | WalkerSync,
    path: String
  ): Follow = {
    val __obj = js.Dynamic.literal(follow = follow.asInstanceOf[js.Any], ignoreFiles = ignoreFiles.asInstanceOf[js.Any], includeEmpty = includeEmpty.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Follow]
  }
  @scala.inline
  implicit class FollowOps[Self <: Follow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFollow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("follow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnoreFiles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: Walker | WalkerSync): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

