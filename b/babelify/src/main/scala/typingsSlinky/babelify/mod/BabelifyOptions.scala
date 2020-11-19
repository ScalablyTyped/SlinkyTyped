package typingsSlinky.babelify.mod

import typingsSlinky.babelCore.mod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BabelifyOptions extends TransformOptions {
  
  /** These are passed to babel.util.canCompile() for each filename
    * default: null
    */
  var extensions: js.UndefOr[String | js.Array[String]] = js.native
  
  /** if true, a 'sourceFileName' property with a value equal to the current file being transformed is included with the options passed to babel.transform()
    * default: false
    */
  var sourceMapsAbsolute: js.UndefOr[Boolean] = js.native
}
object BabelifyOptions {
  
  @scala.inline
  def apply(): BabelifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BabelifyOptions]
  }
  
  @scala.inline
  implicit class BabelifyOptionsOps[Self <: BabelifyOptions] (val x: Self) extends AnyVal {
    
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
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: String | js.Array[String]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    
    @scala.inline
    def setSourceMapsAbsolute(value: Boolean): Self = this.set("sourceMapsAbsolute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceMapsAbsolute: Self = this.set("sourceMapsAbsolute", js.undefined)
  }
}
