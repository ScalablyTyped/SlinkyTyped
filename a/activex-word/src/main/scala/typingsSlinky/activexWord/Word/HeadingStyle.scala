package typingsSlinky.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeadingStyle extends StObject {
  
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  var Level: Double = js.native
  
  val Parent: js.Any = js.native
  
  var Style: js.Any = js.native
  
  @JSName("Word.HeadingStyle_typekey")
  var WordDotHeadingStyle_typekey: HeadingStyle = js.native
}
object HeadingStyle {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    Level: Double,
    Parent: js.Any,
    Style: js.Any,
    WordDotHeadingStyle_typekey: HeadingStyle
  ): HeadingStyle = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Level = Level.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.HeadingStyle_typekey")(WordDotHeadingStyle_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadingStyle]
  }
  
  @scala.inline
  implicit class HeadingStyleMutableBuilder[Self <: HeadingStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "Level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: js.Any): Self = StObject.set(x, "Style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotHeadingStyle_typekey(value: HeadingStyle): Self = StObject.set(x, "Word.HeadingStyle_typekey", value.asInstanceOf[js.Any])
  }
}
