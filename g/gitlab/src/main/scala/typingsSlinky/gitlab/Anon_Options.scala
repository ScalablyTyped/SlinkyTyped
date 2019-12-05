package typingsSlinky.gitlab

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseServiceOptions
import typingsSlinky.gitlab.distTypesCoreServicesMod.UserCustomAttributes
import typingsSlinky.gitlab.distTypesCoreServicesMod.UserEmails
import typingsSlinky.gitlab.distTypesCoreServicesMod.UserGPGKeys
import typingsSlinky.gitlab.distTypesCoreServicesMod.UserImpersonationTokens
import typingsSlinky.gitlab.distTypesCoreServicesMod.UserKeys
import typingsSlinky.gitlab.distTypesCoreServicesMod.Users
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Options extends js.Object {
  var UserCustomAttributes: Instantiable1[
    js.UndefOr[/* options */ BaseServiceOptions], 
    typingsSlinky.gitlab.distTypesCoreServicesMod.UserCustomAttributes
  ]
  var UserEmails: Instantiable0[typingsSlinky.gitlab.distTypesCoreServicesMod.UserEmails]
  var UserGPGKeys: Instantiable0[typingsSlinky.gitlab.distTypesCoreServicesMod.UserGPGKeys]
  var UserImpersonationTokens: Instantiable0[typingsSlinky.gitlab.distTypesCoreServicesMod.UserImpersonationTokens]
  var UserKeys: Instantiable0[typingsSlinky.gitlab.distTypesCoreServicesMod.UserKeys]
  var Users: Instantiable0[typingsSlinky.gitlab.distTypesCoreServicesMod.Users]
}

object Anon_Options {
  @scala.inline
  def apply(
    UserCustomAttributes: Instantiable1[js.UndefOr[/* options */ BaseServiceOptions], UserCustomAttributes],
    UserEmails: Instantiable0[UserEmails],
    UserGPGKeys: Instantiable0[UserGPGKeys],
    UserImpersonationTokens: Instantiable0[UserImpersonationTokens],
    UserKeys: Instantiable0[UserKeys],
    Users: Instantiable0[Users]
  ): Anon_Options = {
    val __obj = js.Dynamic.literal(UserCustomAttributes = UserCustomAttributes.asInstanceOf[js.Any], UserEmails = UserEmails.asInstanceOf[js.Any], UserGPGKeys = UserGPGKeys.asInstanceOf[js.Any], UserImpersonationTokens = UserImpersonationTokens.asInstanceOf[js.Any], UserKeys = UserKeys.asInstanceOf[js.Any], Users = Users.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Options]
  }
}

