package typingsSlinky.bitcoinjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object psbtMod {
  
  /**
    * This function must do two things:
    * 1. Check if the `input` can be finalized. If it can not be finalized, throw.
    *   ie. `Can not finalize input #${inputIndex}`
    * 2. Create the finalScriptSig and finalScriptWitness Buffers.
    */
  type FinalScriptsFunc = js.Function6[
    /* inputIndex */ scala.Double, 
    /* input */ typingsSlinky.bip174.interfacesMod.PsbtInput, 
    /* script */ typingsSlinky.node.Buffer, 
    /* isSegwit */ scala.Boolean, 
    /* isP2SH */ scala.Boolean, 
    /* isP2WSH */ scala.Boolean, 
    typingsSlinky.bitcoinjsLib.anon.FinalScriptSig
  ]
}
