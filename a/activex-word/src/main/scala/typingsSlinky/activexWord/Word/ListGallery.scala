package typingsSlinky.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListGallery extends StObject {
  
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  val ListTemplates: typingsSlinky.activexWord.Word.ListTemplates = js.native
  
  def Modified(Index: Double): Boolean = js.native
  
  val Parent: js.Any = js.native
  
  def Reset(Index: Double): Unit = js.native
  
  @JSName("Word.ListGallery_typekey")
  var WordDotListGallery_typekey: ListGallery = js.native
}
object ListGallery {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    ListTemplates: ListTemplates,
    Modified: Double => Boolean,
    Parent: js.Any,
    Reset: Double => Unit,
    WordDotListGallery_typekey: ListGallery
  ): ListGallery = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], ListTemplates = ListTemplates.asInstanceOf[js.Any], Modified = js.Any.fromFunction1(Modified), Parent = Parent.asInstanceOf[js.Any], Reset = js.Any.fromFunction1(Reset))
    __obj.updateDynamic("Word.ListGallery_typekey")(WordDotListGallery_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGallery]
  }
  
  @scala.inline
  implicit class ListGalleryMutableBuilder[Self <: ListGallery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListTemplates(value: ListTemplates): Self = StObject.set(x, "ListTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModified(value: Double => Boolean): Self = StObject.set(x, "Modified", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset(value: Double => Unit): Self = StObject.set(x, "Reset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWordDotListGallery_typekey(value: ListGallery): Self = StObject.set(x, "Word.ListGallery_typekey", value.asInstanceOf[js.Any])
  }
}
