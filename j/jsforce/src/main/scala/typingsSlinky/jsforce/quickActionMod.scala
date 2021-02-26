package typingsSlinky.jsforce

import typingsSlinky.jsforce.connectionMod.Callback
import typingsSlinky.jsforce.recordMod.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object quickActionMod {
  
  @JSImport("jsforce/quick-action", "QuickAction")
  @js.native
  class QuickAction () extends StObject {
    
    /** Retrieve default field values in the action */
    def defaultValues(): js.Promise[Record[_]] = js.native
    def defaultValues(callback: Callback[Record[_]]): js.Promise[Record[_]] = js.native
    /**
      * Retrieve default field values in the action for the given record
      * @param contextId Id of record
      * @param callback Callback function
      */
    def defaultValues(contextId: String): js.Promise[Record[_]] = js.native
    def defaultValues(contextId: String, callback: Callback[Record[_]]): js.Promise[Record[_]] = js.native
    
    /**
      * Describe the action's information (including layout, etc.)
      * @param callback Callback function
      */
    def describe(): js.Promise[QuickActionDescribeInfo] = js.native
    def describe(callback: Callback[QuickActionDescribeInfo]): js.Promise[QuickActionDescribeInfo] = js.native
    
    /**
      * Execute the action for given context id and record information
      * @param contextId Context record ID of the action
      * @param record Input record information for the action
      * @param callback Callback function
      */
    def execute[T](contextId: String, record: Record[T]): js.Promise[QuickActionResult] = js.native
    def execute[T](contextId: String, record: Record[T], callback: Callback[QuickActionResult]): js.Promise[QuickActionResult] = js.native
  }
  
  @js.native
  trait QuickActionDescribeInfo extends StObject {
    
    /** Object type used for the action */
    var contextSobjectType: String = js.native
    
    /** Layout sections that comprise an action */
    var layout: js.Object = js.native
    
    /** Field name in the target object which refers parent(context) object record ID */
    var targetParentField: String = js.native
    
    /** Record type of the targeted record */
    var targetRecordTypeId: String = js.native
    
    /** Object type of the action to target */
    var targetSobjectType: String = js.native
  }
  object QuickActionDescribeInfo {
    
    @scala.inline
    def apply(
      contextSobjectType: String,
      layout: js.Object,
      targetParentField: String,
      targetRecordTypeId: String,
      targetSobjectType: String
    ): QuickActionDescribeInfo = {
      val __obj = js.Dynamic.literal(contextSobjectType = contextSobjectType.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], targetParentField = targetParentField.asInstanceOf[js.Any], targetRecordTypeId = targetRecordTypeId.asInstanceOf[js.Any], targetSobjectType = targetSobjectType.asInstanceOf[js.Any])
      __obj.asInstanceOf[QuickActionDescribeInfo]
    }
    
    @scala.inline
    implicit class QuickActionDescribeInfoMutableBuilder[Self <: QuickActionDescribeInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContextSobjectType(value: String): Self = StObject.set(x, "contextSobjectType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayout(value: js.Object): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetParentField(value: String): Self = StObject.set(x, "targetParentField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetRecordTypeId(value: String): Self = StObject.set(x, "targetRecordTypeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetSobjectType(value: String): Self = StObject.set(x, "targetSobjectType", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait QuickActionInfo extends StObject {
    
    /** Label of the action */
    var label: String = js.native
    
    /** Name of the action */
    var name: String = js.native
    
    /** Type of the action (e.g. Create, Update, Post, LogACall) */
    var `type`: String = js.native
    
    /** Endpoint URL information of the action */
    var urls: js.Object = js.native
  }
  object QuickActionInfo {
    
    @scala.inline
    def apply(label: String, name: String, `type`: String, urls: js.Object): QuickActionInfo = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[QuickActionInfo]
    }
    
    @scala.inline
    implicit class QuickActionInfoMutableBuilder[Self <: QuickActionInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrls(value: js.Object): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    }
  }
  
  type QuickActionResult = js.Object
}
