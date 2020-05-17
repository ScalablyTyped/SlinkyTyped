package typingsSlinky.googleGax.mod

import typingsSlinky.googleAuthLibrary.anon.TypeofDefaultTransporter
import typingsSlinky.googleAuthLibrary.googleauthMod.GoogleAuthOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax", "GoogleAuth")
@js.native
class GoogleAuth ()
  extends typingsSlinky.googleAuthLibrary.mod.GoogleAuth {
  def this(opts: GoogleAuthOptions) = this()
}

/* static members */
@JSImport("google-gax", "GoogleAuth")
@js.native
object GoogleAuth extends js.Object {
  /**
    * Export DefaultTransporter as a static property of the class.
    */
  var DefaultTransporter: TypeofDefaultTransporter = js.native
}

