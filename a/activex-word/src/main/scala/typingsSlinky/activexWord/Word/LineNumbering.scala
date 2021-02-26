package typingsSlinky.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineNumbering extends StObject {
  
  var Active: Double = js.native
  
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  
  var CountBy: Double = js.native
  
  val Creator: Double = js.native
  
  var DistanceFromText: Double = js.native
  
  val Parent: js.Any = js.native
  
  var RestartMode: WdNumberingRule = js.native
  
  var StartingNumber: Double = js.native
  
  @JSName("Word.LineNumbering_typekey")
  var WordDotLineNumbering_typekey: LineNumbering = js.native
}
object LineNumbering {
  
  @scala.inline
  def apply(
    Active: Double,
    Application: Application,
    CountBy: Double,
    Creator: Double,
    DistanceFromText: Double,
    Parent: js.Any,
    RestartMode: WdNumberingRule,
    StartingNumber: Double,
    WordDotLineNumbering_typekey: LineNumbering
  ): LineNumbering = {
    val __obj = js.Dynamic.literal(Active = Active.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], CountBy = CountBy.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DistanceFromText = DistanceFromText.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RestartMode = RestartMode.asInstanceOf[js.Any], StartingNumber = StartingNumber.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.LineNumbering_typekey")(WordDotLineNumbering_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineNumbering]
  }
  
  @scala.inline
  implicit class LineNumberingMutableBuilder[Self <: LineNumbering] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Double): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountBy(value: Double): Self = StObject.set(x, "CountBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceFromText(value: Double): Self = StObject.set(x, "DistanceFromText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestartMode(value: WdNumberingRule): Self = StObject.set(x, "RestartMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartingNumber(value: Double): Self = StObject.set(x, "StartingNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotLineNumbering_typekey(value: LineNumbering): Self = StObject.set(x, "Word.LineNumbering_typekey", value.asInstanceOf[js.Any])
  }
}
