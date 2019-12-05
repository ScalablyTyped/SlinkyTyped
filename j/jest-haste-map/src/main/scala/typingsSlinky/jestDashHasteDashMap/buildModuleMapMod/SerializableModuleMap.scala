package typingsSlinky.jestDashHasteDashMap.buildModuleMapMod

import typingsSlinky.atJestTypes.buildConfigMod.Path
import typingsSlinky.jestDashHasteDashMap.buildTypesMod.MockData
import typingsSlinky.jestDashHasteDashMap.buildTypesMod.ModuleMapData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializableModuleMap extends js.Object {
  var duplicates: js.Array[
    js.Tuple2[String, js.Tuple2[String, js.Tuple2[String, js.Tuple2[String, Double]]]]
  ]
  var map: js.Array[js.Tuple2[String, ValueType[ModuleMapData]]]
  var mocks: js.Array[js.Tuple2[String, ValueType[MockData]]]
  var rootDir: Path
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
}

