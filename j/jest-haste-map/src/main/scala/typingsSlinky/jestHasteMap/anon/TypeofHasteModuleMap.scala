package typingsSlinky.jestHasteMap.anon

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.jestHasteMap.moduleMapMod.ModuleMap
import typingsSlinky.jestHasteMap.moduleMapMod.SerializableModuleMap
import typingsSlinky.jestHasteMap.moduleMapMod.default
import typingsSlinky.jestHasteMap.typesMod.RawModuleMap
import typingsSlinky.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofHasteModuleMap extends Instantiable1[/* raw */ RawModuleMap, default] {
  
  def create(rootDir: Path): ModuleMap = js.native
  
  def fromJSON(serializableModuleMap: SerializableModuleMap): ModuleMap = js.native
  
  var mapFromArrayRecursive: js.Any = js.native
  
  var mapToArrayRecursive: js.Any = js.native
}
