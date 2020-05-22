package typingsSlinky.firebaseAdmin.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Auth
  extends typingsSlinky.firebaseAdmin.authMod.admin.auth.BaseAuth {
  var app: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _admin.app.App */ js.Any = js.native
  /**
    * @return The tenant manager instance associated with the current project.
    */
  def tenantManager(): typingsSlinky.firebaseAdmin.authMod.admin.auth.TenantManager = js.native
}

