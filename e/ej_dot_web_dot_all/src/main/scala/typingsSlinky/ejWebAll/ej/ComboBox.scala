package typingsSlinky.ejWebAll.ej

import org.scalajs.dom.raw.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComboBox extends Widget_ {
  
  /** Adds a new item to the popup list. By default, new item appends to the list as the last item, but you can insert based on the index parameter.
    * @returns {void}
    */
  def addItem(): Unit = js.native
  
  var defaults: Model = js.native
  
  /** Sets the focus to the component for interaction.
    * @returns {void}
    */
  def focusIn(): Unit = js.native
  
  /** Moves the focus from the component if the component is already focused.
    * @returns {void}
    */
  def focusOut(): Unit = js.native
  
  /** Gets the data object that matches the given value.
    * @returns {any}
    */
  def getDataByValue(): js.Any = js.native
  
  /** Gets all the list items bound on this component.
    * @returns {Element[]}
    */
  def getItems(): js.Array[Element] = js.native
  
  /** Hides the popup if it is in open state.
    * @returns {void}
    */
  def hidePopup(): Unit = js.native
  
  @JSName("model")
  var model_ComboBox: Model = js.native
  
  /** Opens the popup that displays the list of items.
    * @returns {void}
    */
  def showPopup(): Unit = js.native
}
object ComboBox {
  
  @js.native
  sealed trait SortOrder extends StObject
  @JSGlobal("ej.ComboBox.SortOrder")
  @js.native
  object SortOrder extends StObject {
    
    ///The data source is sorting with ascending order.
    @js.native
    sealed trait Ascending extends SortOrder
    
    ///The data source is sorting with descending order.
    @js.native
    sealed trait Descending extends SortOrder
    
    ///The data source is not sorting.
    @js.native
    sealed trait None extends SortOrder
  }
  
  @js.native
  trait ActionBeginEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the ComboBox model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event
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
  trait ActionCompleteEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the query for data retrieval from the Database
      */
    var e: js.UndefOr[js.Any] = js.native
    
    /** returns the Autocomplete model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event
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
      def setE(value: js.Any): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEUndefined: Self = StObject.set(x, "e", js.undefined)
      
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
  trait ActionFailureEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the error message
      */
    var e: js.UndefOr[js.Any] = js.native
    
    /** returns the Autocomplete model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event
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
      def setE(value: js.Any): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEUndefined: Self = StObject.set(x, "e", js.undefined)
      
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
  trait ChangeEventArgs extends StObject {
    
    /** Li element of the selected item.
      */
    var Item: js.UndefOr[js.Any] = js.native
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Event argument.
      */
    var e: js.UndefOr[js.Any] = js.native
    
    /** value of the interaction
      */
    var isInteracted: js.UndefOr[Boolean] = js.native
    
