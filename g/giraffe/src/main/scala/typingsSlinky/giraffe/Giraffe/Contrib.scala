package typingsSlinky.giraffe.Giraffe

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.backbone.mod.EventsMixin
import typingsSlinky.jquery.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Giraffe.Contrib")
@js.native
object Contrib extends js.Object {
  
  @js.native
  trait CollectionView[TModel /* <: Model */] extends View[TModel] {
    
    def addOne(model: Model): View[TModel] = js.native
    
    @JSName("collection")
    var collection_CollectionView: Collection[TModel] = js.native
    
    def findByModel(model: Model): View[TModel] = js.native
    
    var modelView: View[TModel] = js.native
    
    var modelViewArgs: js.Array[_] = js.native
    
    var modelViewEl: js.Any = js.native
    
    def removeOne(model: Model): View[TModel] = js.native
    
    var renderOnChange: Boolean = js.native
  }
  
  @js.native
  trait Controller
    extends EventsMixin
       with GiraffeObject {
    
    /**
      * Faulty overgeneralization of Backbone.Events.on, for historical
      * reasons.
      */
    def on(eventName: js.Any): this.type = js.native
    def on(eventName: js.Any, callback: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
    def on(eventName: js.Any, callback: js.Any): this.type = js.native
    def on(eventName: js.Any, callback: js.Any, context: js.Any): this.type = js.native
  }
  
  @js.native
  trait FastCollectionView[TModel /* <: Model */] extends View[TModel] {
    
    def addAll(): View[TModel] = js.native
    
    def addOne(model: Model): View[TModel] = js.native
    
    @JSName("collection")
    var collection_FastCollectionView: Collection[TModel] = js.native
    
    def findElByIndex(index: Double): JQuery[HTMLElement] = js.native
    
    def findElByModel(model: Model): JQuery[HTMLElement] = js.native
    
    def findModelByEl(el: js.Any): Model = js.native
    
    var modelEl: js.Any = js.native
    
    def modelSerialize(): js.Any = js.native
    
    var modelTemplate: js.Any = js.native
    
    var modelTemplateStrategy: String = js.native
    
    def removeByIndex(index: Double): View[TModel] = js.native
    
    def removeOne(model: Model): View[TModel] = js.native
    
    var renderOnChange: Boolean = js.native
  }
}
