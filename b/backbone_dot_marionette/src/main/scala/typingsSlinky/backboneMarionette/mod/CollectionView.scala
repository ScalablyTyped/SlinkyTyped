package typingsSlinky.backboneMarionette.mod

import org.scalajs.dom.raw.DocumentFragment
import typingsSlinky.backbone.mod.Collection
import typingsSlinky.backbone.mod.Model
import typingsSlinky.backbone.mod.ModelSetOptions
import typingsSlinky.backboneMarionette.anon.Instantiable
import typingsSlinky.backboneMarionette.anon.InstantiableView
import typingsSlinky.backboneMarionette.anon.PreventRender
import typingsSlinky.backboneMarionette.backboneMarionetteBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("backbone.marionette", "CollectionView")
@js.native
class CollectionView[TModel /* <: Model[_, ModelSetOptions, js.Object] */, TView /* <: View[TModel] */, TCollection /* <: Collection[TModel] */] () extends View[TModel] {
  def this(options: CollectionViewOptions[TModel, TCollection]) = this()
  
  /**
    * The addChildView method can be used to add a view that is independent
    * of your Backbone.Collection.
    */
  def addChildView(childView: TView, index: Double): Unit = js.native
  
  /**
    * When overriding attachHtml it may be necessary to also override how
    * the buffer is attached.
    */
  def attachBuffer(collectionView: CollectionView[TModel, TView, TCollection], buffer: DocumentFragment): Unit = js.native
  
  /**
    * This method is used move the HTML from the element buffer into the
    * collection view's el.
    */
  def attachHtml(collectionView: CollectionView[TModel, TView, TCollection], childView: TView, index: Double): Unit = js.native
  
  /**
    * The buildChildView is responsible for taking the ChildView class and
    * instantiating it with the appropriate data.
    */
  def buildChildView(child: TModel, childViewClass: Instantiable[TView, TModel], childViewOptions: ViewOptions[TModel]): Unit = js.native
  
  /**
    * Specify a child view to use.
    */
  var childView: (js.Function1[/* model */ TModel, Instantiable[TView, TModel]]) | (Instantiable[TView, TModel]) = js.native
  
  /**
    * Customize the event prefix for events that are forwarded through the
    * collection view.
    */
  @JSName("childViewEventPrefix")
  var childViewEventPrefix_CollectionView: String | `false` = js.native
  
  /**
    * Use the childViewEvents attribute to map child events to methods on the
    * parent view.
    */
  var childViewEvents: EventsHash = js.native
  
  /**
    * Define options to pass to the childView constructor.
    */
  var childViewOptions: (js.Function2[/* model */ TModel, /* index */ Double, ViewOptions[TModel]]) | ViewOptions[TModel] = js.native
  
  /**
    * A childViewTriggers hash or method permits proxying of child view events
    * without manually setting bindings. The values of the hash should be a
    * string of the event to trigger on the parent.
    */
  var childViewTriggers: EventsHash = js.native
  
  /**
    * The CollectionView can store and manage its child views. This allows
    * you to easily access the views within the collection view, iterate
    * them, find them by a given indexer such as the view's model or
    * collection, and more.
    */
  var children: Container[TView] = js.native
  
  /**
    * Bind to events that occur on attached collections.
    */
  var collectionEvents: EventsHash = js.native
  
  /**
    * Automatically destroys this Collection's children and cleans up
    * listeners.
    */
  @JSName("destroy")
  def destroy_MCollectionView(args: js.Any*): CollectionView[TModel, TView, TCollection] = js.native
  
  /**
    * Specify a view to use if the collection has no children.
    */
  var emptyView: js.Function0[InstantiableView[TModel]] | InstantiableView[TModel] = js.native
  
  /**
    * Define options to pass to the emptyView constructor.
    */
  var emptyViewOptions: (js.Function2[/* model */ TModel, /* index */ Double, ViewOptions[TModel]]) | ViewOptions[TModel] = js.native
  
