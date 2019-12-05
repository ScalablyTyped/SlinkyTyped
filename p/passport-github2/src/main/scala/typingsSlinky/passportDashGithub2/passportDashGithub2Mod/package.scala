package typingsSlinky.passportDashGithub2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object passportDashGithub2Mod {
  import typingsSlinky.passportDashGithub2.passportDashGithub2Strings.authorizationURL
  import typingsSlinky.passportDashGithub2.passportDashGithub2Strings.callbackURL
  import typingsSlinky.passportDashGithub2.passportDashGithub2Strings.clientID
  import typingsSlinky.passportDashGithub2.passportDashGithub2Strings.clientSecret
  import typingsSlinky.passportDashGithub2.passportDashGithub2Strings.customHeaders
  import typingsSlinky.passportDashGithub2.passportDashGithub2Strings.scope
  import typingsSlinky.passportDashGithub2.passportDashGithub2Strings.scopeSeparator
  import typingsSlinky.passportDashGithub2.passportDashGithub2Strings.sessionKey
  import typingsSlinky.passportDashGithub2.passportDashGithub2Strings.state
  import typingsSlinky.passportDashGithub2.passportDashGithub2Strings.store
  import typingsSlinky.passportDashGithub2.passportDashGithub2Strings.tokenURL
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Pick

  type OAuth2StrategyOptionsWithoutRequiredURLs = Pick[
    typingsSlinky.passportDashOauth2.passportDashOauth2Mod._StrategyOptionsBase, 
    Exclude[
      authorizationURL | tokenURL | clientID | clientSecret | callbackURL | customHeaders | scope | scopeSeparator | sessionKey | store | state, 
      authorizationURL | tokenURL
    ]
  ]
}
