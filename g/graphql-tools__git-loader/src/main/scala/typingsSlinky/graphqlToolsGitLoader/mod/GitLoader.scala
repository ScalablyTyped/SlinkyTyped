package typingsSlinky.graphqlToolsGitLoader.mod

import typingsSlinky.graphqlToolsUtils.loadersMod.DocumentPointerSingle
import typingsSlinky.graphqlToolsUtils.loadersMod.Loader
import typingsSlinky.graphqlToolsUtils.loadersMod.SchemaPointerSingle
import typingsSlinky.graphqlToolsUtils.loadersMod.SingleFileOptions
import typingsSlinky.graphqlToolsUtils.loadersMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/git-loader", "GitLoader")
@js.native
class GitLoader () extends Loader[SchemaPointerSingle | DocumentPointerSingle, SingleFileOptions] {
  def canLoad(pointer: String): js.Promise[Boolean] = js.native
  @JSName("canLoadSync")
  def canLoadSync_MGitLoader(pointer: String): Boolean = js.native
  def load(pointer: String, options: GitLoaderOptions): js.Promise[Source] = js.native
  @JSName("loadSync")
  def loadSync_MGitLoader(pointer: String, options: GitLoaderOptions): Source = js.native
}

