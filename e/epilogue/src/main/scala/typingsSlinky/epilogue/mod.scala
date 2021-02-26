package typingsSlinky.epilogue

import typingsSlinky.epilogue.anon.Model
import typingsSlinky.epilogue.anon.Plural
import typingsSlinky.epilogue.mod.Errors.EpilogueError
import typingsSlinky.express.mod.Express
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.expressServeStaticCore.mod.Request
import typingsSlinky.expressServeStaticCore.mod.Response
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.qs.mod.ParsedQs
import typingsSlinky.sequelize.mod.AssociationOptions
import typingsSlinky.sequelize.mod.DataTypeAbstract
import typingsSlinky.sequelize.mod.DataTypeArray
import typingsSlinky.sequelize.mod.DataTypeBigInt
import typingsSlinky.sequelize.mod.DataTypeBlob
import typingsSlinky.sequelize.mod.DataTypeBoolean
import typingsSlinky.sequelize.mod.DataTypeChar
import typingsSlinky.sequelize.mod.DataTypeDate
import typingsSlinky.sequelize.mod.DataTypeDateOnly
import typingsSlinky.sequelize.mod.DataTypeDecimal
import typingsSlinky.sequelize.mod.DataTypeDouble
import typingsSlinky.sequelize.mod.DataTypeEnum
import typingsSlinky.sequelize.mod.DataTypeFloat
import typingsSlinky.sequelize.mod.DataTypeGeometry
import typingsSlinky.sequelize.mod.DataTypeHStore
import typingsSlinky.sequelize.mod.DataTypeInteger
import typingsSlinky.sequelize.mod.DataTypeJSONB
import typingsSlinky.sequelize.mod.DataTypeJSONType
import typingsSlinky.sequelize.mod.DataTypeNow
import typingsSlinky.sequelize.mod.DataTypeNumber
import typingsSlinky.sequelize.mod.DataTypeRange
import typingsSlinky.sequelize.mod.DataTypeReal
import typingsSlinky.sequelize.mod.DataTypeString
import typingsSlinky.sequelize.mod.DataTypeText
import typingsSlinky.sequelize.mod.DataTypeTime
import typingsSlinky.sequelize.mod.DataTypeUUID
import typingsSlinky.sequelize.mod.DataTypeUUIDv1
import typingsSlinky.sequelize.mod.DataTypeUUIDv4
import typingsSlinky.sequelize.mod.DataTypeVirtual
import typingsSlinky.sequelize.mod.Sequelize
import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("epilogue", "BaseController")
  @js.native
  class BaseController protected () extends StObject {
    def this(options: BaseContollerOptions) = this()
    
    var endpoint: Endpoint = js.native
    
    var model: js.Any = js.native
  }
  
  @JSImport("epilogue", "CreateController")
  @js.native
  class CreateController protected () extends BaseController {
    def this(options: BaseContollerOptions) = this()
    
    def write(req: Request_[ParamsDictionary, _, _, Query], res: Response_[_], context: Context): js.Promise[js.Function0[Unit]] = js.native
  }
  
  @JSImport("epilogue", "DeleteController")
  @js.native
  class DeleteController protected () extends BaseController {
    def this(options: BaseContollerOptions) = this()
    
    def fetch(req: Request_[ParamsDictionary, _, _, Query], res: Response_[_], context: Context): js.Promise[js.Function0[Unit]] = js.native
    
    def write(req: Request_[ParamsDictionary, _, _, Query], res: Response_[_], context: Context): js.Promise[js.Function0[Unit]] = js.native
  }
  
  @JSImport("epilogue", "Endpoint")
  @js.native
  class Endpoint protected () extends StObject {
    def this(endpoint: String) = this()
    
    var attributes: js.Array[String] = js.native
    
    var string: String = js.native
  }
  
  object Errors {
    
    @JSImport("epilogue", "Errors.BadRequestError")
    @js.native
    class BadRequestError () extends EpilogueError {
      def this(message: String) = this()
      def this(message: js.UndefOr[scala.Nothing], errors: js.Array[String]) = this()
      def this(message: String, errors: js.Array[String]) = this()
      def this(message: js.UndefOr[scala.Nothing], errors: js.UndefOr[scala.Nothing], cause: js.Error) = this()
      def this(message: js.UndefOr[scala.Nothing], errors: js.Array[String], cause: js.Error) = this()
      def this(message: String, errors: js.UndefOr[scala.Nothing], cause: js.Error) = this()
      def this(message: String, errors: js.Array[String], cause: js.Error) = this()
    }
    
    @JSImport("epilogue", "Errors.EpilogueError")
    @js.native
    class EpilogueError protected () extends Error {
      def this(status: Double) = this()
      def this(status: EpilogueError) = this()
      def this(status: Double, message: String) = this()
      def this(status: EpilogueError, message: String) = this()
      def this(status: Double, message: js.UndefOr[scala.Nothing], errors: js.Array[String]) = this()
      def this(status: Double, message: String, errors: js.Array[String]) = this()
      def this(status: EpilogueError, message: js.UndefOr[scala.Nothing], errors: js.Array[String]) = this()
      def this(status: EpilogueError, message: String, errors: js.Array[String]) = this()
      def this(
        status: Double,
        message: js.UndefOr[scala.Nothing],
        errors: js.UndefOr[scala.Nothing],
        cause: js.Error
      ) = this()
      def this(status: Double, message: js.UndefOr[scala.Nothing], errors: js.Array[String], cause: js.Error) = this()
      def this(status: Double, message: String, errors: js.UndefOr[scala.Nothing], cause: js.Error) = this()
      def this(status: Double, message: String, errors: js.Array[String], cause: js.Error) = this()
      def this(
        status: EpilogueError,
        message: js.UndefOr[scala.Nothing],
        errors: js.UndefOr[scala.Nothing],
        cause: js.Error
      ) = this()
      def this(
        status: EpilogueError,
        message: js.UndefOr[scala.Nothing],
        errors: js.Array[String],
        cause: js.Error
      ) = this()
      def this(status: EpilogueError, message: String, errors: js.UndefOr[scala.Nothing], cause: js.Error) = this()
      def this(status: EpilogueError, message: String, errors: js.Array[String], cause: js.Error) = this()
      
      var cause: js.Error = js.native
      
      var errors: js.Array[String] = js.native
      
      var status: Double | EpilogueError = js.native
    }
    
    @JSImport("epilogue", "Errors.ForbiddenError")
    @js.native
    class ForbiddenError () extends EpilogueError {
      def this(message: String) = this()
      def this(message: js.UndefOr[scala.Nothing], errors: js.Array[String]) = this()
      def this(message: String, errors: js.Array[String]) = this()
      def this(message: js.UndefOr[scala.Nothing], errors: js.UndefOr[scala.Nothing], cause: js.Error) = this()
      def this(message: js.UndefOr[scala.Nothing], errors: js.Array[String], cause: js.Error) = this()
      def this(message: String, errors: js.UndefOr[scala.Nothing], cause: js.Error) = this()
      def this(message: String, errors: js.Array[String], cause: js.Error) = this()
    }
    
    @JSImport("epilogue", "Errors.NotFoundError")
    @js.native
    class NotFoundError () extends EpilogueError {
      def this(message: String) = this()
      def this(message: js.UndefOr[scala.Nothing], errors: js.Array[String]) = this()
      def this(message: String, errors: js.Array[String]) = this()
      def this(message: js.UndefOr[scala.Nothing], errors: js.UndefOr[scala.Nothing], cause: js.Error) = this()
      def this(message: js.UndefOr[scala.Nothing], errors: js.Array[String], cause: js.Error) = this()
      def this(message: String, errors: js.UndefOr[scala.Nothing], cause: js.Error) = this()
      def this(message: String, errors: js.Array[String], cause: js.Error) = this()
    }
    
    @JSImport("epilogue", "Errors.RequestCompleted")
    @js.native
    class RequestCompleted () extends Error
  }
  
  @JSImport("epilogue", "ListController")
  @js.native
  class ListController protected () extends BaseController {
    def this(options: BaseContollerOptions) = this()
    
    def _safeishParse(
      value: js.Any,
      `type`: DataTypeAbstract | DataTypeBoolean | DataTypeDateOnly | DataTypeHStore | DataTypeJSONB | DataTypeJSONType | DataTypeNow | DataTypeTime,
      sequelize: Sequelize
    ): js.Any = js.native
    def _safeishParse(value: js.Any, `type`: DataTypeArray, sequelize: Sequelize): js.Any = js.native
    def _safeishParse(value: js.Any, `type`: DataTypeBigInt, sequelize: Sequelize): js.Any = js.native
    def _safeishParse(value: js.Any, `type`: DataTypeBlob, sequelize: Sequelize): js.Any = js.native
    def _safeishParse(value: js.Any, `type`: DataTypeChar, sequelize: Sequelize): js.Any = js.native
    def _safeishParse(value: js.Any, `type`: DataTypeDate, sequelize: Sequelize): js.Any = js.native
    def _safeishParse(value: js.Any, `type`: DataTypeDecimal, sequelize: Sequelize): js.Any = js.native
    def _safeishParse(value: js.Any, `type`: DataTypeDouble, sequelize: Sequelize): js.Any = js.native
    def _safeishParse(value: js.Any, `type`: DataTypeEnum, sequelize: Sequelize): js.Any = js.native
    def _safeishParse(value: js.Any, `type`: DataTypeFloat, sequelize: Sequelize): js.Any = js.native
    def _safeishParse(value: js.Any, `type`: DataTypeGeometry, sequelize: Sequelize): js.Any = js.native
    def _safeishParse(value: js.Any, `type`: DataTypeInteger, sequelize: Sequelize): js.Any = js.native
    def _safeishParse(value: js.Any, `type`: DataTypeNumber, sequelize: Sequelize): js.Any = js.native
    def _safeishParse(value: js.Any, `type`: DataTypeRange, sequelize: Sequelize): js.Any = js.native
    def _safeishParse(value: js.Any, `type`: DataTypeReal, sequelize: Sequelize): js.Any = js.native
    def _safeishParse(value: js.Any, `type`: DataTypeString, sequelize: Sequelize): js.Any = js.native
    def _safeishParse(value: js.Any, `type`: DataTypeText, sequelize: Sequelize): js.Any = js.native
    def _safeishParse(value: js.Any, `type`: DataTypeUUID, sequelize: Sequelize): js.Any = js.native
    def _safeishParse(value: js.Any, `type`: DataTypeUUIDv1, sequelize: Sequelize): js.Any = js.native
    def _safeishParse(value: js.Any, `type`: DataTypeUUIDv4, sequelize: Sequelize): js.Any = js.native
    def _safeishParse(value: js.Any, `type`: DataTypeVirtual, sequelize: Sequelize): js.Any = js.native
    
    def fetch(req: Request_[ParamsDictionary, _, _, Query], res: Response_[_], context: Context): js.Promise[js.Function0[Unit]] = js.native
  }
  
  @JSImport("epilogue", "ReadController")
  @js.native
  class ReadController protected () extends BaseController {
    def this(options: BaseContollerOptions) = this()
    
    def fetch(req: Request_[ParamsDictionary, _, _, Query], res: Response_[_], context: Context): js.Promise[js.Function0[Unit]] = js.native
  }
  
  @JSImport("epilogue", "Resource")
  @js.native
  class Resource_ protected () extends StObject {
    def this(options: ResourceOptions) = this()
    
    var actions: js.Array[String] = js.native
    
    /**
      * Express instance itself is a request handler, which could be invoked without
      * third argument.
      */
    def app(req: Request[ParamsDictionary, _, _, ParsedQs], res: Response[_, Double]): js.Any = js.native
    def app(req: Request[ParamsDictionary, _, _, ParsedQs], res: ServerResponse): js.Any = js.native
    def app(req: IncomingMessage, res: Response[_, Double]): js.Any = js.native
    def app(req: IncomingMessage, res: ServerResponse): js.Any = js.native
    @JSName("app")
    var app_Original: Express = js.native
    
    var associationOptions: ResourceAssociationOptions = js.native
    
    var attributes: js.Array[String] = js.native
    
    var controllers: Controllers = js.native
    
    var endpoints: Plural = js.native
    
    var excludeAttributes: js.Array[String] = js.native
    
    var include: js.Array[Model | String] = js.native
    
    var model: js.Any = js.native
    
    var pagination: Boolean = js.native
    
    var readOnlyAttributes: js.Array[String] = js.native
    
    var reloadInstances: Boolean = js.native
    
    var search: ResourceSearchOption = js.native
    
    var sequelize: Sequelize = js.native
    
    var sort: ResourceSortOption = js.native
    
    var updateMethod: String = js.native
  }
  
  @JSImport("epilogue", "UpdateController")
  @js.native
  class UpdateController protected () extends BaseController {
    def this(options: BaseContollerOptions) = this()
    
    def fetch(req: Request_[ParamsDictionary, _, _, Query], res: Response_[_], context: Context): js.Promise[js.Function0[Unit]] = js.native
    
    def write(req: Request_[ParamsDictionary, _, _, Query], res: Response_[_], context: Context): js.Promise[js.Function0[Unit]] = js.native
  }
  
  @JSImport("epilogue", "initialize")
  @js.native
  def initialize(): Unit = js.native
  @JSImport("epilogue", "initialize")
  @js.native
  def initialize(options: InitializeOptions): Unit = js.native
  
  @JSImport("epilogue", "resource")
  @js.native
  def resource(): Resource_ = js.native
  @JSImport("epilogue", "resource")
  @js.native
  def resource(options: ResourceOptions): Resource_ = js.native
  
  @js.native
  trait BaseContollerOptions extends StObject {
    
    /**
      * Express instance itself is a request handler, which could be invoked without
      * third argument.
      */
    def app(req: Request[ParamsDictionary, _, _, ParsedQs], res: Response[_, Double]): js.Any = js.native
    def app(req: Request[ParamsDictionary, _, _, ParsedQs], res: ServerResponse): js.Any = js.native
    def app(req: IncomingMessage, res: Response[_, Double]): js.Any = js.native
    def app(req: IncomingMessage, res: ServerResponse): js.Any = js.native
    @JSName("app")
    var app_Original: Express = js.native
    
    var endpoint: String = js.native
    
    var include: js.Array[Model | String] = js.native
    
    var model: js.Any = js.native
    
    var resource: Resource_ = js.native
  }
  
  @js.native
  trait Context extends StObject {
    
    var attributes: js.Any = js.native
    
    def continue(): Unit = js.native
    
    var criteria: js.Any = js.native
    
    def error(status: Double): Unit = js.native
    def error(
      status: Double,
      message: js.UndefOr[scala.Nothing],
      errorList: js.UndefOr[scala.Nothing],
      cause: js.Error
    ): Unit = js.native
    def error(status: Double, message: js.UndefOr[scala.Nothing], errorList: js.Array[String]): Unit = js.native
    def error(status: Double, message: js.UndefOr[scala.Nothing], errorList: js.Array[String], cause: js.Error): Unit = js.native
    def error(status: Double, message: String): Unit = js.native
    def error(status: Double, message: String, errorList: js.UndefOr[scala.Nothing], cause: js.Error): Unit = js.native
    def error(status: Double, message: String, errorList: js.Array[String]): Unit = js.native
    def error(status: Double, message: String, errorList: js.Array[String], cause: js.Error): Unit = js.native
    def error(status: EpilogueError): Unit = js.native
    def error(
      status: EpilogueError,
      message: js.UndefOr[scala.Nothing],
      errorList: js.UndefOr[scala.Nothing],
      cause: js.Error
    ): Unit = js.native
    def error(status: EpilogueError, message: js.UndefOr[scala.Nothing], errorList: js.Array[String]): Unit = js.native
    def error(
      status: EpilogueError,
      message: js.UndefOr[scala.Nothing],
      errorList: js.Array[String],
      cause: js.Error
    ): Unit = js.native
    def error(status: EpilogueError, message: String): Unit = js.native
    def error(status: EpilogueError, message: String, errorList: js.UndefOr[scala.Nothing], cause: js.Error): Unit = js.native
    def error(status: EpilogueError, message: String, errorList: js.Array[String]): Unit = js.native
    def error(status: EpilogueError, message: String, errorList: js.Array[String], cause: js.Error): Unit = js.native
    
    var instance: Resource_ = js.native
    
    var options: js.Any = js.native
    
    def skip(): Unit = js.native
    
    def stop(): Unit = js.native
  }
  
  @js.native
  trait Controllers extends StObject {
    
    var base: BaseController = js.native
    
    var create: CreateController = js.native
    
    var delete: DeleteController = js.native
    
    var list: ListController = js.native
    
    var read: ReadController = js.native
    
    var update: UpdateController = js.native
  }
  object Controllers {
    
    @scala.inline
    def apply(
      base: BaseController,
      create: CreateController,
      delete: DeleteController,
      list: ListController,
      read: ReadController,
      update: UpdateController
    ): Controllers = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], create = create.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
      __obj.asInstanceOf[Controllers]
    }
    
    @scala.inline
    implicit class ControllersMutableBuilder[Self <: Controllers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase(value: BaseController): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreate(value: CreateController): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelete(value: DeleteController): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setList(value: ListController): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRead(value: ReadController): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdate(value: UpdateController): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InitializeOptions extends StObject {
    
    /**
      * Express instance itself is a request handler, which could be invoked without
      * third argument.
      */
    def app(req: Request[ParamsDictionary, _, _, ParsedQs], res: Response[_, Double]): js.Any = js.native
    def app(req: Request[ParamsDictionary, _, _, ParsedQs], res: ServerResponse): js.Any = js.native
    def app(req: IncomingMessage, res: Response[_, Double]): js.Any = js.native
    def app(req: IncomingMessage, res: ServerResponse): js.Any = js.native
    @JSName("app")
    var app_Original: Express = js.native
    
    var base: js.UndefOr[String] = js.native
    
    var sequelize: Sequelize = js.native
    
    var updateMethod: js.UndefOr[String] = js.native
  }
  
  @js.native
  trait ResourceAssociationOptions extends AssociationOptions {
    
    var removeForeignKeys: Boolean = js.native
  }
  object ResourceAssociationOptions {
    
    @scala.inline
    def apply(removeForeignKeys: Boolean): ResourceAssociationOptions = {
      val __obj = js.Dynamic.literal(removeForeignKeys = removeForeignKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceAssociationOptions]
    }
    
    @scala.inline
    implicit class ResourceAssociationOptionsMutableBuilder[Self <: ResourceAssociationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRemoveForeignKeys(value: Boolean): Self = StObject.set(x, "removeForeignKeys", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResourceOptions extends StObject {
    
    var actions: js.UndefOr[js.Array[String]] = js.native
    
    var associations: js.UndefOr[AssociationOptions] = js.native
    
    var endpoints: js.Array[String] = js.native
    
    var excludeAttributes: js.UndefOr[js.Array[String]] = js.native
    
    var include: js.UndefOr[js.Array[Model | String]] = js.native
    
    var model: js.Any = js.native
    
    var pagination: js.UndefOr[Boolean] = js.native
    
    var readOnlyAttributes: js.UndefOr[js.Array[String]] = js.native
    
    var reloadInstances: js.UndefOr[Boolean] = js.native
    
    var search: js.UndefOr[ResourceSearchOption] = js.native
    
    var sort: js.UndefOr[ResourceSortOption] = js.native
    
    var updateMethod: js.UndefOr[String] = js.native
  }
  object ResourceOptions {
    
    @scala.inline
    def apply(endpoints: js.Array[String], model: js.Any): ResourceOptions = {
      val __obj = js.Dynamic.literal(endpoints = endpoints.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceOptions]
    }
    
    @scala.inline
    implicit class ResourceOptionsMutableBuilder[Self <: ResourceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: js.Array[String]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      @scala.inline
      def setActionsVarargs(value: String*): Self = StObject.set(x, "actions", js.Array(value :_*))
      
      @scala.inline
      def setAssociations(value: AssociationOptions): Self = StObject.set(x, "associations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssociationsUndefined: Self = StObject.set(x, "associations", js.undefined)
      
      @scala.inline
      def setEndpoints(value: js.Array[String]): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointsVarargs(value: String*): Self = StObject.set(x, "endpoints", js.Array(value :_*))
      
      @scala.inline
      def setExcludeAttributes(value: js.Array[String]): Self = StObject.set(x, "excludeAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeAttributesUndefined: Self = StObject.set(x, "excludeAttributes", js.undefined)
      
      @scala.inline
      def setExcludeAttributesVarargs(value: String*): Self = StObject.set(x, "excludeAttributes", js.Array(value :_*))
      
      @scala.inline
      def setInclude(value: js.Array[Model | String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      @scala.inline
      def setIncludeVarargs(value: (Model | String)*): Self = StObject.set(x, "include", js.Array(value :_*))
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPagination(value: Boolean): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
      
      @scala.inline
      def setReadOnlyAttributes(value: js.Array[String]): Self = StObject.set(x, "readOnlyAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyAttributesUndefined: Self = StObject.set(x, "readOnlyAttributes", js.undefined)
      
      @scala.inline
      def setReadOnlyAttributesVarargs(value: String*): Self = StObject.set(x, "readOnlyAttributes", js.Array(value :_*))
      
      @scala.inline
      def setReloadInstances(value: Boolean): Self = StObject.set(x, "reloadInstances", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReloadInstancesUndefined: Self = StObject.set(x, "reloadInstances", js.undefined)
      
      @scala.inline
      def setSearch(value: ResourceSearchOption): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      @scala.inline
      def setSort(value: ResourceSortOption): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      @scala.inline
      def setUpdateMethod(value: String): Self = StObject.set(x, "updateMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateMethodUndefined: Self = StObject.set(x, "updateMethod", js.undefined)
    }
  }
  
  @js.native
  trait ResourceSearchOption extends StObject {
    
    var attributes: js.Array[String] = js.native
    
    var operator: String = js.native
    
    var param: String = js.native
  }
  object ResourceSearchOption {
    
    @scala.inline
    def apply(attributes: js.Array[String], operator: String, param: String): ResourceSearchOption = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceSearchOption]
    }
    
    @scala.inline
    implicit class ResourceSearchOptionMutableBuilder[Self <: ResourceSearchOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value :_*))
      
      @scala.inline
      def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParam(value: String): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResourceSortOption extends StObject {
    
    var default: String = js.native
    
    var param: String = js.native
  }
  object ResourceSortOption {
    
    @scala.inline
    def apply(default: String, param: String): ResourceSortOption = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceSortOption]
    }
    
    @scala.inline
    implicit class ResourceSortOptionMutableBuilder[Self <: ResourceSortOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParam(value: String): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    }
  }
}
