package typingsSlinky.nodeRedEditorClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CommSubscriber = js.Function2[/* topic */ java.lang.String, /* data */ js.Any, scala.Unit]
  
  type EditorClientModule = typingsSlinky.nodeRedEditorClient.nodeRedEditorClientBooleans.`false`
  
  type HistoryEvent = typingsSlinky.nodeRedEditorClient.anon.Callback with (typingsSlinky.nodeRedEditorClient.anon.Events | typingsSlinky.nodeRedEditorClient.anon.Changed | typingsSlinky.nodeRedEditorClient.anon.Groups | typingsSlinky.nodeRedEditorClient.anon.Changes | typingsSlinky.nodeRedEditorClient.anon.AddToGroup | typingsSlinky.nodeRedEditorClient.anon.CreatedLinks | typingsSlinky.nodeRedEditorClient.anon.Links | typingsSlinky.nodeRedEditorClient.anon.MovedNodes | typingsSlinky.nodeRedEditorClient.anon.Order | typingsSlinky.nodeRedEditorClient.anon.T | typingsSlinky.nodeRedEditorClient.anon.GroupsT | typingsSlinky.nodeRedEditorClient.anon.Nodes | typingsSlinky.nodeRedEditorClient.anon.NodesT)
  
  type NodeCredentials[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: @node-red/editor-client.@node-red/editor-client.NodeCredential}
    */ typingsSlinky.nodeRedEditorClient.nodeRedEditorClientStrings.NodeCredentials with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type NodeInstance[TProps /* <: typingsSlinky.nodeRedEditorClient.mod.NodeProperties */] = TProps with typingsSlinky.nodeRedEditorClient.anon._empty
  
  /**
    * Properties definitions (`defaults` object)
    * Read more: https://nodered.org/docs/creating-nodes/properties
    */
  type NodePropertiesDef[TProps /* <: typingsSlinky.nodeRedEditorClient.mod.NodeProperties */, TInstProps /* <: TProps */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TProps ]: @node-red/editor-client.@node-red/editor-client.NodePropertyDef<TProps[K], TInstProps>}
    */ typingsSlinky.nodeRedEditorClient.nodeRedEditorClientStrings.NodePropertiesDef with org.scalablytyped.runtime.TopLevel[TProps]
}
