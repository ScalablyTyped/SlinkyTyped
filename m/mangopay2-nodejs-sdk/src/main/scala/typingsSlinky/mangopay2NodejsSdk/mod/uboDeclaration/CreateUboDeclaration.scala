package typingsSlinky.mangopay2NodejsSdk.mod.uboDeclaration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUboDeclaration extends js.Object {
  var DeclaredUBOs: js.UndefOr[js.Array[String]] = js.native
}

object CreateUboDeclaration {
  @scala.inline
  def apply(): CreateUboDeclaration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateUboDeclaration]
  }
  @scala.inline
  implicit class CreateUboDeclarationOps[Self <: CreateUboDeclaration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeclaredUBOs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeclaredUBOs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeclaredUBOs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeclaredUBOs")(js.undefined)
        ret
    }
  }
  
}

