package typingsSlinky.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramNodes extends StObject {
  
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: js.Any): DiagramNode = js.native
  
  val Parent: js.Any = js.native
  
  def SelectAll(): Unit = js.native
  
  @JSName("Word.DiagramNodes_typekey")
  var WordDotDiagramNodes_typekey: DiagramNodes = js.native
}
object DiagramNodes {
  
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: js.Any => DiagramNode,
    Parent: js.Any,
    SelectAll: () => Unit,
    WordDotDiagramNodes_typekey: DiagramNodes
  ): DiagramNodes = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], SelectAll = js.Any.fromFunction0(SelectAll))
    __obj.updateDynamic("Word.DiagramNodes_typekey")(WordDotDiagramNodes_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramNodes]
  }
  
  @scala.inline
  implicit class DiagramNodesMutableBuilder[Self <: DiagramNodes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => DiagramNode): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectAll(value: () => Unit): Self = StObject.set(x, "SelectAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWordDotDiagramNodes_typekey(value: DiagramNodes): Self = StObject.set(x, "Word.DiagramNodes_typekey", value.asInstanceOf[js.Any])
  }
}
