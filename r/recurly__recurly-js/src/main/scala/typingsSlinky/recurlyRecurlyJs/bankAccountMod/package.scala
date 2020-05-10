package typingsSlinky.recurlyRecurlyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bankAccountMod {
  type BankInfo = js.Function2[
    /* bankInfoOptions */ typingsSlinky.recurlyRecurlyJs.bankAccountMod.BankInfoOptions, 
    /* BankInfoHandler */ typingsSlinky.recurlyRecurlyJs.bankAccountMod.BankInfoHandler, 
    scala.Unit
  ]
  type BankInfoHandler = js.Function2[
    /* err */ typingsSlinky.recurlyRecurlyJs.errorMod.RecurlyError, 
    /* bankInfo */ typingsSlinky.recurlyRecurlyJs.bankAccountMod.BankInfoPayload, 
    scala.Unit
  ]
}
