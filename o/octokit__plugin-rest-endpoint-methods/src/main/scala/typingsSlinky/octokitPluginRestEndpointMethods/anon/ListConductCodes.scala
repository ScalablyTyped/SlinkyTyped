package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.CodesOfConductGetConductCodeParams
import typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.CodesOfConductGetForRepoParams
import typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.EmptyParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListConductCodes extends js.Object {
  @JSName("getConductCode")
  var getConductCode_Original: `100` = js.native
  /**
    * This method returns the contents of the repository's code of conduct file, if one is detected.
    */
  @JSName("getForRepo")
  var getForRepo_Original: `101` = js.native
  @JSName("listConductCodes")
  var listConductCodes_Original: `29` = js.native
  def getConductCode(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<CodesOfConductGetConductCodeResponse> */ _
  ] = js.native
  def getConductCode(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with CodesOfConductGetConductCodeParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<CodesOfConductGetConductCodeResponse> */ _
  ] = js.native
  /**
    * This method returns the contents of the repository's code of conduct file, if one is detected.
    */
  def getForRepo(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<CodesOfConductGetForRepoResponse> */ _
  ] = js.native
  def getForRepo(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with CodesOfConductGetForRepoParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<CodesOfConductGetForRepoResponse> */ _
  ] = js.native
  def listConductCodes(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersListBlockedResponse> */ _
  ] = js.native
  def listConductCodes(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with EmptyParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<UsersListBlockedResponse> */ _
  ] = js.native
}

