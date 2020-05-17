package typingsSlinky.schwifty.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.knex.mod.FunctionHelper
import typingsSlinky.knex.mod.QueryBuilder
import typingsSlinky.knex.mod.Raw
import typingsSlinky.knex.mod.RawBinding
import typingsSlinky.knex.mod.RawBuilder
import typingsSlinky.knex.mod.SafePartial
import typingsSlinky.knex.mod.Value
import typingsSlinky.knex.mod.ValueDict
import typingsSlinky.objection.anon.TypeofQueryBuilder
import typingsSlinky.objection.mod.ColumnNameMappers
import typingsSlinky.objection.mod.CreateValidationErrorArgs
import typingsSlinky.objection.mod.EagerAlgorithm
import typingsSlinky.objection.mod.EagerOptions
import typingsSlinky.objection.mod.FetchTableMetadataOptions
import typingsSlinky.objection.mod.Filters
import typingsSlinky.objection.mod.JsonSchema
import typingsSlinky.objection.mod.Model
import typingsSlinky.objection.mod.ModelOptions
import typingsSlinky.objection.mod.Modifiers
import typingsSlinky.objection.mod.Pojo
import typingsSlinky.objection.mod.QueryBuilderYieldingOne
import typingsSlinky.objection.mod.Relation
import typingsSlinky.objection.mod.RelationExpression
import typingsSlinky.objection.mod.RelationMappings
import typingsSlinky.objection.mod.TableMetadata
import typingsSlinky.objection.mod.TableMetadataOptions
import typingsSlinky.objection.mod.Transaction_
import typingsSlinky.objection.mod.TraverserFunction
import typingsSlinky.objection.mod.Validator
import typingsSlinky.schwifty.mod.ModelClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofModelInstantiable
  extends ModelClass
     with Instantiable0[Model] {
  var BelongsToOneRelation: Relation = js.native
  var HasManyRelation: Relation = js.native
  var HasOneRelation: Relation = js.native
  var HasOneThroughRelation: Relation = js.native
  var JoinEagerAlgorithm: EagerAlgorithm = js.native
  var ManyToManyRelation: Relation = js.native
  var NaiveEagerAlgorithm: EagerAlgorithm = js.native
  var QueryBuilder: TypeofQueryBuilder = js.native
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
  def bindKnex[M](knex: typingsSlinky.knex.mod.Knex[_, js.Array[_]]): M = js.native
  def bindTransaction[M](transaction: Transaction_): M = js.native
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
  def knex(): typingsSlinky.knex.mod.Knex[_, js.Array[_]] = js.native
  def knex(knex: typingsSlinky.knex.mod.Knex[_, js.Array[_]]): typingsSlinky.knex.mod.Knex[_, js.Array[_]] = js.native
  def knexQuery(): QueryBuilder[_, js.Array[SafePartial[_]]] = js.native
  def loadRelated[QM /* <: Model */](model: QM, expression: RelationExpression): QueryBuilderYieldingOne[QM] = js.native
  def loadRelated[QM /* <: Model */](model: QM, expression: RelationExpression, filters: Filters[QM]): QueryBuilderYieldingOne[QM] = js.native
  def loadRelated[QM /* <: Model */](
    model: QM,
    expression: RelationExpression,
    filters: Filters[QM],
    trxOrKnex: typingsSlinky.knex.mod.Knex[_, js.Array[_]]
  ): QueryBuilderYieldingOne[QM] = js.native
  def loadRelated[QM /* <: Model */](model: QM, expression: RelationExpression, filters: Filters[QM], trxOrKnex: Transaction_): QueryBuilderYieldingOne[QM] = js.native
  // loadRelated is overloaded to support both Model and Model[] variants:
  def loadRelated[QM /* <: Model */](models: js.Array[QM], expression: RelationExpression): typingsSlinky.objection.mod.QueryBuilder[
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def loadRelated[QM /* <: Model */](models: js.Array[QM], expression: RelationExpression, filters: Filters[QM]): typingsSlinky.objection.mod.QueryBuilder[
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def loadRelated[QM /* <: Model */](
    models: js.Array[QM],
    expression: RelationExpression,
    filters: Filters[QM],
    trxOrKnex: typingsSlinky.knex.mod.Knex[_, js.Array[_]]
  ): typingsSlinky.objection.mod.QueryBuilder[
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def loadRelated[QM /* <: Model */](
    models: js.Array[QM],
    expression: RelationExpression,
    filters: Filters[QM],
    trxOrKnex: Transaction_
  ): typingsSlinky.objection.mod.QueryBuilder[
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def omitImpl(f: js.Function2[/* obj */ js.Object, /* prop */ String, Unit]): Unit = js.native
  def query[QM /* <: Model */](): typingsSlinky.objection.mod.QueryBuilder[
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def query[QM /* <: Model */](trxOrKnex: typingsSlinky.knex.mod.Knex[_, js.Array[_]]): typingsSlinky.objection.mod.QueryBuilder[
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def query[QM /* <: Model */](trxOrKnex: Transaction_): typingsSlinky.objection.mod.QueryBuilder[
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def raw[TResult2](sql: String, bindings: RawBinding*): Raw[TResult2] = js.native
  def raw[TResult2](sql: String, bindings: js.Array[RawBinding]): Raw[TResult2] = js.native
  def raw[TResult2](sql: String, bindings: ValueDict): Raw[TResult2] = js.native
  def raw[TResult2](value: Value): Raw[TResult2] = js.native
  // This can only be used as a subquery so the result model type is irrelevant.
  def relatedQuery(relationName: String): typingsSlinky.objection.mod.QueryBuilder[
    _, 
    js.Array[_], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def tableMetadata(): TableMetadata = js.native
  def tableMetadata(opt: TableMetadataOptions): TableMetadata = js.native
  def traverse(
    filterConstructor: typingsSlinky.objection.anon.TypeofModel,
    models: js.Array[Model],
    traverser: TraverserFunction
  ): Unit = js.native
  def traverse(
    filterConstructor: typingsSlinky.objection.anon.TypeofModel,
    models: Model,
    traverser: TraverserFunction
  ): Unit = js.native
  def traverse(models: js.Array[Model], traverser: TraverserFunction): Unit = js.native
  def traverse(models: Model, traverser: TraverserFunction): Unit = js.native
}

