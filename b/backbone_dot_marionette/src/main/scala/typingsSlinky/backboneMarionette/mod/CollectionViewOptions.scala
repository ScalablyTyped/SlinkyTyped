package typingsSlinky.backboneMarionette.mod

import typingsSlinky.backbone.mod.Collection
import typingsSlinky.backbone.mod.Model
import typingsSlinky.backboneMarionette.TypeofView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionViewOptions[TModel /* <: Model */, TCollection /* <: Collection[TModel] */]
  extends typingsSlinky.backbone.mod.ViewOptions[TModel]
     with ViewMixinOptions {
  /**
    * Specify a child view to use.
    */
  var childView: js.UndefOr[(js.Function1[/* model */ TModel, TypeofView]) | TypeofView] = js.native
  /**
    * Define options to pass to the childView constructor.
    */
  var childViewOptions: js.UndefOr[js.Function0[ViewOptions[TModel]] | ViewOptions[TModel]] = js.native
  /**
    * Specify a view to use if the collection has no children.
    */
  var emptyView: js.UndefOr[js.Function0[TypeofView] | TypeofView] = js.native
  /**
    * Define options to pass to the emptyView constructor.
    */
  var emptyViewOptions: js.UndefOr[js.Function0[ViewOptions[TModel]] | ViewOptions[TModel]] = js.native
  /**
    * The events attribute binds DOM events to actions to perform on the
    * view. It takes DOM event key and a mapping to the handler.
    */
  @JSName("events")
  var events_CollectionViewOptions: js.UndefOr[EventsHash] = js.native
  /**
    * Prevent some of the underlying collection's models from being
    * rendered as child views.
    */
  var filter: js.UndefOr[
    js.Function3[
      /* child */ js.UndefOr[TModel], 
      /* index */ js.UndefOr[Double], 
      /* collection */ js.UndefOr[TCollection], 
      Boolean
    ]
  ] = js.native
  /**
    * If true when you sort your collection there will be no re-rendering,
    * only the DOM nodes will be reordered.
    */
  var reorderOnSort: js.UndefOr[Boolean] = js.native
  /**
    * If false the collection view will not maintain a sorted collection's
    * order in the DOM.
    */
  var sort: js.UndefOr[Boolean] = js.native
  /**
    * Render your collection view's children with a different sort order
    * than the underlying Backbone collection.
    */
  var viewComparator: js.UndefOr[
    String | (js.Function1[/* element */ TModel, Double | String]) | (js.Function2[/* compare */ TModel, /* to */ js.UndefOr[TModel], Double])
  ] = js.native
}

object CollectionViewOptions {
  @scala.inline
  def apply[TModel, TCollection](): CollectionViewOptions[TModel, TCollection] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionViewOptions[TModel, TCollection]]
  }
  @scala.inline
  implicit class CollectionViewOptionsOps[Self[tmodel, tcollection] <: CollectionViewOptions[tmodel, tcollection], TModel, TCollection] (val x: Self[TModel, TCollection]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TModel, TCollection] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TModel, TCollection]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TModel, TCollection]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TModel, TCollection]) with Other]
    @scala.inline
    def withChildViewFunction1(value: /* model */ TModel => TypeofView): Self[TModel, TCollection] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childView")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withChildView(value: (js.Function1[/* model */ TModel, TypeofView]) | TypeofView): Self[TModel, TCollection] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildView: Self[TModel, TCollection] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childView")(js.undefined)
        ret
    }
    @scala.inline
    def withChildViewOptionsFunction0(value: () => ViewOptions[TModel]): Self[TModel, TCollection] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childViewOptions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withChildViewOptions(value: js.Function0[ViewOptions[TModel]] | ViewOptions[TModel]): Self[TModel, TCollection] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childViewOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildViewOptions: Self[TModel, TCollection] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childViewOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyViewFunction0(value: () => TypeofView): Self[TModel, TCollection] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyView")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEmptyView(value: js.Function0[TypeofView] | TypeofView): Self[TModel, TCollection] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyView: Self[TModel, TCollection] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyView")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyViewOptionsFunction0(value: () => ViewOptions[TModel]): Self[TModel, TCollection] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyViewOptions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEmptyViewOptions(value: js.Function0[ViewOptions[TModel]] | ViewOptions[TModel]): Self[TModel, TCollection] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyViewOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyViewOptions: Self[TModel, TCollection] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyViewOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: EventsHash): Self[TModel, TCollection] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self[TModel, TCollection] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(
      value: (/* child */ js.UndefOr[TModel], /* index */ js.UndefOr[Double], /* collection */ js.UndefOr[TCollection]) => Boolean
    ): Self[TModel, TCollection] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self[TModel, TCollection] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withReorderOnSort(value: Boolean): Self[TModel, TCollection] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reorderOnSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReorderOnSort: Self[TModel, TCollection] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reorderOnSort")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: Boolean): Self[TModel, TCollection] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort: Self[TModel, TCollection] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
    @scala.inline
    def withViewComparatorFunction2(value: (/* compare */ TModel, /* to */ js.UndefOr[TModel]) => Double): Self[TModel, TCollection] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewComparator")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withViewComparatorFunction1(value: /* element */ TModel => Double | String): Self[TModel, TCollection] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewComparator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withViewComparator(
      value: String | (js.Function1[/* element */ TModel, Double | String]) | (js.Function2[/* compare */ TModel, /* to */ js.UndefOr[TModel], Double])
    ): Self[TModel, TCollection] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewComparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewComparator: Self[TModel, TCollection] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewComparator")(js.undefined)
        ret
    }
  }
  
}

