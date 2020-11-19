package typingsSlinky.googleapisCommon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import typingsSlinky.googleapisCommon.apiMod.ServiceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis-common/build/src/apiIndex", JSImport.Namespace)
@js.native
object apiIndexMod extends js.Object {
  
  def getAPI[T](api: String, options: String, versions: StringDictionary[js.Any]): T = js.native
  def getAPI[T](api: String, options: String, versions: StringDictionary[js.Any], context: GoogleConfigurable): T = js.native
  def getAPI[T](api: String, options: ServiceOptions, versions: StringDictionary[js.Any]): T = js.native
  def getAPI[T](
    api: String,
    options: ServiceOptions,
    versions: StringDictionary[js.Any],
    context: GoogleConfigurable
  ): T = js.native
}
