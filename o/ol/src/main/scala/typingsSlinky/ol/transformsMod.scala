package typingsSlinky.ol

import typingsSlinky.ol.projMod.TransformFunction
import typingsSlinky.ol.projectionMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/proj/transforms", JSImport.Namespace)
@js.native
object transformsMod extends js.Object {
  
  def add(source: default, destination: default, transformFn: TransformFunction): Unit = js.native
  
  def clear(): Unit = js.native
  
  def get(sourceCode: String, destinationCode: String): TransformFunction = js.native
  
  def remove(source: default, destination: default): TransformFunction = js.native
}
