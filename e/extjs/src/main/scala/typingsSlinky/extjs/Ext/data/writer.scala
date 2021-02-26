package typingsSlinky.extjs.Ext.data

import typingsSlinky.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object writer {
  
  @js.native
  trait IJson
    extends typingsSlinky.extjs.Ext.data.writer.IWriter {
    
    /** [Config Option] (Boolean) */
    var allowSingle: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Boolean) */
    var encode: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Boolean) */
    var expandData: js.UndefOr[Boolean] = js.native
    
    /** [Method] The Reader classes support dot delimited data mappings for extracting nested raw data into fields so the writer must
      * @param data Object
      */
    var getExpandedData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Config Option] (String) */
    var root: js.UndefOr[String] = js.native
  }
  object IJson {
    
    @scala.inline
    def apply(): IJson = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IJson]
    }
    
    @scala.inline
    implicit class IJsonMutableBuilder[Self <: IJson] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowSingle(value: Boolean): Self = StObject.set(x, "allowSingle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowSingleUndefined: Self = StObject.set(x, "allowSingle", js.undefined)
      
      @scala.inline
      def setEncode(value: Boolean): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
      
      @scala.inline
      def setExpandData(value: Boolean): Self = StObject.set(x, "expandData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandDataUndefined: Self = StObject.set(x, "expandData", js.undefined)
      
      @scala.inline
      def setGetExpandedData(value: /* data */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "getExpandedData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetExpandedDataUndefined: Self = StObject.set(x, "getExpandedData", js.undefined)
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
  
  @js.native
  trait IWriter extends IBase {
    
    /** [Config Option] (String) */
    var dateFormat: js.UndefOr[String] = js.native
    
    /** [Method] Formats the data for each record before sending it to the server
      * @param record Ext.data.Model The record that we are writing to the server.
      * @param operation Ext.data.Operation An operation object.
      * @returns Object An object literal of name/value keys to be written to the server. By default this method returns the data property on the record.
      */
    var getRecordData: js.UndefOr[
        js.Function2[/* record */ js.UndefOr[IModel], /* operation */ js.UndefOr[IOperation], _]
      ] = js.native
    
    /** [Config Option] (String) */
    var nameProperty: js.UndefOr[String] = js.native
    
    /** [Method] Prepares a Proxy s Ext data Request object
      * @param request Ext.data.Request The request object
      * @returns Ext.data.Request The modified request object
      */
    var write: js.UndefOr[js.Function1[/* request */ js.UndefOr[IRequest], IRequest]] = js.native
    
    /** [Config Option] (Boolean) */
    var writeAllFields: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (Boolean) */
    var writeRecordId: js.UndefOr[Boolean] = js.native
  }
  object IWriter {
    
    @scala.inline
    def apply(): typingsSlinky.extjs.Ext.data.writer.IWriter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.extjs.Ext.data.writer.IWriter]
    }
    
    @scala.inline
    implicit class IWriterMutableBuilder[Self <: typingsSlinky.extjs.Ext.data.writer.IWriter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
      
      @scala.inline
      def setGetRecordData(value: (/* record */ js.UndefOr[IModel], /* operation */ js.UndefOr[IOperation]) => _): Self = StObject.set(x, "getRecordData", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetRecordDataUndefined: Self = StObject.set(x, "getRecordData", js.undefined)
      
      @scala.inline
      def setNameProperty(value: String): Self = StObject.set(x, "nameProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePropertyUndefined: Self = StObject.set(x, "nameProperty", js.undefined)
      
      @scala.inline
      def setWrite(value: /* request */ js.UndefOr[IRequest] => IRequest): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWriteAllFields(value: Boolean): Self = StObject.set(x, "writeAllFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteAllFieldsUndefined: Self = StObject.set(x, "writeAllFields", js.undefined)
      
      @scala.inline
      def setWriteRecordId(value: Boolean): Self = StObject.set(x, "writeRecordId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteRecordIdUndefined: Self = StObject.set(x, "writeRecordId", js.undefined)
      
      @scala.inline
      def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
    }
  }
  
  @js.native
  trait IXml
    extends typingsSlinky.extjs.Ext.data.writer.IWriter {
    
    /** [Config Option] (String) */
    var defaultDocumentRoot: js.UndefOr[String] = js.native
    
    /** [Config Option] (String) */
    var documentRoot: js.UndefOr[String] = js.native
    
    /** [Config Option] (String) */
    var header: js.UndefOr[String] = js.native
    
    /** [Config Option] (String) */
    var record: js.UndefOr[String] = js.native
  }
  object IXml {
    
    @scala.inline
    def apply(): IXml = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IXml]
    }
    
    @scala.inline
    implicit class IXmlMutableBuilder[Self <: IXml] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultDocumentRoot(value: String): Self = StObject.set(x, "defaultDocumentRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultDocumentRootUndefined: Self = StObject.set(x, "defaultDocumentRoot", js.undefined)
      
      @scala.inline
      def setDocumentRoot(value: String): Self = StObject.set(x, "documentRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentRootUndefined: Self = StObject.set(x, "documentRoot", js.undefined)
      
      @scala.inline
      def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setRecord(value: String): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordUndefined: Self = StObject.set(x, "record", js.undefined)
    }
  }
}
