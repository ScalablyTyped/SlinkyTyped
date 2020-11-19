package typingsSlinky.electronPublish.gitHubPublisherMod

import typingsSlinky.builderUtilRuntime.publishOptionsMod.GithubOptions
import typingsSlinky.electronPublish.mod.HttpPublisher
import typingsSlinky.electronPublish.mod.PublishContext
import typingsSlinky.electronPublish.mod.PublishOptions
import typingsSlinky.lazyVal.mod.Lazy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("electron-publish/out/gitHubPublisher", "GitHubPublisher")
@js.native
class GitHubPublisher protected () extends HttpPublisher {
  def this(context: PublishContext, info: GithubOptions, version: String) = this()
  def this(context: PublishContext, info: GithubOptions, version: String, options: PublishOptions) = this()
  
  val _release: Lazy[_] = js.native
  
  var createRelease: js.Any = js.native
  
  def deleteRelease(): js.Promise[_] = js.native
  
  var doUploadFile: js.Any = js.native
  
  var getOrCreateRelease: js.Any = js.native
  
  def getRelease(): js.Promise[_] = js.native
  
  var githubRequest: js.Any = js.native
  
  val info: js.Any = js.native
  
  val options: js.Any = js.native
  
  var overwriteArtifact: js.Any = js.native
  
  @JSName("providerName")
  val providerName_FGitHubPublisher: /* "GitHub" */ String = js.native
  
  var releaseLogFields: js.Any = js.native
  
  val releaseType: js.Any = js.native
  
  val tag: js.Any = js.native
  
  val token: js.Any = js.native
  
  val version: js.Any = js.native
}
