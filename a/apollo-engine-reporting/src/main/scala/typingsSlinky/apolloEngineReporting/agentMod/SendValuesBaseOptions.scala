package typingsSlinky.apolloEngineReporting.agentMod

import typingsSlinky.apolloEngineReporting.apolloEngineReportingBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.apolloEngineReporting.anon.OnlyNames
  - typingsSlinky.apolloEngineReporting.anon.ExceptNames
  - typingsSlinky.apolloEngineReporting.anon.All
  - typingsSlinky.apolloEngineReporting.anon.None
*/
trait SendValuesBaseOptions extends VariableValueOptions
object SendValuesBaseOptions {
  
  @scala.inline
  def OnlyNames(onlyNames: js.Array[String]): SendValuesBaseOptions = {
    val __obj = js.Dynamic.literal(onlyNames = onlyNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendValuesBaseOptions]
  }
  
  @scala.inline
  def ExceptNames(exceptNames: js.Array[String]): SendValuesBaseOptions = {
    val __obj = js.Dynamic.literal(exceptNames = exceptNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendValuesBaseOptions]
  }
  
  @scala.inline
  def All(all: `true`): SendValuesBaseOptions = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendValuesBaseOptions]
  }
  
  @scala.inline
  def None(none: `true`): SendValuesBaseOptions = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendValuesBaseOptions]
  }
}
