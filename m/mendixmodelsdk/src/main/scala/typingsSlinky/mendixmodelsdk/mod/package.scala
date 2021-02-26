package typingsSlinky.mendixmodelsdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def MAX_METAMODEL_VERSION: java.lang.String = typingsSlinky.mendixmodelsdk.mod.^.asInstanceOf[js.Dynamic].selectDynamic("MAX_METAMODEL_VERSION").asInstanceOf[java.lang.String]
  
  @scala.inline
  def SDK_VERSION: java.lang.String = typingsSlinky.mendixmodelsdk.mod.^.asInstanceOf[js.Dynamic].selectDynamic("SDK_VERSION").asInstanceOf[java.lang.String]
  
  @scala.inline
  def beginTransaction(model: typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel): typingsSlinky.mendixmodelsdk.transactionManagerMod.Transaction = typingsSlinky.mendixmodelsdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("beginTransaction")(model.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.mendixmodelsdk.transactionManagerMod.Transaction]
  @scala.inline
  def beginTransaction(
    model: typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel,
    options: typingsSlinky.mendixmodelsdk.transactionManagerMod.ITransactionOptions
  ): typingsSlinky.mendixmodelsdk.transactionManagerMod.Transaction = (typingsSlinky.mendixmodelsdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("beginTransaction")(model.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.mendixmodelsdk.transactionManagerMod.Transaction]
  
  @scala.inline
  def createElementFromJSON(
    model: typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel,
    json: typingsSlinky.mendixmodelsdk.transportInterfacesMod.IAbstractElementJson
  ): typingsSlinky.mendixmodelsdk.elementsMod.Element[typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel] = (typingsSlinky.mendixmodelsdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElementFromJSON")(model.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.mendixmodelsdk.elementsMod.Element[typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel]]
  @scala.inline
  def createElementFromJSON(
    model: typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel,
    json: typingsSlinky.mendixmodelsdk.transportInterfacesMod.IAbstractElementJson,
    idToStructureMap: typingsSlinky.mendixmodelsdk.utilsMod.utils.IMap[
      typingsSlinky.mendixmodelsdk.structuresMod.Structure[
        typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel, 
        typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer | scala.Null
      ]
    ]
  ): typingsSlinky.mendixmodelsdk.elementsMod.Element[typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel] = (typingsSlinky.mendixmodelsdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElementFromJSON")(model.asInstanceOf[js.Any], json.asInstanceOf[js.Any], idToStructureMap.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.mendixmodelsdk.elementsMod.Element[typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel]]
  
  @scala.inline
  def createModelUnitFromJSON(
    containerUnit: typingsSlinky.mendixmodelsdk.unitsMod.IStructuralUnit,
    containmentName: java.lang.String,
    contents: typingsSlinky.mendixmodelsdk.transportInterfacesMod.IAbstractElementJson
  ): typingsSlinky.mendixmodelsdk.unitsMod.ModelUnit[typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel] = (typingsSlinky.mendixmodelsdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createModelUnitFromJSON")(containerUnit.asInstanceOf[js.Any], containmentName.asInstanceOf[js.Any], contents.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.mendixmodelsdk.unitsMod.ModelUnit[typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel]]
  
  @scala.inline
  def instantiateChildElement(
    parent: typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement[
      typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel, 
      typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
    ]
  ): typingsSlinky.mendixmodelsdk.elementsMod.Element[typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel] | scala.Null = typingsSlinky.mendixmodelsdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("instantiateChildElement")(parent.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.mendixmodelsdk.elementsMod.Element[typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel] | scala.Null]
  @scala.inline
  def instantiateChildElement(
    parent: typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement[
      typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel, 
      typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
    ],
    value: typingsSlinky.mendixmodelsdk.transportInterfacesMod.IAbstractElementJson
  ): typingsSlinky.mendixmodelsdk.elementsMod.Element[typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel] | scala.Null = (typingsSlinky.mendixmodelsdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("instantiateChildElement")(parent.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.mendixmodelsdk.elementsMod.Element[typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel] | scala.Null]
  
  @scala.inline
  def isNamedElement(element: typingsSlinky.mendixmodelsdk.structuresMod.IStructure): /* is mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/properties/LocalByNameReferenceProperty.INamedElement */ scala.Boolean = typingsSlinky.mendixmodelsdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isNamedElement")(element.asInstanceOf[js.Any]).asInstanceOf[/* is mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/properties/LocalByNameReferenceProperty.INamedElement */ scala.Boolean]
  
  @scala.inline
  def runInTransaction[T](
    model: typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel,
    action: js.Function0[js.Promise[T]]
  ): js.Promise[T] = (typingsSlinky.mendixmodelsdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("runInTransaction")(model.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  @scala.inline
  def runInTransaction[T](
    model: typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel,
    options: typingsSlinky.mendixmodelsdk.transactionManagerMod.ITransactionOptions,
    action: js.Function0[js.Promise[T]]
  ): js.Promise[T] = (typingsSlinky.mendixmodelsdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("runInTransaction")(model.asInstanceOf[js.Any], options.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  @scala.inline
  def runInTransaction_T_T[T](model: typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel, action: js.Function0[T]): T = (typingsSlinky.mendixmodelsdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("runInTransaction")(model.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def runInTransaction_T_T[T](
    model: typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel,
    options: typingsSlinky.mendixmodelsdk.transactionManagerMod.ITransactionOptions,
    action: js.Function0[T]
  ): T = (typingsSlinky.mendixmodelsdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("runInTransaction")(model.asInstanceOf[js.Any], options.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def sendListChangeDeltas[T, P](
    property: (typingsSlinky.mendixmodelsdk.abstractPropertyMod.AbstractProperty[js.Array[T], typingsSlinky.mendixmodelsdk.instancesMod.IList[P]]) with typingsSlinky.mendixmodelsdk.anon.ToRawChangeValue[P],
    change: typingsSlinky.mobx.observablearrayMod.IArrayWillChange[P]
  ): scala.Unit = (typingsSlinky.mendixmodelsdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sendListChangeDeltas")(property.asInstanceOf[js.Any], change.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def sendListChangeDeltas[T, P](
    property: (typingsSlinky.mendixmodelsdk.abstractPropertyMod.AbstractProperty[js.Array[T], typingsSlinky.mendixmodelsdk.instancesMod.IList[P]]) with typingsSlinky.mendixmodelsdk.anon.ToRawChangeValue[P],
    change: typingsSlinky.mobx.observablearrayMod.IArrayWillSplice[P]
  ): scala.Unit = (typingsSlinky.mendixmodelsdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sendListChangeDeltas")(property.asInstanceOf[js.Any], change.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
}
