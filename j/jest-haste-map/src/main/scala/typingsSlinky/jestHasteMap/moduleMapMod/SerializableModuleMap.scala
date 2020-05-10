package typingsSlinky.jestHasteMap.moduleMapMod

import typingsSlinky.jestHasteMap.typesMod.MockData
import typingsSlinky.jestHasteMap.typesMod.ModuleMapData
import typingsSlinky.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerializableModuleMap extends js.Object {
  var duplicates: js.Array[
    js.Tuple2[String, js.Tuple2[String, js.Tuple2[String, js.Tuple2[String, Double]]]]
  ] = js.native
  var map: js.Array[js.Tuple2[String, ValueType[ModuleMapData]]] = js.native
  var mocks: js.Array[js.Tuple2[String, ValueType[MockData]]] = js.native
  var rootDir: Path = js.native
}

object SerializableModuleMap {
  @scala.inline
  def apply(
    duplicates: js.Array[
      js.Tuple2[String, js.Tuple2[String, js.Tuple2[String, js.Tuple2[String, Double]]]]
    ],
    map: js.Array[js.Tuple2[String, ValueType[ModuleMapData]]],
    mocks: js.Array[js.Tuple2[String, ValueType[MockData]]],
    rootDir: Path
  ): SerializableModuleMap = {
    val __obj = js.Dynamic.literal(duplicates = duplicates.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], mocks = mocks.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializableModuleMap]
  }
  @scala.inline
  implicit class SerializableModuleMapOps[Self <: SerializableModuleMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuplicates(
      value: js.Array[
          js.Tuple2[String, js.Tuple2[String, js.Tuple2[String, js.Tuple2[String, Double]]]]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMap(value: js.Array[js.Tuple2[String, ValueType[ModuleMapData]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMocks(value: js.Array[js.Tuple2[String, ValueType[MockData]]]): Self = {
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

