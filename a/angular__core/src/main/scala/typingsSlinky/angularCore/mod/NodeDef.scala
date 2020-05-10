package typingsSlinky.angularCore.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A node definition in the view.
  *
  * Note: We use one type for all nodes so that loops that loop over all nodes
  * of a ViewDefinition stay monomorphic!
  */
@js.native
trait NodeDef extends js.Object {
  var bindingFlags: ɵBindingFlags = js.native
  var bindingIndex: Double = js.native
  var bindings: js.Array[BindingDef] = js.native
  var checkIndex: Double = js.native
  /** number of transitive children */
  var childCount: Double = js.native
  /** aggregated NodeFlags for all transitive children (does not include self) **/
  var childFlags: ɵNodeFlags = js.native
  /**
    * Binary or of all query ids that are matched by one of the children.
    * This includes query ids from templates as well.
    * Used as a bloom filter.
    */
  var childMatchedQueries: Double = js.native
  /** aggregated NodeFlags for all direct children (does not include self) **/
  var directChildFlags: ɵNodeFlags = js.native
  var element: ElementDef | Null = js.native
  var flags: ɵNodeFlags = js.native
  /**
    * ids and value types of all queries that are matched by this node.
    */
  var matchedQueries: NumberDictionary[ɵQueryValueType] = js.native
  /** Binary or of all matched query ids of this node. */
  var matchedQueryIds: Double = js.native
  var ngContent: NgContentDef | Null = js.native
  /** this is checked against NgContentDef.index to find matched nodes */
  var ngContentIndex: Double | Null = js.native
  var nodeIndex: Double = js.native
  var outputIndex: Double = js.native
  var outputs: js.Array[OutputDef] = js.native
  var parent: NodeDef | Null = js.native
  var provider: ProviderDef | Null = js.native
  var query: QueryDef | Null = js.native
  /**
    * references that the user placed on the element
    */
  var references: StringDictionary[ɵQueryValueType] = js.native
  var renderParent: NodeDef | Null = js.native
  var text: TextDef | Null = js.native
}

object NodeDef {
  @scala.inline
  def apply(
    bindingFlags: ɵBindingFlags,
    bindingIndex: Double,
    bindings: js.Array[BindingDef],
    checkIndex: Double,
    childCount: Double,
    childFlags: ɵNodeFlags,
    childMatchedQueries: Double,
    directChildFlags: ɵNodeFlags,
    flags: ɵNodeFlags,
    matchedQueries: NumberDictionary[ɵQueryValueType],
    matchedQueryIds: Double,
    nodeIndex: Double,
    outputIndex: Double,
    outputs: js.Array[OutputDef],
    references: StringDictionary[ɵQueryValueType]
  ): NodeDef = {
    val __obj = js.Dynamic.literal(bindingFlags = bindingFlags.asInstanceOf[js.Any], bindingIndex = bindingIndex.asInstanceOf[js.Any], bindings = bindings.asInstanceOf[js.Any], checkIndex = checkIndex.asInstanceOf[js.Any], childCount = childCount.asInstanceOf[js.Any], childFlags = childFlags.asInstanceOf[js.Any], childMatchedQueries = childMatchedQueries.asInstanceOf[js.Any], directChildFlags = directChildFlags.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], matchedQueries = matchedQueries.asInstanceOf[js.Any], matchedQueryIds = matchedQueryIds.asInstanceOf[js.Any], nodeIndex = nodeIndex.asInstanceOf[js.Any], outputIndex = outputIndex.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeDef]
  }
  @scala.inline
  implicit class NodeDefOps[Self <: NodeDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindingFlags(value: ɵBindingFlags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindingFlags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBindingIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindingIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBindings(value: js.Array[BindingDef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildFlags(value: ɵNodeFlags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childFlags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildMatchedQueries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childMatchedQueries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirectChildFlags(value: ɵNodeFlags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directChildFlags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlags(value: ɵNodeFlags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchedQueries(value: NumberDictionary[ɵQueryValueType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchedQueries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchedQueryIds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchedQueryIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputs(value: js.Array[OutputDef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferences(value: StringDictionary[ɵQueryValueType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("references")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElement(value: ElementDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElementNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(null)
        ret
    }
    @scala.inline
    def withNgContent(value: NgContentDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNgContentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngContent")(null)
        ret
    }
    @scala.inline
    def withNgContentIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngContentIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNgContentIndexNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngContentIndex")(null)
        ret
    }
    @scala.inline
    def withParent(value: NodeDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(null)
        ret
    }
    @scala.inline
    def withProvider(value: ProviderDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProviderNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(null)
        ret
    }
    @scala.inline
    def withQuery(value: QueryDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(null)
        ret
    }
    @scala.inline
    def withRenderParent(value: NodeDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderParentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderParent")(null)
        ret
    }
    @scala.inline
    def withText(value: TextDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(null)
        ret
    }
  }
  
}

