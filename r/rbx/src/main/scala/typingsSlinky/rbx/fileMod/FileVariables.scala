package typingsSlinky.rbx.fileMod

import typingsSlinky.rbx.rbxStrings.centered
import typingsSlinky.rbx.rbxStrings.large
import typingsSlinky.rbx.rbxStrings.medium
import typingsSlinky.rbx.rbxStrings.right
import typingsSlinky.rbx.rbxStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined rbx.rbx/types.Prefer<rbx.rbx/elements/form/file.FileVariablesOverrides, rbx.rbx/elements/form/file.FileVariablesDefaults> */
@js.native
trait FileVariables extends js.Object {
  
  var alignments: centered | right = js.native
  
  var sizes: small | medium | large = js.native
}
object FileVariables {
  
  @scala.inline
  def apply(alignments: centered | right, sizes: small | medium | large): FileVariables = {
    val __obj = js.Dynamic.literal(alignments = alignments.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileVariables]
  }
  
  @scala.inline
  implicit class FileVariablesOps[Self <: FileVariables] (val x: Self) extends AnyVal {
    
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
    def setSizes(value: small | medium | large): Self = this.set("sizes", value.asInstanceOf[js.Any])
  }
}
