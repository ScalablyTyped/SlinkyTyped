package typingsSlinky.reactJsonView

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactJsonView.reactJsonViewBooleans.`false`
import typingsSlinky.reactJsonView.reactJsonViewStrings.`object`
import typingsSlinky.reactJsonView.reactJsonViewStrings.array
import typingsSlinky.reactJsonView.reactJsonViewStrings.circle
import typingsSlinky.reactJsonView.reactJsonViewStrings.square
import typingsSlinky.reactJsonView.reactJsonViewStrings.triangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-json-view", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ReactJsonViewProps] = js.native
  
  @js.native
  trait CollapsedFieldProps extends StObject {
    
    /**
      * The name of the entry.
      */
    var name: String | Null = js.native
    
    /**
      * The scopes above the current entry.
      */
    var namespace: js.Array[String | Null] = js.native
    
    /**
      * The corresponding JSON subtree.
      */
    var src: js.Object = js.native
    
    /**
      * The type of src. Can only be "array" or "object".
      */
    var `type`: array | `object` = js.native
  }
  object CollapsedFieldProps {
    
    @scala.inline
    def apply(namespace: js.Array[String | Null], src: js.Object, `type`: array | `object`): CollapsedFieldProps = {
      val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollapsedFieldProps]
    }
    
    @scala.inline
    implicit class CollapsedFieldPropsMutableBuilder[Self <: CollapsedFieldProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameNull: Self = StObject.set(x, "name", null)
      
      @scala.inline
      def setNamespace(value: js.Array[String | Null]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespaceVarargs(value: (String | Null)*): Self = StObject.set(x, "namespace", js.Array(value :_*))
      
      @scala.inline
      def setSrc(value: js.Object): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: array | `object`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InteractionProps extends StObject {
    
    /**
      * The existing subtree of the JSON tree.
      */
    var existing_src: js.Object = js.native
    
    /**
      * The original value of the entry that is interacted with.
      */
    var existing_value: js.Object | String | Double | Boolean | Null = js.native
    
    /**
      * The key of the entry that is interacted with.
      */
    var name: String | Null = js.native
    
    /**
      * List of keys.
      */
    var namespace: js.Array[String | Null] = js.native
    
    /**
      * The updated value of the entry that is interacted with.
      */
    var new_value: js.UndefOr[js.Object | String | Double | Boolean | Null] = js.native
    
    /**
      * The updated subtree of the JSON tree.
      */
    var updated_src: js.Object = js.native
  }
  object InteractionProps {
    
    @scala.inline
    def apply(existing_src: js.Object, namespace: js.Array[String | Null], updated_src: js.Object): InteractionProps = {
      val __obj = js.Dynamic.literal(existing_src = existing_src.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], updated_src = updated_src.asInstanceOf[js.Any])
      __obj.asInstanceOf[InteractionProps]
    }
    
    @scala.inline
    implicit class InteractionPropsMutableBuilder[Self <: InteractionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExisting_src(value: js.Object): Self = StObject.set(x, "existing_src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExisting_value(value: js.Object | String | Double | Boolean): Self = StObject.set(x, "existing_value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExisting_valueNull: Self = StObject.set(x, "existing_value", null)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameNull: Self = StObject.set(x, "name", null)
      
      @scala.inline
      def setNamespace(value: js.Array[String | Null]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespaceVarargs(value: (String | Null)*): Self = StObject.set(x, "namespace", js.Array(value :_*))
      
      @scala.inline
      def setNew_value(value: js.Object | String | Double | Boolean): Self = StObject.set(x, "new_value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNew_valueNull: Self = StObject.set(x, "new_value", null)
      
      @scala.inline
      def setNew_valueUndefined: Self = StObject.set(x, "new_value", js.undefined)
      
      @scala.inline
      def setUpdated_src(value: js.Object): Self = StObject.set(x, "updated_src", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OnCopyProps extends StObject {
    
    /**
      * The last key in the namespace array.
      */
    var name: String | Null = js.native
    
    /**
      * List of keys.
      */
    var namespace: js.Array[String | Null] = js.native
    
    /**
      * The JSON tree source object
      */
    var src: js.Object = js.native
  }
  object OnCopyProps {
    
    @scala.inline
    def apply(namespace: js.Array[String | Null], src: js.Object): OnCopyProps = {
      val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnCopyProps]
    }
    
    @scala.inline
    implicit class OnCopyPropsMutableBuilder[Self <: OnCopyProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameNull: Self = StObject.set(x, "name", null)
      
      @scala.inline
      def setNamespace(value: js.Array[String | Null]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespaceVarargs(value: (String | Null)*): Self = StObject.set(x, "namespace", js.Array(value :_*))
      
      @scala.inline
      def setSrc(value: js.Object): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OnSelectProps extends StObject {
    
    /**
      * The name of the currently selected entry.
      */
    var name: String | Null = js.native
    
    /**
      * List of keys representing the scopes above the selected entry.
      */
    var namespace: js.Array[String | Null] = js.native
    
    /**
      * The type of the value. For "number" type, it will be replaced with the more
      * accurate types: "float", "integer", or "nan".
      */
    var `type`: String = js.native
    
    /**
      * The value of the currently selected entry.
      */
    var value: js.Object | String | Double | Boolean | Null = js.native
  }
  object OnSelectProps {
    
    @scala.inline
    def apply(namespace: js.Array[String | Null], `type`: String): OnSelectProps = {
      val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnSelectProps]
    }
    
    @scala.inline
    implicit class OnSelectPropsMutableBuilder[Self <: OnSelectProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameNull: Self = StObject.set(x, "name", null)
      
      @scala.inline
      def setNamespace(value: js.Array[String | Null]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespaceVarargs(value: (String | Null)*): Self = StObject.set(x, "namespace", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Object | String | Double | Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
    }
  }
  
  @js.native
  trait ReactJsonViewProps extends StObject {
    
    /**
      * When an integer value is assigned, strings will be cut off at that length.
      * Collapsed strings are followed by an ellipsis.
      * String content can be expanded and collapsed by clicking on the string value.
      *
      * Default: false
      */
    var collapseStringsAfterLength: js.UndefOr[Double | `false`] = js.native
    
    /**
      * When set to true, all nodes will be collapsed by default.
      * Use an integer value to collapse at a particular depth.
      *
      * Default: false
      */
    var collapsed: js.UndefOr[Boolean | Double] = js.native
    
    /**
      * Set to a value to be used as defaultValue when adding new key to json
      *
      * Default: null
      */
    var defaultValue: js.UndefOr[TypeDefaultValue | js.Array[TypeDefaultValue] | Null] = js.native
    
    /**
      * When set to true, data type labels prefix values.
      *
      * Default: true
      */
    var displayDataTypes: js.UndefOr[Boolean] = js.native
    
    /**
      * When set to true, objects and arrays are labeled with size.
      *
      * Default: true
      */
    var displayObjectSize: js.UndefOr[Boolean] = js.native
    
    /**
      * When prop is not false, the user can copy objects and arrays to clipboard by clicking on the clipboard icon.
      * Copy callbacks are supported.
      *
      * Default: true
      */
    var enableClipboard: js.UndefOr[Boolean | (js.Function1[/* copy */ OnCopyProps, Unit])] = js.native
    
    /**
      * When an integer value is assigned, arrays will be displayed in groups by count of the value.
      * Groups are displayed with brakcet notation and can be expanded and collapsed by clickong on the brackets.
      *
      * Default: 100
      */
    var groupArraysAfterLength: js.UndefOr[Double] = js.native
    
    /**
      * Style of expand/collapse icons. Accepted values are "circle", triangle" or "square".
      *
      * Default: {}
      */
    var iconStyle: js.UndefOr[circle | triangle | square] = js.native
    
    /**
      * Set the indent-width for nested objects.
      *
      * Default: 4
      */
    var indentWidth: js.UndefOr[Double] = js.native
    
    /**
      * Contains the name of your root node. Use null or false for no name.
      *
      * Default: "root"
      */
    var name: js.UndefOr[String | Null | `false`] = js.native
    
    /**
      * When a callback function is passed in, add functionality is enabled.
      * The callback is invoked before additions are completed.
      * Returning false from onAdd will prevent the change from being made. see: onAdd docs
      *
      * Default: false
      */
    var onAdd: js.UndefOr[(js.Function1[/* add */ InteractionProps, `false` | _]) | `false`] = js.native
    
    /**
      * When a callback function is passed in, delete functionality is enabled.
      * The callback is invoked before deletions are completed.
      * Returning false from onDelete will prevent the change from being made. see: onDelete docs
      *
      * Default: false
      */
    var onDelete: js.UndefOr[(js.Function1[/* del */ InteractionProps, `false` | _]) | `false`] = js.native
    
    /**
      * When a callback function is passed in, edit functionality is enabled.
      * The callback is invoked before edits are completed. Returning false
      * from onEdit will prevent the change from being made. see: onEdit docs.
      *
      * Default: false
      */
    var onEdit: js.UndefOr[(js.Function1[/* edit */ InteractionProps, `false` | _]) | `false`] = js.native
    
    /**
      * When a function is passed in, clicking a value triggers the onSelect method to be called.
      *
      * Default: false
      */
    var onSelect: js.UndefOr[(js.Function1[/* select */ OnSelectProps, Unit]) | `false`] = js.native
    
    /**
      * Callback function to provide control over what objects and arrays should be collapsed by default.
      * An object is passed to the callback containing name, src, type ("array" or "object") and namespace.
      *
      * Default: false
      */
    var shouldCollapse: js.UndefOr[`false` | (js.Function1[/* field */ CollapsedFieldProps, Boolean])] = js.native
    
    /**
      * Set to true to sort object keys.
      *
      * Default: false
      */
    var sortKeys: js.UndefOr[Boolean] = js.native
    
    /**
      * This property contains your input JSON.
      *
      * Required.
      */
    var src: js.Object = js.native
    
    /**
      * Style attributes for react-json-view container.
      * Explicit style attributes will override attributes provided by a theme.
      *
      * Default: "rjv-default"
      */
    var style: js.UndefOr[CSSProperties] = js.native
    
    /**
      * RJV supports base-16 themes. Check out the list of supported themes in the demo.
      * A custom "rjv-default" theme applies by default.
      *
      * Default: "rjv-default"
      */
    var theme: js.UndefOr[ThemeKeys | ThemeObject] = js.native
    
    /**
      * Custom message for validation failures to onEdit, onAdd, or onDelete callbacks.
      *
      * Default: "Validation Error"
      */
    var validationMessage: js.UndefOr[String] = js.native
  }
  object ReactJsonViewProps {
    
    @scala.inline
    def apply(src: js.Object): ReactJsonViewProps = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactJsonViewProps]
    }
    
    @scala.inline
    implicit class ReactJsonViewPropsMutableBuilder[Self <: ReactJsonViewProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollapseStringsAfterLength(value: Double | `false`): Self = StObject.set(x, "collapseStringsAfterLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseStringsAfterLengthUndefined: Self = StObject.set(x, "collapseStringsAfterLength", js.undefined)
      
      @scala.inline
      def setCollapsed(value: Boolean | Double): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: TypeDefaultValue | js.Array[TypeDefaultValue]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDefaultValueVarargs(value: TypeDefaultValue*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      @scala.inline
      def setDisplayDataTypes(value: Boolean): Self = StObject.set(x, "displayDataTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayDataTypesUndefined: Self = StObject.set(x, "displayDataTypes", js.undefined)
      
      @scala.inline
      def setDisplayObjectSize(value: Boolean): Self = StObject.set(x, "displayObjectSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayObjectSizeUndefined: Self = StObject.set(x, "displayObjectSize", js.undefined)
      
      @scala.inline
      def setEnableClipboard(value: Boolean | (js.Function1[/* copy */ OnCopyProps, Unit])): Self = StObject.set(x, "enableClipboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableClipboardFunction1(value: /* copy */ OnCopyProps => Unit): Self = StObject.set(x, "enableClipboard", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEnableClipboardUndefined: Self = StObject.set(x, "enableClipboard", js.undefined)
      
      @scala.inline
      def setGroupArraysAfterLength(value: Double): Self = StObject.set(x, "groupArraysAfterLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupArraysAfterLengthUndefined: Self = StObject.set(x, "groupArraysAfterLength", js.undefined)
      
      @scala.inline
      def setIconStyle(value: circle | triangle | square): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
      
      @scala.inline
      def setIndentWidth(value: Double): Self = StObject.set(x, "indentWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentWidthUndefined: Self = StObject.set(x, "indentWidth", js.undefined)
      
      @scala.inline
      def setName(value: String | `false`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameNull: Self = StObject.set(x, "name", null)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnAdd(value: (js.Function1[/* add */ InteractionProps, `false` | _]) | `false`): Self = StObject.set(x, "onAdd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnAddFunction1(value: /* add */ InteractionProps => `false` | _): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
      
      @scala.inline
      def setOnDelete(value: (js.Function1[/* del */ InteractionProps, `false` | _]) | `false`): Self = StObject.set(x, "onDelete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDeleteFunction1(value: /* del */ InteractionProps => `false` | _): Self = StObject.set(x, "onDelete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDeleteUndefined: Self = StObject.set(x, "onDelete", js.undefined)
      
      @scala.inline
      def setOnEdit(value: (js.Function1[/* edit */ InteractionProps, `false` | _]) | `false`): Self = StObject.set(x, "onEdit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnEditFunction1(value: /* edit */ InteractionProps => `false` | _): Self = StObject.set(x, "onEdit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEditUndefined: Self = StObject.set(x, "onEdit", js.undefined)
      
      @scala.inline
      def setOnSelect(value: (js.Function1[/* select */ OnSelectProps, Unit]) | `false`): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSelectFunction1(value: /* select */ OnSelectProps => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setShouldCollapse(value: `false` | (js.Function1[/* field */ CollapsedFieldProps, Boolean])): Self = StObject.set(x, "shouldCollapse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldCollapseFunction1(value: /* field */ CollapsedFieldProps => Boolean): Self = StObject.set(x, "shouldCollapse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShouldCollapseUndefined: Self = StObject.set(x, "shouldCollapse", js.undefined)
      
      @scala.inline
      def setSortKeys(value: Boolean): Self = StObject.set(x, "sortKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortKeysUndefined: Self = StObject.set(x, "sortKeys", js.undefined)
      
      @scala.inline
      def setSrc(value: js.Object): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTheme(value: ThemeKeys | ThemeObject): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setValidationMessage(value: String): Self = StObject.set(x, "validationMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationMessageUndefined: Self = StObject.set(x, "validationMessage", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactJsonView.reactJsonViewStrings.apathy
    - typingsSlinky.reactJsonView.reactJsonViewStrings.apathyColoninverted
    - typingsSlinky.reactJsonView.reactJsonViewStrings.ashes
    - typingsSlinky.reactJsonView.reactJsonViewStrings.bespin
    - typingsSlinky.reactJsonView.reactJsonViewStrings.brewer
    - typingsSlinky.reactJsonView.reactJsonViewStrings.brightColoninverted
    - typingsSlinky.reactJsonView.reactJsonViewStrings.bright
    - typingsSlinky.reactJsonView.reactJsonViewStrings.chalk
    - typingsSlinky.reactJsonView.reactJsonViewStrings.codeschool
    - typingsSlinky.reactJsonView.reactJsonViewStrings.colors
    - typingsSlinky.reactJsonView.reactJsonViewStrings.eighties
    - typingsSlinky.reactJsonView.reactJsonViewStrings.embers
    - typingsSlinky.reactJsonView.reactJsonViewStrings.flat
    - typingsSlinky.reactJsonView.reactJsonViewStrings.google
    - typingsSlinky.reactJsonView.reactJsonViewStrings.grayscale
    - typingsSlinky.reactJsonView.reactJsonViewStrings.grayscaleColoninverted
    - typingsSlinky.reactJsonView.reactJsonViewStrings.greenscreen
    - typingsSlinky.reactJsonView.reactJsonViewStrings.harmonic
    - typingsSlinky.reactJsonView.reactJsonViewStrings.hopscotch
    - typingsSlinky.reactJsonView.reactJsonViewStrings.isotope
    - typingsSlinky.reactJsonView.reactJsonViewStrings.marrakesh
    - typingsSlinky.reactJsonView.reactJsonViewStrings.mocha
    - typingsSlinky.reactJsonView.reactJsonViewStrings.monokai
    - typingsSlinky.reactJsonView.reactJsonViewStrings.ocean
    - typingsSlinky.reactJsonView.reactJsonViewStrings.paraiso
    - typingsSlinky.reactJsonView.reactJsonViewStrings.pop
    - typingsSlinky.reactJsonView.reactJsonViewStrings.railscasts
    - typingsSlinky.reactJsonView.reactJsonViewStrings.`rjv-default`
    - typingsSlinky.reactJsonView.reactJsonViewStrings.shapeshifter
    - typingsSlinky.reactJsonView.reactJsonViewStrings.shapeshifterColoninverted
    - typingsSlinky.reactJsonView.reactJsonViewStrings.solarized
    - typingsSlinky.reactJsonView.reactJsonViewStrings.summerfruit
    - typingsSlinky.reactJsonView.reactJsonViewStrings.summerfruitColoninverted
    - typingsSlinky.reactJsonView.reactJsonViewStrings.threezerotwofour
    - typingsSlinky.reactJsonView.reactJsonViewStrings.tomorrow
    - typingsSlinky.reactJsonView.reactJsonViewStrings.tube
    - typingsSlinky.reactJsonView.reactJsonViewStrings.twilight
  */
  trait ThemeKeys extends StObject
  object ThemeKeys {
    
    @scala.inline
    def apathy: typingsSlinky.reactJsonView.reactJsonViewStrings.apathy = "apathy".asInstanceOf[typingsSlinky.reactJsonView.reactJsonViewStrings.apathy]
    
    @scala.inline
    def apathyColoninverted: typingsSlinky.reactJsonView.reactJsonViewStrings.apathyColoninverted = "apathy:inverted".asInstanceOf[typingsSlinky.reactJsonView.reactJsonViewStrings.apathyColoninverted]
    
    @scala.inline
    def ashes: typingsSlinky.reactJsonView.reactJsonViewStrings.ashes = "ashes".asInstanceOf[typingsSlinky.reactJsonView.reactJsonViewStrings.ashes]
    
    @scala.inline
    def bespin: typingsSlinky.reactJsonView.reactJsonViewStrings.bespin = "bespin".asInstanceOf[typingsSlinky.reactJsonView.reactJsonViewStrings.bespin]
    
    @scala.inline
    def brewer: typingsSlinky.reactJsonView.reactJsonViewStrings.brewer = "brewer".asInstanceOf[typingsSlinky.reactJsonView.reactJsonViewStrings.brewer]
    
    @scala.inline
    def bright: typingsSlinky.reactJsonView.reactJsonViewStrings.bright = "bright".asInstanceOf[typingsSlinky.reactJsonView.reactJsonViewStrings.bright]
    
    @scala.inline
    def brightColoninverted: typingsSlinky.reactJsonView.reactJsonViewStrings.brightColoninverted = "bright:inverted".asInstanceOf[typingsSlinky.reactJsonView.reactJsonViewStrings.brightColoninverted]
    
    @scala.inline
    def chalk: typingsSlinky.reactJsonView.reactJsonViewStrings.chalk = "chalk".asInstanceOf[typingsSlinky.reactJsonView.reactJsonViewStrings.chalk]
    
    @scala.inline
    def codeschool: typingsSlinky.reactJsonView.reactJsonViewStrings.codeschool = "codeschool".asInstanceOf[typingsSlinky.reactJsonView.reactJsonViewStrings.codeschool]
    
    @scala.inline
    def colors: typingsSlinky.reactJsonView.reactJsonViewStrings.colors = "colors".asInstanceOf[typingsSlinky.reactJsonView.reactJsonViewStrings.colors]
    
    @scala.inline
    def eighties: typingsSlinky.reactJsonView.reactJsonViewStrings.eighties = "eighties".asInstanceOf[typingsSlinky.reactJsonView.reactJsonViewStrings.eighties]
    
    @scala.inline
    def embers: typingsSlinky.reactJsonView.reactJsonViewStrings.embers = "embers".asInstanceOf[typingsSlinky.reactJsonView.reactJsonViewStrings.embers]
    
    @scala.inline
    def flat: typingsSlinky.reactJsonView.reactJsonViewStrings.flat = "flat".asInstanceOf[typingsSlinky.reactJsonView.reactJsonViewStrings.flat]
    
    @scala.inline
    def google: typingsSlinky.reactJsonView.reactJsonViewStrings.google = "google".asInstanceOf[typingsSlinky.reactJsonView.reactJsonViewStrings.google]
    
    @scala.inline
    def grayscale: typingsSlinky.reactJsonView.reactJsonViewStrings.grayscale = "grayscale".asInstanceOf[typingsSlinky.reactJsonView.reactJsonViewStrings.grayscale]
    
    @scala.inline
    def grayscaleColoninverted: typingsSlinky.reactJsonView.reactJsonViewStrings.grayscaleColoninverted = "grayscale:inverted".asInstanceOf[typingsSlinky.reactJsonView.reactJsonViewStrings.grayscaleColoninverted]
    
    @scala.inline
    def greenscreen: typingsSlinky.reactJsonView.reactJsonViewStrings.greenscreen = "greenscreen".asInstanceOf[typingsSlinky.reactJsonView.reactJsonViewStrings.greenscreen]
    
    @scala.inline
    def harmonic: typingsSlinky.reactJsonView.reactJsonViewStrings.harmonic = "harmonic".asInstanceOf[typingsSlinky.reactJsonView.reactJsonViewStrings.harmonic]
    
    @scala.inline
    def hopscotch: typingsSlinky.reactJsonView.reactJsonViewStrings.hopscotch = "hopscotch".asInstanceOf[typingsSlinky.reactJsonView.reactJsonViewStrings.hopscotch]
    
    @scala.inline
    def isotope: typingsSlinky.reactJsonView.reactJsonViewStrings.isotope = "isotope".asInstanceOf[typingsSlinky.reactJsonView.reactJsonViewStrings.isotope]
    
    @scala.inline
    def marrakesh: typingsSlinky.reactJsonView.reactJsonViewStrings.marrakesh = "marrakesh".asInstanceOf[typingsSlinky.reactJsonView.reactJsonViewStrings.marrakesh]
    
    @scala.inline
    def mocha: typingsSlinky.reactJsonView.reactJsonViewStrings.mocha = "mocha".asInstanceOf[typingsSlinky.reactJsonView.reactJsonViewStrings.mocha]
    
    @scala.inline
    def monokai: typingsSlinky.reactJsonView.reactJsonViewStrings.monokai = "monokai".asInstanceOf[typingsSlinky.reactJsonView.reactJsonViewStrings.monokai]
    
    @scala.inline
    def ocean: typingsSlinky.reactJsonView.reactJsonViewStrings.ocean = "ocean".asInstanceOf[typingsSlinky.reactJsonView.reactJsonViewStrings.ocean]
    
    @scala.inline
    def paraiso: typingsSlinky.reactJsonView.reactJsonViewStrings.paraiso = "paraiso".asInstanceOf[typingsSlinky.reactJsonView.reactJsonViewStrings.paraiso]
    
    @scala.inline
    def pop: typingsSlinky.reactJsonView.reactJsonViewStrings.pop = "pop".asInstanceOf[typingsSlinky.reactJsonView.reactJsonViewStrings.pop]
    
    @scala.inline
    def railscasts: typingsSlinky.reactJsonView.reactJsonViewStrings.railscasts = "railscasts".asInstanceOf[typingsSlinky.reactJsonView.reactJsonViewStrings.railscasts]
    
    @scala.inline
    def `rjv-default`: typingsSlinky.reactJsonView.reactJsonViewStrings.`rjv-default` = "rjv-default".asInstanceOf[typingsSlinky.reactJsonView.reactJsonViewStrings.`rjv-default`]
    
    @scala.inline
    def shapeshifter: typingsSlinky.reactJsonView.reactJsonViewStrings.shapeshifter = "shapeshifter".asInstanceOf[typingsSlinky.reactJsonView.reactJsonViewStrings.shapeshifter]
    
    @scala.inline
    def shapeshifterColoninverted: typingsSlinky.reactJsonView.reactJsonViewStrings.shapeshifterColoninverted = "shapeshifter:inverted".asInstanceOf[typingsSlinky.reactJsonView.reactJsonViewStrings.shapeshifterColoninverted]
    
    @scala.inline
    def solarized: typingsSlinky.reactJsonView.reactJsonViewStrings.solarized = "solarized".asInstanceOf[typingsSlinky.reactJsonView.reactJsonViewStrings.solarized]
    
    @scala.inline
    def summerfruit: typingsSlinky.reactJsonView.reactJsonViewStrings.summerfruit = "summerfruit".asInstanceOf[typingsSlinky.reactJsonView.reactJsonViewStrings.summerfruit]
    
    @scala.inline
    def summerfruitColoninverted: typingsSlinky.reactJsonView.reactJsonViewStrings.summerfruitColoninverted = "summerfruit:inverted".asInstanceOf[typingsSlinky.reactJsonView.reactJsonViewStrings.summerfruitColoninverted]
    
    @scala.inline
    def threezerotwofour: typingsSlinky.reactJsonView.reactJsonViewStrings.threezerotwofour = "threezerotwofour".asInstanceOf[typingsSlinky.reactJsonView.reactJsonViewStrings.threezerotwofour]
    
    @scala.inline
    def tomorrow: typingsSlinky.reactJsonView.reactJsonViewStrings.tomorrow = "tomorrow".asInstanceOf[typingsSlinky.reactJsonView.reactJsonViewStrings.tomorrow]
    
    @scala.inline
    def tube: typingsSlinky.reactJsonView.reactJsonViewStrings.tube = "tube".asInstanceOf[typingsSlinky.reactJsonView.reactJsonViewStrings.tube]
    
    @scala.inline
    def twilight: typingsSlinky.reactJsonView.reactJsonViewStrings.twilight = "twilight".asInstanceOf[typingsSlinky.reactJsonView.reactJsonViewStrings.twilight]
  }
  
  @js.native
  trait ThemeObject extends StObject {
    
    var base00: String = js.native
    
    var base01: String = js.native
    
    var base02: String = js.native
    
    var base03: String = js.native
    
    var base04: String = js.native
    
    var base05: String = js.native
    
    var base06: String = js.native
    
    var base07: String = js.native
    
    var base08: String = js.native
    
    var base09: String = js.native
    
    var base0A: String = js.native
    
    var base0B: String = js.native
    
    var base0C: String = js.native
    
    var base0D: String = js.native
    
    var base0E: String = js.native
    
    var base0F: String = js.native
  }
  object ThemeObject {
    
    @scala.inline
    def apply(
      base00: String,
      base01: String,
      base02: String,
      base03: String,
      base04: String,
      base05: String,
      base06: String,
      base07: String,
      base08: String,
      base09: String,
      base0A: String,
      base0B: String,
      base0C: String,
      base0D: String,
      base0E: String,
      base0F: String
    ): ThemeObject = {
      val __obj = js.Dynamic.literal(base00 = base00.asInstanceOf[js.Any], base01 = base01.asInstanceOf[js.Any], base02 = base02.asInstanceOf[js.Any], base03 = base03.asInstanceOf[js.Any], base04 = base04.asInstanceOf[js.Any], base05 = base05.asInstanceOf[js.Any], base06 = base06.asInstanceOf[js.Any], base07 = base07.asInstanceOf[js.Any], base08 = base08.asInstanceOf[js.Any], base09 = base09.asInstanceOf[js.Any], base0A = base0A.asInstanceOf[js.Any], base0B = base0B.asInstanceOf[js.Any], base0C = base0C.asInstanceOf[js.Any], base0D = base0D.asInstanceOf[js.Any], base0E = base0E.asInstanceOf[js.Any], base0F = base0F.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeObject]
    }
    
    @scala.inline
    implicit class ThemeObjectMutableBuilder[Self <: ThemeObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase00(value: String): Self = StObject.set(x, "base00", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBase01(value: String): Self = StObject.set(x, "base01", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBase02(value: String): Self = StObject.set(x, "base02", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBase03(value: String): Self = StObject.set(x, "base03", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBase04(value: String): Self = StObject.set(x, "base04", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBase05(value: String): Self = StObject.set(x, "base05", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBase06(value: String): Self = StObject.set(x, "base06", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBase07(value: String): Self = StObject.set(x, "base07", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBase08(value: String): Self = StObject.set(x, "base08", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBase09(value: String): Self = StObject.set(x, "base09", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBase0A(value: String): Self = StObject.set(x, "base0A", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBase0B(value: String): Self = StObject.set(x, "base0B", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBase0C(value: String): Self = StObject.set(x, "base0C", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBase0D(value: String): Self = StObject.set(x, "base0D", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBase0E(value: String): Self = StObject.set(x, "base0E", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBase0F(value: String): Self = StObject.set(x, "base0F", value.asInstanceOf[js.Any])
    }
  }
  
  type TypeDefaultValue = String | Double | Boolean | js.Object
  
  type _To = ReactComponentClass[ReactJsonViewProps]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ReactComponentClass[ReactJsonViewProps] = default
}
