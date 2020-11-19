package typingsSlinky.globrex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Path extends js.Object {
  
  /**
    * JavaScript RegExp instance build for testing against paths.
    * The regex have different path separators depending on host OS.
    */
  var regex: js.RegExp = js.native
  
  /**
    * Array of RegExp instances separated by /.
    * This can be usable when working with file paths or urls.
    * ```js
    * [ /^foo$/, /^bar$/, /^([^\/]*)$/, '^baz\\.(md|js|txt)$' ]
    * ```
    */
  var segments: js.Array[js.RegExp] = js.native
  
  /**
    * String representation of the RegExp
    */
  var string: String = js.native
}
object Path {
  
  @scala.inline
  def apply(regex: js.RegExp, segments: js.Array[js.RegExp], string: String): Path = {
    val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
  
  @scala.inline
  implicit class PathOps[Self <: Path] (val x: Self) extends AnyVal {
    
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
    def setRegex(value: js.RegExp): Self = this.set("regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentsVarargs(value: js.RegExp*): Self = this.set("segments", js.Array(value :_*))
    
    @scala.inline
    def setSegments(value: js.Array[js.RegExp]): Self = this.set("segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setString(value: String): Self = this.set("string", value.asInstanceOf[js.Any])
  }
}
