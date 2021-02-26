package typingsSlinky.globPromise

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.glob.mod.IGlob
import typingsSlinky.glob.mod.IGlobStatic
import typingsSlinky.glob.mod.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("glob-promise", JSImport.Namespace)
  @js.native
  val ^ : Export = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("glob-promise", "Glob")
  @js.native
  class Glob protected () extends IGlob {
    def this(pattern: String) = this()
    def this(pattern: String, cb: js.Function2[/* err */ js.Error | Null, /* matches */ js.Array[String], Unit]) = this()
    def this(pattern: String, options: IOptions) = this()
    def this(
      pattern: String,
      options: IOptions,
      cb: js.Function2[/* err */ js.Error | Null, /* matches */ js.Array[String], Unit]
    ) = this()
  }
  
  @js.native
  trait Export extends GlobPromise {
    
    val Glob: IGlobStatic = js.native
    
    def glob(pattern: String, cb: js.Function2[/* err */ js.Error | Null, /* matches */ js.Array[String], Unit]): IGlob = js.native
    def glob(
      pattern: String,
      options: IOptions,
      cb: js.Function2[/* err */ js.Error | Null, /* matches */ js.Array[String], Unit]
    ): IGlob = js.native
    
    def hasMagic(pattern: String): Boolean = js.native
    def hasMagic(pattern: String, options: IOptions): Boolean = js.native
    
    def promise(pattern: String): js.Promise[js.Array[String]] = js.native
    def promise(pattern: String, options: IOptions): js.Promise[js.Array[String]] = js.native
    
    def sync(pattern: String): js.Array[String] = js.native
    def sync(pattern: String, options: IOptions): js.Array[String] = js.native
  }
  
  type GlobPromise = js.Function2[
    /* pattern */ String, 
    /* options */ js.UndefOr[IOptions], 
    js.Promise[js.Array[String]]
  ]
  
  type _To = Export
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Export = ^
}
