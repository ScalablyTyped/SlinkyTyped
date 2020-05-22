package typingsSlinky.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Static data for a view  */
trait TViewNode extends TNode {
  @JSName("child")
  var child_TViewNode: ɵangularPackagesCoreCoreBf | TTextNode | TElementContainerNode | TContainerNode | TProjectionNode | Null
  @JSName("parent")
  var parent_TViewNode: TContainerNode | Null
  @JSName("projection")
  var projection_TViewNode: Null
  @JSName("tViews")
  var tViews_TViewNode: Null
}

object TViewNode {
  @scala.inline
  def apply(
    directiveEnd: Double,
    directiveStart: Double,
    flags: TNodeFlags,
    index: Double,
    injectorIndex: Double,
    projection: Null,
    propertyMetadataEndIndex: Double,
    propertyMetadataStartIndex: Double,
    providerIndexes: TNodeProviderIndexes,
    tViews: Null,
    `type`: TNodeType,
    attrs: TAttributes = null,
    child: ɵangularPackagesCoreCoreBf | TTextNode | TElementContainerNode | TContainerNode | TProjectionNode = null,
    classes: StylingMapArray | TStylingContext = null,
    initialInputs: js.UndefOr[Null | InitialInputData] = js.undefined,
    inputs: js.UndefOr[Null | PropertyAliases] = js.undefined,
    localNames: js.Array[String | Double] = null,
    next: TNode = null,
    outputs: js.UndefOr[Null | PropertyAliases] = js.undefined,
    parent: TContainerNode = null,
    projectionNext: TNode = null,
    styles: StylingMapArray | TStylingContext = null,
    tagName: String = null
  ): TViewNode = {
    val __obj = js.Dynamic.literal(directiveEnd = directiveEnd.asInstanceOf[js.Any], directiveStart = directiveStart.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], injectorIndex = injectorIndex.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], propertyMetadataEndIndex = propertyMetadataEndIndex.asInstanceOf[js.Any], propertyMetadataStartIndex = propertyMetadataStartIndex.asInstanceOf[js.Any], providerIndexes = providerIndexes.asInstanceOf[js.Any], tViews = tViews.asInstanceOf[js.Any], attrs = attrs.asInstanceOf[js.Any], child = child.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], localNames = localNames.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], projectionNext = projectionNext.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(initialInputs)) __obj.updateDynamic("initialInputs")(initialInputs.asInstanceOf[js.Any])
    if (!js.isUndefined(inputs)) __obj.updateDynamic("inputs")(inputs.asInstanceOf[js.Any])
    if (!js.isUndefined(outputs)) __obj.updateDynamic("outputs")(outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TViewNode]
  }
}

