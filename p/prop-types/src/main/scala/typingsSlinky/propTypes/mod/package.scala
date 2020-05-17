package typingsSlinky.propTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type InferProps[V] = (typingsSlinky.propTypes.mod.InferPropsInner[typingsSlinky.std.Pick[V, typingsSlinky.propTypes.mod.RequiredKeys[V]]]) with (typingsSlinky.std.Partial[
    typingsSlinky.propTypes.mod.InferPropsInner[typingsSlinky.std.Pick[V, typingsSlinky.propTypes.mod.OptionalKeys[V]]]
  ])
  type InferPropsInner[V] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: -? prop-types.prop-types.InferType<V[K]>}
    */ typingsSlinky.propTypes.propTypesStrings.InferPropsInner with org.scalablytyped.runtime.TopLevel[V]
  type InferType[V] = js.Any
  type OptionalKeys[V] = typingsSlinky.std.Exclude[/* keyof V */ java.lang.String, typingsSlinky.propTypes.mod.RequiredKeys[V]]
  type RequiredKeys[V] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof V ]: -? std.Exclude<V[K], undefined> extends prop-types.prop-types.Validator<infer T>? prop-types.prop-types.IsOptional<any> extends true? never : K : never}[keyof V] */ js.Any
  type ValidationMap[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? prop-types.prop-types.Validator<T[K]>}
    */ typingsSlinky.propTypes.propTypesStrings.ValidationMap with org.scalablytyped.runtime.TopLevel[T]
}
