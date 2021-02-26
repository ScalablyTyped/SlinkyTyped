package typingsSlinky.openui5.sap.ui.model

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object json {
  
  @js.native
  trait JSONModel extends ClientModel {
    
    /**
      * Serializes the current JSON data of the model into a string.Note: May not work in Internet Explorer
      * 8 because of lacking JSON support (works only if IE 8 mode is enabled)
      * @returns sJSON the JSON data serialized as string
      */
    def getJSON(): String = js.native
    
    /**
      * Load JSON-encoded data from the server using a GET HTTP request and store the resulting JSON data in
      * the model.Note: Due to browser security restrictions, most "Ajax" requests are subject to the same
      * origin policy,the request can not successfully retrieve data from a different domain, subdomain, or
      * protocol.
      * @param sURL A string containing the URL to which the request is sent.
      * @param oParameters A map or string that is sent to the server with the request.Data that is sent to
      * the server is appended to the URL as a query string.If the value of the data parameter is an object
      * (map), it is converted to a string andurl-encoded before it is appended to the URL.
      * @param bAsync By default, all requests are sent asynchronous(i.e. this is set to true by default).
      * If you need synchronous requests, set this option to false.Cross-domain requests do not support
      * synchronous operation. Note that synchronous requests maytemporarily lock the browser, disabling any
      * actions while the request is active.
      * @param sType The type of request to make ("POST" or "GET"), default is "GET".Note: Other HTTP
      * request methods, such as PUT and DELETE, can also be used here, butthey are not supported by all
      * browsers.
      * @param bMerge whether the data should be merged instead of replaced
      * @param bCache force no caching if false. Default is false
      * @param mHeaders An object of additional header key/value pairs to send along with the request
      */
    def loadData(
      sURL: String,
      oParameters: js.UndefOr[js.Any | String],
      bAsync: js.UndefOr[Boolean],
      sType: js.UndefOr[String],
      bMerge: js.UndefOr[Boolean],
      bCache: js.UndefOr[String],
      mHeaders: js.UndefOr[js.Any]
    ): Unit = js.native
    
    /**
      * Sets the JSON encoded data to the model.
      * @param oData the data to set on the model
      * @param bMerge whether to merge the data instead of replacing it
      */
    def setData(oData: js.Any): Unit = js.native
    def setData(oData: js.Any, bMerge: Boolean): Unit = js.native
    
    /**
      * Sets the JSON encoded string data to the model.
      * @param sJSONText the string data to set on the model
      * @param bMerge whether to merge the data instead of replacing it
      */
    def setJSON(sJSONText: String): Unit = js.native
    def setJSON(sJSONText: String, bMerge: Boolean): Unit = js.native
    
    /**
      * Sets a new value for the given property <code>sPropertyName</code> in the model.If the model value
      * changed all interested parties are informed.
      * @param sPath path of the property to set
      * @param oValue value to set the property to
      * @param oContext the context which will be used to set the property
      * @param bAsyncUpdate whether to update other bindings dependent on this property asynchronously
      * @returns true if the value was set correctly and false if errors occurred like the entry was not
      * found.
      */
    def setProperty(sPath: String, oValue: js.Any): Boolean = js.native
    def setProperty(sPath: String, oValue: js.Any, oContext: js.UndefOr[scala.Nothing], bAsyncUpdate: Boolean): Boolean = js.native
    def setProperty(sPath: String, oValue: js.Any, oContext: js.Any): Boolean = js.native
    def setProperty(sPath: String, oValue: js.Any, oContext: js.Any, bAsyncUpdate: Boolean): Boolean = js.native
  }
}
