package typingsSlinky.pumpify

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.duplexify.mod.Duplexify
import typingsSlinky.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pumpify", JSImport.Namespace)
  @js.native
  class ^ protected () extends Pumpify {
    def this(streams: Stream*) = this()
    def this(streams: js.Array[Stream]) = this()
  }
  @JSImport("pumpify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pumpify", "ctor")
  @js.native
  def ctor(opts: PumpifyFactoryOptions): Instantiable1[/* streams (repeated) */ Stream, Pumpify] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("pumpify", "obj")
  @js.native
  class obj protected () extends Pumpify {
    def this(streams: Stream*) = this()
  }
  @JSImport("pumpify", "obj")
  @js.native
  def obj: Instantiable1[/* streams (repeated) */ Stream, Pumpify] = js.native
  @scala.inline
  def obj_=(x: Instantiable1[/* streams (repeated) */ Stream, Pumpify]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("obj")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Pumpify extends Duplexify {
    
    def setPipeline(streams: Stream*): Unit = js.native
    def setPipeline(streams: js.Array[Stream]): Unit = js.native
  }
  
  @js.native
  trait PumpifyFactoryOptions extends StObject {
    
    var autoDestroy: Boolean = js.native
    
    var destroy: Boolean = js.native
    
    var highWaterMark: Double = js.native
    
    var objectMode: Boolean = js.native
  }
  object PumpifyFactoryOptions {
    
    @scala.inline
    def apply(autoDestroy: Boolean, destroy: Boolean, highWaterMark: Double, objectMode: Boolean): PumpifyFactoryOptions = {
      val __obj = js.Dynamic.literal(autoDestroy = autoDestroy.asInstanceOf[js.Any], destroy = destroy.asInstanceOf[js.Any], highWaterMark = highWaterMark.asInstanceOf[js.Any], objectMode = objectMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[PumpifyFactoryOptions]
    }
    
    @scala.inline
    implicit class PumpifyFactoryOptionsMutableBuilder[Self <: PumpifyFactoryOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoDestroy(value: Boolean): Self = StObject.set(x, "autoDestroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroy(value: Boolean): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
    }
  }
}
