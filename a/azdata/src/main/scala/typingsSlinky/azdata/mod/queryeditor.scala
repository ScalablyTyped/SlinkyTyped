package typingsSlinky.azdata.mod

import typingsSlinky.azdata.mod.connection.ConnectionProfile
import typingsSlinky.azdata.mod.window.DialogTab
import typingsSlinky.std.Map
import typingsSlinky.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryeditor {
  
  @JSImport("azdata", "queryeditor.connect")
  @js.native
  def connect(fileUri: String, connectionId: String): Thenable[Unit] = js.native
  
  @JSImport("azdata", "queryeditor.getQueryDocument")
  @js.native
  def getQueryDocument(fileUri: String): Thenable[QueryDocument] = js.native
  
  @JSImport("azdata", "queryeditor.registerQueryEventListener")
  @js.native
  def registerQueryEventListener(listener: QueryEventListener): Unit = js.native
  
  @JSImport("azdata", "queryeditor.runQuery")
  @js.native
  def runQuery(fileUri: String): Unit = js.native
  @JSImport("azdata", "queryeditor.runQuery")
  @js.native
  def runQuery(fileUri: String, options: js.UndefOr[scala.Nothing], runCurrentQuery: Boolean): Unit = js.native
  @JSImport("azdata", "queryeditor.runQuery")
  @js.native
  def runQuery(fileUri: String, options: Map[String, String]): Unit = js.native
  @JSImport("azdata", "queryeditor.runQuery")
  @js.native
  def runQuery(fileUri: String, options: Map[String, String], runCurrentQuery: Boolean): Unit = js.native
  
  @js.native
  trait QueryDocument extends StObject {
    
    // connect the query document using the given connection profile
    def connect(connectionProfile: ConnectionProfile): Thenable[Unit] = js.native
    
    // tab content is build using the modelview UI builder APIs
    // probably should rename DialogTab class since it is useful outside dialogs
    def createQueryTab(tab: DialogTab): Unit = js.native
    
    var providerId: String = js.native
    
    // set the document's execution options
    def setExecutionOptions(options: Map[String, _]): Thenable[Unit] = js.native
    
    var uri: String = js.native
  }
  object QueryDocument {
    
    @scala.inline
    def apply(
      connect: ConnectionProfile => Thenable[Unit],
      createQueryTab: DialogTab => Unit,
      providerId: String,
      setExecutionOptions: Map[String, _] => Thenable[Unit],
      uri: String
    ): QueryDocument = {
      val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), createQueryTab = js.Any.fromFunction1(createQueryTab), providerId = providerId.asInstanceOf[js.Any], setExecutionOptions = js.Any.fromFunction1(setExecutionOptions), uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryDocument]
    }
    
    @scala.inline
    implicit class QueryDocumentMutableBuilder[Self <: QueryDocument] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnect(value: ConnectionProfile => Thenable[Unit]): Self = StObject.set(x, "connect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateQueryTab(value: DialogTab => Unit): Self = StObject.set(x, "createQueryTab", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetExecutionOptions(value: Map[String, _] => Thenable[Unit]): Self = StObject.set(x, "setExecutionOptions", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait QueryEventListener extends StObject {
    
    def onQueryEvent(`type`: QueryEventType, document: QueryDocument): Unit = js.native
    def onQueryEvent(`type`: QueryEventType, document: QueryDocument, args: String): Unit = js.native
    def onQueryEvent(`type`: QueryEventType, document: QueryDocument, args: ResultSetSummary): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.azdata.azdataStrings.queryStart
    - typingsSlinky.azdata.azdataStrings.queryUpdate
    - typingsSlinky.azdata.azdataStrings.queryStop
    - typingsSlinky.azdata.azdataStrings.executionPlan
    - typingsSlinky.azdata.azdataStrings.visualize
  */
  trait QueryEventType extends StObject
  object QueryEventType {
    
    @scala.inline
    def executionPlan: typingsSlinky.azdata.azdataStrings.executionPlan = "executionPlan".asInstanceOf[typingsSlinky.azdata.azdataStrings.executionPlan]
    
    @scala.inline
    def queryStart: typingsSlinky.azdata.azdataStrings.queryStart = "queryStart".asInstanceOf[typingsSlinky.azdata.azdataStrings.queryStart]
    
    @scala.inline
    def queryStop: typingsSlinky.azdata.azdataStrings.queryStop = "queryStop".asInstanceOf[typingsSlinky.azdata.azdataStrings.queryStop]
    
    @scala.inline
    def queryUpdate: typingsSlinky.azdata.azdataStrings.queryUpdate = "queryUpdate".asInstanceOf[typingsSlinky.azdata.azdataStrings.queryUpdate]
    
    @scala.inline
    def visualize: typingsSlinky.azdata.azdataStrings.visualize = "visualize".asInstanceOf[typingsSlinky.azdata.azdataStrings.visualize]
  }
}
