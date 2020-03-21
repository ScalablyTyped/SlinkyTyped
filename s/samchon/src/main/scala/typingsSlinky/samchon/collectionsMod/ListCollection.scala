package typingsSlinky.samchon.collectionsMod

import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.tstl.mod.base.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/collections", "ListCollection")
@js.native
class ListCollection[T] ()
  extends typingsSlinky.ecol.listCollectionMod.ListCollection[T]

@JSImport("samchon/collections", "ListCollection")
@js.native
object ListCollection extends js.Object {
  /**
    * Iterator of {@link List}
    *
    * @author Jeongho Nam - https://github.com/samchon
    */
  @js.native
  class Iterator[T] protected ()
    extends typingsSlinky.ecol.mod.ListCollection.Iterator[T]
  
  /**
    * Reverse iterator of {@link List}
    *
    * @author Jeongho Nam - https://github.com/samchon
    */
  @js.native
  class ReverseIterator[T] ()
    extends typingsSlinky.ecol.listCollectionMod.ListCollection.ReverseIterator[T]
  
  val Event: Instantiable3[
    /* type */ String, 
    /* import warning: RewrittenClass.unapply cls was tparam IteratorT */ /* first */ js.Any, 
    /* import warning: RewrittenClass.unapply cls was tparam IteratorT */ /* last */ js.Any, 
    typingsSlinky.ecol.collectionEventMod.CollectionEvent[
      js.Object, 
      Container[
        /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam SourceT */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam IteratorT */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam ReverseT */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any
      ], 
      js.Iterator[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any
    ]
  ] = js.native
}

