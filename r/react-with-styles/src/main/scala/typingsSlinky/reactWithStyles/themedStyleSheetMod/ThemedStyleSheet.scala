package typingsSlinky.reactWithStyles.themedStyleSheetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemedStyleSheet extends js.Object {
  def create(makeFromTheme: js.Any): js.Any = js.native
  def createLTR(makeFromTheme: js.Any): js.Any = js.native
  def createRTL(makeFromTheme: js.Any): js.Any = js.native
  def flush(): Unit = js.native
  def get(): js.Any = js.native
  def registerInterface(registerInterface: js.Any): Unit = js.native
  def registerTheme(theme: js.Any): Unit = js.native
  def resolve(): js.Any = js.native
  def resolveLTR(): js.Any = js.native
  def resolveRTL(): js.Any = js.native
}

object ThemedStyleSheet {
  @scala.inline
  def apply(
    create: js.Any => js.Any,
    createLTR: js.Any => js.Any,
    createRTL: js.Any => js.Any,
    flush: () => Unit,
    get: () => js.Any,
    registerInterface: js.Any => Unit,
    registerTheme: js.Any => Unit,
    resolve: () => js.Any,
    resolveLTR: () => js.Any,
    resolveRTL: () => js.Any
  ): ThemedStyleSheet = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), createLTR = js.Any.fromFunction1(createLTR), createRTL = js.Any.fromFunction1(createRTL), flush = js.Any.fromFunction0(flush), get = js.Any.fromFunction0(get), registerInterface = js.Any.fromFunction1(registerInterface), registerTheme = js.Any.fromFunction1(registerTheme), resolve = js.Any.fromFunction0(resolve), resolveLTR = js.Any.fromFunction0(resolveLTR), resolveRTL = js.Any.fromFunction0(resolveRTL))
    __obj.asInstanceOf[ThemedStyleSheet]
  }
  @scala.inline
  implicit class ThemedStyleSheetOps[Self <: ThemedStyleSheet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateLTR(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createLTR")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateRTL(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createRTL")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFlush(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flush")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRegisterInterface(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerInterface")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterTheme(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerTheme")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResolve(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResolveLTR(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveLTR")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResolveRTL(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveRTL")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

