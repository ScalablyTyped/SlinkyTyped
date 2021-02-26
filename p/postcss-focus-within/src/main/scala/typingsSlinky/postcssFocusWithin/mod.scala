package typingsSlinky.postcssFocusWithin

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.postcss.mod.Plugin_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("postcss-focus-within", JSImport.Namespace)
  @js.native
  val ^ : FocusWithin = js.native
  
  type FocusWithin = Plugin_[Options]
  
  /**
    * @see {@link https://github.com/csstools/postcss-focus-within#options}
    */
  @js.native
  trait Options extends StObject {
    
    /**
      * The preserve option defines whether the original selector should remain.
      * By default, the original selector is preserved.
      * @default true
      */
    var preserve: js.UndefOr[Boolean] = js.native
    
    /**
      * The replaceWith option defines the selector to replace `:focus-within`.
      * By default, the replacement selector is `[focus-within]`.
      * @default `[focus-within]`
      */
    var replaceWith: js.UndefOr[String] = js.native
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
      def setPreserve(value: Boolean): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveUndefined: Self = StObject.set(x, "preserve", js.undefined)
      
      @scala.inline
      def setReplaceWith(value: String): Self = StObject.set(x, "replaceWith", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceWithUndefined: Self = StObject.set(x, "replaceWith", js.undefined)
    }
  }
  
  type _To = FocusWithin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: FocusWithin = ^
}
