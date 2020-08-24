package typingsSlinky.graphqlToolsGithubLoader.mod

import typingsSlinky.graphqlToolsGithubLoader.anon.Document
import typingsSlinky.graphqlToolsUtils.loadersMod.DocumentPointerSingle
import typingsSlinky.graphqlToolsUtils.loadersMod.Loader
import typingsSlinky.graphqlToolsUtils.loadersMod.SchemaPointerSingle
import typingsSlinky.graphqlToolsUtils.loadersMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/github-loader", "GithubLoader")
@js.native
class GithubLoader () extends Loader[SchemaPointerSingle | DocumentPointerSingle, GithubLoaderOptions] {
  def canLoad(pointer: String): js.Promise[Boolean] = js.native
  @JSName("canLoadSync")
  def canLoadSync_MGithubLoader(): Boolean = js.native
  def load(pointer: String, options: GithubLoaderOptions): js.Promise[Source | Document] = js.native
  @JSName("loadSync")
  def loadSync_MGithubLoader(): scala.Nothing = js.native
}

