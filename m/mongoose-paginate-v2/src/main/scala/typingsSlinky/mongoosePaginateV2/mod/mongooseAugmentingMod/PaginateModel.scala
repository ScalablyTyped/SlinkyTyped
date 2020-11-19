package typingsSlinky.mongoosePaginateV2.mod.mongooseAugmentingMod

import org.scalajs.dom.raw.Document
import typingsSlinky.mongoose.mod.FilterQuery
import typingsSlinky.mongoose.mod.Model_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaginateModel[T /* <: Document */]
  extends Model_[T, js.Object] {
  
  def paginate(): js.Promise[PaginateResult[T]] = js.native
  def paginate(
    query: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Any, /* result */ PaginateResult[T], Unit]
  ): js.Promise[PaginateResult[T]] = js.native
  def paginate(query: js.UndefOr[scala.Nothing], options: PaginateOptions): js.Promise[PaginateResult[T]] = js.native
  def paginate(
    query: js.UndefOr[scala.Nothing],
    options: PaginateOptions,
    callback: js.Function2[/* err */ js.Any, /* result */ PaginateResult[T], Unit]
  ): js.Promise[PaginateResult[T]] = js.native
  def paginate(query: FilterQuery[T]): js.Promise[PaginateResult[T]] = js.native
  def paginate(
    query: FilterQuery[T],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Any, /* result */ PaginateResult[T], Unit]
  ): js.Promise[PaginateResult[T]] = js.native
  def paginate(query: FilterQuery[T], options: PaginateOptions): js.Promise[PaginateResult[T]] = js.native
  def paginate(
    query: FilterQuery[T],
    options: PaginateOptions,
    callback: js.Function2[/* err */ js.Any, /* result */ PaginateResult[T], Unit]
  ): js.Promise[PaginateResult[T]] = js.native
}
