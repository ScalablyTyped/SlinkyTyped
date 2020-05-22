package typingsSlinky.gitlab.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.gitlab.baseServiceMod.BaseServiceOptions
import typingsSlinky.gitlab.servicesMod.UserGPGKeys
import typingsSlinky.gitlab.servicesMod.UserImpersonationTokens
import typingsSlinky.gitlab.servicesMod.UserKeys
import typingsSlinky.gitlab.servicesMod.Users
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserCustomAttributes extends js.Object {
  var UserCustomAttributes: Instantiable1[
    js.UndefOr[/* options */ BaseServiceOptions], 
    typingsSlinky.gitlab.servicesMod.UserCustomAttributes
  ]
  var UserEmails: Instantiable0[typingsSlinky.gitlab.servicesMod.UserEmails]
  var UserGPGKeys: Instantiable0[typingsSlinky.gitlab.servicesMod.UserGPGKeys]
  var UserImpersonationTokens: Instantiable0[typingsSlinky.gitlab.servicesMod.UserImpersonationTokens]
  var UserKeys: Instantiable0[typingsSlinky.gitlab.servicesMod.UserKeys]
  var Users: Instantiable0[typingsSlinky.gitlab.servicesMod.Users]
}

object UserCustomAttributes {
  @scala.inline
  def apply(
    UserCustomAttributes: Instantiable1[
      js.UndefOr[/* options */ BaseServiceOptions], 
      typingsSlinky.gitlab.servicesMod.UserCustomAttributes
    ],
    UserEmails: Instantiable0[typingsSlinky.gitlab.servicesMod.UserEmails],
    UserGPGKeys: Instantiable0[UserGPGKeys],
    UserImpersonationTokens: Instantiable0[UserImpersonationTokens],
    UserKeys: Instantiable0[UserKeys],
    Users: Instantiable0[Users]
  ): UserCustomAttributes = {
    val __obj = js.Dynamic.literal(UserCustomAttributes = UserCustomAttributes.asInstanceOf[js.Any], UserEmails = UserEmails.asInstanceOf[js.Any], UserGPGKeys = UserGPGKeys.asInstanceOf[js.Any], UserImpersonationTokens = UserImpersonationTokens.asInstanceOf[js.Any], UserKeys = UserKeys.asInstanceOf[js.Any], Users = Users.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserCustomAttributes]
  }
}

