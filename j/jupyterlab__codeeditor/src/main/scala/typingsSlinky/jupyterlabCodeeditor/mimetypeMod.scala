package typingsSlinky.jupyterlabCodeeditor

import typingsSlinky.jupyterlabNbformat.mod.ILanguageInfoMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mimetypeMod {
  
  @js.native
  trait IEditorMimeTypeService extends StObject {
    
    /**
      * Get a mime type for the given file path.
      *
      * @param filePath - The full path to the file.
      *
      * @returns A valid mimetype.
      *
      * #### Notes
      * If a mime type cannot be found returns the defaul mime type `text/plain`, never `null`.
      */
    def getMimeTypeByFilePath(filePath: String): String = js.native
    
    /**
      * Get a mime type for the given language info.
      *
      * @param info - The language information.
      *
      * @returns A valid mimetype.
      *
      * #### Notes
      * If a mime type cannot be found returns the defaul mime type `text/plain`, never `null`.
      */
    def getMimeTypeByLanguage(info: ILanguageInfoMetadata): String = js.native
  }
  object IEditorMimeTypeService {
    
    @scala.inline
    def apply(getMimeTypeByFilePath: String => String, getMimeTypeByLanguage: ILanguageInfoMetadata => String): IEditorMimeTypeService = {
      val __obj = js.Dynamic.literal(getMimeTypeByFilePath = js.Any.fromFunction1(getMimeTypeByFilePath), getMimeTypeByLanguage = js.Any.fromFunction1(getMimeTypeByLanguage))
      __obj.asInstanceOf[IEditorMimeTypeService]
    }
    
    /**
      * The default mime type.
      */
    @JSImport("@jupyterlab/codeeditor/lib/mimetype", "IEditorMimeTypeService.defaultMimeType")
    @js.native
    val defaultMimeType: String = js.native
    
    @scala.inline
    implicit class IEditorMimeTypeServiceMutableBuilder[Self <: IEditorMimeTypeService] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetMimeTypeByFilePath(value: String => String): Self = StObject.set(x, "getMimeTypeByFilePath", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetMimeTypeByLanguage(value: ILanguageInfoMetadata => String): Self = StObject.set(x, "getMimeTypeByLanguage", js.Any.fromFunction1(value))
    }
  }
}
