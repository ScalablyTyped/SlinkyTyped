package typingsSlinky.octokitRest

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.octokitCore.typesMod.Constructor
import typingsSlinky.octokitPluginRestEndpointMethods.methodTypesMod.RestEndpointMethods
import typingsSlinky.octokitRest.anon.Instantiable
import typingsSlinky.octokitRest.anon.Paginate
import typingsSlinky.octokitRest.anon.TypeofCore
import typingsSlinky.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@octokit/rest", "Octokit")
  @js.native
  val Octokit: (Instantiable1[/* args (repeated) */ js.Any, StringDictionary[js.Any]]) with Instantiable with TypeofCore with (Constructor[Unit with Paginate with RestEndpointMethods]) = js.native
  type Octokit = InstanceType[
    (Instantiable1[/* args (repeated) */ js.Any, StringDictionary[js.Any]]) with Instantiable with (/* import warning: importer.ImportType#apply Failed type conversion: typeof Core */ js.Any) with (Constructor[Unit with Paginate with RestEndpointMethods])
  ]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@octokit/rest", "Octokit")
  @js.native
  class OctokitCls ()
    extends typingsSlinky.octokitCore.mod.Octokit
}
