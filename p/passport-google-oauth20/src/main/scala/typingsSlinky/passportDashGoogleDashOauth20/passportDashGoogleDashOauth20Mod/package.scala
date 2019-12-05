package typingsSlinky.passportDashGoogleDashOauth20

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object passportDashGoogleDashOauth20Mod {
  import typingsSlinky.passportDashGoogleDashOauth20.passportDashGoogleDashOauth20Strings.authorizationURL
  import typingsSlinky.passportDashGoogleDashOauth20.passportDashGoogleDashOauth20Strings.callbackURL
  import typingsSlinky.passportDashGoogleDashOauth20.passportDashGoogleDashOauth20Strings.clientID
  import typingsSlinky.passportDashGoogleDashOauth20.passportDashGoogleDashOauth20Strings.clientSecret
  import typingsSlinky.passportDashGoogleDashOauth20.passportDashGoogleDashOauth20Strings.customHeaders
  import typingsSlinky.passportDashGoogleDashOauth20.passportDashGoogleDashOauth20Strings.scope
  import typingsSlinky.passportDashGoogleDashOauth20.passportDashGoogleDashOauth20Strings.scopeSeparator
  import typingsSlinky.passportDashGoogleDashOauth20.passportDashGoogleDashOauth20Strings.sessionKey
  import typingsSlinky.passportDashGoogleDashOauth20.passportDashGoogleDashOauth20Strings.state
  import typingsSlinky.passportDashGoogleDashOauth20.passportDashGoogleDashOauth20Strings.store
  import typingsSlinky.passportDashGoogleDashOauth20.passportDashGoogleDashOauth20Strings.tokenURL
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Pick

  type OAuth2StrategyOptionsWithoutRequiredURLs = Pick[
    typingsSlinky.passportDashOauth2.passportDashOauth2Mod._StrategyOptionsBase, 
    Exclude[
      authorizationURL | tokenURL | clientID | clientSecret | callbackURL | customHeaders | scope | scopeSeparator | sessionKey | store | state, 
      authorizationURL | tokenURL
    ]
  ]
  type VerifyCallback = js.Function3[
    /* err */ js.UndefOr[String | js.Error], 
    /* user */ js.UndefOr[js.Any], 
    /* info */ js.UndefOr[js.Any], 
    Unit
  ]
}
