package typingsSlinky.lambdaPhi.lambdaModelMod

import typingsSlinky.lambdaPhi.lambdaConfigMod.LambdaConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LambdaModel extends js.Object {
  var _anyMethod: js.Any = js.native
  var _basePath: js.Any = js.native
  var _bodyProperty: js.Any = js.native
  var _callbackProperty: js.Any = js.native
  var _config: js.Any = js.native
  var _contextProperty: js.Any = js.native
  var _eventContextProperty: js.Any = js.native
  /**
    * Lambda Properties
    */
  var _eventProperty: js.Any = js.native
  var _handlerMethod: js.Any = js.native
  var _headersProperty: js.Any = js.native
  var _httpVerbs: js.Any = js.native
  var _instance: js.Any = js.native
  var _methodProperty: js.Any = js.native
  var _name: js.Any = js.native
  var _pathParams: js.Any = js.native
  var _pathParamsProperty: js.Any = js.native
  var _paths: js.Any = js.native
  /**
    * API Properties
    */
  var _postConstructorMethod: js.Any = js.native
  var _preLambdaCallbackMethod: js.Any = js.native
  var _preLambdaTimeoutMethod: js.Any = js.native
  var _preLambdaTimeoutTime: js.Any = js.native
  /**
    * Api Gateway Properties
    */
  var _queryParamsProperty: js.Any = js.native
  var _stageVariablesProperty: js.Any = js.native
  var anyMethod: js.Any = js.native
  var basePath: String = js.native
  var bodyProperty: js.Any = js.native
  var callbackProperty: js.Any = js.native
  var config: LambdaConfig = js.native
  var contextProperty: js.Any = js.native
  var eventContextProperty: js.Any = js.native
  var eventProperty: js.Any = js.native
  var handlerMethod: js.Any = js.native
  var headersProperty: js.Any = js.native
  var httpVerbs: js.Array[typingsSlinky.lambdaPhi.httpVerbModelMod.default] = js.native
  var instance: js.Any = js.native
  var methodProperty: js.Any = js.native
  var name: js.Any = js.native
  var pathParams: js.Array[typingsSlinky.lambdaPhi.pathParamModelMod.default] = js.native
  var pathParamsProperty: js.Any = js.native
  var paths: js.Array[typingsSlinky.lambdaPhi.pathModelMod.default] = js.native
  var postConstructorMethod: js.Any = js.native
  var preLambdaCallbackMethod: String = js.native
  var preLambdaTimeoutMethod: String = js.native
  var preLambdaTimeoutTime: Double = js.native
  var queryParamsProperty: js.Any = js.native
  var stageVariablesProperty: js.Any = js.native
}

