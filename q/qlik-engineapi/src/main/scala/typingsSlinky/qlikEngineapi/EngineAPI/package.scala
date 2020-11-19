package typingsSlinky.qlikEngineapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object EngineAPI {
  
  /**
    * BookmarkListObject width extend GenericObject
    */
  type IBookmarkListObject = typingsSlinky.qlikEngineapi.EngineAPI.IGenericObjectPrototype[
    typingsSlinky.qlikEngineapi.EngineAPI.IGenericBookmarkListProperties, 
    typingsSlinky.qlikEngineapi.EngineAPI.IGenericBookmarkListLayout
  ]
  
  type IDimensionListObject = typingsSlinky.qlikEngineapi.EngineAPI.IGenericObjectPrototype[
    typingsSlinky.qlikEngineapi.EngineAPI.IGenericDimensionsListProperties, 
    typingsSlinky.qlikEngineapi.EngineAPI.IGenericDimensionListLayout
  ]
  
  /**
    * FieldListObject width extend GenericObject
    */
  type IFieldListObject = typingsSlinky.qlikEngineapi.EngineAPI.IGenericObjectPrototype[
    typingsSlinky.qlikEngineapi.EngineAPI.IGenericFieldListProperties, 
    typingsSlinky.qlikEngineapi.EngineAPI.IGenericFieldLayout
  ]
  
  /**
    * GenericBookmarkProperties width extend GenericProperties
    */
  type IGenericBookmarkProperties = typingsSlinky.qlikEngineapi.EngineAPI.IGenericProperties
  
  type IGenericDerivedFieldProperties = typingsSlinky.qlikEngineapi.EngineAPI.IGenericProperties
  
  /**
    * GenericList...
    */
  type IGenericList = typingsSlinky.qlikEngineapi.EngineAPI.IGenericObjectPrototype[
    typingsSlinky.qlikEngineapi.EngineAPI.IGenericListProperties, 
    typingsSlinky.qlikEngineapi.EngineAPI.IGenericListLayout
  ]
  
  /**
    * HyperCubeObject width extend GenericObjectPrototype<GenericHyperCubeProperties, GenericHyperCubeLayout>
    */
  type IHyperCubeObject = typingsSlinky.qlikEngineapi.EngineAPI.IGenericObjectPrototype[
    typingsSlinky.qlikEngineapi.EngineAPI.IGenericHyperCubeProperties, 
    typingsSlinky.qlikEngineapi.EngineAPI.IGenericHyperCubeLayout
  ]
  
  /**
    * IMeassureListObject
    */
  type IMeassureListObject = typingsSlinky.qlikEngineapi.EngineAPI.IGenericObjectPrototype[
    typingsSlinky.qlikEngineapi.EngineAPI.IGenericMeasureListProperties, 
    typingsSlinky.qlikEngineapi.EngineAPI.IGenericMeasureListLayout
  ]
  
  /**
    * NxCellRows...
    */
  type INxCellRows = js.Array[typingsSlinky.qlikEngineapi.EngineAPI.INxCell]
  
  /**
    * VariableListObject width extend GenericObject
    */
  type IVariableListObject = typingsSlinky.qlikEngineapi.EngineAPI.IGenericObjectPrototype[
    typingsSlinky.qlikEngineapi.EngineAPI.IGenericVariableListProperties, 
    typingsSlinky.qlikEngineapi.EngineAPI.IGenericVariableListLayout
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.N
    - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.H
    - typingsSlinky.qlikEngineapi.qlikEngineapiStrings.C
    - java.lang.String
  */
  type NxGrpType = typingsSlinky.qlikEngineapi.EngineAPI._NxGrpType | java.lang.String
}
