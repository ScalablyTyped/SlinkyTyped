package typingsSlinky.bookshelf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EventFunction[T] = js.Function3[
    /* model */ T, 
    /* attrs */ js.Any, 
    /* options */ js.Any, 
    typingsSlinky.bluebird.mod.^[js.Any] | scala.Unit
  ]
  type FetchAllOptions = typingsSlinky.bookshelf.mod.FetchOptions
  type WithRelatedQuery = org.scalablytyped.runtime.StringDictionary[
    js.Function1[
      /* query */ typingsSlinky.knex.mod.QueryBuilder[js.Any, js.Array[typingsSlinky.knex.mod.SafePartial[js.Any]]], 
      typingsSlinky.knex.mod.QueryBuilder[js.Any, js.Array[typingsSlinky.knex.mod.SafePartial[js.Any]]]
    ]
  ]
}
