package typingsSlinky.jestHasteMap.moduleMapMod

import org.scalablytyped.runtime.Instantiable4
import typingsSlinky.jestHasteMap.typesMod.DuplicatesSet
import typingsSlinky.jestHasteMap.typesMod.RawModuleMap
import typingsSlinky.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-haste-map/build/ModuleMap", JSImport.Default)
@js.native
class default protected () extends ModuleMap {
  def this(raw: RawModuleMap) = this()
}
/* static members */
@JSImport("jest-haste-map/build/ModuleMap", JSImport.Default)
@js.native
object default extends js.Object {
  
  var DuplicateHasteCandidatesError: Instantiable4[
    /* name */ String, 
    /* platform */ String, 
    /* supportsNativePlatform */ Boolean, 
    /* duplicatesSet */ DuplicatesSet, 
    typingsSlinky.jestHasteMap.moduleMapMod.DuplicateHasteCandidatesError
  ] = js.native
  
  def create(rootDir: Path): ModuleMap = js.native
  
  def fromJSON(serializableModuleMap: SerializableModuleMap): ModuleMap = js.native
  
  var mapFromArrayRecursive: js.Any = js.native
  
  var mapToArrayRecursive: js.Any = js.native
}
