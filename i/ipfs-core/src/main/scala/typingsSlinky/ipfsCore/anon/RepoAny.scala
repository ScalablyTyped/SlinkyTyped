package typingsSlinky.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepoAny extends js.Object {
  
  var repo: js.Any = js.native
}
object RepoAny {
  
  @scala.inline
  def apply(repo: js.Any): RepoAny = {
    val __obj = js.Dynamic.literal(repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepoAny]
  }
  
  @scala.inline
  implicit class RepoAnyOps[Self <: RepoAny] (val x: Self) extends AnyVal {
    
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
    def setRepo(value: js.Any): Self = this.set("repo", value.asInstanceOf[js.Any])
  }
}
