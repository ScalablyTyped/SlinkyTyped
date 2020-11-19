package typingsSlinky.nodal.mod

import typingsSlinky.nodal.anon.TypeofModel
import typingsSlinky.nodal.nodalStrings.ASC
import typingsSlinky.nodal.nodalStrings.DESC
import typingsSlinky.nodal.nodalStrings.DSC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodal", "Composer")
@js.native
class Composer[T /* <: Model */] protected () extends js.Object {
  /**
    * Created by Model#query, used for composing SQL queries based on Models
    * @param {Nodal.Model} Model The model class the composer is querying from
    * @param {Nodal.Composer} [parent=null] The composer's parent (another composer instance)
    */
  def this(modelConstructor: TypeofModel) = this()
  def this(modelConstructor: TypeofModel, parent: Composer[_]) = this()
  
  var Model: T = js.native
  
  /**
    * Add Joins to a query from queryInfo
    * @param {Object} query Must be format {sql: '', params: []}
    * @param {Object} queryInfo Must be format {commands: [], joins: []}
    * @param {Array} [includeColumns=*] Which columns to include, includes all by default
    * @return {Object} Has "params" and "sql" properties.
    * @private
    */
  /* private */ def __addJoinsToQuery__(query: js.Any, queryInfo: js.Any, includeColumns: js.Any): js.Any = js.native
  
  /**
    * Collapses linked list of queries into an array (for .reduce, .map etc)
    * @return {Array}
    * @private
    */
  /* private */ def __collapse__(): js.Any = js.native
  
  /* private */ def __filterHidden__(modelConstructor: js.Any, comparisonsArray: js.Any): js.Any = js.native
  
  /**
    * Generate a SQL count query
    * @param {boolean} [useLimit=false] Generates COUNT using limit command as well
    * @return {Object} Has "params" and "sql" properties.
    * @private
    */
  /* private */ def __generateCountQuery__(useLimit: js.Any): js.Any = js.native
  
  /**
    * Generate a SQL query and its associated parameters from the current composer instance
    * @param {Array} [includeColumns=*] Which columns to include, includes all by default
    * @param {boolean} [disableJoins=false] Disable joins if you just want a subset of data
    * @return {Object} Has "params" and "sql" properties.
    * @private
    */
  /* private */ def __generateQuery__(includeColumns: js.Any, disableJoins: js.Any): js.Any = js.native
  
  /**
    * Gets last limit command from a collapsed array of composer commands
    * @param {Array} [composerArray] Array of composer commands
    * @return {Array}
    * @private
    */
  /* private */ def __getLastLimitCommand__(composerArray: js.Any): js.Any = js.native
  
  /**
    * Determines whether this composer query represents a grouped query or not
    * @return {Boolean}
    * @private
    */
  /* private */ def __isGrouped__(): js.Any = js.native
  
  /**
    * Retrieve all joined column data for a given join
    * @param {string} joinName The name of the join relationship
    * @private
    */
  /* private */ def __joinedColumns__(joinName: js.Any): js.Any = js.native
  
  /**
    * When using Composer#where, format all provided comparisons
    * @param {Object} comparisons Comparisons object. {age__lte: 27}, for example.
    * @param {Nodal.Model} Model the model to use as the basis for comparison. Default to current model.
    * @return {Array}
    * @private
    */
  /* private */ def __parseComparisons__(comparisons: js.Any, model: js.Any): js.Any = js.native
  
  /**
    * Given rows with repeated data (due to joining in multiple children),
    * return only parent models (but include references to their children)
    * @param {Array} rows Rows from sql result
    * @param {Boolean} grouped Are these models grouped, if so, different procedure
    * @return {Nodal.ModelArray}
    * @private
    */
  /* private */ def __parseModelsFromRows__(rows: js.Any, grouped: js.Any): js.Any = js.native
  
  /**
    * Reduces an array of commands from query informtion to a SQL query
    * @param {Array} [commandArray]
    * @param {Array} [includeColumns=*] Which columns to include, includes all by default
    * @return {Object} Looks like {sql: [], params: []}
    * @private
    */
  /* private */ def __reduceCommandsToQuery__(commandArray: js.Any, includeColumns: js.Any): js.Any = js.native
  
  /**
    * Reduces an array of composer queries to a single query information object
    * @param {Array} [composerArray]
    * @return {Object} Looks like {commands: [], joins: []}
    * @private
    */
  /* private */ def __reduceToQueryInformation__(composerArray: js.Any): js.Any = js.native
  
  /**
    * Removes last limit command from a collapsed array of composer commands
    * @param {Array} [composerArray] Array of composer commands
    * @return {Array}
    * @private
    */
  /* private */ def __removeLastLimitCommand__(composerArray: js.Any): js.Any = js.native
  
  var _command: js.Any = js.native
  
  var _parent: js.Any = js.native
  
  /**
    * Aggregates a field
    * @param {String} alias The alias for the new aggregate field
    * @param {Function} transformation The transformation to apply to create the aggregate
    */
  def aggregate(alias: String): this.type = js.native
  def aggregate(alias: String, transformation: js.Function): this.type = js.native
  
