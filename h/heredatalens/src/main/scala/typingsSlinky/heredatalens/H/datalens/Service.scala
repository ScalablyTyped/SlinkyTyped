package typingsSlinky.heredatalens.H.datalens

import typingsSlinky.heredatalens.H.datalens.QueryTileProvider.X
import typingsSlinky.heredatalens.H.datalens.QueryTileProvider.Y
import typingsSlinky.heredatalens.H.datalens.QueryTileProvider.Zoom
import typingsSlinky.heremaps.H.service.IConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HERE Maps API and Data Lens JavaScript API can be used to visualize data from different network sources.
  * For each network source type, a service class is required. The service also stores API connection credentials.
  * The service instance must be configured with a service.Platform instance.
  */
@js.native
trait Service extends IConfigurable {
  
  /**
    * This method fetches a layer of geometries (eg buildings or administrative boundaries).
    * @param layerName - The name of the layer
    * @param params - URL parameters (eg bounding box)
    * @param onResult - Callback called on a successful request with response data
    * @param onError - Callback called on an unsuccessful request with the Error object
    * @returns - Response Promise
    */
  def fetchLayer(layerName: String): js.Promise[_] = js.native
  def fetchLayer(
    layerName: String,
    params: js.UndefOr[scala.Nothing],
    onResult: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* error */ js.Any, Unit]
  ): js.Promise[_] = js.native
  def fetchLayer(
    layerName: String,
    params: js.UndefOr[scala.Nothing],
    onResult: js.Function1[/* result */ js.Any, Unit]
  ): js.Promise[_] = js.native
  def fetchLayer(
    layerName: String,
    params: js.UndefOr[scala.Nothing],
    onResult: js.Function1[/* result */ js.Any, Unit],
    onError: js.Function1[/* error */ js.Any, Unit]
  ): js.Promise[_] = js.native
  def fetchLayer(layerName: String, params: js.Any): js.Promise[_] = js.native
  def fetchLayer(
    layerName: String,
    params: js.Any,
    onResult: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* error */ js.Any, Unit]
  ): js.Promise[_] = js.native
  def fetchLayer(layerName: String, params: js.Any, onResult: js.Function1[/* result */ js.Any, Unit]): js.Promise[_] = js.native
  def fetchLayer(
    layerName: String,
    params: js.Any,
    onResult: js.Function1[/* result */ js.Any, Unit],
    onError: js.Function1[/* error */ js.Any, Unit]
  ): js.Promise[_] = js.native
  
  /**
    * This method fetches vector tile data from the layer.
    * @param x - Tile columns
    * @param y - Tile row
    * @param z - zoom level
    * @param params - URL parameters (eg bounding box)
    * @param onResult - Callback called on a successful request with response data
    * @param onError - Callback called on an unsuccessful request with the Error object
    * @returns - Typed array with tile data
    */
  def fetchLayerTile(layerName: String, x: X, y: Y, z: Zoom): js.Promise[js.typedarray.Uint8Array] = js.native
  def fetchLayerTile(
    layerName: String,
    x: X,
    y: Y,
    z: Zoom,
    params: js.UndefOr[scala.Nothing],
    onResult: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* error */ js.Any, Unit]
  ): js.Promise[js.typedarray.Uint8Array] = js.native
  def fetchLayerTile(
    layerName: String,
    x: X,
    y: Y,
    z: Zoom,
    params: js.UndefOr[scala.Nothing],
    onResult: js.Function1[/* result */ js.Any, Unit]
  ): js.Promise[js.typedarray.Uint8Array] = js.native
  def fetchLayerTile(
    layerName: String,
    x: X,
    y: Y,
    z: Zoom,
    params: js.UndefOr[scala.Nothing],
    onResult: js.Function1[/* result */ js.Any, Unit],
    onError: js.Function1[/* error */ js.Any, Unit]
  ): js.Promise[js.typedarray.Uint8Array] = js.native
  def fetchLayerTile(layerName: String, x: X, y: Y, z: Zoom, params: js.Any): js.Promise[js.typedarray.Uint8Array] = js.native
  def fetchLayerTile(
    layerName: String,
    x: X,
    y: Y,
    z: Zoom,
    params: js.Any,
    onResult: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* error */ js.Any, Unit]
  ): js.Promise[js.typedarray.Uint8Array] = js.native
  def fetchLayerTile(
    layerName: String,
    x: X,
    y: Y,
    z: Zoom,
    params: js.Any,
    onResult: js.Function1[/* result */ js.Any, Unit]
  ): js.Promise[js.typedarray.Uint8Array] = js.native
  def fetchLayerTile(
    layerName: String,
    x: X,
    y: Y,
    z: Zoom,
    params: js.Any,
    onResult: js.Function1[/* result */ js.Any, Unit],
    onError: js.Function1[/* error */ js.Any, Unit]
  ): js.Promise[js.typedarray.Uint8Array] = js.native
  
  /**
    * This method fetches query data for a given query ID.
    * This method can be used when implementing a custom provider.
    * Otherwise existing providers are used to get data from the Data Lens REST API.
    * @param queryId - The ID of the Data Lens REST API query
    * @param params - Query dynamic parameters
    * @param onResult - Callback called on a successful request with response data
    * @param onError - Callback called on an unsuccessful request with the Error object
    * @returns - Response Promise
    */
  def fetchQueryData(queryId: String): js.Promise[_] = js.native
  def fetchQueryData(
    queryId: String,
    params: js.UndefOr[scala.Nothing],
    onResult: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* error */ js.Any, Unit]
  ): js.Promise[_] = js.native
  def fetchQueryData(
    queryId: String,
    params: js.UndefOr[scala.Nothing],
    onResult: js.Function1[/* result */ js.Any, Unit]
  ): js.Promise[_] = js.native
  def fetchQueryData(
    queryId: String,
    params: js.UndefOr[scala.Nothing],
    onResult: js.Function1[/* result */ js.Any, Unit],
    onError: js.Function1[/* error */ js.Any, Unit]
  ): js.Promise[_] = js.native
  def fetchQueryData(queryId: String, params: js.Any): js.Promise[_] = js.native
  def fetchQueryData(
    queryId: String,
    params: js.Any,
    onResult: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* error */ js.Any, Unit]
  ): js.Promise[_] = js.native
  def fetchQueryData(queryId: String, params: js.Any, onResult: js.Function1[/* result */ js.Any, Unit]): js.Promise[_] = js.native
  def fetchQueryData(
    queryId: String,
    params: js.Any,
    onResult: js.Function1[/* result */ js.Any, Unit],
    onError: js.Function1[/* error */ js.Any, Unit]
  ): js.Promise[_] = js.native
  
  /**
    * This method fetches statistical data for the Data Lens query (eg minimum and maximum values for the query metric).
    * It can be used to define visualization boundaries, scales and legends.
    * @param queryId - The ID of the Data Lens REST API query
    * @param statsQuery - A JSON object which defines a statistics query for the Data Lens query
    * @param onResult - Callback called on a successful request with response data
    * @param onError - Callback called on an unsuccessful request with the Error object
    * @returns - Response Promise
    */
  def fetchQueryStats(queryId: String, statsQuery: js.Any): js.Promise[_] = js.native
  def fetchQueryStats(
    queryId: String,
    statsQuery: js.Any,
    onResult: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* error */ js.Any, Unit]
  ): js.Promise[_] = js.native
  def fetchQueryStats(queryId: String, statsQuery: js.Any, onResult: js.Function1[/* result */ js.Any, Unit]): js.Promise[_] = js.native
  def fetchQueryStats(
    queryId: String,
    statsQuery: js.Any,
    onResult: js.Function1[/* result */ js.Any, Unit],
    onError: js.Function1[/* error */ js.Any, Unit]
  ): js.Promise[_] = js.native
  
  /**
    * This method makes an HTTP request to the Data Lens REST API.
    * It makes any CRUD request (GET, PUT, POST, DELETE).
    * This method can be used when implementing a custom provider or implementing data management.
    * Otherwise existing providers are used to get data from the Data Lens REST API.
    * @param method - Any HTTP method (GET, PUT, POST, etc.)
    * @param endpoint - The REST API endpoint
    * @param params - URL parameters
    * @param body - The payload of the request
    * @param onResult - Callback called on a successful request with response data
    * @param onError - Callback called on an unsuccessful request with the Error object
    * @returns - Response Promise
    */
  def request(method: String, endpoint: String): js.Promise[_] = js.native
  def request(
    method: String,
    endpoint: String,
    params: js.UndefOr[scala.Nothing],
    body: js.UndefOr[scala.Nothing],
    onResult: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* error */ js.Any, Unit]
  ): js.Promise[_] = js.native
  def request(
    method: String,
    endpoint: String,
    params: js.UndefOr[scala.Nothing],
    body: js.UndefOr[scala.Nothing],
    onResult: js.Function1[/* result */ js.Any, Unit]
  ): js.Promise[_] = js.native
  def request(
    method: String,
    endpoint: String,
    params: js.UndefOr[scala.Nothing],
    body: js.UndefOr[scala.Nothing],
    onResult: js.Function1[/* result */ js.Any, Unit],
    onError: js.Function1[/* error */ js.Any, Unit]
  ): js.Promise[_] = js.native
  def request(method: String, endpoint: String, params: js.UndefOr[scala.Nothing], body: js.Any): js.Promise[_] = js.native
  def request(
    method: String,
    endpoint: String,
    params: js.UndefOr[scala.Nothing],
    body: js.Any,
    onResult: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* error */ js.Any, Unit]
  ): js.Promise[_] = js.native
  def request(
    method: String,
    endpoint: String,
    params: js.UndefOr[scala.Nothing],
    body: js.Any,
    onResult: js.Function1[/* result */ js.Any, Unit]
  ): js.Promise[_] = js.native
  def request(
    method: String,
    endpoint: String,
    params: js.UndefOr[scala.Nothing],
    body: js.Any,
    onResult: js.Function1[/* result */ js.Any, Unit],
    onError: js.Function1[/* error */ js.Any, Unit]
  ): js.Promise[_] = js.native
  def request(method: String, endpoint: String, params: js.Any): js.Promise[_] = js.native
  def request(
    method: String,
    endpoint: String,
    params: js.Any,
    body: js.UndefOr[scala.Nothing],
    onResult: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* error */ js.Any, Unit]
  ): js.Promise[_] = js.native
  def request(
    method: String,
    endpoint: String,
    params: js.Any,
    body: js.UndefOr[scala.Nothing],
    onResult: js.Function1[/* result */ js.Any, Unit]
  ): js.Promise[_] = js.native
  def request(
    method: String,
    endpoint: String,
    params: js.Any,
    body: js.UndefOr[scala.Nothing],
    onResult: js.Function1[/* result */ js.Any, Unit],
    onError: js.Function1[/* error */ js.Any, Unit]
  ): js.Promise[_] = js.native
  def request(method: String, endpoint: String, params: js.Any, body: js.Any): js.Promise[_] = js.native
  def request(
    method: String,
    endpoint: String,
    params: js.Any,
    body: js.Any,
    onResult: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* error */ js.Any, Unit]
  ): js.Promise[_] = js.native
  def request(
    method: String,
    endpoint: String,
    params: js.Any,
    body: js.Any,
    onResult: js.Function1[/* result */ js.Any, Unit]
  ): js.Promise[_] = js.native
  def request(
    method: String,
    endpoint: String,
    params: js.Any,
    body: js.Any,
    onResult: js.Function1[/* result */ js.Any, Unit],
    onError: js.Function1[/* error */ js.Any, Unit]
  ): js.Promise[_] = js.native
  
  /**
    * Sets the access and refresh tokens used to authenticate all requests against the Data Lens REST API.
    * Use this method to implement custom authentication to the Data Lens REST API.
    * @param accessToken - The token used to authenticate all requests
    * @param refreshToken - The token used to fetch a new access token after the previous access token has expired.
    * When refreshToken is provided, Service will automatically update the expired accessToken.
    */
  def setTokens(accessToken: String, refreshToken: String): Unit = js.native
}
object Service {
  
