package typingsSlinky.ecol.mod

import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.tstl.icontainerMod.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ecol", "ListCollection")
@js.native
class ListCollection[T] ()
  extends typingsSlinky.ecol.listCollectionMod.ListCollection[T]
@JSImport("ecol", "ListCollection")
@js.native
object ListCollection extends js.Object {
  
  val Event: Instantiable3[
    /* type */ String, 
    /* import warning: RewrittenClass.unapply cls was tparam IteratorT */ /* first */ js.Any, 
    /* import warning: RewrittenClass.unapply cls was tparam IteratorT */ /* last */ js.Any, 
    typingsSlinky.ecol.collectionEventMod.CollectionEvent[
      js.Object, 
      IContainer[
        /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam SourceT */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam IteratorT */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam ReverseT */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any
      ], 
      typingsSlinky.tstl.icontainerMod.IContainer.Iterator[
        /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam SourceT */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam IteratorT */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam ReverseT */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any
      ], 
      typingsSlinky.tstl.icontainerMod.IContainer.ReverseIterator[
        /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam SourceT */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam IteratorT */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam ReverseT */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any
      ]
    ]
  ] = js.native
  
  /**
    * Iterator of {@link List}
    *
    * @author Jeongho Nam - https://github.com/samchon
    */
  @js.native
  class Iterator[T] protected ()
    extends typingsSlinky.ecol.listCollectionMod.ListCollection.Iterator[T]
  
  /**
    * Reverse iterator of {@link List}
    *
    * @author Jeongho Nam - https://github.com/samchon
    */
  @js.native
  class ReverseIterator[T] ()
    extends typingsSlinky.ecol.listCollectionMod.ListCollection.ReverseIterator[T]
}