  /**
    * Counts the results in the query
    * @param {function} callback Supplied with an error and the integer value of the count
    */
  def count(callback: js.Function2[/* err */ js.Error, /* count */ Double, Unit]): Unit = js.native
  
  var db: Database = js.native
  
  /**
    * Execute the query you've been composing.
    * @param {function({Error}, {Nodal.ModelArray})} callback The method to execute when the query is complete
    */
  def end(callback: js.Function2[/* err */ js.Error, /* modelArray */ ModelArray[T], Unit]): Unit = js.native
  
  /**
    * Shortcut for .limit(1).end(callback) that only returns a model object or error if not found
    * @param {Function} callback Callback to execute, provides an error and model parameter
    */
  def first(callback: js.Function2[/* err */ js.Error, /* model */ Model, Unit]): Unit = js.native
  
  /**
    * Groups by a specific field, or a transformation on a field
    * @param {String} column The column to group by
    */
  def groupBy(column: String): this.type = js.native
  
  /**
    * Join in a relationship.
    * @param {string} joinName The name of the joined relationship
    * @param {array} comparisonsArray comparisons to perform on this join (can be overloaded)
    */
  def join(joinName: String): this.type = js.native
  def join(
    joinName: String,
    comparisonsArray: js.UndefOr[scala.Nothing],
    orderBy: js.UndefOr[scala.Nothing],
    count: js.UndefOr[scala.Nothing],
    offset: Double
  ): this.type = js.native
  def join(
    joinName: String,
    comparisonsArray: js.UndefOr[scala.Nothing],
    orderBy: js.UndefOr[scala.Nothing],
    count: Double
  ): this.type = js.native
  def join(
    joinName: String,
    comparisonsArray: js.UndefOr[scala.Nothing],
    orderBy: js.UndefOr[scala.Nothing],
    count: Double,
    offset: Double
  ): this.type = js.native
  def join(joinName: String, comparisonsArray: js.Array[IComparison]): this.type = js.native
  def join(
    joinName: String,
    comparisonsArray: js.Array[IComparison],
    orderBy: js.UndefOr[scala.Nothing],
    count: js.UndefOr[scala.Nothing],
    offset: Double
  ): this.type = js.native
  def join(
    joinName: String,
    comparisonsArray: js.Array[IComparison],
    orderBy: js.UndefOr[scala.Nothing],
    count: Double
  ): this.type = js.native
  def join(
    joinName: String,
    comparisonsArray: js.Array[IComparison],
    orderBy: js.UndefOr[scala.Nothing],
    count: Double,
    offset: Double
  ): this.type = js.native
  def join(joinName: String, comparisonsArray: IComparison): this.type = js.native
  def join(
    joinName: String,
    comparisonsArray: IComparison,
    orderBy: js.UndefOr[scala.Nothing],
    count: js.UndefOr[scala.Nothing],
    offset: Double
  ): this.type = js.native
  def join(joinName: String, comparisonsArray: IComparison, orderBy: js.UndefOr[scala.Nothing], count: Double): this.type = js.native
  def join(
    joinName: String,
    comparisonsArray: IComparison,
    orderBy: js.UndefOr[scala.Nothing],
    count: Double,
    offset: Double
  ): this.type = js.native
  @JSName("join")
  def join_ASC(joinName: String, comparisonsArray: js.UndefOr[scala.Nothing], orderBy: ASC): this.type = js.native
  @JSName("join")
  def join_ASC(
    joinName: String,
    comparisonsArray: js.UndefOr[scala.Nothing],
    orderBy: ASC,
    count: js.UndefOr[scala.Nothing],
    offset: Double
  ): this.type = js.native
  @JSName("join")
  def join_ASC(joinName: String, comparisonsArray: js.UndefOr[scala.Nothing], orderBy: ASC, count: Double): this.type = js.native
  @JSName("join")
  def join_ASC(
    joinName: String,
    comparisonsArray: js.UndefOr[scala.Nothing],
    orderBy: ASC,
    count: Double,
    offset: Double
  ): this.type = js.native
  @JSName("join")
  def join_ASC(joinName: String, comparisonsArray: js.Array[IComparison], orderBy: ASC): this.type = js.native
  @JSName("join")
  def join_ASC(
    joinName: String,
    comparisonsArray: js.Array[IComparison],
    orderBy: ASC,
    count: js.UndefOr[scala.Nothing],
    offset: Double
  ): this.type = js.native
  @JSName("join")
  def join_ASC(joinName: String, comparisonsArray: js.Array[IComparison], orderBy: ASC, count: Double): this.type = js.native
  @JSName("join")
  def join_ASC(
    joinName: String,
    comparisonsArray: js.Array[IComparison],
    orderBy: ASC,
    count: Double,
    offset: Double
  ): this.type = js.native
  @JSName("join")
  def join_ASC(joinName: String, comparisonsArray: IComparison, orderBy: ASC): this.type = js.native
  @JSName("join")
  def join_ASC(
    joinName: String,
    comparisonsArray: IComparison,
    orderBy: ASC,
    count: js.UndefOr[scala.Nothing],
    offset: Double
  ): this.type = js.native
  @JSName("join")
  def join_ASC(joinName: String, comparisonsArray: IComparison, orderBy: ASC, count: Double): this.type = js.native
  @JSName("join")
  def join_ASC(joinName: String, comparisonsArray: IComparison, orderBy: ASC, count: Double, offset: Double): this.type = js.native
  @JSName("join")
  def join_DESC(joinName: String, comparisonsArray: js.UndefOr[scala.Nothing], orderBy: DESC): this.type = js.native
  @JSName("join")
  def join_DESC(
    joinName: String,
    comparisonsArray: js.UndefOr[scala.Nothing],
    orderBy: DESC,
    count: js.UndefOr[scala.Nothing],
    offset: Double
  ): this.type = js.native
  @JSName("join")
  def join_DESC(joinName: String, comparisonsArray: js.UndefOr[scala.Nothing], orderBy: DESC, count: Double): this.type = js.native
  @JSName("join")
  def join_DESC(
    joinName: String,
    comparisonsArray: js.UndefOr[scala.Nothing],
    orderBy: DESC,
    count: Double,
    offset: Double
  ): this.type = js.native
  @JSName("join")
  def join_DESC(joinName: String, comparisonsArray: js.Array[IComparison], orderBy: DESC): this.type = js.native
  @JSName("join")
  def join_DESC(
    joinName: String,
    comparisonsArray: js.Array[IComparison],
    orderBy: DESC,
    count: js.UndefOr[scala.Nothing],
    offset: Double
  ): this.type = js.native
  @JSName("join")
  def join_DESC(joinName: String, comparisonsArray: js.Array[IComparison], orderBy: DESC, count: Double): this.type = js.native
  @JSName("join")
  def join_DESC(
    joinName: String,
    comparisonsArray: js.Array[IComparison],
    orderBy: DESC,
    count: Double,
    offset: Double
  ): this.type = js.native
  @JSName("join")
  def join_DESC(joinName: String, comparisonsArray: IComparison, orderBy: DESC): this.type = js.native
  @JSName("join")
  def join_DESC(
    joinName: String,
    comparisonsArray: IComparison,
    orderBy: DESC,
    count: js.UndefOr[scala.Nothing],
    offset: Double
  ): this.type = js.native
  @JSName("join")
  def join_DESC(joinName: String, comparisonsArray: IComparison, orderBy: DESC, count: Double): this.type = js.native
  @JSName("join")
  def join_DESC(joinName: String, comparisonsArray: IComparison, orderBy: DESC, count: Double, offset: Double): this.type = js.native
  