  /**
    * The format of Data Lens query data.
    * The Data Lens query data has a table-like structure with named columns and rows.
    */
  @js.native
  trait Data extends StObject {
    
    /** Column names */
    var columns: js.Array[String] = js.native
    
    /** Rows of data */
    var rows: js.Array[js.Array[_]] = js.native
  }
  object Data {
    
    @scala.inline
    def apply(columns: js.Array[String], rows: js.Array[js.Array[_]]): Data = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumns(value: js.Array[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setRows(value: js.Array[js.Array[_]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "rows", js.Array(value :_*))
    }
  }
  
  /**
    * Overrides the Service configuration
    * Normally the Service instance is configured with the service.Platform instance.
    * This configuration can be overridden by specifying these options.
    * It can be useful when the Data Lens environment is different from the HERE Platform environment.
    */
  @js.native
  trait Options extends StObject {
    
    /** The token used to authenticate all requests */
    var access_token: js.UndefOr[String] = js.native
    
    /** Defines an alternative host for the Data Lens REST API URL */
    var baseUrl: js.UndefOr[String] = js.native
    
    /**
      * To increase the number of simultaneous requests to the Data Lens REST API, domain sharding is used.
      * This option can be used when the Data Lens environment does not support domain sharding.
      */
    var domainSharding: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * The token used to fetch a new access token after the previous access token has expired.
      * When refresh_token is provided, Service will automatically update the expired access_token.
      */
    var refresh_token: js.UndefOr[String] = js.native
    
    /** Subdomain of the Data Lens REST API URL */
    var subDomain: js.UndefOr[String] = js.native
    
    /** Pathname prefix of the Data Lens REST API endpoints */
    var version: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      @scala.inline
      def setDomainSharding(value: js.Array[String]): Self = StObject.set(x, "domainSharding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainShardingUndefined: Self = StObject.set(x, "domainSharding", js.undefined)
      
      @scala.inline
      def setDomainShardingVarargs(value: String*): Self = StObject.set(x, "domainSharding", js.Array(value :_*))
      
      @scala.inline
      def setRefresh_token(value: String): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefresh_tokenUndefined: Self = StObject.set(x, "refresh_token", js.undefined)
      
      @scala.inline
      def setSubDomain(value: String): Self = StObject.set(x, "subDomain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubDomainUndefined: Self = StObject.set(x, "subDomain", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
