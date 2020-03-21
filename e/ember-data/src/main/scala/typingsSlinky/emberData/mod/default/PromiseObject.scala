package typingsSlinky.emberData.mod.default

import typingsSlinky.emberObject.promiseProxyMixinMod.PromiseProxyMixin
import typingsSlinky.emberObject.proxyMod.ObjectProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember-data", "PromiseObject")
@js.native
class PromiseObject[T] ()
  extends PromiseProxyMixin[T with typingsSlinky.emberObject.proxyMod.default[js.Object]]
     with ObjectProxy[T]

