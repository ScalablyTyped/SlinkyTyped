package typingsSlinky.dexie.mod.Dexie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexSpec extends js.Object {
  var auto: Boolean = js.native
  var compound: Boolean = js.native
  var keyPath: String | js.Array[String] = js.native
  var multi: Boolean = js.native
  var name: String = js.native
  var src: String = js.native
  var unique: Boolean = js.native
}

object IndexSpec {
  @scala.inline
  def apply(
    auto: Boolean,
    compound: Boolean,
    keyPath: String | js.Array[String],
    multi: Boolean,
    name: String,
    src: String,
    unique: Boolean
  ): IndexSpec = {
    val __obj = js.Dynamic.literal(auto = auto.asInstanceOf[js.Any], compound = compound.asInstanceOf[js.Any], keyPath = keyPath.asInstanceOf[js.Any], multi = multi.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], unique = unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexSpec]
  }
  @scala.inline
  implicit class IndexSpecOps[Self <: IndexSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuto(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompound(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyPath(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMulti(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnique(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unique")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

