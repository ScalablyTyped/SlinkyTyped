package typingsSlinky.bip174

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object interfacesMod {
  
  type FinalScriptSig = typingsSlinky.node.Buffer
  
  type FinalScriptWitness = typingsSlinky.node.Buffer
  
  type NonWitnessUtxo = typingsSlinky.node.Buffer
  
  type PorCommitment = java.lang.String
  
  type RedeemScript = typingsSlinky.node.Buffer
  
  type SighashType = scala.Double
  
  type TransactionFromBuffer = js.Function1[
    /* buffer */ typingsSlinky.node.Buffer, 
    typingsSlinky.bip174.interfacesMod.Transaction
  ]
  
  type TransactionIOCountGetter = js.Function1[/* txBuffer */ typingsSlinky.node.Buffer, typingsSlinky.bip174.anon.InputCount]
  
  type TransactionInputAdder = js.Function2[
    /* input */ typingsSlinky.bip174.interfacesMod.TransactionInput, 
    /* txBuffer */ typingsSlinky.node.Buffer, 
    typingsSlinky.node.Buffer
  ]
  
  type TransactionLocktimeSetter = js.Function2[
    /* locktime */ scala.Double, 
    /* txBuffer */ typingsSlinky.node.Buffer, 
    typingsSlinky.node.Buffer
  ]
  
  type TransactionOutputAdder = js.Function2[
    /* output */ typingsSlinky.bip174.interfacesMod.TransactionOutput, 
    /* txBuffer */ typingsSlinky.node.Buffer, 
    typingsSlinky.node.Buffer
  ]
  
  type TransactionVersionSetter = js.Function2[
    /* version */ scala.Double, 
    /* txBuffer */ typingsSlinky.node.Buffer, 
    typingsSlinky.node.Buffer
  ]
  
  type WitnessScript = typingsSlinky.node.Buffer
}
