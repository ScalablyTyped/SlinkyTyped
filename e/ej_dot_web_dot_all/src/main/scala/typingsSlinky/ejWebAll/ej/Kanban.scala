package typingsSlinky.ejWebAll.ej

import typingsSlinky.ejWebAll.ej.Kanban.KanbanEdit
import typingsSlinky.ejWebAll.ej.Kanban.KanbanFilter
import typingsSlinky.ejWebAll.ej.Kanban.KanbanSelection
import typingsSlinky.ejWebAll.ej.Kanban.KanbanSwimlane
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Kanban extends Widget_ {
  
  var KanbanEdit: KanbanEdit = js.native
  
  var KanbanFilter: KanbanFilter = js.native
  
  var KanbanSelection: KanbanSelection = js.native
  
  var KanbanSwimlane: KanbanSwimlane = js.native
  
  def columns(columndetails: String, keyvalue: String): Unit = js.native
  def columns(columndetails: String, keyvalue: String, action: String): Unit = js.native
  def columns(columndetails: String, keyvalue: js.Array[_]): Unit = js.native
  def columns(columndetails: String, keyvalue: js.Array[_], action: String): Unit = js.native
  def columns(columndetails: js.Array[_], keyvalue: String): Unit = js.native
  def columns(columndetails: js.Array[_], keyvalue: String, action: String): Unit = js.native
  /** Add or remove columns in Kanban columns collections.Default action is add.
    * @param {any[]|string} Pass array of columns or string of headerText to add/remove the column in Kanban
    * @param {any[]|string} Pass array of columns or string of key value to add/remove the column in Kanban
    * @param {string} optional Pass add/remove action to be performed. By default "add" action will perform
    * @returns {void}
    */
  def columns(columndetails: js.Array[_], keyvalue: js.Array[_]): Unit = js.native
  def columns(columndetails: js.Array[_], keyvalue: js.Array[_], action: String): Unit = js.native
  
  /** Refresh the Kanban with new data source.
    * @param {any[]} Pass new data source to the Kanban
    * @returns {void}
    */
  def dataSource(datasource: js.Array[_]): Unit = js.native
  
  var defaults: Model = js.native
  
  /** Get the column details based on the given header text in Kanban.
    * @param {string} Pass the header text of the column to get the corresponding column object
    * @returns {string}
    */
  def getColumnByHeaderText(headerText: String): String = js.native
  
  /** Get the table details based on the given header table in Kanban.
    * @returns {string}
    */
  def getHeaderTable(): String = js.native
  
  /** Get the scroller object of Kanban.
    * @returns {ej.Scroller}
    */
  def getScrollObject(): Scroller = js.native
  
  /** Used for get the names of all the visible column name collections in Kanban.
    * @returns {any[]}
    */
  def getVisibleColumnNames(): js.Array[_] = js.native
  
  def hideColumns(headerText: String): Unit = js.native
  /** Hide columns from the Kanban based on the header text
    * @param {any[]|string} you can pass either array of header text of various columns or a header text of a column to hide
    * @returns {void}
    */
  def hideColumns(headerText: js.Array[_]): Unit = js.native
  
  @JSName("model")
  var model_Kanban: Model = js.native
  
  /** Print the Kanban Board
    * @returns {void}
    */
  def print(): Unit = js.native
  
  /** Refresh the Kanban contents.The template refreshment is based on the argument passed along with this method
    * @param {boolean} optional When templateRefresh is set true, template and Kanban contents both are refreshed in Kanban else only Kanban content is refreshed
    * @returns {void}
    */
  def refresh(): Unit = js.native
  def refresh(templateRefresh: Boolean): Unit = js.native
  
  /** Refresh the template of the Kanban
    * @returns {void}
    */
  def refreshTemplate(): Unit = js.native
  
  def showColumns(headerText: String): Unit = js.native
  /** Show columns in the Kanban based on the header text.
    * @param {any[]|string} You can pass either array of header text of various columns or a header text of a column to show
    * @returns {void}
    */
  def showColumns(headerText: js.Array[_]): Unit = js.native
  
  /** Expand or collapse the card based on the state of target &quot;div&quot;
    * @param {string|number} Pass the id of card to be toggle
    * @returns {void}
    */
  def toggleCard(key: String): Unit = js.native
  def toggleCard(key: Double): Unit = js.native
  
  /** toggleColumn based on the headerText in Kanban.
    * @param {any} Pass the header text of the column to get the corresponding column object
    * @returns {void}
    */
  def toggleColumn(headerText: js.Any): Unit = js.native
  
  /** Update a card in Kanban control based on key and JSON data given.
    * @param {string} Pass the key field Name of the column
    * @param {any[]} Pass the edited JSON data of card need to be update.
    * @returns {void}
    */
  def updateCard(key: String, data: js.Array[_]): Unit = js.native
}
object Kanban {
  
  @js.native
  sealed trait EditMode extends StObject
  @JSGlobal("ej.Kanban.EditMode")
  @js.native
  object EditMode extends StObject {
    
    ///Creates Kanban with editMode as Dialog
    @js.native
    sealed trait Dialog extends EditMode
    
    ///Creates Kanban with editMode as DialogTemplate
    @js.native
    sealed trait DialogTemplate extends EditMode
    
    ///Creates Kanban with editMode as ExternalForm
    @js.native
    sealed trait ExternalForm extends EditMode
    
    ///Creates Kanban with editMode as ExternalFormTemplate
    @js.native
    sealed trait ExternalFormTemplate extends EditMode
  }
  
  @js.native
  sealed trait EditingType extends StObject
  @JSGlobal("ej.Kanban.EditingType")
  @js.native
  object EditingType extends StObject {
    
    ///Allows to set edit type as date picker edit type
    @js.native
    sealed trait DatePicker extends EditingType
    
    ///Allows to set edit type as date time picker edit type
    @js.native
    sealed trait DateTimePicker extends EditingType
    
    ///Allows to set edit type as drop down edit type
    @js.native
    sealed trait Dropdown extends EditingType
    
    ///Allows to set edit type as numeric edit type
    @js.native
    sealed trait Numeric extends EditingType
    
    ///Allows to set edit type as RTE edit type
    @js.native
    sealed trait RTE extends EditingType
    
    ///Allows to set edit type as string edit type
    @js.native
    sealed trait String extends EditingType
    
    ///Allows to set edit type as text area edit type
    @js.native
    sealed trait TextArea extends EditingType
  }
  
  @js.native
  sealed trait FormPosition extends StObject
  @JSGlobal("ej.Kanban.FormPosition")
  @js.native
  object FormPosition extends StObject {
    
    ///Form position is bottom.
    @js.native
    sealed trait Bottom extends FormPosition
    
    ///Form position is right.
    @js.native
    sealed trait Right extends FormPosition
  }
  
  @js.native
  sealed trait SelectionType extends StObject
  @JSGlobal("ej.Kanban.SelectionType")
  @js.native
  object SelectionType extends StObject {
    
    ///Support for multiple selections in Kanban
    @js.native
    sealed trait Multiple extends SelectionType
    
    ///Support for Single selection in Kanban
    @js.native
    sealed trait Single extends SelectionType
  }
  
  @js.native
  sealed trait Target extends StObject
  @JSGlobal("ej.Kanban.Target")
  @js.native
  object Target extends StObject {
    
    ///Sets context menu to Kanban
    @js.native
    sealed trait All extends Target
    
    ///Sets context menu to Kanban card
    @js.native
    sealed trait Card extends Target
    
    ///Sets context menu to Kanban content
    @js.native
    sealed trait Content extends Target
    
    ///Sets context menu to Kanban header
    @js.native
    sealed trait Header extends Target
  }
  
  @js.native
  trait ActionBeginEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns current filtering object field name.
      */
    var currentFilteringobject: js.UndefOr[js.Any] = js.native
    
    /** Returns the card object (JSON).
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Returns filter details.
      */
    var filterCollection: js.UndefOr[js.Any] = js.native
    
    /** Returns the Kanban model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the current action event type.
      */
    var originalEventType: js.UndefOr[String] = js.native
    
    /** Returns primary key value.
      */
    var primaryKeyValue: js.UndefOr[String] = js.native
    
    /** Returns request type.
      */
    var requestType: js.UndefOr[String] = js.native
    
