package typingsSlinky.octokitPluginPaginateRest

import typingsSlinky.octokitCore.mod.Octokit
import typingsSlinky.octokitPluginPaginateRest.anon.Paginate
import typingsSlinky.octokitPluginPaginateRest.typesMod.ComposePaginateInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@octokit/plugin-paginate-rest", "composePaginateRest")
  @js.native
  val composePaginateRest: ComposePaginateInterface = js.native
  
  object paginateRest {
    
    @JSImport("@octokit/plugin-paginate-rest", "paginateRest")
    @js.native
    def apply(octokit: Octokit): Paginate = js.native
    @JSImport("@octokit/plugin-paginate-rest", "paginateRest")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@octokit/plugin-paginate-rest", "paginateRest.VERSION")
    @js.native
    def VERSION: String = js.native
    @scala.inline
    def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
  }
}
