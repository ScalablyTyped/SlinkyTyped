package typingsSlinky.rax.anon

import typingsSlinky.rax.mod.RaxNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  children :rax.rax.RaxNode | undefined}> */
@js.native
trait ReadonlychildrenRaxNodeun extends js.Object {
  
  val children: js.UndefOr[RaxNode] = js.native
}
object ReadonlychildrenRaxNodeun {
  
  @scala.inline
  def apply(): ReadonlychildrenRaxNodeun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlychildrenRaxNodeun]
  }
  
  @scala.inline
  implicit class ReadonlychildrenRaxNodeunOps[Self <: ReadonlychildrenRaxNodeun] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: RaxNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setChildrenNull: Self = this.set("children", null)
  }
}
