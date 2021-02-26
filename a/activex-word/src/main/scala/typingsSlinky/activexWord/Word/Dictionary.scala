package typingsSlinky.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictionary extends StObject {
  
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  var LanguageID: WdLanguageID = js.native
  
  var LanguageSpecific: Boolean = js.native
  
  val Name: String = js.native
  
  val Parent: js.Any = js.native
  
  val Path: String = js.native
  
  val ReadOnly: Boolean = js.native
  
  val Type: WdDictionaryType = js.native
  
  @JSName("Word.Dictionary_typekey")
  var WordDotDictionary_typekey: Dictionary = js.native
}
object Dictionary {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    LanguageID: WdLanguageID,
    LanguageSpecific: Boolean,
    Name: String,
    Parent: js.Any,
    Path: String,
    ReadOnly: Boolean,
    Type: WdDictionaryType,
    WordDotDictionary_typekey: Dictionary
  ): Dictionary = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), LanguageID = LanguageID.asInstanceOf[js.Any], LanguageSpecific = LanguageSpecific.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], ReadOnly = ReadOnly.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Dictionary_typekey")(WordDotDictionary_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictionary]
  }
  
  @scala.inline
  implicit class DictionaryMutableBuilder[Self <: Dictionary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLanguageID(value: WdLanguageID): Self = StObject.set(x, "LanguageID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageSpecific(value: Boolean): Self = StObject.set(x, "LanguageSpecific", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "ReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: WdDictionaryType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotDictionary_typekey(value: Dictionary): Self = StObject.set(x, "Word.Dictionary_typekey", value.asInstanceOf[js.Any])
  }
}
