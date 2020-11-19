package typingsSlinky.relayCompiler.iRMod

import typingsSlinky.relayCompiler.relayCompilerStrings.mutation
import typingsSlinky.relayCompiler.relayCompilerStrings.query
import typingsSlinky.relayCompiler.relayCompilerStrings.subscription
import typingsSlinky.relayCompiler.schemaMod.CompositeTypeID
import typingsSlinky.relayCompiler.schemaMod.TypeID
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.relayCompiler.iRMod.Fragment
  - typingsSlinky.relayCompiler.iRMod.Root
  - typingsSlinky.relayCompiler.iRMod.SplitOperation
*/
trait Definition extends js.Object
object Definition {
  
  @scala.inline
  def Fragment(
    argumentDefinitions: js.Array[ArgumentDefinition],
    directives: js.Array[Directive],
    kind: typingsSlinky.relayCompiler.relayCompilerStrings.Fragment,
    loc: Location,
    name: String,
    selections: js.Array[Selection],
    `type`: CompositeTypeID
  ): Definition = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definition]
  }
  
  @scala.inline
  def Root(
    argumentDefinitions: js.Array[LocalArgumentDefinition],
    directives: js.Array[Directive],
    kind: typingsSlinky.relayCompiler.relayCompilerStrings.Root,
    loc: Location,
    name: String,
    operation: query | mutation | subscription,
    selections: Selection,
    `type`: CompositeTypeID
  ): Definition = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definition]
  }
  
  @scala.inline
  def SplitOperation(
    kind: typingsSlinky.relayCompiler.relayCompilerStrings.SplitOperation,
    loc: Location,
    name: String,
    parentSources: Set[String],
    selections: js.Array[Selection],
    `type`: TypeID
  ): Definition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentSources = parentSources.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definition]
  }
}
