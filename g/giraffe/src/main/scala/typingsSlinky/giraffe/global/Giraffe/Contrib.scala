package typingsSlinky.giraffe.global.Giraffe

import typingsSlinky.giraffe.Giraffe.App
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Giraffe.Contrib")
@js.native
object Contrib extends js.Object {
  @js.native
  class CollectionView[TModel /* <: typingsSlinky.giraffe.Giraffe.Model */] ()
    extends typingsSlinky.giraffe.Giraffe.Contrib.CollectionView[TModel]
  
  @js.native
  class Controller ()
    extends typingsSlinky.giraffe.Giraffe.Contrib.Controller {
    /* CompleteClass */
    override var app: App = js.native
  }
  
  @js.native
  class FastCollectionView[TModel /* <: typingsSlinky.giraffe.Giraffe.Model */] ()
    extends typingsSlinky.giraffe.Giraffe.Contrib.FastCollectionView[TModel]
  
  /* static members */
  @js.native
  object CollectionView extends js.Object {
    def getDefaults(ctx: js.Any): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object FastCollectionView extends js.Object {
    def getDefaults(ctx: js.Any): js.Any = js.native
  }
  
}

