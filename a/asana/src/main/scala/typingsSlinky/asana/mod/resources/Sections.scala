package typingsSlinky.asana.mod.resources

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.asana.mod.Dispatcher
import typingsSlinky.asana.mod.resources.Sections.SectionsParams
import typingsSlinky.asana.mod.resources.Sections.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sections
  extends typingsSlinky.asana.mod.resources.Resource {
  
  /**
    * * Adds the specified task to a specific section of project. Returns empty object.
    * @param {String|Number} section The section to add task to.
    * @param {Object} data Data for the request
    * @param {String} data.task The id of task to be added to specified section.
    * @param {String} data.insert_after An existing task within this section after which the added task should be inserted. Cannot be provided together with insert_before.
    * @param {String} data.insert_before An existing task within this section before which the added task should be inserted. Cannot be provided together with insert_after.
    * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    * @return {Promise} The response from the API
    */
  def addTask(section: String, data: SectionsParams): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def addTask(section: String, data: SectionsParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def addTask(section: Double, data: SectionsParams): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def addTask(section: Double, data: SectionsParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  
  /**
    * Returns the complete record for a single section.
    * @param {String|Number} section The section to get.
    * @param {Object} [params] Parameters for the request
    * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    * @return {Promise} The requested resource
    */
  def findById(section: String): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(section: String, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(section: String, params: Params): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(section: String, params: Params, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(section: Double): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(section: Double, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(section: Double, params: Params): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(section: Double, params: Params, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[Type] = js.native
  
  /**
    * Returns the compact records for all sections in the specified project.
    * @param {String|Number} project The project to get sections from.
    * @param {Object} [params] Parameters for the request
    * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    * @return {Promise} The response from the API
    */
  def findByProject(project: String): typingsSlinky.bluebird.mod.^[js.Array[Type]] = js.native
  def findByProject(project: String, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[js.Array[Type]] = js.native
  def findByProject(project: String, params: Params): typingsSlinky.bluebird.mod.^[js.Array[Type]] = js.native
  def findByProject(project: String, params: Params, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[js.Array[Type]] = js.native
  def findByProject(project: Double): typingsSlinky.bluebird.mod.^[js.Array[Type]] = js.native
  def findByProject(project: Double, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[js.Array[Type]] = js.native
  def findByProject(project: Double, params: Params): typingsSlinky.bluebird.mod.^[js.Array[Type]] = js.native
  def findByProject(project: Double, params: Params, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[js.Array[Type]] = js.native
}
object Sections extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("asana", "resources.Sections")
  @js.native
  class ^ protected () extends Sections {
    /**
      * @param dispatcher
      */
    def this(dispatcher: Dispatcher) = this()
  }
  
  @JSImport("asana", "resources.Sections")
  @js.native
  val ^ : SectionsStatic = js.native
  
  @js.native
  trait SectionsParams extends StObject {
    
    var insert_after: js.UndefOr[String] = js.native
    
    var insert_before: js.UndefOr[String] = js.native
    
    var task: Double | String = js.native
  }
  object SectionsParams {
    
    @scala.inline
    def apply(task: Double | String): SectionsParams = {
      val __obj = js.Dynamic.literal(task = task.asInstanceOf[js.Any])
      __obj.asInstanceOf[SectionsParams]
    }
    
    @scala.inline
    implicit class SectionsParamsMutableBuilder[Self <: SectionsParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInsert_after(value: String): Self = StObject.set(x, "insert_after", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsert_afterUndefined: Self = StObject.set(x, "insert_after", js.undefined)
      
      @scala.inline
      def setInsert_before(value: String): Self = StObject.set(x, "insert_before", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsert_beforeUndefined: Self = StObject.set(x, "insert_before", js.undefined)
      
      @scala.inline
      def setTask(value: Double | String): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Type
    extends typingsSlinky.asana.mod.resources.Resource {
    
    var created_at: String = js.native
  }
  
  type _To = SectionsStatic
  
  /* This means you don't have to write `^`, but can instead just say `Sections.foo` */
  override def _to: SectionsStatic = ^
}
