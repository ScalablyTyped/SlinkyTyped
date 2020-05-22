package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ObjectTypeCallPropertyKind
import typingsSlinky.astTypes.kindsMod.ObjectTypeIndexerKind
import typingsSlinky.astTypes.kindsMod.ObjectTypeInternalSlotKind
import typingsSlinky.astTypes.kindsMod.ObjectTypePropertyKind
import typingsSlinky.astTypes.kindsMod.ObjectTypeSpreadPropertyKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallProperties extends js.Object {
  var callProperties: js.UndefOr[js.Array[ObjectTypeCallPropertyKind]] = js.undefined
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var exact: js.UndefOr[Boolean] = js.undefined
  var indexers: js.UndefOr[js.Array[ObjectTypeIndexerKind]] = js.undefined
  var inexact: js.UndefOr[Boolean] = js.undefined
  var internalSlots: js.UndefOr[js.Array[ObjectTypeInternalSlotKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind]
}

object CallProperties {
  @scala.inline
  def apply(
    properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind],
    callProperties: js.Array[ObjectTypeCallPropertyKind] = null,
    comments: js.UndefOr[Null | js.Array[CommentKind]] = js.undefined,
    exact: js.UndefOr[Boolean] = js.undefined,
    indexers: js.Array[ObjectTypeIndexerKind] = null,
    inexact: js.UndefOr[Boolean] = js.undefined,
    internalSlots: js.Array[ObjectTypeInternalSlotKind] = null,
    loc: js.UndefOr[Null | SourceLocationKind] = js.undefined
  ): CallProperties = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    if (callProperties != null) __obj.updateDynamic("callProperties")(callProperties.asInstanceOf[js.Any])
    if (!js.isUndefined(comments)) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact.get.asInstanceOf[js.Any])
    if (indexers != null) __obj.updateDynamic("indexers")(indexers.asInstanceOf[js.Any])
    if (!js.isUndefined(inexact)) __obj.updateDynamic("inexact")(inexact.get.asInstanceOf[js.Any])
    if (internalSlots != null) __obj.updateDynamic("internalSlots")(internalSlots.asInstanceOf[js.Any])
    if (!js.isUndefined(loc)) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallProperties]
  }
}

