package typingsSlinky.isGlob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("is-glob", JSImport.Namespace)
  @js.native
  def apply(): Boolean = js.native
  @JSImport("is-glob", JSImport.Namespace)
  @js.native
  def apply(pattern: js.UndefOr[scala.Nothing], options: Options): Boolean = js.native
  @JSImport("is-glob", JSImport.Namespace)
  @js.native
  def apply(pattern: String): Boolean = js.native
  @JSImport("is-glob", JSImport.Namespace)
  @js.native
  def apply(pattern: String, options: Options): Boolean = js.native
  @JSImport("is-glob", JSImport.Namespace)
  @js.native
  def apply(pattern: js.Array[String]): Boolean = js.native
  @JSImport("is-glob", JSImport.Namespace)
  @js.native
  def apply(pattern: js.Array[String], options: Options): Boolean = js.native
  @JSImport("is-glob", JSImport.Namespace)
  @js.native
  def apply(pattern: Null, options: Options): Boolean = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
      * When `false` the behavior is less strict in determining if a pattern is a glob. Meaning that some patterns
      * that would return false may return true. This is done so that matching libraries like micromatch
      * have a chance at determining if the pattern is a glob or not.
      */
    var strict: js.UndefOr[Boolean] = js.native
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
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
}
