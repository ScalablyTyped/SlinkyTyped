package typingsSlinky.kefir

import typingsSlinky.kefir.mod.Observable
import typingsSlinky.kefir.mod.Stream_
import typingsSlinky.kefir.mod.ValueOfAnObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallObssObssPCombinator extends js.Object {
  def apply[T /* <: js.Tuple3[Observable[_, _], Observable[_, _], Observable[_, _]] */](obss: T): Stream_[
    js.Tuple3[
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[1] */ js.Any
      ], 
      ValueOfAnObservable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[2] */ js.Any
      ]
    ], 
    _
  ] = js.native
  def apply[T /* <: js.Array[Observable[_, _]] */, P /* <: js.Array[Observable[_, _]] */, K](
    obss: T,
    obssP: P,
    combinator: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: T[0][''] */ /* a */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: P[0][''] */ /* b */ js.Any, 
      K
    ]
  ): Observable[K, _] = js.native
  def apply[T, S, U](obss: js.Array[Observable[T, S]], combinator: js.Function1[/* repeated */ T, U]): Stream_[U, S] = js.native
  def apply[T, S, U](obss: js.Array[Observable[T, S]], passiveObss: js.Array[Observable[T, S]]): Stream_[U, S] = js.native
  def apply[T, S, U](
    obss: js.Array[Observable[T, S]],
    passiveObss: js.Array[Observable[T, S]],
    combinator: js.Function1[/* repeated */ T, U]
  ): Stream_[U, S] = js.native
}

