package typingsSlinky.angularTranslate

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angularTranslate.mod.angularAugmentingMod.translate.IStaticFilesLoaderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Files extends StObject {
    
    var files: js.Array[IStaticFilesLoaderOptions] = js.native
  }
  object Files {
    
    @scala.inline
    def apply(files: js.Array[IStaticFilesLoaderOptions]): Files = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
      __obj.asInstanceOf[Files]
    }
    
    @scala.inline
    implicit class FilesMutableBuilder[Self <: Files] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFiles(value: js.Array[IStaticFilesLoaderOptions]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesVarargs(value: IStaticFilesLoaderOptions*): Self = StObject.set(x, "files", js.Array(value :_*))
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(translationId: String): String = js.native
    def apply(
      translationId: String,
      interpolateParams: js.UndefOr[scala.Nothing],
      interpolation: js.UndefOr[scala.Nothing],
      forceLanguage: String
    ): String = js.native
    def apply(translationId: String, interpolateParams: js.UndefOr[scala.Nothing], interpolation: String): String = js.native
    def apply(
      translationId: String,
      interpolateParams: js.UndefOr[scala.Nothing],
      interpolation: String,
      forceLanguage: String
    ): String = js.native
    def apply(translationId: String, interpolateParams: js.Any): String = js.native
    def apply(
      translationId: String,
      interpolateParams: js.Any,
      interpolation: js.UndefOr[scala.Nothing],
      forceLanguage: String
    ): String = js.native
    def apply(translationId: String, interpolateParams: js.Any, interpolation: String): String = js.native
    def apply(translationId: String, interpolateParams: js.Any, interpolation: String, forceLanguage: String): String = js.native
    def apply(translationIds: js.Array[String]): StringDictionary[String] = js.native
    def apply(
      translationIds: js.Array[String],
      interpolateParams: js.UndefOr[scala.Nothing],
      interpolation: js.UndefOr[scala.Nothing],
      forceLanguage: String
    ): StringDictionary[String] = js.native
    def apply(
      translationIds: js.Array[String],
      interpolateParams: js.UndefOr[scala.Nothing],
      interpolation: String
    ): StringDictionary[String] = js.native
    def apply(
      translationIds: js.Array[String],
      interpolateParams: js.UndefOr[scala.Nothing],
      interpolation: String,
      forceLanguage: String
    ): StringDictionary[String] = js.native
    def apply(translationIds: js.Array[String], interpolateParams: js.Any): StringDictionary[String] = js.native
    def apply(
      translationIds: js.Array[String],
      interpolateParams: js.Any,
      interpolation: js.UndefOr[scala.Nothing],
      forceLanguage: String
    ): StringDictionary[String] = js.native
    def apply(translationIds: js.Array[String], interpolateParams: js.Any, interpolation: String): StringDictionary[String] = js.native
    def apply(
      translationIds: js.Array[String],
      interpolateParams: js.Any,
      interpolation: String,
      forceLanguage: String
    ): StringDictionary[String] = js.native
  }
}
