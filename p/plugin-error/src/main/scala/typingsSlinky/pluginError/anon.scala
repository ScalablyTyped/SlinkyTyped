package typingsSlinky.pluginError

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined plugin-error.plugin-error.Options & {  message :string} */
  @js.native
  trait Optionsmessagestring extends StObject {
    
    /**
      * File name where the error occurred
      */
    var fileName: js.UndefOr[String] = js.native
    
    /**
      * Line number where the error occurred
      */
    var lineNumber: js.UndefOr[Double] = js.native
    
    /**
      * Error message
      */
    var message: js.UndefOr[js.Any] with String = js.native
    
    /**
      * Error name
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * Error properties will be included in err.toString(). Can be omitted by
      * setting this to false.
      *
      * Default: `true`
      */
    var showProperties: js.UndefOr[Boolean] = js.native
    
    /**
      * By default the stack will not be shown. Set this to true if you think the
      * stack is important for your error.
      *
      * Default: `false`
      */
    var showStack: js.UndefOr[Boolean] = js.native
    
    /**
      * Error stack to use for `err.toString()` if `showStack` is `true`.
      * By default it uses the `stack` of the original error if you used one, otherwise it captures a new stack.
      */
    var stack: js.UndefOr[String] = js.native
  }
  object Optionsmessagestring {
    
    @scala.inline
    def apply(message: js.UndefOr[js.Any] with String): Optionsmessagestring = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionsmessagestring]
    }
    
    @scala.inline
    implicit class OptionsmessagestringMutableBuilder[Self <: Optionsmessagestring] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      @scala.inline
      def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
      
      @scala.inline
      def setMessage(value: js.UndefOr[js.Any] with String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setShowProperties(value: Boolean): Self = StObject.set(x, "showProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowPropertiesUndefined: Self = StObject.set(x, "showProperties", js.undefined)
      
      @scala.inline
      def setShowStack(value: Boolean): Self = StObject.set(x, "showStack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowStackUndefined: Self = StObject.set(x, "showStack", js.undefined)
      
      @scala.inline
      def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
  
  /* Inlined plugin-error.plugin-error.Options & {  plugin :string,   message :string} */
  @js.native
  trait Optionspluginstringmessag extends StObject {
    
    /**
      * File name where the error occurred
      */
    var fileName: js.UndefOr[String] = js.native
    
    /**
      * Line number where the error occurred
      */
    var lineNumber: js.UndefOr[Double] = js.native
    
    /**
      * Error message
      */
    var message: js.UndefOr[js.Any] with String = js.native
    
    /**
      * Error name
      */
    var name: js.UndefOr[String] = js.native
    
    var plugin: String = js.native
    
    /**
      * Error properties will be included in err.toString(). Can be omitted by
      * setting this to false.
      *
      * Default: `true`
      */
    var showProperties: js.UndefOr[Boolean] = js.native
    
    /**
      * By default the stack will not be shown. Set this to true if you think the
      * stack is important for your error.
      *
      * Default: `false`
      */
    var showStack: js.UndefOr[Boolean] = js.native
    
    /**
      * Error stack to use for `err.toString()` if `showStack` is `true`.
      * By default it uses the `stack` of the original error if you used one, otherwise it captures a new stack.
      */
    var stack: js.UndefOr[String] = js.native
  }
  object Optionspluginstringmessag {
    
    @scala.inline
    def apply(message: js.UndefOr[js.Any] with String, plugin: String): Optionspluginstringmessag = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionspluginstringmessag]
    }
    
    @scala.inline
    implicit class OptionspluginstringmessagMutableBuilder[Self <: Optionspluginstringmessag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      @scala.inline
      def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
      
      @scala.inline
      def setMessage(value: js.UndefOr[js.Any] with String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPlugin(value: String): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowProperties(value: Boolean): Self = StObject.set(x, "showProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowPropertiesUndefined: Self = StObject.set(x, "showProperties", js.undefined)
      
      @scala.inline
      def setShowStack(value: Boolean): Self = StObject.set(x, "showStack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowStackUndefined: Self = StObject.set(x, "showStack", js.undefined)
      
      @scala.inline
      def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
  
  /* Inlined plugin-error.plugin-error.PluginError<{}> */
  @js.native
  trait PluginError extends StObject {
    
    /**
      * File name where the error occurred
      */
    var fileName: js.UndefOr[String] = js.native
    
    /**
      * Line number where the error occurred
      */
    var lineNumber: js.UndefOr[Double] = js.native
    
    var message: String = js.native
    
    var name: String = js.native
    
    /**
      * Plugin name
      */
    var plugin: String = js.native
    
    /**
      * Boolean controlling if properties will be shown in `err.toString()`.
      */
    var showProperties: Boolean = js.native
    
    /**
      * Boolean controlling if the stack will be shown in `err.toString()`.
      */
    var showStack: Boolean = js.native
    
    var stack: js.UndefOr[String] = js.native
  }
  object PluginError {
    
    @scala.inline
    def apply(message: String, name: String, plugin: String, showProperties: Boolean, showStack: Boolean): PluginError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any], showProperties = showProperties.asInstanceOf[js.Any], showStack = showStack.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluginError]
    }
    
    @scala.inline
    implicit class PluginErrorMutableBuilder[Self <: PluginError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      @scala.inline
      def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlugin(value: String): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowProperties(value: Boolean): Self = StObject.set(x, "showProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowStack(value: Boolean): Self = StObject.set(x, "showStack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
}
