package typingsSlinky.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Source extends StObject {
  
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  
  val Cited: Boolean = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  def Field(Name: String): String = js.native
  
  val Parent: js.Any = js.native
  
  val Tag: String = js.native
  
  @JSName("Word.Source_typekey")
  var WordDotSource_typekey: Source = js.native
  
  val XML: String = js.native
}
object Source {
  
  @scala.inline
  def apply(
    Application: Application,
    Cited: Boolean,
    Creator: Double,
    Delete: () => Unit,
    Field: String => String,
    Parent: js.Any,
    Tag: String,
    WordDotSource_typekey: Source,
    XML: String
  ): Source = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Cited = Cited.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Field = js.Any.fromFunction1(Field), Parent = Parent.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], XML = XML.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Source_typekey")(WordDotSource_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  
  @scala.inline
  implicit class SourceMutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCited(value: Boolean): Self = StObject.set(x, "Cited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setField(value: String => String): Self = StObject.set(x, "Field", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotSource_typekey(value: Source): Self = StObject.set(x, "Word.Source_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXML(value: String): Self = StObject.set(x, "XML", value.asInstanceOf[js.Any])
  }
}
