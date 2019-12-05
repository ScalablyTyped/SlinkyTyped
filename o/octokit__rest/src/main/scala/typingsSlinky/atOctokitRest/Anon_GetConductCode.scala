package typingsSlinky.atOctokitRest

import typingsSlinky.atOctokitRest.atOctokitRestMod.CodesOfConductGetConductCodeParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.CodesOfConductGetConductCodeResponse
import typingsSlinky.atOctokitRest.atOctokitRestMod.CodesOfConductGetForRepoParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.CodesOfConductGetForRepoResponse
import typingsSlinky.atOctokitRest.atOctokitRestMod.CodesOfConductListConductCodesResponse
import typingsSlinky.atOctokitRest.atOctokitRestMod.EmptyParams
import typingsSlinky.atOctokitRest.atOctokitRestMod.RequestOptions
import typingsSlinky.atOctokitRest.atOctokitRestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_GetConductCode extends js.Object {
  @JSName("getConductCode")
  var getConductCode_Original: Anon_EndpointParamsCodesOfConductGetConductCodeParams = js.native
  /**
    * This method returns the contents of the repository's code of conduct file, if one is detected.
    */
  @JSName("getForRepo")
  var getForRepo_Original: Anon_EndpointParamsCodesOfConductGetForRepoParams = js.native
  @JSName("listConductCodes")
  var listConductCodes_Original: Anon_EndpointParamsCodesOfConductListConductCodesResponse = js.native
  def getConductCode(): js.Promise[Response[CodesOfConductGetConductCodeResponse]] = js.native
  def getConductCode(params: RequestOptions with CodesOfConductGetConductCodeParams): js.Promise[Response[CodesOfConductGetConductCodeResponse]] = js.native
  /**
    * This method returns the contents of the repository's code of conduct file, if one is detected.
    */
  def getForRepo(): js.Promise[Response[CodesOfConductGetForRepoResponse]] = js.native
  def getForRepo(params: RequestOptions with CodesOfConductGetForRepoParams): js.Promise[Response[CodesOfConductGetForRepoResponse]] = js.native
  def listConductCodes(): js.Promise[Response[CodesOfConductListConductCodesResponse]] = js.native
  def listConductCodes(params: RequestOptions with EmptyParams): js.Promise[Response[CodesOfConductListConductCodesResponse]] = js.native
}

