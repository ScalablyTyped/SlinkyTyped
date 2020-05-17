package typingsSlinky.curriable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Append[E, T /* <: js.Array[_] */] = typingsSlinky.curriable.mod.Concat[T, js.Array[E]]
  type CleanedGaps[T /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: std.NonNullable<T[K]>}
    */ typingsSlinky.curriable.curriableStrings.CleanedGaps with org.scalablytyped.runtime.TopLevel[T]
  type Concat[T1 /* <: js.Array[_] */, T2 /* <: js.Array[_] */] = typingsSlinky.curriable.mod.Reverse[typingsSlinky.curriable.mod.Cast[js.Any, js.Array[js.Any]], T2, js.Array[js.Any]]
  type Curried[Fn /* <: typingsSlinky.curriable.mod.Handler */] = typingsSlinky.curriable.mod.Curry_[Fn] with typingsSlinky.curriable.anon.Arity[Fn]
  type Curry_[F /* <: typingsSlinky.curriable.mod.Handler */] = js.Function1[
    /* args */ typingsSlinky.curriable.mod.Cast[
      typingsSlinky.curriable.mod.Cast[
        js.Array[js.Any], 
        typingsSlinky.curriable.mod.Gaps[typingsSlinky.std.Parameters[F]]
      ], 
      js.Array[js.Any]
    ], 
    typingsSlinky.std.ReturnType[F]
  ]
  type Drop[N /* <: scala.Double */, T /* <: js.Array[_] */, I /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply Failed type conversion: curriable.anon.1<T>[curriable.curriable.Length<I> extends N ? 1 : 0] */ js.Any
  type Gaps[T /* <: js.Array[_] */] = typingsSlinky.curriable.mod.CleanedGaps[typingsSlinky.curriable.mod.PartialGaps[T]]
  type GapsOf[T1 /* <: js.Array[_] */, T2 /* <: js.Array[_] */, TN /* <: js.Array[_] */, I /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply Failed type conversion: curriable.anon.0Object<TN, I, T2>[curriable.curriable.Pos<I> extends curriable.curriable.Length<T1> ? 1 : 0] */ js.Any
  type Handler = js.Function1[/* repeated */ js.Any, js.Any]
  type Head[T /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
  type Last[T /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply Failed type conversion: curriable.anon.0<T>[curriable.curriable.HasTail<T> extends true ? 0 : 1] */ js.Any
  type Length[T /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply Failed type conversion: T['length'] */ js.Any
  type Next[I /* <: js.Array[_] */] = typingsSlinky.curriable.mod.Prepend[js.Any, I]
  type PartialGaps[T /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? T[K] | curriable.curriable.Placeholder}
    */ typingsSlinky.curriable.curriableStrings.PartialGaps with org.scalablytyped.runtime.TopLevel[T]
  type Pos[I /* <: js.Array[_] */] = typingsSlinky.curriable.mod.Length[I]
  type Prepend[E, T /* <: js.Array[_] */] = T
  type Prev[I /* <: js.Array[_] */] = typingsSlinky.curriable.mod.Tail[I]
  type Reverse[T /* <: js.Array[_] */, R /* <: js.Array[_] */, I /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply Failed type conversion: curriable.anon.01<R>[curriable.curriable.Pos<I> extends curriable.curriable.Length<T> ? 1 : 0] */ js.Any
  type Tail[T /* <: js.Array[_] */] = js.Array[js.Any]
}
