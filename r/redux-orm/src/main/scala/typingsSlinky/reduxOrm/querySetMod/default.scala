package typingsSlinky.reduxOrm.querySetMod

import typingsSlinky.reduxOrm.databaseMod.QueryClause
import typingsSlinky.reduxOrm.modelMod.AnyModel
import typingsSlinky.reduxOrm.modelMod.ModelClass
import typingsSlinky.reduxOrm.modelMod.ModelField
import typingsSlinky.reduxOrm.modelMod.Ref
import typingsSlinky.reduxOrm.modelMod.SessionBoundModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-orm/QuerySet", JSImport.Default)
@js.native
class default[M /* <: AnyModel */, InstanceProps /* <: js.Object */] protected ()
  extends QuerySet[M, InstanceProps]
     with ModelField {
  /**
    * Creates a `QuerySet`. The constructor is mainly for internal use;
    * Access QuerySet instances from {@link Model}.
    *
    * @param  modelClass - the {@link Model} class of objects in this QuerySet.
    * @param  clauses - query clauses needed to evaluate the set.
    * @param  [opts] - additional options
    */
  def this(modelClass: ModelClass[M], clauses: js.Array[QueryClause[js.Object]]) = this()
  def this(modelClass: ModelClass[M], clauses: js.Array[QueryClause[js.Object]], opts: js.Object) = this()
  /**
    * Checks if the {@link QuerySet} instance has any records matching the query
    * in the database.
    *
    * @return `true` if the {@link QuerySet} instance contains entities, else `false`.
    */
  /* InferMemberOverrides */
  override def exists(): Boolean = js.native
  /**
    * Returns an array of {@link SessionBoundModel} instances represented by the QuerySet.
    *
    * @return session bound model instances represented by the QuerySet
    */
  /* InferMemberOverrides */
  override def toModelArray(): js.Array[SessionBoundModel[M, InstanceProps]] = js.native
  /**
    * Returns an array of the plain objects represented by the QuerySet.
    * The plain objects are direct references to the store.
    *
    * @return references to the plain JS objects represented by the QuerySet
    */
  /* InferMemberOverrides */
  override def toRefArray(): js.Array[Ref[M] with InstanceProps] = js.native
}

@JSImport("redux-orm/QuerySet", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * Register custom method on a `QuerySet` class specification.
    * QuerySet class may be attached to a {@link Model} class via {@link Model#querySetClass}
    *
    * @param methodName - name of a method to be available on specific QuerySet class instances
    *
    * @example:
    * class CustomQuerySet extends QuerySet<Book> {
    *     static currentYear = 2019
    *     unreleased(): QuerySet<Book> {
    *         return this.filter(book => book.releaseYear > CustomQuerySet.currentYear);
    *     }
    * }
    * CustomQuerySet.addSharedMethod('unreleased');
    * // assign specific QuerySet to a Model class
    * Book.querySetClass = typeof CustomQuerySet;
    * // register models
    * const schema = {Book };
    * const orm = new ORM<typeof schema>();
    * orm.register(Book);
    * const session = orm.session(orm.getEmptyState());
    * // use shared method
    * const unreleased = customQs.unreleased();
    */
  def addSharedMethod(methodName: String): Unit = js.native
}

