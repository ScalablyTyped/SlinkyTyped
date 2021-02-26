package typingsSlinky.dropboxChooser

import typingsSlinky.dropboxChooser.dropboxChooserStrings.direct
import typingsSlinky.dropboxChooser.dropboxChooserStrings.preview
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Dropbox {
  
  @js.native
  trait Chooser extends StObject {
    
    def choose(options: ChooserOptions): Unit = js.native
  }
  object Chooser {
    
    @scala.inline
    def apply(choose: ChooserOptions => Unit): Chooser = {
      val __obj = js.Dynamic.literal(choose = js.Any.fromFunction1(choose))
      __obj.asInstanceOf[Chooser]
    }
    
    @scala.inline
    implicit class ChooserMutableBuilder[Self <: Chooser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChoose(value: ChooserOptions => Unit): Self = StObject.set(x, "choose", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ChooserFile extends StObject {
    
    // Size of the file in bytes.
    var bytes: Double = js.native
    
    // URL to a 64x64px icon for the file based on the file's extension.
    var icon: String = js.native
    
    // Unique ID for the file, compatible with Dropbox API v2.
    var id: String = js.native
    
    // whether or not the file is actually a directory
    var isDir: Boolean = js.native
    
    // URL to access the file, which varies depending on the linkType specified when the
    // Chooser was triggered.
    var link: String = js.native
    
    // Name of the file.
    var name: String = js.native
    
    // A thumbnail URL generated when the user selects images and videos.
    // If the user didn't select an image or video, no thumbnail will be included.
    var thumbnailLink: js.UndefOr[String] = js.native
  }
  object ChooserFile {
    
    @scala.inline
    def apply(bytes: Double, icon: String, id: String, isDir: Boolean, link: String, name: String): ChooserFile = {
      val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDir = isDir.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChooserFile]
    }
    
    @scala.inline
    implicit class ChooserFileMutableBuilder[Self <: ChooserFile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBytes(value: Double): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDir(value: Boolean): Self = StObject.set(x, "isDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnailLink(value: String): Self = StObject.set(x, "thumbnailLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnailLinkUndefined: Self = StObject.set(x, "thumbnailLink", js.undefined)
    }
  }
  
  // Refer to "Handling the response" section of: https://www.dropbox.com/developers/chooser
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.dropboxChooser.dropboxChooserNumbers.`75`
    - typingsSlinky.dropboxChooser.dropboxChooserNumbers.`256`
    - typingsSlinky.dropboxChooser.dropboxChooserNumbers.`800`
    - typingsSlinky.dropboxChooser.dropboxChooserNumbers.`1280`
    - typingsSlinky.dropboxChooser.dropboxChooserNumbers.`2048`
  */
  trait ChooserFileBoundingBox extends StObject
  object ChooserFileBoundingBox {
    
    @scala.inline
    def `1280`: typingsSlinky.dropboxChooser.dropboxChooserNumbers.`1280` = 1280.asInstanceOf[typingsSlinky.dropboxChooser.dropboxChooserNumbers.`1280`]
    
    @scala.inline
    def `2048`: typingsSlinky.dropboxChooser.dropboxChooserNumbers.`2048` = 2048.asInstanceOf[typingsSlinky.dropboxChooser.dropboxChooserNumbers.`2048`]
    
    @scala.inline
    def `256`: typingsSlinky.dropboxChooser.dropboxChooserNumbers.`256` = 256.asInstanceOf[typingsSlinky.dropboxChooser.dropboxChooserNumbers.`256`]
    
    @scala.inline
    def `75`: typingsSlinky.dropboxChooser.dropboxChooserNumbers.`75` = 75.asInstanceOf[typingsSlinky.dropboxChooser.dropboxChooserNumbers.`75`]
    
    @scala.inline
    def `800`: typingsSlinky.dropboxChooser.dropboxChooserNumbers.`800` = 800.asInstanceOf[typingsSlinky.dropboxChooser.dropboxChooserNumbers.`800`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.dropboxChooser.dropboxChooserStrings.fit
    - typingsSlinky.dropboxChooser.dropboxChooserStrings.crop
    - typingsSlinky.dropboxChooser.dropboxChooserStrings.fit_one_and_overflow
  */
  trait ChooserFileMode extends StObject
  object ChooserFileMode {
    
    @scala.inline
    def crop: typingsSlinky.dropboxChooser.dropboxChooserStrings.crop = "crop".asInstanceOf[typingsSlinky.dropboxChooser.dropboxChooserStrings.crop]
    
    @scala.inline
    def fit: typingsSlinky.dropboxChooser.dropboxChooserStrings.fit = "fit".asInstanceOf[typingsSlinky.dropboxChooser.dropboxChooserStrings.fit]
    
    @scala.inline
    def fit_one_and_overflow: typingsSlinky.dropboxChooser.dropboxChooserStrings.fit_one_and_overflow = "fit_one_and_overflow".asInstanceOf[typingsSlinky.dropboxChooser.dropboxChooserStrings.fit_one_and_overflow]
  }
  
  @js.native
  trait ChooserOptions extends StObject {
    
    // called when the user closes the dialog without selecting a file
    var cancel: js.UndefOr[js.Function0[Unit]] = js.native
    
    // eg. '.png'
    var extensions: js.UndefOr[js.Array[String]] = js.native
    
    // default: false
    var folderselect: js.UndefOr[Boolean] = js.native
    
    // default: 'preview'
    var linkType: js.UndefOr[preview | direct] = js.native
    
    // default: false
    var multiselect: js.UndefOr[Boolean] = js.native
    
    // any positive number
    var sizeLimit: js.UndefOr[Double] = js.native
    
    // called when a user selects an item in the Chooser
    def success(files: js.Array[ChooserFile]): Unit = js.native
  }
  object ChooserOptions {
    
    @scala.inline
    def apply(success: js.Array[ChooserFile] => Unit): ChooserOptions = {
      val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
      __obj.asInstanceOf[ChooserOptions]
    }
    
    @scala.inline
    implicit class ChooserOptionsMutableBuilder[Self <: ChooserOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      @scala.inline
      def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      @scala.inline
      def setFolderselect(value: Boolean): Self = StObject.set(x, "folderselect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFolderselectUndefined: Self = StObject.set(x, "folderselect", js.undefined)
      
      @scala.inline
      def setLinkType(value: preview | direct): Self = StObject.set(x, "linkType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkTypeUndefined: Self = StObject.set(x, "linkType", js.undefined)
      
      @scala.inline
      def setMultiselect(value: Boolean): Self = StObject.set(x, "multiselect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiselectUndefined: Self = StObject.set(x, "multiselect", js.undefined)
      
      @scala.inline
      def setSizeLimit(value: Double): Self = StObject.set(x, "sizeLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeLimitUndefined: Self = StObject.set(x, "sizeLimit", js.undefined)
      
      @scala.inline
      def setSuccess(value: js.Array[ChooserFile] => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    }
  }
}
