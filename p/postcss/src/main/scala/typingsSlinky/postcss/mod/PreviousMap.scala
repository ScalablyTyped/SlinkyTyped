package typingsSlinky.postcss.mod

import typingsSlinky.sourceMap.mod.RawSourceMap
import typingsSlinky.sourceMap.mod.SourceMapConsumer
import typingsSlinky.sourceMap.mod.SourceMapGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postcss", "PreviousMap")
@js.native
class PreviousMap protected () extends StObject {
  def this(css: js.Any, opts: js.Any) = this()
  
  var annotation: String = js.native
  
  def consumer(): SourceMapConsumer = js.native
  
  var consumerCache: js.Any = js.native
  
  def decodeInline(text: String): String = js.native
  
  var file: String = js.native
  
  def getAnnotationURL(sourceMapString: String): String = js.native
  
  var `inline`: js.Any = js.native
  
  def isMap(map: js.Any): Boolean = js.native
  
  def loadAnnotation(css: String): Unit = js.native
  
  def loadMap(file: js.Any, prev: String): String = js.native
  def loadMap(file: js.Any, prev: js.Function): String = js.native
  def loadMap(file: js.Any, prev: RawSourceMap): String = js.native
  def loadMap(file: js.Any, prev: SourceMapConsumer): String = js.native
  def loadMap(file: js.Any, prev: SourceMapGenerator): String = js.native
  
  var root: String = js.native
  
  def startWith(string: String, start: String): Boolean = js.native
  
  var text: String = js.native
  
  def withContent(): Boolean = js.native
}
