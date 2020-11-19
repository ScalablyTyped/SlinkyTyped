package typingsSlinky.giraffe.global.Giraffe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Giraffe.Contrib")
@js.native
object Contrib extends js.Object {
  
  @js.native
  class CollectionView[TModel /* <: typingsSlinky.giraffe.Giraffe.Model */] ()
    extends typingsSlinky.giraffe.Giraffe.Contrib.CollectionView[TModel]
  /* static members */
  @js.native
  object CollectionView extends js.Object {
    
    def getDefaults(ctx: js.Any): js.Any = js.native
  }
  
  @js.native
  class Controller ()
    extends typingsSlinky.giraffe.Giraffe.Contrib.Controller
  
  @js.native
  class FastCollectionView[TModel /* <: typingsSlinky.giraffe.Giraffe.Model */] ()
    extends typingsSlinky.giraffe.Giraffe.Contrib.FastCollectionView[TModel]
  /* static members */
  @js.native
  object FastCollectionView extends js.Object {
    
    def getDefaults(ctx: js.Any): js.Any = js.native
  }
}
