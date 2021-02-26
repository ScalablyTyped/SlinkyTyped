package typingsSlinky.googleGax.mod

import typingsSlinky.googleAuthLibrary.anon.TypeofDefaultTransporter
import typingsSlinky.googleAuthLibrary.googleauthMod.GoogleAuthOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-gax", "GoogleAuth")
@js.native
class GoogleAuth ()
  extends typingsSlinky.googleAuthLibrary.mod.GoogleAuth {
  def this(opts: GoogleAuthOptions) = this()
}
/* static members */
object GoogleAuth {
  
  @JSImport("google-gax", "GoogleAuth")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Export DefaultTransporter as a static property of the class.
    */
  @JSImport("google-gax", "GoogleAuth.DefaultTransporter")
  @js.native
  def DefaultTransporter: TypeofDefaultTransporter = js.native
  @scala.inline
  def DefaultTransporter_=(x: TypeofDefaultTransporter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultTransporter")(x.asInstanceOf[js.Any])
}
