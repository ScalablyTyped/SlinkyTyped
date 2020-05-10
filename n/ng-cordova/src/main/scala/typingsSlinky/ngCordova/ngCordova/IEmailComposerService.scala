package typingsSlinky.ngCordova.ngCordova

import typingsSlinky.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEmailComposerService extends js.Object {
  def addAlias(app: String, schema: String): Unit = js.native
  def isAvailable(): IPromise[Boolean] = js.native
  def open(properties: IEmailComposerOptions): IPromise[_] = js.native
}

object IEmailComposerService {
  @scala.inline
  def apply(
    addAlias: (String, String) => Unit,
    isAvailable: () => IPromise[Boolean],
    open: IEmailComposerOptions => IPromise[_]
  ): IEmailComposerService = {
    val __obj = js.Dynamic.literal(addAlias = js.Any.fromFunction2(addAlias), isAvailable = js.Any.fromFunction0(isAvailable), open = js.Any.fromFunction1(open))
    __obj.asInstanceOf[IEmailComposerService]
  }
  @scala.inline
  implicit class IEmailComposerServiceOps[Self <: IEmailComposerService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddAlias(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAlias")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIsAvailable(value: () => IPromise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAvailable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOpen(value: IEmailComposerOptions => IPromise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

