package typingsSlinky.recurlyRecurlyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object giftCardMod {
  
  type Done = js.Function2[
    /* error */ typingsSlinky.recurlyRecurlyJs.errorMod.RecurlyError, 
    /* result */ typingsSlinky.recurlyRecurlyJs.giftCardMod.GiftCardResult, 
    scala.Unit
  ]
  
  type GiftCard = js.Function2[
    /* giftCardOptions */ typingsSlinky.recurlyRecurlyJs.giftCardMod.GiftCardOptions, 
    /* done */ typingsSlinky.recurlyRecurlyJs.giftCardMod.Done, 
    scala.Unit
  ]
}
