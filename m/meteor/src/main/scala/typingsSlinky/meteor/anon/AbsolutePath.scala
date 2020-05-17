package typingsSlinky.meteor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbsolutePath extends js.Object {
  var absolutePath: String = js.native
  var cacheable: Boolean = js.native
  var content: js.UndefOr[String] = js.native
  var hash: String = js.native
  var sourceMapUrl: js.UndefOr[String] = js.native
  var `type`: String = js.native
}

object AbsolutePath {
  @scala.inline
  def apply(absolutePath: String, cacheable: Boolean, hash: String, `type`: String): AbsolutePath = {
    val __obj = js.Dynamic.literal(absolutePath = absolutePath.asInstanceOf[js.Any], cacheable = cacheable.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbsolutePath]
  }
  @scala.inline
  implicit class AbsolutePathOps[Self <: AbsolutePath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbsolutePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absolutePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCacheable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceMapUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceMapUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceMapUrl")(js.undefined)
        ret
    }
  }
  
}

