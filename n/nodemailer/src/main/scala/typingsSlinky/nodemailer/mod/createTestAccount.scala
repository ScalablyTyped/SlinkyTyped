package typingsSlinky.nodemailer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodemailer", "createTestAccount")
@js.native
object createTestAccount extends js.Object {
  
  def apply(): js.Promise[TestAccount] = js.native
  def apply(apiUrl: String): js.Promise[TestAccount] = js.native
  def apply(
    apiUrl: String,
    callback: js.Function2[/* err */ js.Error | Null, /* testAccount */ TestAccount, Unit]
  ): Unit = js.native
  def apply(callback: js.Function2[/* err */ js.Error | Null, /* testAccount */ TestAccount, Unit]): Unit = js.native
}
