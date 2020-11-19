package typingsSlinky.graphqlConfig

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-config/lib/extensions/endpoints/resolveRefString", JSImport.Namespace)
@js.native
object resolveRefStringMod extends js.Object {
  
  def getUsedEnvs(config: js.Any): StringDictionary[String] = js.native
  
  def resolveEnvsInValues[T /* <: StringDictionary[js.Any] */](config: T, env: StringDictionary[js.UndefOr[String]]): T = js.native
  
  def resolveRefString(str: String): String = js.native
  def resolveRefString(str: String, values: js.Object): String = js.native
}