    /** Returns the edited row index.
      */
    var rowIndex: js.UndefOr[Double] = js.native
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ActionBeginEventArgs {
    
    @scala.inline
    def apply(): ActionBeginEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionBeginEventArgs]
    }
    
    @scala.inline
    implicit class ActionBeginEventArgsMutableBuilder[Self <: ActionBeginEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCurrentFilteringobject(value: js.Any): Self = StObject.set(x, "currentFilteringobject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentFilteringobjectUndefined: Self = StObject.set(x, "currentFilteringobject", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setFilterCollection(value: js.Any): Self = StObject.set(x, "filterCollection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterCollectionUndefined: Self = StObject.set(x, "filterCollection", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setOriginalEventType(value: String): Self = StObject.set(x, "originalEventType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalEventTypeUndefined: Self = StObject.set(x, "originalEventType", js.undefined)
      
      @scala.inline
      def setPrimaryKeyValue(value: String): Self = StObject.set(x, "primaryKeyValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryKeyValueUndefined: Self = StObject.set(x, "primaryKeyValue", js.undefined)
      
      @scala.inline
      def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
      
      @scala.inline
      def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ActionCompleteEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns current filtering column field name.
      */
    var currentFilteringColumn: js.UndefOr[String] = js.native
    
    /** Returns the card object (JSON).
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Returns filter details.
      */
    var filterCollection: js.UndefOr[js.Any] = js.native
    
    /** Returns the Kanban model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns current action event type.
      */
    var originalEventType: js.UndefOr[String] = js.native
    
    /** Returns primary key.
      */
    var primaryKey: js.UndefOr[String] = js.native
    
    /** Returns primary key value.
      */
    var primaryKeyValue: js.UndefOr[String] = js.native
    
    /** Returns request type.
      */
    var requestType: js.UndefOr[String] = js.native
    
    /** Returns the selectedRow index.
      */
    var selectedRow: js.UndefOr[Double] = js.native
    
    /** Returns Kanban element.
      */
    var target: js.UndefOr[js.Any] = js.native
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ActionCompleteEventArgs {
    
    @scala.inline
    def apply(): ActionCompleteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionCompleteEventArgs]
    }
    
    @scala.inline
    implicit class ActionCompleteEventArgsMutableBuilder[Self <: ActionCompleteEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCurrentFilteringColumn(value: String): Self = StObject.set(x, "currentFilteringColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentFilteringColumnUndefined: Self = StObject.set(x, "currentFilteringColumn", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setFilterCollection(value: js.Any): Self = StObject.set(x, "filterCollection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterCollectionUndefined: Self = StObject.set(x, "filterCollection", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setOriginalEventType(value: String): Self = StObject.set(x, "originalEventType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalEventTypeUndefined: Self = StObject.set(x, "originalEventType", js.undefined)
      
      @scala.inline
      def setPrimaryKey(value: String): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
      
      @scala.inline
      def setPrimaryKeyValue(value: String): Self = StObject.set(x, "primaryKeyValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryKeyValueUndefined: Self = StObject.set(x, "primaryKeyValue", js.undefined)
      
      @scala.inline
      def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
      
      @scala.inline
      def setSelectedRow(value: Double): Self = StObject.set(x, "selectedRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedRowUndefined: Self = StObject.set(x, "selectedRow", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ActionFailureEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns current filtering column field name.
      */
    var currentFilteringColumn: js.UndefOr[String] = js.native
    
    /** Returns the card object (JSON).
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Returns the error return by server.
      */
    var error: js.UndefOr[js.Any] = js.native
    
    /** Returns filter details.
      */
    var filterCollection: js.UndefOr[js.Any] = js.native
    
    /** Returns the Kanban model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns current action event type.
      */
    var originalEventType: js.UndefOr[String] = js.native
    
    /** Returns primary key value.
      */
    var primaryKeyValue: js.UndefOr[String] = js.native
    
    /** Returns request type.
      */
    var requestType: js.UndefOr[String] = js.native
    
    /** Returns Kanban element.
      */
    var target: js.UndefOr[js.Any] = js.native
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ActionFailureEventArgs {
    
    @scala.inline
    def apply(): ActionFailureEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionFailureEventArgs]
    }
    
    @scala.inline
    implicit class ActionFailureEventArgsMutableBuilder[Self <: ActionFailureEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCurrentFilteringColumn(value: String): Self = StObject.set(x, "currentFilteringColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentFilteringColumnUndefined: Self = StObject.set(x, "currentFilteringColumn", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setFilterCollection(value: js.Any): Self = StObject.set(x, "filterCollection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterCollectionUndefined: Self = StObject.set(x, "filterCollection", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setOriginalEventType(value: String): Self = StObject.set(x, "originalEventType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalEventTypeUndefined: Self = StObject.set(x, "originalEventType", js.undefined)
      
      @scala.inline
      def setPrimaryKeyValue(value: String): Self = StObject.set(x, "primaryKeyValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryKeyValueUndefined: Self = StObject.set(x, "primaryKeyValue", js.undefined)
      
      @scala.inline
      def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait BeforeCardSelectEventArgs extends StObject {
    
    /** Returns the Target item.
      */
    var Target: js.UndefOr[js.Any] = js.native
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the select card index value.
      */
    var cardIndex: js.UndefOr[Double] = js.native
    
    /** Returns the select cell index value.
      */
    var cellIndex: js.UndefOr[Double] = js.native
    
    /** Returns the select cell element
      */
    var currentCell: js.UndefOr[js.Any] = js.native
    
    /** Returns select card data.
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Returns the Kanban model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the previously select the card element
      */
    var previousCard: js.UndefOr[js.Any] = js.native
    
    /** Returns the previously select card indexes
      */
    var previousRowcellindex: js.UndefOr[js.Array[_]] = js.native
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object BeforeCardSelectEventArgs {
    
    @scala.inline
    def apply(): BeforeCardSelectEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeCardSelectEventArgs]
    }
    
    @scala.inline
    implicit class BeforeCardSelectEventArgsMutableBuilder[Self <: BeforeCardSelectEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCardIndex(value: Double): Self = StObject.set(x, "cardIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardIndexUndefined: Self = StObject.set(x, "cardIndex", js.undefined)
      
      @scala.inline
      def setCellIndex(value: Double): Self = StObject.set(x, "cellIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellIndexUndefined: Self = StObject.set(x, "cellIndex", js.undefined)
      
      @scala.inline
      def setCurrentCell(value: js.Any): Self = StObject.set(x, "currentCell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentCellUndefined: Self = StObject.set(x, "currentCell", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setPreviousCard(value: js.Any): Self = StObject.set(x, "previousCard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousCardUndefined: Self = StObject.set(x, "previousCard", js.undefined)
      
      @scala.inline
      def setPreviousRowcellindex(value: js.Array[_]): Self = StObject.set(x, "previousRowcellindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousRowcellindexUndefined: Self = StObject.set(x, "previousRowcellindex", js.undefined)
      
      @scala.inline
      def setPreviousRowcellindexVarargs(value: js.Any*): Self = StObject.set(x, "previousRowcellindex", js.Array(value :_*))
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "Target", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait BeginEditEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns begin edit data.
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Returns the Kanban model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns primary key value.
      */
    var primaryKeyValue: js.UndefOr[String] = js.native
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object BeginEditEventArgs {
    
    @scala.inline
    def apply(): BeginEditEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeginEditEventArgs]
    }
    
    @scala.inline
    implicit class BeginEditEventArgsMutableBuilder[Self <: BeginEditEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setPrimaryKeyValue(value: String): Self = StObject.set(x, "primaryKeyValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryKeyValueUndefined: Self = StObject.set(x, "primaryKeyValue", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait CardClickEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the Header text of the column corresponding to the selected card.
      */
    var columnName: js.UndefOr[String] = js.native
    
    /** Returns the current card to the Kanban.
      */
    var currentCard: js.UndefOr[String] = js.native
    
    /** Returns current record object (JSON).
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Returns the Kanban model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns Kanban element.
      */
    var target: js.UndefOr[js.Any] = js.native
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object CardClickEventArgs {
    
    @scala.inline
    def apply(): CardClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardClickEventArgs]
    }
    
    @scala.inline
    implicit class CardClickEventArgsMutableBuilder[Self <: CardClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setColumnName(value: String): Self = StObject.set(x, "columnName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnNameUndefined: Self = StObject.set(x, "columnName", js.undefined)
      
      @scala.inline
      def setCurrentCard(value: String): Self = StObject.set(x, "currentCard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentCardUndefined: Self = StObject.set(x, "currentCard", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait CardDoubleClickEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns current card object (JSON).
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Returns the Kanban model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object CardDoubleClickEventArgs {
    
    @scala.inline
    def apply(): CardDoubleClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardDoubleClickEventArgs]
    }
    
    @scala.inline
    implicit class CardDoubleClickEventArgsMutableBuilder[Self <: CardDoubleClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait CardDragEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns drag data.
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Returns dragged element.
      */
    var draggedElement: js.UndefOr[js.Any] = js.native
    
    /** Returns drag start element.
      */
    var dragtarget: js.UndefOr[js.Any] = js.native
    
    /** Returns the Kanban model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object CardDragEventArgs {
    
    @scala.inline
    def apply(): CardDragEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardDragEventArgs]
    }
    
    @scala.inline
    implicit class CardDragEventArgsMutableBuilder[Self <: CardDragEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDraggedElement(value: js.Any): Self = StObject.set(x, "draggedElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggedElementUndefined: Self = StObject.set(x, "draggedElement", js.undefined)
      
      @scala.inline
      def setDragtarget(value: js.Any): Self = StObject.set(x, "dragtarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragtargetUndefined: Self = StObject.set(x, "dragtarget", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait CardDragStartEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns card drag start data.
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Returns dragged element.
      */
    var draggedElement: js.UndefOr[js.Any] = js.native
    
    /** Returns drag start element.
      */
    var dragtarget: js.UndefOr[js.Any] = js.native
    
    /** Returns the Kanban model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object CardDragStartEventArgs {
    
    @scala.inline
    def apply(): CardDragStartEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardDragStartEventArgs]
    }
    
    @scala.inline
    implicit class CardDragStartEventArgsMutableBuilder[Self <: CardDragStartEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDraggedElement(value: js.Any): Self = StObject.set(x, "draggedElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggedElementUndefined: Self = StObject.set(x, "draggedElement", js.undefined)
      
      @scala.inline
      def setDragtarget(value: js.Any): Self = StObject.set(x, "dragtarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragtargetUndefined: Self = StObject.set(x, "dragtarget", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait CardDragStopEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns drag stop data.
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Returns dragged element.
      */
    var draggedElement: js.UndefOr[js.Any] = js.native
    
    /** Returns drag stop element.
      */
    var droptarget: js.UndefOr[js.Any] = js.native
    
    /** Returns the Kanban model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object CardDragStopEventArgs {
    
    @scala.inline
    def apply(): CardDragStopEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardDragStopEventArgs]
    }
    
    @scala.inline
    implicit class CardDragStopEventArgsMutableBuilder[Self <: CardDragStopEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDraggedElement(value: js.Any): Self = StObject.set(x, "draggedElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggedElementUndefined: Self = StObject.set(x, "draggedElement", js.undefined)
      
      @scala.inline
      def setDroptarget(value: js.Any): Self = StObject.set(x, "droptarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDroptargetUndefined: Self = StObject.set(x, "droptarget", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait CardDropEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns dragged data.
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Returns dragged element.
      */
    var draggedElement: js.UndefOr[js.Any] = js.native
    
    /** Returns previous parent of dragged element
      */
    var draggedParent: js.UndefOr[js.Any] = js.native
    
    /** Returns the Kanban model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns drop element.
      */
    var target: js.UndefOr[js.Any] = js.native
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object CardDropEventArgs {
    
    @scala.inline
    def apply(): CardDropEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardDropEventArgs]
    }
    
    @scala.inline
    implicit class CardDropEventArgsMutableBuilder[Self <: CardDropEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDraggedElement(value: js.Any): Self = StObject.set(x, "draggedElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggedElementUndefined: Self = StObject.set(x, "draggedElement", js.undefined)
      
      @scala.inline
      def setDraggedParent(value: js.Any): Self = StObject.set(x, "draggedParent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggedParentUndefined: Self = StObject.set(x, "draggedParent", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait CardSelectEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the select card index value.
      */
    var cardIndex: js.UndefOr[Double] = js.native
    
    /** Returns the select cell index value.
      */
    var cellIndex: js.UndefOr[Double] = js.native
    
    /** Returns the select cell element
      */
    var currentCell: js.UndefOr[js.Any] = js.native
    
    /** Returns the current item.
      */
    var currentTarget: js.UndefOr[js.Any] = js.native
    
    /** Returns select card data.
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Returns the Kanban model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the previously select the card element
      */
    var previousCard: js.UndefOr[js.Any] = js.native
    
    /** Returns the previously select card indexes
      */
    var previousRowcellindex: js.UndefOr[js.Array[_]] = js.native
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object CardSelectEventArgs {
    
    @scala.inline
    def apply(): CardSelectEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardSelectEventArgs]
    }
    
    @scala.inline
    implicit class CardSelectEventArgsMutableBuilder[Self <: CardSelectEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCardIndex(value: Double): Self = StObject.set(x, "cardIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardIndexUndefined: Self = StObject.set(x, "cardIndex", js.undefined)
      
      @scala.inline
      def setCellIndex(value: Double): Self = StObject.set(x, "cellIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellIndexUndefined: Self = StObject.set(x, "cellIndex", js.undefined)
      
      @scala.inline
      def setCurrentCell(value: js.Any): Self = StObject.set(x, "currentCell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentCellUndefined: Self = StObject.set(x, "currentCell", js.undefined)
      
      @scala.inline
      def setCurrentTarget(value: js.Any): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentTargetUndefined: Self = StObject.set(x, "currentTarget", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setPreviousCard(value: js.Any): Self = StObject.set(x, "previousCard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousCardUndefined: Self = StObject.set(x, "previousCard", js.undefined)
      
      @scala.inline
      def setPreviousRowcellindex(value: js.Array[_]): Self = StObject.set(x, "previousRowcellindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousRowcellindexUndefined: Self = StObject.set(x, "previousRowcellindex", js.undefined)
      
      @scala.inline
      def setPreviousRowcellindexVarargs(value: js.Any*): Self = StObject.set(x, "previousRowcellindex", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait CardSelectingEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the selecting card index value.
      */
    var cardIndex: js.UndefOr[Double] = js.native
    
    /** Returns the selecting cell index value.
      */
    var cellIndex: js.UndefOr[Double] = js.native
    
    /** Returns the selecting cell element
      */
    var currentCell: js.UndefOr[js.Any] = js.native
    
    /** Returns the current item.
      */
    var currentTarget: js.UndefOr[js.Any] = js.native
    
    /** Returns added data.
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Returns the Kanban model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the previously selecting the card element
      */
    var previousCard: js.UndefOr[js.Any] = js.native
    
    /** Returns the previously rowcell is selecting card indexes
      */
    var previousRowcellindex: js.UndefOr[js.Array[_]] = js.native
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object CardSelectingEventArgs {
    
    @scala.inline
    def apply(): CardSelectingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardSelectingEventArgs]
    }
    
    @scala.inline
    implicit class CardSelectingEventArgsMutableBuilder[Self <: CardSelectingEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCardIndex(value: Double): Self = StObject.set(x, "cardIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardIndexUndefined: Self = StObject.set(x, "cardIndex", js.undefined)
      
      @scala.inline
      def setCellIndex(value: Double): Self = StObject.set(x, "cellIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellIndexUndefined: Self = StObject.set(x, "cellIndex", js.undefined)
      
      @scala.inline
      def setCurrentCell(value: js.Any): Self = StObject.set(x, "currentCell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentCellUndefined: Self = StObject.set(x, "currentCell", js.undefined)
      
      @scala.inline
      def setCurrentTarget(value: js.Any): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentTargetUndefined: Self = StObject.set(x, "currentTarget", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setPreviousCard(value: js.Any): Self = StObject.set(x, "previousCard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousCardUndefined: Self = StObject.set(x, "previousCard", js.undefined)
      
      @scala.inline
      def setPreviousRowcellindex(value: js.Array[_]): Self = StObject.set(x, "previousRowcellindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousRowcellindexUndefined: Self = StObject.set(x, "previousRowcellindex", js.undefined)
      
      @scala.inline
      def setPreviousRowcellindexVarargs(value: js.Any*): Self = StObject.set(x, "previousRowcellindex", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait CardSettings extends StObject {
    
    /** To customize the card border color based on assigned task. Colors and corresponding values defined here will be mapped with colorField mapped data source column.
      * @Default {Object}
      */
    var colorMapping: js.UndefOr[js.Any] = js.native
    
    /** This specifies the Kanban card to drop into particular target element.
      */
    var externalDropTarget: js.UndefOr[String] = js.native
    
    /** Gets or sets a value that indicates to add the template for card .
      * @Default {null}
      */
    var template: js.UndefOr[String] = js.native
  }
  object CardSettings {
    
    @scala.inline
    def apply(): CardSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardSettings]
    }
    
    @scala.inline
    implicit class CardSettingsMutableBuilder[Self <: CardSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColorMapping(value: js.Any): Self = StObject.set(x, "colorMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorMappingUndefined: Self = StObject.set(x, "colorMapping", js.undefined)
      
      @scala.inline
      def setExternalDropTarget(value: String): Self = StObject.set(x, "externalDropTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalDropTargetUndefined: Self = StObject.set(x, "externalDropTarget", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
  
  @js.native
  trait CellClickEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the select cell index value.
      */
    var cellIndex: js.UndefOr[Double] = js.native
    
    /** Returns the kanban model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the edited row index.
      */
    var rowIndex: js.UndefOr[Double] = js.native
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object CellClickEventArgs {
    
    @scala.inline
    def apply(): CellClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellClickEventArgs]
    }
    
    @scala.inline
    implicit class CellClickEventArgsMutableBuilder[Self <: CellClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCellIndex(value: Double): Self = StObject.set(x, "cellIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellIndexUndefined: Self = StObject.set(x, "cellIndex", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Column extends StObject {
    
    /** To enable/disable allowDrag for specific column wise.
      * @Default {true}
      */
    var allowDrag: js.UndefOr[Boolean] = js.native
    
    /** To enable/disable allowDrop for specific column wise.
      * @Default {true}
      */
    var allowDrop: js.UndefOr[Boolean] = js.native
    
    /** To customize the column level constraints with minimum ,maximum limit validation.
      * @Default {Object}
      */
    var constraints: js.UndefOr[ColumnsConstraints] = js.native
    
    /** Gets or sets a value that indicates to add the template within the header element.
      * @Default {null}
      */
    var headerTemplate: js.UndefOr[String] = js.native
    
    /** Gets or sets an object that indicates to render the Kanban with specified columns header text.
      * @Default {null}
      */
    var headerText: js.UndefOr[String] = js.native
    
    /** To set column collapse or expand state
      * @Default {false}
      */
    var isCollapsed: js.UndefOr[Boolean] = js.native
    
    /** Gets or sets an object that indicates to render the Kanban with specified columns key.
      * @Default {null}
      */
    var key: js.UndefOr[String | Double] = js.native
    
    /** Gets or sets an object that indicates whether to show add new button.
      * @Default {false}
      */
    var showAddButton: js.UndefOr[Boolean] = js.native
    
    /** To customize the totalCount properties.
      * @Default {Object}
      */
    var totalCount: js.UndefOr[ColumnsTotalCount] = js.native
    
    /** Gets or sets an object that indicates to set specific column visibility.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.native
    
    /** Gets or sets an object that indicates to render the Kanban with specified columns width.
      * @Default {null}
      */
    var width: js.UndefOr[String | Double] = js.native
  }
  object Column {
    
    @scala.inline
    def apply(): Column = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Column]
    }
    
    @scala.inline
    implicit class ColumnMutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowDrag(value: Boolean): Self = StObject.set(x, "allowDrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowDragUndefined: Self = StObject.set(x, "allowDrag", js.undefined)
      
      @scala.inline
      def setAllowDrop(value: Boolean): Self = StObject.set(x, "allowDrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowDropUndefined: Self = StObject.set(x, "allowDrop", js.undefined)
      
      @scala.inline
      def setConstraints(value: ColumnsConstraints): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
      
      @scala.inline
      def setHeaderTemplate(value: String): Self = StObject.set(x, "headerTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderTemplateUndefined: Self = StObject.set(x, "headerTemplate", js.undefined)
      
      @scala.inline
      def setHeaderText(value: String): Self = StObject.set(x, "headerText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderTextUndefined: Self = StObject.set(x, "headerText", js.undefined)
      
      @scala.inline
      def setIsCollapsed(value: Boolean): Self = StObject.set(x, "isCollapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCollapsedUndefined: Self = StObject.set(x, "isCollapsed", js.undefined)
      
      @scala.inline
      def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setShowAddButton(value: Boolean): Self = StObject.set(x, "showAddButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowAddButtonUndefined: Self = StObject.set(x, "showAddButton", js.undefined)
      
      @scala.inline
      def setTotalCount(value: ColumnsTotalCount): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalCountUndefined: Self = StObject.set(x, "totalCount", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait ColumnsConstraints extends StObject {
    
    /** It is used to specify the maximum amount of card in particular column cell or swimlane cell can hold.
      * @Default {null}
      */
    var max: js.UndefOr[Double] = js.native
    
    /** It is used to specify the minimum amount of card in particular column cell or swimlane cell can hold.
      * @Default {null}
      */
    var min: js.UndefOr[Double] = js.native
    
    /** It is used to specify the type of constraints as column or swimlane.
      * @Default {null}
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ColumnsConstraints {
    
    @scala.inline
    def apply(): ColumnsConstraints = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnsConstraints]
    }
    
    @scala.inline
    implicit class ColumnsConstraintsMutableBuilder[Self <: ColumnsConstraints] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ColumnsTotalCount extends StObject {
    
    /** To customize the totalCount text properties.
      * @Default {null}
      */
    var text: js.UndefOr[String] = js.native
  }
  object ColumnsTotalCount {
    
    @scala.inline
    def apply(): ColumnsTotalCount = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnsTotalCount]
    }
    
    @scala.inline
    implicit class ColumnsTotalCountMutableBuilder[Self <: ColumnsTotalCount] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  @js.native
  trait ContextClickEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the current item.
      */
    var currentTarget: js.UndefOr[js.Any] = js.native
    
    /** Returns the Kanban model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the status of contextmenu item which denotes its enabled state.
      */
    var status: js.UndefOr[Boolean] = js.native
    
    /** Returns the target item.
      */
    var target: js.UndefOr[js.Any] = js.native
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ContextClickEventArgs {
    
    @scala.inline
    def apply(): ContextClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextClickEventArgs]
    }
    
    @scala.inline
    implicit class ContextClickEventArgsMutableBuilder[Self <: ContextClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCurrentTarget(value: js.Any): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentTargetUndefined: Self = StObject.set(x, "currentTarget", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ContextMenuSettings extends StObject {
    
    /** Gets or sets a value that indicates whether to add custom contextMenu items.
      * @Default {Array}
      */
    var customMenuItems: js.UndefOr[js.Array[ContextMenuSettingsCustomMenuItem]] = js.native
    
    /** Gets or sets a value that indicates the list of items needs to be disable from default context menu items.
      * @Default {Array}
      */
    var disableDefaultItems: js.UndefOr[js.Array[_]] = js.native
    
    /** To enable context menu.All default context menu will show.
      * @Default {false}
      */
    var enable: js.UndefOr[Boolean] = js.native
    
    /** Its used to add specific default context menu items.
      * @Default {Array}
      */
    var menuItems: js.UndefOr[js.Array[_]] = js.native
  }
  object ContextMenuSettings {
    
    @scala.inline
    def apply(): ContextMenuSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextMenuSettings]
    }
    
    @scala.inline
    implicit class ContextMenuSettingsMutableBuilder[Self <: ContextMenuSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomMenuItems(value: js.Array[ContextMenuSettingsCustomMenuItem]): Self = StObject.set(x, "customMenuItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomMenuItemsUndefined: Self = StObject.set(x, "customMenuItems", js.undefined)
      
      @scala.inline
      def setCustomMenuItemsVarargs(value: ContextMenuSettingsCustomMenuItem*): Self = StObject.set(x, "customMenuItems", js.Array(value :_*))
      
      @scala.inline
      def setDisableDefaultItems(value: js.Array[_]): Self = StObject.set(x, "disableDefaultItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableDefaultItemsUndefined: Self = StObject.set(x, "disableDefaultItems", js.undefined)
      
      @scala.inline
      def setDisableDefaultItemsVarargs(value: js.Any*): Self = StObject.set(x, "disableDefaultItems", js.Array(value :_*))
      
      @scala.inline
      def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      @scala.inline
      def setMenuItems(value: js.Array[_]): Self = StObject.set(x, "menuItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuItemsUndefined: Self = StObject.set(x, "menuItems", js.undefined)
      
      @scala.inline
      def setMenuItemsVarargs(value: js.Any*): Self = StObject.set(x, "menuItems", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ContextMenuSettingsCustomMenuItem extends StObject {
    
    /** Its sets target element to custom context menu item.
      * @Default {ej.Kanban.Target.All}
      */
    var target: js.UndefOr[Target | String] = js.native
    
    /** Gets the template to render custom context menu item.
      * @Default {null}
      */
    var template: js.UndefOr[String] = js.native
    
    /** Gets the display name to custom menu item.
      * @Default {null}
      */
    var text: js.UndefOr[String] = js.native
  }
  object ContextMenuSettingsCustomMenuItem {
    
    @scala.inline
    def apply(): ContextMenuSettingsCustomMenuItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextMenuSettingsCustomMenuItem]
    }
    
    @scala.inline
    implicit class ContextMenuSettingsCustomMenuItemMutableBuilder[Self <: ContextMenuSettingsCustomMenuItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTarget(value: Target | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  @js.native
  trait ContextOpenEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the current item.
      */
    var currentTarget: js.UndefOr[js.Any] = js.native
    
    /** Returns the Kanban model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the status of contextmenu item which denotes its enabled state.
      */
    var status: js.UndefOr[Boolean] = js.native
    
    /** Returns the target item.
      */
    var target: js.UndefOr[js.Any] = js.native
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ContextOpenEventArgs {
    
    @scala.inline
    def apply(): ContextOpenEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextOpenEventArgs]
    }
    
    @scala.inline
    implicit class ContextOpenEventArgsMutableBuilder[Self <: ContextOpenEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCurrentTarget(value: js.Any): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentTargetUndefined: Self = StObject.set(x, "currentTarget", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait CreateEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the kanban model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object CreateEventArgs {
    
    @scala.inline
    def apply(): CreateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateEventArgs]
    }
    
    @scala.inline
    implicit class CreateEventArgsMutableBuilder[Self <: CreateEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait CustomToolbarItem extends StObject {
    
    /** Gets the template to render customToolbarItems.
      * @Default {null}
      */
    var template: js.UndefOr[String] = js.native
  }
  object CustomToolbarItem {
    
    @scala.inline
    def apply(): CustomToolbarItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomToolbarItem]
    }
    
    @scala.inline
    implicit class CustomToolbarItemMutableBuilder[Self <: CustomToolbarItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
  
  @js.native
  trait DataBoundEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the Kanban model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DataBoundEventArgs {
    
    @scala.inline
    def apply(): DataBoundEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataBoundEventArgs]
    }
    
    @scala.inline
    implicit class DataBoundEventArgsMutableBuilder[Self <: DataBoundEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DestroyEventArgs extends StObject {
    
    /** Returns deleted data.
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Returns the kanban model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DestroyEventArgs {
    
    @scala.inline
    def apply(): DestroyEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestroyEventArgs]
    }
    
    @scala.inline
    implicit class DestroyEventArgsMutableBuilder[Self <: DestroyEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait EditSettings extends StObject {
    
    /** Gets or sets a value that indicates whether to enable the adding action in cards behavior on Kanban.
      * @Default {false}
      */
    var allowAdding: js.UndefOr[Boolean] = js.native
    
    /** Gets or sets a value that indicates whether to enable the editing action in cards of Kanban.
      * @Default {false}
      */
    var allowEditing: js.UndefOr[Boolean] = js.native
    
    /** This specifies the id of the template which is require to be edited using the Dialog Box.
      * @Default {null}
      */
    var dialogTemplate: js.UndefOr[String] = js.native
    
    /** Get or sets an object that indicates whether to customize the editing fields of Kanban card.
      * @Default {Array}
      */
    var editItems: js.UndefOr[js.Array[EditSettingsEditItem]] = js.native
    
    /** Get or sets an object that indicates whether to customize the editMode of the Kanban.
      * @Default {ej.Kanban.EditMode.Dialog}
      */
    var editMode: js.UndefOr[EditMode | String] = js.native
    
    /** This specifies the id of the template which is require to be edited using the External edit form.
      * @Default {null}
      */
    var externalFormTemplate: js.UndefOr[String] = js.native
    
    /** This specifies to set the position of an External edit form either in the right or bottom of the Kanban.
      * @Default {ej.Kanban.FormPosition.Bottom}
      */
    var formPosition: js.UndefOr[FormPosition | String] = js.native
  }
  object EditSettings {
    
    @scala.inline
    def apply(): EditSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditSettings]
    }
    
    @scala.inline
    implicit class EditSettingsMutableBuilder[Self <: EditSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowAdding(value: Boolean): Self = StObject.set(x, "allowAdding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowAddingUndefined: Self = StObject.set(x, "allowAdding", js.undefined)
      
      @scala.inline
      def setAllowEditing(value: Boolean): Self = StObject.set(x, "allowEditing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowEditingUndefined: Self = StObject.set(x, "allowEditing", js.undefined)
      
      @scala.inline
      def setDialogTemplate(value: String): Self = StObject.set(x, "dialogTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDialogTemplateUndefined: Self = StObject.set(x, "dialogTemplate", js.undefined)
      
      @scala.inline
      def setEditItems(value: js.Array[EditSettingsEditItem]): Self = StObject.set(x, "editItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditItemsUndefined: Self = StObject.set(x, "editItems", js.undefined)
      
      @scala.inline
      def setEditItemsVarargs(value: EditSettingsEditItem*): Self = StObject.set(x, "editItems", js.Array(value :_*))
      
      @scala.inline
      def setEditMode(value: EditMode | String): Self = StObject.set(x, "editMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditModeUndefined: Self = StObject.set(x, "editMode", js.undefined)
      
      @scala.inline
      def setExternalFormTemplate(value: String): Self = StObject.set(x, "externalFormTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalFormTemplateUndefined: Self = StObject.set(x, "externalFormTemplate", js.undefined)
      
      @scala.inline
      def setFormPosition(value: FormPosition | String): Self = StObject.set(x, "formPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormPositionUndefined: Self = StObject.set(x, "formPosition", js.undefined)
    }
  }
  
  @js.native
  trait EditSettingsEditItem extends StObject {
    
    /** It is used to specify defaultValue for the fields while adding new card.
      * @Default {null}
      */
    var defaultValue: js.UndefOr[String | Double] = js.native
    
    /** It is used to set the particular editparams in the card for editing.
      * @Default {Object}
      */
    var editParams: js.UndefOr[js.Any] = js.native
    
    /** It is used to set the particular editType in the card for editing.
      * @Default {ej.Kanban.EditingType.String}
      */
    var editType: js.UndefOr[EditingType | String] = js.native
    
    /** It is used to map editing field from the data source.
      * @Default {null}
      */
    var field: js.UndefOr[String] = js.native
    
    /** Gets or sets a value that indicates to define constraints for saving data to the database.
      * @Default {Object}
      */
    var validationRules: js.UndefOr[js.Any] = js.native
  }
  object EditSettingsEditItem {
    
    @scala.inline
    def apply(): EditSettingsEditItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditSettingsEditItem]
    }
    
    @scala.inline
    implicit class EditSettingsEditItemMutableBuilder[Self <: EditSettingsEditItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultValue(value: String | Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setEditParams(value: js.Any): Self = StObject.set(x, "editParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditParamsUndefined: Self = StObject.set(x, "editParams", js.undefined)
      
      @scala.inline
      def setEditType(value: EditingType | String): Self = StObject.set(x, "editType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditTypeUndefined: Self = StObject.set(x, "editType", js.undefined)
      
      @scala.inline
      def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      @scala.inline
      def setValidationRules(value: js.Any): Self = StObject.set(x, "validationRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationRulesUndefined: Self = StObject.set(x, "validationRules", js.undefined)
    }
  }
  
  @js.native
  trait EndDeleteEventArgs extends StObject {
    
    /** Current action name
      */
    var action: js.UndefOr[String] = js.native
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns deleted  data.
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Returns the Kanban model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns request type.
      */
    var requestType: js.UndefOr[String] = js.native
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object EndDeleteEventArgs {
    
    @scala.inline
    def apply(): EndDeleteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndDeleteEventArgs]
    }
    
    @scala.inline
    implicit class EndDeleteEventArgsMutableBuilder[Self <: EndDeleteEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait EndEditEventArgs extends StObject {
    
    /** Current Action name
      */
    var action: js.UndefOr[String] = js.native
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns modified data.
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Returns the Kanban model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns request type.
      */
    var requestType: js.UndefOr[String] = js.native
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object EndEditEventArgs {
    
    @scala.inline
    def apply(): EndEditEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndEditEventArgs]
    }
    
    @scala.inline
    implicit class EndEditEventArgsMutableBuilder[Self <: EndEditEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Fields extends StObject {
    
    /** Get or sets an object that indicates the options to map the cards to the collapsible area.
      * @Default {Object}
      */
    var collapsibleCards: js.UndefOr[FieldsCollapsibleCards] = js.native
    
    /** To customize the card has been Mapped into card color field.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Content field has been Mapped into card text.
      * @Default {null}
      */
    var content: js.UndefOr[String] = js.native
    
    /** ImageUrl field has been Mapped into card image.
      * @Default {null}
      */
    var imageUrl: js.UndefOr[String] = js.native
    
    /** The primarykey field is mapped to data source field. And this will used for Drag and drop and editing mainly.
      * @Default {null}
      */
    var primaryKey: js.UndefOr[String] = js.native
    
    /** Priority field has been mapped data source field to maintain cards priority.
      * @Default {null}
      */
    var priority: js.UndefOr[String] = js.native
    
    /** To enable swimlane grouping based on the given key field from datasource mapping.
      * @Default {null}
      */
    var swimlaneKey: js.UndefOr[String] = js.native
    
    /** Tag field has been Mapped into card tag.
      * @Default {null}
      */
    var tag: js.UndefOr[String] = js.native
    
    /** Title field has been Mapped to field in datasource for title content. If title field specified , card expand/collapse will be enabled with header and content section.
      * @Default {null}
      */
    var title: js.UndefOr[String] = js.native
  }
  object Fields {
    
    @scala.inline
    def apply(): Fields = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fields]
    }
    
    @scala.inline
    implicit class FieldsMutableBuilder[Self <: Fields] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollapsibleCards(value: FieldsCollapsibleCards): Self = StObject.set(x, "collapsibleCards", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsibleCardsUndefined: Self = StObject.set(x, "collapsibleCards", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
      
      @scala.inline
      def setPrimaryKey(value: String): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
      
      @scala.inline
      def setPriority(value: String): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      @scala.inline
      def setSwimlaneKey(value: String): Self = StObject.set(x, "swimlaneKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwimlaneKeyUndefined: Self = StObject.set(x, "swimlaneKey", js.undefined)
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait FieldsCollapsibleCards extends StObject {
    
    /** It is used to specify the collapsible card's field mapping.
      * @Default {null}
      */
    var field: js.UndefOr[String] = js.native
    
    /** It is used to specify the collapsible card's key mapping which is available in datasource value of field mapped in collapsibleCards.field.
      * @Default {null}
      */
    var key: js.UndefOr[String] = js.native
  }
  object FieldsCollapsibleCards {
    
    @scala.inline
    def apply(): FieldsCollapsibleCards = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldsCollapsibleCards]
    }
    
    @scala.inline
    implicit class FieldsCollapsibleCardsMutableBuilder[Self <: FieldsCollapsibleCards] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  @js.native
  trait FilterSetting extends StObject {
    
    /** Gets or sets an object of tooltip to filter buttons.
      * @Default {null}
      */
    var description: js.UndefOr[String] = js.native
    
    /** Gets or sets an object that Queries to perform filtering
      * @Default {Object}
      */
    var query: js.UndefOr[js.Any] = js.native
    
    /** Gets or sets an object of display name to filter queries.
      * @Default {null}
      */
    var text: js.UndefOr[String] = js.native
  }
  object FilterSetting {
    
    @scala.inline
    def apply(): FilterSetting = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilterSetting]
    }
    
    @scala.inline
    implicit class FilterSettingMutableBuilder[Self <: FilterSetting] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setQuery(value: js.Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  @js.native
  trait HeaderClickEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the select cell index value.
      */
    var cellIndex: js.UndefOr[Double] = js.native
    
    /** Returns the column object.
      */
    var columnData: js.UndefOr[js.Any] = js.native
    
    /** Returns the kanban model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object HeaderClickEventArgs {
    
    @scala.inline
    def apply(): HeaderClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderClickEventArgs]
    }
    
    @scala.inline
    implicit class HeaderClickEventArgsMutableBuilder[Self <: HeaderClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCellIndex(value: Double): Self = StObject.set(x, "cellIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellIndexUndefined: Self = StObject.set(x, "cellIndex", js.undefined)
      
      @scala.inline
      def setColumnData(value: js.Any): Self = StObject.set(x, "columnData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnDataUndefined: Self = StObject.set(x, "columnData", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait KanbanEdit extends StObject {
    
    /** Add a new card in Kanban control when allowAdding is set as true. If parameters are not given default dialog will be open.
      * @param {string} Pass the primary key field Name of the column
      * @param {any[]} Pass the edited JSON data of card need to be add.
      * @returns {void}
      */
    def addCard(primaryKey: String, card: js.Array[_]): Unit = js.native
    
    /** Send a cancel request of add/edit card in Kanban when allowEditing/allowAdding is set as true.
      * @returns {void}
      */
    def cancelEdit(): Unit = js.native
    
    /** Delete a card in Kanban control when allowAdding/allowEditing is set as true.
      * @param {string|number} Pass the key of card to be delete
      * @returns {void}
      */
    def deleteCard(Key: String): Unit = js.native
    def deleteCard(Key: Double): Unit = js.native
    
    /** Send a save request in Kanban when any card is in edit/new add card state and allowEditing/allowAdding is set as true.
      * @returns {void}
      */
    def endEdit(): Unit = js.native
    
    /** Method used for set validation to a field during editing.
      * @param {string} Specify the name of the column to set validation rules
      * @param {any} Specify the validation rules for the field
      * @returns {void}
      */
    def setValidationToField(name: String, rules: js.Any): Unit = js.native
    
    /** Send an edit card request in Kanban when allowEditing is set as true. Parameter will be HTML element or primary key
      * @param {any} Pass the div selected row element to be edited in Kanban
      * @returns {void}
      */
    def startEdit($div: js.Any): Unit = js.native
  }
  
  @js.native
  trait KanbanFilter extends StObject {
    
    /** Send a clear request to filter cards in the kanban.
      * @returns {void}
      */
    def clearFilter(): Unit = js.native
    
    /** Method used for send a clear search request to Kanban.
      * @returns {void}
      */
    def clearSearch(): Unit = js.native
    
    /** Send a filtering request to cards in the kanban.
      * @returns {void}
      */
    def filterCards(): Unit = js.native
    
    /** Send a search request to Kanban with specified string passed in it.
      * @param {string} Pass the string to search in Kanban card
      * @returns {void}
      */
    def searchCards(searchString: String): Unit = js.native
  }
  object KanbanFilter {
    
    @scala.inline
    def apply(
      clearFilter: () => Unit,
      clearSearch: () => Unit,
      filterCards: () => Unit,
      searchCards: String => Unit
    ): KanbanFilter = {
      val __obj = js.Dynamic.literal(clearFilter = js.Any.fromFunction0(clearFilter), clearSearch = js.Any.fromFunction0(clearSearch), filterCards = js.Any.fromFunction0(filterCards), searchCards = js.Any.fromFunction1(searchCards))
      __obj.asInstanceOf[KanbanFilter]
    }
    
    @scala.inline
    implicit class KanbanFilterMutableBuilder[Self <: KanbanFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClearFilter(value: () => Unit): Self = StObject.set(x, "clearFilter", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClearSearch(value: () => Unit): Self = StObject.set(x, "clearSearch", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFilterCards(value: () => Unit): Self = StObject.set(x, "filterCards", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSearchCards(value: String => Unit): Self = StObject.set(x, "searchCards", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait KanbanSelection extends StObject {
    
    /** It is used to clear all the card selection.
      * @returns {void}
      */
    def clear(): Unit = js.native
  }
  object KanbanSelection {
    
    @scala.inline
    def apply(clear: () => Unit): KanbanSelection = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear))
      __obj.asInstanceOf[KanbanSelection]
    }
    
    @scala.inline
    implicit class KanbanSelectionMutableBuilder[Self <: KanbanSelection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait KanbanSwimlane extends StObject {
    
    /** Collapse all the swimlane rows in Kanban.
      * @returns {void}
      */
    def collapseAll(): Unit = js.native
    
    /** Expand all the swimlane rows in Kanban.
      * @returns {void}
      */
    def expandAll(): Unit = js.native
    
    /** Expand or collapse the swimlane row based on the state of target &quot;div&quot;
      * @param {any} Pass the div object to toggleSwimlane row based on its row state
      * @returns {void}
      */
    def toggle($div: js.Any): Unit = js.native
  }
  object KanbanSwimlane {
    
    @scala.inline
    def apply(collapseAll: () => Unit, expandAll: () => Unit, toggle: js.Any => Unit): KanbanSwimlane = {
      val __obj = js.Dynamic.literal(collapseAll = js.Any.fromFunction0(collapseAll), expandAll = js.Any.fromFunction0(expandAll), toggle = js.Any.fromFunction1(toggle))
      __obj.asInstanceOf[KanbanSwimlane]
    }
    
    @scala.inline
    implicit class KanbanSwimlaneMutableBuilder[Self <: KanbanSwimlane] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollapseAll(value: () => Unit): Self = StObject.set(x, "collapseAll", js.Any.fromFunction0(value))
      
      @scala.inline
      def setExpandAll(value: () => Unit): Self = StObject.set(x, "expandAll", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToggle(value: js.Any => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait LoadEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the kanban model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object LoadEventArgs {
    
    @scala.inline
    def apply(): LoadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadEventArgs]
    }
    
    @scala.inline
    implicit class LoadEventArgsMutableBuilder[Self <: LoadEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Model extends StObject {
    
    /** Triggered for every Kanban action before its starts.
      */
    var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, Unit]] = js.native
    
    /** Triggered for every Kanban action success event.
      */
    var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, Unit]] = js.native
    
    /** Triggered for every Kanban action server failure event.
      */
    var actionFailure: js.UndefOr[js.Function1[/* e */ ActionFailureEventArgs, Unit]] = js.native
    
    /** Gets or sets a value that indicates whether to enable allowDragAndDrop behavior on Kanban.
      * @Default {true}
      */
    var allowDragAndDrop: js.UndefOr[Boolean] = js.native
    
    /** Gets or sets a value that indicates whether to enable drag and drop behavior between Kanban controls.
      * @Default {false}
      */
    var allowExternalDragAndDrop: js.UndefOr[Boolean] = js.native
    
    /** To enable filtering behavior on Kanban.User can specify query in filterSettings collection after enabling allowFiltering.
      * @Default {false}
      */
    var allowFiltering: js.UndefOr[Boolean] = js.native
    
    /** Gets or sets a value that indicates whether to allow card hover actions.
      * @Default {true}
      */
    var allowHover: js.UndefOr[Boolean] = js.native
    
    /** To allow keyboard navigation actions.
      * @Default {false}
      */
    var allowKeyboardNavigation: js.UndefOr[Boolean] = js.native
    
    /** Gets or sets a value that indicates whether to enable printing option.
      * @Default {false}
      */
    var allowPrinting: js.UndefOr[Boolean] = js.native
    
    /** Gets or sets a value that indicates whether to enable the scrollbar in the Kanban and view the card by scroll through the Kanban manually.
      * @Default {false}
      */
    var allowScrolling: js.UndefOr[Boolean] = js.native
    
    /** To enable Searching operation in Kanban.
      * @Default {false}
      */
    var allowSearching: js.UndefOr[Boolean] = js.native
    
    /** Gets or sets a value that indicates whether to enable allowSelection behavior on Kanban.User can select card and the selected card will be highlighted on Kanban.
      * @Default {true}
      */
    var allowSelection: js.UndefOr[Boolean] = js.native
    
    /** To enable or disable the title of the card.
      * @Default {false}
      */
    var allowTitle: js.UndefOr[Boolean] = js.native
    
    /** To enable or disable the column expand /collapse.
      * @Default {false}
      */
    var allowToggleColumn: js.UndefOr[Boolean] = js.native
    
    /** Triggered before the card is selected.
      */
    var beforeCardSelect: js.UndefOr[js.Function1[/* e */ BeforeCardSelectEventArgs, Unit]] = js.native
    
    /** Triggered before the task is going to be edited.
      */
    var beginEdit: js.UndefOr[js.Function1[/* e */ BeginEditEventArgs, Unit]] = js.native
    
    /** Trigger after the card is clicked.
      */
    var cardClick: js.UndefOr[js.Function1[/* e */ CardClickEventArgs, Unit]] = js.native
    
    /** Triggered when card is double clicked.
      */
    var cardDoubleClick: js.UndefOr[js.Function1[/* e */ CardDoubleClickEventArgs, Unit]] = js.native
    
    /** Triggered when the card is being dragged.
      */
    var cardDrag: js.UndefOr[js.Function1[/* e */ CardDragEventArgs, Unit]] = js.native
    
    /** Triggered when card dragging start.
      */
    var cardDragStart: js.UndefOr[js.Function1[/* e */ CardDragStartEventArgs, Unit]] = js.native
    
    /** Triggered when card dragging stops.
      */
    var cardDragStop: js.UndefOr[js.Function1[/* e */ CardDragStopEventArgs, Unit]] = js.native
    
    /** Triggered when the card is Dropped.
      */
    var cardDrop: js.UndefOr[js.Function1[/* e */ CardDropEventArgs, Unit]] = js.native
    
    /** Triggered after the card is selected.
      */
    var cardSelect: js.UndefOr[js.Function1[/* e */ CardSelectEventArgs, Unit]] = js.native
    
    /** Triggered before the card is selected.
      */
    var cardSelecting: js.UndefOr[js.Function1[/* e */ CardSelectingEventArgs, Unit]] = js.native
    
    /** Gets or sets an object that indicates whether to Customize the card settings.
      * @Default {Object}
      */
    var cardSettings: js.UndefOr[CardSettings] = js.native
    
    /** Triggers after the cell is clicked.
      */
    var cellClick: js.UndefOr[js.Function1[/* e */ CellClickEventArgs, Unit]] = js.native
    
    /** Gets or sets an object that indicates to render the Kanban with specified columns.
      * @Default {Array}
      */
    var columns: js.UndefOr[js.Array[Column]] = js.native
    
    /** Triggered when context menu item is clicked in Kanban
      */
    var contextClick: js.UndefOr[js.Function1[/* e */ ContextClickEventArgs, Unit]] = js.native
    
    /** Gets or sets an object that indicates whether to customize the context menu behavior of the Kanban.
      * @Default {Object}
      */
    var contextMenuSettings: js.UndefOr[ContextMenuSettings] = js.native
    
    /** Triggered before the context menu is opened.
      */
    var contextOpen: js.UndefOr[js.Function1[/* e */ ContextOpenEventArgs, Unit]] = js.native
    
    /** Triggered when the Kanban is rendered completely
      */
    var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
    
    /** Gets or sets a value that indicates to render the Kanban with custom theme.
      */
    var cssClass: js.UndefOr[String] = js.native
    
    /** Gets or sets a value that indicates whether to add customToolbarItems within the toolbar to perform any action in the Kanban.
      * @Default {[]}
      */
    var customToolbarItems: js.UndefOr[js.Array[CustomToolbarItem]] = js.native
    
    /** Triggered the Kanban is bound with data during initial rendering.
      */
    var dataBound: js.UndefOr[js.Function1[/* e */ DataBoundEventArgs, Unit]] = js.native
    
    /** Gets or sets the data to render the Kanban with cards.
      * @Default {null}
      */
    var dataSource: js.UndefOr[js.Any] = js.native
    
    /** Triggered when Kanban going to destroy.
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
    
    /** Get or sets an object that indicates whether to customize the editing behavior of the Kanban.
      * @Default {Object}
      */
    var editSettings: js.UndefOr[EditSettings] = js.native
    
    /** Align content in the Kanban control align from right to left by setting the property as true.
      * @Default {false}
      */
    var enableRTL: js.UndefOr[Boolean] = js.native
    
    /** To show total count of cards in each column.
      * @Default {false}
      */
    var enableTotalCount: js.UndefOr[Boolean] = js.native
    
    /** To perform kanban functionalities with touch interaction.
      * @Default {true}
      */
    var enableTouch: js.UndefOr[Boolean] = js.native
    
    /** Triggered after the card is deleted.
      */
    var endDelete: js.UndefOr[js.Function1[/* e */ EndDeleteEventArgs, Unit]] = js.native
    
    /** Triggered after the card is edited.
      */
    var endEdit: js.UndefOr[js.Function1[/* e */ EndEditEventArgs, Unit]] = js.native
    
    /** To customize field mappings for card , editing title and control key parameters
      * @Default {Object}
      */
    var fields: js.UndefOr[Fields] = js.native
    
    /** To customize the filtering behavior based on queries given.
      * @Default {Array}
      */
    var filterSettings: js.UndefOr[js.Array[FilterSetting]] = js.native
    
    /** Triggers after the header is clicked.
      */
    var headerClick: js.UndefOr[js.Function1[/* e */ HeaderClickEventArgs, Unit]] = js.native
    
    /** When set to true, adapts the Kanban layout to fit the screen size of devices on which it renders.
      * @Default {false}
      */
    var isResponsive: js.UndefOr[Boolean] = js.native
    
    /** To map datasource field for column values mapping
      * @Default {null}
      */
    var keyField: js.UndefOr[String] = js.native
    
    /** To change the key in keyboard interaction to Kanban control.
      * @Default {null}
      */
    var keySettings: js.UndefOr[js.Any] = js.native
    
    /** Triggered initial load.
      */
    var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.native
    
    /** Gets or sets a value that indicates whether to customizing the user interface (UI) as locale-specific in order to display regional data i.e. in a language and culture specific to
      * a particular country or region.
      * @Default {en-US}
      */
    var locale: js.UndefOr[String] = js.native
    
    /** Gets or sets a value that indicates whether to set the minimum width of the responsive Kanban while isResponsive property is true.
      * @Default {0}
      */
    var minWidth: js.UndefOr[Double] = js.native
    
    /** ej Query to query database of Kanban.
      * @Default {null}
      */
    var query: js.UndefOr[js.Any] = js.native
    
    /** Triggered every time a single card rendered request is made to access particular card information.
      */
    var queryCellInfo: js.UndefOr[js.Function1[/* e */ QueryCellInfoEventArgs, Unit]] = js.native
    
    /** Gets or sets an object that indicates whether to customize the scrolling behavior of the Kanban.
      * @Default {Object}
      */
    var scrollSettings: js.UndefOr[ScrollSettings] = js.native
    
    /** To customize the searching behavior of the Kanban.
      * @Default {Object}
      */
    var searchSettings: js.UndefOr[SearchSettings] = js.native
    
    /** To allow customize selection type. Accepting types are &quot;single&quot; and &quot;multiple&quot;.
      * @Default {ej.Kanban.SelectionType.Single}
      */
    var selectionType: js.UndefOr[SelectionType | String] = js.native
    
    /** Gets or sets a value that indicates whether to render kanban columns using without data source.
      * @Default {false}
      */
    var showColumnWhenEmpty: js.UndefOr[Boolean] = js.native
    
    /** Gets or sets an object that indicates to managing the collection of stacked header rows for the Kanban.
      * @Default {Array}
      */
    var stackedHeaderRows: js.UndefOr[js.Array[StackedHeaderRow]] = js.native
    
    /** Triggers before swim lane expand or collapse icon is clicked.
      */
    var swimlaneClick: js.UndefOr[js.Function1[/* e */ SwimlaneClickEventArgs, Unit]] = js.native
    
    /** Customize the settings for swim lane.
      * @Default {Object}
      */
    var swimlaneSettings: js.UndefOr[SwimlaneSettings] = js.native
    
    /** Triggered when toolbar item is clicked in Kanban.
      */
    var toolbarClick: js.UndefOr[js.Function1[/* e */ ToolbarClickEventArgs, Unit]] = js.native
    
    /** The tooltip allows to display card details in a tooltip while hovering on it.
      */
    var tooltipSettings: js.UndefOr[TooltipSettings] = js.native
    
    /** Gets or sets an object that indicates to render the Kanban with specified workflows.
      * @Default {Array}
      */
    var workflows: js.UndefOr[js.Array[Workflow]] = js.native
  }
  object Model {
    
    @scala.inline
    def apply(): typingsSlinky.ejWebAll.ej.Kanban.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.ejWebAll.ej.Kanban.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typingsSlinky.ejWebAll.ej.Kanban.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionBegin(value: /* e */ ActionBeginEventArgs => Unit): Self = StObject.set(x, "actionBegin", js.Any.fromFunction1(value))
      
      @scala.inline
      def setActionBeginUndefined: Self = StObject.set(x, "actionBegin", js.undefined)
      
      @scala.inline
      def setActionComplete(value: /* e */ ActionCompleteEventArgs => Unit): Self = StObject.set(x, "actionComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setActionCompleteUndefined: Self = StObject.set(x, "actionComplete", js.undefined)
      
      @scala.inline
      def setActionFailure(value: /* e */ ActionFailureEventArgs => Unit): Self = StObject.set(x, "actionFailure", js.Any.fromFunction1(value))
      
      @scala.inline
      def setActionFailureUndefined: Self = StObject.set(x, "actionFailure", js.undefined)
      
      @scala.inline
      def setAllowDragAndDrop(value: Boolean): Self = StObject.set(x, "allowDragAndDrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowDragAndDropUndefined: Self = StObject.set(x, "allowDragAndDrop", js.undefined)
      
      @scala.inline
      def setAllowExternalDragAndDrop(value: Boolean): Self = StObject.set(x, "allowExternalDragAndDrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowExternalDragAndDropUndefined: Self = StObject.set(x, "allowExternalDragAndDrop", js.undefined)
      
      @scala.inline
      def setAllowFiltering(value: Boolean): Self = StObject.set(x, "allowFiltering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowFilteringUndefined: Self = StObject.set(x, "allowFiltering", js.undefined)
      
      @scala.inline
      def setAllowHover(value: Boolean): Self = StObject.set(x, "allowHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowHoverUndefined: Self = StObject.set(x, "allowHover", js.undefined)
      
      @scala.inline
      def setAllowKeyboardNavigation(value: Boolean): Self = StObject.set(x, "allowKeyboardNavigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowKeyboardNavigationUndefined: Self = StObject.set(x, "allowKeyboardNavigation", js.undefined)
      
      @scala.inline
      def setAllowPrinting(value: Boolean): Self = StObject.set(x, "allowPrinting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowPrintingUndefined: Self = StObject.set(x, "allowPrinting", js.undefined)
      
      @scala.inline
      def setAllowScrolling(value: Boolean): Self = StObject.set(x, "allowScrolling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowScrollingUndefined: Self = StObject.set(x, "allowScrolling", js.undefined)
      
      @scala.inline
      def setAllowSearching(value: Boolean): Self = StObject.set(x, "allowSearching", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowSearchingUndefined: Self = StObject.set(x, "allowSearching", js.undefined)
      
      @scala.inline
      def setAllowSelection(value: Boolean): Self = StObject.set(x, "allowSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowSelectionUndefined: Self = StObject.set(x, "allowSelection", js.undefined)
      
      @scala.inline
      def setAllowTitle(value: Boolean): Self = StObject.set(x, "allowTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowTitleUndefined: Self = StObject.set(x, "allowTitle", js.undefined)
      
      @scala.inline
      def setAllowToggleColumn(value: Boolean): Self = StObject.set(x, "allowToggleColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowToggleColumnUndefined: Self = StObject.set(x, "allowToggleColumn", js.undefined)
      
      @scala.inline
      def setBeforeCardSelect(value: /* e */ BeforeCardSelectEventArgs => Unit): Self = StObject.set(x, "beforeCardSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeCardSelectUndefined: Self = StObject.set(x, "beforeCardSelect", js.undefined)
      
      @scala.inline
      def setBeginEdit(value: /* e */ BeginEditEventArgs => Unit): Self = StObject.set(x, "beginEdit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeginEditUndefined: Self = StObject.set(x, "beginEdit", js.undefined)
      
      @scala.inline
      def setCardClick(value: /* e */ CardClickEventArgs => Unit): Self = StObject.set(x, "cardClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCardClickUndefined: Self = StObject.set(x, "cardClick", js.undefined)
      
      @scala.inline
      def setCardDoubleClick(value: /* e */ CardDoubleClickEventArgs => Unit): Self = StObject.set(x, "cardDoubleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCardDoubleClickUndefined: Self = StObject.set(x, "cardDoubleClick", js.undefined)
      
      @scala.inline
      def setCardDrag(value: /* e */ CardDragEventArgs => Unit): Self = StObject.set(x, "cardDrag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCardDragStart(value: /* e */ CardDragStartEventArgs => Unit): Self = StObject.set(x, "cardDragStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCardDragStartUndefined: Self = StObject.set(x, "cardDragStart", js.undefined)
      
      @scala.inline
      def setCardDragStop(value: /* e */ CardDragStopEventArgs => Unit): Self = StObject.set(x, "cardDragStop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCardDragStopUndefined: Self = StObject.set(x, "cardDragStop", js.undefined)
      
      @scala.inline
      def setCardDragUndefined: Self = StObject.set(x, "cardDrag", js.undefined)
      
      @scala.inline
      def setCardDrop(value: /* e */ CardDropEventArgs => Unit): Self = StObject.set(x, "cardDrop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCardDropUndefined: Self = StObject.set(x, "cardDrop", js.undefined)
      
      @scala.inline
      def setCardSelect(value: /* e */ CardSelectEventArgs => Unit): Self = StObject.set(x, "cardSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCardSelectUndefined: Self = StObject.set(x, "cardSelect", js.undefined)
      
      @scala.inline
      def setCardSelecting(value: /* e */ CardSelectingEventArgs => Unit): Self = StObject.set(x, "cardSelecting", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCardSelectingUndefined: Self = StObject.set(x, "cardSelecting", js.undefined)
      
      @scala.inline
      def setCardSettings(value: CardSettings): Self = StObject.set(x, "cardSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardSettingsUndefined: Self = StObject.set(x, "cardSettings", js.undefined)
      
      @scala.inline
      def setCellClick(value: /* e */ CellClickEventArgs => Unit): Self = StObject.set(x, "cellClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCellClickUndefined: Self = StObject.set(x, "cellClick", js.undefined)
      
      @scala.inline
      def setColumns(value: js.Array[Column]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setColumnsVarargs(value: Column*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setContextClick(value: /* e */ ContextClickEventArgs => Unit): Self = StObject.set(x, "contextClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setContextClickUndefined: Self = StObject.set(x, "contextClick", js.undefined)
      
      @scala.inline
      def setContextMenuSettings(value: ContextMenuSettings): Self = StObject.set(x, "contextMenuSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextMenuSettingsUndefined: Self = StObject.set(x, "contextMenuSettings", js.undefined)
      
      @scala.inline
      def setContextOpen(value: /* e */ ContextOpenEventArgs => Unit): Self = StObject.set(x, "contextOpen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setContextOpenUndefined: Self = StObject.set(x, "contextOpen", js.undefined)
      
      @scala.inline
      def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setCustomToolbarItems(value: js.Array[CustomToolbarItem]): Self = StObject.set(x, "customToolbarItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomToolbarItemsUndefined: Self = StObject.set(x, "customToolbarItems", js.undefined)
      
      @scala.inline
      def setCustomToolbarItemsVarargs(value: CustomToolbarItem*): Self = StObject.set(x, "customToolbarItems", js.Array(value :_*))
      
      @scala.inline
      def setDataBound(value: /* e */ DataBoundEventArgs => Unit): Self = StObject.set(x, "dataBound", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
      
      @scala.inline
      def setDataSource(value: js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      @scala.inline
      def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setEditSettings(value: EditSettings): Self = StObject.set(x, "editSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditSettingsUndefined: Self = StObject.set(x, "editSettings", js.undefined)
      
      @scala.inline
      def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      @scala.inline
      def setEnableTotalCount(value: Boolean): Self = StObject.set(x, "enableTotalCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableTotalCountUndefined: Self = StObject.set(x, "enableTotalCount", js.undefined)
      
      @scala.inline
      def setEnableTouch(value: Boolean): Self = StObject.set(x, "enableTouch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableTouchUndefined: Self = StObject.set(x, "enableTouch", js.undefined)
      
      @scala.inline
      def setEndDelete(value: /* e */ EndDeleteEventArgs => Unit): Self = StObject.set(x, "endDelete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEndDeleteUndefined: Self = StObject.set(x, "endDelete", js.undefined)
      
      @scala.inline
      def setEndEdit(value: /* e */ EndEditEventArgs => Unit): Self = StObject.set(x, "endEdit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEndEditUndefined: Self = StObject.set(x, "endEdit", js.undefined)
      
      @scala.inline
      def setFields(value: Fields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setFilterSettings(value: js.Array[FilterSetting]): Self = StObject.set(x, "filterSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterSettingsUndefined: Self = StObject.set(x, "filterSettings", js.undefined)
      
      @scala.inline
      def setFilterSettingsVarargs(value: FilterSetting*): Self = StObject.set(x, "filterSettings", js.Array(value :_*))
      
      @scala.inline
      def setHeaderClick(value: /* e */ HeaderClickEventArgs => Unit): Self = StObject.set(x, "headerClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeaderClickUndefined: Self = StObject.set(x, "headerClick", js.undefined)
      
      @scala.inline
      def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      @scala.inline
      def setKeyField(value: String): Self = StObject.set(x, "keyField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyFieldUndefined: Self = StObject.set(x, "keyField", js.undefined)
      
      @scala.inline
      def setKeySettings(value: js.Any): Self = StObject.set(x, "keySettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeySettingsUndefined: Self = StObject.set(x, "keySettings", js.undefined)
      
      @scala.inline
      def setLoad(value: /* e */ LoadEventArgs => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setQuery(value: js.Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryCellInfo(value: /* e */ QueryCellInfoEventArgs => Unit): Self = StObject.set(x, "queryCellInfo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setQueryCellInfoUndefined: Self = StObject.set(x, "queryCellInfo", js.undefined)
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setScrollSettings(value: ScrollSettings): Self = StObject.set(x, "scrollSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollSettingsUndefined: Self = StObject.set(x, "scrollSettings", js.undefined)
      
      @scala.inline
      def setSearchSettings(value: SearchSettings): Self = StObject.set(x, "searchSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchSettingsUndefined: Self = StObject.set(x, "searchSettings", js.undefined)
      
      @scala.inline
      def setSelectionType(value: SelectionType | String): Self = StObject.set(x, "selectionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionTypeUndefined: Self = StObject.set(x, "selectionType", js.undefined)
      
      @scala.inline
      def setShowColumnWhenEmpty(value: Boolean): Self = StObject.set(x, "showColumnWhenEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowColumnWhenEmptyUndefined: Self = StObject.set(x, "showColumnWhenEmpty", js.undefined)
      
      @scala.inline
      def setStackedHeaderRows(value: js.Array[StackedHeaderRow]): Self = StObject.set(x, "stackedHeaderRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackedHeaderRowsUndefined: Self = StObject.set(x, "stackedHeaderRows", js.undefined)
      
      @scala.inline
      def setStackedHeaderRowsVarargs(value: StackedHeaderRow*): Self = StObject.set(x, "stackedHeaderRows", js.Array(value :_*))
      
      @scala.inline
      def setSwimlaneClick(value: /* e */ SwimlaneClickEventArgs => Unit): Self = StObject.set(x, "swimlaneClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSwimlaneClickUndefined: Self = StObject.set(x, "swimlaneClick", js.undefined)
      
      @scala.inline
      def setSwimlaneSettings(value: SwimlaneSettings): Self = StObject.set(x, "swimlaneSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwimlaneSettingsUndefined: Self = StObject.set(x, "swimlaneSettings", js.undefined)
      
      @scala.inline
      def setToolbarClick(value: /* e */ ToolbarClickEventArgs => Unit): Self = StObject.set(x, "toolbarClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToolbarClickUndefined: Self = StObject.set(x, "toolbarClick", js.undefined)
      
      @scala.inline
      def setTooltipSettings(value: TooltipSettings): Self = StObject.set(x, "tooltipSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipSettingsUndefined: Self = StObject.set(x, "tooltipSettings", js.undefined)
      
      @scala.inline
      def setWorkflows(value: js.Array[Workflow]): Self = StObject.set(x, "workflows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkflowsUndefined: Self = StObject.set(x, "workflows", js.undefined)
      
      @scala.inline
      def setWorkflowsVarargs(value: Workflow*): Self = StObject.set(x, "workflows", js.Array(value :_*))
    }
  }
  
  @js.native
  trait QueryCellInfoEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns Kanban card.
      */
    var card: js.UndefOr[js.Any] = js.native
    
    /** Returns Kanban card.
      */
    var cell: js.UndefOr[js.Any] = js.native
    
    /** Returns the column object.
      */
    var column: js.UndefOr[js.Any] = js.native
    
    /** Returns current row record object (JSON).
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Returns the Kanban model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object QueryCellInfoEventArgs {
    
    @scala.inline
    def apply(): QueryCellInfoEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryCellInfoEventArgs]
    }
    
    @scala.inline
    implicit class QueryCellInfoEventArgsMutableBuilder[Self <: QueryCellInfoEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCard(value: js.Any): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
      
      @scala.inline
      def setCell(value: js.Any): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      @scala.inline
      def setColumn(value: js.Any): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ScrollSettings extends StObject {
    
    /** To allow the Kanban to freeze particular swimlane at the time of scrolling , until scroll reaches next swimlane and it continues.
      * @Default {false}
      */
    var allowFreezeSwimlane: js.UndefOr[Boolean] = js.native
    
    /** Gets or sets an object that indicates to render the Kanban with specified scroll height.
      * @Default {0}
      */
    var height: js.UndefOr[String | Double] = js.native
    
    /** Gets or sets an object that indicates to render the Kanban with specified scroll width.
      * @Default {auto}
      */
    var width: js.UndefOr[String | Double] = js.native
  }
  object ScrollSettings {
    
    @scala.inline
    def apply(): ScrollSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollSettings]
    }
    
    @scala.inline
    implicit class ScrollSettingsMutableBuilder[Self <: ScrollSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowFreezeSwimlane(value: Boolean): Self = StObject.set(x, "allowFreezeSwimlane", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowFreezeSwimlaneUndefined: Self = StObject.set(x, "allowFreezeSwimlane", js.undefined)
      
      @scala.inline
      def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait SearchSettings extends StObject {
    
    /** To customize the fields the searching operation can be perform.
      * @Default {Array}
      */
    var fields: js.UndefOr[js.Array[_]] = js.native
    
    /** To customize the ignore case based on searching.
      * @Default {true}
      */
    var ignoreCase: js.UndefOr[Boolean] = js.native
    
    /** To customize the searching string.
      */
    var key: js.UndefOr[String] = js.native
    
    /** To customize the operator based on searching.
      * @Default {contains}
      */
    var operator: js.UndefOr[String] = js.native
  }
  object SearchSettings {
    
    @scala.inline
    def apply(): SearchSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchSettings]
    }
    
    @scala.inline
    implicit class SearchSettingsMutableBuilder[Self <: SearchSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFields(value: js.Array[_]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setFieldsVarargs(value: js.Any*): Self = StObject.set(x, "fields", js.Array(value :_*))
      
      @scala.inline
      def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    }
  }
  
  @js.native
  trait StackedHeaderRow extends StObject {
    
    /** Gets or sets a value that indicates whether to add stacked header columns into the stacked header rows.
      * @Default {Array}
      */
    var stackedHeaderColumns: js.UndefOr[js.Array[StackedHeaderRowsStackedHeaderColumn]] = js.native
  }
  object StackedHeaderRow {
    
    @scala.inline
    def apply(): StackedHeaderRow = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StackedHeaderRow]
    }
    
    @scala.inline
    implicit class StackedHeaderRowMutableBuilder[Self <: StackedHeaderRow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStackedHeaderColumns(value: js.Array[StackedHeaderRowsStackedHeaderColumn]): Self = StObject.set(x, "stackedHeaderColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackedHeaderColumnsUndefined: Self = StObject.set(x, "stackedHeaderColumns", js.undefined)
      
      @scala.inline
      def setStackedHeaderColumnsVarargs(value: StackedHeaderRowsStackedHeaderColumn*): Self = StObject.set(x, "stackedHeaderColumns", js.Array(value :_*))
    }
  }
  
  @js.native
  trait StackedHeaderRowsStackedHeaderColumn extends StObject {
    
    /** Gets or sets a value that indicates the column for the particular stacked header column.
      * @Default {null}
      */
    var column: js.UndefOr[String] = js.native
    
    /** Gets or sets a value that indicates the headerText for the particular stacked header column.
      * @Default {null}
      */
    var headerText: js.UndefOr[String] = js.native
  }
  object StackedHeaderRowsStackedHeaderColumn {
    
    @scala.inline
    def apply(): StackedHeaderRowsStackedHeaderColumn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StackedHeaderRowsStackedHeaderColumn]
    }
    
    @scala.inline
    implicit class StackedHeaderRowsStackedHeaderColumnMutableBuilder[Self <: StackedHeaderRowsStackedHeaderColumn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      @scala.inline
      def setHeaderText(value: String): Self = StObject.set(x, "headerText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderTextUndefined: Self = StObject.set(x, "headerText", js.undefined)
    }
  }
  
  @js.native
  trait SwimlaneClickEventArgs extends StObject {
    
    /** Current Action name while swim lane clicked. Actions are "expand" or "collapse"
      */
    var action: js.UndefOr[String] = js.native
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the swim lane group data's.
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /** Returns the kanban model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns current swim lane row index.
      */
    var rowIndex: js.UndefOr[Double] = js.native
    
    /** Returns current target element.
      */
    var target: js.UndefOr[js.Any] = js.native
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object SwimlaneClickEventArgs {
    
    @scala.inline
    def apply(): SwimlaneClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwimlaneClickEventArgs]
    }
    
    @scala.inline
    implicit class SwimlaneClickEventArgsMutableBuilder[Self <: SwimlaneClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait SwimlaneSettings extends StObject {
    
    /** To enable or disable DragAndDrop across swim lane.
      * @Default {false}
      */
    var allowDragAndDrop: js.UndefOr[Boolean] = js.native
    
    /** Gets or sets an object that indicates to render the swimlane rows with specified swimlane headers.
      * @Default {[]}
      */
    var headers: js.UndefOr[js.Array[SwimlaneSettingsHeader]] = js.native
    
    /** To enable or disable items count in swim lane.
      * @Default {true}
      */
    var showCount: js.UndefOr[Boolean] = js.native
    
    /** To enable or disable empty swimlane on Kanban board.  It is used to shown empty swimlane when no data's present on headers key mapping value.
      * @Default {false}
      */
    var showEmptySwimlane: js.UndefOr[Boolean] = js.native
    
    /** Customize the settings for unassigned category of swim lane.
      * @Default {Object}
      */
    var unassignedGroup: js.UndefOr[SwimlaneSettingsUnassignedGroup] = js.native
  }
  object SwimlaneSettings {
    
    @scala.inline
    def apply(): SwimlaneSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwimlaneSettings]
    }
    
    @scala.inline
    implicit class SwimlaneSettingsMutableBuilder[Self <: SwimlaneSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowDragAndDrop(value: Boolean): Self = StObject.set(x, "allowDragAndDrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowDragAndDropUndefined: Self = StObject.set(x, "allowDragAndDrop", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Array[SwimlaneSettingsHeader]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHeadersVarargs(value: SwimlaneSettingsHeader*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      @scala.inline
      def setShowCount(value: Boolean): Self = StObject.set(x, "showCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCountUndefined: Self = StObject.set(x, "showCount", js.undefined)
      
      @scala.inline
      def setShowEmptySwimlane(value: Boolean): Self = StObject.set(x, "showEmptySwimlane", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowEmptySwimlaneUndefined: Self = StObject.set(x, "showEmptySwimlane", js.undefined)
      
      @scala.inline
      def setUnassignedGroup(value: SwimlaneSettingsUnassignedGroup): Self = StObject.set(x, "unassignedGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnassignedGroupUndefined: Self = StObject.set(x, "unassignedGroup", js.undefined)
    }
  }
  
  @js.native
  trait SwimlaneSettingsHeader extends StObject {
    
    /** Gets or sets a value that indicates to render the Kanban with specified swimlane header key.
      * @Default {null}
      */
    var key: js.UndefOr[String] = js.native
    
    /** Gets or sets a value that indicates to render the Kanban with specified swimlane header text.
      * @Default {null}
      */
    var text: js.UndefOr[String] = js.native
  }
  object SwimlaneSettingsHeader {
    
    @scala.inline
    def apply(): SwimlaneSettingsHeader = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwimlaneSettingsHeader]
    }
    
    @scala.inline
    implicit class SwimlaneSettingsHeaderMutableBuilder[Self <: SwimlaneSettingsHeader] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  @js.native
  trait SwimlaneSettingsUnassignedGroup extends StObject {
    
    /** To enable or disable unassigned category change with swim lane key values.
      * @Default {true}
      */
    var enable: js.UndefOr[Boolean] = js.native
    
    /** To set the user defined values which are need to categorized as unassigned category swim lane groups.
      * @Default {[null,undefined,]}
      */
    var keys: js.UndefOr[js.Array[_]] = js.native
  }
  object SwimlaneSettingsUnassignedGroup {
    
    @scala.inline
    def apply(): SwimlaneSettingsUnassignedGroup = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwimlaneSettingsUnassignedGroup]
    }
    
    @scala.inline
    implicit class SwimlaneSettingsUnassignedGroupMutableBuilder[Self <: SwimlaneSettingsUnassignedGroup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      @scala.inline
      def setKeys(value: js.Array[_]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      @scala.inline
      def setKeysVarargs(value: js.Any*): Self = StObject.set(x, "keys", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ToolbarClickEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the current item.
      */
    var currentTarget: js.UndefOr[js.Any] = js.native
    
    /** Returns the item id of that current element.
      */
    var itemId: js.UndefOr[String] = js.native
    
    /** Returns the item index of that current element.
      */
    var itemIndex: js.UndefOr[Double] = js.native
    
    /** Returns the item name of that current element.
      */
    var itemName: js.UndefOr[String] = js.native
    
    /** Returns the item text of that current element.
      */
    var itemText: js.UndefOr[String] = js.native
    
    /** Returns the Kanban model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the toolbar object of the Kanban.
      */
    var toolbarData: js.UndefOr[js.Any] = js.native
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ToolbarClickEventArgs {
    
    @scala.inline
    def apply(): ToolbarClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarClickEventArgs]
    }
    
    @scala.inline
    implicit class ToolbarClickEventArgsMutableBuilder[Self <: ToolbarClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCurrentTarget(value: js.Any): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentTargetUndefined: Self = StObject.set(x, "currentTarget", js.undefined)
      
      @scala.inline
      def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
      
      @scala.inline
      def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIndexUndefined: Self = StObject.set(x, "itemIndex", js.undefined)
      
      @scala.inline
      def setItemName(value: String): Self = StObject.set(x, "itemName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemNameUndefined: Self = StObject.set(x, "itemName", js.undefined)
      
      @scala.inline
      def setItemText(value: String): Self = StObject.set(x, "itemText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemTextUndefined: Self = StObject.set(x, "itemText", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setToolbarData(value: js.Any): Self = StObject.set(x, "toolbarData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarDataUndefined: Self = StObject.set(x, "toolbarData", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait TooltipSettings extends StObject {
    
    /** To enable or disable the tooltip display.
      * @Default {false}
      */
    var enable: js.UndefOr[Boolean] = js.native
    
    /** To customize the tooltip display based on your requirements.
      * @Default {null}
      */
    var template: js.UndefOr[String] = js.native
  }
  object TooltipSettings {
    
    @scala.inline
    def apply(): TooltipSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipSettings]
    }
    
    @scala.inline
    implicit class TooltipSettingsMutableBuilder[Self <: TooltipSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
  
  @js.native
  trait Workflow extends StObject {
    
    /** Gets or sets an object that indicates to render the Kanban with specified workflows allowed Transitions.
      * @Default {null}
      */
    var allowedTransitions: js.UndefOr[String] = js.native
    
    /** Gets or sets an object that indicates to render the Kanban with specified workflows key.
      * @Default {null}
      */
    var key: js.UndefOr[String | Double] = js.native
  }
  object Workflow {
    
    @scala.inline
    def apply(): Workflow = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Workflow]
    }
    
    @scala.inline
    implicit class WorkflowMutableBuilder[Self <: Workflow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowedTransitions(value: String): Self = StObject.set(x, "allowedTransitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedTransitionsUndefined: Self = StObject.set(x, "allowedTransitions", js.undefined)
      
      @scala.inline
      def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
}
