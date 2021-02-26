package typingsSlinky.gherkin

import typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.ITag
import typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ILocation
import typingsSlinky.cucumberMessages.idGeneratorMod.NewId
import typingsSlinky.cucumberMessages.mod.messages.GherkinDocument
import typingsSlinky.cucumberMessages.mod.messages.GherkinDocument.Feature
import typingsSlinky.cucumberMessages.mod.messages.GherkinDocument.Feature.Background
import typingsSlinky.cucumberMessages.mod.messages.GherkinDocument.Feature.FeatureChild.Rule
import typingsSlinky.cucumberMessages.mod.messages.GherkinDocument.Feature.Scenario
import typingsSlinky.cucumberMessages.mod.messages.GherkinDocument.Feature.Scenario.Examples
import typingsSlinky.cucumberMessages.mod.messages.GherkinDocument.Feature.Step
import typingsSlinky.cucumberMessages.mod.messages.GherkinDocument.Feature.Step.DataTable
import typingsSlinky.cucumberMessages.mod.messages.GherkinDocument.Feature.Step.DocString
import typingsSlinky.cucumberMessages.mod.messages.GherkinDocument.Feature.TableRow
import typingsSlinky.cucumberMessages.mod.messages.GherkinDocument.Feature.TableRow.TableCell
import typingsSlinky.gherkin.parserMod.RuleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object astBuilderMod {
  
  @JSImport("gherkin/dist/src/AstBuilder", JSImport.Default)
  @js.native
  class default protected () extends AstBuilder {
    def this(newId: NewId) = this()
  }
  
  @js.native
  trait AstBuilder extends StObject {
    
    def build(token: typingsSlinky.gherkin.tokenMod.default): Unit = js.native
    
    var comments: js.Any = js.native
    
    def currentNode(): typingsSlinky.gherkin.astNodeMod.default = js.native
    
    def endRule(ruleType: RuleType): Unit = js.native
    
    def ensureCellCount(rows: js.Array[_]): Unit = js.native
    
    def getCells(tableRowToken: typingsSlinky.gherkin.tokenMod.default): js.Array[TableCell] = js.native
    
    def getDescription(node: typingsSlinky.gherkin.astNodeMod.default): js.Any = js.native
    
    def getLocation(token: typingsSlinky.gherkin.tokenMod.default): ILocation = js.native
    def getLocation(token: typingsSlinky.gherkin.tokenMod.default, column: Double): ILocation = js.native
    
    def getResult(): js.Any = js.native
    
    def getSteps(node: typingsSlinky.gherkin.astNodeMod.default): js.Array[_] = js.native
    
    def getTableRows(node: typingsSlinky.gherkin.astNodeMod.default): js.Array[TableRow] = js.native
    
    def getTags(node: typingsSlinky.gherkin.astNodeMod.default): js.Array[ITag] = js.native
    
    val newId: js.Any = js.native
    
    def reset(): Unit = js.native
    
    var stack: js.Any = js.native
    
    def startRule(ruleType: RuleType): Unit = js.native
    
    def transformNode(node: typingsSlinky.gherkin.astNodeMod.default): String | typingsSlinky.gherkin.astNodeMod.default | GherkinDocument | Feature | Step | DocString | DataTable | js.Array[TableRow] | Background | Scenario | Examples | Rule = js.native
  }
}