  def limit(offset: String): this.type = js.native
  def limit(offset: String, count: String): this.type = js.native
  def limit(offset: String, count: Double): this.type = js.native
  /**
    * Limit to an offset and count
    * @param {number} offset The offset at which to set the limit. If this is the only argument provided, it will be the count instead.
    * @param {number} count The number of results to be returned. Can be omitted, and if omitted, first argument is used for count.
    * @return {Nodal.Composer} new Composer instance
    */
  def limit(offset: Double): this.type = js.native
  def limit(offset: Double, count: String): this.type = js.native
  def limit(offset: Double, count: Double): this.type = js.native
  
  /**
    * Order by field belonging to the current Composer instance's model.
    * @param {string} field Field to order by
    * @param {string} direction Must be 'ASC' or 'DESC'
    * @return {Nodal.Composer} new Composer instance
    */
  def orderBy(field: String): this.type = js.native
  def orderBy(field: String, direction: js.Any): this.type = js.native
  @JSName("orderBy")
  def orderBy_ASC(field: String, direction: ASC): this.type = js.native
  @JSName("orderBy")
  def orderBy_DSC(field: String, direction: DSC): this.type = js.native
  
  /**
    * Join in a relationship. Filters out hidden fields from comparisons.
    * @param {string} joinName The name of the joined relationship
    * @param {array} comparisonsArray comparisons to perform on this join (can be overloaded)
    */
  def safeJoin(joinName: String, comparisonsArray: IComparison*): this.type = js.native
  
  /**
    * Add comparisons to SQL WHERE clause. Does not allow filtering if Model.hides() has been called.
    * @param {Object} comparisons Comparisons object. {age__lte: 27}, for example.
    * @return {Nodal.Composer} new Composer instance
    */
  def safeWhere(comparisonsArray: IComparison*): this.type = js.native
  
  /**
    * Execute query as an update query, changed all fields specified.
    * @param {Object} fields The object containing columns (keys) and associated values you'd like to update
    * @param {function({Error}, {Nodal.ModelArray})} callback The callback for the update query
    */
  def update(
    fields: IAnyObject,
    callback: js.Function2[/* err */ js.Error, /* modelArray */ ModelArray[T], Unit]
  ): Unit = js.native
  
  /**
    * Add comparisons to SQL WHERE clause.
    * @param {Object} comparisons Comparisons object. {age__lte: 27}, for example.
    * @return {Nodal.Composer} new Composer instance
    */
  def where(comparisonsArray: IComparison*): this.type = js.native
}
