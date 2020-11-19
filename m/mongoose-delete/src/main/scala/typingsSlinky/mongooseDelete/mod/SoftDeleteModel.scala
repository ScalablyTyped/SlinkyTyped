package typingsSlinky.mongooseDelete.mod

import typingsSlinky.mongodb.mod.FindAndModifyWriteOpResultObject
import typingsSlinky.mongoose.anon.leantrueOmitQueryFindBase
import typingsSlinky.mongoose.anon.leantrueOmitQueryFindOneA
import typingsSlinky.mongoose.anon.leantrueOmitQueryFindOpti
import typingsSlinky.mongoose.anon.rawResulttrueQueryFindOneArrayFilters
import typingsSlinky.mongoose.anon.rawResulttrueupserttruene
import typingsSlinky.mongoose.anon.upserttruenewtrueQueryFin
import typingsSlinky.mongoose.mod.Document
import typingsSlinky.mongoose.mod.DocumentDefinition
import typingsSlinky.mongoose.mod.FilterQuery
import typingsSlinky.mongoose.mod.ModelUpdateOptions
import typingsSlinky.mongoose.mod.Model_
import typingsSlinky.mongoose.mod.Query
import typingsSlinky.mongoose.mod.QueryFindBaseOptions
import typingsSlinky.mongoose.mod.QueryFindOneAndUpdateOptions
import typingsSlinky.mongoose.mod.QueryFindOptions
import typingsSlinky.mongoose.mod.Types.ObjectId
import typingsSlinky.mongoose.mod.UpdateQuery
import typingsSlinky.mongooseDelete.anon.DocumentQueryArrayanyanyAll
import typingsSlinky.mongooseDelete.anon.DocumentQueryanyanyAll
import typingsSlinky.mongooseDelete.anon.DocumentQueryanynullanyAll
import typingsSlinky.mongooseDelete.anon.Fn0
import typingsSlinky.mongooseDelete.anon.FnCall
import typingsSlinky.mongooseDelete.anon.FnCallConditionsDocOptionsCallback
import typingsSlinky.mongooseDelete.anon.FnCallConditionsProjectionOptionsCallback
import typingsSlinky.mongooseDelete.anon.FnCallConditionsUpdateOptionsCallback
import typingsSlinky.mongooseDelete.anon.QueryArrayDocumentDefinit
import typingsSlinky.mongooseDelete.anon.QueryDocumentDefinitionanAll
import typingsSlinky.mongooseDelete.anon.QueryFindAndModifyWriteOpAnd
import typingsSlinky.mongooseDelete.anon.QueryFindAndModifyWriteOpBatchSize
import typingsSlinky.mongooseDelete.anon.Queryany
import typingsSlinky.mongooseDelete.anon.Querynumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SoftDeleteModel[T /* <: Document */, QueryHelpers] extends Model_[T, QueryHelpers] {
  
  /** Count only deleted documents */
  def countDeleted(conditions: FilterQuery[_]): Querynumber = js.native
  /** Count only deleted documents */
  def countDeleted(conditions: FilterQuery[_], callback: js.Function2[/* err */ js.Any, /* count */ Double, Unit]): Querynumber = js.native
  /** Count only deleted documents */
  @JSName("countDeleted")
  var countDeleted_Original: FnCall = js.native
  
  /** Count all documents including deleted */
  def countWithDeleted(conditions: FilterQuery[_]): Querynumber = js.native
  /** Count all documents including deleted */
  def countWithDeleted(conditions: FilterQuery[_], callback: js.Function2[/* err */ js.Any, /* count */ Double, Unit]): Querynumber = js.native
  /** Count all documents including deleted */
  @JSName("countWithDeleted")
  var countWithDeleted_Original: FnCall = js.native
  
  /**
    * Delete documents by conditions
    */
  def delete(): Query[T] with QueryHelpers = js.native
  def delete(
    conditions: js.UndefOr[scala.Nothing],
    deleteBy: js.UndefOr[scala.Nothing],
    fn: Callback[T, this.type]
  ): Query[T] with QueryHelpers = js.native
  def delete(conditions: js.UndefOr[scala.Nothing], deleteBy: js.Any): Query[T] with QueryHelpers = js.native
  def delete(conditions: js.UndefOr[scala.Nothing], deleteBy: js.Any, fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def delete(conditions: js.Any): Query[T] with QueryHelpers = js.native
  def delete(conditions: js.Any, deleteBy: js.UndefOr[scala.Nothing], fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def delete(conditions: js.Any, deleteBy: js.Any): Query[T] with QueryHelpers = js.native
  def delete(conditions: js.Any, deleteBy: js.Any, fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  
  /**
    * Delete a document by ID
    */
  def deleteById(): Query[T] with QueryHelpers = js.native
  def deleteById(id: js.UndefOr[scala.Nothing], deleteBy: js.UndefOr[scala.Nothing], fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: js.UndefOr[scala.Nothing], deleteBy: String): Query[T] with QueryHelpers = js.native
  def deleteById(id: js.UndefOr[scala.Nothing], deleteBy: String, fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: js.UndefOr[scala.Nothing], deleteBy: Document): Query[T] with QueryHelpers = js.native
  def deleteById(id: js.UndefOr[scala.Nothing], deleteBy: Document, fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: js.UndefOr[scala.Nothing], deleteBy: ObjectId): Query[T] with QueryHelpers = js.native
  def deleteById(id: js.UndefOr[scala.Nothing], deleteBy: ObjectId, fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: js.UndefOr[scala.Nothing], deleteBy: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: js.UndefOr[scala.Nothing], deleteBy: Callback[T, this.type], fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: String): Query[T] with QueryHelpers = js.native
  def deleteById(id: String, deleteBy: js.UndefOr[scala.Nothing], fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: String, deleteBy: String): Query[T] with QueryHelpers = js.native
  def deleteById(id: String, deleteBy: String, fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: String, deleteBy: Document): Query[T] with QueryHelpers = js.native
  def deleteById(id: String, deleteBy: Document, fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: String, deleteBy: ObjectId): Query[T] with QueryHelpers = js.native
  def deleteById(id: String, deleteBy: ObjectId, fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: String, deleteBy: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: String, deleteBy: Callback[T, this.type], fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: ObjectId): Query[T] with QueryHelpers = js.native
  def deleteById(id: ObjectId, deleteBy: js.UndefOr[scala.Nothing], fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: ObjectId, deleteBy: String): Query[T] with QueryHelpers = js.native
  def deleteById(id: ObjectId, deleteBy: String, fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: ObjectId, deleteBy: Document): Query[T] with QueryHelpers = js.native
  def deleteById(id: ObjectId, deleteBy: Document, fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: ObjectId, deleteBy: ObjectId): Query[T] with QueryHelpers = js.native
  def deleteById(id: ObjectId, deleteBy: ObjectId, fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: ObjectId, deleteBy: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: ObjectId, deleteBy: Callback[T, this.type], fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: Callback[T, this.type], deleteBy: js.UndefOr[scala.Nothing], fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: Callback[T, this.type], deleteBy: String): Query[T] with QueryHelpers = js.native
  def deleteById(id: Callback[T, this.type], deleteBy: String, fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: Callback[T, this.type], deleteBy: Document): Query[T] with QueryHelpers = js.native
  def deleteById(id: Callback[T, this.type], deleteBy: Document, fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: Callback[T, this.type], deleteBy: ObjectId): Query[T] with QueryHelpers = js.native
  def deleteById(id: Callback[T, this.type], deleteBy: ObjectId, fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: Callback[T, this.type], deleteBy: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def deleteById(id: Callback[T, this.type], deleteBy: Callback[T, this.type], fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  
  /** Find only deleted documents */
  def findDeleted(): DocumentQueryArrayanyanyAll = js.native
  /** Find only deleted documents */
  def findDeleted(callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]): DocumentQueryArrayanyanyAll = js.native
  /** Find only deleted documents */
  def findDeleted(conditions: FilterQuery[_]): QueryArrayDocumentDefinit = js.native
  /** Find only deleted documents */
  def findDeleted(conditions: FilterQuery[_], callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]): DocumentQueryArrayanyanyAll = js.native
  /** Find only deleted documents */
  def findDeleted(
    conditions: FilterQuery[_],
    projection: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): DocumentQueryArrayanyanyAll = js.native
  /** Find only deleted documents */
  def findDeleted(
    conditions: FilterQuery[_],
    projection: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): QueryArrayDocumentDefinit = js.native
  /** Find only deleted documents */
  def findDeleted(
    conditions: FilterQuery[_],
    projection: js.UndefOr[scala.Nothing],
    options: leantrueOmitQueryFindOpti
  ): QueryArrayDocumentDefinit = js.native
  /** Find only deleted documents */
  def findDeleted(
    conditions: FilterQuery[_],
    projection: js.UndefOr[scala.Nothing],
    options: leantrueOmitQueryFindOpti,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): QueryArrayDocumentDefinit = js.native
  /** Find only deleted documents */
  def findDeleted(conditions: FilterQuery[_], projection: js.UndefOr[scala.Nothing], options: QueryFindOptions): DocumentQueryArrayanyanyAll = js.native
  /** Find only deleted documents */
  def findDeleted(
    conditions: FilterQuery[_],
    projection: js.UndefOr[scala.Nothing],
    options: QueryFindOptions,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): DocumentQueryArrayanyanyAll = js.native
  /** Find only deleted documents */
  def findDeleted(conditions: FilterQuery[_], projection: js.Any): QueryArrayDocumentDefinit = js.native
  /** Find only deleted documents */
  def findDeleted(
    conditions: FilterQuery[_],
    projection: js.Any,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): DocumentQueryArrayanyanyAll = js.native
  /** Find only deleted documents */
  def findDeleted(
    conditions: FilterQuery[_],
    projection: js.Any,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): QueryArrayDocumentDefinit = js.native
  /** Find only deleted documents */
  def findDeleted(conditions: FilterQuery[_], projection: js.Any, options: leantrueOmitQueryFindOpti): QueryArrayDocumentDefinit = js.native
  /** Find only deleted documents */
  def findDeleted(
    conditions: FilterQuery[_],
    projection: js.Any,
    options: leantrueOmitQueryFindOpti,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): QueryArrayDocumentDefinit = js.native
  /** Find only deleted documents */
  def findDeleted(conditions: FilterQuery[_], projection: js.Any, options: QueryFindOptions): DocumentQueryArrayanyanyAll = js.native
  /** Find only deleted documents */
  def findDeleted(
    conditions: FilterQuery[_],
    projection: js.Any,
    options: QueryFindOptions,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): DocumentQueryArrayanyanyAll = js.native
  /** Find only deleted documents */
  def findDeleted(
    conditions: FilterQuery[_],
    projection: Null,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): DocumentQueryArrayanyanyAll = js.native
  /** Find only deleted documents */
  def findDeleted(
    conditions: FilterQuery[_],
    projection: Null,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): QueryArrayDocumentDefinit = js.native
  /** Find only deleted documents */
  def findDeleted(conditions: FilterQuery[_], projection: Null, options: leantrueOmitQueryFindOpti): QueryArrayDocumentDefinit = js.native
  /** Find only deleted documents */
  def findDeleted(
    conditions: FilterQuery[_],
    projection: Null,
    options: leantrueOmitQueryFindOpti,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): QueryArrayDocumentDefinit = js.native
  /** Find only deleted documents */
  def findDeleted(conditions: FilterQuery[_], projection: Null, options: QueryFindOptions): DocumentQueryArrayanyanyAll = js.native
  /** Find only deleted documents */
  def findDeleted(
    conditions: FilterQuery[_],
    projection: Null,
    options: QueryFindOptions,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): DocumentQueryArrayanyanyAll = js.native
  /** Find only deleted documents */
  @JSName("findDeleted")
  def findDeleted_DocumentQueryArrayanyanyAll(conditions: FilterQuery[_]): DocumentQueryArrayanyanyAll = js.native
  /** Find only deleted documents */
  @JSName("findDeleted")
  def findDeleted_DocumentQueryArrayanyanyAll(
    conditions: FilterQuery[_],
    projection: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): DocumentQueryArrayanyanyAll = js.native
  /** Find only deleted documents */
  @JSName("findDeleted")
  def findDeleted_DocumentQueryArrayanyanyAll(conditions: FilterQuery[_], projection: js.Any): DocumentQueryArrayanyanyAll = js.native
  /** Find only deleted documents */
  @JSName("findDeleted")
  def findDeleted_DocumentQueryArrayanyanyAll(
    conditions: FilterQuery[_],
    projection: js.Any,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): DocumentQueryArrayanyanyAll = js.native
  /** Find only deleted documents */
  @JSName("findDeleted")
  def findDeleted_DocumentQueryArrayanyanyAll(
    conditions: FilterQuery[_],
    projection: Null,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): DocumentQueryArrayanyanyAll = js.native
  /** Find only deleted documents */
  @JSName("findDeleted")
  var findDeleted_Original: FnCallConditionsProjectionOptionsCallback = js.native
  
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(): DocumentQueryanynullanyAll = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(conditions: FilterQuery[_], update: UpdateQuery[_]): DocumentQueryanynullanyAll = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(
    conditions: FilterQuery[_],
    update: UpdateQuery[_],
    callback: js.Function3[/* err */ js.Any, /* doc */ js.Any | Null, /* res */ js.Any, Unit]
  ): DocumentQueryanynullanyAll = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(conditions: FilterQuery[_], update: UpdateQuery[_], options: leantrueOmitQueryFindOneA): QueryDocumentDefinitionanAll = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(
    conditions: FilterQuery[_],
    update: UpdateQuery[_],
    options: leantrueOmitQueryFindOneA,
    callback: js.Function3[/* err */ js.Any, /* doc */ DocumentDefinition[_], /* res */ js.Any, Unit]
  ): QueryDocumentDefinitionanAll = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(conditions: FilterQuery[_], update: UpdateQuery[_], options: rawResulttrueQueryFindOneArrayFilters): QueryFindAndModifyWriteOpBatchSize = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(
    conditions: FilterQuery[_],
    update: UpdateQuery[_],
    options: rawResulttrueQueryFindOneArrayFilters,
    callback: js.Function3[
      /* err */ js.Any, 
      /* doc */ FindAndModifyWriteOpResultObject[_ | Null], 
      /* res */ js.Any, 
      Unit
    ]
  ): QueryFindAndModifyWriteOpBatchSize = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(conditions: FilterQuery[_], update: UpdateQuery[_], options: rawResulttrueupserttruene): QueryFindAndModifyWriteOpAnd = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(
    conditions: FilterQuery[_],
    update: UpdateQuery[_],
    options: rawResulttrueupserttruene,
    callback: js.Function3[
      /* err */ js.Any, 
      /* doc */ FindAndModifyWriteOpResultObject[_], 
      /* res */ js.Any, 
      Unit
    ]
  ): QueryFindAndModifyWriteOpAnd = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(conditions: FilterQuery[_], update: UpdateQuery[_], options: upserttruenewtrueQueryFin): DocumentQueryanyanyAll = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(
    conditions: FilterQuery[_],
    update: UpdateQuery[_],
    options: upserttruenewtrueQueryFin,
    callback: js.Function3[/* err */ js.Any, /* doc */ js.Any, /* res */ js.Any, Unit]
  ): DocumentQueryanyanyAll = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(conditions: FilterQuery[_], update: UpdateQuery[_], options: QueryFindOneAndUpdateOptions): DocumentQueryanynullanyAll = js.native
  /** Find One And Update only deleted documents */
  def findOneAndUpdateDeleted(
    conditions: FilterQuery[_],
    update: UpdateQuery[_],
    options: QueryFindOneAndUpdateOptions,
    callback: js.Function3[/* err */ js.Any, /* doc */ js.Any | Null, /* res */ js.Any, Unit]
  ): DocumentQueryanynullanyAll = js.native
  /** Find One And Update only deleted documents */
  @JSName("findOneAndUpdateDeleted")
  var findOneAndUpdateDeleted_Original: FnCallConditionsUpdateOptionsCallback = js.native
  
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(): DocumentQueryanynullanyAll = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(conditions: FilterQuery[_], update: UpdateQuery[_]): DocumentQueryanynullanyAll = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(
    conditions: FilterQuery[_],
    update: UpdateQuery[_],
    callback: js.Function3[/* err */ js.Any, /* doc */ js.Any | Null, /* res */ js.Any, Unit]
  ): DocumentQueryanynullanyAll = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(conditions: FilterQuery[_], update: UpdateQuery[_], options: leantrueOmitQueryFindOneA): QueryDocumentDefinitionanAll = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(
    conditions: FilterQuery[_],
    update: UpdateQuery[_],
    options: leantrueOmitQueryFindOneA,
    callback: js.Function3[/* err */ js.Any, /* doc */ DocumentDefinition[_], /* res */ js.Any, Unit]
  ): QueryDocumentDefinitionanAll = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(conditions: FilterQuery[_], update: UpdateQuery[_], options: rawResulttrueQueryFindOneArrayFilters): QueryFindAndModifyWriteOpBatchSize = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(
    conditions: FilterQuery[_],
    update: UpdateQuery[_],
    options: rawResulttrueQueryFindOneArrayFilters,
    callback: js.Function3[
      /* err */ js.Any, 
      /* doc */ FindAndModifyWriteOpResultObject[_ | Null], 
      /* res */ js.Any, 
      Unit
    ]
  ): QueryFindAndModifyWriteOpBatchSize = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(conditions: FilterQuery[_], update: UpdateQuery[_], options: rawResulttrueupserttruene): QueryFindAndModifyWriteOpAnd = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(
    conditions: FilterQuery[_],
    update: UpdateQuery[_],
    options: rawResulttrueupserttruene,
    callback: js.Function3[
      /* err */ js.Any, 
      /* doc */ FindAndModifyWriteOpResultObject[_], 
      /* res */ js.Any, 
      Unit
    ]
  ): QueryFindAndModifyWriteOpAnd = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(conditions: FilterQuery[_], update: UpdateQuery[_], options: upserttruenewtrueQueryFin): DocumentQueryanyanyAll = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(
    conditions: FilterQuery[_],
    update: UpdateQuery[_],
    options: upserttruenewtrueQueryFin,
    callback: js.Function3[/* err */ js.Any, /* doc */ js.Any, /* res */ js.Any, Unit]
  ): DocumentQueryanyanyAll = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(conditions: FilterQuery[_], update: UpdateQuery[_], options: QueryFindOneAndUpdateOptions): DocumentQueryanynullanyAll = js.native
  /** Find One And Update all documents including deleted */
  def findOneAndUpdateWithDeleted(
    conditions: FilterQuery[_],
    update: UpdateQuery[_],
    options: QueryFindOneAndUpdateOptions,
    callback: js.Function3[/* err */ js.Any, /* doc */ js.Any | Null, /* res */ js.Any, Unit]
  ): DocumentQueryanynullanyAll = js.native
  /** Find One And Update all documents including deleted */
  @JSName("findOneAndUpdateWithDeleted")
  var findOneAndUpdateWithDeleted_Original: FnCallConditionsUpdateOptionsCallback = js.native
  
  /** Find One only deleted documents */
  def findOneDeleted(): DocumentQueryanynullanyAll = js.native
  /** Find One only deleted documents */
  def findOneDeleted(
    conditions: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Any, /* res */ js.Any | Null, Unit]
  ): DocumentQueryanynullanyAll = js.native
  /** Find One only deleted documents */
  def findOneDeleted(conditions: FilterQuery[_]): DocumentQueryanynullanyAll = js.native
  /** Find One only deleted documents */
  def findOneDeleted(
    conditions: FilterQuery[_],
    callback: js.Function2[/* err */ js.Any, /* res */ js.Any | Null, Unit]
  ): DocumentQueryanynullanyAll = js.native
  /** Find One only deleted documents */
  def findOneDeleted(conditions: FilterQuery[_], projection: js.Any): DocumentQueryanynullanyAll = js.native
  /** Find One only deleted documents */
  def findOneDeleted(
    conditions: FilterQuery[_],
    projection: js.Any,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Any | Null, Unit]
  ): DocumentQueryanynullanyAll = js.native
  /** Find One only deleted documents */
  def findOneDeleted(conditions: FilterQuery[_], projection: js.Any, options: leantrueOmitQueryFindBase): QueryDocumentDefinitionanAll = js.native
  /** Find One only deleted documents */
  def findOneDeleted(
    conditions: FilterQuery[_],
    projection: js.Any,
    options: leantrueOmitQueryFindBase,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Any | Null, Unit]
  ): QueryDocumentDefinitionanAll = js.native
  /** Find One only deleted documents */
  def findOneDeleted(conditions: FilterQuery[_], projection: js.Any, options: QueryFindBaseOptions): DocumentQueryanynullanyAll = js.native
  /** Find One only deleted documents */
  def findOneDeleted(
    conditions: FilterQuery[_],
    projection: js.Any,
    options: QueryFindBaseOptions,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Any | Null, Unit]
  ): DocumentQueryanynullanyAll = js.native
  /** Find One only deleted documents */
  @JSName("findOneDeleted")
  var findOneDeleted_Original: Fn0 = js.native
  
  /** Find One all documents including deleted */
  def findOneWithDeleted(): DocumentQueryanynullanyAll = js.native
  /** Find One all documents including deleted */
  def findOneWithDeleted(
    conditions: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Any, /* res */ js.Any | Null, Unit]
  ): DocumentQueryanynullanyAll = js.native
  /** Find One all documents including deleted */
  def findOneWithDeleted(conditions: FilterQuery[_]): DocumentQueryanynullanyAll = js.native
  /** Find One all documents including deleted */
  def findOneWithDeleted(
    conditions: FilterQuery[_],
    callback: js.Function2[/* err */ js.Any, /* res */ js.Any | Null, Unit]
  ): DocumentQueryanynullanyAll = js.native
  /** Find One all documents including deleted */
  def findOneWithDeleted(conditions: FilterQuery[_], projection: js.Any): DocumentQueryanynullanyAll = js.native
  /** Find One all documents including deleted */
  def findOneWithDeleted(
    conditions: FilterQuery[_],
    projection: js.Any,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Any | Null, Unit]
  ): DocumentQueryanynullanyAll = js.native
  /** Find One all documents including deleted */
  def findOneWithDeleted(conditions: FilterQuery[_], projection: js.Any, options: leantrueOmitQueryFindBase): QueryDocumentDefinitionanAll = js.native
  /** Find One all documents including deleted */
  def findOneWithDeleted(
    conditions: FilterQuery[_],
    projection: js.Any,
    options: leantrueOmitQueryFindBase,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Any | Null, Unit]
  ): QueryDocumentDefinitionanAll = js.native
  /** Find One all documents including deleted */
  def findOneWithDeleted(conditions: FilterQuery[_], projection: js.Any, options: QueryFindBaseOptions): DocumentQueryanynullanyAll = js.native
  /** Find One all documents including deleted */
  def findOneWithDeleted(
    conditions: FilterQuery[_],
    projection: js.Any,
    options: QueryFindBaseOptions,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Any | Null, Unit]
  ): DocumentQueryanynullanyAll = js.native
  /** Find One all documents including deleted */
  @JSName("findOneWithDeleted")
  var findOneWithDeleted_Original: Fn0 = js.native
  
  /** Find all documents including deleted */
  def findWithDeleted(): DocumentQueryArrayanyanyAll = js.native
  /** Find all documents including deleted */
  def findWithDeleted(callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]): DocumentQueryArrayanyanyAll = js.native
  /** Find all documents including deleted */
  def findWithDeleted(conditions: FilterQuery[_]): QueryArrayDocumentDefinit = js.native
  /** Find all documents including deleted */
  def findWithDeleted(conditions: FilterQuery[_], callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]): DocumentQueryArrayanyanyAll = js.native
  /** Find all documents including deleted */
  def findWithDeleted(
    conditions: FilterQuery[_],
    projection: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): DocumentQueryArrayanyanyAll = js.native
  /** Find all documents including deleted */
  def findWithDeleted(
    conditions: FilterQuery[_],
    projection: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): QueryArrayDocumentDefinit = js.native
  /** Find all documents including deleted */
  def findWithDeleted(
    conditions: FilterQuery[_],
    projection: js.UndefOr[scala.Nothing],
    options: leantrueOmitQueryFindOpti
  ): QueryArrayDocumentDefinit = js.native
  /** Find all documents including deleted */
  def findWithDeleted(
    conditions: FilterQuery[_],
    projection: js.UndefOr[scala.Nothing],
    options: leantrueOmitQueryFindOpti,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): QueryArrayDocumentDefinit = js.native
  /** Find all documents including deleted */
  def findWithDeleted(conditions: FilterQuery[_], projection: js.UndefOr[scala.Nothing], options: QueryFindOptions): DocumentQueryArrayanyanyAll = js.native
  /** Find all documents including deleted */
  def findWithDeleted(
    conditions: FilterQuery[_],
    projection: js.UndefOr[scala.Nothing],
    options: QueryFindOptions,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): DocumentQueryArrayanyanyAll = js.native
  /** Find all documents including deleted */
  def findWithDeleted(conditions: FilterQuery[_], projection: js.Any): QueryArrayDocumentDefinit = js.native
  /** Find all documents including deleted */
  def findWithDeleted(
    conditions: FilterQuery[_],
    projection: js.Any,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): DocumentQueryArrayanyanyAll = js.native
  /** Find all documents including deleted */
  def findWithDeleted(
    conditions: FilterQuery[_],
    projection: js.Any,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): QueryArrayDocumentDefinit = js.native
  /** Find all documents including deleted */
  def findWithDeleted(conditions: FilterQuery[_], projection: js.Any, options: leantrueOmitQueryFindOpti): QueryArrayDocumentDefinit = js.native
  /** Find all documents including deleted */
  def findWithDeleted(
    conditions: FilterQuery[_],
    projection: js.Any,
    options: leantrueOmitQueryFindOpti,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): QueryArrayDocumentDefinit = js.native
  /** Find all documents including deleted */
  def findWithDeleted(conditions: FilterQuery[_], projection: js.Any, options: QueryFindOptions): DocumentQueryArrayanyanyAll = js.native
  /** Find all documents including deleted */
  def findWithDeleted(
    conditions: FilterQuery[_],
    projection: js.Any,
    options: QueryFindOptions,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): DocumentQueryArrayanyanyAll = js.native
  /** Find all documents including deleted */
  def findWithDeleted(
    conditions: FilterQuery[_],
    projection: Null,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): DocumentQueryArrayanyanyAll = js.native
  /** Find all documents including deleted */
  def findWithDeleted(
    conditions: FilterQuery[_],
    projection: Null,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): QueryArrayDocumentDefinit = js.native
  /** Find all documents including deleted */
  def findWithDeleted(conditions: FilterQuery[_], projection: Null, options: leantrueOmitQueryFindOpti): QueryArrayDocumentDefinit = js.native
  /** Find all documents including deleted */
  def findWithDeleted(
    conditions: FilterQuery[_],
    projection: Null,
    options: leantrueOmitQueryFindOpti,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): QueryArrayDocumentDefinit = js.native
  /** Find all documents including deleted */
  def findWithDeleted(conditions: FilterQuery[_], projection: Null, options: QueryFindOptions): DocumentQueryArrayanyanyAll = js.native
  /** Find all documents including deleted */
  def findWithDeleted(
    conditions: FilterQuery[_],
    projection: Null,
    options: QueryFindOptions,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): DocumentQueryArrayanyanyAll = js.native
  /** Find all documents including deleted */
  @JSName("findWithDeleted")
  def findWithDeleted_DocumentQueryArrayanyanyAll(conditions: FilterQuery[_]): DocumentQueryArrayanyanyAll = js.native
  /** Find all documents including deleted */
  @JSName("findWithDeleted")
  def findWithDeleted_DocumentQueryArrayanyanyAll(
    conditions: FilterQuery[_],
    projection: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): DocumentQueryArrayanyanyAll = js.native
  /** Find all documents including deleted */
  @JSName("findWithDeleted")
  def findWithDeleted_DocumentQueryArrayanyanyAll(conditions: FilterQuery[_], projection: js.Any): DocumentQueryArrayanyanyAll = js.native
  /** Find all documents including deleted */
  @JSName("findWithDeleted")
  def findWithDeleted_DocumentQueryArrayanyanyAll(
    conditions: FilterQuery[_],
    projection: js.Any,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): DocumentQueryArrayanyanyAll = js.native
  /** Find all documents including deleted */
  @JSName("findWithDeleted")
  def findWithDeleted_DocumentQueryArrayanyanyAll(
    conditions: FilterQuery[_],
    projection: Null,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Any, /* res */ js.Array[_], Unit]
  ): DocumentQueryArrayanyanyAll = js.native
  /** Find all documents including deleted */
  @JSName("findWithDeleted")
  var findWithDeleted_Original: FnCallConditionsProjectionOptionsCallback = js.native
  
  /**
    * Restore documents by conditions
    */
  def restore(): Query[T] with QueryHelpers = js.native
  def restore(conditions: js.UndefOr[scala.Nothing], fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  def restore(conditions: js.Any): Query[T] with QueryHelpers = js.native
  def restore(conditions: js.Any, fn: Callback[T, this.type]): Query[T] with QueryHelpers = js.native
  
  /** Update only deleted documents */
  def updateDeleted(conditions: FilterQuery[_], doc: UpdateQuery[_]): Queryany = js.native
  /** Update only deleted documents */
  def updateDeleted(
    conditions: FilterQuery[_],
    doc: UpdateQuery[_],
    callback: js.Function2[/* err */ js.Any, /* raw */ js.Any, Unit]
  ): Queryany = js.native
  /** Update only deleted documents */
  def updateDeleted(conditions: FilterQuery[_], doc: UpdateQuery[_], options: ModelUpdateOptions): Queryany = js.native
  /** Update only deleted documents */
  def updateDeleted(
    conditions: FilterQuery[_],
    doc: UpdateQuery[_],
    options: ModelUpdateOptions,
    callback: js.Function2[/* err */ js.Any, /* raw */ js.Any, Unit]
  ): Queryany = js.native
  /** Update only deleted documents */
  @JSName("updateDeleted")
  var updateDeleted_Original: FnCallConditionsDocOptionsCallback = js.native
  
  /** Update all documents including deleted */
  def updateWithDeleted(conditions: FilterQuery[_], doc: UpdateQuery[_]): Queryany = js.native
  /** Update all documents including deleted */
  def updateWithDeleted(
    conditions: FilterQuery[_],
    doc: UpdateQuery[_],
    callback: js.Function2[/* err */ js.Any, /* raw */ js.Any, Unit]
  ): Queryany = js.native
  /** Update all documents including deleted */
  def updateWithDeleted(conditions: FilterQuery[_], doc: UpdateQuery[_], options: ModelUpdateOptions): Queryany = js.native
  /** Update all documents including deleted */
  def updateWithDeleted(
    conditions: FilterQuery[_],
    doc: UpdateQuery[_],
    options: ModelUpdateOptions,
    callback: js.Function2[/* err */ js.Any, /* raw */ js.Any, Unit]
  ): Queryany = js.native
  /** Update all documents including deleted */
  @JSName("updateWithDeleted")
  var updateWithDeleted_Original: FnCallConditionsDocOptionsCallback = js.native
}
