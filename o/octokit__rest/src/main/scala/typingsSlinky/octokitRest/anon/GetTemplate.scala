package typingsSlinky.octokitRest.anon

import typingsSlinky.octokitRest.mod.Octokit.EmptyParams
import typingsSlinky.octokitRest.mod.Octokit.GitignoreGetTemplateParams
import typingsSlinky.octokitRest.mod.Octokit.GitignoreGetTemplateResponse
import typingsSlinky.octokitRest.mod.Octokit.GitignoreListTemplatesResponse
import typingsSlinky.octokitRest.mod.Octokit.RequestOptions
import typingsSlinky.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTemplate extends js.Object {
  /**
    * The API also allows fetching the source of a single template.
    *
    * Use the raw [media type](https://developer.github.com/v3/media/) to get the raw contents.
    */
  @JSName("getTemplate")
  var getTemplate_Original: `138` = js.native
  /**
    * List all templates available to pass as an option when [creating a repository](https://developer.github.com/v3/repos/#create).
    */
  @JSName("listTemplates")
  var listTemplates_Original: `139` = js.native
  /**
    * The API also allows fetching the source of a single template.
    *
    * Use the raw [media type](https://developer.github.com/v3/media/) to get the raw contents.
    */
  def getTemplate(): js.Promise[Response[GitignoreGetTemplateResponse]] = js.native
  def getTemplate(params: RequestOptions with GitignoreGetTemplateParams): js.Promise[Response[GitignoreGetTemplateResponse]] = js.native
  /**
    * List all templates available to pass as an option when [creating a repository](https://developer.github.com/v3/repos/#create).
    */
  def listTemplates(): js.Promise[Response[GitignoreListTemplatesResponse]] = js.native
  def listTemplates(params: RequestOptions with EmptyParams): js.Promise[Response[GitignoreListTemplatesResponse]] = js.native
}

