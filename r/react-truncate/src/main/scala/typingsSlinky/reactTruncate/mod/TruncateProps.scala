package typingsSlinky.reactTruncate.mod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.reactTruncate.reactTruncateBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TruncateProps
  extends AllHTMLAttributes[Truncate]
     with ClassAttributes[Truncate] {
  
  var ellipsis: js.UndefOr[ReactElement] = js.native
  
  var lines: js.UndefOr[Double | `false`] = js.native
  
  var onTruncate: js.UndefOr[js.Function1[/* isTruncated */ Boolean, Unit]] = js.native
  
  var trimWhitespace: js.UndefOr[Boolean] = js.native
}
object TruncateProps {
  
  @scala.inline
  def apply(): TruncateProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TruncateProps]
  }
  
  @scala.inline
  implicit class TruncatePropsOps[Self <: TruncateProps] (val x: Self) extends AnyVal {
    
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
    def setEllipsisReactElement(value: ReactElement): Self = this.set("ellipsis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipsis(value: ReactElement): Self = this.set("ellipsis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEllipsis: Self = this.set("ellipsis", js.undefined)
    
    @scala.inline
    def setLines(value: Double | `false`): Self = this.set("lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLines: Self = this.set("lines", js.undefined)
    
    @scala.inline
    def setOnTruncate(value: /* isTruncated */ Boolean => Unit): Self = this.set("onTruncate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTruncate: Self = this.set("onTruncate", js.undefined)
    
    @scala.inline
    def setTrimWhitespace(value: Boolean): Self = this.set("trimWhitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrimWhitespace: Self = this.set("trimWhitespace", js.undefined)
  }
}
