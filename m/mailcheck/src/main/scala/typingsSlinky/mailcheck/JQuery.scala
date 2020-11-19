package typingsSlinky.mailcheck

import typingsSlinky.mailcheck.MailcheckModule.IAsynchronousOptions
import typingsSlinky.mailcheck.MailcheckModule.ISuggestion
import typingsSlinky.mailcheck.MailcheckModule.ISynchronousOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends js.Object {
  
  def mailcheck(opts: IAsynchronousOptions): Unit = js.native
  def mailcheck(opts: ISynchronousOptions): ISuggestion | Unit = js.native
}
