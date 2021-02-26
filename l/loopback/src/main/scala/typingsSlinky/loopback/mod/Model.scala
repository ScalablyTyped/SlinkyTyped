package typingsSlinky.loopback.mod

import typingsSlinky.express.mod.NextFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The base class for **all models**
  * **Inheriting from `Model`*
  * ```js
  * var properties = {...};
  * var options = {...};
  * var MyModel = loopback.Model.extend('MyModel', properties, options);
  * ``
  * **Options*
  *  - `trackChanges` - If true, changes to the model will be tracked. **Required
  * for replication.*
  * **Events*
  * #### Event: `changed
  * Emitted after a model has been successfully created, saved, or updated.
  * Argument: `inst`, model instance, objec
  * ```js
  * MyModel.on('changed', function(inst) {
  *   console.log('model with id %s has been changed', inst.id);
  *   // => model with id 1 has been changed
  * });
  * ``
  *
  * #### Event: `deleted
  * Emitted after an individual model has been deleted.
  * Argument: `id`, model ID (number)
  * ```js
  * MyModel.on('deleted', function(id) {
  *   console.log('model with id %s has been deleted', id);
  *   // => model with id 1 has been deleted
  * });
  * ``
  * #### Event: `deletedAll
  *
  * Emitted after an individual model has been deleted.
  * Argument: `where` (optional), where filter, JSON object
  * ```js
  * MyModel.on('deletedAll', function(where) {
  *   if (where) {
  *     console.log('all models where ', where, ' have been deleted');
  *     // => all models where
  *     // => {price: {gt: 100}}
  *     // => have been deleted
  *   }
  * });
  * ``
  *
  * #### Event: `attached
  * Emitted after a `Model` has been attached to an `app`
  * #### Event: `dataSourceAttached
  * Emitted after a `Model` has been attached to a `DataSource`
  * #### Event: se
  * Emitted when model property is set.
  * Argument: `inst`, model instance, objec
  * ```js
  * MyModel.on('set', function(inst) {
  *   console.log('model with id %s has been changed', inst.id);
  *   // => model with id 1 has been changed
  * });
  * ``
  *
  * @param {any} data
  * @property {string} Model.modelName The name of the model. Static property.
  * @property {DataSource} Model.dataSource Data source to which the model is connected, if any. Static property.
  * @property {any} Model.sharedMethod The `strong-remoting` [SharedClass](apidocs.strongloop.com/strong-remoting/#sharedclass) that contains remoting (and http) metadata. Static property.
  * @property {any} settings Contains additional model settings.
  * @property {string} settings.http.path Base URL of the model HTTP route.
  * @property [{string}] settings.acls Array of ACLs for the model.
  * @class
  * @constructor
  */
@JSImport("loopback", "Model")
@js.native
class Model protected () extends StObject {
  def this(data: js.Any) = this()
  
  def afterRemote(
    method: String,
    callback: js.Function3[
      /* ctx */ Context, 
      /* modelInstanceOrNext */ this.type | NextFunction, 
      /* next */ js.UndefOr[NextFunction], 
      Unit
    ]
  ): Unit = js.native
  
  def afterRemoteError(method: String, callback: NextFunction): Unit = js.native
  
  /**
    * loopback 3.x Remote hooks
    * http://loopback.io/doc/en/lb3/Remote-hooks.html
    * @param method
    * @param backback
    */
  def beforeRemote(
    method: String,
    callback: js.Function3[
      /* ctx */ Context, 
      /* modelInstanceOrNext */ this.type | NextFunction, 
      /* next */ js.UndefOr[NextFunction], 
      Unit
    ]
  ): Unit = js.native
  
  /** Contains additional model settings. */
  var settings: Settings = js.native
}
object Model {
  
  @JSImport("loopback", "Model")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Check if the given access token can invoke the specified method
    * @param {AccessToken} token The access token.
    * @param {*} modelId The model ID.
    * @param {any} sharedMethod The method in question.
    * @param {any} ctx The remote invocation context.
    * @callback {() => void} callback The callback function.
    * @param {string|Error} err The error object.
    * @param {boolean} allowed True if the request is allowed; false otherwise
    */
  /* static member */
  @JSImport("loopback", "Model.checkAccess")
  @js.native
  def checkAccess(
    token: AccessToken,
    modelId: js.Any,
    sharedMethod: js.Any,
    ctx: js.Any,
    callback: js.Function2[/* err */ String | js.Error, /* allowed */ Boolean, Unit]
  ): Unit = js.native
  
  /** Data source to which the model is connected, if any. */
  /* static member */
  @JSImport("loopback", "Model.dataSource")
  @js.native
  def dataSource: js.Any = js.native
  @scala.inline
  def dataSource_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(x.asInstanceOf[js.Any])
  
  /**
    * Disable remote invocation for the method with the given name
    * @param {string} name The name of the method.
    * @param {boolean} isStatic Is the method static (eg. `MyModel.myMethod`)? Pass
    * `false` if the method defined on the prototype (eg.
    * `MyModel.prototype.myMethod`)
    */
  /* static member */
  @JSImport("loopback", "Model.disableRemoteMethod")
  @js.native
  def disableRemoteMethod(name: String, isStatic: Boolean): Unit = js.native
  
  /**
    * Disable remote invocation for the method with the given name.
    * @param {string} name The name of the method.
    * The name of the method (include "prototype." if the method is defined on the prototype).
    */
  /* static member */
  @JSImport("loopback", "Model.disableRemoteMethodByName")
  @js.native
  def disableRemoteMethodByName(name: String): Unit = js.native
  
  /**
    * Get the `Application` object to which the Model is attached
    * @callback {() => void} callback Callback function called with `(err, app)` arguments.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {Application} app Attached application object.
    * @end
    */
  /* static member */
  @JSImport("loopback", "Model.getApp")
  @js.native
  def getApp(callback: js.Function2[/* err */ js.Error, /* app */ Application, Unit]): Unit = js.native
  
  /** The name of the model. */
  /* static member */
  @JSImport("loopback", "Model.modelName")
  @js.native
  def modelName: String = js.native
  @scala.inline
  def modelName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modelName")(x.asInstanceOf[js.Any])
  
  /**
    * Enabled deeply-nested queries of related models via REST API
    * @param {string} relationName Name of the nested relation.
    * @options {any} [options] It is optional. See below.
    * @param {string} pathName The HTTP path (relative to the model) at which your remote method is exposed.
    * @param {string} filterMethod The filter name.
    * @param {string} paramName The argument name that the remote method accepts.
    * @param {string} getterName The getter name.
    * @param {boolean} hooks Whether to inherit before/after hooks.
    * @callback {() => void} filterCallback The Optional filter function.
    * @param {any} SharedMethod object. See [here](apidocs.strongloop.com/strong-remoting/#sharedmethod).
    * @param {any} RelationDefinition object which includes relation `type`, `ModelConstructor` of `modelFrom`, `modelTo`, `keyFrom`, `keyTo` and more relation definitions
    */
  /* static member */
  @JSImport("loopback", "Model.nestRemoting")
  @js.native
  def nestRemoting(
    relationName: String,
    pathName: String,
    filterMethod: String,
    paramName: String,
    getterName: String,
    hooks: Boolean
  ): Unit = js.native
  @JSImport("loopback", "Model.nestRemoting")
  @js.native
  def nestRemoting(
    relationName: String,
    pathName: String,
    filterMethod: String,
    paramName: String,
    getterName: String,
    hooks: Boolean,
    options: js.UndefOr[scala.Nothing],
    filterCallback: js.Function2[/* SharedMethod */ js.Any, /* RelationDefinition */ js.Any, Unit]
  ): Unit = js.native
  @JSImport("loopback", "Model.nestRemoting")
  @js.native
  def nestRemoting(
    relationName: String,
    pathName: String,
    filterMethod: String,
    paramName: String,
    getterName: String,
    hooks: Boolean,
    options: js.Object
  ): Unit = js.native
  @JSImport("loopback", "Model.nestRemoting")
  @js.native
  def nestRemoting(
    relationName: String,
    pathName: String,
    filterMethod: String,
    paramName: String,
    getterName: String,
    hooks: Boolean,
    options: js.Object,
    filterCallback: js.Function2[/* SharedMethod */ js.Any, /* RelationDefinition */ js.Any, Unit]
  ): Unit = js.native
  
  /**
    * Enable remote invocation for the specified method.
    * See [Remote methods](docs.strongloop.com/display/LB/Remote+methods) for more information
    * Static method example:
    * ```js
    * Model.myMethod();
    * Model.remoteMethod('myMethod');
    * ``
    * @param {string} name The name of the method.
    * @param {RemoteMethodOptions} options The remoting options.
    * See [Remote methods - Options](docs.strongloop.com/display/LB/Remote+methods#Remotemethods-Options)
    */
  /* static member */
  @JSImport("loopback", "Model.remoteMethod")
  @js.native
  def remoteMethod(name: String, options: RemoteMethodOptions): Unit = js.native
  
  /**
    * The `loopback.Model.extend()` method calls this when you create a model that extends another model.
    * Add any setup or configuration code you want executed when the model is created.
    * See  [Setting up a custom model](docs.strongloop.com/display/LB/Extending+built-in+models#Extendingbuilt-inmodels-Settingupacustommodel)
    */
  /* static member */
  @JSImport("loopback", "Model.setup")
  @js.native
  def setup(): Unit = js.native
  
  /** The `strong-remoting` */
  /* static member */
  @JSImport("loopback", "Model.sharedMethod")
  @js.native
  def sharedMethod: js.Any = js.native
  @scala.inline
  def sharedMethod_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sharedMethod")(x.asInstanceOf[js.Any])
}
