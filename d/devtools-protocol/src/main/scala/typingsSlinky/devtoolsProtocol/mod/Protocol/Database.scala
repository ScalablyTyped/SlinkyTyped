package typingsSlinky.devtoolsProtocol.mod.Protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Database {
  
  @js.native
  trait AddDatabaseEvent extends StObject {
    
    var database: typingsSlinky.devtoolsProtocol.mod.Protocol.Database.Database = js.native
  }
  object AddDatabaseEvent {
    
    @scala.inline
    def apply(database: typingsSlinky.devtoolsProtocol.mod.Protocol.Database.Database): AddDatabaseEvent = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddDatabaseEvent]
    }
    
    @scala.inline
    implicit class AddDatabaseEventMutableBuilder[Self <: AddDatabaseEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDatabase(value: typingsSlinky.devtoolsProtocol.mod.Protocol.Database.Database): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Database extends StObject {
    
    /**
      * Database domain.
      */
    var domain: String = js.native
    
    /**
      * Database ID.
      */
    var id: DatabaseId = js.native
    
    /**
      * Database name.
      */
    var name: String = js.native
    
    /**
      * Database version.
      */
    var version: String = js.native
  }
  object Database {
    
    @scala.inline
    def apply(domain: String, id: DatabaseId, name: String, version: String): typingsSlinky.devtoolsProtocol.mod.Protocol.Database.Database = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.devtoolsProtocol.mod.Protocol.Database.Database]
    }
    
    @scala.inline
    implicit class DatabaseMutableBuilder[Self <: typingsSlinky.devtoolsProtocol.mod.Protocol.Database.Database] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: DatabaseId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type DatabaseId = String
  
  @js.native
  trait Error extends StObject {
    
    /**
      * Error code.
      */
    var code: integer = js.native
    
    /**
      * Error message.
      */
    var message: String = js.native
  }
  object Error {
    
    @scala.inline
    def apply(code: integer, message: String): Error = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: integer): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ExecuteSQLRequest extends StObject {
    
    var databaseId: DatabaseId = js.native
    
    var query: String = js.native
  }
  object ExecuteSQLRequest {
    
    @scala.inline
    def apply(databaseId: DatabaseId, query: String): ExecuteSQLRequest = {
      val __obj = js.Dynamic.literal(databaseId = databaseId.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecuteSQLRequest]
    }
    
    @scala.inline
    implicit class ExecuteSQLRequestMutableBuilder[Self <: ExecuteSQLRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDatabaseId(value: DatabaseId): Self = StObject.set(x, "databaseId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ExecuteSQLResponse extends StObject {
    
    var columnNames: js.UndefOr[js.Array[String]] = js.native
    
    var sqlError: js.UndefOr[Error] = js.native
    
    var values: js.UndefOr[js.Array[_]] = js.native
  }
  object ExecuteSQLResponse {
    
    @scala.inline
    def apply(): ExecuteSQLResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExecuteSQLResponse]
    }
    
    @scala.inline
    implicit class ExecuteSQLResponseMutableBuilder[Self <: ExecuteSQLResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnNames(value: js.Array[String]): Self = StObject.set(x, "columnNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnNamesUndefined: Self = StObject.set(x, "columnNames", js.undefined)
      
      @scala.inline
      def setColumnNamesVarargs(value: String*): Self = StObject.set(x, "columnNames", js.Array(value :_*))
      
      @scala.inline
      def setSqlError(value: Error): Self = StObject.set(x, "sqlError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSqlErrorUndefined: Self = StObject.set(x, "sqlError", js.undefined)
      
      @scala.inline
      def setValues(value: js.Array[_]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  @js.native
  trait GetDatabaseTableNamesRequest extends StObject {
    
    var databaseId: DatabaseId = js.native
  }
  object GetDatabaseTableNamesRequest {
    
    @scala.inline
    def apply(databaseId: DatabaseId): GetDatabaseTableNamesRequest = {
      val __obj = js.Dynamic.literal(databaseId = databaseId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDatabaseTableNamesRequest]
    }
    
    @scala.inline
    implicit class GetDatabaseTableNamesRequestMutableBuilder[Self <: GetDatabaseTableNamesRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDatabaseId(value: DatabaseId): Self = StObject.set(x, "databaseId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetDatabaseTableNamesResponse extends StObject {
    
    var tableNames: js.Array[String] = js.native
  }
  object GetDatabaseTableNamesResponse {
    
    @scala.inline
    def apply(tableNames: js.Array[String]): GetDatabaseTableNamesResponse = {
      val __obj = js.Dynamic.literal(tableNames = tableNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDatabaseTableNamesResponse]
    }
    
    @scala.inline
    implicit class GetDatabaseTableNamesResponseMutableBuilder[Self <: GetDatabaseTableNamesResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTableNames(value: js.Array[String]): Self = StObject.set(x, "tableNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableNamesVarargs(value: String*): Self = StObject.set(x, "tableNames", js.Array(value :_*))
    }
  }
}
