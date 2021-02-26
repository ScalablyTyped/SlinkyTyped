package typingsSlinky.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextInput extends StObject {
  
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  
  def Clear(): Unit = js.native
  
  val Creator: Double = js.native
  
  var Default: String = js.native
  
  def EditType(Type: WdTextFormFieldType): Unit = js.native
  def EditType(
    Type: WdTextFormFieldType,
    Default: js.UndefOr[scala.Nothing],
    Format: js.UndefOr[scala.Nothing],
    Enabled: js.Any
  ): Unit = js.native
  def EditType(Type: WdTextFormFieldType, Default: js.UndefOr[scala.Nothing], Format: js.Any): Unit = js.native
  def EditType(Type: WdTextFormFieldType, Default: js.UndefOr[scala.Nothing], Format: js.Any, Enabled: js.Any): Unit = js.native
  def EditType(Type: WdTextFormFieldType, Default: js.Any): Unit = js.native
  def EditType(Type: WdTextFormFieldType, Default: js.Any, Format: js.UndefOr[scala.Nothing], Enabled: js.Any): Unit = js.native
  def EditType(Type: WdTextFormFieldType, Default: js.Any, Format: js.Any): Unit = js.native
  def EditType(Type: WdTextFormFieldType, Default: js.Any, Format: js.Any, Enabled: js.Any): Unit = js.native
  
  val Format: String = js.native
  
  val Parent: js.Any = js.native
  
  val Type: WdTextFormFieldType = js.native
  
  val Valid: Boolean = js.native
  
  var Width: Double = js.native
  
  @JSName("Word.TextInput_typekey")
  var WordDotTextInput_typekey: TextInput = js.native
}
