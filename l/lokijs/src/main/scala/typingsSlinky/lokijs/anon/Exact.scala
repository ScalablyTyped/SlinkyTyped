package typingsSlinky.lokijs.anon

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Exact[E /* <: js.Object */] extends js.Object {
  var exact: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof E ]: lokijs.ExactIndex<E>}
    */ typingsSlinky.lokijs.lokijsStrings.Exact with TopLevel[js.Any] = js.native
  var unique: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof E ]: lokijs.UniqueIndex<E>}
    */ typingsSlinky.lokijs.lokijsStrings.Exact with TopLevel[js.Any] = js.native
}

object Exact {
  @scala.inline
  def apply[E](
    exact: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof E ]: lokijs.ExactIndex<E>}
    */ typingsSlinky.lokijs.lokijsStrings.Exact with TopLevel[js.Any],
    unique: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof E ]: lokijs.UniqueIndex<E>}
    */ typingsSlinky.lokijs.lokijsStrings.Exact with TopLevel[js.Any]
  ): Exact[E] = {
    val __obj = js.Dynamic.literal(exact = exact.asInstanceOf[js.Any], unique = unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exact[E]]
  }
  @scala.inline
  implicit class ExactOps[Self[e] <: Exact[e], E] (val x: Self[E]) extends AnyVal {
    @scala.inline
    def duplicate: Self[E] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[E]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[E] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[E] with Other]
    @scala.inline
    def withExact(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof E ]: lokijs.ExactIndex<E>}
      */ typingsSlinky.lokijs.lokijsStrings.Exact with TopLevel[js.Any]
    ): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnique(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof E ]: lokijs.UniqueIndex<E>}
      */ typingsSlinky.lokijs.lokijsStrings.Exact with TopLevel[js.Any]
    ): Self[E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unique")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

