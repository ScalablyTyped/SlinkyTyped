package typingsSlinky.loaderRunner.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtendedLoaderContext extends js.Object {
  var async: js.Function0[js.UndefOr[js.Function0[Unit]]] | Null = js.native
  var callback: js.Function0[Unit] | Null = js.native
  var context: String | Null = js.native
  var currentRequest: String = js.native
  var data: js.Any = js.native
  var loaderIndex: Double = js.native
  var loaders: js.Array[Loader] = js.native
  var previousRequest: String = js.native
  var query: StringDictionary[js.Any] | String = js.native
  var remainingRequest: String = js.native
  var request: String = js.native
  var resource: String = js.native
  var resourcePath: js.UndefOr[String] = js.native
  var resourceQuery: js.UndefOr[String] = js.native
  def addContextDependency(context: String): Unit = js.native
  def addDependency(file: String): Unit = js.native
  def cacheable(flag: Boolean): Unit = js.native
  def clearDependencies(): Unit = js.native
  def dependency(file: String): Unit = js.native
  def getContextDependencies(): js.Array[String] = js.native
  def getDependencies(): js.Array[String] = js.native
}

object ExtendedLoaderContext {
  @scala.inline
  def apply(
    addContextDependency: String => Unit,
    addDependency: String => Unit,
    cacheable: Boolean => Unit,
    clearDependencies: () => Unit,
    currentRequest: String,
    data: js.Any,
    dependency: String => Unit,
    getContextDependencies: () => js.Array[String],
    getDependencies: () => js.Array[String],
    loaderIndex: Double,
    loaders: js.Array[Loader],
    previousRequest: String,
    query: StringDictionary[js.Any] | String,
    remainingRequest: String,
    request: String,
    resource: String
  ): ExtendedLoaderContext = {
    val __obj = js.Dynamic.literal(addContextDependency = js.Any.fromFunction1(addContextDependency), addDependency = js.Any.fromFunction1(addDependency), cacheable = js.Any.fromFunction1(cacheable), clearDependencies = js.Any.fromFunction0(clearDependencies), currentRequest = currentRequest.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dependency = js.Any.fromFunction1(dependency), getContextDependencies = js.Any.fromFunction0(getContextDependencies), getDependencies = js.Any.fromFunction0(getDependencies), loaderIndex = loaderIndex.asInstanceOf[js.Any], loaders = loaders.asInstanceOf[js.Any], previousRequest = previousRequest.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], remainingRequest = remainingRequest.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedLoaderContext]
  }
  @scala.inline
  implicit class ExtendedLoaderContextOps[Self <: ExtendedLoaderContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddContextDependency(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addContextDependency")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddDependency(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addDependency")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCacheable(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClearDependencies(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearDependencies")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCurrentRequest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDependency(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependency")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetContextDependencies(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContextDependencies")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDependencies(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDependencies")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLoaderIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaderIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoaders(value: js.Array[Loader]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousRequest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: StringDictionary[js.Any] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemainingRequest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remainingRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsync(value: () => js.UndefOr[js.Function0[Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAsyncNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(null)
        ret
    }
    @scala.inline
    def withCallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCallbackNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(null)
        ret
    }
    @scala.inline
    def withContext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(null)
        ret
    }
    @scala.inline
    def withResourcePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourcePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourcePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourcePath")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceQuery")(js.undefined)
        ret
    }
  }
  
}

