package typingsSlinky.recurlyRecurlyJs.bankAccountMod

import org.scalajs.dom.raw.HTMLFormElement
import typingsSlinky.recurlyRecurlyJs.tokenMod.TokenHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BankAccount extends js.Object {
  
  def bankInfo(bankInfoOptions: BankInfoOptions, BankInfoHandler: BankInfoHandler): Unit = js.native
  @JSName("bankInfo")
  var bankInfo_Original: BankInfo = js.native
  
  def token(data: BillingInfo, tokenHandler: TokenHandler): Unit = js.native
  def token(data: HTMLFormElement, tokenHandler: TokenHandler): Unit = js.native
}
