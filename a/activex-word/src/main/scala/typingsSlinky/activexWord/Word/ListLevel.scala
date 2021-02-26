package typingsSlinky.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListLevel extends StObject {
  
  var Alignment: WdListLevelAlignment = js.native
  
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  
  def ApplyPictureBullet(FileName: String): InlineShape = js.native
  
  val Creator: Double = js.native
  
  var Font: typingsSlinky.activexWord.Word.Font = js.native
  
  val Index: Double = js.native
  
  var LinkedStyle: String = js.native
  
  var NumberFormat: String = js.native
  
  var NumberPosition: Double = js.native
  
  var NumberStyle: WdListNumberStyle = js.native
  
  val Parent: js.Any = js.native
  
  val PictureBullet: InlineShape = js.native
  
  var ResetOnHigher: Double = js.native
  
  var ResetOnHigherOld: Boolean = js.native
  
  var StartAt: Double = js.native
  
  var TabPosition: Double = js.native
  
  var TextPosition: Double = js.native
  
  var TrailingCharacter: WdTrailingCharacter = js.native
  
  @JSName("Word.ListLevel_typekey")
  var WordDotListLevel_typekey: ListLevel = js.native
}
object ListLevel {
  
  @scala.inline
  def apply(
    Alignment: WdListLevelAlignment,
    Application: Application,
    ApplyPictureBullet: String => InlineShape,
    Creator: Double,
    Font: Font,
    Index: Double,
    LinkedStyle: String,
    NumberFormat: String,
    NumberPosition: Double,
    NumberStyle: WdListNumberStyle,
    Parent: js.Any,
    PictureBullet: InlineShape,
    ResetOnHigher: Double,
    ResetOnHigherOld: Boolean,
    StartAt: Double,
    TabPosition: Double,
    TextPosition: Double,
    TrailingCharacter: WdTrailingCharacter,
    WordDotListLevel_typekey: ListLevel
  ): ListLevel = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], ApplyPictureBullet = js.Any.fromFunction1(ApplyPictureBullet), Creator = Creator.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], LinkedStyle = LinkedStyle.asInstanceOf[js.Any], NumberFormat = NumberFormat.asInstanceOf[js.Any], NumberPosition = NumberPosition.asInstanceOf[js.Any], NumberStyle = NumberStyle.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PictureBullet = PictureBullet.asInstanceOf[js.Any], ResetOnHigher = ResetOnHigher.asInstanceOf[js.Any], ResetOnHigherOld = ResetOnHigherOld.asInstanceOf[js.Any], StartAt = StartAt.asInstanceOf[js.Any], TabPosition = TabPosition.asInstanceOf[js.Any], TextPosition = TextPosition.asInstanceOf[js.Any], TrailingCharacter = TrailingCharacter.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ListLevel_typekey")(WordDotListLevel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLevel]
  }
  
  @scala.inline
  implicit class ListLevelMutableBuilder[Self <: ListLevel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignment(value: WdListLevelAlignment): Self = StObject.set(x, "Alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyPictureBullet(value: String => InlineShape): Self = StObject.set(x, "ApplyPictureBullet", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont(value: Font): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkedStyle(value: String): Self = StObject.set(x, "LinkedStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberFormat(value: String): Self = StObject.set(x, "NumberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberPosition(value: Double): Self = StObject.set(x, "NumberPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberStyle(value: WdListNumberStyle): Self = StObject.set(x, "NumberStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPictureBullet(value: InlineShape): Self = StObject.set(x, "PictureBullet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetOnHigher(value: Double): Self = StObject.set(x, "ResetOnHigher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetOnHigherOld(value: Boolean): Self = StObject.set(x, "ResetOnHigherOld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAt(value: Double): Self = StObject.set(x, "StartAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabPosition(value: Double): Self = StObject.set(x, "TabPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextPosition(value: Double): Self = StObject.set(x, "TextPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrailingCharacter(value: WdTrailingCharacter): Self = StObject.set(x, "TrailingCharacter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotListLevel_typekey(value: ListLevel): Self = StObject.set(x, "Word.ListLevel_typekey", value.asInstanceOf[js.Any])
  }
}
