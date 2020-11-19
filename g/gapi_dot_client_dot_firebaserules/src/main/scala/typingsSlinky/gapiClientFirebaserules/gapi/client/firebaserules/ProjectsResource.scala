package typingsSlinky.gapiClientFirebaserules.gapi.client.firebaserules

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientFirebaserules.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends js.Object {
  
  var releases: ReleasesResource = js.native
  
  var rulesets: RulesetsResource = js.native
  
  /**
    * Test `Source` for syntactic and semantic correctness. Issues present, if
    * any, will be returned to the caller with a description, severity, and
    * source location.
    *
    * The test method may be executed with `Source` or a `Ruleset` name.
    * Passing `Source` is useful for unit testing new rules. Passing a `Ruleset`
    * name is useful for regression testing an existing rule.
    *
    * The following is an example of `Source` that permits users to upload images
    * to a bucket bearing their user id and matching the correct metadata:
    *
    * _&#42;Example&#42;_
    *
    * // Users are allowed to subscribe and unsubscribe to the blog.
    * service firebase.storage {
    * match /users/{userId}/images/{imageName} {
    * allow write: if userId == request.auth.uid
    * && (imageName.matches('&#42;.png$')
    * || imageName.matches('&#42;.jpg$'))
    * && resource.mimeType.matches('^image/')
    * }
    * }
    */
  def test(request: Accesstoken): Request[TestRulesetResponse] = js.native
}
object ProjectsResource {
  
  @scala.inline
  def apply(
    releases: ReleasesResource,
    rulesets: RulesetsResource,
    test: Accesstoken => Request[TestRulesetResponse]
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(releases = releases.asInstanceOf[js.Any], rulesets = rulesets.asInstanceOf[js.Any], test = js.Any.fromFunction1(test))
    __obj.asInstanceOf[ProjectsResource]
  }
  
  @scala.inline
  implicit class ProjectsResourceOps[Self <: ProjectsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setReleases(value: ReleasesResource): Self = this.set("releases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesets(value: RulesetsResource): Self = this.set("rulesets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTest(value: Accesstoken => Request[TestRulesetResponse]): Self = this.set("test", js.Any.fromFunction1(value))
  }
}
