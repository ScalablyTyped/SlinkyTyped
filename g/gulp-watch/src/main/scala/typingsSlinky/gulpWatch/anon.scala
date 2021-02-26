package typingsSlinky.gulpWatch

import org.scalajs.dom.experimental.ReadableStream
import org.scalajs.dom.raw.Blob
import typingsSlinky.gulpWatch.gulpWatchStrings.add
import typingsSlinky.gulpWatch.gulpWatchStrings.change
import typingsSlinky.gulpWatch.gulpWatchStrings.unlink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.File & {  event :'add' | 'change' | 'unlink'} */
  @js.native
  trait Fileeventaddchangeunlink extends StObject {
    
    def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    var event: add | change | unlink = js.native
    
    val lastModified: Double = js.native
    
    val name: String = js.native
    
    val size: Double = js.native
    
    def slice(): Blob = js.native
    def slice(start: js.UndefOr[scala.Nothing], end: js.UndefOr[scala.Nothing], contentType: String): Blob = js.native
    def slice(start: js.UndefOr[scala.Nothing], end: Double): Blob = js.native
    def slice(start: js.UndefOr[scala.Nothing], end: Double, contentType: String): Blob = js.native
    def slice(start: Double): Blob = js.native
    def slice(start: Double, end: js.UndefOr[scala.Nothing], contentType: String): Blob = js.native
    def slice(start: Double, end: Double): Blob = js.native
    def slice(start: Double, end: Double, contentType: String): Blob = js.native
    
    def stream(): ReadableStream[_] = js.native
    
    def text(): js.Promise[String] = js.native
    
    val `type`: String = js.native
  }
}
