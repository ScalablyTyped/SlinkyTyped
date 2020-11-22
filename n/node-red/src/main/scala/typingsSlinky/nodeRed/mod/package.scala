package typingsSlinky.nodeRed

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type EditorNodeCredential = typingsSlinky.nodeRedEditorClient.mod.NodeCredential
  
  type EditorNodeCredentials[T] = typingsSlinky.nodeRedEditorClient.mod.NodeCredentials[T]
  
  /**
    * Node Definition
    * Read more: https://nodered.org/docs/creating-nodes/node-html#node-definition
    */
  type EditorNodeDef[TProps /* <: typingsSlinky.nodeRed.mod.EditorNodeProperties */, TCreds, TInstProps /* <: TProps */] = typingsSlinky.nodeRedEditorClient.mod.NodeDef[TProps, TCreds, TInstProps]
  
  type EditorNodeInstance[TProps /* <: typingsSlinky.nodeRed.mod.EditorNodeProperties */] = typingsSlinky.nodeRedEditorClient.mod.NodeInstance[TProps]
  
  /**
    * Node properties
    * Read more: https://nodered.org/docs/creating-nodes/properties
    */
  type EditorNodeProperties = typingsSlinky.nodeRedEditorClient.mod.NodeProperties
  
  /**
    * Properties definitions (`defaults` object)
    * Read more: https://nodered.org/docs/creating-nodes/properties
    */
  type EditorNodePropertiesDef[TProps /* <: typingsSlinky.nodeRed.mod.EditorNodeProperties */, TInstProps /* <: TProps */] = typingsSlinky.nodeRedEditorClient.mod.NodePropertiesDef[TProps, TInstProps]
  
  /********************************************************************
    * Type shortcuts for writing the editor side of nodes (.html file)
    ********************************************************************/
  /**
    * Property definition
    * Read more: https://nodered.org/docs/creating-nodes/properties#property-definitions
    */
  type EditorNodePropertyDef[TVal, TInstProps /* <: typingsSlinky.nodeRed.mod.EditorNodeProperties */] = typingsSlinky.nodeRedEditorClient.mod.NodePropertyDef[TVal, TInstProps]
  
  /**
    * Type def for the global `RED` in the node .html files.
    * Should be used to access `RED.nodes.registerType` function
    * registering a node with the editor.
    *
    * Example:
    * ```
    * declare const RED: EditorRED;
    *
    * RED.nodes.registerType<
    *   MyNodeProps
    * >("my-node", {
    *   ...
    * })
    * ```
    *
    */
  type EditorRED = typingsSlinky.nodeRedEditorClient.mod.RED
  
  type EditorWidgetEditableList = typingsSlinky.nodeRedEditorClient.mod.WidgetEditableList
  
  /**
    * WIDGETS
    */
  type EditorWidgetEditableListOptions[T] = typingsSlinky.nodeRedEditorClient.mod.WidgetEditableListOptions[T]
  
  type EditorWidgetTypedInput = typingsSlinky.nodeRedEditorClient.mod.WidgetTypedInput
  
  type EditorWidgetTypedInputOptions = typingsSlinky.nodeRedEditorClient.mod.WidgetTypedInputOptions
  
  type EditorWidgetTypedInputType = typingsSlinky.nodeRedEditorClient.mod.WidgetTypedInputType
  
  type EditorWidgetTypedInputTypeDefinition = typingsSlinky.nodeRedEditorClient.mod.WidgetTypedInputTypeDefinition
  
  type Node[TCreds /* <: js.Object */] = typingsSlinky.nodeRedRegistry.mod.Node[TCreds]
  
  type NodeAPI[TSets /* <: typingsSlinky.nodeRed.mod.NodeAPISettingsWithData */] = typingsSlinky.nodeRedRegistry.mod.NodeAPI[TSets]
  
  type NodeAPISettingsWithData = typingsSlinky.nodeRedRegistry.mod.NodeAPISettingsWithData
  
  type NodeConstructor[TNode /* <: typingsSlinky.nodeRed.mod.Node[TCreds] */, TNodeDef /* <: typingsSlinky.nodeRed.mod.NodeDef */, TCreds] = typingsSlinky.nodeRedRegistry.mod.NodeConstructor[TNode, TNodeDef, TCreds]
  
  type NodeContext = typingsSlinky.nodeRedRegistry.mod.NodeContext
  
  type NodeContextData = typingsSlinky.nodeRedRegistry.mod.NodeContextData
  
  type NodeCredential = typingsSlinky.nodeRedRegistry.mod.NodeCredential
  
  type NodeCredentials[TCreds] = typingsSlinky.nodeRedRegistry.mod.NodeCredentials[TCreds]
  
  type NodeDef = typingsSlinky.nodeRedRegistry.mod.NodeDef
  
  /*******************************************************************
    * Type shortcuts for writing the runtime side of nodes (.js file)
    *******************************************************************/
  /**
    * Type def for the functions that should be exported
    * by the node .js files.
    */
  type NodeInitializer[TSets /* <: typingsSlinky.nodeRed.mod.NodeAPISettingsWithData */] = typingsSlinky.nodeRedRegistry.mod.NodeInitializer[TSets]
  
  type NodeMessage = typingsSlinky.nodeRedRegistry.mod.NodeMessage
  
  type NodeMessageInFlow = typingsSlinky.nodeRedRegistry.mod.NodeMessageInFlow
  
  type NodeMessageParts = typingsSlinky.nodeRedRegistry.mod.NodeMessageParts
  
  type NodeSetting[T] = typingsSlinky.nodeRedRegistry.mod.NodeSetting[T]
  
  type NodeSettings[TSets] = typingsSlinky.nodeRedRegistry.mod.NodeSettings[TSets]
  
  type NodeStatus = typingsSlinky.nodeRedRegistry.mod.NodeStatus
  
  type NodeStatusFill = typingsSlinky.nodeRedRegistry.mod.NodeStatusFill
  
  type NodeStatusShape = typingsSlinky.nodeRedRegistry.mod.NodeStatusShape
}
