package typingsSlinky.bitcoinjsLib

import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FinalScriptSig extends StObject {
    
    var finalScriptSig: js.UndefOr[Buffer] = js.native
    
    var finalScriptWitness: js.UndefOr[Buffer] = js.native
  }
  object FinalScriptSig {
    
    @scala.inline
    def apply(): FinalScriptSig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FinalScriptSig]
    }
    
    @scala.inline
    implicit class FinalScriptSigMutableBuilder[Self <: FinalScriptSig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFinalScriptSig(value: Buffer): Self = StObject.set(x, "finalScriptSig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinalScriptSigUndefined: Self = StObject.set(x, "finalScriptSig", js.undefined)
      
      @scala.inline
      def setFinalScriptWitness(value: Buffer): Self = StObject.set(x, "finalScriptWitness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinalScriptWitnessUndefined: Self = StObject.set(x, "finalScriptWitness", js.undefined)
    }
  }
}
