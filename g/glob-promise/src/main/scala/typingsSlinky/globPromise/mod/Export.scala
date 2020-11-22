package typingsSlinky.globPromise.mod

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.glob.mod.Glob_
import typingsSlinky.glob.mod.IGlob
import typingsSlinky.glob.mod.IGlobStatic
import typingsSlinky.glob.mod.IOptions
import typingsSlinky.globPromise.anon.Call
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Export extends GlobPromise {
  
  val Glob: IGlobStatic with (Instantiable1[/* pattern */ String, Glob_]) = js.native
  
  def glob(pattern: String, cb: js.Function2[/* err */ js.Error | Null, /* matches */ js.Array[String], Unit]): IGlob = js.native
  def glob(
    pattern: String,
    options: IOptions,
    cb: js.Function2[/* err */ js.Error | Null, /* matches */ js.Array[String], Unit]
  ): IGlob = js.native
  @JSName("glob")
  val glob_Original: Call = js.native
  
  def hasMagic(pattern: String): Boolean = js.native
  def hasMagic(pattern: String, options: IOptions): Boolean = js.native
  
  def promise(pattern: String): js.Promise[js.Array[String]] = js.native
  def promise(pattern: String, options: IOptions): js.Promise[js.Array[String]] = js.native
  
  def sync(pattern: String): js.Array[String] = js.native
  def sync(pattern: String, options: IOptions): js.Array[String] = js.native
}
