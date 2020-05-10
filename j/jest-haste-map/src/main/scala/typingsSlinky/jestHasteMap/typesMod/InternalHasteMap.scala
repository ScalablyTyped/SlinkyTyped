package typingsSlinky.jestHasteMap.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InternalHasteMap extends js.Object {
  var clocks: WatchmanClocks = js.native
  var duplicates: DuplicatesIndex = js.native
  var files: FileData = js.native
  var map: ModuleMapData = js.native
  var mocks: MockData = js.native
}

object InternalHasteMap {
  @scala.inline
  def apply(
    clocks: WatchmanClocks,
    duplicates: DuplicatesIndex,
    files: FileData,
    map: ModuleMapData,
    mocks: MockData
  ): InternalHasteMap = {
    val __obj = js.Dynamic.literal(clocks = clocks.asInstanceOf[js.Any], duplicates = duplicates.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], mocks = mocks.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalHasteMap]
  }
  @scala.inline
  implicit class InternalHasteMapOps[Self <: InternalHasteMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClocks(value: WatchmanClocks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuplicates(value: DuplicatesIndex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFiles(value: FileData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
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
  }
  
}

