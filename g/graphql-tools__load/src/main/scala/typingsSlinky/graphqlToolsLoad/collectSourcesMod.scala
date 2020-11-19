package typingsSlinky.graphqlToolsLoad

import typingsSlinky.graphqlToolsLoad.anon.Options
import typingsSlinky.graphqlToolsUtils.loadersMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/load/load-typedefs/collect-sources", JSImport.Namespace)
@js.native
object collectSourcesMod extends js.Object {
  
  def collectSources[TOptions](hasPointerOptionMapOptions: Options[TOptions]): js.Promise[js.Array[Source]] = js.native
  
  def collectSourcesSync[TOptions](hasPointerOptionMapOptions: Options[TOptions]): js.Array[Source] = js.native
}
