package typingsSlinky.jestHasteMap.typesMod

import typingsSlinky.jestHasteMap.hasteFSMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HasteMap extends js.Object {
  var __hasteMapForTest: js.UndefOr[InternalHasteMap | Null] = js.native
  var hasteFS: default = js.native
  var moduleMap: typingsSlinky.jestHasteMap.moduleMapMod.default = js.native
}

object HasteMap {
  @scala.inline
  def apply(hasteFS: default, moduleMap: typingsSlinky.jestHasteMap.moduleMapMod.default): HasteMap = {
    val __obj = js.Dynamic.literal(hasteFS = hasteFS.asInstanceOf[js.Any], moduleMap = moduleMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasteMap]
  }
  @scala.inline
  implicit class HasteMapOps[Self <: HasteMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasteFS(value: default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasteFS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModuleMap(value: typingsSlinky.jestHasteMap.moduleMapMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with__hasteMapForTest(value: InternalHasteMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__hasteMapForTest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without__hasteMapForTest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__hasteMapForTest")(js.undefined)
        ret
    }
    @scala.inline
    def with__hasteMapForTestNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__hasteMapForTest")(null)
        ret
    }
  }
  
}

