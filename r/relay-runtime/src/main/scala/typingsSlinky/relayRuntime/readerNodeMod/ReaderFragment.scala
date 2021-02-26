package typingsSlinky.relayRuntime.readerNodeMod

import typingsSlinky.relayRuntime.anon.Connection
import typingsSlinky.relayRuntime.relayConcreteNodeMod.GeneratedNode
import typingsSlinky.relayRuntime.relayModernGraphQLTagMod._GraphQLTaggedNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReaderFragment
  extends GeneratedNode
     with ReaderSelectableNode
     with _GraphQLTaggedNode {
  
  val abstractKey: js.UndefOr[String | Null] = js.native
  
  val argumentDefinitions: js.Array[ReaderArgumentDefinition] = js.native
  
  val kind: String = js.native
  
  val metadata: js.UndefOr[Connection | Null] = js.native
  
  // 'Fragment';
  val name: String = js.native
  
  val selections: js.Array[ReaderSelection] = js.native
  
  val `type`: String = js.native
}
object ReaderFragment {
  
  @scala.inline
  def apply(
    argumentDefinitions: js.Array[ReaderArgumentDefinition],
    kind: String,
    name: String,
    selections: js.Array[ReaderSelection],
    `type`: String
  ): ReaderFragment = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderFragment]
  }
  
  @scala.inline
  implicit class ReaderFragmentMutableBuilder[Self <: ReaderFragment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbstractKey(value: String): Self = StObject.set(x, "abstractKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbstractKeyNull: Self = StObject.set(x, "abstractKey", null)
    
    @scala.inline
    def setAbstractKeyUndefined: Self = StObject.set(x, "abstractKey", js.undefined)
    
    @scala.inline
    def setArgumentDefinitions(value: js.Array[ReaderArgumentDefinition]): Self = StObject.set(x, "argumentDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentDefinitionsVarargs(value: ReaderArgumentDefinition*): Self = StObject.set(x, "argumentDefinitions", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: Connection): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelections(value: js.Array[ReaderSelection]): Self = StObject.set(x, "selections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionsVarargs(value: ReaderSelection*): Self = StObject.set(x, "selections", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