  /**
    * Prevent some of the underlying collection's models from being
    * rendered as child views.
    */
  def filter(): Boolean = js.native
  def filter(child: TModel): Boolean = js.native
  def filter(child: TModel, index: js.UndefOr[scala.Nothing], collection: TCollection): Boolean = js.native
  def filter(child: TModel, index: Double): Boolean = js.native
  def filter(child: TModel, index: Double, collection: TCollection): Boolean = js.native
  def filter(child: js.UndefOr[scala.Nothing], index: js.UndefOr[scala.Nothing], collection: TCollection): Boolean = js.native
  def filter(child: js.UndefOr[scala.Nothing], index: Double): Boolean = js.native
  def filter(child: js.UndefOr[scala.Nothing], index: Double, collection: TCollection): Boolean = js.native
  
   // Mirrors Backbone.Collection.comparator
  /**
    * Override this method to determine which viewComparator to use.
    */
  def getViewComparator(): String | (js.Function1[/* element */ TModel, Double | String]) | (js.Function2[/* compare */ TModel, /* to */ js.UndefOr[TModel], Double]) = js.native
  
  /**
    * Method used to determine when emptyView is rendered.
    */
  def isEmpty(): Boolean = js.native
  
  /**
    * This callback function allows you to know when a child / child view
    * instance has been added to the collection view. It provides access to
    * the view instance for the child that was added.
    */
  def onAddChild(collectionView: CollectionView[TModel, TView, TCollection], childView: TView): Unit = js.native
  
  /**
    * This callback function allows you to know when a child / child view
    * instance is about to be added to the collection view. It provides
    * access to the view instance for the child that was added.
    */
  def onBeforeAddChild(collectionView: CollectionView[TModel, TView, TCollection], childView: TView): Unit = js.native
  
  /**
    * This callback function allows you to know when a childView instance is
    * about to be removed from the collectionView. It provides access to the
    * view instance for the child that was removed.
    */
  def onBeforeRemoveChild(collectionView: CollectionView[TModel, TView, TCollection], childView: TView): Unit = js.native
  
  /**
    * Called just prior to rendering the collection view.
    */
  def onBeforeRender(): Unit = js.native
  
  /**
    * This callback function allows you to know when a child / childView
    * instance has been deleted or removed from the collection.
    */
  def onRemoveChild(collectionView: CollectionView[TModel, TView, TCollection], childView: TView): Unit = js.native
  
  /**
    * Triggered after the view has been rendered. You can implement this in
    * your view to provide custom code for dealing with the view's el after
    * it has been rendered.
    */
  def onRender(): Unit = js.native
  
  /**
    * The removeChildView method is useful if you need to remove a view
    * from the CollectionView without affecting the view's collection.
    */
  def removeChildView(childView: TView): Unit = js.native
  
  /**
    * Remove a filter from the CollectionView.
    */
  def removeFilter(options: PreventRender): Unit = js.native
  
  /**
    * If reorderOnSort is set to true, this function will be used instead
    * of re-rendering all children.
    */
  def reorder(): Unit = js.native
  
  /**
    * If true when you sort your collection there will be no re-rendering,
    * only the DOM nodes will be reordered.
    */
  var reorderOnSort: Boolean = js.native
  
  /**
    * By default the CollectionView will maintain the order of its
    * collection in the DOM. However on occasions the view may need to
    * re-render to make this possible, for example if you were to change
    * the comparator on the collection. The CollectionView will re-render
    * its children or reorder them depending on reorderOnSort.
    */
  def resortView(): Unit = js.native
  
  /**
    * Modify the CollectionView's filter attribute, and renders the new
    * ChildViews in a efficient way, instead of rendering the whole DOM
    * structure again.
    */
  def setFilter(
    filter: js.Function3[
      /* child */ js.UndefOr[TModel], 
      /* index */ js.UndefOr[Double], 
      /* collection */ js.UndefOr[TCollection], 
      Boolean
    ],
    options: PreventRender
  ): Unit = js.native
  
  /**
    * Render your collection view's children with a different sort order
    * than the underlying Backbone collection.
    */
  var viewComparator: String | (js.Function1[/* element */ TModel, Double | String]) | (js.Function2[/* compare */ TModel, /* to */ js.UndefOr[TModel], Double]) = js.native
}
