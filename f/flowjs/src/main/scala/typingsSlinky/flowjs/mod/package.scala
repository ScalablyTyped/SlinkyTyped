package typingsSlinky.flowjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CatchAllCallbackArguments = js.Array[org.scalajs.dom.raw.Event]
  
  type CompleteCallbackArguments = js.Array[js.Any]
  
  type ErrorCallbackArguments = js.Tuple3[
    java.lang.String, 
    typingsSlinky.flowjs.mod.FlowFile, 
    typingsSlinky.flowjs.mod.FlowChunk
  ]
  
  type FileAddedCallbackArguments = js.Tuple2[typingsSlinky.flowjs.mod.FlowFile, org.scalajs.dom.raw.Event]
  
  type FileErrorCallbackArguments = js.Tuple3[
    typingsSlinky.flowjs.mod.FlowFile, 
    java.lang.String, 
    typingsSlinky.flowjs.mod.FlowChunk
  ]
  
  type FileProgressCallbackArguments = js.Tuple2[typingsSlinky.flowjs.mod.FlowFile, typingsSlinky.flowjs.mod.FlowChunk]
  
  type FileRemovedCallbackArguments = js.Array[typingsSlinky.flowjs.mod.FlowFile]
  
  type FileRetryCallbackArguments = js.Tuple2[typingsSlinky.flowjs.mod.FlowFile, typingsSlinky.flowjs.mod.FlowChunk]
  
  type FileSuccessCallbackArguments = js.Tuple3[
    typingsSlinky.flowjs.mod.FlowFile, 
    java.lang.String, 
    typingsSlinky.flowjs.mod.FlowChunk
  ]
  
  type FilesAddedCallbackArguments = js.Tuple2[js.Array[typingsSlinky.flowjs.mod.FlowFile], org.scalajs.dom.raw.Event]
  
  type FilesSubmittedCallbackArguments = js.Tuple2[js.Array[typingsSlinky.flowjs.mod.FlowFile], org.scalajs.dom.raw.Event]
  
  type FlowEvent = typingsSlinky.flowjs.mod.CompleteCallbackArguments | typingsSlinky.flowjs.mod.UploadStartCallbackArguments | typingsSlinky.flowjs.mod.ProgressCallbackArguments | typingsSlinky.flowjs.mod.FileSuccessCallbackArguments | typingsSlinky.flowjs.mod.FilesSubmittedCallbackArguments | typingsSlinky.flowjs.mod.FileAddedCallbackArguments | typingsSlinky.flowjs.mod.FileRetryCallbackArguments | typingsSlinky.flowjs.mod.ErrorCallbackArguments | typingsSlinky.flowjs.mod.FileRemovedCallbackArguments | typingsSlinky.flowjs.mod.FileProgressCallbackArguments | typingsSlinky.flowjs.mod.FileErrorCallbackArguments | typingsSlinky.flowjs.mod.FilesAddedCallbackArguments | typingsSlinky.flowjs.mod.CatchAllCallbackArguments
  
  type FlowEventFromEventName[T /* <: typingsSlinky.flowjs.mod.EventName */] = /* import warning: importer.ImportType#apply Failed type conversion: flowjs.flowjs.FlowEventMap[T] */ js.Any
  
  type FlowEventTypeFromFlowEvent[T /* <: typingsSlinky.flowjs.mod.FlowEvent */] = js.Any
  
  type ProgressCallbackArguments = js.Array[js.Any]
  
  type UploadStartCallbackArguments = js.Array[js.Any]
}
