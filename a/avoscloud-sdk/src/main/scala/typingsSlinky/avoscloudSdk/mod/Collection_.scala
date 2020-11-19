package typingsSlinky.avoscloudSdk.mod

import typingsSlinky.avoscloudSdk.mod.Collection.AddOptions
import typingsSlinky.avoscloudSdk.mod.Collection.CreateOptions
import typingsSlinky.avoscloudSdk.mod.Collection.FetchOptions
import typingsSlinky.avoscloudSdk.mod.Collection.Options
import typingsSlinky.avoscloudSdk.mod.Collection.RemoveOptions
import typingsSlinky.avoscloudSdk.mod.Collection.ResetOptions
import typingsSlinky.avoscloudSdk.mod.Collection.SortOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a new instance with the given models and options.  Typically, you
  * will not call this method directly, but will instead make a subclass using
  * <code>AV.Collection.extend</code>.
  *
  * @param {Array} models An array of instances of <code>AV.Object</code>.
  *
  * @param {Object} options An optional object with Backbone-style options.
  * Valid options are:<ul>
  *   <li>model: The AV.Object subclass that this collection contains.
  *   <li>query: An instance of AV.Query to use when fetching items.
  *   <li>comparator: A string property name or function to sort by.
  * </ul>
  *
  * @see AV.Collection.extend
  *
  * @class
  *
  * <p>Provides a standard collection class for our sets of models, ordered
  * or unordered.  For more information, see the
  * <a href="http://documentcloud.github.com/backbone/#Collection">Backbone
  * documentation</a>.</p>
  */
@JSImport("avoscloud-sdk", "Collection")
@js.native
class Collection_[T] ()
  extends Events
     with IBaseObject {
  def this(models: js.Array[Object]) = this()
  def this(models: js.UndefOr[scala.Nothing], options: Options) = this()
  def this(models: js.Array[Object], options: Options) = this()
  
  def add(models: js.Array[_]): Collection[T] = js.native
  def add(models: js.Array[_], options: AddOptions): Collection[T] = js.native
  
  def at(index: Double): Object = js.native
  
  def comparator(`object`: Object): js.Any = js.native
  
  def create(model: Object): Object = js.native
  def create(model: Object, options: CreateOptions): Object = js.native
  
  def fetch(): Promise[T] = js.native
  def fetch(options: FetchOptions): Promise[T] = js.native
  
  def get(id: String): Object = js.native
  
  def getByCid(cid: js.Any): js.Any = js.native
  
  def initialize(): Unit = js.native
  
  var model: Object = js.native
  
  var models: js.Array[Object] = js.native
  
  def pluck(attr: String): js.Array[_] = js.native
  
  var query: Query = js.native
  
  def remove(model: js.Any): Collection[T] = js.native
  def remove(model: js.Any, options: RemoveOptions): Collection[T] = js.native
  def remove(models: js.Array[_]): Collection[T] = js.native
  def remove(models: js.Array[_], options: RemoveOptions): Collection[T] = js.native
  
  def reset(models: js.Array[_]): Collection[T] = js.native
  def reset(models: js.Array[_], options: ResetOptions): Collection[T] = js.native
  
  def sort(): Collection[T] = js.native
  def sort(options: SortOptions): Collection[T] = js.native
}
