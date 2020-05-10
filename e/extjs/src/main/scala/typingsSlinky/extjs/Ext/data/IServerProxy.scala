package typingsSlinky.extjs.Ext.data

import typingsSlinky.extjs.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IServerProxy
  extends typingsSlinky.extjs.Ext.data.proxy.IProxy {
  /** [Method] Optional callback function which can be used to clean up after a request has been completed
  		* @param request Ext.data.Request The Request object
  		* @param success Boolean True if the request was successful
  		*/
  var afterRequest: js.UndefOr[
    js.Function2[/* request */ js.UndefOr[IRequest], /* success */ js.UndefOr[Boolean], Unit]
  ] = js.native
  /** [Config Option] (Object) */
  var api: js.UndefOr[js.Any] = js.native
  /** [Method] Creates an Request object from Operation
  		* @param operation Ext.data.Operation The operation to execute
  		* @returns Ext.data.Request The request object
  		*/
  var buildRequest: js.UndefOr[js.Function1[/* operation */ js.UndefOr[IOperation], IRequest]] = js.native
  /** [Method] Generates a url based on a given Ext data Request object
  		* @param request Ext.data.Request The request object
  		* @returns String The url
  		*/
  var buildUrl: js.UndefOr[js.Function1[/* request */ js.UndefOr[IRequest], String]] = js.native
  /** [Config Option] (String) */
  var cacheString: js.UndefOr[String] = js.native
  /** [Method] in a ServerProxy all four CRUD operations are executed in the same manner so we delegate to doRequest in each case */
  @JSName("create")
  var create_IServerProxy: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Performs the given destroy operation  */
  @JSName("destroy")
  var destroy_IServerProxy: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String) */
  var directionParam: js.UndefOr[String] = js.native
  /** [Method] In ServerProxy subclasses the create read update and destroy methods all pass through to doRequest
  		* @param operation Ext.data.Operation The Ext.data.Operation object
  		* @param callback Function The callback function to call when the Operation has completed
  		* @param scope Object The scope in which to execute the callback
  		*/
  var doRequest: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[IOperation], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Encodes the array of Ext util Filter objects into a string to be sent in the request url
  		* @param filters Ext.util.Filter[] The array of Filter objects
  		* @returns String The encoded filters
  		*/
  var encodeFilters: js.UndefOr[js.Function1[/* filters */ js.UndefOr[Array], String]] = js.native
  /** [Method] Encodes the array of Ext util Sorter objects into a string to be sent in the request url
  		* @param sorters Ext.util.Sorter[] The array of Sorter objects
  		* @returns String The encoded sorters
  		*/
  var encodeSorters: js.UndefOr[js.Function1[/* sorters */ js.UndefOr[Array], String]] = js.native
  /** [Config Option] (Object) */
  var extraParams: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var filterParam: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var groupDirectionParam: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var groupParam: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var idParam: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var limitParam: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var noCache: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var pageParam: js.UndefOr[String] = js.native
  /** [Method] Performs the given read operation  */
  @JSName("read")
  var read_IServerProxy: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Sets a value in the underlying extraParams
  		* @param name String The key for the new value
  		* @param value Object The value
  		*/
  var setExtraParam: js.UndefOr[
    js.Function2[/* name */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Config Option] (Boolean) */
  var simpleGroupMode: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var simpleSortMode: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var sortParam: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var startParam: js.UndefOr[String] = js.native
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[Double] = js.native
  /** [Method] Performs the given update operation  */
  @JSName("update")
  var update_IServerProxy: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String) */
  var url: js.UndefOr[String] = js.native
}

object IServerProxy {
  @scala.inline
  def apply(): IServerProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IServerProxy]
  }
  @scala.inline
  implicit class IServerProxyOps[Self <: IServerProxy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterRequest(value: (/* request */ js.UndefOr[IRequest], /* success */ js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRequest")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withApi(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api")(js.undefined)
        ret
    }
    @scala.inline
    def withBuildRequest(value: /* operation */ js.UndefOr[IOperation] => IRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildRequest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBuildRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withBuildUrl(value: /* request */ js.UndefOr[IRequest] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBuildUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheString")(js.undefined)
        ret
    }
    @scala.inline
    def withCreate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectionParam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectionParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionParam")(js.undefined)
        ret
    }
    @scala.inline
    def withDoRequest(
      value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doRequest")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutDoRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withEncodeFilters(value: /* filters */ js.UndefOr[Array] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodeFilters")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEncodeFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodeFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withEncodeSorters(value: /* sorters */ js.UndefOr[Array] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodeSorters")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEncodeSorters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodeSorters")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraParams")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterParam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterParam")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupDirectionParam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupDirectionParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupDirectionParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupDirectionParam")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupParam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupParam")(js.undefined)
        ret
    }
    @scala.inline
    def withIdParam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idParam")(js.undefined)
        ret
    }
    @scala.inline
    def withLimitParam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimitParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitParam")(js.undefined)
        ret
    }
    @scala.inline
    def withNoCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCache")(js.undefined)
        ret
    }
    @scala.inline
    def withPageParam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageParam")(js.undefined)
        ret
    }
    @scala.inline
    def withRead(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.undefined)
        ret
    }
    @scala.inline
    def withSetExtraParam(value: (/* name */ js.UndefOr[String], /* value */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setExtraParam")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetExtraParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setExtraParam")(js.undefined)
        ret
    }
    @scala.inline
    def withSimpleGroupMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleGroupMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimpleGroupMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleGroupMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSimpleSortMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleSortMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimpleSortMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleSortMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSortParam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortParam")(js.undefined)
        ret
    }
    @scala.inline
    def withStartParam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startParam")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

