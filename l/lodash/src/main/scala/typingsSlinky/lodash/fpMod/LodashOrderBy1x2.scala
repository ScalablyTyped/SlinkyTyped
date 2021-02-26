package typingsSlinky.lodash.fpMod

import typingsSlinky.lodash.mod.List
import typingsSlinky.lodash.mod.Many
import typingsSlinky.lodash.mod.NotVoid
import typingsSlinky.lodash.mod.ValueIteratee
import typingsSlinky.lodash.mod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashOrderBy1x2 extends StObject {
  
  def apply[T /* <: js.Object */](
    iteratees: Many[
      (js.Function1[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
        NotVoid
      ]) | (ValueIteratee[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
      ])
    ]
  ): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def apply[T /* <: js.Object */](
    iteratees: Many[
      (js.Function1[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
        NotVoid
      ]) | (ValueIteratee[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
      ])
    ],
    collection: T
  ): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def apply[T](iteratees: Many[(js.Function1[/* value */ T, NotVoid]) | ValueIteratee[T]], collection: List[T]): js.Array[T] = js.native
  def apply[T /* <: js.Object */](iteratees: __): LodashOrderBy3x6[T] = js.native
  def apply[T /* <: js.Object */](iteratees: __, collection: T): LodashOrderBy3x6[T] = js.native
  def apply[T](iteratees: __, collection: List[T]): LodashOrderBy1x6[T] = js.native
}
