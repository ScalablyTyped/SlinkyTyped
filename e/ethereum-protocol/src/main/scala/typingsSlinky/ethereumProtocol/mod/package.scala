package typingsSlinky.ethereumProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BlockParam = typingsSlinky.ethereumProtocol.mod.BlockParamLiteral | scala.Double
  type ContractAbi = js.Array[typingsSlinky.ethereumProtocol.mod.AbiDefinition]
  type ContractEventArg = java.lang.String | typingsSlinky.bignumberJs.mod.default | scala.Double | scala.Boolean
  type DecodedLogArgs = org.scalablytyped.runtime.StringDictionary[typingsSlinky.ethereumProtocol.mod.ContractEventArg]
  type JSONRPCErrorCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* result */ js.UndefOr[typingsSlinky.ethereumProtocol.mod.JSONRPCResponsePayload], 
    scala.Unit
  ]
  type LogTopic = scala.Null | java.lang.String | js.Array[java.lang.String]
  type LogWithDecodedArgs[ArgsType /* <: typingsSlinky.ethereumProtocol.mod.DecodedLogArgs */] = typingsSlinky.ethereumProtocol.mod.DecodedLogEntry[ArgsType]
  type RawLog = typingsSlinky.ethereumProtocol.mod.LogEntry
}
