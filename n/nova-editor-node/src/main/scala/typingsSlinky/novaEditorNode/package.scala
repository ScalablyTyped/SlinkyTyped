package typingsSlinky

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object novaEditorNode {
  
  type AssistantArray[T] = js.Array[T] | js.Promise[js.Array[T]]
  
  /// https://novadocs.panic.com/api-reference/assistants-registry/
  type AssistantsRegistrySelector = java.lang.String | typingsSlinky.novaEditorNode.anon.Syntax
  
  type ColorComponents = js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  
  /// https://novadocs.panic.com/api-reference/configuration/
  type ConfigurationValue = java.lang.String | scala.Double | js.Array[java.lang.String] | scala.Boolean
  
  /// https://novadocs.panic.com/api-reference/file-system/
  type FileSystemBitField = scala.Double with typingsSlinky.novaEditorNode.anon.T
  
  type ReadableStream[T] = js.Any
  
  /// https://docs.nova.app/api-reference/task/
  type TaskName = java.lang.String with typingsSlinky.novaEditorNode.anon.Type
  
  type TimerHandler = java.lang.String | js.Function
  
  /// https://novadocs.panic.com/api-reference/credentials/
  type User = js.Any
  
  type WritableStream[T] = js.Any
}
