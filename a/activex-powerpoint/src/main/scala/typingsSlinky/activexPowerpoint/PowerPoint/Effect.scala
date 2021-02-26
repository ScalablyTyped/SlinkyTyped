package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Effect extends StObject {
  
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  
  val Behaviors: AnimationBehaviors = js.native
  
  def Delete(): Unit = js.native
  
  val DisplayName: String = js.native
  
  val EffectInformation: typingsSlinky.activexPowerpoint.PowerPoint.EffectInformation = js.native
  
  val EffectParameters: typingsSlinky.activexPowerpoint.PowerPoint.EffectParameters = js.native
  
  var EffectType: MsoAnimEffect = js.native
  
  var Exit: MsoTriState = js.native
  
  val Index: Double = js.native
  
  def MoveAfter(Effect: Effect): Unit = js.native
  
  def MoveBefore(Effect: Effect): Unit = js.native
  
  def MoveTo(toPos: Double): Unit = js.native
  
  var Paragraph: Double = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.Effect_typekey")
  var PowerPointDotEffect_typekey: Effect = js.native
  
  var Shape: typingsSlinky.activexPowerpoint.PowerPoint.Shape = js.native
  
  val TextRangeLength: Double = js.native
  
  val TextRangeStart: Double = js.native
  
  val Timing: typingsSlinky.activexPowerpoint.PowerPoint.Timing = js.native
}
object Effect {
  
  @scala.inline
  def apply(
    Application: Application,
    Behaviors: AnimationBehaviors,
    Delete: () => Unit,
    DisplayName: String,
    EffectInformation: EffectInformation,
    EffectParameters: EffectParameters,
    EffectType: MsoAnimEffect,
    Exit: MsoTriState,
    Index: Double,
    MoveAfter: Effect => Unit,
    MoveBefore: Effect => Unit,
    MoveTo: Double => Unit,
    Paragraph: Double,
    Parent: js.Any,
    PowerPointDotEffect_typekey: Effect,
    Shape: Shape,
    TextRangeLength: Double,
    TextRangeStart: Double,
    Timing: Timing
  ): Effect = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Behaviors = Behaviors.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), DisplayName = DisplayName.asInstanceOf[js.Any], EffectInformation = EffectInformation.asInstanceOf[js.Any], EffectParameters = EffectParameters.asInstanceOf[js.Any], EffectType = EffectType.asInstanceOf[js.Any], Exit = Exit.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], MoveAfter = js.Any.fromFunction1(MoveAfter), MoveBefore = js.Any.fromFunction1(MoveBefore), MoveTo = js.Any.fromFunction1(MoveTo), Paragraph = Paragraph.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Shape = Shape.asInstanceOf[js.Any], TextRangeLength = TextRangeLength.asInstanceOf[js.Any], TextRangeStart = TextRangeStart.asInstanceOf[js.Any], Timing = Timing.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Effect_typekey")(PowerPointDotEffect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Effect]
  }
  
  @scala.inline
  implicit class EffectMutableBuilder[Self <: Effect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBehaviors(value: AnimationBehaviors): Self = StObject.set(x, "Behaviors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectInformation(value: EffectInformation): Self = StObject.set(x, "EffectInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectParameters(value: EffectParameters): Self = StObject.set(x, "EffectParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectType(value: MsoAnimEffect): Self = StObject.set(x, "EffectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExit(value: MsoTriState): Self = StObject.set(x, "Exit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveAfter(value: Effect => Unit): Self = StObject.set(x, "MoveAfter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMoveBefore(value: Effect => Unit): Self = StObject.set(x, "MoveBefore", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMoveTo(value: Double => Unit): Self = StObject.set(x, "MoveTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParagraph(value: Double): Self = StObject.set(x, "Paragraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotEffect_typekey(value: Effect): Self = StObject.set(x, "PowerPoint.Effect_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShape(value: Shape): Self = StObject.set(x, "Shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextRangeLength(value: Double): Self = StObject.set(x, "TextRangeLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextRangeStart(value: Double): Self = StObject.set(x, "TextRangeStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTiming(value: Timing): Self = StObject.set(x, "Timing", value.asInstanceOf[js.Any])
  }
}
