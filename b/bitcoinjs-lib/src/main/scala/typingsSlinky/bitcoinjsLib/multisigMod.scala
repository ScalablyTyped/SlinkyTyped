package typingsSlinky.bitcoinjsLib

import typingsSlinky.bitcoinjsLib.paymentsMod.Stack
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bitcoinjs-lib/types/templates/multisig", JSImport.Namespace)
@js.native
object multisigMod extends js.Object {
  
  @js.native
  object input extends js.Object {
    
    @js.native
    object check extends js.Object {
      
      def apply(script: Stack): Boolean = js.native
      def apply(script: Stack, allowIncomplete: Boolean): Boolean = js.native
      def apply(script: Buffer): Boolean = js.native
      def apply(script: Buffer, allowIncomplete: Boolean): Boolean = js.native
      
      var toJSON: js.Function0[String] = js.native
    }
  }
  
  @js.native
  object output extends js.Object {
    
    @js.native
    object check extends js.Object {
      
      def apply(script: Stack): Boolean = js.native
      def apply(script: Stack, allowIncomplete: Boolean): Boolean = js.native
      def apply(script: Buffer): Boolean = js.native
      def apply(script: Buffer, allowIncomplete: Boolean): Boolean = js.native
      
      var toJSON: js.Function0[String] = js.native
    }
  }
}
