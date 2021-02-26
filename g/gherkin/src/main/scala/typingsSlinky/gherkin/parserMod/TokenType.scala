package typingsSlinky.gherkin.parserMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TokenType extends StObject
@JSImport("gherkin/dist/src/Parser", "TokenType")
@js.native
object TokenType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TokenType with Double] = js.native
  
  @js.native
  sealed trait BackgroundLine extends TokenType
  /* 7 */ val BackgroundLine: typingsSlinky.gherkin.parserMod.TokenType.BackgroundLine with Double = js.native
  
  @js.native
  sealed trait Comment extends TokenType
  /* 3 */ val Comment: typingsSlinky.gherkin.parserMod.TokenType.Comment with Double = js.native
  
  @js.native
  sealed trait DocStringSeparator extends TokenType
  /* 11 */ val DocStringSeparator: typingsSlinky.gherkin.parserMod.TokenType.DocStringSeparator with Double = js.native
  
  @js.native
  sealed trait EOF extends TokenType
  /* 1 */ val EOF: typingsSlinky.gherkin.parserMod.TokenType.EOF with Double = js.native
  
  @js.native
  sealed trait Empty extends TokenType
  /* 2 */ val Empty: typingsSlinky.gherkin.parserMod.TokenType.Empty with Double = js.native
  
  @js.native
  sealed trait ExamplesLine extends TokenType
  /* 9 */ val ExamplesLine: typingsSlinky.gherkin.parserMod.TokenType.ExamplesLine with Double = js.native
  
  @js.native
  sealed trait FeatureLine extends TokenType
  /* 5 */ val FeatureLine: typingsSlinky.gherkin.parserMod.TokenType.FeatureLine with Double = js.native
  
  @js.native
  sealed trait Language extends TokenType
  /* 13 */ val Language: typingsSlinky.gherkin.parserMod.TokenType.Language with Double = js.native
  
  @js.native
  sealed trait None extends TokenType
  /* 0 */ val None: typingsSlinky.gherkin.parserMod.TokenType.None with Double = js.native
  
  @js.native
  sealed trait Other extends TokenType
  /* 14 */ val Other: typingsSlinky.gherkin.parserMod.TokenType.Other with Double = js.native
  
  @js.native
  sealed trait RuleLine extends TokenType
  /* 6 */ val RuleLine: typingsSlinky.gherkin.parserMod.TokenType.RuleLine with Double = js.native
  
  @js.native
  sealed trait ScenarioLine extends TokenType
  /* 8 */ val ScenarioLine: typingsSlinky.gherkin.parserMod.TokenType.ScenarioLine with Double = js.native
  
  @js.native
  sealed trait StepLine extends TokenType
  /* 10 */ val StepLine: typingsSlinky.gherkin.parserMod.TokenType.StepLine with Double = js.native
  
  @js.native
  sealed trait TableRow extends TokenType
  /* 12 */ val TableRow: typingsSlinky.gherkin.parserMod.TokenType.TableRow with Double = js.native
  
  @js.native
  sealed trait TagLine extends TokenType
  /* 4 */ val TagLine: typingsSlinky.gherkin.parserMod.TokenType.TagLine with Double = js.native
}
