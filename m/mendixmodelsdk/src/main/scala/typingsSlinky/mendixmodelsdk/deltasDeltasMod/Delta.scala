package typingsSlinky.mendixmodelsdk.deltasDeltasMod

import typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.ATTACH_ELEMENT
import typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.CREATE_ELEMENT_TREE
import typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.CREATE_UNIT_TREE
import typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.DELETE_ELEMENT
import typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.DELETE_UNIT
import typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.DETACH_ELEMENT
import typingsSlinky.mendixmodelsdk.mendixmodelsdkStrings.UPDATE_PROPERTY_VALUE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mendixmodelsdk.deltasDeltasMod.ICreateElementTreeDelta
  - typingsSlinky.mendixmodelsdk.deltasDeltasMod.IDeleteElementDelta
  - typingsSlinky.mendixmodelsdk.deltasDeltasMod.IAttachElementDelta
  - typingsSlinky.mendixmodelsdk.deltasDeltasMod.IDetachElementDelta
  - typingsSlinky.mendixmodelsdk.deltasDeltasMod.ICreateUnitTreeDelta
  - typingsSlinky.mendixmodelsdk.deltasDeltasMod.IDeleteUnitDelta
  - typingsSlinky.mendixmodelsdk.deltasDeltasMod.IUpdatePropertyValueDelta
*/
trait Delta extends StObject
object Delta {
  
  @scala.inline
  def IAttachElementDelta(
    deltaType: ATTACH_ELEMENT,
    elementId: String,
    newParentId: String,
    newParentPropertyName: String,
    unitId: String
  ): typingsSlinky.mendixmodelsdk.deltasDeltasMod.IAttachElementDelta = {
    val __obj = js.Dynamic.literal(deltaType = deltaType.asInstanceOf[js.Any], elementId = elementId.asInstanceOf[js.Any], newParentId = newParentId.asInstanceOf[js.Any], newParentPropertyName = newParentPropertyName.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mendixmodelsdk.deltasDeltasMod.IAttachElementDelta]
  }
  
  @scala.inline
  def ICreateElementTreeDelta(
    deltaType: CREATE_ELEMENT_TREE,
    elementTree: IStructureJSON,
    parentId: String,
    parentPropertyName: String,
    unitId: String
  ): typingsSlinky.mendixmodelsdk.deltasDeltasMod.ICreateElementTreeDelta = {
    val __obj = js.Dynamic.literal(deltaType = deltaType.asInstanceOf[js.Any], elementTree = elementTree.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any], parentPropertyName = parentPropertyName.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mendixmodelsdk.deltasDeltasMod.ICreateElementTreeDelta]
  }
  
  @scala.inline
  def ICreateUnitTreeDelta(
    containerId: String,
    containmentName: String,
    contentType: String,
    deltaType: CREATE_UNIT_TREE,
    unitId: String,
    unitTree: IStructureJSON
  ): typingsSlinky.mendixmodelsdk.deltasDeltasMod.ICreateUnitTreeDelta = {
    val __obj = js.Dynamic.literal(containerId = containerId.asInstanceOf[js.Any], containmentName = containmentName.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], deltaType = deltaType.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any], unitTree = unitTree.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mendixmodelsdk.deltasDeltasMod.ICreateUnitTreeDelta]
  }
  
  @scala.inline
  def IDeleteElementDelta(deltaType: DELETE_ELEMENT, elementId: String, unitId: String): typingsSlinky.mendixmodelsdk.deltasDeltasMod.IDeleteElementDelta = {
    val __obj = js.Dynamic.literal(deltaType = deltaType.asInstanceOf[js.Any], elementId = elementId.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mendixmodelsdk.deltasDeltasMod.IDeleteElementDelta]
  }
  
  @scala.inline
  def IDeleteUnitDelta(deltaType: DELETE_UNIT, unitId: String): typingsSlinky.mendixmodelsdk.deltasDeltasMod.IDeleteUnitDelta = {
    val __obj = js.Dynamic.literal(deltaType = deltaType.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mendixmodelsdk.deltasDeltasMod.IDeleteUnitDelta]
  }
  
  @scala.inline
  def IDetachElementDelta(deltaType: DETACH_ELEMENT, elementId: String, unitId: String): typingsSlinky.mendixmodelsdk.deltasDeltasMod.IDetachElementDelta = {
    val __obj = js.Dynamic.literal(deltaType = deltaType.asInstanceOf[js.Any], elementId = elementId.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mendixmodelsdk.deltasDeltasMod.IDetachElementDelta]
  }
  
  @scala.inline
  def IUpdatePropertyValueDelta(
    deltaType: UPDATE_PROPERTY_VALUE,
    elementId: String,
    mutator: Mutator,
    propertyName: String,
    unitId: String
  ): typingsSlinky.mendixmodelsdk.deltasDeltasMod.IUpdatePropertyValueDelta = {
    val __obj = js.Dynamic.literal(deltaType = deltaType.asInstanceOf[js.Any], elementId = elementId.asInstanceOf[js.Any], mutator = mutator.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.mendixmodelsdk.deltasDeltasMod.IUpdatePropertyValueDelta]
  }
}
