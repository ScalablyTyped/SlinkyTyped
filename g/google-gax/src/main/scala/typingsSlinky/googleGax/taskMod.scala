package typingsSlinky.googleGax

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleGax.apitypesMod.APICallback
import typingsSlinky.googleGax.apitypesMod.GRPCCallResult
import typingsSlinky.googleGax.apitypesMod.RequestType
import typingsSlinky.googleGax.apitypesMod.SimpleCallbackFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskMod {
  
  @JSImport("google-gax/build/src/bundlingCalls/task", "Task")
  @js.native
  class Task protected () extends StObject {
    /**
      * A task coordinates the execution of a single bundle.
      *
      * @param {function} apiCall - The function to conduct calling API.
      * @param {Object} bundlingRequest - The base request object to be used
      *   for the actual API call.
      * @param {string} bundledField - The name of the field in bundlingRequest
      *   to be bundled.
      * @param {string=} subresponseField - The name of the field in the response
      *   to be passed to the callback.
      * @constructor
      * @private
      */
    def this(apiCall: SimpleCallbackFunction, bundlingRequest: js.Object, bundledField: String) = this()
    def this(
      apiCall: SimpleCallbackFunction,
      bundlingRequest: js.Object,
      bundledField: String,
      subresponseField: String
    ) = this()
    
    def _apiCall(request: RequestType, callback: APICallback): GRPCCallResult = js.native
    @JSName("_apiCall")
    var _apiCall_Original: SimpleCallbackFunction = js.native
    
    var _bundledField: String = js.native
    
    var _data: js.Array[TaskData] = js.native
    
    var _request: StringDictionary[js.Array[js.Object]] = js.native
    
    var _subresponseField: js.UndefOr[String | Null] = js.native
    
    var callCanceller: js.UndefOr[GRPCCallResult] = js.native
    
    /**
      * Cancels a part of elements.
      * @param {string} id - The identifier of the part of elements.
      * @return {boolean} Whether the entire task will be canceled or not.
      */
    def cancel(id: String): Boolean = js.native
    
    /**
      * Appends the list of elements into the task.
      * @param {Object[]} elements - the new list of elements.
      * @param {number} bytes - the byte size required to encode elements in the API.
      * @param {APICallback} callback - the callback of the method call.
      */
    def extend(elements: js.Array[js.Object], bytes: Double, callback: TaskCallback): Unit = js.native
    
    /**
      * Returns the number of elements in a task.
      * @return {number} The number of elements.
      */
    def getElementCount(): Double = js.native
    
    /**
      * Returns the total byte size of the elements in a task.
      * @return {number} The byte size.
      */
    def getRequestByteSize(): Double = js.native
    
    /**
      * Invokes the actual API call with current elements.
      * @return {string[]} - the list of ids for invocations to be run.
      */
    def run(): js.Array[String] = js.native
  }
  
  @JSImport("google-gax/build/src/bundlingCalls/task", "deepCopyForResponse")
  @js.native
  def deepCopyForResponse(obj: js.Any): js.Any = js.native
  @JSImport("google-gax/build/src/bundlingCalls/task", "deepCopyForResponse")
  @js.native
  def deepCopyForResponse(obj: js.Any, subresponseInfo: SubResponseInfo): js.Any = js.native
  
  @js.native
  trait SubResponseInfo extends StObject {
    
    var end: js.UndefOr[Double] = js.native
    
    var field: String = js.native
    
    var start: js.UndefOr[Double] = js.native
  }
  object SubResponseInfo {
    
    @scala.inline
    def apply(field: String): SubResponseInfo = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubResponseInfo]
    }
    
    @scala.inline
    implicit class SubResponseInfoMutableBuilder[Self <: SubResponseInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  @js.native
  trait TaskCallback extends APICallback {
    
    var id: js.UndefOr[String] = js.native
  }
  
  @js.native
  trait TaskData extends StObject {
    
    var bytes: Double = js.native
    
    var callback: TaskCallback = js.native
    
    var cancelled: js.UndefOr[Boolean] = js.native
    
    var elements: js.Array[js.Object] = js.native
  }
  object TaskData {
    
    @scala.inline
    def apply(bytes: Double, callback: TaskCallback, elements: js.Array[js.Object]): TaskData = {
      val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], callback = callback.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskData]
    }
    
    @scala.inline
    implicit class TaskDataMutableBuilder[Self <: TaskData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBytes(value: Double): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallback(value: TaskCallback): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelled(value: Boolean): Self = StObject.set(x, "cancelled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelledUndefined: Self = StObject.set(x, "cancelled", js.undefined)
      
      @scala.inline
      def setElements(value: js.Array[js.Object]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementsVarargs(value: js.Object*): Self = StObject.set(x, "elements", js.Array(value :_*))
    }
  }
}
