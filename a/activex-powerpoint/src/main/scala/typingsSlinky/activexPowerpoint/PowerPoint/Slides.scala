package typingsSlinky.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Slides extends StObject {
  
  def Add(Index: Double, Layout: PpSlideLayout): Slide = js.native
  
  def AddSlide(Index: Double, pCustomLayout: CustomLayout): Slide = js.native
  
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  
  val Count: Double = js.native
  
  def FindBySlideID(SlideID: Double): Slide = js.native
  
  /**
    * @param number [SlideStart=1]
    * @param number [SlideEnd=-1]
    */
  def InsertFromFile(FileName: String, Index: Double): Double = js.native
  def InsertFromFile(FileName: String, Index: Double, SlideStart: js.UndefOr[scala.Nothing], SlideEnd: Double): Double = js.native
  def InsertFromFile(FileName: String, Index: Double, SlideStart: Double): Double = js.native
  def InsertFromFile(FileName: String, Index: Double, SlideStart: Double, SlideEnd: Double): Double = js.native
  
  def Item(Index: js.Any): Slide = js.native
  
  val Parent: js.Any = js.native
  
  /** @param number [Index=-1] */
  def Paste(): SlideRange = js.native
  def Paste(Index: Double): SlideRange = js.native
  
  @JSName("PowerPoint.Slides_typekey")
  var PowerPointDotSlides_typekey: Slides = js.native
  
  def Range(): SlideRange = js.native
  def Range(Index: js.Any): SlideRange = js.native
}
