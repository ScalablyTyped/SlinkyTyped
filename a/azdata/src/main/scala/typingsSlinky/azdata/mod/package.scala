package typingsSlinky.azdata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type DivBuilder = typingsSlinky.azdata.mod.ContainerBuilder[
    typingsSlinky.azdata.mod.DivContainer, 
    typingsSlinky.azdata.mod.DivLayout, 
    typingsSlinky.azdata.mod.DivItemLayout
  ]
  
  type EditCommitParams = typingsSlinky.azdata.mod.IEditSessionOperationParams
  
  type EditCreateRowParams = typingsSlinky.azdata.mod.IEditSessionOperationParams
  
  type EditDeleteRowParams = typingsSlinky.azdata.mod.IEditRowOperationParams
  
  type EditDisposeParams = typingsSlinky.azdata.mod.IEditSessionOperationParams
  
  type EditRevertCellResult = typingsSlinky.azdata.mod.EditCellResult
  
  type EditRevertRowParams = typingsSlinky.azdata.mod.IEditRowOperationParams
  
  type EditUpdateCellResult = typingsSlinky.azdata.mod.EditCellResult
  
  type FlexBuilder = typingsSlinky.azdata.mod.ContainerBuilder[
    typingsSlinky.azdata.mod.FlexContainer, 
    typingsSlinky.azdata.mod.FlexLayout, 
    typingsSlinky.azdata.mod.FlexItemLayout
  ]
  
  type FlexContainer = typingsSlinky.azdata.mod.Container[typingsSlinky.azdata.mod.FlexLayout, typingsSlinky.azdata.mod.FlexItemLayout]
  
  type FormContainer = typingsSlinky.azdata.mod.Container[typingsSlinky.azdata.mod.FormLayout, typingsSlinky.azdata.mod.FormItemLayout]
  
  type GroupBuilder = typingsSlinky.azdata.mod.ContainerBuilder[
    typingsSlinky.azdata.mod.GroupContainer, 
    typingsSlinky.azdata.mod.GroupLayout, 
    typingsSlinky.azdata.mod.GroupItemLayout
  ]
  
  type NavContainer = typingsSlinky.azdata.mod.Container[js.Any, js.Any]
  
  type SplitViewBuilder = typingsSlinky.azdata.mod.ContainerBuilder[
    typingsSlinky.azdata.mod.SplitViewContainer, 
    typingsSlinky.azdata.mod.SplitViewLayout, 
    typingsSlinky.azdata.mod.FlexItemLayout
  ]
  
  type SplitViewContainer = typingsSlinky.azdata.mod.Container[typingsSlinky.azdata.mod.SplitViewLayout, typingsSlinky.azdata.mod.FlexItemLayout]
  
  type ToolbarContainer = typingsSlinky.azdata.mod.Container[typingsSlinky.azdata.mod.ToolbarLayout, js.Any]
}
