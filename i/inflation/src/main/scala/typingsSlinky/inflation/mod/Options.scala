package typingsSlinky.inflation.mod

import typingsSlinky.inflation.inflationStrings.deflate
import typingsSlinky.inflation.inflationStrings.gzip
import typingsSlinky.inflation.inflationStrings.identity
import typingsSlinky.node.zlibMod.ZlibOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends ZlibOptions {
  
  /**
    * The encoding of the stream. If not given, will look in `stream.headers['content-encoding']`.
    */
  var gzip: js.UndefOr[deflate | typingsSlinky.inflation.inflationStrings.gzip | identity] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setGzip(value: deflate | gzip | identity): Self = this.set("gzip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGzip: Self = this.set("gzip", js.undefined)
  }
}
