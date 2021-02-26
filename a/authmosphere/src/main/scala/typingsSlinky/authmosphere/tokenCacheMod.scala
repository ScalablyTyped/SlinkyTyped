package typingsSlinky.authmosphere

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.authmosphere.oauthconfigMod.TokenCacheOAuthConfig
import typingsSlinky.authmosphere.tokenCacheConfigMod.CacheConfig
import typingsSlinky.authmosphere.tokenCacheConfigMod.TokenCacheOptions
import typingsSlinky.authmosphere.tokenMod.Token
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokenCacheMod {
  
  /**
    * Class to request and cache tokens on client-side.
    *
    * Usage:
    *  const tokenCache = new TokenCache({
    *    'nucleus': ['write.all', 'read.all']
    *  }, oAuthConfig, options);
    *
    *  tokenCache.get('nucleus')
    *  .then((token) => {
    *    console.log(token.access_token);
    *  });
    *
    */
  @JSImport("authmosphere/lib/src/token-cache", "TokenCache")
  @js.native
  class TokenCache protected () extends StObject {
    /**
      * @param tokenConfig
      * @param oauthConfig
      */
    def this(tokenConfig: StringDictionary[js.Array[String]], oauthConfig: TokenCacheOAuthConfig) = this()
    def this(
      tokenConfig: StringDictionary[js.Array[String]],
      oauthConfig: TokenCacheOAuthConfig,
      options: TokenCacheOptions
    ) = this()
    
    var cacheConfig: js.Any = js.native
    
    /**
      * Resolves with either a cached token for the given name or with a newly requested one (which is then cached).
      * Rejects if there is no token present and is not able to request a new one.
      *
      * @param tokenName
      * @returns {Promise<Token>}
      */
    def get(tokenName: String): js.Promise[Token[Record[String, _]]] = js.native
    
    /**
      * Checks whether a valid token for the given name is present.
      * Resolves with that token if that is the case.
      * Rejects otherwise.
      *
      * @param tokenName
      * @returns {Promise<Token>}
      */
    var getCachedToken: js.Any = js.native
    
    var isTokenConfigured: js.Any = js.native
    
    var logger: js.Any = js.native
    
    var oauthConfig: js.Any = js.native
    
    /**
      * Forces the cache to delete present tokens and request new ones.
      * Will resolve with an hashmap of the newly requested tokens if the request was successful.
      * Otherwise, rejects.
      *
      * @returns {Promise<Token>}
      */
    def refreshAllTokens(): js.Promise[TokenMap] = js.native
    
    /**
      * Forces the cache to delete present token for the given name.
      * Will resolve the newly requested token if the request was successful.
      * Otherwise, rejects.
      *
      * @param tokenName
      * @returns {Promise<Token>}
      */
    def refreshToken(tokenName: String): js.Promise[Token[Record[String, _]]] = js.native
    
    /**
      * The resolveAccessTokenFactory function, creates a function,
      * which resolves a specific access_token.
      *
      * @param {string} The key configured on the tokenCache instance
      * @return {Promise<string>} the resolved access_token
      */
    def resolveAccessTokenFactory(key: String): js.Function0[js.Promise[String]] = js.native
    
    var tokenConfig: js.Any = js.native
    
    var tokenMap: js.Any = js.native
  }
  
  @JSImport("authmosphere/lib/src/token-cache", "defaultCacheConfig")
  @js.native
  val defaultCacheConfig: CacheConfig = js.native
  
  type TokenMap = StringDictionary[js.UndefOr[Token[Record[String, js.Any]]]]
}
