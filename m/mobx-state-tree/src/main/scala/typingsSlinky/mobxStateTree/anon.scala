package typingsSlinky.mobxStateTree

import typingsSlinky.mobxStateTree.arrayMod.IArrayType
import typingsSlinky.mobxStateTree.customMod.CustomTypeOptions
import typingsSlinky.mobxStateTree.enumerationMod.UnionStringArray
import typingsSlinky.mobxStateTree.mapMod.IMapType
import typingsSlinky.mobxStateTree.maybeMod.IMaybe
import typingsSlinky.mobxStateTree.maybeMod.IMaybeNull
import typingsSlinky.mobxStateTree.mobxStateTreeBooleans.`false`
import typingsSlinky.mobxStateTree.modelMod.CustomJoin
import typingsSlinky.mobxStateTree.modelMod.IModelType
import typingsSlinky.mobxStateTree.modelMod.ModelActions
import typingsSlinky.mobxStateTree.modelMod.ModelCreationType2
import typingsSlinky.mobxStateTree.modelMod.ModelInstanceType
import typingsSlinky.mobxStateTree.modelMod.ModelProperties
import typingsSlinky.mobxStateTree.modelMod.ModelPropertiesDeclaration
import typingsSlinky.mobxStateTree.modelMod.ModelPropertiesDeclarationToProperties
import typingsSlinky.mobxStateTree.modelMod.ModelSnapshotType2
import typingsSlinky.mobxStateTree.optionalMod.IOptionalIType
import typingsSlinky.mobxStateTree.optionalMod.OptionalDefaultValueOrFunction
import typingsSlinky.mobxStateTree.optionalMod.ValidOptionalValues
import typingsSlinky.mobxStateTree.referenceMod.IReferenceType
import typingsSlinky.mobxStateTree.referenceMod.ReferenceOptions
import typingsSlinky.mobxStateTree.referenceMod.ReferenceOptionsGetSet
import typingsSlinky.mobxStateTree.snapshotProcessorMod.ISnapshotProcessor
import typingsSlinky.mobxStateTree.snapshotProcessorMod.ISnapshotProcessors
import typingsSlinky.mobxStateTree.snapshotProcessorMod.NotCustomized
import typingsSlinky.mobxStateTree.typeMod.IAnyComplexType
import typingsSlinky.mobxStateTree.typeMod.IAnyType
import typingsSlinky.mobxStateTree.typeMod.ISimpleType
import typingsSlinky.mobxStateTree.typeMod.IType
import typingsSlinky.mobxStateTree.unionMod.ITypeUnion
import typingsSlinky.mobxStateTree.unionMod.UnionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0` extends StObject {
    
    var acceptsUndefined: `false` = js.native
  }
  object `0` {
    
    @scala.inline
    def apply(acceptsUndefined: `false`): `0` = {
      val __obj = js.Dynamic.literal(acceptsUndefined = acceptsUndefined.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcceptsUndefined(value: `false`): Self = StObject.set(x, "acceptsUndefined", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AcceptsUndefined extends StObject {
    
    var acceptsUndefined: js.UndefOr[Boolean] = js.native
  }
  object AcceptsUndefined {
    
    @scala.inline
    def apply(): AcceptsUndefined = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AcceptsUndefined]
    }
    
    @scala.inline
    implicit class AcceptsUndefinedMutableBuilder[Self <: AcceptsUndefined] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcceptsUndefined(value: Boolean): Self = StObject.set(x, "acceptsUndefined", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptsUndefinedUndefined: Self = StObject.set(x, "acceptsUndefined", js.undefined)
    }
  }
  
  @js.native
  trait Actions[A /* <: ModelActions */, V /* <: js.Object */, VS /* <: js.Object */] extends StObject {
    
    var actions: js.UndefOr[A] = js.native
    
    var state: js.UndefOr[VS] = js.native
    
    var views: js.UndefOr[V] = js.native
  }
  object Actions {
    
    @scala.inline
    def apply[A /* <: ModelActions */, V /* <: js.Object */, VS /* <: js.Object */](): Actions[A, V, VS] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Actions[A, V, VS]]
    }
    
    @scala.inline
    implicit class ActionsMutableBuilder[Self <: Actions[_, _, _], A /* <: ModelActions */, V /* <: js.Object */, VS /* <: js.Object */] (val x: Self with (Actions[A, V, VS])) extends AnyVal {
      
      @scala.inline
      def setActions(value: A): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      @scala.inline
      def setState(value: VS): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setViews(value: V): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
    }
  }
  
  @js.native
  trait CreationType extends StObject {
    
    var CreationType: js.Any = js.native
    
    var SnapshotType: js.Any = js.native
    
    var TypeWithoutSTN: js.Any = js.native
  }
  
  @js.native
  trait CreationTypeType extends StObject {
    
    var CreationType: js.Any = js.native
  }
  
  @js.native
  trait Fn0 extends StObject {
    
    def apply[IT /* <: IAnyComplexType */](subType: IT): IMaybe[IReferenceType[IT]] = js.native
    def apply[IT /* <: IAnyComplexType */](subType: IT, options: (ReferenceOptionsGetSet[IT] | js.Object) with `0`): IReferenceType[IT] = js.native
  }
  
  @js.native
  trait Fn1 extends StObject {
    
    def apply[IT /* <: IAnyType */](`type`: IT): IMaybeNull[IT] = js.native
  }
  
  @js.native
  trait Fn2 extends StObject {
    
    def apply[IT /* <: IAnyType */](subtype: IT): IArrayType[IT] = js.native
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[T /* <: String */](name: String, options: js.Array[T]): ISimpleType[UnionStringArray[js.Array[T]]] = js.native
    def apply[T /* <: String */](options: js.Array[T]): ISimpleType[UnionStringArray[js.Array[T]]] = js.native
  }
  
  @js.native
  trait FnCallDefaultValue extends StObject {
    
    def apply[T](): IType[T, T, T] = js.native
    def apply[T](defaultValue: T): IType[js.UndefOr[T | Null], T, T] = js.native
    def apply[C](subType: IType[C, _, _]): IType[C, C, C] = js.native
  }
  
  @js.native
  trait FnCallNameABCDEFGHI extends StObject {
    
    def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB](A: IModelType[PA, OA, FCA, FSA], B: IModelType[PB, OB, FCB, FSB]): IModelType[PA with PB, OA with OB, CustomJoin[FCA, FCB], CustomJoin[FSA, FSB]] = js.native
    def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB](name: String, A: IModelType[PA, OA, FCA, FSA], B: IModelType[PB, OB, FCB, FSB]): IModelType[PA with PB, OA with OB, CustomJoin[FCA, FCB], CustomJoin[FSA, FSB]] = js.native
    def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC](A: IModelType[PA, OA, FCA, FSA], B: IModelType[PB, OB, FCB, FSB], C: IModelType[PC, OC, FCC, FSC]): IModelType[
        PA with PB with PC, 
        OA with OB with OC, 
        CustomJoin[FCA, CustomJoin[FCB, FCC]], 
        CustomJoin[FSA, CustomJoin[FSB, FSC]]
      ] = js.native
    def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC](
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
    def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD](
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
    def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD](
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
    def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE](
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
    def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE](
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
    def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF](
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
    def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF](
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
    def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG](
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
    def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG](
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
    def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG, PH /* <: ModelProperties */, OH, FCH, FSH](
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
    def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG, PH /* <: ModelProperties */, OH, FCH, FSH](
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
    def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG, PH /* <: ModelProperties */, OH, FCH, FSH, PI /* <: ModelProperties */, OI, FCI, FSI](
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
    def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG, PH /* <: ModelProperties */, OH, FCH, FSH, PI /* <: ModelProperties */, OI, FCI, FSI](
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
  }
  
  @js.native
  trait FnCallNameProperties extends StObject {
    
    def apply[P /* <: ModelPropertiesDeclaration */](): IModelType[ModelPropertiesDeclarationToProperties[P], js.Object, NotCustomized, NotCustomized] = js.native
    def apply[P /* <: ModelPropertiesDeclaration */](name: String): IModelType[ModelPropertiesDeclarationToProperties[P], js.Object, NotCustomized, NotCustomized] = js.native
    def apply[P /* <: ModelPropertiesDeclaration */](name: String, properties: P): IModelType[ModelPropertiesDeclarationToProperties[P], js.Object, NotCustomized, NotCustomized] = js.native
    def apply[P /* <: ModelPropertiesDeclaration */](properties: P): IModelType[ModelPropertiesDeclarationToProperties[P], js.Object, NotCustomized, NotCustomized] = js.native
  }
  
  @js.native
  trait FnCallNameType extends StObject {
    
    def apply[T /* <: IAnyType */](name: String, `type`: js.Function0[T]): T = js.native
    def apply[T /* <: IAnyType */](`type`: js.Function0[T]): T = js.native
  }
  
  @js.native
  trait FnCallNameTypePredicateMessage extends StObject {
    
    def apply[IT /* <: IAnyType */](
      name: String,
      `type`: IT,
      predicate: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* snapshot */ js.Any, 
          Boolean
        ]
    ): IT = js.native
    def apply[IT /* <: IAnyType */](
      name: String,
      `type`: IT,
      predicate: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* snapshot */ js.Any, 
          Boolean
        ],
      message: String
    ): IT = js.native
    def apply[IT /* <: IAnyType */](
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
    def apply[IT /* <: IAnyType */](
      `type`: IT,
      predicate: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* snapshot */ js.Any, 
          Boolean
        ]
    ): IT = js.native
    def apply[IT /* <: IAnyType */](
      `type`: IT,
      predicate: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* snapshot */ js.Any, 
          Boolean
        ],
      message: String
    ): IT = js.native
    def apply[IT /* <: IAnyType */](
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
  }
  
  @js.native
  trait FnCallOptions extends StObject {
    
    def apply[S, T](options: CustomTypeOptions[S, T]): IType[S | T, S, T] = js.native
  }
  
  @js.native
  trait FnCallOptionsABCDEFGHI extends StObject {
    
    def apply(dispatchOrType: IAnyType, otherTypes: IAnyType*): IAnyType = js.native
    def apply(dispatchOrType: UnionOptions, otherTypes: IAnyType*): IAnyType = js.native
    def apply(types: IAnyType*): IAnyType = js.native
    def apply[CA, SA, TA, CB, SB, TB](A: IType[CA, SA, TA], B: IType[CB, SB, TB]): ITypeUnion[CA | CB, SA | SB, TA | TB] = js.native
    def apply[CA, SA, TA, CB, SB, TB](options: UnionOptions, A: IType[CA, SA, TA], B: IType[CB, SB, TB]): ITypeUnion[CA | CB, SA | SB, TA | TB] = js.native
    def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB](A: IModelType[PA, OA, FCA, FSA], B: IModelType[PB, OB, FCB, FSB]): ITypeUnion[
        ModelCreationType2[PA | PB, FCA | FCB], 
        ModelSnapshotType2[PA | PB, FSA | FSB], 
        ModelInstanceType[PA | PB, OA | OB]
      ] = js.native
    def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB](options: UnionOptions, A: IModelType[PA, OA, FCA, FSA], B: IModelType[PB, OB, FCB, FSB]): ITypeUnion[
        ModelCreationType2[PA | PB, FCA | FCB], 
        ModelSnapshotType2[PA | PB, FSA | FSB], 
        ModelInstanceType[PA | PB, OA | OB]
      ] = js.native
    def apply[CA, SA, TA, CB, SB, TB, CC, SC, TC](A: IType[CA, SA, TA], B: IType[CB, SB, TB], C: IType[CC, SC, TC]): ITypeUnion[CA | CB | CC, SA | SB | SC, TA | TB | TC] = js.native
    def apply[CA, SA, TA, CB, SB, TB, CC, SC, TC](options: UnionOptions, A: IType[CA, SA, TA], B: IType[CB, SB, TB], C: IType[CC, SC, TC]): ITypeUnion[CA | CB | CC, SA | SB | SC, TA | TB | TC] = js.native
    def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC](A: IModelType[PA, OA, FCA, FSA], B: IModelType[PB, OB, FCB, FSB], C: IModelType[PC, OC, FCC, FSC]): ITypeUnion[
        ModelCreationType2[PA | PB | PC, FCA | FCB | FCC], 
        ModelSnapshotType2[PA | PB | PC, FSA | FSB | FSC], 
        ModelInstanceType[PA | PB | PC, OA | OB | OC]
      ] = js.native
    def apply[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD](A: IType[CA, SA, TA], B: IType[CB, SB, TB], C: IType[CC, SC, TC], D: IType[CD, SD, TD]): ITypeUnion[CA | CB | CC | CD, SA | SB | SC | SD, TA | TB | TC | TD] = js.native
    def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC](
      options: UnionOptions,
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC]
    ): ITypeUnion[
        ModelCreationType2[PA | PB | PC, FCA | FCB | FCC], 
        ModelSnapshotType2[PA | PB | PC, FSA | FSB | FSC], 
        ModelInstanceType[PA | PB | PC, OA | OB | OC]
      ] = js.native
    def apply[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD](
      options: UnionOptions,
      A: IType[CA, SA, TA],
      B: IType[CB, SB, TB],
      C: IType[CC, SC, TC],
      D: IType[CD, SD, TD]
    ): ITypeUnion[CA | CB | CC | CD, SA | SB | SC | SD, TA | TB | TC | TD] = js.native
    def apply[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE](
      A: IType[CA, SA, TA],
      B: IType[CB, SB, TB],
      C: IType[CC, SC, TC],
      D: IType[CD, SD, TD],
      E: IType[CE, SE, TE]
    ): ITypeUnion[CA | CB | CC | CD | CE, SA | SB | SC | SD | SE, TA | TB | TC | TD | TE] = js.native
    def apply[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE](
      options: UnionOptions,
      A: IType[CA, SA, TA],
      B: IType[CB, SB, TB],
      C: IType[CC, SC, TC],
      D: IType[CD, SD, TD],
      E: IType[CE, SE, TE]
    ): ITypeUnion[CA | CB | CC | CD | CE, SA | SB | SC | SD | SE, TA | TB | TC | TD | TE] = js.native
    def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD](
      A: IModelType[PA, OA, FCA, FSA],
      B: IModelType[PB, OB, FCB, FSB],
      C: IModelType[PC, OC, FCC, FSC],
      D: IModelType[PD, OD, FCD, FSD]
    ): ITypeUnion[
        ModelCreationType2[PA | PB | PC | PD, FCA | FCB | FCC | FCD], 
        ModelSnapshotType2[PA | PB | PC | PD, FSA | FSB | FSC | FSD], 
        ModelInstanceType[PA | PB | PC | PD, OA | OB | OC | OD]
      ] = js.native
    def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD](
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
    def apply[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF](
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
    def apply[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF](
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
    def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE](
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
    def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE](
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
    def apply[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF, CG, SG, TG](
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
    def apply[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF, CG, SG, TG](
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
    def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF](
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
    def apply[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF, CG, SG, TG, CH, SH, TH](
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
    def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF](
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
    def apply[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF, CG, SG, TG, CH, SH, TH](
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
    def apply[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF, CG, SG, TG, CH, SH, TH, CI, SI, TI](
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
    def apply[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF, CG, SG, TG, CH, SH, TH, CI, SI, TI](
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
    def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG](
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
    def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG](
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
    def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG, PH /* <: ModelProperties */, OH, FCH, FSH](
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
    def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG, PH /* <: ModelProperties */, OH, FCH, FSH](
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
    def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG, PH /* <: ModelProperties */, OH, FCH, FSH, PI /* <: ModelProperties */, OI, FCI, FSI](
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
    def apply[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG, PH /* <: ModelProperties */, OH, FCH, FSH, PI /* <: ModelProperties */, OI, FCI, FSI](
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
  }
  
  @js.native
  trait FnCallSubTypeOptions extends StObject {
    
    def apply[IT /* <: IAnyComplexType */](subType: IT): IReferenceType[IT] = js.native
    def apply[IT /* <: IAnyComplexType */](subType: IT, options: ReferenceOptions[IT]): IReferenceType[IT] = js.native
  }
  
  @js.native
  trait FnCallSubtype extends StObject {
    
    def apply[IT /* <: IAnyType */](subtype: IT): IMapType[IT] = js.native
  }
  
  @js.native
  trait FnCallType extends StObject {
    
    def apply[IT /* <: IAnyType */](`type`: IT): IMaybe[IT] = js.native
  }
  
  @js.native
  trait FnCallTypeDefaultValueOrFunctionOptionalValues extends StObject {
    
    def apply[IT /* <: IAnyType */](`type`: IT, defaultValueOrFunction: OptionalDefaultValueOrFunction[IT]): IOptionalIType[IT, js.Array[js.UndefOr[scala.Nothing]]] = js.native
    def apply[IT /* <: IAnyType */, OptionalVals /* <: ValidOptionalValues */](
      `type`: IT,
      defaultValueOrFunction: OptionalDefaultValueOrFunction[IT],
      optionalValues: OptionalVals
    ): IOptionalIType[IT, OptionalVals] = js.native
  }
  
  @js.native
  trait FnCallTypeProcessorsName extends StObject {
    
    def apply[IT /* <: IAnyType */, CustomC, CustomS](
      `type`: IT,
      processors: ISnapshotProcessors[
          /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ js.Any, 
          CustomC, 
          /* import warning: importer.ImportType#apply Failed type conversion: IT['SnapshotType'] */ js.Any, 
          CustomS
        ]
    ): ISnapshotProcessor[IT, CustomC, CustomS] = js.native
    def apply[IT /* <: IAnyType */, CustomC, CustomS](
      `type`: IT,
      processors: ISnapshotProcessors[
          /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ js.Any, 
          CustomC, 
          /* import warning: importer.ImportType#apply Failed type conversion: IT['SnapshotType'] */ js.Any, 
          CustomS
        ],
      name: String
    ): ISnapshotProcessor[IT, CustomC, CustomS] = js.native
  }
  
  @js.native
  trait FnCallValue extends StObject {
    
    def apply(value: js.UndefOr[scala.Nothing]): ISimpleType[js.UndefOr[scala.Nothing]] = js.native
    def apply(value: String): ISimpleType[String] = js.native
    def apply(value: js.Date): ISimpleType[js.Date] = js.native
    def apply(value: Boolean): ISimpleType[Boolean] = js.native
    def apply(value: Double): ISimpleType[Double] = js.native
    def apply(value: Null): ISimpleType[Null] = js.native
  }
  
  @js.native
  trait SnapshotType extends StObject {
    
    var CreationType: js.Any = js.native
    
    var SnapshotType: js.Any = js.native
    
    var Type: js.Any = js.native
  }
  
  @js.native
  trait SnapshotTypeType extends StObject {
    
    var SnapshotType: js.Any = js.native
  }
  
  @js.native
  trait Type extends StObject {
    
    var Type: js.Any = js.native
  }
}
