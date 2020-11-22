package typingsSlinky.metascraperLogoFavicon.mod

import typingsSlinky.node.httpMod.ClientRequestArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /** Any option provided here will passed to `got#options`. */
  var gotOpts: js.UndefOr[ClientRequestArgs] = js.native
  
  /** Truncate the value extracted to a maximum size (default: `300`). */
  var pickFn: js.UndefOr[PickFunction] = js.native
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
    def setGotOpts(value: ClientRequestArgs): Self = this.set("gotOpts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGotOpts: Self = this.set("gotOpts", js.undefined)
    
    @scala.inline
    def setPickFn(value: (/* sizes */ js.Array[FaviconSize], /* pickDefault */ PickDefaultFunction) => FaviconSize): Self = this.set("pickFn", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePickFn: Self = this.set("pickFn", js.undefined)
  }
}
