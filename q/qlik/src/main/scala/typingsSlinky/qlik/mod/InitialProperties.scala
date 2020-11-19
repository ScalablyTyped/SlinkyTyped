package typingsSlinky.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.qlik.mod.InitialPropertiesHyperCube
  - typingsSlinky.qlik.mod.InitialPropertiesListobject
*/
trait InitialProperties extends js.Object
object InitialProperties {
  
  @scala.inline
  def InitialPropertiesHyperCube(qHyperCubeDef: HyperCubeDef): InitialProperties = {
    val __obj = js.Dynamic.literal(qHyperCubeDef = qHyperCubeDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialProperties]
  }
  
  @scala.inline
  def InitialPropertiesListobject(qListobjectDef: ListobjectDef): InitialProperties = {
    val __obj = js.Dynamic.literal(qListobjectDef = qListobjectDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialProperties]
  }
}
