package typingsSlinky.ioTs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AnyC = typingsSlinky.ioTs.mod.AnyType
  type AnyProps = org.scalablytyped.runtime.StringDictionary[typingsSlinky.ioTs.mod.Any_]
  type Any_ = typingsSlinky.ioTs.mod.Type_[js.Any, js.Any, js.Any]
  type ArrayC[C /* <: typingsSlinky.ioTs.mod.Mixed_ */] = typingsSlinky.ioTs.mod.ArrayType[
    C, 
    js.Array[typingsSlinky.ioTs.mod.TypeOf[C]], 
    js.Array[typingsSlinky.ioTs.mod.OutputOf[C]], 
    js.Any
  ]
  type BigIntC = typingsSlinky.ioTs.mod.BigIntType
  type BooleanC = typingsSlinky.ioTs.mod.BooleanType
  type BrandC[C /* <: typingsSlinky.ioTs.mod.Any_ */, B] = typingsSlinky.ioTs.mod.RefinementType[
    C, 
    typingsSlinky.ioTs.mod.Branded[typingsSlinky.ioTs.mod.TypeOf[C], B], 
    typingsSlinky.ioTs.mod.OutputOf[C], 
    typingsSlinky.ioTs.mod.InputOf[C]
  ]
  type Branded[A, B] = A with typingsSlinky.ioTs.mod.Brand_[B]
  type Compact[A] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: A[K]}
    */ typingsSlinky.ioTs.ioTsStrings.Compact with A
  type Context = js.Array[typingsSlinky.ioTs.mod.ContextEntry]
  type Decode[I, A] = js.Function1[/* i */ I, typingsSlinky.ioTs.mod.Validation[A]]
  type Encode[A, O] = js.Function1[/* a */ A, O]
  type Errors = js.Array[typingsSlinky.ioTs.mod.ValidationError]
  type ExactC[C /* <: typingsSlinky.ioTs.mod.HasProps */] = typingsSlinky.ioTs.mod.ExactType[
    C, 
    typingsSlinky.ioTs.mod.TypeOf[C], 
    typingsSlinky.ioTs.mod.OutputOf[C], 
    typingsSlinky.ioTs.mod.InputOf[C]
  ]
  type Exact_[T, X /* <: T */] = T with typingsSlinky.ioTs.ioTsStrings.Exact with js.Any
  type FunctionC = typingsSlinky.ioTs.mod.FunctionType
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.ioTs.mod.HasPropsRefinement
    - typingsSlinky.ioTs.mod.HasPropsReadonly
    - typingsSlinky.ioTs.mod.HasPropsIntersection
    - typingsSlinky.ioTs.mod.InterfaceType[js.Any, js.Any, js.Any, js.Any]
    - typingsSlinky.ioTs.mod.StrictType[js.Any, js.Any, js.Any, js.Any]
    - typingsSlinky.ioTs.mod.PartialType[js.Any, js.Any, js.Any, js.Any]
  */
  type HasProps = typingsSlinky.ioTs.mod._HasProps | (typingsSlinky.ioTs.mod.InterfaceType[js.Any, js.Any, js.Any, js.Any]) | (typingsSlinky.ioTs.mod.StrictType[js.Any, js.Any, js.Any, js.Any]) | (typingsSlinky.ioTs.mod.PartialType[js.Any, js.Any, js.Any, js.Any])
  type InputOf[C /* <: typingsSlinky.ioTs.mod.Any_ */] = /* import warning: importer.ImportType#apply Failed type conversion: C['_I'] */ js.Any
  type Int = typingsSlinky.ioTs.mod.Branded[scala.Double, typingsSlinky.ioTs.mod.IntBrand]
  type IntersectionC[CS /* <: Array[typingsSlinky.ioTs.mod.Mixed_] */] = typingsSlinky.ioTs.mod.IntersectionType[
    CS, 
    js.Any | (typingsSlinky.ioTs.mod.TypeOf[
      /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
    ]), 
    js.Any | (typingsSlinky.ioTs.mod.OutputOf[
      /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
    ]), 
    js.Any
  ]
  type Is[A] = js.Function1[/* u */ js.Any, /* is A */ scala.Boolean]
  type KeyofC[D /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */] = typingsSlinky.ioTs.mod.KeyofType[D]
  type LiteralC[V /* <: typingsSlinky.ioTs.mod.LiteralValue */] = typingsSlinky.ioTs.mod.LiteralType[V]
  type LiteralValue = java.lang.String | scala.Double | scala.Boolean
  type Mixed_ = typingsSlinky.ioTs.mod.Type_[js.Any, js.Any, js.Any]
  type NeverC = typingsSlinky.ioTs.mod.NeverType
  type NullC = typingsSlinky.ioTs.mod.NullType_
  type NumberC = typingsSlinky.ioTs.mod.NumberType
  type ObjectC = typingsSlinky.ioTs.mod.ObjectType
  type OutputOf[C /* <: typingsSlinky.ioTs.mod.Any_ */] = /* import warning: importer.ImportType#apply Failed type conversion: C['_O'] */ js.Any
  type OutputOfDictionary[D /* <: typingsSlinky.ioTs.mod.Any_ */, C /* <: typingsSlinky.ioTs.mod.Any_ */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in io-ts.io-ts.OutputOf<D> ]: io-ts.io-ts.OutputOf<C>}
    */ typingsSlinky.ioTs.ioTsStrings.OutputOfDictionary with js.Any
  type OutputOfPartialProps[P /* <: typingsSlinky.ioTs.mod.AnyProps */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]:? io-ts.io-ts.OutputOf<P[K]>}
    */ typingsSlinky.ioTs.ioTsStrings.OutputOfPartialProps with P
  type OutputOfProps[P /* <: typingsSlinky.ioTs.mod.AnyProps */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts.OutputOf<P[K]>}
    */ typingsSlinky.ioTs.ioTsStrings.OutputOfProps with P
  type PartialC[P /* <: typingsSlinky.ioTs.mod.Props */] = typingsSlinky.ioTs.mod.PartialType[
    P, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]:? io-ts.io-ts.TypeOf<P[K]>}
    */ typingsSlinky.ioTs.ioTsStrings.PartialC with P, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]:? io-ts.io-ts.OutputOf<P[K]>}
    */ typingsSlinky.ioTs.ioTsStrings.PartialC with P, 
    js.Any
  ]
  type Props = org.scalablytyped.runtime.StringDictionary[typingsSlinky.ioTs.mod.Mixed_]
  type PropsOf[T /* <: typingsSlinky.ioTs.AnonProps */] = /* import warning: importer.ImportType#apply Failed type conversion: T['props'] */ js.Any
  type ReadonlyArrayC[C /* <: typingsSlinky.ioTs.mod.Mixed_ */] = typingsSlinky.ioTs.mod.ReadonlyArrayType[
    C, 
    js.Array[typingsSlinky.ioTs.mod.TypeOf[C]], 
    js.Array[typingsSlinky.ioTs.mod.OutputOf[C]], 
    js.Any
  ]
  type ReadonlyC[C /* <: typingsSlinky.ioTs.mod.Mixed_ */] = typingsSlinky.ioTs.mod.ReadonlyType[
    C, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in keyof io-ts.io-ts.TypeOf<C> ]: io-ts.io-ts.TypeOf<C>[K]}
    */ typingsSlinky.ioTs.ioTsStrings.ReadonlyC with typingsSlinky.ioTs.mod.TypeOf[C], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in keyof io-ts.io-ts.OutputOf<C> ]: io-ts.io-ts.OutputOf<C>[K]}
    */ typingsSlinky.ioTs.ioTsStrings.ReadonlyC with typingsSlinky.ioTs.mod.OutputOf[C], 
    js.Any
  ]
  type RecordC[D /* <: typingsSlinky.ioTs.mod.Mixed_ */, C /* <: typingsSlinky.ioTs.mod.Mixed_ */] = typingsSlinky.ioTs.mod.DictionaryType[
    D, 
    C, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in io-ts.io-ts.TypeOf<D> ]: io-ts.io-ts.TypeOf<C>}
    */ typingsSlinky.ioTs.ioTsStrings.RecordC with js.Any, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in io-ts.io-ts.OutputOf<D> ]: io-ts.io-ts.OutputOf<C>}
    */ typingsSlinky.ioTs.ioTsStrings.RecordC with js.Any, 
    js.Any
  ]
  type RefinementC[C /* <: typingsSlinky.ioTs.mod.Any_ */] = typingsSlinky.ioTs.mod.RefinementType[
    C, 
    typingsSlinky.ioTs.mod.TypeOf[C], 
    typingsSlinky.ioTs.mod.OutputOf[C], 
    typingsSlinky.ioTs.mod.InputOf[C]
  ]
  type StrictC[P /* <: typingsSlinky.ioTs.mod.Props */] = typingsSlinky.ioTs.mod.StrictType[
    P, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts.TypeOf<P[K]>}
    */ typingsSlinky.ioTs.ioTsStrings.StrictC with P, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts.OutputOf<P[K]>}
    */ typingsSlinky.ioTs.ioTsStrings.StrictC with P, 
    js.Any
  ]
  type StringC = typingsSlinky.ioTs.mod.StringType
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.ioTs.mod.InterfaceType[typingsSlinky.ioTs.mod.TaggedProps[Tag], A, O, js.Any]
    - typingsSlinky.ioTs.mod.StrictType[typingsSlinky.ioTs.mod.TaggedProps[Tag], A, O, js.Any]
    - typingsSlinky.ioTs.mod.TaggedRefinement[Tag, A, O]
    - typingsSlinky.ioTs.mod.TaggedUnion_[Tag, A, O]
    - typingsSlinky.ioTs.mod.TaggedIntersection[Tag, A, O]
    - typingsSlinky.ioTs.mod.TaggedExact[Tag, A, O]
    - typingsSlinky.ioTs.mod.RecursiveType[js.Any, A, O, js.Any]
  */
  type Tagged[Tag /* <: java.lang.String */, A, O] = (typingsSlinky.ioTs.mod._Tagged[Tag, A, O]) | (typingsSlinky.ioTs.mod.InterfaceType[typingsSlinky.ioTs.mod.TaggedProps[Tag], A, O, js.Any]) | (typingsSlinky.ioTs.mod.StrictType[typingsSlinky.ioTs.mod.TaggedProps[Tag], A, O, js.Any]) | (typingsSlinky.ioTs.mod.RecursiveType[js.Any, A, O, js.Any])
  type TaggedIntersectionArgument[Tag /* <: java.lang.String */] = (js.Array[typingsSlinky.ioTs.mod.Tagged[Tag, js.Any, js.Any]]) | (js.Tuple2[
    typingsSlinky.ioTs.mod.Mixed_ | (typingsSlinky.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
    typingsSlinky.ioTs.mod.Mixed_ | (typingsSlinky.ioTs.mod.Tagged[Tag, js.Any, js.Any])
  ]) | (js.Tuple3[
    typingsSlinky.ioTs.mod.Mixed_ | (typingsSlinky.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
    typingsSlinky.ioTs.mod.Mixed_ | (typingsSlinky.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
    typingsSlinky.ioTs.mod.Mixed_ | (typingsSlinky.ioTs.mod.Tagged[Tag, js.Any, js.Any])
  ]) | (js.Tuple4[
    typingsSlinky.ioTs.mod.Mixed_ | (typingsSlinky.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
    typingsSlinky.ioTs.mod.Mixed_ | (typingsSlinky.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
    typingsSlinky.ioTs.mod.Mixed_ | (typingsSlinky.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
    typingsSlinky.ioTs.mod.Mixed_ | (typingsSlinky.ioTs.mod.Tagged[Tag, js.Any, js.Any])
  ]) | (js.Tuple5[
    typingsSlinky.ioTs.mod.Mixed_ | (typingsSlinky.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
    typingsSlinky.ioTs.mod.Mixed_ | (typingsSlinky.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
    typingsSlinky.ioTs.mod.Mixed_ | (typingsSlinky.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
    typingsSlinky.ioTs.mod.Mixed_ | (typingsSlinky.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
    typingsSlinky.ioTs.mod.Mixed_ | (typingsSlinky.ioTs.mod.Tagged[Tag, js.Any, js.Any])
  ])
  type TaggedProps[Tag /* <: java.lang.String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Tag ]: io-ts.io-ts.LiteralType<any>}
    */ typingsSlinky.ioTs.ioTsStrings.TaggedProps with js.Any
  type TaggedUnionC[Tag /* <: java.lang.String */, CS /* <: Array[typingsSlinky.ioTs.mod.Mixed_] */] = typingsSlinky.ioTs.mod.TaggedUnionType[
    Tag, 
    CS, 
    typingsSlinky.ioTs.mod.TypeOf[
      /* import warning: importer.ImportType#apply Failed type conversion: CS[number] */ js.Any
    ], 
    typingsSlinky.ioTs.mod.OutputOf[
      /* import warning: importer.ImportType#apply Failed type conversion: CS[number] */ js.Any
    ], 
    js.Any
  ]
  type TupleC[CS /* <: Array[typingsSlinky.ioTs.mod.Mixed_] */] = typingsSlinky.ioTs.mod.TupleType[
    CS, 
    js.Any | (js.Tuple5[
      typingsSlinky.ioTs.mod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
      ], 
      typingsSlinky.ioTs.mod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[1] */ js.Any
      ], 
      typingsSlinky.ioTs.mod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[2] */ js.Any
      ], 
      typingsSlinky.ioTs.mod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[3] */ js.Any
      ], 
      typingsSlinky.ioTs.mod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[4] */ js.Any
      ]
    ]) | (js.Tuple4[
      typingsSlinky.ioTs.mod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
      ], 
      typingsSlinky.ioTs.mod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[1] */ js.Any
      ], 
      typingsSlinky.ioTs.mod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[2] */ js.Any
      ], 
      typingsSlinky.ioTs.mod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[3] */ js.Any
      ]
    ]) | (js.Tuple3[
      typingsSlinky.ioTs.mod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
      ], 
      typingsSlinky.ioTs.mod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[1] */ js.Any
      ], 
      typingsSlinky.ioTs.mod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[2] */ js.Any
      ]
    ]) | (js.Tuple2[
      typingsSlinky.ioTs.mod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
      ], 
      typingsSlinky.ioTs.mod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[1] */ js.Any
      ]
    ]) | (js.Array[
      typingsSlinky.ioTs.mod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
      ]
    ]), 
    js.Any | (js.Tuple5[
      typingsSlinky.ioTs.mod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
      ], 
      typingsSlinky.ioTs.mod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[1] */ js.Any
      ], 
      typingsSlinky.ioTs.mod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[2] */ js.Any
      ], 
      typingsSlinky.ioTs.mod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[3] */ js.Any
      ], 
      typingsSlinky.ioTs.mod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[4] */ js.Any
      ]
    ]) | (js.Tuple4[
      typingsSlinky.ioTs.mod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
      ], 
      typingsSlinky.ioTs.mod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[1] */ js.Any
      ], 
      typingsSlinky.ioTs.mod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[2] */ js.Any
      ], 
      typingsSlinky.ioTs.mod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[3] */ js.Any
      ]
    ]) | (js.Tuple3[
      typingsSlinky.ioTs.mod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
      ], 
      typingsSlinky.ioTs.mod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[1] */ js.Any
      ], 
      typingsSlinky.ioTs.mod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[2] */ js.Any
      ]
    ]) | (js.Tuple2[
      typingsSlinky.ioTs.mod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
      ], 
      typingsSlinky.ioTs.mod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[1] */ js.Any
      ]
    ]) | (js.Array[
      typingsSlinky.ioTs.mod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
      ]
    ]), 
    js.Any
  ]
  type TypeC[P /* <: typingsSlinky.ioTs.mod.Props */] = typingsSlinky.ioTs.mod.InterfaceType[
    P, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts.TypeOf<P[K]>}
    */ typingsSlinky.ioTs.ioTsStrings.TypeC with P, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts.OutputOf<P[K]>}
    */ typingsSlinky.ioTs.ioTsStrings.TypeC with P, 
    js.Any
  ]
  type TypeOf[C /* <: typingsSlinky.ioTs.mod.Any_ */] = /* import warning: importer.ImportType#apply Failed type conversion: C['_A'] */ js.Any
  type TypeOfDictionary[D /* <: typingsSlinky.ioTs.mod.Any_ */, C /* <: typingsSlinky.ioTs.mod.Any_ */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in io-ts.io-ts.TypeOf<D> ]: io-ts.io-ts.TypeOf<C>}
    */ typingsSlinky.ioTs.ioTsStrings.TypeOfDictionary with js.Any
  type TypeOfPartialProps[P /* <: typingsSlinky.ioTs.mod.AnyProps */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]:? io-ts.io-ts.TypeOf<P[K]>}
    */ typingsSlinky.ioTs.ioTsStrings.TypeOfPartialProps with P
  type TypeOfProps[P /* <: typingsSlinky.ioTs.mod.AnyProps */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts.TypeOf<P[K]>}
    */ typingsSlinky.ioTs.ioTsStrings.TypeOfProps with P
  type UndefinedC = typingsSlinky.ioTs.mod.UndefinedType
  type UnionC[CS /* <: Array[typingsSlinky.ioTs.mod.Mixed_] */] = typingsSlinky.ioTs.mod.UnionType[
    CS, 
    typingsSlinky.ioTs.mod.TypeOf[
      /* import warning: importer.ImportType#apply Failed type conversion: CS[number] */ js.Any
    ], 
    typingsSlinky.ioTs.mod.OutputOf[
      /* import warning: importer.ImportType#apply Failed type conversion: CS[number] */ js.Any
    ], 
    js.Any
  ]
  type UnknownArrayC = typingsSlinky.ioTs.mod.AnyArrayType
  type UnknownC = typingsSlinky.ioTs.mod.UnknownType
  type UnknownRecordC = typingsSlinky.ioTs.mod.AnyDictionaryType
  type Validate[I, A] = js.Function2[
    /* i */ I, 
    /* context */ typingsSlinky.ioTs.mod.Context, 
    typingsSlinky.ioTs.mod.Validation[A]
  ]
  type Validation[A] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Either<Errors, A> */ js.Any
  type VoidC = typingsSlinky.ioTs.mod.VoidType_
  type mixed = js.Any
}
