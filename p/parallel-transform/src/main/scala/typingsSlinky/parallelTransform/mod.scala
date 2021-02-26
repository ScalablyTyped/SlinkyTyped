package typingsSlinky.parallelTransform

import typingsSlinky.node.streamMod.Transform
import typingsSlinky.node.streamMod.TransformCallback
import typingsSlinky.node.streamMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("parallel-transform", JSImport.Namespace)
  @js.native
  def apply(maxParallel: Double, opts: js.UndefOr[scala.Nothing], ontransform: OnTransform): Transform = js.native
  @JSImport("parallel-transform", JSImport.Namespace)
  @js.native
  def apply(maxParallel: Double, opts: Null, ontransform: OnTransform): Transform = js.native
  @JSImport("parallel-transform", JSImport.Namespace)
  @js.native
  def apply(maxParallel: Double, opts: Options, ontransform: OnTransform): Transform = js.native
  @JSImport("parallel-transform", JSImport.Namespace)
  @js.native
  def apply(ontransform: OnTransform): Transform = js.native
  @JSImport("parallel-transform", JSImport.Namespace)
  @js.native
  def apply(opts: js.UndefOr[scala.Nothing], ontransform: OnTransform): Transform = js.native
  @JSImport("parallel-transform", JSImport.Namespace)
  @js.native
  def apply(opts: Double, ontransform: OnTransform): Transform = js.native
  @JSImport("parallel-transform", JSImport.Namespace)
  @js.native
  def apply(opts: Null, ontransform: OnTransform): Transform = js.native
  @JSImport("parallel-transform", JSImport.Namespace)
  @js.native
  def apply(opts: Options, ontransform: OnTransform): Transform = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("parallel-transform", JSImport.Namespace)
  @js.native
  class ^ protected () extends Transform {
    def this(ontransform: OnTransform) = this()
    def this(opts: js.UndefOr[scala.Nothing], ontransform: OnTransform) = this()
    def this(opts: Double, ontransform: OnTransform) = this()
    def this(opts: Null, ontransform: OnTransform) = this()
    def this(opts: Options, ontransform: OnTransform) = this()
    def this(maxParallel: Double, opts: js.UndefOr[scala.Nothing], ontransform: OnTransform) = this()
    def this(maxParallel: Double, opts: Null, ontransform: OnTransform) = this()
    def this(maxParallel: Double, opts: Options, ontransform: OnTransform) = this()
  }
  
  type OnTransform = js.Function2[/* chunk */ js.Any, /* callback */ TransformCallback, Unit]
  
  @js.native
  trait Options extends TransformOptions {
    
    var ordered: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOrdered(value: Boolean): Self = StObject.set(x, "ordered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderedUndefined: Self = StObject.set(x, "ordered", js.undefined)
    }
  }
}
