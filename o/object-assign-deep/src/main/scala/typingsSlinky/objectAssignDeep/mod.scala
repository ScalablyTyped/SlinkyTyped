package typingsSlinky.objectAssignDeep

import typingsSlinky.objectAssignDeep.anon.FnCall
import typingsSlinky.objectAssignDeep.objectAssignDeepStrings.merge
import typingsSlinky.objectAssignDeep.objectAssignDeepStrings.replace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("object-assign-deep", JSImport.Namespace)
  @js.native
  def apply(target: js.Object, sources: js.Any*): js.Any = js.native
  @JSImport("object-assign-deep", JSImport.Namespace)
  @js.native
  def apply[T, U](target: T, source: U): T with U = js.native
  @JSImport("object-assign-deep", JSImport.Namespace)
  @js.native
  def apply[T, U, V](target: T, source1: U, source2: V): T with U with V = js.native
  @JSImport("object-assign-deep", JSImport.Namespace)
  @js.native
  def apply[T, U, V, W](target: T, source1: U, source2: V, source3: W): T with U with V with W = js.native
  
  @js.native
  trait Options extends StObject {
    
    var arrayBehaviour: replace | merge = js.native
  }
  object Options {
    
    @scala.inline
    def apply(arrayBehaviour: replace | merge): Options = {
      val __obj = js.Dynamic.literal(arrayBehaviour = arrayBehaviour.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrayBehaviour(value: replace | merge): Self = StObject.set(x, "arrayBehaviour", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait objectAssignDeep extends StObject {
    
    def noMutate(target: js.Object, sources: js.Any*): js.Any = js.native
    def noMutate[T, U](target: T, source: U): T with U = js.native
    def noMutate[T, U, V](target: T, source1: U, source2: V): T with U with V = js.native
    def noMutate[T, U, V, W](target: T, source1: U, source2: V, source3: W): T with U with V with W = js.native
    @JSName("noMutate")
    var noMutate_Original: FnCall = js.native
    
    def withOptions(target: js.Any, objects: js.Array[_], options: Options): js.Any = js.native
    def withOptions[T, U](target: T, objects: js.Array[U], options: Options): T with U = js.native
    def withOptions[T, U, V](target: T, objects: js.Tuple2[U, V], options: Options): T with U with V = js.native
    def withOptions[T, U, V, W](target: T, objects: js.Tuple3[U, V, W], options: Options): T with U with V with W = js.native
  }
}
