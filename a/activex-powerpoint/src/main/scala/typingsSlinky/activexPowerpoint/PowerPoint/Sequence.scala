package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoRGBType
import typingsSlinky.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sequence extends StObject {
  
  /**
    * @param PowerPoint.MsoAnimateByLevel [Level=0]
    * @param PowerPoint.MsoAnimTriggerType [trigger=1]
    * @param number [Index=-1]
    */
  def AddEffect(Shape: Shape, effectId: MsoAnimEffect): Effect = js.native
  def AddEffect(
    Shape: Shape,
    effectId: MsoAnimEffect,
    Level: js.UndefOr[scala.Nothing],
    trigger: js.UndefOr[scala.Nothing],
    Index: Double
  ): Effect = js.native
  def AddEffect(
    Shape: Shape,
    effectId: MsoAnimEffect,
    Level: js.UndefOr[scala.Nothing],
    trigger: MsoAnimTriggerType
  ): Effect = js.native
  def AddEffect(
    Shape: Shape,
    effectId: MsoAnimEffect,
    Level: js.UndefOr[scala.Nothing],
    trigger: MsoAnimTriggerType,
    Index: Double
  ): Effect = js.native
  def AddEffect(Shape: Shape, effectId: MsoAnimEffect, Level: MsoAnimateByLevel): Effect = js.native
  def AddEffect(
    Shape: Shape,
    effectId: MsoAnimEffect,
    Level: MsoAnimateByLevel,
    trigger: js.UndefOr[scala.Nothing],
    Index: Double
  ): Effect = js.native
  def AddEffect(Shape: Shape, effectId: MsoAnimEffect, Level: MsoAnimateByLevel, trigger: MsoAnimTriggerType): Effect = js.native
  def AddEffect(
    Shape: Shape,
    effectId: MsoAnimEffect,
    Level: MsoAnimateByLevel,
    trigger: MsoAnimTriggerType,
    Index: Double
  ): Effect = js.native
  
  /**
    * @param string [bookmark='']
    * @param PowerPoint.MsoAnimateByLevel [Level=0]
    */
  def AddTriggerEffect(pShape: Shape, effectId: MsoAnimEffect, trigger: MsoAnimTriggerType, pTriggerShape: Shape): Effect = js.native
  def AddTriggerEffect(
    pShape: Shape,
    effectId: MsoAnimEffect,
    trigger: MsoAnimTriggerType,
    pTriggerShape: Shape,
    bookmark: js.UndefOr[scala.Nothing],
    Level: MsoAnimateByLevel
  ): Effect = js.native
  def AddTriggerEffect(
    pShape: Shape,
    effectId: MsoAnimEffect,
    trigger: MsoAnimTriggerType,
    pTriggerShape: Shape,
    bookmark: String
  ): Effect = js.native
  def AddTriggerEffect(
    pShape: Shape,
    effectId: MsoAnimEffect,
    trigger: MsoAnimTriggerType,
    pTriggerShape: Shape,
    bookmark: String,
    Level: MsoAnimateByLevel
  ): Effect = js.native
  
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  
  /** @param number [Index=-1] */
  def Clone(Effect: Effect): Effect = js.native
  def Clone(Effect: Effect, Index: Double): Effect = js.native
  
  /**
    * @param Office.MsoRGBType [DimColor=0]
    * @param PowerPoint.PpColorSchemeIndex [DimSchemeColor=0]
    */
  def ConvertToAfterEffect(Effect: Effect, After: MsoAnimAfterEffect): Effect = js.native
  def ConvertToAfterEffect(
    Effect: Effect,
    After: MsoAnimAfterEffect,
    DimColor: js.UndefOr[scala.Nothing],
    DimSchemeColor: PpColorSchemeIndex
  ): Effect = js.native
  def ConvertToAfterEffect(Effect: Effect, After: MsoAnimAfterEffect, DimColor: MsoRGBType): Effect = js.native
  def ConvertToAfterEffect(
    Effect: Effect,
    After: MsoAnimAfterEffect,
    DimColor: MsoRGBType,
    DimSchemeColor: PpColorSchemeIndex
  ): Effect = js.native
  
  def ConvertToAnimateBackground(Effect: Effect, AnimateBackground: MsoTriState): Effect = js.native
  
  def ConvertToAnimateInReverse(Effect: Effect, animateInReverse: MsoTriState): Effect = js.native
  
  def ConvertToBuildLevel(Effect: Effect, Level: MsoAnimateByLevel): Effect = js.native
  
  def ConvertToTextUnitEffect(Effect: Effect, unitEffect: MsoAnimTextUnitEffect): Effect = js.native
  
  val Count: Double = js.native
  
  def FindFirstAnimationFor(Shape: Shape): Effect = js.native
  
  def FindFirstAnimationForClick(click: Double): Effect = js.native
  
  def Item(Index: Double): Effect = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.Sequence_typekey")
  var PowerPointDotSequence_typekey: Sequence = js.native
}
