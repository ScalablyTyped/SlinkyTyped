package typingsSlinky.mobxStateTree

import typingsSlinky.mobxStateTree.actionContextMod.IActionContext
import typingsSlinky.mobxStateTree.actionMod.IMiddlewareEvent
import typingsSlinky.mobxStateTree.actionMod.IMiddlewareHandler
import typingsSlinky.mobxStateTree.anon.AcceptsUndefined
import typingsSlinky.mobxStateTree.anon.Fn0
import typingsSlinky.mobxStateTree.anon.Fn1
import typingsSlinky.mobxStateTree.anon.Fn2
import typingsSlinky.mobxStateTree.anon.FnCall
import typingsSlinky.mobxStateTree.anon.FnCallDefaultValue
import typingsSlinky.mobxStateTree.anon.FnCallNameABCDEFGHI
import typingsSlinky.mobxStateTree.anon.FnCallNameProperties
import typingsSlinky.mobxStateTree.anon.FnCallNameType
import typingsSlinky.mobxStateTree.anon.FnCallNameTypePredicateMessage
import typingsSlinky.mobxStateTree.anon.FnCallOptions
import typingsSlinky.mobxStateTree.anon.FnCallOptionsABCDEFGHI
import typingsSlinky.mobxStateTree.anon.FnCallSubTypeOptions
import typingsSlinky.mobxStateTree.anon.FnCallSubtype
import typingsSlinky.mobxStateTree.anon.FnCallType
import typingsSlinky.mobxStateTree.anon.FnCallTypeDefaultValueOrFunctionOptionalValues
import typingsSlinky.mobxStateTree.anon.FnCallTypeProcessorsName
import typingsSlinky.mobxStateTree.anon.FnCallValue
import typingsSlinky.mobxStateTree.anon.`0`
import typingsSlinky.mobxStateTree.arrayMod.IArrayType
import typingsSlinky.mobxStateTree.createActionTrackingMiddleware2Mod.IActionTrackingMiddleware2Hooks
import typingsSlinky.mobxStateTree.createActionTrackingMiddlewareMod.IActionTrackingMiddlewareHooks
import typingsSlinky.mobxStateTree.customMod.CustomTypeOptions
import typingsSlinky.mobxStateTree.enumerationMod.UnionStringArray
import typingsSlinky.mobxStateTree.flowMod.FlowReturn
import typingsSlinky.mobxStateTree.identifierMod.ReferenceIdentifier
import typingsSlinky.mobxStateTree.jsonPatchMod.IJsonPatch
import typingsSlinky.mobxStateTree.livelinessCheckingMod.LivelinessMode
import typingsSlinky.mobxStateTree.mapMod.IMapType
import typingsSlinky.mobxStateTree.maybeMod.IMaybe
import typingsSlinky.mobxStateTree.maybeMod.IMaybeNull
import typingsSlinky.mobxStateTree.modelMod.CustomJoin
import typingsSlinky.mobxStateTree.modelMod.IAnyModelType
import typingsSlinky.mobxStateTree.modelMod.IModelType
import typingsSlinky.mobxStateTree.modelMod.ModelCreationType2
import typingsSlinky.mobxStateTree.modelMod.ModelInstanceType
import typingsSlinky.mobxStateTree.modelMod.ModelProperties
import typingsSlinky.mobxStateTree.modelMod.ModelPropertiesDeclaration
import typingsSlinky.mobxStateTree.modelMod.ModelPropertiesDeclarationToProperties
import typingsSlinky.mobxStateTree.modelMod.ModelSnapshotType2
import typingsSlinky.mobxStateTree.mstOperationsMod.IModelReflectionData
import typingsSlinky.mobxStateTree.mstOperationsMod.IModelReflectionPropertiesData
import typingsSlinky.mobxStateTree.mstOperationsMod.IPatchRecorder
import typingsSlinky.mobxStateTree.mstOperationsMod.TypeOrStateTreeNodeToStateTreeNode
import typingsSlinky.mobxStateTree.nodeUtilsMod.IAnyStateTreeNode
import typingsSlinky.mobxStateTree.nodeUtilsMod.IStateTreeNode
import typingsSlinky.mobxStateTree.onActionMod.IActionRecorder
import typingsSlinky.mobxStateTree.onActionMod.ISerializedActionCall
import typingsSlinky.mobxStateTree.optionalMod.IOptionalIType
import typingsSlinky.mobxStateTree.optionalMod.OptionalDefaultValueOrFunction
import typingsSlinky.mobxStateTree.optionalMod.ValidOptionalValues
import typingsSlinky.mobxStateTree.referenceMod.IReferenceType
import typingsSlinky.mobxStateTree.referenceMod.ReferenceOptions
import typingsSlinky.mobxStateTree.referenceMod.ReferenceOptionsGetSet
import typingsSlinky.mobxStateTree.snapshotProcessorMod.ISnapshotProcessor
import typingsSlinky.mobxStateTree.snapshotProcessorMod.ISnapshotProcessors
import typingsSlinky.mobxStateTree.snapshotProcessorMod.NotCustomized
import typingsSlinky.mobxStateTree.typeMod.ExtractCSTWithSTN
import typingsSlinky.mobxStateTree.typeMod.IAnyComplexType
import typingsSlinky.mobxStateTree.typeMod.IAnyType
import typingsSlinky.mobxStateTree.typeMod.ISimpleType
import typingsSlinky.mobxStateTree.typeMod.IType
import typingsSlinky.mobxStateTree.unionMod.ITypeUnion
import typingsSlinky.mobxStateTree.unionMod.UnionOptions
import typingsSlinky.mobxStateTree.utilsMod.IDisposer
import typingsSlinky.std.Generator
import typingsSlinky.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalMod {
  
  @JSImport("mobx-state-tree/dist/internal", "DatePrimitive")
  @js.native
  val DatePrimitive: IType[Double | js.Date, Double, js.Date] = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "Hook")
  @js.native
  object Hook extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.mobxStateTree.hookMod.Hook with String] = js.native
    
    /* "afterAttach" */ val afterAttach: typingsSlinky.mobxStateTree.hookMod.Hook.afterAttach with String = js.native
    
    /* "afterCreate" */ val afterCreate: typingsSlinky.mobxStateTree.hookMod.Hook.afterCreate with String = js.native
    
    /* "afterCreationFinalization" */ val afterCreationFinalization: typingsSlinky.mobxStateTree.hookMod.Hook.afterCreationFinalization with String = js.native
    
    /* "beforeDestroy" */ val beforeDestroy: typingsSlinky.mobxStateTree.hookMod.Hook.beforeDestroy with String = js.native
    
    /* "beforeDetach" */ val beforeDetach: typingsSlinky.mobxStateTree.hookMod.Hook.beforeDetach with String = js.native
  }
  
  @JSImport("mobx-state-tree/dist/internal", "addDisposer")
  @js.native
  def addDisposer(target: IAnyStateTreeNode, disposer: IDisposer): IDisposer = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "addMiddleware")
  @js.native
  def addMiddleware(target: IAnyStateTreeNode, handler: IMiddlewareHandler): IDisposer = js.native
  @JSImport("mobx-state-tree/dist/internal", "addMiddleware")
  @js.native
  def addMiddleware(target: IAnyStateTreeNode, handler: IMiddlewareHandler, includeHooks: Boolean): IDisposer = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "applyAction")
  @js.native
  def applyAction(target: IAnyStateTreeNode, actions: js.Array[ISerializedActionCall]): Unit = js.native
  @JSImport("mobx-state-tree/dist/internal", "applyAction")
  @js.native
  def applyAction(target: IAnyStateTreeNode, actions: ISerializedActionCall): Unit = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "applyPatch")
  @js.native
  def applyPatch(target: IAnyStateTreeNode, patch: js.Array[IJsonPatch]): Unit = js.native
  @JSImport("mobx-state-tree/dist/internal", "applyPatch")
  @js.native
  def applyPatch(target: IAnyStateTreeNode, patch: IJsonPatch): Unit = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "applySnapshot")
  @js.native
  def applySnapshot[C](target: IStateTreeNode[IType[C, _, _]], snapshot: C): Unit = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "array")
  @js.native
  def array[IT /* <: IAnyType */](subtype: IT): IArrayType[IT] = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "boolean")
  @js.native
  val boolean: ISimpleType[Boolean] = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "cast")
  @js.native
  def cast(snapshotOrInstance: js.UndefOr[scala.Nothing]): js.UndefOr[scala.Nothing] = js.native
  @JSImport("mobx-state-tree/dist/internal", "cast")
  @js.native
  def cast(snapshotOrInstance: String): String = js.native
  @JSImport("mobx-state-tree/dist/internal", "cast")
  @js.native
  def cast(snapshotOrInstance: Boolean): Boolean = js.native
  @JSImport("mobx-state-tree/dist/internal", "cast")
  @js.native
  def cast(snapshotOrInstance: Double): Double = js.native
  @JSImport("mobx-state-tree/dist/internal", "cast")
  @js.native
  def cast(snapshotOrInstance: Null): Null = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "castFlowReturn")
  @js.native
  def castFlowReturn[T](`val`: T): T = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "castToReferenceSnapshot")
  @js.native
  def castToReferenceSnapshot[I](instance: I): ReferenceIdentifier | I = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "castToSnapshot")
  @js.native
  def castToSnapshot[I](snapshotOrInstance: I): (/* import warning: importer.ImportType#apply Failed type conversion: mobx-state-tree.mobx-state-tree/dist/core/node/node-utils.TypeOfValue<I>['CreationType'] */ js.Any) | I = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "cast")
  @js.native
  def cast_CreationType[O](
    snapshotOrInstance: /* import warning: importer.ImportType#apply Failed type conversion: mobx-state-tree.mobx-state-tree/dist/core/node/node-utils.TypeOfValue<O>['CreationType'] */ js.Any
  ): O = js.native
  @JSImport("mobx-state-tree/dist/internal", "cast")
  @js.native
  def cast_SnapshotType[O](
    snapshotOrInstance: /* import warning: importer.ImportType#apply Failed type conversion: mobx-state-tree.mobx-state-tree/dist/core/node/node-utils.TypeOfValue<O>['SnapshotType'] */ js.Any
  ): O = js.native
  @JSImport("mobx-state-tree/dist/internal", "cast")
  @js.native
  def cast_Type[O](
    snapshotOrInstance: /* import warning: importer.ImportType#apply Failed type conversion: mobx-state-tree.mobx-state-tree/dist/core/node/node-utils.TypeOfValue<O>['Type'] */ js.Any
  ): O = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "clone")
  @js.native
  def clone_[T /* <: IAnyStateTreeNode */](source: T): T = js.native
  @JSImport("mobx-state-tree/dist/internal", "clone")
  @js.native
  def clone_[T /* <: IAnyStateTreeNode */](source: T, keepEnvironment: js.Any): T = js.native
  @JSImport("mobx-state-tree/dist/internal", "clone")
  @js.native
  def clone_[T /* <: IAnyStateTreeNode */](source: T, keepEnvironment: Boolean): T = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "compose")
  @js.native
  def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB](A: IModelType[PA, OA, FCA, FSA], B: IModelType[PB, OB, FCB, FSB]): IModelType[PA with PB, OA with OB, CustomJoin[FCA, FCB], CustomJoin[FSA, FSB]] = js.native
  @JSImport("mobx-state-tree/dist/internal", "compose")
  @js.native
  def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB](name: String, A: IModelType[PA, OA, FCA, FSA], B: IModelType[PB, OB, FCB, FSB]): IModelType[PA with PB, OA with OB, CustomJoin[FCA, FCB], CustomJoin[FSA, FSB]] = js.native
  @JSImport("mobx-state-tree/dist/internal", "compose")
  @js.native
  def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC](A: IModelType[PA, OA, FCA, FSA], B: IModelType[PB, OB, FCB, FSB], C: IModelType[PC, OC, FCC, FSC]): IModelType[
    PA with PB with PC, 
    OA with OB with OC, 
    CustomJoin[FCA, CustomJoin[FCB, FCC]], 
    CustomJoin[FSA, CustomJoin[FSB, FSC]]
  ] = js.native
  @JSImport("mobx-state-tree/dist/internal", "compose")
  @js.native
  def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC](
    name: String,
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC]
  ): IModelType[
    PA with PB with PC, 
    OA with OB with OC, 
    CustomJoin[FCA, CustomJoin[FCB, FCC]], 
    CustomJoin[FSA, CustomJoin[FSB, FSC]]
  ] = js.native
  @JSImport("mobx-state-tree/dist/internal", "compose")
  @js.native
  def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD](
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD]
  ): IModelType[
    PA with PB with PC with PD, 
    OA with OB with OC with OD, 
    CustomJoin[FCA, CustomJoin[FCB, CustomJoin[FCC, FCD]]], 
    CustomJoin[FSA, CustomJoin[FSB, CustomJoin[FSC, FSD]]]
  ] = js.native
  @JSImport("mobx-state-tree/dist/internal", "compose")
  @js.native
  def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD](
    name: String,
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD]
  ): IModelType[
    PA with PB with PC with PD, 
    OA with OB with OC with OD, 
    CustomJoin[FCA, CustomJoin[FCB, CustomJoin[FCC, FCD]]], 
    CustomJoin[FSA, CustomJoin[FSB, CustomJoin[FSC, FSD]]]
  ] = js.native
  @JSImport("mobx-state-tree/dist/internal", "compose")
  @js.native
  def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE](
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE]
  ): IModelType[
    PA with PB with PC with PD with PE, 
    OA with OB with OC with OD with OE, 
    CustomJoin[FCA, CustomJoin[FCB, CustomJoin[FCC, CustomJoin[FCD, FCE]]]], 
    CustomJoin[FSA, CustomJoin[FSB, CustomJoin[FSC, CustomJoin[FSD, FSE]]]]
  ] = js.native
  @JSImport("mobx-state-tree/dist/internal", "compose")
  @js.native
  def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE](
    name: String,
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE]
  ): IModelType[
    PA with PB with PC with PD with PE, 
    OA with OB with OC with OD with OE, 
    CustomJoin[FCA, CustomJoin[FCB, CustomJoin[FCC, CustomJoin[FCD, FCE]]]], 
    CustomJoin[FSA, CustomJoin[FSB, CustomJoin[FSC, CustomJoin[FSD, FSE]]]]
  ] = js.native
  @JSImport("mobx-state-tree/dist/internal", "compose")
  @js.native
  def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF](
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE],
    F: IModelType[PF, OF, FCF, FSF]
  ): IModelType[
    PA with PB with PC with PD with PE with PF, 
    OA with OB with OC with OD with OE with OF, 
    CustomJoin[FCA, CustomJoin[FCB, CustomJoin[FCC, CustomJoin[FCD, CustomJoin[FCE, FCF]]]]], 
    CustomJoin[FSA, CustomJoin[FSB, CustomJoin[FSC, CustomJoin[FSD, CustomJoin[FSE, FSF]]]]]
  ] = js.native
  @JSImport("mobx-state-tree/dist/internal", "compose")
  @js.native
  def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF](
    name: String,
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE],
    F: IModelType[PF, OF, FCF, FSF]
  ): IModelType[
    PA with PB with PC with PD with PE with PF, 
    OA with OB with OC with OD with OE with OF, 
    CustomJoin[FCA, CustomJoin[FCB, CustomJoin[FCC, CustomJoin[FCD, CustomJoin[FCE, FCF]]]]], 
    CustomJoin[FSA, CustomJoin[FSB, CustomJoin[FSC, CustomJoin[FSD, CustomJoin[FSE, FSF]]]]]
  ] = js.native
  @JSImport("mobx-state-tree/dist/internal", "compose")
  @js.native
  def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG](
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE],
    F: IModelType[PF, OF, FCF, FSF],
    G: IModelType[PG, OG, FCG, FSG]
  ): IModelType[
    PA with PB with PC with PD with PE with PF with PG, 
    OA with OB with OC with OD with OE with OF with OG, 
    CustomJoin[
      FCA, 
      CustomJoin[FCB, CustomJoin[FCC, CustomJoin[FCD, CustomJoin[FCE, CustomJoin[FCF, FCG]]]]]
    ], 
    CustomJoin[
      FSA, 
      CustomJoin[FSB, CustomJoin[FSC, CustomJoin[FSD, CustomJoin[FSE, CustomJoin[FSF, FSG]]]]]
    ]
  ] = js.native
  @JSImport("mobx-state-tree/dist/internal", "compose")
  @js.native
  def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG](
    name: String,
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE],
    F: IModelType[PF, OF, FCF, FSF],
    G: IModelType[PG, OG, FCG, FSG]
  ): IModelType[
    PA with PB with PC with PD with PE with PF with PG, 
    OA with OB with OC with OD with OE with OF with OG, 
    CustomJoin[
      FCA, 
      CustomJoin[FCB, CustomJoin[FCC, CustomJoin[FCD, CustomJoin[FCE, CustomJoin[FCF, FCG]]]]]
    ], 
    CustomJoin[
      FSA, 
      CustomJoin[FSB, CustomJoin[FSC, CustomJoin[FSD, CustomJoin[FSE, CustomJoin[FSF, FSG]]]]]
    ]
  ] = js.native
  @JSImport("mobx-state-tree/dist/internal", "compose")
  @js.native
  def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG, PH /* <: ModelProperties */, OH, FCH, FSH](
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE],
    F: IModelType[PF, OF, FCF, FSF],
    G: IModelType[PG, OG, FCG, FSG],
    H: IModelType[PH, OH, FCH, FSH]
  ): IModelType[
    PA with PB with PC with PD with PE with PF with PG with PH, 
    OA with OB with OC with OD with OE with OF with OG with OH, 
    CustomJoin[
      FCA, 
      CustomJoin[
        FCB, 
        CustomJoin[FCC, CustomJoin[FCD, CustomJoin[FCE, CustomJoin[FCF, CustomJoin[FCG, FCH]]]]]
      ]
    ], 
    CustomJoin[
      FSA, 
      CustomJoin[
        FSB, 
        CustomJoin[FSC, CustomJoin[FSD, CustomJoin[FSE, CustomJoin[FSF, CustomJoin[FSG, FSH]]]]]
      ]
    ]
  ] = js.native
  @JSImport("mobx-state-tree/dist/internal", "compose")
  @js.native
  def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG, PH /* <: ModelProperties */, OH, FCH, FSH](
    name: String,
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE],
    F: IModelType[PF, OF, FCF, FSF],
    G: IModelType[PG, OG, FCG, FSG],
    H: IModelType[PH, OH, FCH, FSH]
  ): IModelType[
    PA with PB with PC with PD with PE with PF with PG with PH, 
    OA with OB with OC with OD with OE with OF with OG with OH, 
    CustomJoin[
      FCA, 
      CustomJoin[
        FCB, 
        CustomJoin[FCC, CustomJoin[FCD, CustomJoin[FCE, CustomJoin[FCF, CustomJoin[FCG, FCH]]]]]
      ]
    ], 
    CustomJoin[
      FSA, 
      CustomJoin[
        FSB, 
        CustomJoin[FSC, CustomJoin[FSD, CustomJoin[FSE, CustomJoin[FSF, CustomJoin[FSG, FSH]]]]]
      ]
    ]
  ] = js.native
  @JSImport("mobx-state-tree/dist/internal", "compose")
  @js.native
  def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG, PH /* <: ModelProperties */, OH, FCH, FSH, PI /* <: ModelProperties */, OI, FCI, FSI](
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE],
    F: IModelType[PF, OF, FCF, FSF],
    G: IModelType[PG, OG, FCG, FSG],
    H: IModelType[PH, OH, FCH, FSH],
    I: IModelType[PI, OI, FCI, FSI]
  ): IModelType[
    PA with PB with PC with PD with PE with PF with PG with PH with PI, 
    OA with OB with OC with OD with OE with OF with OG with OH with OI, 
    CustomJoin[
      FCA, 
      CustomJoin[
        FCB, 
        CustomJoin[
          FCC, 
          CustomJoin[FCD, CustomJoin[FCE, CustomJoin[FCF, CustomJoin[FCG, CustomJoin[FCH, FCI]]]]]
        ]
      ]
    ], 
    CustomJoin[
      FSA, 
      CustomJoin[
        FSB, 
        CustomJoin[
          FSC, 
          CustomJoin[FSD, CustomJoin[FSE, CustomJoin[FSF, CustomJoin[FSG, CustomJoin[FSH, FSI]]]]]
        ]
      ]
    ]
  ] = js.native
  @JSImport("mobx-state-tree/dist/internal", "compose")
  @js.native
  def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG, PH /* <: ModelProperties */, OH, FCH, FSH, PI /* <: ModelProperties */, OI, FCI, FSI](
    name: String,
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE],
    F: IModelType[PF, OF, FCF, FSF],
    G: IModelType[PG, OG, FCG, FSG],
    H: IModelType[PH, OH, FCH, FSH],
    I: IModelType[PI, OI, FCI, FSI]
  ): IModelType[
    PA with PB with PC with PD with PE with PF with PG with PH with PI, 
    OA with OB with OC with OD with OE with OF with OG with OH with OI, 
    CustomJoin[
      FCA, 
      CustomJoin[
        FCB, 
        CustomJoin[
          FCC, 
          CustomJoin[FCD, CustomJoin[FCE, CustomJoin[FCF, CustomJoin[FCG, CustomJoin[FCH, FCI]]]]]
        ]
      ]
    ], 
    CustomJoin[
      FSA, 
      CustomJoin[
        FSB, 
        CustomJoin[
          FSC, 
          CustomJoin[FSD, CustomJoin[FSE, CustomJoin[FSF, CustomJoin[FSG, CustomJoin[FSH, FSI]]]]]
        ]
      ]
    ]
  ] = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "createActionTrackingMiddleware")
  @js.native
  def createActionTrackingMiddleware[T](hooks: IActionTrackingMiddlewareHooks[T]): IMiddlewareHandler = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "createActionTrackingMiddleware2")
  @js.native
  def createActionTrackingMiddleware2[TEnv](middlewareHooks: IActionTrackingMiddleware2Hooks[TEnv]): IMiddlewareHandler = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "custom")
  @js.native
  def custom[S, T](options: CustomTypeOptions[S, T]): IType[S | T, S, T] = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "decorate")
  @js.native
  def decorate[T /* <: js.Function */](handler: IMiddlewareHandler, fn: T): T = js.native
  @JSImport("mobx-state-tree/dist/internal", "decorate")
  @js.native
  def decorate[T /* <: js.Function */](handler: IMiddlewareHandler, fn: T, includeHooks: Boolean): T = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "destroy")
  @js.native
  def destroy(target: IAnyStateTreeNode): Unit = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "detach")
  @js.native
  def detach[T /* <: IAnyStateTreeNode */](target: T): T = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "enumeration")
  @js.native
  def enumeration[T /* <: String */](name: String, options: js.Array[T]): ISimpleType[UnionStringArray[js.Array[T]]] = js.native
  @JSImport("mobx-state-tree/dist/internal", "enumeration")
  @js.native
  def enumeration[T /* <: String */](options: js.Array[T]): ISimpleType[UnionStringArray[js.Array[T]]] = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "escapeJsonPath")
  @js.native
  def escapeJsonPath(path: String): String = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "flow")
  @js.native
  def flow[R, Args /* <: js.Array[_] */](generator: js.Function1[/* args */ Args, Generator[js.Promise[_], R, _]]): js.Function1[/* args */ Args, js.Promise[FlowReturn[R]]] = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "frozen")
  @js.native
  def frozen[T](): IType[T, T, T] = js.native
  @JSImport("mobx-state-tree/dist/internal", "frozen")
  @js.native
  def frozen[T](defaultValue: T): IType[js.UndefOr[T | Null], T, T] = js.native
  @JSImport("mobx-state-tree/dist/internal", "frozen")
  @js.native
  def frozen[C](subType: IType[C, _, _]): IType[C, C, C] = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "getChildType")
  @js.native
  def getChildType(`object`: IAnyStateTreeNode): IAnyType = js.native
  @JSImport("mobx-state-tree/dist/internal", "getChildType")
  @js.native
  def getChildType(`object`: IAnyStateTreeNode, propertyName: String): IAnyType = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "getEnv")
  @js.native
  def getEnv[T](target: IAnyStateTreeNode): T = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "getIdentifier")
  @js.native
  def getIdentifier(target: IAnyStateTreeNode): String | Null = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "getLivelinessChecking")
  @js.native
  def getLivelinessChecking(): LivelinessMode = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "getMembers")
  @js.native
  def getMembers(target: IAnyStateTreeNode): IModelReflectionData = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "getNodeId")
  @js.native
  def getNodeId(target: IAnyStateTreeNode): Double = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "getParent")
  @js.native
  def getParent[IT /* <: IAnyStateTreeNode | IAnyComplexType */](target: IAnyStateTreeNode): TypeOrStateTreeNodeToStateTreeNode[IT] = js.native
  @JSImport("mobx-state-tree/dist/internal", "getParent")
  @js.native
  def getParent[IT /* <: IAnyStateTreeNode | IAnyComplexType */](target: IAnyStateTreeNode, depth: Double): TypeOrStateTreeNodeToStateTreeNode[IT] = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "getParentOfType")
  @js.native
  def getParentOfType[IT /* <: IAnyComplexType */](target: IAnyStateTreeNode, `type`: IT): /* import warning: importer.ImportType#apply Failed type conversion: IT['Type'] */ js.Any = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "getPath")
  @js.native
  def getPath(target: IAnyStateTreeNode): String = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "getPathParts")
  @js.native
  def getPathParts(target: IAnyStateTreeNode): js.Array[String] = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "getPropertyMembers")
  @js.native
  def getPropertyMembers(typeOrNode: IAnyModelType): IModelReflectionPropertiesData = js.native
  @JSImport("mobx-state-tree/dist/internal", "getPropertyMembers")
  @js.native
  def getPropertyMembers(typeOrNode: IAnyStateTreeNode): IModelReflectionPropertiesData = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "getRelativePath")
  @js.native
  def getRelativePath(base: IAnyStateTreeNode, target: IAnyStateTreeNode): String = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "getRoot")
  @js.native
  def getRoot[IT /* <: IAnyComplexType | IAnyStateTreeNode */](target: IAnyStateTreeNode): TypeOrStateTreeNodeToStateTreeNode[IT] = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "getRunningActionContext")
  @js.native
  def getRunningActionContext(): js.UndefOr[IActionContext] = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "getSnapshot")
  @js.native
  def getSnapshot[S](target: IStateTreeNode[IType[_, S, _]]): S = js.native
  @JSImport("mobx-state-tree/dist/internal", "getSnapshot")
  @js.native
  def getSnapshot[S](target: IStateTreeNode[IType[_, S, _]], applyPostProcess: Boolean): S = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "getType")
  @js.native
  def getType(`object`: IAnyStateTreeNode): IAnyComplexType = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "hasParent")
  @js.native
  def hasParent(target: IAnyStateTreeNode): Boolean = js.native
  @JSImport("mobx-state-tree/dist/internal", "hasParent")
  @js.native
  def hasParent(target: IAnyStateTreeNode, depth: Double): Boolean = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "hasParentOfType")
  @js.native
  def hasParentOfType(target: IAnyStateTreeNode, `type`: IAnyComplexType): Boolean = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "identifier")
  @js.native
  val identifier: ISimpleType[String] = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "identifierNumber")
  @js.native
  val identifierNumber: ISimpleType[Double] = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "integer")
  @js.native
  val integer: ISimpleType[Double] = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "isActionContextChildOf")
  @js.native
  def isActionContextChildOf(actionContext: IActionContext, parent: Double): Boolean = js.native
  @JSImport("mobx-state-tree/dist/internal", "isActionContextChildOf")
  @js.native
  def isActionContextChildOf(actionContext: IActionContext, parent: IActionContext): Boolean = js.native
  @JSImport("mobx-state-tree/dist/internal", "isActionContextChildOf")
  @js.native
  def isActionContextChildOf(actionContext: IActionContext, parent: IMiddlewareEvent): Boolean = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "isActionContextThisOrChildOf")
  @js.native
  def isActionContextThisOrChildOf(actionContext: IActionContext, parentOrThis: Double): Boolean = js.native
  @JSImport("mobx-state-tree/dist/internal", "isActionContextThisOrChildOf")
  @js.native
  def isActionContextThisOrChildOf(actionContext: IActionContext, parentOrThis: IActionContext): Boolean = js.native
  @JSImport("mobx-state-tree/dist/internal", "isActionContextThisOrChildOf")
  @js.native
  def isActionContextThisOrChildOf(actionContext: IActionContext, parentOrThis: IMiddlewareEvent): Boolean = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "isAlive")
  @js.native
  def isAlive(target: IAnyStateTreeNode): Boolean = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "isArrayType")
  @js.native
  def isArrayType[Items /* <: IAnyType */](`type`: IAnyType): /* is mobx-state-tree.mobx-state-tree/dist/types/complex-types/array.IArrayType<Items> */ Boolean = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "isFrozenType")
  @js.native
  def isFrozenType[IT /* <: IType[T | _, T, T] */, T](`type`: IT): /* is IT */ Boolean = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "isIdentifierType")
  @js.native
  def isIdentifierType(`type`: IType[Double | String, Double | String, Double | String]): /* is mobx-state-tree.mobx-state-tree/dist/core/type/type.IType<string, string, string> */ Boolean = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "isLateType")
  @js.native
  def isLateType[IT /* <: IAnyType */](`type`: IT): /* is IT */ Boolean = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "isLiteralType")
  @js.native
  def isLiteralType[IT /* <: ISimpleType[_] */](`type`: IT): /* is IT */ Boolean = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "isMapType")
  @js.native
  def isMapType[Items /* <: IAnyType */](`type`: IAnyType): /* is mobx-state-tree.mobx-state-tree/dist/types/complex-types/map.IMapType<Items> */ Boolean = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "isModelType")
  @js.native
  def isModelType[IT /* <: IAnyModelType */](`type`: IAnyType): /* is IT */ Boolean = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "isOptionalType")
  @js.native
  def isOptionalType[IT /* <: IAnyType */](`type`: IT): /* is IT */ Boolean = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "isPrimitiveType")
  @js.native
  def isPrimitiveType(
    `type`: IType[
      Boolean | js.Date | Double | String, 
      Boolean | Double | String, 
      Boolean | js.Date | Double | String
    ]
  ): /* is mobx-state-tree.mobx-state-tree/dist/core/type/type.IType<string, string, string> */ Boolean = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "isProtected")
  @js.native
  def isProtected(target: IAnyStateTreeNode): Boolean = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "isReferenceType")
  @js.native
  def isReferenceType[IT /* <: IReferenceType[_] */](`type`: IT): /* is IT */ Boolean = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "isRefinementType")
  @js.native
  def isRefinementType[IT /* <: IAnyType */](`type`: IT): /* is IT */ Boolean = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "isRoot")
  @js.native
  def isRoot(target: IAnyStateTreeNode): Boolean = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "isStateTreeNode")
  @js.native
  def isStateTreeNode[IT /* <: IAnyComplexType */](value: js.Any): /* is mobx-state-tree.mobx-state-tree/dist/core/type/type.STNValue<mobx-state-tree.mobx-state-tree/dist/core/type/type.Instance<IT>, IT> */ Boolean = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "isType")
  @js.native
  def isType(value: js.Any): /* is mobx-state-tree.mobx-state-tree/dist/core/type/type.IAnyType */ Boolean = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "isUnionType")
  @js.native
  def isUnionType[IT /* <: IAnyType */](`type`: IT): /* is IT */ Boolean = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "isValidReference")
  @js.native
  def isValidReference[N /* <: IAnyStateTreeNode */](getter: js.Function0[js.UndefOr[N | Null]]): Boolean = js.native
  @JSImport("mobx-state-tree/dist/internal", "isValidReference")
  @js.native
  def isValidReference[N /* <: IAnyStateTreeNode */](getter: js.Function0[js.UndefOr[N | Null]], checkIfAlive: Boolean): Boolean = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "joinJsonPath")
  @js.native
  def joinJsonPath(path: js.Array[String]): String = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "late")
  @js.native
  def late[T /* <: IAnyType */](name: String, `type`: js.Function0[T]): T = js.native
  @JSImport("mobx-state-tree/dist/internal", "late")
  @js.native
  def late[T /* <: IAnyType */](`type`: js.Function0[T]): T = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "literal")
  @js.native
  def literal(value: js.UndefOr[scala.Nothing]): ISimpleType[js.UndefOr[scala.Nothing]] = js.native
  @JSImport("mobx-state-tree/dist/internal", "literal")
  @js.native
  def literal(value: String): ISimpleType[String] = js.native
  @JSImport("mobx-state-tree/dist/internal", "literal")
  @js.native
  def literal(value: js.Date): ISimpleType[js.Date] = js.native
  @JSImport("mobx-state-tree/dist/internal", "literal")
  @js.native
  def literal(value: Boolean): ISimpleType[Boolean] = js.native
  @JSImport("mobx-state-tree/dist/internal", "literal")
  @js.native
  def literal(value: Double): ISimpleType[Double] = js.native
  @JSImport("mobx-state-tree/dist/internal", "literal")
  @js.native
  def literal(value: Null): ISimpleType[Null] = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "map")
  @js.native
  def map[IT /* <: IAnyType */](subtype: IT): IMapType[IT] = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "maybe")
  @js.native
  def maybe[IT /* <: IAnyType */](`type`: IT): IMaybe[IT] = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "maybeNull")
  @js.native
  def maybeNull[IT /* <: IAnyType */](`type`: IT): IMaybeNull[IT] = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "model")
  @js.native
  def model[P /* <: ModelPropertiesDeclaration */](): IModelType[ModelPropertiesDeclarationToProperties[P], js.Object, NotCustomized, NotCustomized] = js.native
  @JSImport("mobx-state-tree/dist/internal", "model")
  @js.native
  def model[P /* <: ModelPropertiesDeclaration */](name: String): IModelType[ModelPropertiesDeclarationToProperties[P], js.Object, NotCustomized, NotCustomized] = js.native
  @JSImport("mobx-state-tree/dist/internal", "model")
  @js.native
  def model[P /* <: ModelPropertiesDeclaration */](name: String, properties: P): IModelType[ModelPropertiesDeclarationToProperties[P], js.Object, NotCustomized, NotCustomized] = js.native
  @JSImport("mobx-state-tree/dist/internal", "model")
  @js.native
  def model[P /* <: ModelPropertiesDeclaration */](properties: P): IModelType[ModelPropertiesDeclarationToProperties[P], js.Object, NotCustomized, NotCustomized] = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "$nonEmptyObject")
  @js.native
  val nonEmptyObject: js.Symbol = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "nullType")
  @js.native
  val nullType: ISimpleType[Null] = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "number")
  @js.native
  val number: ISimpleType[Double] = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "onAction")
  @js.native
  def onAction(target: IAnyStateTreeNode, listener: js.Function1[/* call */ ISerializedActionCall, Unit]): IDisposer = js.native
  @JSImport("mobx-state-tree/dist/internal", "onAction")
  @js.native
  def onAction(
    target: IAnyStateTreeNode,
    listener: js.Function1[/* call */ ISerializedActionCall, Unit],
    attachAfter: Boolean
  ): IDisposer = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "onPatch")
  @js.native
  def onPatch(
    target: IAnyStateTreeNode,
    callback: js.Function2[/* patch */ IJsonPatch, /* reversePatch */ IJsonPatch, Unit]
  ): IDisposer = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "onSnapshot")
  @js.native
  def onSnapshot[S](target: IStateTreeNode[IType[_, S, _]], callback: js.Function1[/* snapshot */ S, Unit]): IDisposer = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "optional")
  @js.native
  def optional[IT /* <: IAnyType */](`type`: IT, defaultValueOrFunction: OptionalDefaultValueOrFunction[IT]): IOptionalIType[IT, js.Array[js.UndefOr[scala.Nothing]]] = js.native
  @JSImport("mobx-state-tree/dist/internal", "optional")
  @js.native
  def optional[IT /* <: IAnyType */, OptionalVals /* <: ValidOptionalValues */](
    `type`: IT,
    defaultValueOrFunction: OptionalDefaultValueOrFunction[IT],
    optionalValues: OptionalVals
  ): IOptionalIType[IT, OptionalVals] = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "process")
  @js.native
  def process[R](generator: js.Function0[IterableIterator[_]]): js.Function0[js.Promise[R]] = js.native
  @JSImport("mobx-state-tree/dist/internal", "process")
  @js.native
  def process[A1](generator: js.Function1[/* a1 */ A1, IterableIterator[_]]): js.Function1[/* a1 */ A1, js.Promise[_]] = js.native
  @JSImport("mobx-state-tree/dist/internal", "process")
  @js.native
  def process[A1, A2](generator: js.Function2[/* a1 */ A1, /* a2 */ A2, IterableIterator[_]]): js.Function2[/* a1 */ A1, /* a2 */ A2, js.Promise[_]] = js.native
  @JSImport("mobx-state-tree/dist/internal", "process")
  @js.native
  def process[A1, A2, A3](generator: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, IterableIterator[_]]): js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, js.Promise[_]] = js.native
  @JSImport("mobx-state-tree/dist/internal", "process")
  @js.native
  def process[A1, A2, A3, A4](generator: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, IterableIterator[_]]): js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, js.Promise[_]] = js.native
  @JSImport("mobx-state-tree/dist/internal", "process")
  @js.native
  def process[A1, A2, A3, A4, A5](
    generator: js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, IterableIterator[_]]
  ): js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, js.Promise[_]] = js.native
  @JSImport("mobx-state-tree/dist/internal", "process")
  @js.native
  def process[A1, A2, A3, A4, A5, A6](
    generator: js.Function6[
      /* a1 */ A1, 
      /* a2 */ A2, 
      /* a3 */ A3, 
      /* a4 */ A4, 
      /* a5 */ A5, 
      /* a6 */ A6, 
      IterableIterator[_]
    ]
  ): js.Function6[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, /* a6 */ A6, js.Promise[_]] = js.native
  @JSImport("mobx-state-tree/dist/internal", "process")
  @js.native
  def process[A1, A2, A3, A4, A5, A6, A7](
    generator: js.Function7[
      /* a1 */ A1, 
      /* a2 */ A2, 
      /* a3 */ A3, 
      /* a4 */ A4, 
      /* a5 */ A5, 
      /* a6 */ A6, 
      /* a7 */ A7, 
      IterableIterator[_]
    ]
  ): js.Function7[
    /* a1 */ A1, 
    /* a2 */ A2, 
    /* a3 */ A3, 
    /* a4 */ A4, 
    /* a5 */ A5, 
    /* a6 */ A6, 
    /* a7 */ A7, 
    js.Promise[_]
  ] = js.native
  @JSImport("mobx-state-tree/dist/internal", "process")
  @js.native
  def process[A1, A2, A3, A4, A5, A6, A7, A8](
    generator: js.Function8[
      /* a1 */ A1, 
      /* a2 */ A2, 
      /* a3 */ A3, 
      /* a4 */ A4, 
      /* a5 */ A5, 
      /* a6 */ A6, 
      /* a7 */ A7, 
      /* a8 */ A8, 
      IterableIterator[_]
    ]
  ): js.Function8[
    /* a1 */ A1, 
    /* a2 */ A2, 
    /* a3 */ A3, 
    /* a4 */ A4, 
    /* a5 */ A5, 
    /* a6 */ A6, 
    /* a7 */ A7, 
    /* a8 */ A8, 
    js.Promise[_]
  ] = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "protect")
  @js.native
  def protect(target: IAnyStateTreeNode): Unit = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "recordActions")
  @js.native
  def recordActions(subject: IAnyStateTreeNode): IActionRecorder = js.native
  @JSImport("mobx-state-tree/dist/internal", "recordActions")
  @js.native
  def recordActions(
    subject: IAnyStateTreeNode,
    filter: js.Function2[
      /* action */ ISerializedActionCall, 
      /* actionContext */ js.UndefOr[IActionContext], 
      Boolean
    ]
  ): IActionRecorder = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "recordPatches")
  @js.native
  def recordPatches(subject: IAnyStateTreeNode): IPatchRecorder = js.native
  @JSImport("mobx-state-tree/dist/internal", "recordPatches")
  @js.native
  def recordPatches(
    subject: IAnyStateTreeNode,
    filter: js.Function3[
      /* patch */ IJsonPatch, 
      /* inversePatch */ IJsonPatch, 
      /* actionContext */ js.UndefOr[IActionContext], 
      Boolean
    ]
  ): IPatchRecorder = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "reference")
  @js.native
  def reference[IT /* <: IAnyComplexType */](subType: IT): IReferenceType[IT] = js.native
  @JSImport("mobx-state-tree/dist/internal", "reference")
  @js.native
  def reference[IT /* <: IAnyComplexType */](subType: IT, options: ReferenceOptions[IT]): IReferenceType[IT] = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "refinement")
  @js.native
  def refinement_CreationType[IT /* <: IAnyType */](
    name: String,
    `type`: IT,
    predicate: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* snapshot */ js.Any, 
      Boolean
    ]
  ): IT = js.native
  @JSImport("mobx-state-tree/dist/internal", "refinement")
  @js.native
  def refinement_CreationType[IT /* <: IAnyType */](
    name: String,
    `type`: IT,
    predicate: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* snapshot */ js.Any, 
      Boolean
    ],
    message: String
  ): IT = js.native
  @JSImport("mobx-state-tree/dist/internal", "refinement")
  @js.native
  def refinement_CreationType[IT /* <: IAnyType */](
    name: String,
    `type`: IT,
    predicate: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* snapshot */ js.Any, 
      Boolean
    ],
    message: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* v */ js.Any, 
      String
    ]
  ): IT = js.native
  @JSImport("mobx-state-tree/dist/internal", "refinement")
  @js.native
  def refinement_CreationType[IT /* <: IAnyType */](
    `type`: IT,
    predicate: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* snapshot */ js.Any, 
      Boolean
    ]
  ): IT = js.native
  @JSImport("mobx-state-tree/dist/internal", "refinement")
  @js.native
  def refinement_CreationType[IT /* <: IAnyType */](
    `type`: IT,
    predicate: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* snapshot */ js.Any, 
      Boolean
    ],
    message: String
  ): IT = js.native
  @JSImport("mobx-state-tree/dist/internal", "refinement")
  @js.native
  def refinement_CreationType[IT /* <: IAnyType */](
    `type`: IT,
    predicate: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* snapshot */ js.Any, 
      Boolean
    ],
    message: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* v */ js.Any, 
      String
    ]
  ): IT = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "resolveIdentifier")
  @js.native
  def resolveIdentifier[IT /* <: IAnyModelType */](`type`: IT, target: IAnyStateTreeNode, identifier: ReferenceIdentifier): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: IT['Type'] */ js.Any
  ] = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "resolvePath")
  @js.native
  def resolvePath(target: IAnyStateTreeNode, path: String): js.Any = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "safeReference")
  @js.native
  def safeReference[IT /* <: IAnyComplexType */](subType: IT): IMaybe[IReferenceType[IT]] = js.native
  @JSImport("mobx-state-tree/dist/internal", "safeReference")
  @js.native
  def safeReference[IT /* <: IAnyComplexType */](subType: IT, options: (ReferenceOptionsGetSet[IT] | js.Object) with `0`): IReferenceType[IT] = js.native
  @JSImport("mobx-state-tree/dist/internal", "safeReference")
  @js.native
  def safeReference_IT_IAnyComplexType_IMaybe[IT /* <: IAnyComplexType */](subType: IT, options: (ReferenceOptionsGetSet[IT] | js.Object) with AcceptsUndefined): IMaybe[IReferenceType[IT]] = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "setLivelinessChecking")
  @js.native
  def setLivelinessChecking(mode: LivelinessMode): Unit = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "setLivelynessChecking")
  @js.native
  def setLivelynessChecking(mode: LivelinessMode): Unit = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "snapshotProcessor")
  @js.native
  def snapshotProcessor[IT /* <: IAnyType */, CustomC, CustomS](
    `type`: IT,
    processors: ISnapshotProcessors[
      /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ js.Any, 
      CustomC, 
      /* import warning: importer.ImportType#apply Failed type conversion: IT['SnapshotType'] */ js.Any, 
      CustomS
    ]
  ): ISnapshotProcessor[IT, CustomC, CustomS] = js.native
  @JSImport("mobx-state-tree/dist/internal", "snapshotProcessor")
  @js.native
  def snapshotProcessor[IT /* <: IAnyType */, CustomC, CustomS](
    `type`: IT,
    processors: ISnapshotProcessors[
      /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ js.Any, 
      CustomC, 
      /* import warning: importer.ImportType#apply Failed type conversion: IT['SnapshotType'] */ js.Any, 
      CustomS
    ],
    name: String
  ): ISnapshotProcessor[IT, CustomC, CustomS] = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "splitJsonPath")
  @js.native
  def splitJsonPath(path: String): js.Array[String] = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "string")
  @js.native
  val string: ISimpleType[String] = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "toGenerator")
  @js.native
  def toGenerator[R](p: js.Promise[R]): Generator[js.Promise[R], R, R] = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "toGeneratorFunction")
  @js.native
  def toGeneratorFunction[R, Args /* <: js.Array[_] */](p: js.Function1[/* args */ Args, js.Promise[R]]): js.Function1[/* args */ Args, Generator[js.Promise[R], R, R]] = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "tryReference")
  @js.native
  def tryReference[N /* <: IAnyStateTreeNode */](getter: js.Function0[js.UndefOr[N | Null]]): js.UndefOr[N] = js.native
  @JSImport("mobx-state-tree/dist/internal", "tryReference")
  @js.native
  def tryReference[N /* <: IAnyStateTreeNode */](getter: js.Function0[js.UndefOr[N | Null]], checkIfAlive: Boolean): js.UndefOr[N] = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "tryResolve")
  @js.native
  def tryResolve(target: IAnyStateTreeNode, path: String): js.Any = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "typecheck")
  @js.native
  def typecheck[IT /* <: IAnyType */](`type`: IT, value: ExtractCSTWithSTN[IT]): Unit = js.native
  
  object types {
    
    @JSImport("mobx-state-tree/dist/internal", "types")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mobx-state-tree/dist/internal", "types.Date")
    @js.native
    def Date: IType[Double | js.Date, Double, js.Date] = js.native
    @scala.inline
    def Date_=(x: IType[Double | js.Date, Double, js.Date]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Date")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree/dist/internal", "types.array")
    @js.native
    def array: Fn2 = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.array")
    @js.native
    def array[IT /* <: IAnyType */](subtype: IT): IArrayType[IT] = js.native
    @scala.inline
    def array_=(x: Fn2): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("array")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree/dist/internal", "types.boolean")
    @js.native
    def boolean: ISimpleType[Boolean] = js.native
    @scala.inline
    def boolean_=(x: ISimpleType[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("boolean")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree/dist/internal", "types.compose")
    @js.native
    def compose: FnCallNameABCDEFGHI = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.compose")
    @js.native
    def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB](A: IModelType[PA, OA, FCA, FSA], B: IModelType[PB, OB, FCB, FSB]): IModelType[PA with PB, OA with OB, CustomJoin[FCA, FCB], CustomJoin[FSA, FSB]] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.compose")
    @js.native
    def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB](name: String, A: IModelType[PA, OA, FCA, FSA], B: IModelType[PB, OB, FCB, FSB]): IModelType[PA with PB, OA with OB, CustomJoin[FCA, FCB], CustomJoin[FSA, FSB]] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.compose")
    @js.native
    def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC](A: IModelType[PA, OA, FCA, FSA], B: IModelType[PB, OB, FCB, FSB], C: IModelType[PC, OC, FCC, FSC]): IModelType[
        PA with PB with PC, 
        OA with OB with OC, 
        CustomJoin[FCA, CustomJoin[FCB, FCC]], 
        CustomJoin[FSA, CustomJoin[FSB, FSC]]
      ] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.compose")
    @js.native
    def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC](
      name: String,
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC]
    ): IModelType[
        PA with PB with PC, 
        OA with OB with OC, 
        CustomJoin[FCA, CustomJoin[FCB, FCC]], 
        CustomJoin[FSA, CustomJoin[FSB, FSC]]
      ] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.compose")
    @js.native
    def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD](
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD]
    ): IModelType[
        PA with PB with PC with PD, 
        OA with OB with OC with OD, 
        CustomJoin[FCA, CustomJoin[FCB, CustomJoin[FCC, FCD]]], 
        CustomJoin[FSA, CustomJoin[FSB, CustomJoin[FSC, FSD]]]
      ] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.compose")
    @js.native
    def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD](
      name: String,
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD]
    ): IModelType[
        PA with PB with PC with PD, 
        OA with OB with OC with OD, 
        CustomJoin[FCA, CustomJoin[FCB, CustomJoin[FCC, FCD]]], 
        CustomJoin[FSA, CustomJoin[FSB, CustomJoin[FSC, FSD]]]
      ] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.compose")
    @js.native
    def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE](
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD],
      E: IModelType[PE, OE, FCE, FSE]
    ): IModelType[
        PA with PB with PC with PD with PE, 
        OA with OB with OC with OD with OE, 
        CustomJoin[FCA, CustomJoin[FCB, CustomJoin[FCC, CustomJoin[FCD, FCE]]]], 
        CustomJoin[FSA, CustomJoin[FSB, CustomJoin[FSC, CustomJoin[FSD, FSE]]]]
      ] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.compose")
    @js.native
    def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE](
      name: String,
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD],
      E: IModelType[PE, OE, FCE, FSE]
    ): IModelType[
        PA with PB with PC with PD with PE, 
        OA with OB with OC with OD with OE, 
        CustomJoin[FCA, CustomJoin[FCB, CustomJoin[FCC, CustomJoin[FCD, FCE]]]], 
        CustomJoin[FSA, CustomJoin[FSB, CustomJoin[FSC, CustomJoin[FSD, FSE]]]]
      ] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.compose")
    @js.native
    def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF](
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD],
      E: IModelType[PE, OE, FCE, FSE],
      F: IModelType[PF, OF, FCF, FSF]
    ): IModelType[
        PA with PB with PC with PD with PE with PF, 
        OA with OB with OC with OD with OE with OF, 
        CustomJoin[FCA, CustomJoin[FCB, CustomJoin[FCC, CustomJoin[FCD, CustomJoin[FCE, FCF]]]]], 
        CustomJoin[FSA, CustomJoin[FSB, CustomJoin[FSC, CustomJoin[FSD, CustomJoin[FSE, FSF]]]]]
      ] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.compose")
    @js.native
    def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF](
      name: String,
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD],
      E: IModelType[PE, OE, FCE, FSE],
      F: IModelType[PF, OF, FCF, FSF]
    ): IModelType[
        PA with PB with PC with PD with PE with PF, 
        OA with OB with OC with OD with OE with OF, 
        CustomJoin[FCA, CustomJoin[FCB, CustomJoin[FCC, CustomJoin[FCD, CustomJoin[FCE, FCF]]]]], 
        CustomJoin[FSA, CustomJoin[FSB, CustomJoin[FSC, CustomJoin[FSD, CustomJoin[FSE, FSF]]]]]
      ] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.compose")
    @js.native
    def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG](
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD],
      E: IModelType[PE, OE, FCE, FSE],
      F: IModelType[PF, OF, FCF, FSF],
      G: IModelType[PG, OG, FCG, FSG]
    ): IModelType[
        PA with PB with PC with PD with PE with PF with PG, 
        OA with OB with OC with OD with OE with OF with OG, 
        CustomJoin[
          FCA, 
          CustomJoin[FCB, CustomJoin[FCC, CustomJoin[FCD, CustomJoin[FCE, CustomJoin[FCF, FCG]]]]]
        ], 
        CustomJoin[
          FSA, 
          CustomJoin[FSB, CustomJoin[FSC, CustomJoin[FSD, CustomJoin[FSE, CustomJoin[FSF, FSG]]]]]
        ]
      ] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.compose")
    @js.native
    def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG](
      name: String,
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD],
      E: IModelType[PE, OE, FCE, FSE],
      F: IModelType[PF, OF, FCF, FSF],
      G: IModelType[PG, OG, FCG, FSG]
    ): IModelType[
        PA with PB with PC with PD with PE with PF with PG, 
        OA with OB with OC with OD with OE with OF with OG, 
        CustomJoin[
          FCA, 
          CustomJoin[FCB, CustomJoin[FCC, CustomJoin[FCD, CustomJoin[FCE, CustomJoin[FCF, FCG]]]]]
        ], 
        CustomJoin[
          FSA, 
          CustomJoin[FSB, CustomJoin[FSC, CustomJoin[FSD, CustomJoin[FSE, CustomJoin[FSF, FSG]]]]]
        ]
      ] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.compose")
    @js.native
    def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG, PH /* <: ModelProperties */, OH, FCH, FSH](
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD],
      E: IModelType[PE, OE, FCE, FSE],
      F: IModelType[PF, OF, FCF, FSF],
      G: IModelType[PG, OG, FCG, FSG],
      H: IModelType[PH, OH, FCH, FSH]
    ): IModelType[
        PA with PB with PC with PD with PE with PF with PG with PH, 
        OA with OB with OC with OD with OE with OF with OG with OH, 
        CustomJoin[
          FCA, 
          CustomJoin[
            FCB, 
            CustomJoin[FCC, CustomJoin[FCD, CustomJoin[FCE, CustomJoin[FCF, CustomJoin[FCG, FCH]]]]]
          ]
        ], 
        CustomJoin[
          FSA, 
          CustomJoin[
            FSB, 
            CustomJoin[FSC, CustomJoin[FSD, CustomJoin[FSE, CustomJoin[FSF, CustomJoin[FSG, FSH]]]]]
          ]
        ]
      ] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.compose")
    @js.native
    def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG, PH /* <: ModelProperties */, OH, FCH, FSH](
      name: String,
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD],
      E: IModelType[PE, OE, FCE, FSE],
      F: IModelType[PF, OF, FCF, FSF],
      G: IModelType[PG, OG, FCG, FSG],
      H: IModelType[PH, OH, FCH, FSH]
    ): IModelType[
        PA with PB with PC with PD with PE with PF with PG with PH, 
        OA with OB with OC with OD with OE with OF with OG with OH, 
        CustomJoin[
          FCA, 
          CustomJoin[
            FCB, 
            CustomJoin[FCC, CustomJoin[FCD, CustomJoin[FCE, CustomJoin[FCF, CustomJoin[FCG, FCH]]]]]
          ]
        ], 
        CustomJoin[
          FSA, 
          CustomJoin[
            FSB, 
            CustomJoin[FSC, CustomJoin[FSD, CustomJoin[FSE, CustomJoin[FSF, CustomJoin[FSG, FSH]]]]]
          ]
        ]
      ] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.compose")
    @js.native
    def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG, PH /* <: ModelProperties */, OH, FCH, FSH, PI /* <: ModelProperties */, OI, FCI, FSI](
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD],
      E: IModelType[PE, OE, FCE, FSE],
      F: IModelType[PF, OF, FCF, FSF],
      G: IModelType[PG, OG, FCG, FSG],
      H: IModelType[PH, OH, FCH, FSH],
      I: IModelType[PI, OI, FCI, FSI]
    ): IModelType[
        PA with PB with PC with PD with PE with PF with PG with PH with PI, 
        OA with OB with OC with OD with OE with OF with OG with OH with OI, 
        CustomJoin[
          FCA, 
          CustomJoin[
            FCB, 
            CustomJoin[
              FCC, 
              CustomJoin[FCD, CustomJoin[FCE, CustomJoin[FCF, CustomJoin[FCG, CustomJoin[FCH, FCI]]]]]
            ]
          ]
        ], 
        CustomJoin[
          FSA, 
          CustomJoin[
            FSB, 
            CustomJoin[
              FSC, 
              CustomJoin[FSD, CustomJoin[FSE, CustomJoin[FSF, CustomJoin[FSG, CustomJoin[FSH, FSI]]]]]
            ]
          ]
        ]
      ] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.compose")
    @js.native
    def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG, PH /* <: ModelProperties */, OH, FCH, FSH, PI /* <: ModelProperties */, OI, FCI, FSI](
      name: String,
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD],
      E: IModelType[PE, OE, FCE, FSE],
      F: IModelType[PF, OF, FCF, FSF],
      G: IModelType[PG, OG, FCG, FSG],
      H: IModelType[PH, OH, FCH, FSH],
      I: IModelType[PI, OI, FCI, FSI]
    ): IModelType[
        PA with PB with PC with PD with PE with PF with PG with PH with PI, 
        OA with OB with OC with OD with OE with OF with OG with OH with OI, 
        CustomJoin[
          FCA, 
          CustomJoin[
            FCB, 
            CustomJoin[
              FCC, 
              CustomJoin[FCD, CustomJoin[FCE, CustomJoin[FCF, CustomJoin[FCG, CustomJoin[FCH, FCI]]]]]
            ]
          ]
        ], 
        CustomJoin[
          FSA, 
          CustomJoin[
            FSB, 
            CustomJoin[
              FSC, 
              CustomJoin[FSD, CustomJoin[FSE, CustomJoin[FSF, CustomJoin[FSG, CustomJoin[FSH, FSI]]]]]
            ]
          ]
        ]
      ] = js.native
    @scala.inline
    def compose_=(x: FnCallNameABCDEFGHI): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("compose")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree/dist/internal", "types.custom")
    @js.native
    def custom: FnCallOptions = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.custom")
    @js.native
    def custom[S, T](options: CustomTypeOptions[S, T]): IType[S | T, S, T] = js.native
    @scala.inline
    def custom_=(x: FnCallOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("custom")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree/dist/internal", "types.enumeration")
    @js.native
    def enumeration: FnCall = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.enumeration")
    @js.native
    def enumeration[T /* <: String */](name: String, options: js.Array[T]): ISimpleType[UnionStringArray[js.Array[T]]] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.enumeration")
    @js.native
    def enumeration[T /* <: String */](options: js.Array[T]): ISimpleType[UnionStringArray[js.Array[T]]] = js.native
    @scala.inline
    def enumeration_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enumeration")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree/dist/internal", "types.frozen")
    @js.native
    def frozen[T](): IType[T, T, T] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.frozen")
    @js.native
    def frozen[T](defaultValue: T): IType[js.UndefOr[T | Null], T, T] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.frozen")
    @js.native
    def frozen[C](subType: IType[C, _, _]): IType[C, C, C] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.frozen")
    @js.native
    def frozen_Ftypes: FnCallDefaultValue = js.native
    
    @scala.inline
    def frozen_Ftypes_=(x: FnCallDefaultValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("frozen")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree/dist/internal", "types.identifier")
    @js.native
    def identifier: ISimpleType[String] = js.native
    
    @JSImport("mobx-state-tree/dist/internal", "types.identifierNumber")
    @js.native
    def identifierNumber: ISimpleType[Double] = js.native
    @scala.inline
    def identifierNumber_=(x: ISimpleType[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("identifierNumber")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def identifier_=(x: ISimpleType[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("identifier")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree/dist/internal", "types.integer")
    @js.native
    def integer: ISimpleType[Double] = js.native
    @scala.inline
    def integer_=(x: ISimpleType[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("integer")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree/dist/internal", "types.late")
    @js.native
    def late: FnCallNameType = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.late")
    @js.native
    def late[T /* <: IAnyType */](name: String, `type`: js.Function0[T]): T = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.late")
    @js.native
    def late[T /* <: IAnyType */](`type`: js.Function0[T]): T = js.native
    @scala.inline
    def late_=(x: FnCallNameType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("late")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree/dist/internal", "types.literal")
    @js.native
    def literal: FnCallValue = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.literal")
    @js.native
    def literal(value: js.UndefOr[scala.Nothing]): ISimpleType[js.UndefOr[scala.Nothing]] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.literal")
    @js.native
    def literal(value: String): ISimpleType[String] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.literal")
    @js.native
    def literal(value: js.Date): ISimpleType[js.Date] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.literal")
    @js.native
    def literal(value: Boolean): ISimpleType[Boolean] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.literal")
    @js.native
    def literal(value: Double): ISimpleType[Double] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.literal")
    @js.native
    def literal(value: Null): ISimpleType[Null] = js.native
    @scala.inline
    def literal_=(x: FnCallValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("literal")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree/dist/internal", "types.map")
    @js.native
    def map: FnCallSubtype = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.map")
    @js.native
    def map[IT /* <: IAnyType */](subtype: IT): IMapType[IT] = js.native
    @scala.inline
    def map_=(x: FnCallSubtype): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("map")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree/dist/internal", "types.maybe")
    @js.native
    def maybe: FnCallType = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.maybe")
    @js.native
    def maybe[IT /* <: IAnyType */](`type`: IT): IMaybe[IT] = js.native
    
    @JSImport("mobx-state-tree/dist/internal", "types.maybeNull")
    @js.native
    def maybeNull: Fn1 = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.maybeNull")
    @js.native
    def maybeNull[IT /* <: IAnyType */](`type`: IT): IMaybeNull[IT] = js.native
    @scala.inline
    def maybeNull_=(x: Fn1): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maybeNull")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def maybe_=(x: FnCallType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maybe")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree/dist/internal", "types.model")
    @js.native
    def model[P /* <: ModelPropertiesDeclaration */](): IModelType[ModelPropertiesDeclarationToProperties[P], js.Object, NotCustomized, NotCustomized] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.model")
    @js.native
    def model[P /* <: ModelPropertiesDeclaration */](name: String): IModelType[ModelPropertiesDeclarationToProperties[P], js.Object, NotCustomized, NotCustomized] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.model")
    @js.native
    def model[P /* <: ModelPropertiesDeclaration */](name: String, properties: P): IModelType[ModelPropertiesDeclarationToProperties[P], js.Object, NotCustomized, NotCustomized] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.model")
    @js.native
    def model[P /* <: ModelPropertiesDeclaration */](properties: P): IModelType[ModelPropertiesDeclarationToProperties[P], js.Object, NotCustomized, NotCustomized] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.model")
    @js.native
    def model_Ftypes: FnCallNameProperties = js.native
    
    @scala.inline
    def model_Ftypes_=(x: FnCallNameProperties): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("model")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree/dist/internal", "types.number")
    @js.native
    def number: ISimpleType[Double] = js.native
    @scala.inline
    def number_=(x: ISimpleType[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("number")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree/dist/internal", "types.optional")
    @js.native
    def optional: FnCallTypeDefaultValueOrFunctionOptionalValues = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.optional")
    @js.native
    def optional[IT /* <: IAnyType */](`type`: IT, defaultValueOrFunction: OptionalDefaultValueOrFunction[IT]): IOptionalIType[IT, js.Array[js.UndefOr[scala.Nothing]]] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.optional")
    @js.native
    def optional[IT /* <: IAnyType */, OptionalVals /* <: ValidOptionalValues */](
      `type`: IT,
      defaultValueOrFunction: OptionalDefaultValueOrFunction[IT],
      optionalValues: OptionalVals
    ): IOptionalIType[IT, OptionalVals] = js.native
    @scala.inline
    def optional_=(x: FnCallTypeDefaultValueOrFunctionOptionalValues): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("optional")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree/dist/internal", "types.reference")
    @js.native
    def reference: FnCallSubTypeOptions = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.reference")
    @js.native
    def reference[IT /* <: IAnyComplexType */](subType: IT): IReferenceType[IT] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.reference")
    @js.native
    def reference[IT /* <: IAnyComplexType */](subType: IT, options: ReferenceOptions[IT]): IReferenceType[IT] = js.native
    @scala.inline
    def reference_=(x: FnCallSubTypeOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reference")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree/dist/internal", "types.refinement")
    @js.native
    def refinement: FnCallNameTypePredicateMessage = js.native
    @scala.inline
    def refinement_=(x: FnCallNameTypePredicateMessage): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refinement")(x.asInstanceOf[js.Any])
    @JSImport("mobx-state-tree/dist/internal", "types.refinement")
    @js.native
    def refinement_CreationType[IT /* <: IAnyType */](
      name: String,
      `type`: IT,
      predicate: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* snapshot */ js.Any, 
          Boolean
        ]
    ): IT = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.refinement")
    @js.native
    def refinement_CreationType[IT /* <: IAnyType */](
      name: String,
      `type`: IT,
      predicate: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* snapshot */ js.Any, 
          Boolean
        ],
      message: String
    ): IT = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.refinement")
    @js.native
    def refinement_CreationType[IT /* <: IAnyType */](
      name: String,
      `type`: IT,
      predicate: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* snapshot */ js.Any, 
          Boolean
        ],
      message: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* v */ js.Any, 
          String
        ]
    ): IT = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.refinement")
    @js.native
    def refinement_CreationType[IT /* <: IAnyType */](
      `type`: IT,
      predicate: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* snapshot */ js.Any, 
          Boolean
        ]
    ): IT = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.refinement")
    @js.native
    def refinement_CreationType[IT /* <: IAnyType */](
      `type`: IT,
      predicate: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* snapshot */ js.Any, 
          Boolean
        ],
      message: String
    ): IT = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.refinement")
    @js.native
    def refinement_CreationType[IT /* <: IAnyType */](
      `type`: IT,
      predicate: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* snapshot */ js.Any, 
          Boolean
        ],
      message: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* v */ js.Any, 
          String
        ]
    ): IT = js.native
    
    @JSImport("mobx-state-tree/dist/internal", "types.safeReference")
    @js.native
    def safeReference: Fn0 = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.safeReference")
    @js.native
    def safeReference[IT /* <: IAnyComplexType */](subType: IT): IMaybe[IReferenceType[IT]] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.safeReference")
    @js.native
    def safeReference[IT /* <: IAnyComplexType */](subType: IT, options: (ReferenceOptionsGetSet[IT] | js.Object) with `0`): IReferenceType[IT] = js.native
    @scala.inline
    def safeReference_=(x: Fn0): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("safeReference")(x.asInstanceOf[js.Any])
    @JSImport("mobx-state-tree/dist/internal", "types.safeReference")
    @js.native
    def safeReference_IT_IAnyComplexType_IMaybe[IT /* <: IAnyComplexType */](subType: IT, options: (ReferenceOptionsGetSet[IT] | js.Object) with AcceptsUndefined): IMaybe[IReferenceType[IT]] = js.native
    
    @JSImport("mobx-state-tree/dist/internal", "types.snapshotProcessor")
    @js.native
    def snapshotProcessor: FnCallTypeProcessorsName = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.snapshotProcessor")
    @js.native
    def snapshotProcessor[IT /* <: IAnyType */, CustomC, CustomS](
      `type`: IT,
      processors: ISnapshotProcessors[
          /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ js.Any, 
          CustomC, 
          /* import warning: importer.ImportType#apply Failed type conversion: IT['SnapshotType'] */ js.Any, 
          CustomS
        ]
    ): ISnapshotProcessor[IT, CustomC, CustomS] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.snapshotProcessor")
    @js.native
    def snapshotProcessor[IT /* <: IAnyType */, CustomC, CustomS](
      `type`: IT,
      processors: ISnapshotProcessors[
          /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ js.Any, 
          CustomC, 
          /* import warning: importer.ImportType#apply Failed type conversion: IT['SnapshotType'] */ js.Any, 
          CustomS
        ],
      name: String
    ): ISnapshotProcessor[IT, CustomC, CustomS] = js.native
    @scala.inline
    def snapshotProcessor_=(x: FnCallTypeProcessorsName): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("snapshotProcessor")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree/dist/internal", "types.string")
    @js.native
    def string: ISimpleType[String] = js.native
    @scala.inline
    def string_=(x: ISimpleType[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("string")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree/dist/internal", "types.undefined")
    @js.native
    def undefined: ISimpleType[js.UndefOr[scala.Nothing]] = js.native
    @scala.inline
    def undefined_=(x: ISimpleType[js.UndefOr[scala.Nothing]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("undefined")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree/dist/internal", "types.union")
    @js.native
    def union: FnCallOptionsABCDEFGHI = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.union")
    @js.native
    def union(dispatchOrType: IAnyType, otherTypes: IAnyType*): IAnyType = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.union")
    @js.native
    def union(dispatchOrType: UnionOptions, otherTypes: IAnyType*): IAnyType = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.union")
    @js.native
    def union(types: IAnyType*): IAnyType = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.union")
    @js.native
    def union[CA, SA, TA, CB, SB, TB](A: IType[CA, SA, TA], B: IType[CB, SB, TB]): ITypeUnion[CA | CB, SA | SB, TA | TB] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.union")
    @js.native
    def union[CA, SA, TA, CB, SB, TB](options: UnionOptions, A: IType[CA, SA, TA], B: IType[CB, SB, TB]): ITypeUnion[CA | CB, SA | SB, TA | TB] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.union")
    @js.native
    def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB](A: IModelType[PA, OA, FCA, FSA], B: IModelType[PB, OB, FCB, FSB]): ITypeUnion[
        ModelCreationType2[PA | PB, FCA | FCB], 
        ModelSnapshotType2[PA | PB, FSA | FSB], 
        ModelInstanceType[PA | PB, OA | OB]
      ] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.union")
    @js.native
    def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB](options: UnionOptions, A: IModelType[PA, OA, FCA, FSA], B: IModelType[PB, OB, FCB, FSB]): ITypeUnion[
        ModelCreationType2[PA | PB, FCA | FCB], 
        ModelSnapshotType2[PA | PB, FSA | FSB], 
        ModelInstanceType[PA | PB, OA | OB]
      ] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.union")
    @js.native
    def union[CA, SA, TA, CB, SB, TB, CC, SC, TC](A: IType[CA, SA, TA], B: IType[CB, SB, TB], C: IType[CC, SC, TC]): ITypeUnion[CA | CB | CC, SA | SB | SC, TA | TB | TC] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.union")
    @js.native
    def union[CA, SA, TA, CB, SB, TB, CC, SC, TC](options: UnionOptions, A: IType[CA, SA, TA], B: IType[CB, SB, TB], C: IType[CC, SC, TC]): ITypeUnion[CA | CB | CC, SA | SB | SC, TA | TB | TC] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.union")
    @js.native
    def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC](A: IModelType[PA, OA, FCA, FSA], B: IModelType[PB, OB, FCB, FSB], C: IModelType[PC, OC, FCC, FSC]): ITypeUnion[
        ModelCreationType2[PA | PB | PC, FCA | FCB | FCC], 
        ModelSnapshotType2[PA | PB | PC, FSA | FSB | FSC], 
        ModelInstanceType[PA | PB | PC, OA | OB | OC]
      ] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.union")
    @js.native
    def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD](A: IType[CA, SA, TA], B: IType[CB, SB, TB], C: IType[CC, SC, TC], D: IType[CD, SD, TD]): ITypeUnion[CA | CB | CC | CD, SA | SB | SC | SD, TA | TB | TC | TD] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.union")
    @js.native
    def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC](
      options: UnionOptions,
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC]
    ): ITypeUnion[
        ModelCreationType2[PA | PB | PC, FCA | FCB | FCC], 
        ModelSnapshotType2[PA | PB | PC, FSA | FSB | FSC], 
        ModelInstanceType[PA | PB | PC, OA | OB | OC]
      ] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.union")
    @js.native
    def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD](
      options: UnionOptions,
      A: IType[CA, SA, TA],
      B: IType[CB, SB, TB],
      C: IType[CC, SC, TC],
      D: IType[CD, SD, TD]
    ): ITypeUnion[CA | CB | CC | CD, SA | SB | SC | SD, TA | TB | TC | TD] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.union")
    @js.native
    def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE](
      A: IType[CA, SA, TA],
      B: IType[CB, SB, TB],
      C: IType[CC, SC, TC],
      D: IType[CD, SD, TD],
      E: IType[CE, SE, TE]
    ): ITypeUnion[CA | CB | CC | CD | CE, SA | SB | SC | SD | SE, TA | TB | TC | TD | TE] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.union")
    @js.native
    def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE](
      options: UnionOptions,
      A: IType[CA, SA, TA],
      B: IType[CB, SB, TB],
      C: IType[CC, SC, TC],
      D: IType[CD, SD, TD],
      E: IType[CE, SE, TE]
    ): ITypeUnion[CA | CB | CC | CD | CE, SA | SB | SC | SD | SE, TA | TB | TC | TD | TE] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.union")
    @js.native
    def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD](
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD]
    ): ITypeUnion[
        ModelCreationType2[PA | PB | PC | PD, FCA | FCB | FCC | FCD], 
        ModelSnapshotType2[PA | PB | PC | PD, FSA | FSB | FSC | FSD], 
        ModelInstanceType[PA | PB | PC | PD, OA | OB | OC | OD]
      ] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.union")
    @js.native
    def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD](
      options: UnionOptions,
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD]
    ): ITypeUnion[
        ModelCreationType2[PA | PB | PC | PD, FCA | FCB | FCC | FCD], 
        ModelSnapshotType2[PA | PB | PC | PD, FSA | FSB | FSC | FSD], 
        ModelInstanceType[PA | PB | PC | PD, OA | OB | OC | OD]
      ] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.union")
    @js.native
    def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF](
      A: IType[CA, SA, TA],
      B: IType[CB, SB, TB],
      C: IType[CC, SC, TC],
      D: IType[CD, SD, TD],
      E: IType[CE, SE, TE],
      F: IType[CF, SF, TF]
    ): ITypeUnion[
        CA | CB | CC | CD | CE | CF, 
        SA | SB | SC | SD | SE | SF, 
        TA | TB | TC | TD | TE | TF
      ] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.union")
    @js.native
    def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF](
      options: UnionOptions,
      A: IType[CA, SA, TA],
      B: IType[CB, SB, TB],
      C: IType[CC, SC, TC],
      D: IType[CD, SD, TD],
      E: IType[CE, SE, TE],
      F: IType[CF, SF, TF]
    ): ITypeUnion[
        CA | CB | CC | CD | CE | CF, 
        SA | SB | SC | SD | SE | SF, 
        TA | TB | TC | TD | TE | TF
      ] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.union")
    @js.native
    def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE](
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD],
      E: IModelType[PE, OE, FCE, FSE]
    ): ITypeUnion[
        ModelCreationType2[PA | PB | PC | PD | PE, FCA | FCB | FCC | FCD | FCE], 
        ModelSnapshotType2[PA | PB | PC | PD | PE, FSA | FSB | FSC | FSD | FSE], 
        ModelInstanceType[PA | PB | PC | PD | PE, OA | OB | OC | OD | OE]
      ] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.union")
    @js.native
    def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE](
      options: UnionOptions,
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD],
      E: IModelType[PE, OE, FCE, FSE]
    ): ITypeUnion[
        ModelCreationType2[PA | PB | PC | PD | PE, FCA | FCB | FCC | FCD | FCE], 
        ModelSnapshotType2[PA | PB | PC | PD | PE, FSA | FSB | FSC | FSD | FSE], 
        ModelInstanceType[PA | PB | PC | PD | PE, OA | OB | OC | OD | OE]
      ] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.union")
    @js.native
    def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF, CG, SG, TG](
      A: IType[CA, SA, TA],
      B: IType[CB, SB, TB],
      C: IType[CC, SC, TC],
      D: IType[CD, SD, TD],
      E: IType[CE, SE, TE],
      F: IType[CF, SF, TF],
      G: IType[CG, SG, TG]
    ): ITypeUnion[
        CA | CB | CC | CD | CE | CF | CG, 
        SA | SB | SC | SD | SE | SF | SG, 
        TA | TB | TC | TD | TE | TF | TG
      ] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.union")
    @js.native
    def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF, CG, SG, TG](
      options: UnionOptions,
      A: IType[CA, SA, TA],
      B: IType[CB, SB, TB],
      C: IType[CC, SC, TC],
      D: IType[CD, SD, TD],
      E: IType[CE, SE, TE],
      F: IType[CF, SF, TF],
      G: IType[CG, SG, TG]
    ): ITypeUnion[
        CA | CB | CC | CD | CE | CF | CG, 
        SA | SB | SC | SD | SE | SF | SG, 
        TA | TB | TC | TD | TE | TF | TG
      ] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.union")
    @js.native
    def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF](
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD],
      E: IModelType[PE, OE, FCE, FSE],
      F: IModelType[PF, OF, FCF, FSF]
    ): ITypeUnion[
        ModelCreationType2[PA | PB | PC | PD | PE | PF, FCA | FCB | FCC | FCD | FCE | FCF], 
        ModelSnapshotType2[PA | PB | PC | PD | PE | PF, FSA | FSB | FSC | FSD | FSE | FSF], 
        ModelInstanceType[PA | PB | PC | PD | PE | PF, OA | OB | OC | OD | OE | OF]
      ] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.union")
    @js.native
    def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF, CG, SG, TG, CH, SH, TH](
      A: IType[CA, SA, TA],
      B: IType[CB, SB, TB],
      C: IType[CC, SC, TC],
      D: IType[CD, SD, TD],
      E: IType[CE, SE, TE],
      F: IType[CF, SF, TF],
      G: IType[CG, SG, TG],
      H: IType[CH, SH, TH]
    ): ITypeUnion[
        CA | CB | CC | CD | CE | CF | CG | CH, 
        SA | SB | SC | SD | SE | SF | SG | SH, 
        TA | TB | TC | TD | TE | TF | TG | TH
      ] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.union")
    @js.native
    def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF](
      options: UnionOptions,
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD],
      E: IModelType[PE, OE, FCE, FSE],
      F: IModelType[PF, OF, FCF, FSF]
    ): ITypeUnion[
        ModelCreationType2[PA | PB | PC | PD | PE | PF, FCA | FCB | FCC | FCD | FCE | FCF], 
        ModelSnapshotType2[PA | PB | PC | PD | PE | PF, FSA | FSB | FSC | FSD | FSE | FSF], 
        ModelInstanceType[PA | PB | PC | PD | PE | PF, OA | OB | OC | OD | OE | OF]
      ] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.union")
    @js.native
    def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF, CG, SG, TG, CH, SH, TH](
      options: UnionOptions,
      A: IType[CA, SA, TA],
      B: IType[CB, SB, TB],
      C: IType[CC, SC, TC],
      D: IType[CD, SD, TD],
      E: IType[CE, SE, TE],
      F: IType[CF, SF, TF],
      G: IType[CG, SG, TG],
      H: IType[CH, SH, TH]
    ): ITypeUnion[
        CA | CB | CC | CD | CE | CF | CG | CH, 
        SA | SB | SC | SD | SE | SF | SG | SH, 
        TA | TB | TC | TD | TE | TF | TG | TH
      ] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.union")
    @js.native
    def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF, CG, SG, TG, CH, SH, TH, CI, SI, TI](
      A: IType[CA, SA, TA],
      B: IType[CB, SB, TB],
      C: IType[CC, SC, TC],
      D: IType[CD, SD, TD],
      E: IType[CE, SE, TE],
      F: IType[CF, SF, TF],
      G: IType[CG, SG, TG],
      H: IType[CH, SH, TH],
      I: IType[CI, SI, TI]
    ): ITypeUnion[
        CA | CB | CC | CD | CE | CF | CG | CH | CI, 
        SA | SB | SC | SD | SE | SF | SG | SH | SI, 
        TA | TB | TC | TD | TE | TF | TG | TH | TI
      ] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.union")
    @js.native
    def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF, CG, SG, TG, CH, SH, TH, CI, SI, TI](
      options: UnionOptions,
      A: IType[CA, SA, TA],
      B: IType[CB, SB, TB],
      C: IType[CC, SC, TC],
      D: IType[CD, SD, TD],
      E: IType[CE, SE, TE],
      F: IType[CF, SF, TF],
      G: IType[CG, SG, TG],
      H: IType[CH, SH, TH],
      I: IType[CI, SI, TI]
    ): ITypeUnion[
        CA | CB | CC | CD | CE | CF | CG | CH | CI, 
        SA | SB | SC | SD | SE | SF | SG | SH | SI, 
        TA | TB | TC | TD | TE | TF | TG | TH | TI
      ] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.union")
    @js.native
    def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG](
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD],
      E: IModelType[PE, OE, FCE, FSE],
      F: IModelType[PF, OF, FCF, FSF],
      G: IModelType[PG, OG, FCG, FSG]
    ): ITypeUnion[
        ModelCreationType2[PA | PB | PC | PD | PE | PF | PG, FCA | FCB | FCC | FCD | FCE | FCF | FCG], 
        ModelSnapshotType2[PA | PB | PC | PD | PE | PF | PG, FSA | FSB | FSC | FSD | FSE | FSF | FSG], 
        ModelInstanceType[PA | PB | PC | PD | PE | PF | PG, OA | OB | OC | OD | OE | OF | OG]
      ] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.union")
    @js.native
    def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG](
      options: UnionOptions,
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD],
      E: IModelType[PE, OE, FCE, FSE],
      F: IModelType[PF, OF, FCF, FSF],
      G: IModelType[PG, OG, FCG, FSG]
    ): ITypeUnion[
        ModelCreationType2[PA | PB | PC | PD | PE | PF | PG, FCA | FCB | FCC | FCD | FCE | FCF | FCG], 
        ModelSnapshotType2[PA | PB | PC | PD | PE | PF | PG, FSA | FSB | FSC | FSD | FSE | FSF | FSG], 
        ModelInstanceType[PA | PB | PC | PD | PE | PF | PG, OA | OB | OC | OD | OE | OF | OG]
      ] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.union")
    @js.native
    def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG, PH /* <: ModelProperties */, OH, FCH, FSH](
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD],
      E: IModelType[PE, OE, FCE, FSE],
      F: IModelType[PF, OF, FCF, FSF],
      G: IModelType[PG, OG, FCG, FSG],
      H: IModelType[PH, OH, FCH, FSH]
    ): ITypeUnion[
        ModelCreationType2[
          PA | PB | PC | PD | PE | PF | PG | PH, 
          FCA | FCB | FCC | FCD | FCE | FCF | FCG | FCH
        ], 
        ModelSnapshotType2[
          PA | PB | PC | PD | PE | PF | PG | PH, 
          FSA | FSB | FSC | FSD | FSE | FSF | FSG | FSH
        ], 
        ModelInstanceType[PA | PB | PC | PD | PE | PF | PG | PH, OA | OB | OC | OD | OE | OF | OG | OH]
      ] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.union")
    @js.native
    def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG, PH /* <: ModelProperties */, OH, FCH, FSH](
      options: UnionOptions,
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD],
      E: IModelType[PE, OE, FCE, FSE],
      F: IModelType[PF, OF, FCF, FSF],
      G: IModelType[PG, OG, FCG, FSG],
      H: IModelType[PH, OH, FCH, FSH]
    ): ITypeUnion[
        ModelCreationType2[
          PA | PB | PC | PD | PE | PF | PG | PH, 
          FCA | FCB | FCC | FCD | FCE | FCF | FCG | FCH
        ], 
        ModelSnapshotType2[
          PA | PB | PC | PD | PE | PF | PG | PH, 
          FSA | FSB | FSC | FSD | FSE | FSF | FSG | FSH
        ], 
        ModelInstanceType[PA | PB | PC | PD | PE | PF | PG | PH, OA | OB | OC | OD | OE | OF | OG | OH]
      ] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.union")
    @js.native
    def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG, PH /* <: ModelProperties */, OH, FCH, FSH, PI /* <: ModelProperties */, OI, FCI, FSI](
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD],
      E: IModelType[PE, OE, FCE, FSE],
      F: IModelType[PF, OF, FCF, FSF],
      G: IModelType[PG, OG, FCG, FSG],
      H: IModelType[PH, OH, FCH, FSH],
      I: IModelType[PI, OI, FCI, FSI]
    ): ITypeUnion[
        ModelCreationType2[
          PA | PB | PC | PD | PE | PF | PG | PH | PI, 
          FCA | FCB | FCC | FCD | FCE | FCF | FCG | FCH | FCI
        ], 
        ModelSnapshotType2[
          PA | PB | PC | PD | PE | PF | PG | PH | PI, 
          FSA | FSB | FSC | FSD | FSE | FSF | FSG | FSH | FSI
        ], 
        ModelInstanceType[
          PA | PB | PC | PD | PE | PF | PG | PH | PI, 
          OA | OB | OC | OD | OE | OF | OG | OH | OI
        ]
      ] = js.native
    @JSImport("mobx-state-tree/dist/internal", "types.union")
    @js.native
    def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG, PH /* <: ModelProperties */, OH, FCH, FSH, PI /* <: ModelProperties */, OI, FCI, FSI](
      options: UnionOptions,
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD],
      E: IModelType[PE, OE, FCE, FSE],
      F: IModelType[PF, OF, FCF, FSF],
      G: IModelType[PG, OG, FCG, FSG],
      H: IModelType[PH, OH, FCH, FSH],
      I: IModelType[PI, OI, FCI, FSI]
    ): ITypeUnion[
        ModelCreationType2[
          PA | PB | PC | PD | PE | PF | PG | PH | PI, 
          FCA | FCB | FCC | FCD | FCE | FCF | FCG | FCH | FCI
        ], 
        ModelSnapshotType2[
          PA | PB | PC | PD | PE | PF | PG | PH | PI, 
          FSA | FSB | FSC | FSD | FSE | FSF | FSG | FSH | FSI
        ], 
        ModelInstanceType[
          PA | PB | PC | PD | PE | PF | PG | PH | PI, 
          OA | OB | OC | OD | OE | OF | OG | OH | OI
        ]
      ] = js.native
    @scala.inline
    def union_=(x: FnCallOptionsABCDEFGHI): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("union")(x.asInstanceOf[js.Any])
    
    @JSImport("mobx-state-tree/dist/internal", "types.null")
    @js.native
    val `null`: ISimpleType[Null] = js.native
  }
  
  @JSImport("mobx-state-tree/dist/internal", "undefinedType")
  @js.native
  val undefinedType: ISimpleType[js.UndefOr[scala.Nothing]] = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "unescapeJsonPath")
  @js.native
  def unescapeJsonPath(path: String): String = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "union")
  @js.native
  def union(dispatchOrType: IAnyType, otherTypes: IAnyType*): IAnyType = js.native
  @JSImport("mobx-state-tree/dist/internal", "union")
  @js.native
  def union(dispatchOrType: UnionOptions, otherTypes: IAnyType*): IAnyType = js.native
  @JSImport("mobx-state-tree/dist/internal", "union")
  @js.native
  def union(types: IAnyType*): IAnyType = js.native
  @JSImport("mobx-state-tree/dist/internal", "union")
  @js.native
  def union[CA, SA, TA, CB, SB, TB](A: IType[CA, SA, TA], B: IType[CB, SB, TB]): ITypeUnion[CA | CB, SA | SB, TA | TB] = js.native
  @JSImport("mobx-state-tree/dist/internal", "union")
  @js.native
  def union[CA, SA, TA, CB, SB, TB](options: UnionOptions, A: IType[CA, SA, TA], B: IType[CB, SB, TB]): ITypeUnion[CA | CB, SA | SB, TA | TB] = js.native
  @JSImport("mobx-state-tree/dist/internal", "union")
  @js.native
  def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB](A: IModelType[PA, OA, FCA, FSA], B: IModelType[PB, OB, FCB, FSB]): ITypeUnion[
    ModelCreationType2[PA | PB, FCA | FCB], 
    ModelSnapshotType2[PA | PB, FSA | FSB], 
    ModelInstanceType[PA | PB, OA | OB]
  ] = js.native
  @JSImport("mobx-state-tree/dist/internal", "union")
  @js.native
  def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB](options: UnionOptions, A: IModelType[PA, OA, FCA, FSA], B: IModelType[PB, OB, FCB, FSB]): ITypeUnion[
    ModelCreationType2[PA | PB, FCA | FCB], 
    ModelSnapshotType2[PA | PB, FSA | FSB], 
    ModelInstanceType[PA | PB, OA | OB]
  ] = js.native
  @JSImport("mobx-state-tree/dist/internal", "union")
  @js.native
  def union[CA, SA, TA, CB, SB, TB, CC, SC, TC](A: IType[CA, SA, TA], B: IType[CB, SB, TB], C: IType[CC, SC, TC]): ITypeUnion[CA | CB | CC, SA | SB | SC, TA | TB | TC] = js.native
  @JSImport("mobx-state-tree/dist/internal", "union")
  @js.native
  def union[CA, SA, TA, CB, SB, TB, CC, SC, TC](options: UnionOptions, A: IType[CA, SA, TA], B: IType[CB, SB, TB], C: IType[CC, SC, TC]): ITypeUnion[CA | CB | CC, SA | SB | SC, TA | TB | TC] = js.native
  @JSImport("mobx-state-tree/dist/internal", "union")
  @js.native
  def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC](A: IModelType[PA, OA, FCA, FSA], B: IModelType[PB, OB, FCB, FSB], C: IModelType[PC, OC, FCC, FSC]): ITypeUnion[
    ModelCreationType2[PA | PB | PC, FCA | FCB | FCC], 
    ModelSnapshotType2[PA | PB | PC, FSA | FSB | FSC], 
    ModelInstanceType[PA | PB | PC, OA | OB | OC]
  ] = js.native
  @JSImport("mobx-state-tree/dist/internal", "union")
  @js.native
  def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD](A: IType[CA, SA, TA], B: IType[CB, SB, TB], C: IType[CC, SC, TC], D: IType[CD, SD, TD]): ITypeUnion[CA | CB | CC | CD, SA | SB | SC | SD, TA | TB | TC | TD] = js.native
  @JSImport("mobx-state-tree/dist/internal", "union")
  @js.native
  def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC](
    options: UnionOptions,
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC]
  ): ITypeUnion[
    ModelCreationType2[PA | PB | PC, FCA | FCB | FCC], 
    ModelSnapshotType2[PA | PB | PC, FSA | FSB | FSC], 
    ModelInstanceType[PA | PB | PC, OA | OB | OC]
  ] = js.native
  @JSImport("mobx-state-tree/dist/internal", "union")
  @js.native
  def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD](
    options: UnionOptions,
    A: IType[CA, SA, TA],
    B: IType[CB, SB, TB],
    C: IType[CC, SC, TC],
    D: IType[CD, SD, TD]
  ): ITypeUnion[CA | CB | CC | CD, SA | SB | SC | SD, TA | TB | TC | TD] = js.native
  @JSImport("mobx-state-tree/dist/internal", "union")
  @js.native
  def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE](
    A: IType[CA, SA, TA],
    B: IType[CB, SB, TB],
    C: IType[CC, SC, TC],
    D: IType[CD, SD, TD],
    E: IType[CE, SE, TE]
  ): ITypeUnion[CA | CB | CC | CD | CE, SA | SB | SC | SD | SE, TA | TB | TC | TD | TE] = js.native
  @JSImport("mobx-state-tree/dist/internal", "union")
  @js.native
  def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE](
    options: UnionOptions,
    A: IType[CA, SA, TA],
    B: IType[CB, SB, TB],
    C: IType[CC, SC, TC],
    D: IType[CD, SD, TD],
    E: IType[CE, SE, TE]
  ): ITypeUnion[CA | CB | CC | CD | CE, SA | SB | SC | SD | SE, TA | TB | TC | TD | TE] = js.native
  @JSImport("mobx-state-tree/dist/internal", "union")
  @js.native
  def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD](
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD]
  ): ITypeUnion[
    ModelCreationType2[PA | PB | PC | PD, FCA | FCB | FCC | FCD], 
    ModelSnapshotType2[PA | PB | PC | PD, FSA | FSB | FSC | FSD], 
    ModelInstanceType[PA | PB | PC | PD, OA | OB | OC | OD]
  ] = js.native
  @JSImport("mobx-state-tree/dist/internal", "union")
  @js.native
  def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD](
    options: UnionOptions,
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD]
  ): ITypeUnion[
    ModelCreationType2[PA | PB | PC | PD, FCA | FCB | FCC | FCD], 
    ModelSnapshotType2[PA | PB | PC | PD, FSA | FSB | FSC | FSD], 
    ModelInstanceType[PA | PB | PC | PD, OA | OB | OC | OD]
  ] = js.native
  @JSImport("mobx-state-tree/dist/internal", "union")
  @js.native
  def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF](
    A: IType[CA, SA, TA],
    B: IType[CB, SB, TB],
    C: IType[CC, SC, TC],
    D: IType[CD, SD, TD],
    E: IType[CE, SE, TE],
    F: IType[CF, SF, TF]
  ): ITypeUnion[
    CA | CB | CC | CD | CE | CF, 
    SA | SB | SC | SD | SE | SF, 
    TA | TB | TC | TD | TE | TF
  ] = js.native
  @JSImport("mobx-state-tree/dist/internal", "union")
  @js.native
  def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF](
    options: UnionOptions,
    A: IType[CA, SA, TA],
    B: IType[CB, SB, TB],
    C: IType[CC, SC, TC],
    D: IType[CD, SD, TD],
    E: IType[CE, SE, TE],
    F: IType[CF, SF, TF]
  ): ITypeUnion[
    CA | CB | CC | CD | CE | CF, 
    SA | SB | SC | SD | SE | SF, 
    TA | TB | TC | TD | TE | TF
  ] = js.native
  @JSImport("mobx-state-tree/dist/internal", "union")
  @js.native
  def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE](
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE]
  ): ITypeUnion[
    ModelCreationType2[PA | PB | PC | PD | PE, FCA | FCB | FCC | FCD | FCE], 
    ModelSnapshotType2[PA | PB | PC | PD | PE, FSA | FSB | FSC | FSD | FSE], 
    ModelInstanceType[PA | PB | PC | PD | PE, OA | OB | OC | OD | OE]
  ] = js.native
  @JSImport("mobx-state-tree/dist/internal", "union")
  @js.native
  def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE](
    options: UnionOptions,
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE]
  ): ITypeUnion[
    ModelCreationType2[PA | PB | PC | PD | PE, FCA | FCB | FCC | FCD | FCE], 
    ModelSnapshotType2[PA | PB | PC | PD | PE, FSA | FSB | FSC | FSD | FSE], 
    ModelInstanceType[PA | PB | PC | PD | PE, OA | OB | OC | OD | OE]
  ] = js.native
  @JSImport("mobx-state-tree/dist/internal", "union")
  @js.native
  def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF, CG, SG, TG](
    A: IType[CA, SA, TA],
    B: IType[CB, SB, TB],
    C: IType[CC, SC, TC],
    D: IType[CD, SD, TD],
    E: IType[CE, SE, TE],
    F: IType[CF, SF, TF],
    G: IType[CG, SG, TG]
  ): ITypeUnion[
    CA | CB | CC | CD | CE | CF | CG, 
    SA | SB | SC | SD | SE | SF | SG, 
    TA | TB | TC | TD | TE | TF | TG
  ] = js.native
  @JSImport("mobx-state-tree/dist/internal", "union")
  @js.native
  def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF, CG, SG, TG](
    options: UnionOptions,
    A: IType[CA, SA, TA],
    B: IType[CB, SB, TB],
    C: IType[CC, SC, TC],
    D: IType[CD, SD, TD],
    E: IType[CE, SE, TE],
    F: IType[CF, SF, TF],
    G: IType[CG, SG, TG]
  ): ITypeUnion[
    CA | CB | CC | CD | CE | CF | CG, 
    SA | SB | SC | SD | SE | SF | SG, 
    TA | TB | TC | TD | TE | TF | TG
  ] = js.native
  @JSImport("mobx-state-tree/dist/internal", "union")
  @js.native
  def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF](
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE],
    F: IModelType[PF, OF, FCF, FSF]
  ): ITypeUnion[
    ModelCreationType2[PA | PB | PC | PD | PE | PF, FCA | FCB | FCC | FCD | FCE | FCF], 
    ModelSnapshotType2[PA | PB | PC | PD | PE | PF, FSA | FSB | FSC | FSD | FSE | FSF], 
    ModelInstanceType[PA | PB | PC | PD | PE | PF, OA | OB | OC | OD | OE | OF]
  ] = js.native
  @JSImport("mobx-state-tree/dist/internal", "union")
  @js.native
  def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF, CG, SG, TG, CH, SH, TH](
    A: IType[CA, SA, TA],
    B: IType[CB, SB, TB],
    C: IType[CC, SC, TC],
    D: IType[CD, SD, TD],
    E: IType[CE, SE, TE],
    F: IType[CF, SF, TF],
    G: IType[CG, SG, TG],
    H: IType[CH, SH, TH]
  ): ITypeUnion[
    CA | CB | CC | CD | CE | CF | CG | CH, 
    SA | SB | SC | SD | SE | SF | SG | SH, 
    TA | TB | TC | TD | TE | TF | TG | TH
  ] = js.native
  @JSImport("mobx-state-tree/dist/internal", "union")
  @js.native
  def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF](
    options: UnionOptions,
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE],
    F: IModelType[PF, OF, FCF, FSF]
  ): ITypeUnion[
    ModelCreationType2[PA | PB | PC | PD | PE | PF, FCA | FCB | FCC | FCD | FCE | FCF], 
    ModelSnapshotType2[PA | PB | PC | PD | PE | PF, FSA | FSB | FSC | FSD | FSE | FSF], 
    ModelInstanceType[PA | PB | PC | PD | PE | PF, OA | OB | OC | OD | OE | OF]
  ] = js.native
  @JSImport("mobx-state-tree/dist/internal", "union")
  @js.native
  def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF, CG, SG, TG, CH, SH, TH](
    options: UnionOptions,
    A: IType[CA, SA, TA],
    B: IType[CB, SB, TB],
    C: IType[CC, SC, TC],
    D: IType[CD, SD, TD],
    E: IType[CE, SE, TE],
    F: IType[CF, SF, TF],
    G: IType[CG, SG, TG],
    H: IType[CH, SH, TH]
  ): ITypeUnion[
    CA | CB | CC | CD | CE | CF | CG | CH, 
    SA | SB | SC | SD | SE | SF | SG | SH, 
    TA | TB | TC | TD | TE | TF | TG | TH
  ] = js.native
  @JSImport("mobx-state-tree/dist/internal", "union")
  @js.native
  def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF, CG, SG, TG, CH, SH, TH, CI, SI, TI](
    A: IType[CA, SA, TA],
    B: IType[CB, SB, TB],
    C: IType[CC, SC, TC],
    D: IType[CD, SD, TD],
    E: IType[CE, SE, TE],
    F: IType[CF, SF, TF],
    G: IType[CG, SG, TG],
    H: IType[CH, SH, TH],
    I: IType[CI, SI, TI]
  ): ITypeUnion[
    CA | CB | CC | CD | CE | CF | CG | CH | CI, 
    SA | SB | SC | SD | SE | SF | SG | SH | SI, 
    TA | TB | TC | TD | TE | TF | TG | TH | TI
  ] = js.native
  @JSImport("mobx-state-tree/dist/internal", "union")
  @js.native
  def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF, CG, SG, TG, CH, SH, TH, CI, SI, TI](
    options: UnionOptions,
    A: IType[CA, SA, TA],
    B: IType[CB, SB, TB],
    C: IType[CC, SC, TC],
    D: IType[CD, SD, TD],
    E: IType[CE, SE, TE],
    F: IType[CF, SF, TF],
    G: IType[CG, SG, TG],
    H: IType[CH, SH, TH],
    I: IType[CI, SI, TI]
  ): ITypeUnion[
    CA | CB | CC | CD | CE | CF | CG | CH | CI, 
    SA | SB | SC | SD | SE | SF | SG | SH | SI, 
    TA | TB | TC | TD | TE | TF | TG | TH | TI
  ] = js.native
  @JSImport("mobx-state-tree/dist/internal", "union")
  @js.native
  def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG](
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE],
    F: IModelType[PF, OF, FCF, FSF],
    G: IModelType[PG, OG, FCG, FSG]
  ): ITypeUnion[
    ModelCreationType2[PA | PB | PC | PD | PE | PF | PG, FCA | FCB | FCC | FCD | FCE | FCF | FCG], 
    ModelSnapshotType2[PA | PB | PC | PD | PE | PF | PG, FSA | FSB | FSC | FSD | FSE | FSF | FSG], 
    ModelInstanceType[PA | PB | PC | PD | PE | PF | PG, OA | OB | OC | OD | OE | OF | OG]
  ] = js.native
  @JSImport("mobx-state-tree/dist/internal", "union")
  @js.native
  def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG](
    options: UnionOptions,
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE],
    F: IModelType[PF, OF, FCF, FSF],
    G: IModelType[PG, OG, FCG, FSG]
  ): ITypeUnion[
    ModelCreationType2[PA | PB | PC | PD | PE | PF | PG, FCA | FCB | FCC | FCD | FCE | FCF | FCG], 
    ModelSnapshotType2[PA | PB | PC | PD | PE | PF | PG, FSA | FSB | FSC | FSD | FSE | FSF | FSG], 
    ModelInstanceType[PA | PB | PC | PD | PE | PF | PG, OA | OB | OC | OD | OE | OF | OG]
  ] = js.native
  @JSImport("mobx-state-tree/dist/internal", "union")
  @js.native
  def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG, PH /* <: ModelProperties */, OH, FCH, FSH](
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE],
    F: IModelType[PF, OF, FCF, FSF],
    G: IModelType[PG, OG, FCG, FSG],
    H: IModelType[PH, OH, FCH, FSH]
  ): ITypeUnion[
    ModelCreationType2[
      PA | PB | PC | PD | PE | PF | PG | PH, 
      FCA | FCB | FCC | FCD | FCE | FCF | FCG | FCH
    ], 
    ModelSnapshotType2[
      PA | PB | PC | PD | PE | PF | PG | PH, 
      FSA | FSB | FSC | FSD | FSE | FSF | FSG | FSH
    ], 
    ModelInstanceType[PA | PB | PC | PD | PE | PF | PG | PH, OA | OB | OC | OD | OE | OF | OG | OH]
  ] = js.native
  @JSImport("mobx-state-tree/dist/internal", "union")
  @js.native
  def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG, PH /* <: ModelProperties */, OH, FCH, FSH](
    options: UnionOptions,
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE],
    F: IModelType[PF, OF, FCF, FSF],
    G: IModelType[PG, OG, FCG, FSG],
    H: IModelType[PH, OH, FCH, FSH]
  ): ITypeUnion[
    ModelCreationType2[
      PA | PB | PC | PD | PE | PF | PG | PH, 
      FCA | FCB | FCC | FCD | FCE | FCF | FCG | FCH
    ], 
    ModelSnapshotType2[
      PA | PB | PC | PD | PE | PF | PG | PH, 
      FSA | FSB | FSC | FSD | FSE | FSF | FSG | FSH
    ], 
    ModelInstanceType[PA | PB | PC | PD | PE | PF | PG | PH, OA | OB | OC | OD | OE | OF | OG | OH]
  ] = js.native
  @JSImport("mobx-state-tree/dist/internal", "union")
  @js.native
  def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG, PH /* <: ModelProperties */, OH, FCH, FSH, PI /* <: ModelProperties */, OI, FCI, FSI](
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE],
    F: IModelType[PF, OF, FCF, FSF],
    G: IModelType[PG, OG, FCG, FSG],
    H: IModelType[PH, OH, FCH, FSH],
    I: IModelType[PI, OI, FCI, FSI]
  ): ITypeUnion[
    ModelCreationType2[
      PA | PB | PC | PD | PE | PF | PG | PH | PI, 
      FCA | FCB | FCC | FCD | FCE | FCF | FCG | FCH | FCI
    ], 
    ModelSnapshotType2[
      PA | PB | PC | PD | PE | PF | PG | PH | PI, 
      FSA | FSB | FSC | FSD | FSE | FSF | FSG | FSH | FSI
    ], 
    ModelInstanceType[
      PA | PB | PC | PD | PE | PF | PG | PH | PI, 
      OA | OB | OC | OD | OE | OF | OG | OH | OI
    ]
  ] = js.native
  @JSImport("mobx-state-tree/dist/internal", "union")
  @js.native
  def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG, PH /* <: ModelProperties */, OH, FCH, FSH, PI /* <: ModelProperties */, OI, FCI, FSI](
    options: UnionOptions,
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE],
    F: IModelType[PF, OF, FCF, FSF],
    G: IModelType[PG, OG, FCG, FSG],
    H: IModelType[PH, OH, FCH, FSH],
    I: IModelType[PI, OI, FCI, FSI]
  ): ITypeUnion[
    ModelCreationType2[
      PA | PB | PC | PD | PE | PF | PG | PH | PI, 
      FCA | FCB | FCC | FCD | FCE | FCF | FCG | FCH | FCI
    ], 
    ModelSnapshotType2[
      PA | PB | PC | PD | PE | PF | PG | PH | PI, 
      FSA | FSB | FSC | FSD | FSE | FSF | FSG | FSH | FSI
    ], 
    ModelInstanceType[
      PA | PB | PC | PD | PE | PF | PG | PH | PI, 
      OA | OB | OC | OD | OE | OF | OG | OH | OI
    ]
  ] = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "unprotect")
  @js.native
  def unprotect(target: IAnyStateTreeNode): Unit = js.native
  
  @JSImport("mobx-state-tree/dist/internal", "walk")
  @js.native
  def walk(target: IAnyStateTreeNode, processor: js.Function1[/* item */ IAnyStateTreeNode, Unit]): Unit = js.native
}