    /** Instance of the combobox model object.
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
    
    /** Value of the combobox textbox.
      */
    var value: js.UndefOr[String | Double] = js.native
  }
  object ChangeEventArgs {
    
    @scala.inline
    def apply(): ChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChangeEventArgs]
    }
    
    @scala.inline
    implicit class ChangeEventArgsMutableBuilder[Self <: ChangeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setE(value: js.Any): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEUndefined: Self = StObject.set(x, "e", js.undefined)
      
      @scala.inline
      def setIsInteracted(value: Boolean): Self = StObject.set(x, "isInteracted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInteractedUndefined: Self = StObject.set(x, "isInteracted", js.undefined)
      
      @scala.inline
      def setItem(value: js.Any): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait CloseEventArgs extends StObject {
    
    /** Element of the combobox popup list
      */
    var popup: js.UndefOr[js.Any] = js.native
  }
  object CloseEventArgs {
    
    @scala.inline
    def apply(): CloseEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CloseEventArgs]
    }
    
    @scala.inline
    implicit class CloseEventArgsMutableBuilder[Self <: CloseEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPopup(value: js.Any): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
    }
  }
  
  @js.native
  trait CreateEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Instance of the combobox model object.
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** Name of the event.
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
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait CustomValueSpecifierEventArgs extends StObject {
    
    /** Instance of the combobox model object.
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** text of the combobox.
      */
    var text: js.UndefOr[String] = js.native
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object CustomValueSpecifierEventArgs {
    
    @scala.inline
    def apply(): CustomValueSpecifierEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomValueSpecifierEventArgs]
    }
    
    @scala.inline
    implicit class CustomValueSpecifierEventArgsMutableBuilder[Self <: CustomValueSpecifierEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Fields extends StObject {
    
    /** Used to group the popup list items.
      * @Default {null}
      */
    var groupBy: js.UndefOr[String] = js.native
    
    /** Defines class for the item.
      * @Default {null}
      */
    var iconCss: js.UndefOr[String] = js.native
    
    /** Defines the specific field name in the data source to load the popup list with data.
      * @Default {null}
      */
    var text: js.UndefOr[String] = js.native
    
    /** Defines the specific field name which contains unique values for the list items.
      * @Default {null}
      */
    var value: js.UndefOr[String] = js.native
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
      def setGroupBy(value: String): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
      
      @scala.inline
      def setIconCss(value: String): Self = StObject.set(x, "iconCss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconCssUndefined: Self = StObject.set(x, "iconCss", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait FilteringEventArgs extends StObject {
    
    /** Instance of the combobox model object.
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** text of the combobox.
      */
    var text: js.UndefOr[String] = js.native
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
    
    /** Function used to update the filtering value.
      */
    var updateData: js.UndefOr[js.Any] = js.native
  }
  object FilteringEventArgs {
    
    @scala.inline
    def apply(): FilteringEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilteringEventArgs]
    }
    
    @scala.inline
    implicit class FilteringEventArgsMutableBuilder[Self <: FilteringEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUpdateData(value: js.Any): Self = StObject.set(x, "updateData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateDataUndefined: Self = StObject.set(x, "updateData", js.undefined)
    }
  }
  
  @js.native
  trait FocusEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Instance of the combobox model object.
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object FocusEventArgs {
    
    @scala.inline
    def apply(): FocusEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusEventArgs]
    }
    
    @scala.inline
    implicit class FocusEventArgsMutableBuilder[Self <: FocusEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
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
    
    /** Triggers before fetching data from the remote server.
      */
    var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, Unit]] = js.native
    
    /** Triggers after data is fetched successfully from the remote server.
      */
    var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, Unit]] = js.native
    
    /** Triggers when the data fetch request from the remote server fails.
      */
    var actionFailure: js.UndefOr[js.Function1[/* e */ ActionFailureEventArgs, Unit]] = js.native
    
    /** Accepts the template and assigns it to the popup list content of the component when the data fetch request from the remote server fails.
      * @Default {The Request Failed}
      */
    var actionFailureTemplate: js.UndefOr[String] = js.native
    
    /** Specifies whether the component allows user defined value which does not exist in data source.
      * @Default {true}
      */
    var allowCustom: js.UndefOr[Boolean] = js.native
    
    /** When allowFiltering is set to true, show the filter bar (search box) of the component. The filter action retrieves matched items through the filtering event based on the
      * characters typed in the search TextBox. If no match is found, the value of the noRecordsTemplate property will be displayed.
      * @Default {false}
      */
    var allowFiltering: js.UndefOr[Boolean] = js.native
    
    /** Specifies whether suggest a first matched item in input when searching. No action happens when no matches found.
      * @Default {false}
      */
    var autofill: js.UndefOr[Boolean] = js.native
    
    /** Triggers when an item in a popup is selected or when the model value is changed.
      */
    var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.native
    
    /** Triggers when the popup is closed.
      */
    var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, Unit]] = js.native
    
    /** Triggers when ComboBox widget is created.
      */
    var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
    
    /** Sets CSS classes to the root element of the component that helps customize the UI styles.
      * @Default {null}
      */
    var cssClass: js.UndefOr[String] = js.native
    
    /** Triggers on set a custom value to this component.
      */
    var customValueSpecifier: js.UndefOr[js.Function1[/* e */ CustomValueSpecifierEventArgs, Unit]] = js.native
    
    /** Accepts the list items either through local or remote service and binds it to the component. It can be an array of JSON objects or an instance of DataManager.
      * @Default {[]}
      */
    var dataSource: js.UndefOr[js.Any | js.Array[_]] = js.native
    
    /** When set to true, enables RTL mode of the component that displays the content in the right-to-left direction.
      * @Default {false}
      */
    var enableRtl: js.UndefOr[Boolean] = js.native
    
    /** Specifies a value that indicates whether the component is enabled or not.
      * @Default {true}
      */
    var enabled: js.UndefOr[Boolean] = js.native
    
    /** The fields property maps the columns of the data table and binds the data to the component.
      */
    var fields: js.UndefOr[Fields] = js.native
    
    /** Triggers on typing a character in the component.
      */
    var filtering: js.UndefOr[js.Function1[/* e */ FilteringEventArgs, Unit]] = js.native
    
    /** Triggers when the component is focused.
      */
    var focus: js.UndefOr[js.Function1[/* e */ FocusEventArgs, Unit]] = js.native
    
    /** Accepts the template design and assigns it to the footer container of the popup list.
      * @Default {null}
      */
    var footerTemplate: js.UndefOr[String] = js.native
    
    /** Accepts the template design and assigns it to the group headers present in the popup list.
      * @Default {null}
      */
    var groupTemplate: js.UndefOr[String] = js.native
    
    /** Accepts the template design and assigns it to the header container of the popup list.
      * @Default {null}
      */
    var headerTemplate: js.UndefOr[String] = js.native
    
    /** Allows additional HTML attributes such as title, name, etc., and accepts n number of attributes in a key-value pair format.
      * @Default {{}}
      */
    var htmlAttributes: js.UndefOr[js.Any] = js.native
    
    /** Gets or sets the index of the selected item in the component.
      * @Default {null}
      */
    var index: js.UndefOr[Double] = js.native
    
    /** Accepts the template design and assigns it to each list item present in the popup.
      * @Default {null}
      */
    var itemTemplate: js.UndefOr[String] = js.native
    
    /** Overrides the global culture and localization value for this component. Default global culture is 'en-US'.
      * @Default {en-US}
      */
    var locale: js.UndefOr[String] = js.native
    
    /** Accepts the template design and assigns it to popup list of component when no data is available on the component.
      * @Default {No Records Found}
      */
    var noRecordsTemplate: js.UndefOr[String] = js.native
    
    /** Triggers after the suggestion list is opened.
      */
    var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.native
    
    /** Accepts the value to be displayed as a watermark text on the component input.
      * @Default {null}
      */
    var placeholder: js.UndefOr[String] = js.native
    
    /** Specifies the height of the popup list.
      * @Default {300px}
      */
    var popupHeight: js.UndefOr[String | Double] = js.native
    
    /** Specifies the width of the popup list. By default, the popup width sets based on the width of the component.
      * @Default {100%}
      */
    var popupWidth: js.UndefOr[String | Double] = js.native
    
    /** The query to retrieve the data from the data source.
      * @Default {null}
      */
    var query: js.UndefOr[Query] = js.native
    
    /** When set to true, the user interactions on the component are disabled.
      * @Default {false}
      */
    var readonly: js.UndefOr[Boolean] = js.native
    
    /** Triggers when an item in the popup is selected.
      */
    var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, Unit]] = js.native
    
    /** Specifies whether to show or hide the clear button. When the clear button is clicked, value, text, and index properties are reset to null.
      * @Default {true}
      */
    var showClearButton: js.UndefOr[Boolean] = js.native
    
    /** Specifies the sortOrder to sort the data source. The available type of sort orders are
      * @Default {ej.SortOrder.None}
      */
    var sortOrder: js.UndefOr[SortOrder_ | String] = js.native
    
    /** Gets or sets the display text of the selected item in the component.
      * @Default {null}
      */
    var text: js.UndefOr[String] = js.native
    
    /** Gets or sets the value of the selected item in the component.
      * @Default {null}
      */
    var value: js.UndefOr[Double | String] = js.native
    
    /** Specifies the width of the component. By default, the component width sets based on the width of its parent container. You can also set the width in pixel values.
      * @Default {100%}
      */
    var width: js.UndefOr[Double | String] = js.native
  }
  object Model {
    
    @scala.inline
    def apply(): typingsSlinky.ejWebAll.ej.ComboBox.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.ejWebAll.ej.ComboBox.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typingsSlinky.ejWebAll.ej.ComboBox.Model] (val x: Self) extends AnyVal {
      
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
      def setActionFailureTemplate(value: String): Self = StObject.set(x, "actionFailureTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionFailureTemplateUndefined: Self = StObject.set(x, "actionFailureTemplate", js.undefined)
      
      @scala.inline
      def setActionFailureUndefined: Self = StObject.set(x, "actionFailure", js.undefined)
      
      @scala.inline
      def setAllowCustom(value: Boolean): Self = StObject.set(x, "allowCustom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowCustomUndefined: Self = StObject.set(x, "allowCustom", js.undefined)
      
      @scala.inline
      def setAllowFiltering(value: Boolean): Self = StObject.set(x, "allowFiltering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowFilteringUndefined: Self = StObject.set(x, "allowFiltering", js.undefined)
      
      @scala.inline
      def setAutofill(value: Boolean): Self = StObject.set(x, "autofill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutofillUndefined: Self = StObject.set(x, "autofill", js.undefined)
      
      @scala.inline
      def setChange(value: /* e */ ChangeEventArgs => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      @scala.inline
      def setClose(value: /* e */ CloseEventArgs => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setCustomValueSpecifier(value: /* e */ CustomValueSpecifierEventArgs => Unit): Self = StObject.set(x, "customValueSpecifier", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCustomValueSpecifierUndefined: Self = StObject.set(x, "customValueSpecifier", js.undefined)
      
      @scala.inline
      def setDataSource(value: js.Any | js.Array[_]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      @scala.inline
      def setDataSourceVarargs(value: js.Any*): Self = StObject.set(x, "dataSource", js.Array(value :_*))
      
      @scala.inline
      def setEnableRtl(value: Boolean): Self = StObject.set(x, "enableRtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableRtlUndefined: Self = StObject.set(x, "enableRtl", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setFields(value: Fields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setFiltering(value: /* e */ FilteringEventArgs => Unit): Self = StObject.set(x, "filtering", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilteringUndefined: Self = StObject.set(x, "filtering", js.undefined)
      
      @scala.inline
      def setFocus(value: /* e */ FocusEventArgs => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      @scala.inline
      def setFooterTemplate(value: String): Self = StObject.set(x, "footerTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterTemplateUndefined: Self = StObject.set(x, "footerTemplate", js.undefined)
      
      @scala.inline
      def setGroupTemplate(value: String): Self = StObject.set(x, "groupTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupTemplateUndefined: Self = StObject.set(x, "groupTemplate", js.undefined)
      
      @scala.inline
      def setHeaderTemplate(value: String): Self = StObject.set(x, "headerTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderTemplateUndefined: Self = StObject.set(x, "headerTemplate", js.undefined)
      
      @scala.inline
      def setHtmlAttributes(value: js.Any): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setItemTemplate(value: String): Self = StObject.set(x, "itemTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemTemplateUndefined: Self = StObject.set(x, "itemTemplate", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setNoRecordsTemplate(value: String): Self = StObject.set(x, "noRecordsTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoRecordsTemplateUndefined: Self = StObject.set(x, "noRecordsTemplate", js.undefined)
      
      @scala.inline
      def setOpen(value: /* e */ OpenEventArgs => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPopupHeight(value: String | Double): Self = StObject.set(x, "popupHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupHeightUndefined: Self = StObject.set(x, "popupHeight", js.undefined)
      
      @scala.inline
      def setPopupWidth(value: String | Double): Self = StObject.set(x, "popupWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupWidthUndefined: Self = StObject.set(x, "popupWidth", js.undefined)
      
      @scala.inline
      def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
      
      @scala.inline
      def setSelect(value: /* e */ SelectEventArgs => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      @scala.inline
      def setShowClearButton(value: Boolean): Self = StObject.set(x, "showClearButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowClearButtonUndefined: Self = StObject.set(x, "showClearButton", js.undefined)
      
      @scala.inline
      def setSortOrder(value: SortOrder_ | String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait OpenEventArgs extends StObject {
    
    /** Element of the combobox popup list
      */
    var popup: js.UndefOr[js.Any] = js.native
  }
  object OpenEventArgs {
    
    @scala.inline
    def apply(): OpenEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenEventArgs]
    }
    
    @scala.inline
    implicit class OpenEventArgsMutableBuilder[Self <: OpenEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPopup(value: js.Any): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
    }
  }
  
  @js.native
  trait SelectEventArgs extends StObject {
    
    /** Li element of the selected item.
      */
    var Item: js.UndefOr[js.Any] = js.native
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Event argument.
      */
    var e: js.UndefOr[js.Any] = js.native
    
    /** value of the interaction
      */
    var isInteracted: js.UndefOr[Boolean] = js.native
    
    /** Data object of the selected item.
      */
    var itemData: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** Instance of the combobox model object.
      */
    var model: js.UndefOr[typingsSlinky.ejWebAll.ej.Model] = js.native
    
    /** Text of the selected item.
      */
    var text: js.UndefOr[String] = js.native
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
    
    /** Value of the combobox textbox.
      */
    var value: js.UndefOr[String | Double] = js.native
  }
  object SelectEventArgs {
    
    @scala.inline
    def apply(): SelectEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectEventArgs]
    }
    
    @scala.inline
    implicit class SelectEventArgsMutableBuilder[Self <: SelectEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setE(value: js.Any): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEUndefined: Self = StObject.set(x, "e", js.undefined)
      
      @scala.inline
      def setIsInteracted(value: Boolean): Self = StObject.set(x, "isInteracted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInteractedUndefined: Self = StObject.set(x, "isInteracted", js.undefined)
      
      @scala.inline
      def setItem(value: js.Any): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemData(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
      
      @scala.inline
      def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      @scala.inline
      def setModel(value: typingsSlinky.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
