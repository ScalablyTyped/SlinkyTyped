package typingsSlinky.authmosphere

import typingsSlinky.authmosphere.mockOptionsMod.MockOptions
import typingsSlinky.authmosphere.tokenMod.Token
import typingsSlinky.nock.mod.Scope
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authmosphere/lib/src/mock-tooling", JSImport.Namespace)
@js.native
object mockToolingMod extends js.Object {
  
  /**
    * Removes generated tokens and mocked endpoints.
    */
  def cleanMock(): Unit = js.native
  
  /**
    * Creates a __very basic__ mock of token endpoint as defined in [RFC 6749](https://tools.ietf.org/html/rfc6749).
    *
    * @param options
    * @returns {nock.Scope}
    *
    * @throws on parse error of options.url
    */
  def mockAccessTokenEndpoint(options: MockOptions): Scope = js.native
  
  def mockAccessTokenEndpointWithErrorResponse(options: MockOptions, httpStatus: Double): Scope = js.native
  def mockAccessTokenEndpointWithErrorResponse(options: MockOptions, httpStatus: Double, responseBody: Record[String, _]): Scope = js.native
  
  /**
    * Creates a __very basic__ mock of a token validation endpoint.
    *
    * @param options
    * @returns {nock.Scope}
    *
    * @throws on parse error of options.url
    */
  def mockTokeninfoEndpoint(options: MockOptions): Scope = js.native
  def mockTokeninfoEndpoint(options: MockOptions, tokens: js.Array[Token[Record[String, _]]]): Scope = js.native
  
  def mockTokeninfoEndpointWithErrorResponse(options: MockOptions, httpStatus: Double): Scope = js.native
  def mockTokeninfoEndpointWithErrorResponse(options: MockOptions, httpStatus: Double, responseBody: Record[String, _]): Scope = js.native
}
