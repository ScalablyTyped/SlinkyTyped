package typingsSlinky.curriable

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.curriable.anon.Arity
import typingsSlinky.std.Parameters
import typingsSlinky.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("curriable", JSImport.Default)
  @js.native
  def default[Fn /* <: Handler */](fn: Fn): Curried[Fn] = js.native
  @JSImport("curriable", JSImport.Default)
  @js.native
  def default[Fn /* <: Handler */](fn: Fn, arityOverride: Double): Handler = js.native
  
  @JSImport("curriable", "__")
  @js.native
  val __ : Placeholder = js.native
  
  @JSImport("curriable", "curry")
  @js.native
  def curry[Fn /* <: Handler */](fn: Fn): Curried[Fn] = js.native
  @JSImport("curriable", "curry")
  @js.native
  def curry[Fn /* <: Handler */](fn: Fn, arityOverride: Double): Handler = js.native
  
  @JSImport("curriable", "isPlaceholder")
  @js.native
  def isPlaceholder(value: js.Any): /* is curriable.curriable.Placeholder */ Boolean = js.native
  
  @JSImport("curriable", "uncurry")
  @js.native
  def uncurry[Fn /* <: Handler */](curried: Curried[Fn]): Fn = js.native
  
  type Append[E, T /* <: js.Array[_] */] = Concat[T, js.Array[E]]
  
  type Cast[X, Y] = Y | X
  
  type CleanedGaps[T /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: std.NonNullable<T[K]>}
    */ typingsSlinky.curriable.curriableStrings.CleanedGaps with TopLevel[T]
  
  type Concat[T1 /* <: js.Array[_] */, T2 /* <: js.Array[_] */] = Reverse[Cast[js.Any, js.Array[js.Any]], T2, js.Array[js.Any]]
  
  type Curried[Fn /* <: Handler */] = Curry_[Fn] with Arity[Fn]
  
  type Curry_[F /* <: Handler */] = js.Function1[
    /* args */ Cast[Cast[js.Array[js.Any], Gaps[Parameters[F]]], js.Array[js.Any]], 
    ReturnType[F]
  ]
  
  type Drop[N /* <: Double */, T /* <: js.Array[_] */, I /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply Failed type conversion: curriable.anon.1<T>[curriable.curriable.Length<I> extends N ? 1 : 0] */ js.Any
  
  type GapOf[T1 /* <: js.Array[_] */, T2 /* <: js.Array[_] */, TN /* <: js.Array[_] */, I /* <: js.Array[_] */] = TN | (Append[
    /* import warning: importer.ImportType#apply Failed type conversion: T2[curriable.curriable.Pos<I>] */ js.Any, 
    TN
  ])
  
  type Gaps[T /* <: js.Array[_] */] = CleanedGaps[PartialGaps[T]]
  
  type GapsOf[T1 /* <: js.Array[_] */, T2 /* <: js.Array[_] */, TN /* <: js.Array[_] */, I /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply Failed type conversion: curriable.anon.0Object<TN, I, T2>[curriable.curriable.Pos<I> extends curriable.curriable.Length<T1> ? 1 : 0] */ js.Any
  
  type Handler = js.Function1[/* repeated */ js.Any, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.curriable.curriableBooleans.`true`
    - typingsSlinky.curriable.curriableBooleans.`false`
  */
  trait HasTail[T /* <: js.Array[_] */] extends StObject
  
  type Head[T /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
  
  type Last[T /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply Failed type conversion: curriable.anon.0<T>[curriable.curriable.HasTail<T> extends true ? 0 : 1] */ js.Any
  
  type Length[T /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply Failed type conversion: T['length'] */ js.Any
  
  type Next[I /* <: js.Array[_] */] = Prepend[js.Any, I]
  
  type PartialGaps[T /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? T[K] | curriable.curriable.Placeholder}
    */ typingsSlinky.curriable.curriableStrings.PartialGaps with TopLevel[T]
  
  type Placeholder = js.Symbol | Double
  
  type Pos[I /* <: js.Array[_] */] = Length[I]
  
  type Prepend[E, T /* <: js.Array[_] */] = T
  
  type Prev[I /* <: js.Array[_] */] = Tail[I]
  
  type Reverse[T /* <: js.Array[_] */, R /* <: js.Array[_] */, I /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply Failed type conversion: curriable.anon.01<R>[curriable.curriable.Pos<I> extends curriable.curriable.Length<T> ? 1 : 0] */ js.Any
  
  type Tail[T /* <: js.Array[_] */] = js.Array[js.Any]
}
