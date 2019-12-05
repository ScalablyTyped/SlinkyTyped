package typingsSlinky.officeDashJsDashPreview.Word

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
  
  /* "Chart" */ val chart: typingsSlinky.officeDashJsDashPreview.Word.TapObjectType.chart with String = js.native
  /* "Image" */ val image: typingsSlinky.officeDashJsDashPreview.Word.TapObjectType.image with String = js.native
  /* "OLE" */ val ole: typingsSlinky.officeDashJsDashPreview.Word.TapObjectType.ole with String = js.native
  /* "Slide" */ val slide: typingsSlinky.officeDashJsDashPreview.Word.TapObjectType.slide with String = js.native
  /* "SmartArt" */ val smartArt: typingsSlinky.officeDashJsDashPreview.Word.TapObjectType.smartArt with String = js.native
  /* "Table" */ val table: typingsSlinky.officeDashJsDashPreview.Word.TapObjectType.table with String = js.native
  /* "Text" */ val text: typingsSlinky.officeDashJsDashPreview.Word.TapObjectType.text with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TapObjectType with String] = js.native
}

