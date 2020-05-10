package typingsSlinky.jestHasteMap.typesMod

import typingsSlinky.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RawModuleMap extends js.Object {
  var duplicates: DuplicatesIndex = js.native
  var map: ModuleMapData = js.native
  var mocks: MockData = js.native
  var rootDir: Path = js.native
}

object RawModuleMap {
  @scala.inline
  def apply(duplicates: DuplicatesIndex, map: ModuleMapData, mocks: MockData, rootDir: Path): RawModuleMap = {
    val __obj = js.Dynamic.literal(duplicates = duplicates.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], mocks = mocks.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawModuleMap]
  }
  @scala.inline
  implicit class RawModuleMapOps[Self <: RawModuleMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuplicates(value: DuplicatesIndex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMap(value: ModuleMapData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMocks(value: MockData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootDir(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDir")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

