package typingsSlinky.fluentBundle.mod

import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scope extends js.Object {
  def cloneForTermReference(args: js.Object): Scope = js.native
  def memoizeIntlObject[OptsType, ObjectType](
    ctor: Instantiable2[/* locales */ js.Array[String], /* opts */ OptsType, ObjectType],
    opts: OptsType
  ): ObjectType = js.native
  def reportError(error: String): Unit = js.native
}

object Scope {
  @scala.inline
  def apply(
    cloneForTermReference: js.Object => Scope,
    memoizeIntlObject: (Instantiable2[/* locales */ js.Array[String], js.Any, js.Any], js.Any) => js.Any,
    reportError: String => Unit
  ): Scope = {
    val __obj = js.Dynamic.literal(cloneForTermReference = js.Any.fromFunction1(cloneForTermReference), memoizeIntlObject = js.Any.fromFunction2(memoizeIntlObject), reportError = js.Any.fromFunction1(reportError))
    __obj.asInstanceOf[Scope]
  }
  @scala.inline
  implicit class ScopeOps[Self <: Scope] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloneForTermReference(value: js.Object => Scope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloneForTermReference")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMemoizeIntlObject(value: (Instantiable2[/* locales */ js.Array[String], js.Any, js.Any], js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoizeIntlObject")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withReportError(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportError")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

