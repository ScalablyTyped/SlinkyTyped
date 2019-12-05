package typingsSlinky.officeDashJs.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TapObjectType extends js.Object

/**
  * [Api set: WordApi]
  */
@JSGlobal("Word.TapObjectType")
@js.native
object TapObjectType extends js.Object {
  @js.native
  sealed trait chart extends TapObjectType
  
  @js.native
  sealed trait image extends TapObjectType
  
  @js.native
  sealed trait ole extends TapObjectType
  
  @js.native
  sealed trait slide extends TapObjectType
  
  @js.native
  sealed trait smartArt extends TapObjectType
  
  @js.native
  sealed trait table extends TapObjectType
  
  @js.native
  sealed trait text extends TapObjectType
  
  /* "Chart" */ val chart: typingsSlinky.officeDashJs.Word.TapObjectType.chart with String = js.native
  /* "Image" */ val image: typingsSlinky.officeDashJs.Word.TapObjectType.image with String = js.native
  /* "OLE" */ val ole: typingsSlinky.officeDashJs.Word.TapObjectType.ole with String = js.native
  /* "Slide" */ val slide: typingsSlinky.officeDashJs.Word.TapObjectType.slide with String = js.native
  /* "SmartArt" */ val smartArt: typingsSlinky.officeDashJs.Word.TapObjectType.smartArt with String = js.native
  /* "Table" */ val table: typingsSlinky.officeDashJs.Word.TapObjectType.table with String = js.native
  /* "Text" */ val text: typingsSlinky.officeDashJs.Word.TapObjectType.text with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TapObjectType with String] = js.native
}

