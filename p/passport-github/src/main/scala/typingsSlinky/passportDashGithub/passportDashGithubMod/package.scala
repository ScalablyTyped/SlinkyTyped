package typingsSlinky.passportDashGithub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object passportDashGithubMod {
  import typingsSlinky.passportDashGithub.passportDashGithubStrings.authorizationURL
  import typingsSlinky.passportDashGithub.passportDashGithubStrings.callbackURL
  import typingsSlinky.passportDashGithub.passportDashGithubStrings.clientID
  import typingsSlinky.passportDashGithub.passportDashGithubStrings.clientSecret
  import typingsSlinky.passportDashGithub.passportDashGithubStrings.customHeaders
  import typingsSlinky.passportDashGithub.passportDashGithubStrings.scope
  import typingsSlinky.passportDashGithub.passportDashGithubStrings.scopeSeparator
  import typingsSlinky.passportDashGithub.passportDashGithubStrings.sessionKey
  import typingsSlinky.passportDashGithub.passportDashGithubStrings.state
  import typingsSlinky.passportDashGithub.passportDashGithubStrings.store
  import typingsSlinky.passportDashGithub.passportDashGithubStrings.tokenURL
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Pick

  type OAuth2StrategyOptionsWithoutRequiredURLs = Pick[
    typingsSlinky.passportDashOauth2.passportDashOauth2Mod._StrategyOptionsBase, 
    Exclude[
      authorizationURL | tokenURL | clientID | clientSecret | callbackURL | customHeaders | scope | scopeSeparator | sessionKey | store | state, 
      authorizationURL | tokenURL
    ]
  ]
  type Strategy = typingsSlinky.passportDashOauth2.passportDashOauth2Mod.Strategy
  /** @deprecated Types renamed for consistency with 'passport-oauth2'. Use `StrategyOptions` instead. */
  type StrategyOption = StrategyOptions
  /** @deprecated Types renamed for consistency with 'passport-oauth2'. Use `_StrategyOptionsBase` instead. */
  type StrategyOptionBase = _StrategyOptionsBase
  /** @deprecated Types renamed for consistency with 'passport-oauth2'. Use `StrategyOptionsWithRequest` instead. */
  type StrategyOptionWithRequest = StrategyOptionsWithRequest
}
