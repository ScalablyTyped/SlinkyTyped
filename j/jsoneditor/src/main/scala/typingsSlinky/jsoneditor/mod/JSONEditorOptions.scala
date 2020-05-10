package typingsSlinky.jsoneditor.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ace.AceAjax.Ace
import typingsSlinky.ajv.mod.Ajv
import typingsSlinky.jsoneditor.AnonPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONEditorOptions extends js.Object {
  /**
    * Provide a custom version of the Ace editor and use this instead of the version that comes embedded with JSONEditor. Only applicable when mode is 'code'.
    *
    * Note that when using the minimalist version of JSONEditor (which has Ace excluded), JSONEditor will try to load the Ace plugins `ace/mode/json` and `ace/ext/searchbox`.
    * These plugins must be loaded beforehand or be available in the folder of the Ace editor.
    */
  var ace: js.UndefOr[Ace] = js.native
  /**
    * Provide a custom instance of [ajv](https://github.com/epoberezkin/ajv), the library used for JSON schema validation.
    * @example { ajv: Ajv({ allErrors: true, verbose: true }) }
    */
  var ajv: js.UndefOr[Ajv] = js.native
  /**
    * Providing this will enable this feature in your editor in 'tree' mode.
    */
  var autocomplete: js.UndefOr[AutoCompleteOptions] = js.native
  /**
    * When true, values containing a color name or color code will have a color picker rendered on their left side.
    * @default true
    */
  var colorPicker: js.UndefOr[Boolean] = js.native
  /**
    * Create a query string based on query options filled in the Transform Wizard in the Transform modal. Normally used in combination with `executeQuery`.
    * The input for the function are the entered query options and the current JSON, and the output must be a string containing the query.
    * This query will be executed using `executeQuery`. Note that there is a special case '@' for filter.field and sort.field.
    * It means that the field itself is selected, for example when having an array containing numbers.
    */
  var createQuery: js.UndefOr[js.Function2[/* json */ js.Any, /* queryOptions */ QueryOptions, String]] = js.native
  /**
    * Enable sorting of arrays and object properties. Only applicable for mode 'tree'.
    * @default true
    */
  var enableSort: js.UndefOr[Boolean] = js.native
  /**
    * Enable filtering, sorting, and transforming JSON using a {@link https://jmespath.org/|JMESPath} query. Only applicable for mode 'tree'.
    * @default true
    */
  var enableTransform: js.UndefOr[Boolean] = js.native
  /**
    * If true, unicode characters are escaped and displayed as their hexadecimal code (like \\u260E) instead of of the character itself (like ☎).
    * @default false
    */
  var escapeUnicode: js.UndefOr[Boolean] = js.native
  /**
    * Replace the build-in query language used in the Transform modal with a custom language. Normally used in combination with `createQuery`.
    * The input for the function is the current JSON and a query string, and output must be the transformed JSON.
    */
  var executeQuery: js.UndefOr[js.Function2[/* json */ js.Any, /* query */ String, _]] = js.native
  /**
    * Enables history, adds a button Undo and Redo to the menu of the JSONEditor. Only applicable when mode is 'tree', 'form', or 'preview'.
    * @default true
    */
  var history: js.UndefOr[Boolean] = js.native
  /**
    * Number of indentation spaces. Only applicable when mode is 'code', 'text', or 'preview'.
    * @default 2
    */
  var indentation: js.UndefOr[Double] = js.native
  /**
    * The default language comes from the browser navigator, but you can force a specific language. So use here string as 'en' or 'pt-BR'.
    * Built-in languages: 'en', 'pt-BR', 'zh-CN', 'tr', 'ja', 'fr-FR'. Other translations can be specified via the option `languages`.
    */
  var language: js.UndefOr[String] = js.native
  /**
    * You can override existing translations or provide a new translation for a specific language. To do it provide an object at languages with language and the keys/values to be inserted.
    * All available fields for translation can be found in the source file `src/js/i18n.js`.
    * @example { 'pt-BR': { 'auto': 'Automático testing' }, 'en': { 'auto': 'Auto testing' } }
    */
  var languages: js.UndefOr[StringDictionary[StringDictionary[String]]] = js.native
  /**
    * Adds main menu bar. Contains format, sort, transform, search etc. functionality. Applicable in all modes.
    * @default true
    */
  var mainMenuBar: js.UndefOr[Boolean] = js.native
  /**
    * Number of children allowed for a given node before the 'show more/show all' message appears (in 'tree', 'view', or 'form' modes).
    * @default 100
    */
  var maxVisibleChilds: js.UndefOr[Double] = js.native
  /**
    * The container element where modals (like for sorting and filtering) are attached:
    * an overlay will be created on top of this container, and the modal will be created in the center of this container.
    */
  var modalAnchor: js.UndefOr[HTMLElement] = js.native
  /**
    * Set the editor mode. Available values: 'tree', 'view', 'form', 'code', 'text', 'preview'.
    * In 'view' mode, the data and datastructure is readonly. In 'form' mode, only the value can be changed, the data structure is readonly.
    * Mode 'code' requires the Ace editor to be loaded on the page. Mode 'text' shows the data as plain text.
    * The 'preview' mode can handle large JSON documents up to 500 MiB. It shows a preview of the data, and allows to transform, sort, filter, format, or compact the data.
    * @default 'tree'
    */
  var mode: js.UndefOr[JSONEditorMode] = js.native
  /**
    * Create a box in the editor menu where the user can switch between the specified modes.
    * @see mode.
    */
  var modes: js.UndefOr[js.Array[JSONEditorMode]] = js.native
  /**
    * Initial field name for the root node. Can also be set using `setName(name)`. Only applicable when mode is 'tree', 'view', or 'form'.
    * @default undefined
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Adds navigation bar to the menu. The navigation bar visualizes the current position on the tree structure as well as allows breadcrumbs navigation.
    * Only applicable when mode is 'tree', 'form' or 'view'.
    * @default true
    */
  var navigationBar: js.UndefOr[Boolean] = js.native
  /**
    * Set a callback function triggered when the contents of the JSONEditor change.
    * This callback does not pass the changed contents, use `get()` or `getText()` for that.
    * Note that `get()` can throw an exception in mode 'text', 'code', or 'preview', when the editor contains invalid JSON.
    * Will only be triggered on changes made by the user, not in case of programmatic changes via the functions `set`, `setText`, `update`, or `updateText`.
    * See also callback functions `onChangeJSON(json)` and `onChangeText(jsonString)`.
    */
  var onChange: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Set a callback function triggered when the contents of the JSONEditor change.
    * Passes the changed JSON document. Only applicable when option mode is 'tree', 'form', or 'view'.
    * The callback will only be triggered on changes made by the user, not in case of programmatic changes via the functions `set`, `setText`, `update`, or `updateText`.
    * Also see the callback function `onChangeText(jsonString)`.
    */
  var onChangeJSON: js.UndefOr[js.Function1[/* json */ js.Any, Unit]] = js.native
  /**
    * Set a callback function triggered when the contents of the JSONEditor change.
    * Passes the changed JSON document as a string.
    * The callback will only be triggered on changes made by the user, not in case of programmatic changes via the functions `set`, `setText`, `update`, or `updateText`.
    * Also see the callback function `onChangeJSON(json)`.
    */
  var onChangeText: js.UndefOr[js.Function1[/* jsonString */ String, Unit]] = js.native
  /**
    * Set a callback function to add custom CSS classes to the rendered nodes.
    * Only applicable when option mode is 'tree', 'form', or 'view'.
    * The function must either return a string containing CSS class names, or return undefined in order to do nothing for a specific node.
    * In order to update css classes when they depend on external state, you can call `editor.refresh()`.
    */
  var onClassName: js.UndefOr[js.Function1[/* classNameParams */ AnonPath, js.UndefOr[String]]] = js.native
  /**
    * Callback function triggered when the user clicks a color. Can be used to implement a custom color picker.
    * @param parent An HTML element where the color picker can be attached. JSONEditor comes with a built-in color picker,
    * powered by {@link https://github.com/Sphinxxxx/vanilla-picker|vanilla-picker}.
    * @param color The current color.
    * @param onChange A callback which has to be invoked with the new color selected in the color picker.
    */
  var onColorPicker: js.UndefOr[
    js.Function3[
      /* parent */ HTMLElement, 
      /* color */ String, 
      /* onChange */ js.Function1[/* color */ Color, Unit], 
      Unit
    ]
  ] = js.native
  /**
    * Set a callback function to customize the context menu in tree mode. Each time the user clicks on the context menu button, an array of menu items is created.
    * If this callback is configured, the array with menu items is passed to this function. The menu items can be customized in this function in any aspect of these menu items,
    * including deleting them and/or adding new items. The function should return the final array of menu items to be displayed to the user.
    * Each menu item is represented by an object, which may also contain a submenu array of items.
    */
  var onCreateMenu: js.UndefOr[
    js.Function2[/* menuItems */ js.Array[MenuItem], /* node */ MenuItemNode, js.Array[MenuItem]]
  ] = js.native
  /**
    * Set a callback function to determine whether individual nodes are editable or readonly.
    * Only applicable when option mode is 'tree', 'text', or 'code'.
    * In case of mode 'tree', the callback is invoked as `editable(node)`, where the first parameter is a `Node`.
    * The function must either return a boolean value to set both the nodes field and value editable or readonly,
    * or return `{ field: boolean; value: boolean }` to set the readonly attribute for field and value individually.
    * In modes 'text' and 'code', the callback is invoked as `editable(node)` where node is an empty object (no field, value, or path).
    * In that case the function can return false to make the text or code editor completely readonly.
    */
  var onEditable: js.UndefOr[js.Function1[/* node */ EditableNode | js.Object, Boolean | FieldEditable]] = js.native
  /**
    * Set a callback function triggered when an error occurs.
    * Invoked with the error as first argument. The callback is only invoked
    * for errors triggered by a users action, like switching from 'code' mode to 'tree' mode
    * or clicking the Format button whilst the editor doesn't contain valid JSON.
    */
  var onError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.native
  /**
    * Set a callback function that will be triggered when an event will occur in a JSON field or value. Only applicable when mode is 'form', 'tree' or 'view'.
    */
  var onEvent: js.UndefOr[js.Function2[/* node */ EditableNode, /* event */ String, Unit]] = js.native
  /**
    * Set a callback function triggered right after the mode is changed by the user.
    * Only applicable when the mode can be changed by the user (i.e. when option modes is set).
    */
  var onModeChange: js.UndefOr[js.Function2[/* newMode */ JSONEditorMode, /* oldMode */ JSONEditorMode, Unit]] = js.native
  /**
    * Customize the name of object and array nodes. By default the names are brackets with the number of children inside, like {5} and [32].
    * The number inside can be customized. using onNodeName. The onNodeName function should return a string containing the name for the node.
    * If nothing is returned, the size (number of children) will be displayed.
    */
  var onNodeName: js.UndefOr[js.Function1[/* nodeName */ NodeName, js.UndefOr[String]]] = js.native
  /**
    * Set a callback function triggered when Nodes are selected in the JSONEditor. Only applicable when mode is 'tree'.
    */
  var onSelectionChange: js.UndefOr[js.Function2[/* start */ SerializableNode, /* end */ SerializableNode, Unit]] = js.native
  /**
    * Set a callback function triggered when a text is selected in the JSONEditor. Only applicable when mode is 'code' or 'text'.
    */
  var onTextSelectionChange: js.UndefOr[
    js.Function3[/* start */ SelectionPosition, /* end */ SelectionPosition, /* text */ String, Unit]
  ] = js.native
  /**
    * Set a callback function for custom validation. Available in all modes.
    * On a change of the JSON, the callback function is invoked with the changed data.
    * The function should return an array with errors or null if there are no errors.
    * The function can also return a Promise resolving with the errors retrieved via an asynchronous validation (like sending a request to a server for validation).
    * Also see the option `schema` for JSON schema validation.
    */
  var onValidate: js.UndefOr[
    js.Function1[
      /* json */ js.Any, 
      js.Array[ValidationError] | js.Promise[js.Array[ValidationError]]
    ]
  ] = js.native
  /**
    * Set a callback function for validation and parse errors. Available in all modes.
    * On validation of the json, if errors of any kind were found this callback is invoked with the errors data.
    * On change, the callback will be invoked only if errors were changed.
    */
  var onValidationError: js.UndefOr[js.Function1[/* errors */ js.Array[SchemaValidationError | ParseError], Unit]] = js.native
  /**
    * The container element where popups (for example drop down menus, for JSON Schema error tooltips, and color pickers) will be absolutely positioned.
    * By default, this is the root `div` element of the editor itself. When the JSONEditor is inside a `div` element which hides overflowing contents (CSS overflow: auto or overflow: hidden),
    * tooltips will be visible only partly.
    * In this case, a popupAnchor outside of the element without hidden overflow will allow the tooltips to be visible when overflowing the `div` element of the JSONEditor.
    */
  var popupAnchor: js.UndefOr[HTMLElement] = js.native
  /**
    * A text description displayed on top of the Transform modal. Can be used to explain a custom query language implemented via `createQuery` and `executeQuery`.
    * The text can contain HTML code like a link to a web page.
    */
  var queryDescription: js.UndefOr[String] = js.native
  /**
    * Validate the JSON object against a JSON schema. A JSON schema describes the structure that a JSON object must have, like required properties or the type that a value must have.
    * Also see the option `onValidate` for custom validation.
    * @see http://json-schema.org/
    */
  var schema: js.UndefOr[js.Object] = js.native
  /**
    * Schemas that are referenced using the `$ref` property from the JSON schema that are set in the schema option, the object structure in the form of `{ reference_key: schemaObject }`.
    */
  var schemaRefs: js.UndefOr[js.Object] = js.native
  /**
    * Enables a search box in the upper right corner of the JSONEditor. Only applicable when mode is 'tree', 'view', or 'form'.
    * @default true
    */
  var search: js.UndefOr[Boolean] = js.native
  /**
    * If true, object keys in 'tree', 'view' or 'form' mode will be listed alphabetically instead by their insertion order.
    * Sorting is performed using a natural sort algorithm, which makes it easier to see objects that have string numbers as keys.
    * @default false
    */
  var sortObjectKeys: js.UndefOr[Boolean] = js.native
  /**
    * Adds status bar to the bottom of the editor. The status bar shows the cursor position and a count of the selected characters.
    * Only applicable when mode is 'code', 'text', or 'preview'.
    * @default true
    */
  var statusBar: js.UndefOr[Boolean] = js.native
  /**
    * Array of templates that will appear in the context menu, Each template is a json object precreated that can be added as a object value to any node in your document.
    */
  var templates: js.UndefOr[js.Array[Template]] = js.native
  /**
    * Set the Ace editor theme. Please note that only the default theme is included with JSONEditor, so if you specify another one you need to make sure it is loaded.
    * @default 'ace/theme/jsoneditor'
    */
  var theme: js.UndefOr[String] = js.native
  /**
    * Customizing the way formating the timestamp. Called when a value is timestamp after timestampTag. If it returns null, the timestamp would be formatted with default setting.
    * Only applicable for modes 'tree', 'form', and 'view'.
    * @default value => new Date(value).toISOString()
    */
  var timestampFormat: js.UndefOr[js.Function1[/* node */ TimestampNode, String | Null]] = js.native
  /**
    * By default (true), a tag with the date/time of a timestamp is displayed right from values containing a timestamp.
    * By default, a value is considered a timestamp when it is an integer number with a value larger than Jan 1th 2000, 946684800000.
    * When timestampTag a is a function, a timestamp tag will be displayed when this function returns true, and no timestamp is displayed when the function returns false.
    * When the function returns a non-boolean value like null or undefined, JSONEditor will fallback on the built-in rules to determine whether or not to show a timestamp.
    * Whether a value is a timestamp can be determined implicitly based on the value, or explicitly based on field or path.
    * You can for example test whether a field name contains a string like: 'date' or 'time'.
    * Only applicable for modes 'tree', 'form', and 'view'.
    * @default true
    * @example ({ field, value, path }) => field === 'dateCreated'
    */
  var timestampTag: js.UndefOr[Boolean | (js.Function1[/* node */ TimestampNode, Boolean])] = js.native
}

