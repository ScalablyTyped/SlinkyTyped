package typingsSlinky.encodingDown

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typingsSlinky.abstractLeveldown.mod.AbstractBatch
import typingsSlinky.abstractLeveldown.mod.AbstractChainedBatch
import typingsSlinky.abstractLeveldown.mod.AbstractGetOptions
import typingsSlinky.abstractLeveldown.mod.AbstractIterator
import typingsSlinky.abstractLeveldown.mod.AbstractIteratorOptions
import typingsSlinky.abstractLeveldown.mod.AbstractLevelDOWN
import typingsSlinky.abstractLeveldown.mod.AbstractOptions
import typingsSlinky.abstractLeveldown.mod.ErrorCallback
import typingsSlinky.abstractLeveldown.mod.ErrorValueCallback
import typingsSlinky.encodingDown.mod.EncodingDown.BatchOptions
import typingsSlinky.encodingDown.mod.EncodingDown.ChainedBatch
import typingsSlinky.encodingDown.mod.EncodingDown.Constructor
import typingsSlinky.encodingDown.mod.EncodingDown.DelOptions
import typingsSlinky.encodingDown.mod.EncodingDown.GetOptions
import typingsSlinky.encodingDown.mod.EncodingDown.IteratorOptions
import typingsSlinky.encodingDown.mod.EncodingDown.PutOptions
import typingsSlinky.levelCodec.mod.CodecOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("encoding-down", JSImport.Default)
    @js.native
    class ^[K, V] protected () extends EncodingDown[K, V] {
      // tslint:disable-next-line:no-unnecessary-generics
      def this(db: AbstractLevelDOWN[_, _]) = this()
      def this(db: AbstractLevelDOWN[_, _], options: CodecOptions) = this()
    }
    
    @JSImport("encoding-down", JSImport.Default)
    @js.native
    val ^ : Constructor = js.native
    
    type _To = Constructor
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: Constructor = ^
  }
  
  @js.native
  trait EncodingDown[K, V] extends AbstractLevelDOWN[K, V] {
    
    def batch(array: js.Array[AbstractBatch[_, _]], options: BatchOptions, cb: ErrorCallback): ChainedBatch[_, _] = js.native
    
    def del(key: K, options: DelOptions, cb: ErrorCallback): Unit = js.native
    
    def get(key: K, options: GetOptions, cb: ErrorValueCallback[V]): Unit = js.native
    
    def iterator(options: IteratorOptions): AbstractIterator[_, _] = js.native
    
    def put(key: K, value: V, options: PutOptions, cb: ErrorCallback): Unit = js.native
  }
  object EncodingDown {
    
    @js.native
    trait BatchOptions
      extends AbstractOptions
         with CodecOptions
    object BatchOptions {
      
      @scala.inline
      def apply(): BatchOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BatchOptions]
      }
    }
    
    @js.native
    trait ChainedBatch[K, V] extends AbstractChainedBatch[K, V] {
      
      def write(cb: js.Any): js.Any = js.native
      def write(options: CodecOptions with AbstractOptions, cb: js.Any): js.Any = js.native
    }
    
    @js.native
    trait Constructor
      extends // tslint:disable-next-line:no-unnecessary-generics
    Instantiable1[/* db */ AbstractLevelDOWN[js.Any, js.Any], EncodingDown[js.Object, js.Object]]
         with Instantiable2[
              /* db */ AbstractLevelDOWN[js.Any, js.Any], 
              /* options */ CodecOptions, 
              EncodingDown[js.Object, js.Object]
            ] {
      
      // tslint:disable-next-line:no-unnecessary-generics
      def apply[K, V](db: AbstractLevelDOWN[_, _]): EncodingDown[K, V] = js.native
      def apply[K, V](db: AbstractLevelDOWN[_, _], options: CodecOptions): EncodingDown[K, V] = js.native
    }
    
    @js.native
    trait DelOptions
      extends AbstractOptions
         with CodecOptions
    object DelOptions {
      
      @scala.inline
      def apply(): DelOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DelOptions]
      }
    }
    
    @js.native
    trait GetOptions
      extends AbstractGetOptions
         with CodecOptions
    object GetOptions {
      
      @scala.inline
      def apply(): GetOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GetOptions]
      }
    }
    
    @js.native
    trait IteratorOptions
      extends AbstractIteratorOptions[js.Any]
         with CodecOptions
    object IteratorOptions {
      
      @scala.inline
      def apply(): IteratorOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IteratorOptions]
      }
    }
    
    @js.native
    trait PutOptions
      extends AbstractOptions
         with CodecOptions
    object PutOptions {
      
      @scala.inline
      def apply(): PutOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PutOptions]
      }
    }
  }
}
