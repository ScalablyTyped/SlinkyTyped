package typingsSlinky.knex.mod

import typingsSlinky.knex.knexBooleans.`false`
import typingsSlinky.knex.knexBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Container type for situations when we want a partial/intersection eventually
// but the keys being selected or additional properties being augmented are not
// all known at once and we would want to effectively build up a partial/intersection
// over multiple steps.
@js.native
trait DeferredKeySelection_[// The base of selection. In intermediate stages this may be unknown.
// If it remains unknown at the point of resolution, the selection will fall back to any
TBase, // Union of keys to be selected
// In intermediate stages this may be never.
TKeys /* <: String */, // Changes how the resolution should behave if TKeys is never.
// If true, then we assume that some keys were selected, and if TKeys is never, we will fall back to any.
// If false, and TKeys is never, then we select TBase in its entirity
THasSelect /* <: `true` | `false` */, // Mapping of aliases <key in result> -> <key in TBase>
TAliasMapping /* <: js.Object */, // If enabled, then instead of extracting a partial, during resolution
// we will pick just a single property.
TSingle /* <: Boolean */, // Extra props which will be intersected with the result
TIntersectProps /* <: js.Object */, // Extra props which will be unioned with the result
TUnionProps] extends js.Object {
  var _aliases: TAliasMapping = js.native
  // These properties are not actually used, but exist simply because
  // typescript doesn't end up happy when type parameters are unused
  var _base: TBase = js.native
  var _hasSelection: THasSelect = js.native
  var _intersectProps: TIntersectProps = js.native
  var _keys: TKeys = js.native
  var _single: TSingle = js.native
  var _unionProps: TUnionProps = js.native
}

object DeferredKeySelection_ {
  @scala.inline
  def apply[// The base of selection. In intermediate stages this may be unknown.
  // If it remains unknown at the point of resolution, the selection will fall back to any
  TBase, // Union of keys to be selected
  // In intermediate stages this may be never.
  TKeys, // Changes how the resolution should behave if TKeys is never.
  // If true, then we assume that some keys were selected, and if TKeys is never, we will fall back to any.
  // If false, and TKeys is never, then we select TBase in its entirity
  THasSelect, // Mapping of aliases <key in result> -> <key in TBase>
  TAliasMapping, // If enabled, then instead of extracting a partial, during resolution
  // we will pick just a single property.
  TSingle, // Extra props which will be intersected with the result
  TIntersectProps, // Extra props which will be unioned with the result
  TUnionProps](
    _aliases: TAliasMapping,
    _base: TBase,
    _hasSelection: THasSelect,
    _intersectProps: TIntersectProps,
    _keys: TKeys,
    _single: TSingle,
    _unionProps: TUnionProps
  ): DeferredKeySelection_[TBase, TKeys, THasSelect, TAliasMapping, TSingle, TIntersectProps, TUnionProps] = {
    val __obj = js.Dynamic.literal(_aliases = _aliases.asInstanceOf[js.Any], _base = _base.asInstanceOf[js.Any], _hasSelection = _hasSelection.asInstanceOf[js.Any], _intersectProps = _intersectProps.asInstanceOf[js.Any], _keys = _keys.asInstanceOf[js.Any], _single = _single.asInstanceOf[js.Any], _unionProps = _unionProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeferredKeySelection_[TBase, TKeys, THasSelect, TAliasMapping, TSingle, TIntersectProps, TUnionProps]]
  }
  @scala.inline
  implicit class DeferredKeySelection_Ops[Self[// The base of selection. In intermediate stages this may be unknown.
  // If it remains unknown at the point of resolution, the selection will fall back to any
  tbase, // Union of keys to be selected
  // In intermediate stages this may be never.
  tkeys, // Changes how the resolution should behave if TKeys is never.
  // If true, then we assume that some keys were selected, and if TKeys is never, we will fall back to any.
  // If false, and TKeys is never, then we select TBase in its entirity
  thasselect, // Mapping of aliases <key in result> -> <key in TBase>
  taliasmapping, // If enabled, then instead of extracting a partial, during resolution
  // we will pick just a single property.
  tsingle, // Extra props which will be intersected with the result
  tintersectprops, // Extra props which will be unioned with the result
  tunionprops] <: DeferredKeySelection_[tbase, tkeys, thasselect, taliasmapping, tsingle, tintersectprops, tunionprops], // The base of selection. In intermediate stages this may be unknown.
  // If it remains unknown at the point of resolution, the selection will fall back to any
  TBase, // Union of keys to be selected
  // In intermediate stages this may be never.
  TKeys, // Changes how the resolution should behave if TKeys is never.
  // If true, then we assume that some keys were selected, and if TKeys is never, we will fall back to any.
  // If false, and TKeys is never, then we select TBase in its entirity
  THasSelect, // Mapping of aliases <key in result> -> <key in TBase>
  TAliasMapping, // If enabled, then instead of extracting a partial, during resolution
  // we will pick just a single property.
  TSingle, // Extra props which will be intersected with the result
  TIntersectProps, // Extra props which will be unioned with the result
  TUnionProps] (val x: Self[TBase, TKeys, THasSelect, TAliasMapping, TSingle, TIntersectProps, TUnionProps]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TBase, TKeys, THasSelect, TAliasMapping, TSingle, TIntersectProps, TUnionProps] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TBase, TKeys, THasSelect, TAliasMapping, TSingle, TIntersectProps, TUnionProps]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TBase, TKeys, THasSelect, TAliasMapping, TSingle, TIntersectProps, TUnionProps]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TBase, TKeys, THasSelect, TAliasMapping, TSingle, TIntersectProps, TUnionProps]) with Other]
    @scala.inline
    def with_aliases(value: TAliasMapping): Self[TBase, TKeys, THasSelect, TAliasMapping, TSingle, TIntersectProps, TUnionProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_aliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_base(value: TBase): Self[TBase, TKeys, THasSelect, TAliasMapping, TSingle, TIntersectProps, TUnionProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_hasSelection(value: THasSelect): Self[TBase, TKeys, THasSelect, TAliasMapping, TSingle, TIntersectProps, TUnionProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_hasSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_intersectProps(value: TIntersectProps): Self[TBase, TKeys, THasSelect, TAliasMapping, TSingle, TIntersectProps, TUnionProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_intersectProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_keys(value: TKeys): Self[TBase, TKeys, THasSelect, TAliasMapping, TSingle, TIntersectProps, TUnionProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_single(value: TSingle): Self[TBase, TKeys, THasSelect, TAliasMapping, TSingle, TIntersectProps, TUnionProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_single")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_unionProps(value: TUnionProps): Self[TBase, TKeys, THasSelect, TAliasMapping, TSingle, TIntersectProps, TUnionProps] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_unionProps")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

