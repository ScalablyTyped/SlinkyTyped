package typingsSlinky.ethereumProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ContractAbi = js.Array[typingsSlinky.ethereumProtocol.mod.AbiDefinition]
  type DecodedLogArgs = org.scalablytyped.runtime.StringDictionary[typingsSlinky.ethereumProtocol.mod.ContractEventArg]
  type JSONRPCErrorCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* result */ js.UndefOr[typingsSlinky.ethereumProtocol.mod.JSONRPCResponsePayload], 
    scala.Unit
  ]
  type LogWithDecodedArgs[ArgsType /* <: typingsSlinky.ethereumProtocol.mod.DecodedLogArgs */] = typingsSlinky.ethereumProtocol.mod.DecodedLogEntry[ArgsType]
  type RawLog = typingsSlinky.ethereumProtocol.mod.LogEntry
}
