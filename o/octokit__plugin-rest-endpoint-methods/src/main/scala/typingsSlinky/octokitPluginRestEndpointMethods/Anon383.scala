package typingsSlinky.octokitPluginRestEndpointMethods

import typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ReposGetCommitParams
import typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ReposGetCommitParamsDeprecatedCommitSha
import typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ReposGetCommitParamsDeprecatedSha
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon383 extends js.Object {
  var endpoint: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EndpointInterface */ js.Any = js.native
  def apply(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReposGetCommitResponse> */ _
  ] = js.native
  def apply(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ReposGetCommitParamsDeprecatedSha with ReposGetCommitParamsDeprecatedCommitSha with ReposGetCommitParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReposGetCommitResponse> */ _
  ] = js.native
}

