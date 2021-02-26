package typingsSlinky.firefoxWebextBrowser.browser

import typingsSlinky.firefoxWebextBrowser.browser.extensionTypes.ExtensionFileOrCode
import typingsSlinky.firefoxWebextBrowser.browser.extensionTypes.PlainJSONValue
import typingsSlinky.firefoxWebextBrowser.browser.extensionTypes.RunAt
import typingsSlinky.firefoxWebextBrowser.browser.manifest.MatchPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Manifest keys: `user_scripts`, `user_scripts`
  *
  * Not allowed in: Devtools pages
  */
object userScripts {
  
  @js.native
  trait OnBeforeScriptUserScript extends StObject {
    
    /**
      * Exports all the properties of a given plain object as userScript globals
      * @param sourceObject A plain object whose properties are exported as userScript globals
      */
    def defineGlobals(sourceObject: js.Object): Unit = js.native
    
    /**
      * Convert a given value to make it accessible to the userScript code
      * @param value A value to convert into an object accessible to the userScript
      */
    def export(value: js.Any): js.Any = js.native
    
    /** The userScript global */
    var global: js.Any = js.native
    
    /** The userScript metadata (as set in userScripts.register) */
    var metadata: js.Any = js.native
  }
  object OnBeforeScriptUserScript {
    
    @scala.inline
    def apply(defineGlobals: js.Object => Unit, export: js.Any => js.Any, global: js.Any, metadata: js.Any): OnBeforeScriptUserScript = {
      val __obj = js.Dynamic.literal(defineGlobals = js.Any.fromFunction1(defineGlobals), export = js.Any.fromFunction1(export), global = global.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnBeforeScriptUserScript]
    }
    
    @scala.inline
    implicit class OnBeforeScriptUserScriptMutableBuilder[Self <: OnBeforeScriptUserScript] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefineGlobals(value: js.Object => Unit): Self = StObject.set(x, "defineGlobals", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExport(value: js.Any => js.Any): Self = StObject.set(x, "export", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGlobal(value: js.Any): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    }
  }
  
  /** An object that represents a user script registered programmatically */
  @js.native
  trait RegisteredUserScript extends StObject {
    
    /** Unregister a user script registered programmatically */
    def unregister(): js.Promise[_] = js.native
  }
  object RegisteredUserScript {
    
    @scala.inline
    def apply(unregister: () => js.Promise[_]): RegisteredUserScript = {
      val __obj = js.Dynamic.literal(unregister = js.Any.fromFunction0(unregister))
      __obj.asInstanceOf[RegisteredUserScript]
    }
    
    @scala.inline
    implicit class RegisteredUserScriptMutableBuilder[Self <: RegisteredUserScript] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUnregister(value: () => js.Promise[_]): Self = StObject.set(x, "unregister", js.Any.fromFunction0(value))
    }
  }
  
  /* userScripts types */
  /** Details of a user script */
  @js.native
  trait UserScriptOptions extends StObject {
    
    /**
      * If allFrames is `true`, implies that the JavaScript should be injected into all frames of current page. By default, it's `false` and is only injected into the top frame.
      */
    var allFrames: js.UndefOr[Boolean] = js.native
    
    var excludeGlobs: js.UndefOr[js.Array[String]] = js.native
    
    var excludeMatches: js.UndefOr[js.Array[MatchPattern]] = js.native
    
    var includeGlobs: js.UndefOr[js.Array[String]] = js.native
    
    /** The list of JS files to inject */
    @JSName("js")
    var js_ : js.Array[ExtensionFileOrCode] = js.native
    
    /**
      * If matchAboutBlank is true, then the code is also injected in about:blank and about:srcdoc frames if your extension has access to its parent document. Code cannot be inserted in top-level about:-frames. By default it is `false`.
      */
    var matchAboutBlank: js.UndefOr[Boolean] = js.native
    
    var matches: js.Array[MatchPattern] = js.native
    
    /** The soonest that the JavaScript will be injected into the tab. Defaults to "document_idle". */
    var runAt: js.UndefOr[RunAt] = js.native
    
    /** An opaque user script metadata value */
    var scriptMetadata: js.UndefOr[PlainJSONValue] = js.native
  }
  object UserScriptOptions {
    
    @scala.inline
    def apply(js_ : js.Array[ExtensionFileOrCode], matches: js.Array[MatchPattern]): UserScriptOptions = {
      val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any])
      __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserScriptOptions]
    }
    
    @scala.inline
    implicit class UserScriptOptionsMutableBuilder[Self <: UserScriptOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllFrames(value: Boolean): Self = StObject.set(x, "allFrames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllFramesUndefined: Self = StObject.set(x, "allFrames", js.undefined)
      
      @scala.inline
      def setExcludeGlobs(value: js.Array[String]): Self = StObject.set(x, "excludeGlobs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeGlobsUndefined: Self = StObject.set(x, "excludeGlobs", js.undefined)
      
      @scala.inline
      def setExcludeGlobsVarargs(value: String*): Self = StObject.set(x, "excludeGlobs", js.Array(value :_*))
      
      @scala.inline
      def setExcludeMatches(value: js.Array[MatchPattern]): Self = StObject.set(x, "excludeMatches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeMatchesUndefined: Self = StObject.set(x, "excludeMatches", js.undefined)
      
      @scala.inline
      def setExcludeMatchesVarargs(value: MatchPattern*): Self = StObject.set(x, "excludeMatches", js.Array(value :_*))
      
      @scala.inline
      def setIncludeGlobs(value: js.Array[String]): Self = StObject.set(x, "includeGlobs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeGlobsUndefined: Self = StObject.set(x, "includeGlobs", js.undefined)
      
      @scala.inline
      def setIncludeGlobsVarargs(value: String*): Self = StObject.set(x, "includeGlobs", js.Array(value :_*))
      
      @scala.inline
      def setJs_(value: js.Array[ExtensionFileOrCode]): Self = StObject.set(x, "js", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJs_Varargs(value: ExtensionFileOrCode*): Self = StObject.set(x, "js", js.Array(value :_*))
      
      @scala.inline
      def setMatchAboutBlank(value: Boolean): Self = StObject.set(x, "matchAboutBlank", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchAboutBlankUndefined: Self = StObject.set(x, "matchAboutBlank", js.undefined)
      
      @scala.inline
      def setMatches(value: js.Array[MatchPattern]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchesVarargs(value: MatchPattern*): Self = StObject.set(x, "matches", js.Array(value :_*))
      
      @scala.inline
      def setRunAt(value: RunAt): Self = StObject.set(x, "runAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunAtUndefined: Self = StObject.set(x, "runAt", js.undefined)
      
      @scala.inline
      def setScriptMetadata(value: PlainJSONValue): Self = StObject.set(x, "scriptMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptMetadataNull: Self = StObject.set(x, "scriptMetadata", null)
      
      @scala.inline
      def setScriptMetadataUndefined: Self = StObject.set(x, "scriptMetadata", js.undefined)
    }
  }
}
