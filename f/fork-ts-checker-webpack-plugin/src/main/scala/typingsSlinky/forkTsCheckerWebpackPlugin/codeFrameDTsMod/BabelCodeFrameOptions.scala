package typingsSlinky.forkTsCheckerWebpackPlugin.codeFrameDTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BabelCodeFrameOptions extends js.Object {
  
  /**
    * Forcibly syntax highlight the code as JavaScript (for non-terminals);
    * overrides highlightCode.
    * default: false
    */
  var forceColor: js.UndefOr[Boolean] = js.native
  
  /** Syntax highlight the code as JavaScript for terminals. default: false */
  var highlightCode: js.UndefOr[Boolean] = js.native
  
  /**  The number of lines to show above the error. default: 2 */
  var linesAbove: js.UndefOr[Double] = js.native
  
  /**  The number of lines to show below the error. default: 3 */
  var linesBelow: js.UndefOr[Double] = js.native
  
  /**
    * Pass in a string to be displayed inline (if possible) next to the
    * highlighted location in the code. If it can't be positioned inline,
    * it will be placed above the code frame.
    * default: nothing
    */
  var message: js.UndefOr[String] = js.native
}
object BabelCodeFrameOptions {
  
  @scala.inline
  def apply(): BabelCodeFrameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BabelCodeFrameOptions]
  }
  
  @scala.inline
  implicit class BabelCodeFrameOptionsOps[Self <: BabelCodeFrameOptions] (val x: Self) extends AnyVal {
    
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
    def setForceColor(value: Boolean): Self = this.set("forceColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceColor: Self = this.set("forceColor", js.undefined)
    
    @scala.inline
    def setHighlightCode(value: Boolean): Self = this.set("highlightCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightCode: Self = this.set("highlightCode", js.undefined)
    
    @scala.inline
    def setLinesAbove(value: Double): Self = this.set("linesAbove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinesAbove: Self = this.set("linesAbove", js.undefined)
    
    @scala.inline
    def setLinesBelow(value: Double): Self = this.set("linesBelow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinesBelow: Self = this.set("linesBelow", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
}
