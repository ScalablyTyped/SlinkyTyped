package typingsSlinky.jestDashHasteDashMap

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.atJestTypes.buildConfigMod.Path
import typingsSlinky.jestDashHasteDashMap.buildModuleMapMod.ModuleMap
import typingsSlinky.jestDashHasteDashMap.buildModuleMapMod.SerializableModuleMap
import typingsSlinky.jestDashHasteDashMap.buildModuleMapMod.default
import typingsSlinky.jestDashHasteDashMap.buildTypesMod.RawModuleMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassHasteModuleMap extends Instantiable1[/* raw */ RawModuleMap, default] {
  var mapFromArrayRecursive: js.Any = js.native
  var mapToArrayRecursive: js.Any = js.native
  def create(rootDir: Path): ModuleMap = js.native
  def fromJSON(serializableModuleMap: SerializableModuleMap): ModuleMap = js.native
}

