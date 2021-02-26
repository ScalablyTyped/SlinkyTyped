package typingsSlinky.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hyperlinks extends StObject {
  
  def apply(Index: String): Hyperlink = js.native
  def apply(Index: Double): Hyperlink = js.native
  
  def Add(Anchor: Range, Address: String): Hyperlink = js.native
  def Add(
    Anchor: Range,
    Address: String,
    SubAddress: js.UndefOr[scala.Nothing],
    ScreenTip: js.UndefOr[scala.Nothing],
    TextToDisplay: String
  ): Hyperlink = js.native
  def Add(Anchor: Range, Address: String, SubAddress: js.UndefOr[scala.Nothing], ScreenTip: String): Hyperlink = js.native
  def Add(
    Anchor: Range,
    Address: String,
    SubAddress: js.UndefOr[scala.Nothing],
    ScreenTip: String,
    TextToDisplay: String
  ): Hyperlink = js.native
  def Add(Anchor: Range, Address: String, SubAddress: String): Hyperlink = js.native
  def Add(
    Anchor: Range,
    Address: String,
    SubAddress: String,
    ScreenTip: js.UndefOr[scala.Nothing],
    TextToDisplay: String
  ): Hyperlink = js.native
  def Add(Anchor: Range, Address: String, SubAddress: String, ScreenTip: String): Hyperlink = js.native
  def Add(Anchor: Range, Address: String, SubAddress: String, ScreenTip: String, TextToDisplay: String): Hyperlink = js.native
  def Add(Anchor: Shape, Address: String): Hyperlink = js.native
  def Add(
    Anchor: Shape,
    Address: String,
    SubAddress: js.UndefOr[scala.Nothing],
    ScreenTip: js.UndefOr[scala.Nothing],
    TextToDisplay: String
  ): Hyperlink = js.native
  def Add(Anchor: Shape, Address: String, SubAddress: js.UndefOr[scala.Nothing], ScreenTip: String): Hyperlink = js.native
  def Add(
    Anchor: Shape,
    Address: String,
    SubAddress: js.UndefOr[scala.Nothing],
    ScreenTip: String,
    TextToDisplay: String
  ): Hyperlink = js.native
  def Add(Anchor: Shape, Address: String, SubAddress: String): Hyperlink = js.native
  def Add(
    Anchor: Shape,
    Address: String,
    SubAddress: String,
    ScreenTip: js.UndefOr[scala.Nothing],
    TextToDisplay: String
  ): Hyperlink = js.native
  def Add(Anchor: Shape, Address: String, SubAddress: String, ScreenTip: String): Hyperlink = js.native
  def Add(Anchor: Shape, Address: String, SubAddress: String, ScreenTip: String, TextToDisplay: String): Hyperlink = js.native
  
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Delete(): Unit = js.native
  
  def Item(Index: String): Hyperlink = js.native
  def Item(Index: Double): Hyperlink = js.native
  
  val Parent: js.Any = js.native
  
  def _Default(Index: js.Any): Hyperlink = js.native
}
