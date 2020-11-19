package typingsSlinky.inversify

import typingsSlinky.inversify.interfacesMod.interfaces.MetadataReader
import typingsSlinky.inversify.interfacesMod.interfaces.Target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("inversify/dts/planning/reflection_utils", JSImport.Namespace)
@js.native
object reflectionUtilsMod extends js.Object {
  
  def getBaseClassDependencyCount(metadataReader: MetadataReader, func: js.Function): Double = js.native
  
  def getDependencies(metadataReader: MetadataReader, func: js.Function): js.Array[Target] = js.native
  
  def getFunctionName(v: js.Any): String = js.native
}
