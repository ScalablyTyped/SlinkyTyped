package typingsSlinky.gherkin.parserMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RuleType extends StObject
@JSImport("gherkin/dist/src/Parser", "RuleType")
@js.native
object RuleType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RuleType with Double] = js.native
  
  @js.native
  sealed trait Background extends RuleType
  /* 20 */ val Background: typingsSlinky.gherkin.parserMod.RuleType.Background with Double = js.native
  
  @js.native
  sealed trait DataTable extends RuleType
  /* 28 */ val DataTable: typingsSlinky.gherkin.parserMod.RuleType.DataTable with Double = js.native
  
  @js.native
  sealed trait Description extends RuleType
  /* 32 */ val Description: typingsSlinky.gherkin.parserMod.RuleType.Description with Double = js.native
  
  @js.native
  sealed trait DescriptionHelper extends RuleType
  /* 31 */ val DescriptionHelper: typingsSlinky.gherkin.parserMod.RuleType.DescriptionHelper with Double = js.native
  
  @js.native
  sealed trait DocString extends RuleType
  /* 29 */ val DocString: typingsSlinky.gherkin.parserMod.RuleType.DocString with Double = js.native
  
  @js.native
  sealed trait Examples extends RuleType
  /* 24 */ val Examples: typingsSlinky.gherkin.parserMod.RuleType.Examples with Double = js.native
  
  @js.native
  sealed trait ExamplesDefinition extends RuleType
  /* 23 */ val ExamplesDefinition: typingsSlinky.gherkin.parserMod.RuleType.ExamplesDefinition with Double = js.native
  
  @js.native
  sealed trait ExamplesTable extends RuleType
  /* 25 */ val ExamplesTable: typingsSlinky.gherkin.parserMod.RuleType.ExamplesTable with Double = js.native
  
  @js.native
  sealed trait Feature extends RuleType
  /* 16 */ val Feature: typingsSlinky.gherkin.parserMod.RuleType.Feature with Double = js.native
  
  @js.native
  sealed trait FeatureHeader extends RuleType
  /* 17 */ val FeatureHeader: typingsSlinky.gherkin.parserMod.RuleType.FeatureHeader with Double = js.native
  
  @js.native
  sealed trait GherkinDocument extends RuleType
  /* 15 */ val GherkinDocument: typingsSlinky.gherkin.parserMod.RuleType.GherkinDocument with Double = js.native
  
  @js.native
  sealed trait None extends RuleType
  /* 0 */ val None: typingsSlinky.gherkin.parserMod.RuleType.None with Double = js.native
  
  @js.native
  sealed trait Rule extends RuleType
  /* 18 */ val Rule: typingsSlinky.gherkin.parserMod.RuleType.Rule with Double = js.native
  
  @js.native
  sealed trait RuleHeader extends RuleType
  /* 19 */ val RuleHeader: typingsSlinky.gherkin.parserMod.RuleType.RuleHeader with Double = js.native
  
  @js.native
  sealed trait Scenario extends RuleType
  /* 22 */ val Scenario: typingsSlinky.gherkin.parserMod.RuleType.Scenario with Double = js.native
  
  @js.native
  sealed trait ScenarioDefinition extends RuleType
  /* 21 */ val ScenarioDefinition: typingsSlinky.gherkin.parserMod.RuleType.ScenarioDefinition with Double = js.native
  
  @js.native
  sealed trait Step extends RuleType
  /* 26 */ val Step: typingsSlinky.gherkin.parserMod.RuleType.Step with Double = js.native
  
  @js.native
  sealed trait StepArg extends RuleType
  /* 27 */ val StepArg: typingsSlinky.gherkin.parserMod.RuleType.StepArg with Double = js.native
  
  @js.native
  sealed trait Tags extends RuleType
  /* 30 */ val Tags: typingsSlinky.gherkin.parserMod.RuleType.Tags with Double = js.native
  
  @js.native
  sealed trait _BackgroundLine extends RuleType
  /* 7 */ val _BackgroundLine: typingsSlinky.gherkin.parserMod.RuleType._BackgroundLine with Double = js.native
  
  @js.native
  sealed trait _Comment extends RuleType
  /* 3 */ val _Comment: typingsSlinky.gherkin.parserMod.RuleType._Comment with Double = js.native
  
  @js.native
  sealed trait _DocStringSeparator extends RuleType
  /* 11 */ val _DocStringSeparator: typingsSlinky.gherkin.parserMod.RuleType._DocStringSeparator with Double = js.native
  
  @js.native
  sealed trait _EOF extends RuleType
  /* 1 */ val _EOF: typingsSlinky.gherkin.parserMod.RuleType._EOF with Double = js.native
  
  @js.native
  sealed trait _Empty extends RuleType
  /* 2 */ val _Empty: typingsSlinky.gherkin.parserMod.RuleType._Empty with Double = js.native
  
  @js.native
  sealed trait _ExamplesLine extends RuleType
  /* 9 */ val _ExamplesLine: typingsSlinky.gherkin.parserMod.RuleType._ExamplesLine with Double = js.native
  
  @js.native
  sealed trait _FeatureLine extends RuleType
  /* 5 */ val _FeatureLine: typingsSlinky.gherkin.parserMod.RuleType._FeatureLine with Double = js.native
  
  @js.native
  sealed trait _Language extends RuleType
  /* 13 */ val _Language: typingsSlinky.gherkin.parserMod.RuleType._Language with Double = js.native
  
  @js.native
  sealed trait _Other extends RuleType
  /* 14 */ val _Other: typingsSlinky.gherkin.parserMod.RuleType._Other with Double = js.native
  
  @js.native
  sealed trait _RuleLine extends RuleType
  /* 6 */ val _RuleLine: typingsSlinky.gherkin.parserMod.RuleType._RuleLine with Double = js.native
  
  @js.native
  sealed trait _ScenarioLine extends RuleType
  /* 8 */ val _ScenarioLine: typingsSlinky.gherkin.parserMod.RuleType._ScenarioLine with Double = js.native
  
  @js.native
  sealed trait _StepLine extends RuleType
  /* 10 */ val _StepLine: typingsSlinky.gherkin.parserMod.RuleType._StepLine with Double = js.native
  
  @js.native
  sealed trait _TableRow extends RuleType
  /* 12 */ val _TableRow: typingsSlinky.gherkin.parserMod.RuleType._TableRow with Double = js.native
  
  @js.native
  sealed trait _TagLine extends RuleType
  /* 4 */ val _TagLine: typingsSlinky.gherkin.parserMod.RuleType._TagLine with Double = js.native
}