object JSONEditorOptions {
  @scala.inline
  def apply(): JSONEditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONEditorOptions]
  }
  @scala.inline
  implicit class JSONEditorOptionsOps[Self <: JSONEditorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAce(value: Ace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ace")(js.undefined)
        ret
    }
    @scala.inline
    def withAjv(value: Ajv): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAjv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajv")(js.undefined)
        ret
    }
    @scala.inline
    def withAutocomplete(value: AutoCompleteOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocomplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutocomplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocomplete")(js.undefined)
        ret
    }
    @scala.inline
    def withColorPicker(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorPicker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorPicker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorPicker")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateQuery(value: (/* json */ js.Any, /* queryOptions */ QueryOptions) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createQuery")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCreateQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableSort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSort")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableTransform(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTransform")(js.undefined)
        ret
    }
    @scala.inline
    def withEscapeUnicode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeUnicode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEscapeUnicode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeUnicode")(js.undefined)
        ret
    }
    @scala.inline
    def withExecuteQuery(value: (/* json */ js.Any, /* query */ String) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executeQuery")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutExecuteQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executeQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withHistory(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentation")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguages(value: StringDictionary[StringDictionary[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languages")(js.undefined)
        ret
    }
    @scala.inline
    def withMainMenuBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainMenuBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMainMenuBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainMenuBar")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxVisibleChilds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVisibleChilds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxVisibleChilds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVisibleChilds")(js.undefined)
        ret
    }
    @scala.inline
    def withModalAnchor(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalAnchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalAnchor")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: JSONEditorMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withModes(value: js.Array[JSONEditorMode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modes")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigationBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigationBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationBar")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChangeJSON(value: /* json */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeJSON")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChangeJSON: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeJSON")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChangeText(value: /* jsonString */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChangeText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeText")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClassName(value: /* classNameParams */ AnonPath => js.UndefOr[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClassName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withOnColorPicker(
      value: (/* parent */ HTMLElement, /* color */ String, /* onChange */ js.Function1[/* color */ Color, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColorPicker")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnColorPicker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColorPicker")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCreateMenu(value: (/* menuItems */ js.Array[MenuItem], /* node */ MenuItemNode) => js.Array[MenuItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCreateMenu")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnCreateMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCreateMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEditable(value: /* node */ EditableNode | js.Object => Boolean | FieldEditable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEditable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEditable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEditable")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: /* error */ js.Error => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEvent(value: (/* node */ EditableNode, /* event */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEvent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withOnModeChange(value: (/* newMode */ JSONEditorMode, /* oldMode */ JSONEditorMode) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onModeChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnModeChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onModeChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNodeName(value: /* nodeName */ NodeName => js.UndefOr[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnNodeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNodeName")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectionChange(value: (/* start */ SerializableNode, /* end */ SerializableNode) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSelectionChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTextSelectionChange(value: (/* start */ SelectionPosition, /* end */ SelectionPosition, /* text */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTextSelectionChange")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnTextSelectionChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTextSelectionChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnValidate(value: /* json */ js.Any => js.Array[ValidationError] | js.Promise[js.Array[ValidationError]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValidate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnValidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValidate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnValidationError(value: /* errors */ js.Array[SchemaValidationError | ParseError] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValidationError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnValidationError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValidationError")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupAnchor(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupAnchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupAnchor")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withSchema(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaRefs(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaRefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaRefs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaRefs")(js.undefined)
        ret
    }
    @scala.inline
    def withSearch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.undefined)
        ret
    }
    @scala.inline
    def withSortObjectKeys(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortObjectKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortObjectKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortObjectKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusBar")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplates(value: js.Array[Template]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templates")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestampFormat(value: /* node */ TimestampNode => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTimestampFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestampTagFunction1(value: /* node */ TimestampNode => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampTag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTimestampTag(value: Boolean | (js.Function1[/* node */ TimestampNode, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestampTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampTag")(js.undefined)
        ret
    }
  }
  
}

