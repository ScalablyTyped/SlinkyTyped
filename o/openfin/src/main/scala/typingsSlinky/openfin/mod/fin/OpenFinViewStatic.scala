package typingsSlinky.openfin.mod.fin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenFinViewStatic extends js.Object {
  /**
    * Creates a new View.
    * @param { View~options } options - View creation options
    * @return {Promise.<View>}
    * @tutorial View.create
    * @experimental
    * @static
    */
  def create(options: ViewCreationOptions): js.Promise[View] = js.native
  /**
    * Asynchronously returns a View object that represents the current view
    * @return {Promise.<View>}
    * @tutorial View.getCurrent
    * @experimental
    * @static
    */
  def getCurrent(): js.Promise[View] = js.native
  /**
    * Synchronously returns a View object that represents the current view
    * @return {View}
    * @tutorial View.getCurrentSync
    * @experimental
    * @static
    */
  def getCurrentSync(): View = js.native
  /**
    * Asynchronously returns a View object that represents an existing view.
    * @param { Identity } identity
    * @return {Promise.<View>}
    * @tutorial View.wrap
    * @experimental
    * @static
    */
  def wrap(identity: Identity): js.Promise[View] = js.native
  /**
    * Synchronously returns a View object that represents an existing view.
    * @param { Identity } identity
    * @return {View}
    * @tutorial View.wrapSync
    * @experimental
    * @static
    */
  def wrapSync(identity: Identity): View = js.native
}

object OpenFinViewStatic {
  @scala.inline
  def apply(
    create: ViewCreationOptions => js.Promise[View],
    getCurrent: () => js.Promise[View],
    getCurrentSync: () => View,
    wrap: Identity => js.Promise[View],
    wrapSync: Identity => View
  ): OpenFinViewStatic = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), getCurrent = js.Any.fromFunction0(getCurrent), getCurrentSync = js.Any.fromFunction0(getCurrentSync), wrap = js.Any.fromFunction1(wrap), wrapSync = js.Any.fromFunction1(wrapSync))
    __obj.asInstanceOf[OpenFinViewStatic]
  }
  @scala.inline
  implicit class OpenFinViewStaticOps[Self <: OpenFinViewStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: ViewCreationOptions => js.Promise[View]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetCurrent(value: () => js.Promise[View]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCurrentSync(value: () => View): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentSync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWrap(value: Identity => js.Promise[View]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWrapSync(value: Identity => View): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapSync")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

