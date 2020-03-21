package typingsSlinky.lodash.fpMod

import typingsSlinky.lodash.lodashStrings.asc
import typingsSlinky.lodash.lodashStrings.desc
import typingsSlinky.lodash.mod.Many
import typingsSlinky.lodash.mod.NotVoid
import typingsSlinky.lodash.mod.ValueIteratee
import typingsSlinky.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashOrderBy3x4[T] extends js.Object {
  def apply(
    iteratees: Many[
      js.Function1[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
        NotVoid
      ]
    ]
  ): LodashOrderBy3x5[T] = js.native
  def apply(
    iteratees: Many[
      (js.Function1[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
        NotVoid
      ]) | (ValueIteratee[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
      ])
    ],
    orders: Many[Boolean | asc | desc]
  ): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def apply(iteratees: __, orders: Many[Boolean | asc | desc]): LodashOrderBy3x6[T] = js.native
}

