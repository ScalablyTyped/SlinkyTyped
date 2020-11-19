package typingsSlinky.mongooseDelete.anon

import typingsSlinky.mongoose.mod.FilterQuery
import typingsSlinky.mongoose.mod.ModelUpdateOptions
import typingsSlinky.mongoose.mod.UpdateQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallConditionsDocOptionsCallback extends js.Object {
  
  def apply(conditions: FilterQuery[_], doc: UpdateQuery[_]): Queryany = js.native
  def apply(
    conditions: FilterQuery[_],
    doc: UpdateQuery[_],
    callback: js.Function2[/* err */ js.Any, /* raw */ js.Any, Unit]
  ): Queryany = js.native
  def apply(conditions: FilterQuery[_], doc: UpdateQuery[_], options: ModelUpdateOptions): Queryany = js.native
  def apply(
    conditions: FilterQuery[_],
    doc: UpdateQuery[_],
    options: ModelUpdateOptions,
    callback: js.Function2[/* err */ js.Any, /* raw */ js.Any, Unit]
  ): Queryany = js.native
}