object LambdaModel {
  @scala.inline
  def apply(
    _anyMethod: js.Any,
    _basePath: js.Any,
    _bodyProperty: js.Any,
    _callbackProperty: js.Any,
    _config: js.Any,
    _contextProperty: js.Any,
    _eventContextProperty: js.Any,
    _eventProperty: js.Any,
    _handlerMethod: js.Any,
    _headersProperty: js.Any,
    _httpVerbs: js.Any,
    _instance: js.Any,
    _methodProperty: js.Any,
    _name: js.Any,
    _pathParams: js.Any,
    _pathParamsProperty: js.Any,
    _paths: js.Any,
    _postConstructorMethod: js.Any,
    _preLambdaCallbackMethod: js.Any,
    _preLambdaTimeoutMethod: js.Any,
    _preLambdaTimeoutTime: js.Any,
    _queryParamsProperty: js.Any,
    _stageVariablesProperty: js.Any,
    anyMethod: js.Any,
    basePath: String,
    bodyProperty: js.Any,
    callbackProperty: js.Any,
    config: LambdaConfig,
    contextProperty: js.Any,
    eventContextProperty: js.Any,
    eventProperty: js.Any,
    handlerMethod: js.Any,
    headersProperty: js.Any,
    httpVerbs: js.Array[typingsSlinky.lambdaPhi.httpVerbModelMod.default],
    instance: js.Any,
    methodProperty: js.Any,
    name: js.Any,
    pathParams: js.Array[typingsSlinky.lambdaPhi.pathParamModelMod.default],
    pathParamsProperty: js.Any,
    paths: js.Array[typingsSlinky.lambdaPhi.pathModelMod.default],
    postConstructorMethod: js.Any,
    preLambdaCallbackMethod: String,
    preLambdaTimeoutMethod: String,
    preLambdaTimeoutTime: Double,
    queryParamsProperty: js.Any,
    stageVariablesProperty: js.Any
  ): LambdaModel = {
    val __obj = js.Dynamic.literal(_anyMethod = _anyMethod.asInstanceOf[js.Any], _basePath = _basePath.asInstanceOf[js.Any], _bodyProperty = _bodyProperty.asInstanceOf[js.Any], _callbackProperty = _callbackProperty.asInstanceOf[js.Any], _config = _config.asInstanceOf[js.Any], _contextProperty = _contextProperty.asInstanceOf[js.Any], _eventContextProperty = _eventContextProperty.asInstanceOf[js.Any], _eventProperty = _eventProperty.asInstanceOf[js.Any], _handlerMethod = _handlerMethod.asInstanceOf[js.Any], _headersProperty = _headersProperty.asInstanceOf[js.Any], _httpVerbs = _httpVerbs.asInstanceOf[js.Any], _instance = _instance.asInstanceOf[js.Any], _methodProperty = _methodProperty.asInstanceOf[js.Any], _name = _name.asInstanceOf[js.Any], _pathParams = _pathParams.asInstanceOf[js.Any], _pathParamsProperty = _pathParamsProperty.asInstanceOf[js.Any], _paths = _paths.asInstanceOf[js.Any], _postConstructorMethod = _postConstructorMethod.asInstanceOf[js.Any], _preLambdaCallbackMethod = _preLambdaCallbackMethod.asInstanceOf[js.Any], _preLambdaTimeoutMethod = _preLambdaTimeoutMethod.asInstanceOf[js.Any], _preLambdaTimeoutTime = _preLambdaTimeoutTime.asInstanceOf[js.Any], _queryParamsProperty = _queryParamsProperty.asInstanceOf[js.Any], _stageVariablesProperty = _stageVariablesProperty.asInstanceOf[js.Any], anyMethod = anyMethod.asInstanceOf[js.Any], basePath = basePath.asInstanceOf[js.Any], bodyProperty = bodyProperty.asInstanceOf[js.Any], callbackProperty = callbackProperty.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], contextProperty = contextProperty.asInstanceOf[js.Any], eventContextProperty = eventContextProperty.asInstanceOf[js.Any], eventProperty = eventProperty.asInstanceOf[js.Any], handlerMethod = handlerMethod.asInstanceOf[js.Any], headersProperty = headersProperty.asInstanceOf[js.Any], httpVerbs = httpVerbs.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], methodProperty = methodProperty.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pathParams = pathParams.asInstanceOf[js.Any], pathParamsProperty = pathParamsProperty.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], postConstructorMethod = postConstructorMethod.asInstanceOf[js.Any], preLambdaCallbackMethod = preLambdaCallbackMethod.asInstanceOf[js.Any], preLambdaTimeoutMethod = preLambdaTimeoutMethod.asInstanceOf[js.Any], preLambdaTimeoutTime = preLambdaTimeoutTime.asInstanceOf[js.Any], queryParamsProperty = queryParamsProperty.asInstanceOf[js.Any], stageVariablesProperty = stageVariablesProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaModel]
  }
  @scala.inline
  implicit class LambdaModelOps[Self <: LambdaModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_anyMethod(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_anyMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_basePath(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_basePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_bodyProperty(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_bodyProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_callbackProperty(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_callbackProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_config(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_contextProperty(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_contextProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_eventContextProperty(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_eventContextProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_eventProperty(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_eventProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_handlerMethod(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_handlerMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_headersProperty(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_headersProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_httpVerbs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_httpVerbs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_instance(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_methodProperty(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_methodProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_name(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_pathParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_pathParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_pathParamsProperty(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_pathParamsProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_paths(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_paths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_postConstructorMethod(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_postConstructorMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_preLambdaCallbackMethod(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_preLambdaCallbackMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_preLambdaTimeoutMethod(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_preLambdaTimeoutMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_preLambdaTimeoutTime(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_preLambdaTimeoutTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_queryParamsProperty(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_queryParamsProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_stageVariablesProperty(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_stageVariablesProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnyMethod(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anyMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBasePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyProperty(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallbackProperty(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfig(value: LambdaConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContextProperty(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventContextProperty(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventContextProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventProperty(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandlerMethod(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlerMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeadersProperty(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headersProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttpVerbs(value: js.Array[typingsSlinky.lambdaPhi.httpVerbModelMod.default]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpVerbs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstance(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethodProperty(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathParams(value: js.Array[typingsSlinky.lambdaPhi.pathParamModelMod.default]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathParamsProperty(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathParamsProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaths(value: js.Array[typingsSlinky.lambdaPhi.pathModelMod.default]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostConstructorMethod(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postConstructorMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreLambdaCallbackMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preLambdaCallbackMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreLambdaTimeoutMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preLambdaTimeoutMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreLambdaTimeoutTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preLambdaTimeoutTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryParamsProperty(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParamsProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStageVariablesProperty(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stageVariablesProperty")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

