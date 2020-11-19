package typingsSlinky.reactMailchimpSubscribe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type DefaultFormFields = typingsSlinky.reactMailchimpSubscribe.mod.EmailFormFields
  
  type FormHooks[FormFields] = typingsSlinky.reactMailchimpSubscribe.mod.SubscribeArg[FormFields] with (typingsSlinky.reactMailchimpSubscribe.mod.ResponseArgs | typingsSlinky.reactMailchimpSubscribe.mod.PendingArgs)
  
  type MailchimpSubscribe[FormFields] = slinky.core.ReactComponentClass[typingsSlinky.reactMailchimpSubscribe.mod.Props[FormFields]]
}
