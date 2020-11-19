package typingsSlinky.massive.mod

import typingsSlinky.massive.anon.PickSearchDefinitionfield
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("massive", "Readable")
@js.native
class Readable protected () extends Entity {
  def this(spec: ReadableSpecification) = this()
  
  def count(conditions: String, params: js.Array[_]): js.Promise[Double] = js.native
  /** Count rows matching criteria. */
  def count(conditions: AnyObject[_]): js.Promise[Double] = js.native
  
  /** Count documents matching criteria. Unlike count, this function only supports criteria objects. */
  def countDoc(criteria: js.Object): js.Promise[Double] = js.native
  
  /** Find rows matching criteria. */
  def find(): js.Promise[_] = js.native
  def find(criteria: js.UndefOr[scala.Nothing], options: RetrievalOptions with ResultProcessingOptions): js.Promise[_] = js.native
  def find(criteria: Double): js.Promise[_] = js.native
  def find(criteria: Double, options: RetrievalOptions with ResultProcessingOptions): js.Promise[_] = js.native
  def find(criteria: AnyObject[_]): js.Promise[_] = js.native
  def find(criteria: AnyObject[_], options: RetrievalOptions with ResultProcessingOptions): js.Promise[_] = js.native
  def find(criteria: UUID): js.Promise[_] = js.native
  def find(criteria: UUID, options: RetrievalOptions with ResultProcessingOptions): js.Promise[_] = js.native
  
  /** Find a document by searching in the body. */
  def findDoc(): js.Promise[_] = js.native
  def findDoc(criteria: js.UndefOr[scala.Nothing], options: RetrievalOptions): js.Promise[_] = js.native
  def findDoc(criteria: Double): js.Promise[_] = js.native
  def findDoc(criteria: Double, options: RetrievalOptions): js.Promise[_] = js.native
  def findDoc(criteria: AnyObject[_]): js.Promise[_] = js.native
  def findDoc(criteria: AnyObject[_], options: RetrievalOptions): js.Promise[_] = js.native
  def findDoc(criteria: UUID): js.Promise[_] = js.native
  def findDoc(criteria: UUID, options: RetrievalOptions): js.Promise[_] = js.native
  
  def findOne(criteria: Double): js.Promise[_] = js.native
  def findOne(criteria: Double, options: RetrievalOptions with ResultProcessingOptions): js.Promise[_] = js.native
  /** Return a single record. */
  def findOne(criteria: AnyObject[_]): js.Promise[_] = js.native
  def findOne(criteria: AnyObject[_], options: RetrievalOptions with ResultProcessingOptions): js.Promise[_] = js.native
  def findOne(criteria: UUID): js.Promise[_] = js.native
  def findOne(criteria: UUID, options: RetrievalOptions with ResultProcessingOptions): js.Promise[_] = js.native
  
  def isPkSearch(criteria: Double): Boolean = js.native
  /**
    * Determine whether criteria represent a search by primary key.
    * If a number or uuid are passed, it is assumed to be a primary key value; if an object, it must have only one key, which must specify the primary key column.
    */
  def isPkSearch(criteria: AnyObject[_]): Boolean = js.native
  def isPkSearch(criteria: UUID): Boolean = js.native
  
  /** Refresh a materialized view. */
  def refresh(): js.Promise[Unit] = js.native
  def refresh(concurrently: Boolean): js.Promise[Unit] = js.native
  
  /**
    * Perform a full-text search on queryable fields. If options.document is true, looks in the document body fields instead of the table columns.
    */
  def search(plan: SearchDefinition): js.Promise[js.Array[_]] = js.native
  def search(plan: SearchDefinition, options: RetrievalOptions): js.Promise[js.Array[_]] = js.native
  
  /** Shortcut to perform a full text search on a document table. */
  def searchDoc(plan: PickSearchDefinitionfield): js.Promise[js.Array[_]] = js.native
  def searchDoc(plan: PickSearchDefinitionfield, options: RetrievalOptions): js.Promise[js.Array[_]] = js.native
  
  /** Run a query with a raw SQL predicate, eg: db.mytable.where('id=$1', [123]).then(...); */
  def where(conditions: String): js.Promise[js.Array[_]] = js.native
  def where(
    conditions: String,
    params: js.UndefOr[scala.Nothing],
    options: RetrievalOptions with ResultProcessingOptions
  ): js.Promise[js.Array[_]] = js.native
  def where(conditions: String, params: js.Array[_]): js.Promise[js.Array[_]] = js.native
  def where(conditions: String, params: js.Array[_], options: RetrievalOptions with ResultProcessingOptions): js.Promise[js.Array[_]] = js.native
}
