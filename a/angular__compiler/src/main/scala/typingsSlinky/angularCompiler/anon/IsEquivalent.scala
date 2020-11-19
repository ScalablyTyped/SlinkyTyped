package typingsSlinky.angularCompiler.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsEquivalent[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: {isEquivalent (other : T): boolean} */ js.Any */] extends js.Object {
  
  def isEquivalent(other: T): Boolean = js.native
}
object IsEquivalent {
  
  @scala.inline
  def apply[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: {isEquivalent (other : T): boolean} */ js.Any */](isEquivalent: T => Boolean): IsEquivalent[T] = {
    val __obj = js.Dynamic.literal(isEquivalent = js.Any.fromFunction1(isEquivalent))
    __obj.asInstanceOf[IsEquivalent[T]]
  }
  
  @scala.inline
  implicit class IsEquivalentOps[Self <: IsEquivalent[_], T /* <: /* import warning: importer.ImportType#apply Failed type conversion: {isEquivalent (other : T): boolean} */ js.Any */] (val x: Self with IsEquivalent[T]) extends AnyVal {
    
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
    def setIsEquivalent(value: T => Boolean): Self = this.set("isEquivalent", js.Any.fromFunction1(value))
  }
}
