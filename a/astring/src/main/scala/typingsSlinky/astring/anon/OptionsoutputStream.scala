package typingsSlinky.astring.anon

import typingsSlinky.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined astring.astring.Options & {  output :node.stream.Stream} */
@js.native
trait OptionsoutputStream extends js.Object {
  
  /** generate comments if true (defaults to false) */
  var comments: js.UndefOr[Boolean] = js.native
  
  /** custom code generator (defaults to astring.baseGenerator) */
  var generator: js.UndefOr[js.Object] = js.native
  
  /** string to use for indentation (defaults to "  ") */
  var indent: js.UndefOr[String] = js.native
  
  /** string to use for line endings (defaults to "\n") */
  var lineEnd: js.UndefOr[String] = js.native
  
  /** output stream to write the rendered code to (defaults to null) */
  var output: Stream = js.native
  
  /** source map generator (defaults to null), see https://github.com/mozilla/source-map#sourcemapgenerator */
  var sourceMap: js.UndefOr[js.Any] = js.native
  
  /** indent level to start from (defaults to 0) */
  var startingIndentLevel: js.UndefOr[Double] = js.native
}
object OptionsoutputStream {
  
  @scala.inline
  def apply(output: Stream): OptionsoutputStream = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsoutputStream]
  }
  
  @scala.inline
  implicit class OptionsoutputStreamOps[Self <: OptionsoutputStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOutput(value: Stream): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments(value: Boolean): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    
    @scala.inline
    def setGenerator(value: js.Object): Self = this.set("generator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenerator: Self = this.set("generator", js.undefined)
    
    @scala.inline
    def setIndent(value: String): Self = this.set("indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
    
    @scala.inline
    def setLineEnd(value: String): Self = this.set("lineEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineEnd: Self = this.set("lineEnd", js.undefined)
    
    @scala.inline
    def setSourceMap(value: js.Any): Self = this.set("sourceMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceMap: Self = this.set("sourceMap", js.undefined)
    
    @scala.inline
    def setStartingIndentLevel(value: Double): Self = this.set("startingIndentLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartingIndentLevel: Self = this.set("startingIndentLevel", js.undefined)
  }
}
