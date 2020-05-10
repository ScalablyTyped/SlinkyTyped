package typingsSlinky.mapboxMapboxSdk.tokensMod

import typingsSlinky.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokensService extends js.Object {
  /**
    * Create a new temporary access token.
    * @param request
    */
  def createTemporaryToken(request: TemporaryTokenRequest): MapiRequest = js.native
  /**
    * Create a new access token.
    * @param request
    */
  def createToken(request: CreateTokenRequest): MapiRequest = js.native
  /**
    * Delete an access token.
    * @param request
    */
  def deleteToken(request: UpdateDeleteTokenRequest): MapiRequest = js.native
  /**
    * Get data about the client's access token.
    */
  def getToken(): MapiRequest = js.native
  /**
    * List your available scopes. Each item is a metadata object about the scope, not just the string scope.
    */
  def listScopes(): MapiRequest = js.native
  /**
    * List your access tokens.
    */
  def listTokens(): MapiRequest = js.native
  /**
    * Update an access token.
    * @param request
    */
  def updateToken(request: UpdateDeleteTokenRequest): MapiRequest = js.native
}

object TokensService {
  @scala.inline
  def apply(
    createTemporaryToken: TemporaryTokenRequest => MapiRequest,
    createToken: CreateTokenRequest => MapiRequest,
    deleteToken: UpdateDeleteTokenRequest => MapiRequest,
    getToken: () => MapiRequest,
    listScopes: () => MapiRequest,
    listTokens: () => MapiRequest,
    updateToken: UpdateDeleteTokenRequest => MapiRequest
  ): TokensService = {
    val __obj = js.Dynamic.literal(createTemporaryToken = js.Any.fromFunction1(createTemporaryToken), createToken = js.Any.fromFunction1(createToken), deleteToken = js.Any.fromFunction1(deleteToken), getToken = js.Any.fromFunction0(getToken), listScopes = js.Any.fromFunction0(listScopes), listTokens = js.Any.fromFunction0(listTokens), updateToken = js.Any.fromFunction1(updateToken))
    __obj.asInstanceOf[TokensService]
  }
  @scala.inline
  implicit class TokensServiceOps[Self <: TokensService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateTemporaryToken(value: TemporaryTokenRequest => MapiRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTemporaryToken")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateToken(value: CreateTokenRequest => MapiRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createToken")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeleteToken(value: UpdateDeleteTokenRequest => MapiRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteToken")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetToken(value: () => MapiRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getToken")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withListScopes(value: () => MapiRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listScopes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withListTokens(value: () => MapiRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listTokens")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdateToken(value: UpdateDeleteTokenRequest => MapiRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateToken")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

