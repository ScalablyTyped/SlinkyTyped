package typingsSlinky.chromeApps.chrome

import typingsSlinky.filesystem.FileEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.fileBrowserHandle
/////////////////////////
// File Browser Handle //
/////////////////////////
/**
  * @requires(CrOS) Chrome OS Only
  * @requires Permissions: 'fileBrowserHandler'
  * @requires Manifest: 'file_browser_handlers'
  * @description
  * Use the chrome.fileBrowserHandler API to extend the Chrome OS file browser.
  * For example, you can use this API to enable users to upload files to your website.
  * @see[Documentation]{@link https://developer.chrome.com/extensions/fileBrowserHandler}
  */
object fileBrowserHandler {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.chromeApps.chromeAppsStrings.ReadOnly
    - typingsSlinky.chromeApps.chromeAppsStrings.ReadWrite
  */
  trait FileBrowserHandleExecuteId extends StObject
  object FileBrowserHandleExecuteId {
    
    @scala.inline
    def ReadOnly: typingsSlinky.chromeApps.chromeAppsStrings.ReadOnly = "ReadOnly".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.ReadOnly]
    
    @scala.inline
    def ReadWrite: typingsSlinky.chromeApps.chromeAppsStrings.ReadWrite = "ReadWrite".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.ReadWrite]
  }
  
  @js.native
  trait SelectFileParameters extends StObject {
    
    /**
      * List of file extensions that the selected file can have.
      * The list is also used to specify what files to be shown in the select file dialog.
      * Files with the listed extensions are only shown in the dialog.
      * Extensions should not include the leading '.'.
      * @example ['jpg', 'png']
      */
    var allowedFileExtensions: js.UndefOr[js.Array[String]] = js.native
    
    /** Suggested name for the file. */
    var suggestedName: String = js.native
  }
  object SelectFileParameters {
    
    @scala.inline
    def apply(suggestedName: String): SelectFileParameters = {
      val __obj = js.Dynamic.literal(suggestedName = suggestedName.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectFileParameters]
    }
    
    @scala.inline
    implicit class SelectFileParametersMutableBuilder[Self <: SelectFileParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowedFileExtensions(value: js.Array[String]): Self = StObject.set(x, "allowedFileExtensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedFileExtensionsUndefined: Self = StObject.set(x, "allowedFileExtensions", js.undefined)
      
      @scala.inline
      def setAllowedFileExtensionsVarargs(value: String*): Self = StObject.set(x, "allowedFileExtensions", js.Array(value :_*))
      
      @scala.inline
      def setSuggestedName(value: String): Self = StObject.set(x, "suggestedName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SelectionResult extends StObject {
    
    /** Selected file entry. It will be null if a file hasn't been selected. */
    var entry: FileEntry | Null = js.native
    
    /** Whether the file has been selected. */
    var success: Boolean = js.native
  }
  object SelectionResult {
    
    @scala.inline
    def apply(success: Boolean): SelectionResult = {
      val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionResult]
    }
    
    @scala.inline
    implicit class SelectionResultMutableBuilder[Self <: SelectionResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntry(value: FileEntry): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntryNull: Self = StObject.set(x, "entry", null)
      
      @scala.inline
      def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
}
