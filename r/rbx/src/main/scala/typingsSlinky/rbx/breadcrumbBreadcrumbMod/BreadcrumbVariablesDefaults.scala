package typingsSlinky.rbx.breadcrumbBreadcrumbMod

import typingsSlinky.rbx.rbxStrings.arrow
import typingsSlinky.rbx.rbxStrings.bullet
import typingsSlinky.rbx.rbxStrings.centered
import typingsSlinky.rbx.rbxStrings.dot
import typingsSlinky.rbx.rbxStrings.large
import typingsSlinky.rbx.rbxStrings.medium
import typingsSlinky.rbx.rbxStrings.right
import typingsSlinky.rbx.rbxStrings.small
import typingsSlinky.rbx.rbxStrings.succeeds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BreadcrumbVariablesDefaults extends js.Object {
  
  var alignments: centered | right = js.native
  
  var separators: arrow | bullet | dot | succeeds = js.native
  
  var sizes: small | medium | large = js.native
}
object BreadcrumbVariablesDefaults {
  
  @scala.inline
  def apply(
    alignments: centered | right,
    separators: arrow | bullet | dot | succeeds,
    sizes: small | medium | large
  ): BreadcrumbVariablesDefaults = {
    val __obj = js.Dynamic.literal(alignments = alignments.asInstanceOf[js.Any], separators = separators.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreadcrumbVariablesDefaults]
  }
  
  @scala.inline
  implicit class BreadcrumbVariablesDefaultsOps[Self <: BreadcrumbVariablesDefaults] (val x: Self) extends AnyVal {
    
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
    def setAlignments(value: centered | right): Self = this.set("alignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparators(value: arrow | bullet | dot | succeeds): Self = this.set("separators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizes(value: small | medium | large): Self = this.set("sizes", value.asInstanceOf[js.Any])
  }
}
