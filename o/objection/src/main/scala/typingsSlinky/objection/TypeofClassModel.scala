package typingsSlinky.objection

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.knex.knexMod.FunctionHelper
import typingsSlinky.knex.knexMod.Knex
import typingsSlinky.knex.knexMod.QueryBuilder
import typingsSlinky.knex.knexMod.Raw
import typingsSlinky.knex.knexMod.RawBinding
import typingsSlinky.knex.knexMod.RawBuilder
import typingsSlinky.knex.knexMod.SafePartial
import typingsSlinky.knex.knexMod.Value
import typingsSlinky.knex.knexMod.ValueDict
import typingsSlinky.objection.objectionMod.ColumnNameMappers
import typingsSlinky.objection.objectionMod.CreateValidationErrorArgs
import typingsSlinky.objection.objectionMod.EagerAlgorithm
import typingsSlinky.objection.objectionMod.EagerOptions
import typingsSlinky.objection.objectionMod.FetchTableMetadataOptions
import typingsSlinky.objection.objectionMod.Filters
import typingsSlinky.objection.objectionMod.JsonSchema
import typingsSlinky.objection.objectionMod.Model
import typingsSlinky.objection.objectionMod.ModelOptions
import typingsSlinky.objection.objectionMod.Modifiers
import typingsSlinky.objection.objectionMod.Pojo
import typingsSlinky.objection.objectionMod.QueryBuilderYieldingOne
import typingsSlinky.objection.objectionMod.Relation
import typingsSlinky.objection.objectionMod.RelationExpression
import typingsSlinky.objection.objectionMod.RelationMappings
import typingsSlinky.objection.objectionMod.TableMetadata
import typingsSlinky.objection.objectionMod.TableMetadataOptions
import typingsSlinky.objection.objectionMod.Transaction
import typingsSlinky.objection.objectionMod.TraverserFunction
import typingsSlinky.objection.objectionMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassModel extends Instantiable0[Model] {
  var BelongsToOneRelation: Relation = js.native
  var HasManyRelation: Relation = js.native
  var HasOneRelation: Relation = js.native
  var HasOneThroughRelation: Relation = js.native
  var JoinEagerAlgorithm: EagerAlgorithm = js.native
  var ManyToManyRelation: Relation = js.native
  var NaiveEagerAlgorithm: EagerAlgorithm = js.native
  var WhereInEagerAlgorithm: EagerAlgorithm = js.native
  var columnNameMappers: ColumnNameMappers = js.native
  var dbRefProp: String = js.native
  var defaultEagerAlgorithm: js.UndefOr[EagerAlgorithm] = js.native
  var defaultEagerOptions: js.UndefOr[EagerOptions] = js.native
  var fn: FunctionHelper = js.native
  var idColumn: String | js.Array[String] = js.native
  var jsonAttributes: js.Array[String] = js.native
  var jsonSchema: JsonSchema = js.native
  var modelPaths: js.Array[String] = js.native
  var modifiers: Modifiers = js.native
  var pickJsonSchemaProperties: Boolean = js.native
  var propRefRegex: js.RegExp = js.native
  @JSName("raw")
  var raw_Original: RawBuilder[_, _] = js.native
  var relatedFindQueryMutates: Boolean = js.native
  var relatedInsertQueryMutates: Boolean = js.native
  var relationMappings: RelationMappings | js.Function0[RelationMappings] = js.native
  var tableName: String = js.native
  var uidProp: String = js.native
  var uidRefProp: String = js.native
  var virtualAttributes: js.Array[String] = js.native
  def bindKnex[M](knex: Knex[_, js.Array[_]]): M = js.native
  def bindTransaction[M](transaction: Transaction): M = js.native
  def createNotFoundError(): js.Error = js.native
  def createValidationError(args: CreateValidationErrorArgs): js.Error = js.native
  def createValidator(): Validator = js.native
  def fetchTableMetadata(): js.Promise[TableMetadata] = js.native
  def fetchTableMetadata(opt: FetchTableMetadataOptions): js.Promise[TableMetadata] = js.native
  def fromDatabaseJson[M](row: Pojo): M = js.native
  // fromJson and fromDatabaseJson both return an instance of Model, not a Model class:
  def fromJson[M](json: Pojo): M = js.native
  def fromJson[M](json: Pojo, opt: ModelOptions): M = js.native
  def getRelations(): StringDictionary[Relation] = js.native
  def knex(): Knex[_, js.Array[_]] = js.native
  def knex(knex: Knex[_, js.Array[_]]): Knex[_, js.Array[_]] = js.native
  def knexQuery(): QueryBuilder[_, js.Array[SafePartial[_]]] = js.native
  def loadRelated[QM /* <: Model */](model: QM, expression: RelationExpression): QueryBuilderYieldingOne[QM] = js.native
  def loadRelated[QM /* <: Model */](model: QM, expression: RelationExpression, filters: Filters[QM]): QueryBuilderYieldingOne[QM] = js.native
  def loadRelated[QM /* <: Model */](model: QM, expression: RelationExpression, filters: Filters[QM], trxOrKnex: Knex[_, js.Array[_]]): QueryBuilderYieldingOne[QM] = js.native
  def loadRelated[QM /* <: Model */](model: QM, expression: RelationExpression, filters: Filters[QM], trxOrKnex: Transaction): QueryBuilderYieldingOne[QM] = js.native
  // loadRelated is overloaded to support both Model and Model[] variants:
  def loadRelated[QM /* <: Model */](models: js.Array[QM], expression: RelationExpression): typingsSlinky.objection.objectionMod.QueryBuilder[
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def loadRelated[QM /* <: Model */](models: js.Array[QM], expression: RelationExpression, filters: Filters[QM]): typingsSlinky.objection.objectionMod.QueryBuilder[
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def loadRelated[QM /* <: Model */](
    models: js.Array[QM],
    expression: RelationExpression,
    filters: Filters[QM],
    trxOrKnex: Knex[_, js.Array[_]]
  ): typingsSlinky.objection.objectionMod.QueryBuilder[
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def loadRelated[QM /* <: Model */](models: js.Array[QM], expression: RelationExpression, filters: Filters[QM], trxOrKnex: Transaction): typingsSlinky.objection.objectionMod.QueryBuilder[
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def omitImpl(f: js.Function2[/* obj */ js.Object, /* prop */ String, Unit]): Unit = js.native
  def query[QM /* <: Model */](): typingsSlinky.objection.objectionMod.QueryBuilder[
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def query[QM /* <: Model */](trxOrKnex: Knex[_, js.Array[_]]): typingsSlinky.objection.objectionMod.QueryBuilder[
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def query[QM /* <: Model */](trxOrKnex: Transaction): typingsSlinky.objection.objectionMod.QueryBuilder[
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def raw[TResult2](sql: String, bindings: RawBinding*): Raw[TResult2] = js.native
  def raw[TResult2](sql: String, bindings: js.Array[RawBinding]): Raw[TResult2] = js.native
  def raw[TResult2](sql: String, bindings: ValueDict): Raw[TResult2] = js.native
  def raw[TResult2](value: Value): Raw[TResult2] = js.native
  // This can only be used as a subquery so the result model type is irrelevant.
  def relatedQuery(relationName: String): typingsSlinky.objection.objectionMod.QueryBuilder[
    _, 
    js.Array[_], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def tableMetadata(): TableMetadata = js.native
  def tableMetadata(opt: TableMetadataOptions): TableMetadata = js.native
  def traverse(
    filterConstructor: /* import warning: importer.ImportType#apply Failed type conversion: typeof Model */ js.Any,
    models: js.Array[Model],
    traverser: TraverserFunction
  ): Unit = js.native
  def traverse(
    filterConstructor: /* import warning: importer.ImportType#apply Failed type conversion: typeof Model */ js.Any,
    models: Model,
    traverser: TraverserFunction
  ): Unit = js.native
  def traverse(models: js.Array[Model], traverser: TraverserFunction): Unit = js.native
  def traverse(models: Model, traverser: TraverserFunction): Unit = js.native
}

