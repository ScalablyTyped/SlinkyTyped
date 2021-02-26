package typingsSlinky.activexLibreoffice.com_.sun.star.util

import typingsSlinky.activexLibreoffice.com_.sun.star.lang.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchOptions extends StObject {
  
  /** The locale for case insensitive search. */
  var Locale: typingsSlinky.activexLibreoffice.com_.sun.star.lang.Locale = js.native
  
  /** search type */
  var algorithmType: SearchAlgorithms = js.native
  
  /** This many characters can be different (as a replacement) between the found word and the search pattern in a "Weighted Levenshtein; Distance" search. */
  var changedChars: Double = js.native
  
  /** This many characters can be missing in the found word in a "Weighted Levenshtein Distance" search. */
  var deletedChars: Double = js.native
  
  /** This many characters can be additional in the found word in a "Weighted Levenshtein Distance" search. */
  var insertedChars: Double = js.native
  
  /** The replacement text (is for optional replacing - SearchOption is only the data container for it) */
  var replaceString: String = js.native
  
  /**
    * some flags - can be mixed
    * @see SearchFlags
    */
  var searchFlag: Double = js.native
  
  /** The text or pattern to be searched. */
  var searchString: String = js.native
  
  /** Flags for the transliteration. Same meaning as the enum of {@link com.sun.star.i18n.TransliterationModules} */
  var transliterateFlags: Double = js.native
}
object SearchOptions {
  
  @scala.inline
  def apply(
    Locale: Locale,
    algorithmType: SearchAlgorithms,
    changedChars: Double,
    deletedChars: Double,
    insertedChars: Double,
    replaceString: String,
    searchFlag: Double,
    searchString: String,
    transliterateFlags: Double
  ): SearchOptions = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], algorithmType = algorithmType.asInstanceOf[js.Any], changedChars = changedChars.asInstanceOf[js.Any], deletedChars = deletedChars.asInstanceOf[js.Any], insertedChars = insertedChars.asInstanceOf[js.Any], replaceString = replaceString.asInstanceOf[js.Any], searchFlag = searchFlag.asInstanceOf[js.Any], searchString = searchString.asInstanceOf[js.Any], transliterateFlags = transliterateFlags.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptions]
  }
  
  @scala.inline
  implicit class SearchOptionsMutableBuilder[Self <: SearchOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithmType(value: SearchAlgorithms): Self = StObject.set(x, "algorithmType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedChars(value: Double): Self = StObject.set(x, "changedChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedChars(value: Double): Self = StObject.set(x, "deletedChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertedChars(value: Double): Self = StObject.set(x, "insertedChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: Locale): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceString(value: String): Self = StObject.set(x, "replaceString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchFlag(value: Double): Self = StObject.set(x, "searchFlag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchString(value: String): Self = StObject.set(x, "searchString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransliterateFlags(value: Double): Self = StObject.set(x, "transliterateFlags", value.asInstanceOf[js.Any])
  }
}
