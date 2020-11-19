package typingsSlinky.markJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augment JQuery */
@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  trait JQuery extends js.Object {
    
    def mark(term: String): Unit = js.native
    def mark(term: String, options: MarkOptions): Unit = js.native
    def mark(term: js.Array[String]): Unit = js.native
    def mark(term: js.Array[String], options: MarkOptions): Unit = js.native
    
    def unmark(): Unit = js.native
    def unmark(options: UnmarkOptions): Unit = js.native
  }
  
  @js.native
  trait JQueryStatic extends js.Object {
    
    def mark(term: String): Unit = js.native
    def mark(term: String, options: MarkOptions): Unit = js.native
    def mark(term: js.Array[String]): Unit = js.native
    def mark(term: js.Array[String], options: MarkOptions): Unit = js.native
    
    def unmark(): Unit = js.native
    def unmark(options: UnmarkOptions): Unit = js.native
  }
}
