package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object minappEnv {
  type AnyArray = typingsSlinky.minappEnv.Array[js.Any]
  type AnyFunction = js.Function1[/* repeated */ js.Any, js.Any]
  type AnyObject = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ClassDecorator = js.Function1[
    /* target */ typingsSlinky.minappEnv.Function, 
    typingsSlinky.minappEnv.Function | scala.Unit
  ]
  type Exclude[T, U] = T
  type IAPIFunction[T, P /* <: typingsSlinky.minappEnv.IAPIParam[T] */] = js.Function1[/* param */ P, typingsSlinky.minappEnv.Promise[T] | js.Any]
  type IAnyObject = typingsSlinky.minappEnv.Record[java.lang.String, js.Any]
  type ICloudServices = org.scalablytyped.runtime.StringDictionary[typingsSlinky.minappEnv.ICloudService]
  type KVInfer[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K]}
    */ typingsSlinky.minappEnv.minappEnvStrings.KVInfer with org.scalablytyped.runtime.TopLevel[T]
  type MethodDecorator = js.Function3[
    /* target */ typingsSlinky.minappEnv.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    /* descriptor */ typingsSlinky.minappEnv.TypedPropertyDescriptor[js.Any], 
    typingsSlinky.minappEnv.TypedPropertyDescriptor[js.Any] | scala.Unit
  ]
  type OQ[T /* <: typingsSlinky.minappEnv.anon.OptionalRecordcompletesuc */] = (typingsSlinky.minappEnv.RQ[T] with (typingsSlinky.minappEnv.Required[
    typingsSlinky.minappEnv.Pick[T, typingsSlinky.minappEnv.minappEnvStrings.success]
  ])) | (typingsSlinky.minappEnv.RQ[T] with (typingsSlinky.minappEnv.Required[typingsSlinky.minappEnv.Pick[T, typingsSlinky.minappEnv.minappEnvStrings.fail]])) | (typingsSlinky.minappEnv.RQ[T] with (typingsSlinky.minappEnv.Required[
    typingsSlinky.minappEnv.Pick[T, typingsSlinky.minappEnv.minappEnvStrings.complete]
  ])) | (typingsSlinky.minappEnv.RQ[T] with (typingsSlinky.minappEnv.Required[
    typingsSlinky.minappEnv.Pick[
      T, 
      typingsSlinky.minappEnv.minappEnvStrings.success | typingsSlinky.minappEnv.minappEnvStrings.fail
    ]
  ])) | (typingsSlinky.minappEnv.RQ[T] with (typingsSlinky.minappEnv.Required[
    typingsSlinky.minappEnv.Pick[
      T, 
      typingsSlinky.minappEnv.minappEnvStrings.success | typingsSlinky.minappEnv.minappEnvStrings.complete
    ]
  ])) | (typingsSlinky.minappEnv.RQ[T] with (typingsSlinky.minappEnv.Required[
    typingsSlinky.minappEnv.Pick[
      T, 
      typingsSlinky.minappEnv.minappEnvStrings.fail | typingsSlinky.minappEnv.minappEnvStrings.complete
    ]
  ])) | (typingsSlinky.minappEnv.RQ[T] with (typingsSlinky.minappEnv.Required[
    typingsSlinky.minappEnv.Pick[
      T, 
      typingsSlinky.minappEnv.minappEnvStrings.fail | typingsSlinky.minappEnv.minappEnvStrings.complete | typingsSlinky.minappEnv.minappEnvStrings.success
    ]
  ]))
  type Optional[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? T[K]}
    */ typingsSlinky.minappEnv.minappEnvStrings.Optional with org.scalablytyped.runtime.TopLevel[T]
  type ParameterDecorator = js.Function3[
    /* target */ typingsSlinky.minappEnv.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    /* parameterIndex */ scala.Double, 
    scala.Unit
  ]
  /**
    * Make all properties in T optional
    */
  type Partial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P]}
    */ typingsSlinky.minappEnv.minappEnvStrings.Partial with org.scalablytyped.runtime.TopLevel[T]
  type PartialOptional[T, K /* <: /* keyof T */ java.lang.String */] = (typingsSlinky.minappEnv.Partial[typingsSlinky.minappEnv.Pick[T, K]]) with (typingsSlinky.minappEnv.Pick[T, typingsSlinky.minappEnv.Exclude[/* keyof T */ java.lang.String, K]])
  /**
    * From T pick a set of properties K
    */
  type Pick[T, K /* <: /* keyof T */ java.lang.String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in K ]: T[P]}
    */ typingsSlinky.minappEnv.minappEnvStrings.Pick with org.scalablytyped.runtime.TopLevel[T]
  type PromiseConstructorLike = org.scalablytyped.runtime.Instantiable1[
    /* executor */ js.Function2[
      /* resolve */ js.Function1[
        /* value */ js.UndefOr[js.Object | typingsSlinky.minappEnv.PromiseLike[js.Object]], 
        scala.Unit
      ], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ], 
    typingsSlinky.minappEnv.PromiseLike[js.Object]
  ]
  type PropertyDecorator = js.Function2[
    /* target */ typingsSlinky.minappEnv.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    scala.Unit
  ]
  type PropertyDescriptorMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.minappEnv.PropertyDescriptor]
  type PropertyKey = java.lang.String | scala.Double | js.Symbol
  type RQ[T /* <: typingsSlinky.minappEnv.anon.OptionalRecordcompletesuc */] = typingsSlinky.minappEnv.Pick[
    T, 
    typingsSlinky.minappEnv.Exclude[
      /* keyof T */ java.lang.String, 
      typingsSlinky.minappEnv.minappEnvStrings.complete | typingsSlinky.minappEnv.minappEnvStrings.success | typingsSlinky.minappEnv.minappEnvStrings.fail
    ]
  ]
  /**
    * Make all properties in T readonly
    */
  type Readonly[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ P in keyof T ]: T[P]}
    */ typingsSlinky.minappEnv.minappEnvStrings.Readonly with org.scalablytyped.runtime.TopLevel[T]
  /**
    * Construct a type with a set of properties K of type T
    */
  type Record[K /* <: java.lang.String */, T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in K ]: T}
    */ typingsSlinky.minappEnv.minappEnvStrings.Record with org.scalablytyped.runtime.TopLevel[js.Any]
  /**
    * Utils
    */
  type Required[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: -? T[P]}
    */ typingsSlinky.minappEnv.minappEnvStrings.Required with org.scalablytyped.runtime.TopLevel[T]
  type Void[T] = js.UndefOr[T | scala.Null]
}
