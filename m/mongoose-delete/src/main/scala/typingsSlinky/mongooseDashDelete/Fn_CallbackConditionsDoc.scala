package typingsSlinky.mongooseDashDelete

import typingsSlinky.mongodb.mongodbMod.FindAndModifyWriteOpResultObject
import typingsSlinky.mongoose.Anon_New
import typingsSlinky.mongoose.Anon_NewTrue
import typingsSlinky.mongoose.Anon_RawResult
import typingsSlinky.mongoose.mongooseMod.DocumentQuery
import typingsSlinky.mongoose.mongooseMod.Query
import typingsSlinky.mongoose.mongooseMod.QueryFindOneAndUpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackConditionsDoc extends js.Object {
  def apply(): (DocumentQuery[_ | Null, _, js.Object]) with js.Object = js.native
  def apply(conditions: js.Any, update: js.Any): (DocumentQuery[_ | Null, _, js.Object]) with js.Object = js.native
  def apply(
    conditions: js.Any,
    update: js.Any,
    callback: js.Function3[/* err */ js.Any, /* doc */ js.Any | Null, /* res */ js.Any, Unit]
  ): (DocumentQuery[_ | Null, _, js.Object]) with js.Object = js.native
  def apply(conditions: js.Any, update: js.Any, options: Anon_New with QueryFindOneAndUpdateOptions): Query[FindAndModifyWriteOpResultObject[_]] with js.Object = js.native
  def apply(conditions: js.Any, update: js.Any, options: Anon_RawResult with QueryFindOneAndUpdateOptions): (Query[FindAndModifyWriteOpResultObject[_ | Null]]) with js.Object = js.native
  def apply(conditions: js.Any, update: js.Any, options: Anon_NewTrue with QueryFindOneAndUpdateOptions): (DocumentQuery[_, _, js.Object]) with js.Object = js.native
  def apply(
    conditions: js.Any,
    update: js.Any,
    options: Anon_New with QueryFindOneAndUpdateOptions,
    callback: js.Function3[
      /* err */ js.Any, 
      /* doc */ FindAndModifyWriteOpResultObject[_], 
      /* res */ js.Any, 
      Unit
    ]
  ): Query[FindAndModifyWriteOpResultObject[_]] with js.Object = js.native
  def apply(
    conditions: js.Any,
    update: js.Any,
    options: Anon_RawResult with QueryFindOneAndUpdateOptions,
    callback: js.Function3[
      /* err */ js.Any, 
      /* doc */ FindAndModifyWriteOpResultObject[_ | Null], 
      /* res */ js.Any, 
      Unit
    ]
  ): (Query[FindAndModifyWriteOpResultObject[_ | Null]]) with js.Object = js.native
  def apply(
    conditions: js.Any,
    update: js.Any,
    options: Anon_NewTrue with QueryFindOneAndUpdateOptions,
    callback: js.Function3[/* err */ js.Any, /* doc */ js.Any, /* res */ js.Any, Unit]
  ): (DocumentQuery[_, _, js.Object]) with js.Object = js.native
  def apply(conditions: js.Any, update: js.Any, options: QueryFindOneAndUpdateOptions): (DocumentQuery[_ | Null, _, js.Object]) with js.Object = js.native
  def apply(
    conditions: js.Any,
    update: js.Any,
    options: QueryFindOneAndUpdateOptions,
    callback: js.Function3[/* err */ js.Any, /* doc */ js.Any | Null, /* res */ js.Any, Unit]
  ): (DocumentQuery[_ | Null, _, js.Object]) with js.Object = js.native
}

