package typingsSlinky.asana.mod.resources

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.asana.mod.Dispatcher
import typingsSlinky.asana.mod.resources.Stories.ShortType
import typingsSlinky.asana.mod.resources.Stories.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A _story_ represents an activity associated with an object in the Asana
  * system. Stories are generated by the system whenever users take actions such
  * as creating or assigning tasks, or moving tasks between projects. _Comments_
  * are also a form of user-generated story.
  *
  * Stories are a form of history in the system, and as such they are read-only.
  * Once generated, it is not possible to modify a story.
  * @class
  * @param {Dispatcher} dispatcher The API dispatcher
  */
@js.native
trait Stories
  extends typingsSlinky.asana.mod.resources.Resource {
  
  /**
    * * Adds a comment to a task. The comment will be authored by the
    * * currently authenticated user, and timestamped when the server receives
    * * the request.
    * *
    * * Returns the full record for the new story added to the task.
    *   * @param {String|Number} task Globally unique identifier for the task.
    *   * @param {Object} data Data for the request
    *   * @param {String} data.text The plain text of the comment to add.
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param task
    * @param data
    * @param dispatchOptions?
    * @return
    */
  def createOnTask(task: String, data: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[ShortType]] = js.native
  def createOnTask(task: String, data: js.Any, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[ShortType]] = js.native
  def createOnTask(task: Double, data: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[ShortType]] = js.native
  def createOnTask(task: Double, data: js.Any, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[ShortType]] = js.native
  
  /**
    * * Returns the full record for a single story.
    *   * @param {String|Number} story Globally unique identifier for the story.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The requested resource
    * @param story
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def findById(story: String): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(story: String, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(story: String, params: Params): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(story: String, params: Params, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(story: Double): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(story: Double, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(story: Double, params: Params): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(story: Double, params: Params, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[Type] = js.native
  
  /**
    * * Returns the compact records for all stories on the task.
    *   * @param {String|Number} task Globally unique identifier for the task.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param task
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def findByTask(task: String): typingsSlinky.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByTask(task: String, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByTask(task: String, params: PaginationParams): typingsSlinky.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByTask(task: String, params: PaginationParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByTask(task: Double): typingsSlinky.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByTask(task: Double, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByTask(task: Double, params: PaginationParams): typingsSlinky.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByTask(task: Double, params: PaginationParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[Type]] = js.native
}
object Stories extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("asana", "resources.Stories")
  @js.native
  class ^ protected () extends Stories {
    /**
      * @param dispatcher
      */
    def this(dispatcher: Dispatcher) = this()
  }
  
  @JSImport("asana", "resources.Stories")
  @js.native
  val ^ : StoriesStatic = js.native
  
  @js.native
  trait ShortType
    extends typingsSlinky.asana.mod.resources.Resource {
    
    var created_at: String = js.native
    
    var created_by: typingsSlinky.asana.mod.resources.Resource = js.native
    
    var text: String = js.native
    
    var `type`: String = js.native
  }
  
  @js.native
  trait Type extends ShortType {
    
    var hearts: js.Array[Type] = js.native
    
    var html_text: String = js.native
    
    var source: String = js.native
    
    var target: typingsSlinky.asana.mod.resources.Resource = js.native
  }
  
  type _To = StoriesStatic
  
  /* This means you don't have to write `^`, but can instead just say `Stories.foo` */
  override def _to: StoriesStatic = ^
}
